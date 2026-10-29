package p212j8;

import android.content.Context;
import ht.InterfaceC6564a;
import p071d8.C4472d;
import p071d8.InterfaceC4470b;

/* JADX INFO: renamed from: j8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7052h implements InterfaceC4470b<String> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Context> f27623a;

    public C7052h(InterfaceC6564a<Context> interfaceC6564a) {
        this.f27623a = interfaceC6564a;
    }

    /* JADX INFO: renamed from: a */
    public static C7052h m29770a(InterfaceC6564a<Context> interfaceC6564a) {
        return new C7052h(interfaceC6564a);
    }

    /* JADX INFO: renamed from: c */
    public static String m29771c(Context context) {
        return (String) C4472d.m22419c(AbstractC7048f.m29763b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return m29771c(this.f27623a.get());
    }
}
