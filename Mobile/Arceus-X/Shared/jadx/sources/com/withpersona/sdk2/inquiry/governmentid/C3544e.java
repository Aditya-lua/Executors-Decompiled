package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mp.C8638u;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p229jt.C7348o;
import p256ku.C7864g1;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p477ut.C11957b;
import p477ut.C11958c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001eB/\b\u0007\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Lvr/h;", "Lg/c;", "", "", "openDocumentLauncher", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "<init>", "(Lg/c;Landroid/content/Context;Lqq/c;)V", "", "g", "()V", "Landroid/net/Uri;", "file", "f", "(Landroid/net/Uri;)Ljava/lang/String;", "Lnu/h;", "run", "()Lnu/h;", "b", "Lg/c;", "c", "Landroid/content/Context;", "d", "Lqq/c;", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3544e implements InterfaceC13222o<a>, InterfaceC12257h<a> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<String[]> openDocumentLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "<init>", "()V", "c", "b", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "<init>", "()V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14125a extends a {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final C14125a f14058a = new C14125a();

            public C14125a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a$b */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$a$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;", "Lcom/withpersona/sdk2/inquiry/governmentid/e$a;", "", "absoluteFilePath", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.e.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC9575h<a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f14062a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3544e f14063b;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f14064a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3544e f14065b;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", m39664f = "DocumentSelectWorker.kt", m39665l = {50}, m39666m = "emit")
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14126a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public int f14066A;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f14067t;

                /* JADX INFO: renamed from: u */
                public int f14068u;

                /* JADX INFO: renamed from: v */
                public Object f14069v;

                /* JADX INFO: renamed from: x */
                public Object f14071x;

                /* JADX INFO: renamed from: y */
                public Object f14072y;

                /* JADX INFO: renamed from: z */
                public Object f14073z;

                public C14126a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f14067t = obj;
                    this.f14068u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC9577i interfaceC9577i, C3544e c3544e) {
                this.f14064a = interfaceC9577i;
                this.f14065b = c3544e;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: nu.i */
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
            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                C14126a c14126a;
                Object bVar;
                if (interfaceC9557b instanceof C14126a) {
                    c14126a = (C14126a) interfaceC9557b;
                    int i10 = c14126a.f14068u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14126a.f14068u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14126a = new C14126a(interfaceC9557b);
                    }
                } else {
                    c14126a = new C14126a(interfaceC9557b);
                }
                Object obj2 = c14126a.f14067t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14126a.f14068u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f14064a;
                    Uri uri = (Uri) obj;
                    if (uri != null) {
                        String type = this.f14065b.context.getContentResolver().getType(uri);
                        String strM17533f = this.f14065b.m17533f(uri);
                        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type);
                        if (extensionFromMimeType == null) {
                            extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                        }
                        C10700c c10700c = this.f14065b.sdkFilesManager;
                        Intrinsics.checkNotNull(extensionFromMimeType);
                        File fileM40782e = c10700c.m40782e(extensionFromMimeType);
                        try {
                            InputStream inputStreamOpenInputStream = this.f14065b.context.getContentResolver().openInputStream(uri);
                            if (inputStreamOpenInputStream == null) {
                                bVar = new a.b(new InternalErrorInfo.UnknownErrorInfo("ContentProvider has recently crashed."));
                            } else {
                                FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
                                try {
                                    try {
                                        C11957b.m44627b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                        C11958c.m44629a(inputStreamOpenInputStream, null);
                                        C11958c.m44629a(fileOutputStream, null);
                                        String absolutePath = fileM40782e.getAbsolutePath();
                                        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                        bVar = new a.c(absolutePath, strM17533f);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            C11958c.m44629a(inputStreamOpenInputStream, th2);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    try {
                                        throw th4;
                                    } catch (Throwable th5) {
                                        C11958c.m44629a(fileOutputStream, th4);
                                        throw th5;
                                    }
                                }
                            }
                        } catch (FileNotFoundException unused) {
                            bVar = new a.b(new InternalErrorInfo.UnknownErrorInfo("Selected document file not found."));
                        }
                    } else {
                        bVar = a.C14125a.f14058a;
                    }
                    c14126a.f14069v = C10350l.m39676a(obj);
                    c14126a.f14071x = C10350l.m39676a(c14126a);
                    c14126a.f14072y = C10350l.m39676a(obj);
                    c14126a.f14073z = C10350l.m39676a(interfaceC9577i);
                    c14126a.f14066A = 0;
                    c14126a.f14068u = 1;
                    if (interfaceC9577i.emit(bVar, c14126a) == objM38805e) {
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

        public b(InterfaceC9575h interfaceC9575h, C3544e c3544e) {
            this.f14062a = interfaceC9575h;
            this.f14063b = c3544e;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super a> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f14062a.collect(new a(interfaceC9577i, this.f14063b), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    public C3544e(@NotNull AbstractC5854c<String[]> openDocumentLauncher, @NotNull Context context, @NotNull C10700c sdkFilesManager) {
        Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
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

    @Nullable
    /* JADX INFO: renamed from: f */
    public final String m17533f(@NotNull Uri file) {
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

    /* JADX INFO: renamed from: g */
    public final void m17534g() {
        this.openDocumentLauncher.m26240b(new String[]{"image/*", "application/pdf"});
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<a> run() {
        return C9579j.m37808y(new b(new C8638u(), this), C7864g1.m32644b());
    }
}
