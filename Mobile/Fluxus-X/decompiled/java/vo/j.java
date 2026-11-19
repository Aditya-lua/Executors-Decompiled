package vo;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001eB/\b\u0007\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lvo/j;", "Lln/o;", "Lvo/j$a;", "Lls/j;", "Lg/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "openDocumentLauncher", "Landroid/content/Context;", "context", "Ler/c;", "sdkFilesManager", "<init>", "(Lg/d;Landroid/content/Context;Ler/c;)V", BuildConfig.FLAVOR, "g", "()V", "Landroid/net/Uri;", "file", "f", "(Landroid/net/Uri;)Ljava/lang/String;", "Ldv/h;", "run", "()Ldv/h;", "b", "Lg/d;", "c", "Landroid/content/Context;", "d", "Ler/c;", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements ln.o<a>, ls.j<a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.d<String[]> openDocumentLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lvo/j$a;", BuildConfig.FLAVOR, "<init>", "()V", "c", "b", "a", "Lvo/j$a$a;", "Lvo/j$a$b;", "Lvo/j$a$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: vo.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvo/j$a$a;", "Lvo/j$a;", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0712a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0712a f34672a = new C0712a();

            public C0712a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lvo/j$a$b;", "Lvo/j$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lvo/j$a$c;", "Lvo/j$a;", BuildConfig.FLAVOR, "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String absoluteFilePath;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String fileName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull String absoluteFilePath, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
                this.fileName = str;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getFileName() {
                return this.fileName;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements dv.h<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f34675a;
        public final /* synthetic */ j b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f34676a;
            public final /* synthetic */ j b;

            /* JADX INFO: renamed from: vo.j$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", f = "DocumentSelectWorker.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            public static final class C0713a extends gu.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f34677t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f34678u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f34679v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f34681x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f34682y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f34683z;

                public C0713a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f34677t = obj;
                    this.f34678u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar, j jVar) {
                this.f34676a = iVar;
                this.b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
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
                C0713a c0713a;
                Object bVar2;
                if (bVar instanceof C0713a) {
                    c0713a = (C0713a) bVar;
                    int i10 = c0713a.f34678u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0713a.f34678u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0713a = new C0713a(bVar);
                    }
                } else {
                    c0713a = new C0713a(bVar);
                }
                Object obj2 = c0713a.f34677t;
                Object objE = fu.c.e();
                int i11 = c0713a.f34678u;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    dv.i iVar = this.f34676a;
                    Uri uri = (Uri) obj;
                    if (uri != null) {
                        String type = this.b.context.getContentResolver().getType(uri);
                        String strF = this.b.f(uri);
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                        }
                        er.c cVar = this.b.sdkFilesManager;
                        Intrinsics.checkNotNull(extensionFromMimeType);
                        File fileE = cVar.e(extensionFromMimeType);
                        try {
                            InputStream inputStreamOpenInputStream = this.b.context.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream == null) {
                                bVar2 = new a.b(new InternalErrorInfo.UnknownErrorInfo("ContentProvider has recently crashed."));
                            } else {
                                FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                                try {
                                    try {
                                        lu.b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                        lu.c.a(inputStreamOpenInputStream, null);
                                        lu.c.a(fileOutputStream, null);
                                        String absolutePath = fileE.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                        bVar2 = new a.c(absolutePath, strF);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            lu.c.a(inputStreamOpenInputStream, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        lu.c.a(fileOutputStream, th4);
                                        throw th5;
                                    }
                                }
                            }
                        } catch (FileNotFoundException unused) {
                            bVar2 = new a.b(new InternalErrorInfo.UnknownErrorInfo("Selected document file not found."));
                        }
                    } else {
                        bVar2 = a.C0712a.f34672a;
                    }
                    c0713a.f34679v = gu.l.a(obj);
                    c0713a.f34681x = gu.l.a(c0713a);
                    c0713a.f34682y = gu.l.a(obj);
                    c0713a.f34683z = gu.l.a(iVar);
                    c0713a.A = 0;
                    c0713a.f34678u = 1;
                    if (iVar.emit(bVar2, c0713a) == objE) {
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

        public b(dv.h hVar, j jVar) {
            this.f34675a = hVar;
            this.b = jVar;
        }

        @Override // dv.h
        public Object collect(dv.i<? super a> iVar, eu.b bVar) {
            Object objCollect = this.f34675a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    public j(@NotNull g.d<String[]> openDocumentLauncher, @NotNull Context context, @NotNull er.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
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

    @Nullable
    public final String f(@NotNull Uri file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Cursor cursorQuery = this.context.getContentResolver().query(file, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        String string = cursorQuery != null ? cursorQuery.getString(Math.max(cursorQuery.getColumnIndex("_display_name"), 0)) : null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public final void g() {
        this.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<a> run() {
        return dv.j.y(new b(new aq.u(), this), av.g1.b());
    }
}
