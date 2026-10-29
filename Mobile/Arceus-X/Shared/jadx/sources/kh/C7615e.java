package kh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;

/* JADX INFO: renamed from: kh.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lkh/e;", "La5/b;", "<init>", "()V", "Lf5/b;", "connection", "", "a", "(Lf5/b;)V", "database_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7615e extends AbstractC0072b {
    public C7615e() {
        super(2, 3);
    }

    @Override // p006a5.AbstractC0072b
    /* JADX INFO: renamed from: a */
    public void mo175a(@NotNull InterfaceC5359b connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        C5358a.m24693a(connection, "ALTER TABLE `analytic_event` ADD COLUMN `retry_attempt_count` INTEGER DEFAULT NULL");
    }
}
