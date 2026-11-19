package es;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.SelectedFile;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002!\u0016Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012$\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Les/k4;", "Lln/o;", "Les/k4$b;", "Lls/j;", BuildConfig.FLAVOR, "key", "Landroid/content/Context;", "context", "Lkotlin/Function0;", BuildConfig.FLAVOR, "launchPicker", "Lkotlin/Function1;", "Leu/b;", BuildConfig.FLAVOR, "Landroid/net/Uri;", BuildConfig.FLAVOR, "collectResult", "checkPendingResult", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "Ldv/i;", "uris", "h", "(Ldv/i;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Lkotlin/jvm/functions/Function0;", "e", "Lkotlin/jvm/functions/Function1;", "f", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k4 implements ln.o<b>, ls.j<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<eu.b<? super List<? extends Uri>>, Object> collectResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<eu.b<? super List<? extends Uri>>, Object> checkPendingResult;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Les/k4$a;", BuildConfig.FLAVOR, "Lg/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "openMultipleDocumentsLauncher", "openSingleDocumentLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/d;Lg/d;Landroid/content/Context;)V", "componentName", "allowedFileTypes", BuildConfig.FLAVOR, "fileUploadLimit", "Les/k4;", "b", "(Ljava/lang/String;[Ljava/lang/String;I)Les/k4;", "a", "Lg/d;", "c", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.d<String[]> openMultipleDocumentsLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.d<String[]> openSingleDocumentLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: es.k4$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2", f = "UiStepFileSelectWorker.kt", l = {116, 119}, m = "invokeSuspend")
        public static final class C0276a extends gu.m implements Function1<eu.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14314t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f14315u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0276a(int i10, eu.b<? super C0276a> bVar) {
                super(1, bVar);
                this.f14315u = i10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0276a(this.f14315u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f14314t;
                if (i10 != 0) {
                    if (i10 == 1) {
                        zt.o.b(obj);
                        Uri uri = (Uri) obj;
                        return uri != null ? p001kotlin.collections.o.d(uri) : p001kotlin.collections.p.k();
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return (List) obj;
                }
                zt.o.b(obj);
                if (this.f14315u == 1) {
                    aq.u uVar = new aq.u();
                    this.f14314t = 1;
                    obj = dv.j.t(uVar, this);
                } else {
                    aq.v vVar = new aq.v();
                    this.f14314t = 2;
                    obj = dv.j.t(vVar, this);
                }
                return objE;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super List<? extends Uri>> bVar) {
                return ((C0276a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$3", f = "UiStepFileSelectWorker.kt", l = {124, 127}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function1<eu.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14316t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f14317u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, eu.b<? super b> bVar) {
                super(1, bVar);
                this.f14317u = i10;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new b(this.f14317u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // gu.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f14316t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    if (this.f14317u == 1) {
                        aq.u uVar = new aq.u();
                        this.f14316t = 1;
                        obj = dv.j.v(uVar, this);
                    } else {
                        aq.v vVar = new aq.v();
                        this.f14316t = 2;
                        obj = dv.j.v(vVar, this);
                    }
                    return objE;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return (List) obj;
                }
                zt.o.b(obj);
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return p001kotlin.collections.o.d(uri);
                }
                return null;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super List<? extends Uri>> bVar) {
                return ((b) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        public a(@NotNull g.d<String[]> openMultipleDocumentsLauncher, @NotNull g.d<String[]> openSingleDocumentLauncher, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(openMultipleDocumentsLauncher, "openMultipleDocumentsLauncher");
            Intrinsics.checkNotNullParameter(openSingleDocumentLauncher, "openSingleDocumentLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            this.openMultipleDocumentsLauncher = openMultipleDocumentsLauncher;
            this.openSingleDocumentLauncher = openSingleDocumentLauncher;
            this.context = context;
        }

        public static final Unit c(int i10, a aVar, String[] strArr) {
            if (i10 == 1) {
                aVar.openSingleDocumentLauncher.b(strArr);
            } else {
                aVar.openMultipleDocumentsLauncher.b(strArr);
            }
            return Unit.f21506a;
        }

        @NotNull
        public final k4 b(@NotNull String componentName, @NotNull final String[] allowedFileTypes, final int fileUploadLimit) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
            return new k4("FileUploadPicker-" + componentName, this.context, new Function0() { // from class: es.j4
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k4.a.c(fileUploadLimit, this, allowedFileTypes);
                }
            }, new C0276a(fileUploadLimit, null), new b(fileUploadLimit, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Les/k4$b;", BuildConfig.FLAVOR, "<init>", "()V", "c", "a", "b", "Les/k4$b$a;", "Les/k4$b$b;", "Les/k4$b$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Les/k4$b$a;", "Les/k4$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f14318a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: es.k4$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Les/k4$b$b;", "Les/k4$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0277b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0277b f14319a = new C0277b();

            public C0277b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: es.k4$b$c, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Les/k4$b$c;", "Les/k4$b;", BuildConfig.FLAVOR, "Lqr/f5;", "files", "<init>", "(Ljava/util/List;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<SelectedFile> files;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<SelectedFile> files) {
                super(null);
                Intrinsics.checkNotNullParameter(files, "files");
                this.files = files;
            }

            @NotNull
            public final List<SelectedFile> a() {
                return this.files;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.files, ((Success) other).files);
            }

            public int hashCode() {
                return this.files.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(files=" + this.files + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Les/k4$b;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1", f = "UiStepFileSelectWorker.kt", l = {42, 46, RequestError.RESPONSE_CODE_FAILURE, 54, 55}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<dv.i<? super b>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f14321t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f14322u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14323v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f14324w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1", f = "UiStepFileSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14326t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k4 f14327u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k4 k4Var, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f14327u = k4Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f14327u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f14326t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                this.f14327u.launchPicker.invoke();
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "Landroid/net/Uri;", "<anonymous>", "(Lav/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$pendingResult$1", f = "UiStepFileSelectWorker.kt", l = {43}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f14328t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ k4 f14329u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k4 k4Var, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f14329u = k4Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f14329u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super List<? extends Uri>> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f14328t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                Function1 function1 = this.f14329u.checkPendingResult;
                this.f14328t = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objE ? objE : objInvoke;
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = k4.this.new c(bVar);
            cVar.f14324w = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[PHI: r2 r11
          0x00b8: PHI (r2v7 java.util.List) = (r2v6 java.util.List), (r2v13 java.util.List) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r2.h(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        
            if (r3.h(r0, r11, r10) == r1) goto L35;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            dv.i iVar = (dv.i) this.f14324w;
            Object objE = fu.c.e();
            int i10 = this.f14323v;
            if (i10 == 0) {
                zt.o.b(obj);
                b bVar = new b(k4.this, null);
                this.f14324w = iVar;
                this.f14323v = 1;
                obj = av.g3.e(100L, bVar, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    zt.o.b(obj);
                    return Unit.f21506a;
                }
                if (i10 == 3) {
                    list = (List) this.f14321t;
                    zt.o.b(obj);
                    Function1 function1 = k4.this.collectResult;
                    this.f14324w = iVar;
                    this.f14321t = gu.l.a(list);
                    this.f14323v = 4;
                    obj = function1.invoke(this);
                    if (obj != objE) {
                        List list2 = (List) obj;
                        k4 k4Var = k4.this;
                        this.f14324w = gu.l.a(iVar);
                        this.f14321t = gu.l.a(list);
                        this.f14322u = gu.l.a(list2);
                        this.f14323v = 5;
                    }
                    return objE;
                }
                if (i10 == 4) {
                    list = (List) this.f14321t;
                    zt.o.b(obj);
                    List list3 = (List) obj;
                    k4 k4Var2 = k4.this;
                    this.f14324w = gu.l.a(iVar);
                    this.f14321t = gu.l.a(list);
                    this.f14322u = gu.l.a(list3);
                    this.f14323v = 5;
                } else {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            List list4 = (List) obj;
            if (list4 != null) {
                k4 k4Var3 = k4.this;
                this.f14324w = gu.l.a(iVar);
                this.f14321t = gu.l.a(list4);
                this.f14323v = 2;
            } else {
                av.n2 n2VarC = av.g1.c();
                a aVar = new a(k4.this, null);
                this.f14324w = iVar;
                this.f14321t = gu.l.a(list4);
                this.f14323v = 3;
                if (av.i.g(n2VarC, aVar, this) != objE) {
                    list = list4;
                    Function1 function2 = k4.this.collectResult;
                    this.f14324w = iVar;
                    this.f14321t = gu.l.a(list);
                    this.f14323v = 4;
                    obj = function2.invoke(this);
                    if (obj != objE) {
                        List list5 = (List) obj;
                        k4 k4Var4 = k4.this;
                        this.f14324w = gu.l.a(iVar);
                        this.f14321t = gu.l.a(list);
                        this.f14322u = gu.l.a(list5);
                        this.f14323v = 5;
                    }
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super b> iVar, eu.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k4(@NotNull String key, @NotNull Context context, @NotNull Function0<Unit> launchPicker, @NotNull Function1<? super eu.b<? super List<? extends Uri>>, ? extends Object> collectResult, @NotNull Function1<? super eu.b<? super List<? extends Uri>>, ? extends Object> checkPendingResult) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        Intrinsics.checkNotNullParameter(collectResult, "collectResult");
        Intrinsics.checkNotNullParameter(checkPendingResult, "checkPendingResult");
        this.key = key;
        this.context = context;
        this.launchPicker = launchPicker;
        this.collectResult = collectResult;
        this.checkPendingResult = checkPendingResult;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof k4) && Intrinsics.c(this.key, ((k4) otherWorker).key);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof k4) && Intrinsics.c(this.key, ((k4) otherWorker).key);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:52:0x006b A[SYNTHETIC] */
    public final Object h(dv.i<? super b> iVar, List<? extends Uri> list, eu.b<? super Unit> bVar) {
        String string;
        int columnIndex;
        if (list.isEmpty()) {
            Object objEmit = iVar.emit(b.a.f14318a, bVar);
            return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            Cursor cursorQuery = this.context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    lu.c.a(cursorQuery, null);
                    if (string == null) {
                        string = uri.getLastPathSegment();
                        if (string == null) {
                            string = "file";
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = uri.getLastPathSegment();
                if (string == null) {
                    string = "file";
                }
            }
            arrayList.add(new SelectedFile(uri, string));
        }
        if (arrayList.isEmpty()) {
            Object objEmit2 = iVar.emit(b.C0277b.f14319a, bVar);
            return objEmit2 == fu.c.e() ? objEmit2 : Unit.f21506a;
        }
        Object objEmit3 = iVar.emit(new b.Success(arrayList), bVar);
        return objEmit3 == fu.c.e() ? objEmit3 : Unit.f21506a;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<b> run() {
        return dv.j.y(dv.j.w(new c(null)), av.g1.b());
    }
}
