package n6;

import jt.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001b\u0010\u0006\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0002¨\u0006\u0007"}, d2 = {"Ln6/a;", "d", "()Ln6/a;", "a", "Ljt/h;", "b", "instance", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final jt.h f25113a = i.b(new Function0() { // from class: n6.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.c();
        }
    });

    public static final a b() {
        return (a) f25113a.getValue();
    }

    public static final a c() {
        return new a.C0436a().b(l.SYSTEM_TEMPORARY_DIRECTORY.n("coil3_disk_cache")).a();
    }

    @Nullable
    public static final a d() {
        return b();
    }
}
