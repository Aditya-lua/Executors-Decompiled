package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "size", "step", "", "a", "(II)V", "T", "", "iterator", "", "partialWindows", "reuseBuffer", "", "b", "(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Liu/h;", "", "", "<anonymous>", "(Liu/h;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend", v = 2)
    public static final class a<T> extends pt.k implements Function2<iu.h<? super List<? extends T>>, nt.b<? super Unit>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;
        public final /* synthetic */ Iterator<T> E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f22513u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f22514v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f22515w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22516x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22517y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f22518z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, nt.b<? super a> bVar) {
            super(2, bVar);
            this.C = i10;
            this.D = i11;
            this.E = it;
            this.F = z10;
            this.G = z11;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.C, this.D, this.E, this.F, this.G, bVar);
            aVar.B = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0085  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:66:0x015a  */
        /* JADX WARN: Code duplicated, block: B:68:0x015e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0160  */
        /* JADX WARN: Code duplicated, block: B:74:0x0180  */
        /* JADX WARN: Code duplicated, block: B:76:0x0186  */
        /* JADX WARN: Code duplicated, block: B:88:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x008e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x008b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:93:0x007f A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b1 -> B:17:0x005f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0143 -> B:60:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0177 -> B:73:0x017a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x007f
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.s0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(iu.h<? super List<? extends T>> hVar, nt.b<? super Unit> bVar) {
            return ((a) create(hVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public static final void a(int i10, int i11) {
        String str;
        if (i10 <= 0 || i11 <= 0) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> iterator, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        return !iterator.hasNext() ? y.f22520a : iu.i.a(new a(i10, i11, iterator, z11, z10, null));
    }
}
