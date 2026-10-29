package kh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkh/a;", "La5/a;", "<init>", "()V", "Lg5/c;", "db", "", "a", "(Lg5/c;)V", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a5.a {
    @Override // a5.a
    public void a(@NotNull g5.c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.R("DELETE FROM analytic_event");
    }

    @Override // a5.a
    public /* bridge */ void b(@NotNull f5.b bVar) {
        super.b(bVar);
    }
}
