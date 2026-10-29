package hk;

import android.content.Context;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19322a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19325e;

    public a(String str, Context context, String str2, int i10, int i11) {
        this.b = context;
        this.f19322a = str;
        this.f19323c = str2;
        this.f19324d = i10;
        this.f19325e = i11;
    }

    public String a() {
        return this.f19323c;
    }

    public int b() {
        return this.f19325e;
    }

    public int c() {
        return this.f19324d;
    }
}
