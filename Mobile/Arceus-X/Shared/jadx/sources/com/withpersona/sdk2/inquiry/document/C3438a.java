package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mp.C8610a0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p139g.AbstractC5854c;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001b\u0015B)\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "Lvr/h;", "Lg/c;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Lqq/c;)V", "", "errorMessage", "", "e", "(Ljava/lang/String;)Z", "Lnu/h;", "run", "()Lnu/h;", "b", "Lg/c;", "c", "Landroid/content/Context;", "d", "Lqq/c;", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3438a implements InterfaceC13222o<b>, InterfaceC12257h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<Uri> pictureLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "<init>", "()V", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f13163a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14111b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14111b(@NotNull String absoluteFilePath) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.a.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$c */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC9575h<b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f13165a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3438a f13166b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$c$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f13167a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3438a f13168b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", m39664f = "DocumentCameraWorker.kt", m39665l = {50}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14112a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public int f13169A;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f13170t;

                /* JADX INFO: renamed from: u */
                public int f13171u;

                /* JADX INFO: renamed from: v */
                public Object f13172v;

                /* JADX INFO: renamed from: x */
                public Object f13174x;

                /* JADX INFO: renamed from: y */
                public Object f13175y;

                /* JADX INFO: renamed from: z */
                public Object f13176z;

                public C14112a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f13170t = obj;
                    this.f13171u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC9577i interfaceC9577i, C3438a c3438a) {
                this.f13167a = interfaceC9577i;
                this.f13168b = c3438a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                C14112a c14112a;
                b c14111b;
                if (interfaceC9557b instanceof C14112a) {
                    c14112a = (C14112a) interfaceC9557b;
                    int i10 = c14112a.f13171u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14112a.f13171u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14112a = new C14112a(interfaceC9557b);
                    }
                } else {
                    c14112a = new C14112a(interfaceC9557b);
                }
                Object obj2 = c14112a.f13170t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14112a.f13171u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f13167a;
                    if (((Boolean) obj).booleanValue()) {
                        File fileM40783f = this.f13168b.sdkFilesManager.m40783f("document_camera_photo.jpg");
                        File fileM40782e = this.f13168b.sdkFilesManager.m40782e("jpg");
                        if (fileM40783f.renameTo(fileM40782e)) {
                            String absolutePath = fileM40782e.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                            c14111b = new b.C14111b(absolutePath);
                        } else {
                            c14111b = b.a.f13163a;
                        }
                    } else {
                        c14111b = b.a.f13163a;
                    }
                    c14112a.f13172v = C10350l.m39676a(obj);
                    c14112a.f13174x = C10350l.m39676a(c14112a);
                    c14112a.f13175y = C10350l.m39676a(obj);
                    c14112a.f13176z = C10350l.m39676a(interfaceC9577i);
                    c14112a.f13169A = 0;
                    c14112a.f13171u = 1;
                    if (interfaceC9577i.emit(c14111b, c14112a) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj2);
                }
                return Unit.f29331a;
            }
        }

        public c(InterfaceC9575h interfaceC9575h, C3438a c3438a) {
            this.f13165a = interfaceC9575h;
            this.f13166b = c3438a;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super b> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f13165a.collect(new a(interfaceC9577i, this.f13166b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    public C3438a(@NotNull AbstractC5854c<Uri> pictureLauncher, @NotNull Context context, @NotNull C10700c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(pictureLauncher, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> interfaceC13222o) {
        return InterfaceC13222o.b.m48893a(this, interfaceC13222o);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16564e(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.m40783f("document_camera_photo.jpg"));
            AbstractC5854c<Uri> abstractC5854c = this.pictureLauncher;
            Intrinsics.checkNotNull(uriForFile);
            abstractC5854c.m26240b(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<b> run() {
        return new c(new C8610a0(), this);
    }
}
