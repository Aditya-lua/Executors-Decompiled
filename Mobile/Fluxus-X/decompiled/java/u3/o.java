package u3;

import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0015*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lu3/o;", "T", "Lu3/e0;", "Lu3/a0;", "serializer", "Lkotlin/Function1;", "Ljava/io/File;", "Lu3/t;", "coordinatorProducer", "Lkotlin/Function0;", "produceFile", "<init>", "(Lu3/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lu3/f0;", "a", "()Lu3/f0;", "Lu3/a0;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "d", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o<T> implements e0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<String> f33116e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Object f33117f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a0<T> serializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<File, t> coordinatorProducer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<File> produceFile;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ljava/io/File;", "it", "Lu3/t;", "a", "(Ljava/io/File;)Lu3/t;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function1<File, t> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f33120i = new a();

        public a() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(@NotNull File it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return v.a(it);
        }
    }

    /* JADX INFO: renamed from: u3.o$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu3/o$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<String> a() {
            return o.f33116e;
        }

        @NotNull
        public final Object b() {
            return o.f33117f;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", BuildConfig.FLAVOR, "b", "()V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function0<Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ File f33121i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file) {
            super(0);
            this.f33121i = file;
        }

        public final void b() {
            Companion companion = o.INSTANCE;
            Object objB = companion.b();
            File file = this.f33121i;
            synchronized (objB) {
                companion.a().remove(file.getAbsolutePath());
                Unit unit = Unit.f21506a;
            }
        }

        @Override // p001kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull a0<T> serializer, @NotNull Function1<? super File, ? extends t> coordinatorProducer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.serializer = serializer;
        this.coordinatorProducer = coordinatorProducer;
        this.produceFile = produceFile;
    }

    @Override // u3.e0
    @NotNull
    public f0<T> a() throws IOException {
        File file = this.produceFile.invoke().getCanonicalFile();
        synchronized (f33117f) {
            String path = file.getAbsolutePath();
            Set<String> set = f33116e;
            if (set.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            set.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new p(file, this.serializer, this.coordinatorProducer.invoke(file), new c(file));
    }

    public /* synthetic */ o(a0 a0Var, Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, (i10 & 2) != 0 ? a.f33120i : function1, function0);
    }
}
