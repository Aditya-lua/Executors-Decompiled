package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import iu.g1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kp.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001eB/\b\u0007\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e;", "Lwm/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Ltr/h;", "Lg/c;", "", "", "openDocumentLauncher", "Landroid/content/Context;", "context", "Loq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Loq/c;)V", "", "g", "()V", "Landroid/net/Uri;", "file", "f", "(Landroid/net/Uri;)Ljava/lang/String;", "Llu/h;", "run", "()Llu/h;", "b", "Lg/c;", "c", "Landroid/content/Context;", "d", "Loq/c;", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements wm.o<a>, tr.h<a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final g.c<String[]> openDocumentLauncher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final oq.c sdkFilesManager;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "<init>", "()V", "c", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "<init>", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0198a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0198a f10966a = new C0198a();

            public C0198a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements lu.h<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lu.h f10969a;
        public final /* synthetic */ e b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.i f10970a;
            public final /* synthetic */ e b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$b$a$a, reason: collision with other inner class name */
            @nt.f(c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", f = "DocumentSelectWorker.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0199a extends nt.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f10971t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f10972u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f10973v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f10975x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f10976y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f10977z;

                public C0199a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f10971t = obj;
                    this.f10972u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(lu.i iVar, e eVar) {
                this.f10970a = iVar;
                this.b = eVar;
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
            @Override // lu.i
            public final Object emit(Object obj, lt.b bVar) {
                C0199a c0199a;
                Object bVar2;
                if (bVar instanceof C0199a) {
                    c0199a = (C0199a) bVar;
                    int i10 = c0199a.f10972u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0199a.f10972u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0199a = new C0199a(bVar);
                    }
                } else {
                    c0199a = new C0199a(bVar);
                }
                Object obj2 = c0199a.f10971t;
                Object objE = mt.c.e();
                int i11 = c0199a.f10972u;
                if (i11 == 0) {
                    gt.o.b(obj2);
                    lu.i iVar = this.f10970a;
                    Uri uri = (Uri) obj;
                    if (uri != null) {
                        String type = this.b.context.getContentResolver().getType(uri);
                        String strF = this.b.f(uri);
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                        }
                        oq.c cVar = this.b.sdkFilesManager;
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
                                        st.b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                        st.c.a(inputStreamOpenInputStream, null);
                                        st.c.a(fileOutputStream, null);
                                        String absolutePath = fileE.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                        bVar2 = new a.c(absolutePath, strF);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            st.c.a(inputStreamOpenInputStream, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        st.c.a(fileOutputStream, th4);
                                        throw th5;
                                    }
                                }
                            }
                        } catch (FileNotFoundException unused) {
                            bVar2 = new a.b(new InternalErrorInfo.UnknownErrorInfo("Selected document file not found."));
                        }
                    } else {
                        bVar2 = a.C0198a.f10966a;
                    }
                    c0199a.f10973v = nt.l.a(obj);
                    c0199a.f10975x = nt.l.a(c0199a);
                    c0199a.f10976y = nt.l.a(obj);
                    c0199a.f10977z = nt.l.a(iVar);
                    c0199a.A = 0;
                    c0199a.f10972u = 1;
                    if (iVar.emit(bVar2, c0199a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj2);
                }
                return Unit.f22938a;
            }
        }

        public b(lu.h hVar, e eVar) {
            this.f10969a = hVar;
            this.b = eVar;
        }

        @Override // lu.h
        public Object collect(lu.i<? super a> iVar, lt.b bVar) {
            Object objCollect = this.f10969a.collect(new a(iVar, this.b), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    public e(@NotNull g.c<String[]> openDocumentLauncher, @NotNull Context context, @NotNull oq.c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // tr.h
    public boolean a(@NotNull tr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // tr.h
    public boolean b(@NotNull tr.h<?> hVar) {
        return super.b(hVar);
    }

    @Override // wm.o
    public boolean c(@NotNull wm.o<?> oVar) {
        return wm.o.b.a(this, oVar);
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

    @Override // wm.o, tr.h
    @NotNull
    public lu.h<a> run() {
        return lu.j.y(new b(new u(), this), g1.b());
    }
}
