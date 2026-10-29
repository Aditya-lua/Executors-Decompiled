package mu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p315nt.InterfaceC9557b;
import p395qu.C10747s0;
import p395qu.C10752x;

/* JADX INFO: renamed from: mu.s */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lmu/s;", "E", "Lmu/e;", "", "capacity", "Lmu/a;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILmu/a;Lkotlin/jvm/functions/Function1;)V", "element", "i", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lmu/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "isSendOp", "z1", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "y1", "m", "I", "n", "Lmu/a;", "C0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C8684s<E> extends C8670e<E> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final EnumC8666a onBufferOverflow;

    public C8684s(int i10, @NotNull EnumC8666a enumC8666a, @Nullable Function1<? super E, Unit> function1) {
        super(i10, function1);
        this.capacity = i10;
        this.onBufferOverflow = enumC8666a;
        if (enumC8666a == EnumC8666a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C7731d0.m32002b(C8670e.class).mo28427g() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    /* JADX INFO: renamed from: x1 */
    public static /* synthetic */ <E> Object m34961x1(C8684s<E> c8684s, E e10, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        C10747s0 c10747s0M40957c;
        Object objM34963z1 = c8684s.m34963z1(e10, true);
        if (!(objM34963z1 instanceof C8676k.Closed)) {
            return Unit.f29331a;
        }
        C8676k.m34932e(objM34963z1);
        Function1<E, Unit> function1 = c8684s.onUndeliveredElement;
        if (function1 == null || (c10747s0M40957c = C10752x.m40957c(function1, e10, null, 2, null)) == null) {
            throw c8684s.m34858p0();
        }
        C7328a.m30429a(c10747s0M40957c, c8684s.m34858p0());
        throw c10747s0M40957c;
    }

    @Override // mu.C8670e
    /* JADX INFO: renamed from: C0 */
    public boolean mo34797C0() {
        return this.onBufferOverflow == EnumC8666a.DROP_OLDEST;
    }

    @Override // mu.C8670e, mu.InterfaceC8690y
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo34848i(E e10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m34961x1(this, e10, interfaceC9557b);
    }

    @Override // mu.C8670e, mu.InterfaceC8690y
    @NotNull
    /* JADX INFO: renamed from: w */
    public Object mo34870w(E element) {
        return m34963z1(element, false);
    }

    /* JADX INFO: renamed from: y1 */
    public final Object m34962y1(E element, boolean isSendOp) {
        Function1<E, Unit> function1;
        C10747s0 c10747s0M40957c;
        Object objMo34870w = super.mo34870w(element);
        if (C8676k.m34936i(objMo34870w) || C8676k.m34935h(objMo34870w)) {
            return objMo34870w;
        }
        if (!isSendOp || (function1 = this.onUndeliveredElement) == null || (c10747s0M40957c = C10752x.m40957c(function1, element, null, 2, null)) == null) {
            return C8676k.INSTANCE.m34941c(Unit.f29331a);
        }
        throw c10747s0M40957c;
    }

    /* JADX INFO: renamed from: z1 */
    public final Object m34963z1(E element, boolean isSendOp) {
        return this.onBufferOverflow == EnumC8666a.DROP_LATEST ? m34962y1(element, isSendOp) : m34855n1(element);
    }
}
