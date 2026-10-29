package com.google.androidgamesdk.gametextinput;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class State {
    public int composingRegionEnd;
    public int composingRegionStart;
    public int selectionEnd;
    public int selectionStart;
    public String text;

    public State(String str, int i10, int i11, int i12, int i13) {
        this.text = str;
        this.selectionStart = i10;
        this.selectionEnd = i11;
        this.composingRegionStart = i12;
        this.composingRegionEnd = i13;
    }
}
