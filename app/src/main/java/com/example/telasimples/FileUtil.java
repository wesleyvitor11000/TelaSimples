package com.example.telasimples;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

    private FileUtil(){

    }

    private static final String TAG = "FileUtil";

    @NonNull
    public static String LerArquivoTexto(@NonNull AssetManager assetManager, @NonNull String nomeArquivo){

        String conteudo = "";
        BufferedReader leitor;

        try{
            InputStream is = assetManager.open(nomeArquivo);
            InputStreamReader isr = new InputStreamReader(is);
            leitor = new BufferedReader(isr);

            for(String linha = ""; linha != null; linha = leitor.readLine()) {
                conteudo += linha + "\n";
            }

            leitor.close();

        } catch (IOException e) {
            Log.e(TAG, "Erro ao ler arquivo.", e);
        }

        if(conteudo.length() > 0){
            return conteudo.substring(0, conteudo.length() - 1);
        }

        return null;
    }

    @Nullable
    public static Bitmap acessarImagem(@NonNull AssetManager assetManager, @NonNull String nomeImagem){

        Bitmap bitmap = null;

        try{
            InputStream is = assetManager.open(nomeImagem);
            bitmap = BitmapFactory.decodeStream(is);
        }catch (IOException e){
            Log.e(TAG, "Erro ao acessar imagem", e);
        }

        return bitmap;
    }

    /*@NonNull
    public static File criarArquivoLocalmente(@NonNull String nomeArquivo){
        String raiz = Environment.getExternalStorageDirectory() + File.separator;
        String diretorio =

    }*/


}
