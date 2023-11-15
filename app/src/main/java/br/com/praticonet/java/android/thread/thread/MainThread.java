package br.com.praticonet.java.android.thread.thread;

import android.os.AsyncTask;

public class MainThread extends AsyncTask<String, String, Integer> {
    @Override
    protected Integer doInBackground(String... strings) {
        return 0;
    }

    public MainThread() {
        super();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onCancelled(Integer integer) {
        super.onCancelled(integer);
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
    }
}
