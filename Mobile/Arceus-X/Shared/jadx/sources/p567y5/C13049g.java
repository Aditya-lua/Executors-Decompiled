package p567y5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p006a5.AbstractC0072b;
import p145g5.InterfaceC6008c;

/* JADX INFO: renamed from: y5.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Ly5/g;", "La5/b;", "<init>", "()V", "Lg5/c;", "db", "", "b", "(Lg5/c;)V", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13049g extends AbstractC0072b {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C13049g f46209c = new C13049g();

    public C13049g() {
        super(12, 13);
    }

    @Override // p006a5.AbstractC0072b
    /* JADX INFO: renamed from: b */
    public void mo176b(@NotNull InterfaceC6008c db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        db2.mo6899R("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db2.mo6899R("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
