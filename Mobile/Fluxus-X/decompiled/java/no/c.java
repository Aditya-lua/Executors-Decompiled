package no;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001b\u0015B)\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lno/c;", "Lln/o;", "Lno/c$b;", "Lls/j;", "Lg/d;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", "context", "Ler/c;", "sdkFilesManager", "<init>", "(Lg/d;Landroid/content/Context;Ler/c;)V", BuildConfig.FLAVOR, "errorMessage", BuildConfig.FLAVOR, "e", "(Ljava/lang/String;)Z", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Landroid/content/Context;", "d", "Ler/c;", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements ln.o<b>, ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<Uri> pictureLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lno/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "b", "a", "Lno/c$b$a;", "Lno/c$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lno/c$b$a;", "Lno/c$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f25926a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: no.c$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lno/c$b$b;", "Lno/c$b;", BuildConfig.FLAVOR, "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0510b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0510b(@NotNull String absoluteFilePath) {
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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: no.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0511c implements dv.h<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f25928a;
        public final /* synthetic */ c b;

        /* JADX INFO: renamed from: no.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f25929a;
            public final /* synthetic */ c b;

            /* JADX INFO: renamed from: no.c$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", f = "DocumentCameraWorker.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            public static final class C0512a extends gu.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f25930t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f25931u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f25932v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f25934x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f25935y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f25936z;

                public C0512a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f25930t = obj;
                    this.f25931u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar, c cVar) {
                this.f25929a = iVar;
                this.b = cVar;
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
            @Override // dv.i
            public final Object emit(Object obj, eu.b bVar) {
                C0512a c0512a;
                b c0510b;
                if (bVar instanceof C0512a) {
                    c0512a = (C0512a) bVar;
                    int i10 = c0512a.f25931u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0512a.f25931u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0512a = new C0512a(bVar);
                    }
                } else {
                    c0512a = new C0512a(bVar);
                }
                Object obj2 = c0512a.f25930t;
                Object objE = fu.c.e();
                int i11 = c0512a.f25931u;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    dv.i iVar = this.f25929a;
                    if (((Boolean) obj).booleanValue()) {
                        File fileF = this.b.sdkFilesManager.f("document_camera_photo.jpg");
                        File fileE = this.b.sdkFilesManager.e("jpg");
                        if (fileF.renameTo(fileE)) {
                            String absolutePath = fileE.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                            c0510b = new b.C0510b(absolutePath);
                        } else {
                            c0510b = b.a.f25926a;
                        }
                    } else {
                        c0510b = b.a.f25926a;
                    }
                    c0512a.f25932v = gu.l.a(obj);
                    c0512a.f25934x = gu.l.a(c0512a);
                    c0512a.f25935y = gu.l.a(obj);
                    c0512a.f25936z = gu.l.a(iVar);
                    c0512a.A = 0;
                    c0512a.f25931u = 1;
                    if (iVar.emit(c0510b, c0512a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj2);
                }
                return Unit.f21506a;
            }
        }

        public C0511c(dv.h hVar, c cVar) {
            this.f25928a = hVar;
            this.b = cVar;
        }

        @Override // dv.h
        public Object collect(dv.i<? super b> iVar, eu.b bVar) {
            Object objCollect = this.f25928a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    public c(@NotNull g.d<Uri> pictureLauncher, @NotNull Context context, @NotNull er.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(pictureLauncher, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> oVar) {
        return ln.o.b.a(this, oVar);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> jVar) {
        return super.c(jVar);
    }

    public final boolean e(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.f("document_camera_photo.jpg"));
            g.d<Uri> dVar = this.pictureLauncher;
            Intrinsics.checkNotNull(uriForFile);
            dVar.b(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return new C0511c(new aq.a0(), this);
    }
}
