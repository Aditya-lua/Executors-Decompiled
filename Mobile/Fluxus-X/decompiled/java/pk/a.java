package pk;

import android.content.Context;
import android.text.style.ClickableSpan;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29182a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29185e;

    public a(String str, Context context, String str2, int i10, int i11) {
        this.b = context;
        this.f29182a = str;
        this.f29183c = str2;
        this.f29184d = i10;
        this.f29185e = i11;
    }

    public String a() {
        return this.f29183c;
    }

    public int b() {
        return this.f29185e;
    }

    public int c() {
        return this.f29184d;
    }
}
