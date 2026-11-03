package fk;

import android.content.Context;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17296a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17299e;

    public a(String str, Context context, String str2, int i10, int i11) {
        this.b = context;
        this.f17296a = str;
        this.f17297c = str2;
        this.f17298d = i10;
        this.f17299e = i11;
    }

    public String a() {
        return this.f17297c;
    }

    public int b() {
        return this.f17299e;
    }

    public int c() {
        return this.f17298d;
    }
}
