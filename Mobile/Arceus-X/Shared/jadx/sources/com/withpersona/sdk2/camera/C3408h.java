package com.withpersona.sdk2.camera;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.camera.C3408h;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115f1.AbstractC5241b2;
import p115f1.C5251e1;
import p115f1.C5288r;
import p115f1.C5289r0;
import p115f1.C5303w;
import p132fn.C5678d0;
import p132fn.C5686h0;
import p132fn.C5713v;
import p229jt.C7347n;
import p229jt.C7348o;
import p261l2.C7975b;
import p261l2.C7980g;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p533x2.InterfaceC12631a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.camera.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0003\u0013\u0011\u0015B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/h;", "", "Landroid/content/Context;", "context", "Lf1/r0;", "recorder", "Lqq/c;", "sdkFilesManager", "", "isAudioRequired", "<init>", "(Landroid/content/Context;Lf1/r0;Lqq/c;Z)V", "Ljt/n;", "Ljava/io/File;", "e", "(Lnt/b;)Ljava/lang/Object;", "", "c", "()V", "a", "Landroid/content/Context;", "b", "Lf1/r0;", "Lqq/c;", "d", "Z", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "recordingExecutor", "Lnu/c0;", "Lcom/withpersona/sdk2/camera/h$c;", "f", "Lnu/c0;", "videoStateFlow", "Lcom/withpersona/sdk2/camera/h$b;", "g", "Lcom/withpersona/sdk2/camera/h$b;", "currentSession", "h", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3408h {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C5289r0 recorder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isAudioRequired;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Executor recordingExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<c> videoStateFlow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public b currentSession;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.h$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/h$a;", "", "<init>", "()V", "Lf1/r0;", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "", "isAudioRequired", "Lcom/withpersona/sdk2/camera/h;", "a", "(Lf1/r0;Landroid/content/Context;Lqq/c;Z)Lcom/withpersona/sdk2/camera/h;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.camera.h.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3408h m16237a(@NotNull C5289r0 c5289r0, @NotNull Context context, @NotNull C10700c sdkFilesManager, boolean z10) throws C5678d0 {
            Intrinsics.checkNotNullParameter(c5289r0, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            C3408h c3408h = new C3408h(context, c5289r0, sdkFilesManager, z10);
            c3408h.m16235c();
            return c3408h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.h$b */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/h$b;", "", "Lf1/e1;", "recording", "Ljava/io/File;", "outputFile", "<init>", "(Lf1/e1;Ljava/io/File;)V", "", "a", "()V", "e", "Lf1/e1;", "getRecording", "()Lf1/e1;", "b", "Ljava/io/File;", "c", "()Ljava/io/File;", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "d", "(Ljava/lang/Throwable;)V", "error", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C5251e1 recording;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final File outputFile;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public Throwable error;

        public b(@NotNull C5251e1 recording, @NotNull File outputFile) {
            Intrinsics.checkNotNullParameter(recording, "recording");
            Intrinsics.checkNotNullParameter(outputFile, "outputFile");
            this.recording = recording;
            this.outputFile = outputFile;
        }

        /* JADX INFO: renamed from: a */
        public final void m16238a() {
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

        /* JADX INFO: renamed from: d */
        public final void m16241d(@Nullable Throwable th2) {
            this.error = th2;
        }

        /* JADX INFO: renamed from: e */
        public final void m16242e() {
            this.recording.m24288e();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.h$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/h$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum c {
        NotStarted,
        Started,
        Finalized;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f12969e = C10708b.m40805a(m16243a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.h$d */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.RecordingHelper", m39664f = "RecordingHelper.kt", m39665l = {87}, m39666m = "stop-IoAF18A")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f12970t;

        /* JADX INFO: renamed from: u */
        public Object f12971u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f12972v;

        /* JADX INFO: renamed from: x */
        public int f12974x;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12972v = obj;
            this.f12974x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            Object objM16236e = C3408h.this.m16236e(this);
            return objM16236e == C10047c.m38805e() ? objM16236e : C7347n.m30459a(objM16236e);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.h$e */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/h$c;", "it", "", "<anonymous>", "(Lcom/withpersona/sdk2/camera/h$c;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.camera.RecordingHelper$stop$2", m39664f = "RecordingHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function2<c, InterfaceC9557b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12975t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f12976u;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = new e(interfaceC9557b);
            eVar.f12976u = obj;
            return eVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            c cVar = (c) this.f12976u;
            C10047c.m38805e();
            if (this.f12975t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C10340b.m39658a(cVar != c.Finalized);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c cVar, InterfaceC9557b<? super Boolean> interfaceC9557b) {
            return ((e) create(cVar, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3408h(@NotNull Context context, @NotNull C5289r0 recorder, @NotNull C10700c sdkFilesManager, boolean z10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.context = context;
        this.recorder = recorder;
        this.sdkFilesManager = sdkFilesManager;
        this.isAudioRequired = z10;
        Executor executorM33011i = C7975b.m33011i(context);
        Intrinsics.checkNotNullExpressionValue(executorM33011i, "getMainExecutor(...)");
        this.recordingExecutor = executorM33011i;
        this.videoStateFlow = C9596r0.m37859a(c.NotStarted);
    }

    /* JADX INFO: renamed from: d */
    public static final void m16234d(C3408h c3408h, AbstractC5241b2 event) {
        File outputFile;
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = c3408h.currentSession;
        if (event instanceof AbstractC5241b2.d) {
            c3408h.videoStateFlow.setValue(c.Started);
            return;
        }
        if (event instanceof AbstractC5241b2.a) {
            AbstractC5241b2.a aVar = (AbstractC5241b2.a) event;
            if (aVar.m24260k()) {
                if (bVar != null) {
                    bVar.m16241d(new C5713v("Recording completed with error code " + aVar.m24259j(), aVar.m24258i()));
                }
                if (bVar != null && (outputFile = bVar.getOutputFile()) != null) {
                    outputFile.delete();
                }
            }
            if (bVar != null) {
                bVar.m16238a();
            }
            c3408h.currentSession = null;
            c3408h.videoStateFlow.setValue(c.Finalized);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: c */
    public final void m16235c() throws C5678d0 {
        if (this.currentSession != null) {
            return;
        }
        File fileM40782e = this.sdkFilesManager.m40782e("mp4");
        boolean z10 = C7980g.m33039b(this.context, "android.permission.RECORD_AUDIO") == 0;
        if (this.isAudioRequired && !z10) {
            throw new C5678d0();
        }
        C5303w c5303wM24492d0 = this.recorder.m24492d0(this.context, new C5288r.a(fileM40782e).m24434a());
        if (this.isAudioRequired && z10) {
            c5303wM24492d0.m24590j();
        }
        Intrinsics.checkNotNullExpressionValue(c5303wM24492d0, "apply(...)");
        C5251e1 c5251e1M24589i = c5303wM24492d0.m24589i(this.recordingExecutor, new InterfaceC12631a() { // from class: fn.k0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C3408h.m16234d(this.f21869a, (AbstractC5241b2) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(c5251e1M24589i, "start(...)");
        this.currentSession = new b(c5251e1M24589i, fileM40782e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m16236e(@NotNull InterfaceC9557b<? super C7347n<? extends File>> interfaceC9557b) {
        d dVar;
        b bVar;
        File file;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f12974x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f12974x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object obj = dVar.f12972v;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f12974x;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            b bVar2 = this.currentSession;
            if (bVar2 == null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new C5686h0()));
            }
            File outputFile = bVar2.getOutputFile();
            bVar2.m16242e();
            InterfaceC9575h interfaceC9575hM37777N = C9579j.m37777N(this.videoStateFlow, new e(null));
            dVar.f12970t = bVar2;
            dVar.f12971u = outputFile;
            dVar.f12974x = 1;
            if (C9579j.m37792i(interfaceC9575hM37777N, dVar) == objM38805e) {
                return objM38805e;
            }
            bVar = bVar2;
            file = outputFile;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (File) dVar.f12971u;
            bVar = (b) dVar.f12970t;
            C7348o.m30470b(obj);
        }
        Throwable error = bVar.getError();
        if (error == null) {
            return C7347n.m30460b(file);
        }
        C7347n.Companion companion2 = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(error));
    }
}
