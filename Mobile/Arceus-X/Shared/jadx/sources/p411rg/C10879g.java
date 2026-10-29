package p411rg;

import com.google.mlkit.common.MlKitException;
import p381qg.C10580c;
import p381qg.EnumC10578a;
import p381qg.EnumC10579b;

/* JADX INFO: renamed from: rg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C10879g {

    /* JADX INFO: renamed from: a */
    public EnumC10579b f38637a;

    /* JADX INFO: renamed from: b */
    public EnumC10578a f38638b;

    /* JADX INFO: renamed from: c */
    public C10580c f38639c;

    /* JADX INFO: renamed from: d */
    public int f38640d = -1;

    /* JADX INFO: renamed from: e */
    public C10874b f38641e;

    /* JADX INFO: renamed from: b */
    public static boolean m41418b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    /* JADX INFO: renamed from: a */
    public C10874b m41419a() {
        return this.f38641e;
    }

    /* JADX INFO: renamed from: c */
    public void m41420c(EnumC10578a enumC10578a) {
        this.f38638b = enumC10578a;
    }

    /* JADX INFO: renamed from: d */
    public void m41421d(int i10) {
        this.f38640d = i10;
    }

    /* JADX INFO: renamed from: e */
    public void m41422e(C10874b c10874b) {
        this.f38641e = c10874b;
    }

    /* JADX INFO: renamed from: f */
    public void m41423f(EnumC10579b enumC10579b) {
        this.f38637a = enumC10579b;
    }

    /* JADX INFO: renamed from: g */
    public void m41424g(C10580c c10580c) {
        this.f38639c = c10580c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.CODE_SCANNER_UNAVAILABLE);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f38637a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f38638b);
        sb2.append("\n version: ");
        sb2.append(this.f38639c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f38640d);
        if (this.f38641e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f38641e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
