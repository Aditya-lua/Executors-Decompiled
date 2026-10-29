package db;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f14536a = new Object[4];
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14537c;

    public b(int i10) {
    }

    public final b a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f14536a.length;
        int i11 = this.b;
        int i12 = i11 + 1;
        if (i12 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i12 <= length) {
            i10 = length;
        } else {
            i10 = (length >> 1) + length + 1;
            if (i10 < i12) {
                int iHighestOneBit = Integer.highestOneBit(i11);
                i10 = iHighestOneBit + iHighestOneBit;
            }
            if (i10 < 0) {
                i10 = Integer.MAX_VALUE;
            }
        }
        if (i10 > length || this.f14537c) {
            this.f14536a = Arrays.copyOf(this.f14536a, i10);
            this.f14537c = false;
        }
        Object[] objArr = this.f14536a;
        int i13 = this.b;
        this.b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
