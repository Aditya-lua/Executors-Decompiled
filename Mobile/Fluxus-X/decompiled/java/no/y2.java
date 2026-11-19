package no;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import av.g3;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0013\u0011\u001eB/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lno/y2;", "Lln/o;", "Lno/y2$c;", "Lls/j;", BuildConfig.FLAVOR, "key", "Landroid/content/Context;", "context", "Ler/c;", "sdkFilesManager", "Lkotlin/Function0;", BuildConfig.FLAVOR, "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Ler/c;Lkotlin/jvm/functions/Function0;)V", "otherWorker", BuildConfig.FLAVOR, "a", "(Lln/o;)Z", "c", "(Lls/j;)Z", "Ldv/h;", "run", "()Ldv/h;", "Ldv/i;", BuildConfig.FLAVOR, "Landroid/net/Uri;", "documentSelectResult", "f", "(Ldv/i;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Ler/c;", "e", "Lkotlin/jvm/functions/Function0;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y2 implements ln.o<c>, ls.j<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final er.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lno/y2$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "a", "b", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        FileNotFound,
        PermissionDenied;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ hu.a f26246d = hu.b.a(a());
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lno/y2$b;", BuildConfig.FLAVOR, "Lg/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "openDocumentLauncher", "Lg/j;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", "context", "Ler/c;", "sdkFilesManager", "<init>", "(Lg/d;Lg/d;Landroid/content/Context;Ler/c;)V", "Lno/y2;", "c", "()Lno/y2;", "e", "a", "Lg/d;", "b", "Landroid/content/Context;", "d", "Ler/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.d<String[]> openDocumentLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.d<g.j> selectFromPhotoLibraryLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final er.c sdkFilesManager;

        public b(@NotNull g.d<String[]> openDocumentLauncher, @NotNull g.d<g.j> selectFromPhotoLibraryLauncher, @NotNull Context context, @NotNull er.c sdkFilesManager) {
            Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
            Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            this.openDocumentLauncher = openDocumentLauncher;
            this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
            this.context = context;
            this.sdkFilesManager = sdkFilesManager;
        }

        public static final Unit d(b bVar) {
            bVar.openDocumentLauncher.b(new String[]{"image/*", "application/pdf"});
            return Unit.f21506a;
        }

        public static final Unit f(b bVar) {
            bVar.selectFromPhotoLibraryLauncher.b(g.k.b(h.f.d.f18001a, 0, false, null, 14, null));
            return Unit.f21506a;
        }

        @NotNull
        public final y2 c() {
            return new y2("DocumentPicker", this.context, this.sdkFilesManager, new Function0() { // from class: no.z2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y2.b.d(this.f26274a);
                }
            });
        }

        @NotNull
        public final y2 e() {
            return new y2("PhotoLibraryPicker", this.context, this.sdkFilesManager, new Function0() { // from class: no.a3
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return y2.b.f(this.f25917a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lno/y2$c;", BuildConfig.FLAVOR, "<init>", "()V", "c", "b", "a", "Lno/y2$c$a;", "Lno/y2$c$b;", "Lno/y2$c$c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lno/y2$c$a;", "Lno/y2$c;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f26250a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: no.y2$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lno/y2$c$b;", "Lno/y2$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "absoluteFilePaths", "Lno/y2$a;", "reason", "<init>", "(Ljava/util/List;Lno/y2$a;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lno/y2$a;", "getReason", "()Lno/y2$a;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Failure extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> absoluteFilePaths;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final a reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull List<String> absoluteFilePaths, @NotNull a reason) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.absoluteFilePaths = absoluteFilePaths;
                this.reason = reason;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.c(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public int hashCode() {
                return (this.absoluteFilePaths.hashCode() * 31) + this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }
        }

        /* JADX INFO: renamed from: no.y2$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lno/y2$c$c;", "Lno/y2$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<String> absoluteFilePaths;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<String> absoluteFilePaths) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                this.absoluteFilePaths = absoluteFilePaths;
            }

            @NotNull
            public final List<String> a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Lno/y2$c;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", f = "DocumentsSelectWorker.kt", l = {45, 49, 53, 57}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<dv.i<? super c>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26253t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26254u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f26255v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", f = "DocumentsSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26257t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ y2 f26258u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y2 y2Var, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f26258u = y2Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f26258u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f26257t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                this.f26258u.launchPicker.invoke();
                return Unit.f21506a;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y2 f26259a;
            public final /* synthetic */ dv.i<c> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(y2 y2Var, dv.i<? super c> iVar) {
                this.f26259a = y2Var;
                this.b = iVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends Uri> list, eu.b<? super Unit> bVar) {
                Object objF = this.f26259a.f(this.b, list, bVar);
                return objF == fu.c.e() ? objF : Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "Landroid/net/Uri;", "<anonymous>", "(Lav/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", f = "DocumentsSelectWorker.kt", l = {46}, m = "invokeSuspend")
        public static final class c extends gu.m implements Function2<av.p0, eu.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26260t;

            public c(eu.b<? super c> bVar) {
                super(2, bVar);
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new c(bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super List<? extends Uri>> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f26260t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    return obj;
                }
                zt.o.b(obj);
                aq.v vVar = new aq.v();
                this.f26260t = 1;
                Object objV = dv.j.v(vVar, this);
                return objV == objE ? objE : objV;
            }
        }

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = y2.this.new d(bVar);
            dVar.f26255v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r10.f(r0, r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r10.collect(r3, r9) == r1) goto L29;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            dv.i iVar = (dv.i) this.f26255v;
            Object objE = fu.c.e();
            int i10 = this.f26254u;
            if (i10 == 0) {
                zt.o.b(obj);
                c cVar = new c(null);
                this.f26255v = iVar;
                this.f26254u = 1;
                obj = g3.e(100L, cVar, this);
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
                    list = (List) this.f26253t;
                    zt.o.b(obj);
                    aq.v vVar = new aq.v();
                    b bVar = new b(y2.this, iVar);
                    this.f26255v = gu.l.a(iVar);
                    this.f26253t = gu.l.a(list);
                    this.f26254u = 4;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                throw new zt.d();
            }
            zt.o.b(obj);
            list = (List) obj;
            if (list != null) {
                y2 y2Var = y2.this;
                this.f26255v = gu.l.a(iVar);
                this.f26253t = gu.l.a(list);
                this.f26254u = 2;
            } else {
                av.n2 n2VarC = av.g1.c();
                a aVar = new a(y2.this, null);
                this.f26255v = iVar;
                this.f26253t = gu.l.a(list);
                this.f26254u = 3;
                if (av.i.g(n2VarC, aVar, this) != objE) {
                    aq.v vVar2 = new aq.v();
                    b bVar2 = new b(y2.this, iVar);
                    this.f26255v = gu.l.a(iVar);
                    this.f26253t = gu.l.a(list);
                    this.f26254u = 4;
                }
            }
            return objE;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super c> iVar, eu.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public y2(@NotNull String key, @NotNull Context context, @NotNull er.c sdkFilesManager, @NotNull Function0<Unit> launchPicker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    @Override // ln.o
    public boolean a(@NotNull ln.o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof y2) && Intrinsics.c(this.key, ((y2) otherWorker).key);
    }

    @Override // ls.j
    public boolean b(@NotNull ls.j<?> jVar) {
        return super.b(jVar);
    }

    @Override // ls.j
    public boolean c(@NotNull ls.j<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof y2) && Intrinsics.c(this.key, ((y2) otherWorker).key);
    }

    public final Object f(dv.i<? super c> iVar, List<? extends Uri> list, eu.b<? super Unit> bVar) {
        String absolutePath;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = this.context.getContentResolver();
        if (list.isEmpty()) {
            Object objEmit = iVar.emit(c.a.f26250a, bVar);
            return objEmit == fu.c.e() ? objEmit : Unit.f21506a;
        }
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (Uri uri : list) {
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                er.c cVar = this.sdkFilesManager;
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "jpg";
                }
                File fileE = cVar.e(extensionFromMimeType);
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(fileE);
                try {
                    lu.b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    try {
                        lu.c.a(inputStreamOpenInputStream, null);
                        lu.c.a(fileOutputStream, null);
                        absolutePath = fileE.getAbsolutePath();
                        if (absolutePath != null) {
                            arrayList.add(absolutePath);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            lu.c.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        lu.c.a(inputStreamOpenInputStream, th4);
                        throw th5;
                    }
                }
            } catch (FileNotFoundException unused) {
                aVar = a.FileNotFound;
                absolutePath = null;
            } catch (SecurityException unused2) {
                aVar = a.PermissionDenied;
                absolutePath = null;
            }
        }
        if (aVar == null) {
            Object objEmit2 = iVar.emit(new c.Success(arrayList), bVar);
            if (objEmit2 == fu.c.e()) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = iVar.emit(new c.Failure(arrayList, aVar), bVar);
            if (objEmit3 == fu.c.e()) {
                return objEmit3;
            }
        }
        return Unit.f21506a;
    }

    @Override // ln.o, ls.j
    @NotNull
    public dv.h<c> run() {
        return dv.j.y(dv.j.w(new d(null)), av.g1.b());
    }
}
