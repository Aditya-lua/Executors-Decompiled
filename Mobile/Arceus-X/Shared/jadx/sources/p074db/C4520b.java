package p074db;

import java.util.Arrays;

/* JADX INFO: renamed from: db.b */
/* JADX INFO: loaded from: classes.dex */
public class C4520b extends C4521c {

    /* JADX INFO: renamed from: a */
    public Object[] f18568a = new Object[4];

    /* JADX INFO: renamed from: b */
    public int f18569b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f18570c;

    public C4520b(int i10) {
    }

    /* JADX INFO: renamed from: a */
    public final C4520b m22483a(Object obj) {
        int i10;
        obj.getClass();
        int length = this.f18568a.length;
        int i11 = this.f18569b;
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
        if (i10 > length || this.f18570c) {
            this.f18568a = Arrays.copyOf(this.f18568a, i10);
            this.f18570c = false;
        }
        Object[] objArr = this.f18568a;
        int i13 = this.f18569b;
        this.f18569b = i13 + 1;
        objArr[i13] = obj;
        return this;
    }
}
