package kh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p006a5.InterfaceC0071a;
import p119f5.InterfaceC5359b;

/* JADX INFO: renamed from: kh.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lkh/g;", "La5/b;", "<init>", "()V", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "La5/a;", "c", "La5/a;", "callback", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7617g extends AbstractC0072b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0071a callback;

    public C7617g() {
        super(4, 5);
        this.callback = new C7612b();
    }

    @Override // p006a5.AbstractC0072b
    /* JADX INFO: renamed from: a */
    public void mo175a(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.callback.mo174b(connection);
    }
}
