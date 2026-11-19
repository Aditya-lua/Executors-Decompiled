package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class z9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6971a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final va f6973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6974e;

    public z9(va vaVar) {
        vaVar.getClass();
        this.f6973d = vaVar;
    }

    public static /* synthetic */ String a(int i10, int i11, byte b, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + b + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
        sb2.append(i10);
        return sb2.toString();
    }
}
