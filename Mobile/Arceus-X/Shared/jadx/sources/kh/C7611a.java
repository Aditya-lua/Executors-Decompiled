package kh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.InterfaceC0071a;
import p119f5.InterfaceC5359b;
import p145g5.InterfaceC6008c;

/* JADX INFO: renamed from: kh.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lkh/a;", "La5/a;", "<init>", "()V", "Lg5/c;", "db", "", "a", "(Lg5/c;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7611a implements InterfaceC0071a {
    @Override // p006a5.InterfaceC0071a
    /* JADX INFO: renamed from: a */
    public void mo173a(@NotNull InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.mo6899R("DELETE FROM analytic_event");
    }

    @Override // p006a5.InterfaceC0071a
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo174b(@NotNull InterfaceC5359b interfaceC5359b) {
        super.mo174b(interfaceC5359b);
    }
}
