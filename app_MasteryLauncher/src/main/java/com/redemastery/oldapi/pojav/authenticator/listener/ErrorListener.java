package com.redemastery.oldapi.pojav.authenticator.listener;

/** Called when there is a complete failure, guaranteed to be on the UI Thread */
public interface ErrorListener {
    void onLoginError(Throwable errorMessage);
}

