package p440t3;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t3.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lt3/o;", "T", "Lt3/e0;", "Lt3/a0;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lt3/t;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lt3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lt3/f0;", "a", "()Lt3/f0;", "Lt3/a0;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "d", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C11499o<T> implements InterfaceC11483e0<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<String> f40742e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Object f40743f = new Object();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11475a0<T> serializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<File, InterfaceC11504t> coordinatorProducer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Function0<File> produceFile;

    /* JADX INFO: renamed from: t3.o$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Ljava/io/File;", "it", "Lt3/t;", "a", "(Ljava/io/File;)Lt3/t;"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class a extends AbstractC7746m implements Function1<File, InterfaceC11504t> {

        /* JADX INFO: renamed from: i */
        public static final a f40747i = new a();

        public a() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC11504t invoke(@NotNull File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C11506v.m43066a(it);
        }
    }

    /* JADX INFO: renamed from: t3.o$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lt3/o$b;", "", "<init>", "()V", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: t3.o.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<String> m43059a() {
            return C11499o.f40742e;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Object m43060b() {
            return C11499o.f40743f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: t3.o$c */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"T", "", "b", "()V"}, m31666k = 3, m31667mv = {1, 8, 0})
    public static final class c extends AbstractC7746m implements Function0<Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ File f40748i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f40748i = file;
        }

        /* JADX INFO: renamed from: b */
        public final void m43061b() {
            Companion companion = C11499o.INSTANCE;
            Object objM43060b = companion.m43060b();
            File file = this.f40748i;
            synchronized (objM43060b) {
                companion.m43059a().remove(file.getAbsolutePath());
                Unit unit = Unit.f29331a;
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m43061b();
            return Unit.f29331a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, ? extends t3.t> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11499o(@NotNull InterfaceC11475a0<T> serializer, @NotNull Function1<? super File, ? extends InterfaceC11504t> coordinatorProducer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // p440t3.InterfaceC11483e0
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC11485f0<T> mo42974a() throws IOException {
        File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (f40743f) {
            String path = file.getAbsolutePath();
            Set<String> set = f40742e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new C11500p(file, this.serializer, this.coordinatorProducer.invoke(file), new c(file));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 t3.a0)
      (wrap kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:5) t3.o.a.i t3.o$a) : (r2v0 kotlin.jvm.functions.Function1))
      (r3v0 kotlin.jvm.functions.Function0)
     A[MD:(t3.a0<T>, kotlin.jvm.functions.Function1<? super java.io.File, ? extends t3.t>, kotlin.jvm.functions.Function0<? extends java.io.File>):void (m)] (LINE:6) call: t3.o.<init>(t3.a0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C11499o(InterfaceC11475a0 interfaceC11475a0, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC11475a0, (i10 & 2) != 0 ? a.f40747i : function1, function0);
    }
}
