package com.example.agung.al_imancommunitylivechat;

import android.app.Application;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

/**
 * Created by agung on 16/01/17.
 */

public class ChatApplication extends Application {

    private Socket mSocket;
    {
        try {
            // set url server untuk socket.io (harus menggunakan NodeJS)
            mSocket = IO.socket(Server.CHAT_SERVER_URL);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public Socket getSocket() {
        return mSocket;
    }
}
