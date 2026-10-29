package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.k7 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9158k7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33140b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33141c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f33142d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BinderC9127i8 f33143e;

    public RunnableC9158k7(BinderC9127i8 binderC9127i8, String str, String str2, String str3, long j10) {
        this.f33139a = str;
        this.f33140b = str2;
        this.f33141c = str3;
        this.f33142d = j10;
        Objects.requireNonNull(binderC9127i8);
        this.f33143e = binderC9127i8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f33139a;
        if (str == null) {
            BinderC9127i8 binderC9127i8 = this.f33143e;
            binderC9127i8.m36366z2().m36569t0(this.f33140b, null);
        } else {
            C9014bb c9014bb = new C9014bb(this.f33141c, str, this.f33142d);
            BinderC9127i8 binderC9127i9 = this.f33143e;
            binderC9127i9.m36366z2().m36569t0(this.f33140b, c9014bb);
        }
    }
}
