package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
public enum EndDirective {
    CONTINUE(0),
    FLUSH(1),
    END(2);

    private final int value;

    EndDirective(int i10) {
        this.value = i10;
    }

    public int value() {
        return this.value;
    }
}
