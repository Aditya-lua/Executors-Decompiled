package hk;

import android.content.Context;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: hk.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6412a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public String f24344a;

    /* JADX INFO: renamed from: b */
    public Context f24345b;

    /* JADX INFO: renamed from: c */
    public String f24346c;

    /* JADX INFO: renamed from: d */
    public int f24347d;

    /* JADX INFO: renamed from: e */
    public int f24348e;

    public AbstractC6412a(String str, Context context, String str2, int i10, int i11) {
        this.f24345b = context;
        this.f24344a = str;
        this.f24346c = str2;
        this.f24347d = i10;
        this.f24348e = i11;
    }

    /* JADX INFO: renamed from: a */
    public String m27999a() {
        return this.f24346c;
    }

    /* JADX INFO: renamed from: b */
    public int m28000b() {
        return this.f24348e;
    }

    /* JADX INFO: renamed from: c */
    public int m28001c() {
        return this.f24347d;
    }
}
