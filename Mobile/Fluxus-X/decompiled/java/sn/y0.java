package sn;

import android.annotation.SuppressLint;
import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import f1.b2;
import java.io.File;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0003\u0013\u0011\u0015B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lsn/y0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Lf1/r0;", "recorder", "Ler/c;", "sdkFilesManager", BuildConfig.FLAVOR, "isAudioRequired", "<init>", "(Landroid/content/Context;Lf1/r0;Ler/c;Z)V", "Lzt/n;", "Ljava/io/File;", "e", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "c", "()V", "a", "Landroid/content/Context;", "b", "Lf1/r0;", "Ler/c;", "d", "Z", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "recordingExecutor", "Ldv/c0;", "Lsn/y0$c;", "f", "Ldv/c0;", "videoStateFlow", "Lsn/y0$b;", "g", "Lsn/y0$b;", "currentSession", "h", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f1.r0 recorder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Executor recordingExecutor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dv.c0<c> videoStateFlow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b currentSession;

    /* JADX INFO: renamed from: sn.y0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsn/y0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lf1/r0;", "Landroid/content/Context;", "context", "Ler/c;", "sdkFilesManager", BuildConfig.FLAVOR, "isAudioRequired", "Lsn/y0;", "a", "(Lf1/r0;Landroid/content/Context;Ler/c;Z)Lsn/y0;", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final y0 a(@NotNull f1.r0 r0Var, @NotNull Context context, @NotNull er.c sdkFilesManager, boolean z10) throws p0 {
            Intrinsics.checkNotNullParameter(r0Var, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            y0 y0Var = new y0(context, r0Var, sdkFilesManager, z10);
            y0Var.c();
            return y0Var;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lsn/y0$b;", BuildConfig.FLAVOR, "Lf1/e1;", "recording", "Ljava/io/File;", "outputFile", "<init>", "(Lf1/e1;Ljava/io/File;)V", BuildConfig.FLAVOR, "a", "()V", "e", "Lf1/e1;", "getRecording", "()Lf1/e1;", "b", "Ljava/io/File;", "c", "()Ljava/io/File;", BuildConfig.FLAVOR, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "d", "(Ljava/lang/Throwable;)V", "error", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f1.e1 recording;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final File outputFile;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Throwable error;

        public b(@NotNull f1.e1 recording, @NotNull File outputFile) {
            Intrinsics.checkNotNullParameter(recording, "recording");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            this.recording = recording;
            this.outputFile = outputFile;
        }

        public final void a() {
            this.recording.close();
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final File getOutputFile() {
            return this.outputFile;
        }

        public final void d(@Nullable Throwable th2) {
            this.error = th2;
        }

        public final void e() {
            this.recording.e();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsn/y0$c;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c {
        NotStarted,
        Started,
        Finalized;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ hu.a f31762e = hu.b.a(a());
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.camera.RecordingHelper", f = "RecordingHelper.kt", l = {87}, m = "stop-IoAF18A")
    public static final class d extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31763t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31764u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f31765v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31767x;

        public d(eu.b<? super d> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31765v = obj;
            this.f31767x |= Integer.MIN_VALUE;
            Object objE = y0.this.e(this);
            return objE == fu.c.e() ? objE : zt.n.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsn/y0$c;", "it", BuildConfig.FLAVOR, "<anonymous>", "(Lsn/y0$c;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.camera.RecordingHelper$stop$2", f = "RecordingHelper.kt", l = {}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<c, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31768t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31769u;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            e eVar = new e(bVar);
            eVar.f31769u = obj;
            return eVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.f31769u;
            fu.c.e();
            if (this.f31768t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return gu.b.a(cVar != c.Finalized);
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, eu.b<? super Boolean> bVar) {
            return ((e) create(cVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public y0(@NotNull Context context, @NotNull f1.r0 recorder, @NotNull er.c sdkFilesManager, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.context = context;
        this.recorder = recorder;
        this.sdkFilesManager = sdkFilesManager;
        this.isAudioRequired = z10;
        Executor executorI = l2.b.i(context);
        Intrinsics.checkNotNullExpressionValue(executorI, "getMainExecutor(...)");
        this.recordingExecutor = executorI;
        this.videoStateFlow = dv.r0.a(c.NotStarted);
    }

    public static final void d(y0 y0Var, b2 event) {
        File outputFile;
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = y0Var.currentSession;
        if (event instanceof b2.d) {
            y0Var.videoStateFlow.setValue(c.Started);
            return;
        }
        if (event instanceof b2.a) {
            b2.a aVar = (b2.a) event;
            if (aVar.k()) {
                if (bVar != null) {
                    bVar.d(new f0("Recording completed with error code " + aVar.j(), aVar.i()));
                }
                if (bVar != null && (outputFile = bVar.getOutputFile()) != null) {
                    outputFile.delete();
                }
            }
            if (bVar != null) {
                bVar.a();
            }
            y0Var.currentSession = null;
            y0Var.videoStateFlow.setValue(c.Finalized);
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void c() throws p0 {
        if (this.currentSession != null) {
            return;
        }
        File fileE = this.sdkFilesManager.e("mp4");
        boolean z10 = l2.g.b(this.context, "android.permission.RECORD_AUDIO") == 0;
        if (this.isAudioRequired && !z10) {
            throw new p0();
        }
        f1.w wVarD0 = this.recorder.d0(this.context, new f1.r.a(fileE).a());
        if (this.isAudioRequired && z10) {
            wVarD0.j();
        }
        Intrinsics.checkNotNullExpressionValue(wVarD0, "apply(...)");
        f1.e1 e1VarI = wVarD0.i(this.recordingExecutor, new x2.a() { // from class: sn.x0
            @Override // x2.a
            public final void accept(Object obj) {
                y0.d(this.f31744a, (b2) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(e1VarI, "start(...)");
        this.currentSession = new b(e1VarI, fileE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object e(@NotNull eu.b<? super zt.n<? extends File>> bVar) {
        d dVar;
        b bVar2;
        File file;
        if (bVar instanceof d) {
            dVar = (d) bVar;
            int i10 = dVar.f31767x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f31767x = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(bVar);
            }
        } else {
            dVar = new d(bVar);
        }
        Object obj = dVar.f31765v;
        Object objE = fu.c.e();
        int i11 = dVar.f31767x;
        if (i11 == 0) {
            zt.o.b(obj);
            b bVar3 = this.currentSession;
            if (bVar3 == null) {
                zt.n.Companion companion = zt.n.INSTANCE;
                return zt.n.b(zt.o.a(new t0()));
            }
            File outputFile = bVar3.getOutputFile();
            bVar3.e();
            dv.h hVarO = dv.j.O(this.videoStateFlow, new e(null));
            dVar.f31763t = bVar3;
            dVar.f31764u = outputFile;
            dVar.f31767x = 1;
            if (dv.j.i(hVarO, dVar) == objE) {
                return objE;
            }
            bVar2 = bVar3;
            file = outputFile;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) dVar.f31764u;
            bVar2 = (b) dVar.f31763t;
            zt.o.b(obj);
        }
        Throwable error = bVar2.getError();
        if (error == null) {
            return zt.n.b(file);
        }
        zt.n.Companion companion2 = zt.n.INSTANCE;
        return zt.n.b(zt.o.a(error));
    }
}
