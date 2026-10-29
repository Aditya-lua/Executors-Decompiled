package nu;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import p395qu.C10719e0;
import p617ou.C10058h;

/* JADX INFO: renamed from: nu.i0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\r\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0011\u001a\u00020\u0010*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"T", "", "replay", "extraBufferCapacity", "Lmu/a;", "onBufferOverflow", "Lnu/b0;", "a", "(IILmu/a;)Lnu/b0;", "", "", "", "index", "f", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "", "g", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lnu/g0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lnu/h;", "e", "(Lnu/g0;Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "Lqu/e0;", "Lqu/e0;", "NO_VALUE", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9578i0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10719e0 f34601a = new C10719e0("NO_VALUE");

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC9564b0<T> m37757a(int i10, int i11, @NotNull EnumC8666a enumC8666a) {
        if (i10 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i11).toString());
        }
        if (i10 > 0 || i11 > 0 || enumC8666a == EnumC8666a.SUSPEND) {
            int i12 = i11 + i10;
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            return new C9576h0(i10, i12, enumC8666a);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC8666a).toString());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC9564b0 m37758b(int i10, int i11, EnumC8666a enumC8666a, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            enumC8666a = EnumC8666a.SUSPEND;
        }
        return m37757a(i10, i11, enumC8666a);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC9575h<T> m37761e(@NotNull InterfaceC9574g0<? extends T> interfaceC9574g0, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        return ((i10 == 0 || i10 == -3) && enumC8666a == EnumC8666a.SUSPEND) ? interfaceC9574g0 : new C10058h(interfaceC9574g0, coroutineContext, i10, enumC8666a);
    }

    /* JADX INFO: renamed from: f */
    public static final Object m37762f(Object[] objArr, long j10) {
        return objArr[((int) j10) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: g */
    public static final void m37763g(Object[] objArr, long j10, Object obj) {
        objArr[((int) j10) & (objArr.length - 1)] = obj;
    }
}
