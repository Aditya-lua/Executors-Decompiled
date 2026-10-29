package p237k4;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\bJ,\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lk4/b;", "Lk4/a;", "", "Lk4/a$c;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Lk4/a;)V", "T", "key", "t", "", "c", "(Lk4/a$c;Ljava/lang/Object;)V", "a", "(Lk4/a$c;)Ljava/lang/Object;", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C7445b extends CreationExtras {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C7445b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p237k4.CreationExtras
    @Nullable
    /* JADX INFO: renamed from: a */
    public <T> T mo30958a(@NotNull CreationExtras.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) m30959b().get(key);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: k4.a$c<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final <T> void m30960c(@NotNull CreationExtras.c<T> key, T t8) {
        Intrinsics.checkNotNullParameter(key, "key");
        m30959b().put(key, t8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7445b(@NotNull Map<CreationExtras.c<?>, ? extends Object> initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        m30959b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7445b(@NotNull CreationExtras initialExtras) {
        this((Map<CreationExtras.c<?>, ? extends Object>) initialExtras.m30959b());
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap k4.a:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap k4.a:0x0004: SGET  A[WRAPPED] (LINE:5) k4.a.b.c k4.a$b) : (r1v0 k4.a))
     A[MD:(k4.a):void (m)] (LINE:5) call: k4.b.<init>(k4.a):void type: THIS */
    public /* synthetic */ C7445b(CreationExtras creationExtras, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CreationExtras.b.f28722c : creationExtras);
    }
}
