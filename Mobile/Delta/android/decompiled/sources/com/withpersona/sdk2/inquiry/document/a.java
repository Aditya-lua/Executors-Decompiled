package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mp.a0;
import org.jetbrains.annotations.NotNull;
import pt.l;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001b\u0015B)\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "Lvr/h;", "Lg/c;", "Landroid/net/Uri;", "pictureLauncher", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Lqq/c;)V", "", "errorMessage", "", "e", "(Ljava/lang/String;)Z", "Lnu/h;", "run", "()Lnu/h;", "b", "Lg/c;", "c", "Landroid/content/Context;", "d", "Lqq/c;", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements o<b>, vr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<Uri> pictureLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$a;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0168a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0168a f10147a = new C0168a();

            public C0168a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/a$b$b;", "Lcom/withpersona/sdk2/inquiry/document/a$b;", "", "absoluteFilePath", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0169b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0169b(@NotNull String absoluteFilePath) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements nu.h<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nu.h f10149a;
        public final /* synthetic */ a b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0170a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.i f10150a;
            public final /* synthetic */ a b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.a$c$a$a, reason: collision with other inner class name */
            @pt.f(c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", f = "DocumentCameraWorker.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0171a extends pt.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10151t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f10152u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f10153v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f10155x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f10156y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f10157z;

                public C0171a(nt.b bVar) {
                    super(bVar);
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f10151t = obj;
                    this.f10152u |= Integer.MIN_VALUE;
                    return C0170a.this.emit(null, this);
                }
            }

            public C0170a(nu.i iVar, a aVar) {
                this.f10150a = iVar;
                this.b = aVar;
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
            @Override // nu.i
            public final Object emit(Object obj, nt.b bVar) {
                C0171a c0171a;
                b c0169b;
                if (bVar instanceof C0171a) {
                    c0171a = (C0171a) bVar;
                    int i10 = c0171a.f10152u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0171a.f10152u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0171a = new C0171a(bVar);
                    }
                } else {
                    c0171a = new C0171a(bVar);
                }
                Object obj2 = c0171a.f10151t;
                Object objE = ot.c.e();
                int i11 = c0171a.f10152u;
                if (i11 == 0) {
                    jt.o.b(obj2);
                    nu.i iVar = this.f10150a;
                    if (((Boolean) obj).booleanValue()) {
                        File fileF = this.b.sdkFilesManager.f("document_camera_photo.jpg");
                        File fileE = this.b.sdkFilesManager.e("jpg");
                        if (fileF.renameTo(fileE)) {
                            String absolutePath = fileE.getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                            c0169b = new b.C0169b(absolutePath);
                        } else {
                            c0169b = b.C0168a.f10147a;
                        }
                    } else {
                        c0169b = b.C0168a.f10147a;
                    }
                    c0171a.f10153v = l.a(obj);
                    c0171a.f10155x = l.a(c0171a);
                    c0171a.f10156y = l.a(obj);
                    c0171a.f10157z = l.a(iVar);
                    c0171a.A = 0;
                    c0171a.f10152u = 1;
                    if (iVar.emit(c0169b, c0171a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj2);
                }
                return Unit.f22483a;
            }
        }

        public c(nu.h hVar, a aVar) {
            this.f10149a = hVar;
            this.b = aVar;
        }

        @Override // nu.h
        public Object collect(nu.i<? super b> iVar, nt.b bVar) {
            Object objCollect = this.f10149a.collect(new C0170a(iVar, this.b), bVar);
            return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
        }
    }

    public a(@NotNull g.c<Uri> pictureLauncher, @NotNull Context context, @NotNull qq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(pictureLauncher, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> oVar) {
        return o.b.a(this, oVar);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> hVar) {
        return super.c(hVar);
    }

    public final boolean e(@NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.f("document_camera_photo.jpg"));
            g.c<Uri> cVar = this.pictureLauncher;
            Intrinsics.checkNotNull(uriForFile);
            cVar.b(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<b> run() {
        return new c(new a0(), this);
    }
}
