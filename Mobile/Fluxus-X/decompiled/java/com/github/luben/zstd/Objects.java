package com.github.luben.zstd;

/* JADX INFO: loaded from: classes.dex */
final class Objects {
    public static void checkFromIndexSize(int i10, int i11, int i12) {
        if ((i12 | i10 | i11) < 0 || i11 > i12 - i10) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
    }
}
