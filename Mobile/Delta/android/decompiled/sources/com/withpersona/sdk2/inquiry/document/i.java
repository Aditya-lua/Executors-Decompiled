package com.withpersona.sdk2.inquiry.document;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import mp.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0013$\u0011B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "Lvr/h;", "", "key", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "Lkotlin/Function0;", "", "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lnu/i;", "", "Landroid/net/Uri;", "documentSelectResult", "f", "(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Lqq/c;", "e", "Lkotlin/jvm/functions/Function0;", "a", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements o<c>, vr.h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        FileNotFound,
        PermissionDenied;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f10214d = qt.b.a(a());
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$b;", "", "Lg/c;", "", "", "openDocumentLauncher", "Lg/h;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)V", "Lcom/withpersona/sdk2/inquiry/document/i;", "c", "()Lcom/withpersona/sdk2/inquiry/document/i;", "e", "a", "Lg/c;", "b", "Landroid/content/Context;", "d", "Lqq/c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.c<String[]> openDocumentLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.c<g.h> selectFromPhotoLibraryLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final qq.c sdkFilesManager;

        public b(@NotNull g.c<String[]> openDocumentLauncher, @NotNull g.c<g.h> selectFromPhotoLibraryLauncher, @NotNull Context context, @NotNull qq.c sdkFilesManager) {
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
            return Unit.f22483a;
        }

        public static final Unit f(b bVar) {
            bVar.selectFromPhotoLibraryLauncher.b(g.i.b(h.f.d.f18486a, 0, false, null, 14, null));
            return Unit.f22483a;
        }

        @NotNull
        public final i c() {
            return new i("DocumentPicker", this.context, this.sdkFilesManager, new Function0() { // from class: zn.l2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.i.b.d(this.f37766a);
                }
            });
        }

        @NotNull
        public final i e() {
            return new i("PhotoLibraryPicker", this.context, this.sdkFilesManager, new Function0() { // from class: zn.m2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.document.i.b.f(this.f37769a);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<init>", "()V", "c", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "<init>", "()V", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f10218a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "Lcom/withpersona/sdk2/inquiry/document/i$a;", "reason", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/i$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/document/i$a;", "getReason", "()Lcom/withpersona/sdk2/inquiry/document/i$a;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", f = "DocumentsSelectWorker.kt", l = {45, 49, 53, 57}, m = "invokeSuspend")
    public static final class d extends m implements Function2<nu.i<? super c>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f10221t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10222u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f10223v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", f = "DocumentsSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10225t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ i f10226u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f10226u = iVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f10226u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f10225t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                this.f10226u.launchPicker.invoke();
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f10227a;
            public final /* synthetic */ nu.i<c> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(i iVar, nu.i<? super c> iVar2) {
                this.f10227a = iVar;
                this.b = iVar2;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends Uri> list, nt.b<? super Unit> bVar) {
                Object objF = this.f10227a.f(this.b, list, bVar);
                return objF == ot.c.e() ? objF : Unit.f22483a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", f = "DocumentsSelectWorker.kt", l = {46}, m = "invokeSuspend")
        public static final class c extends m implements Function2<p0, nt.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10228t;

            public c(nt.b<? super c> bVar) {
                super(2, bVar);
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new c(bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f10228t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                v vVar = new v();
                this.f10228t = 1;
                Object objV = nu.j.v(vVar, this);
                return objV == objE ? objE : objV;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super List<? extends Uri>> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            d dVar = i.this.new d(bVar);
            dVar.f10223v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r10.f(r0, r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r10.collect(r3, r9) == r1) goto L29;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f10223v
                nu.i r0 = (nu.i) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r9.f10222u
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L3e
                if (r2 == r7) goto L3a
                if (r2 == r6) goto L32
                if (r2 == r5) goto L2a
                if (r2 == r4) goto L21
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r0 = r9.f10221t
                java.util.List r0 = (java.util.List) r0
                jt.o.b(r10)
                goto Laf
            L2a:
                java.lang.Object r2 = r9.f10221t
                java.util.List r2 = (java.util.List) r2
                jt.o.b(r10)
                goto L8e
            L32:
                java.lang.Object r0 = r9.f10221t
                java.util.List r0 = (java.util.List) r0
                jt.o.b(r10)
                goto L6f
            L3a:
                jt.o.b(r10)
                goto L53
            L3e:
                jt.o.b(r10)
                com.withpersona.sdk2.inquiry.document.i$d$c r10 = new com.withpersona.sdk2.inquiry.document.i$d$c
                r10.<init>(r3)
                r9.f10223v = r0
                r9.f10222u = r7
                r7 = 100
                java.lang.Object r10 = ku.g3.e(r7, r10, r9)
                if (r10 != r1) goto L53
                goto Lae
            L53:
                r2 = r10
                java.util.List r2 = (java.util.List) r2
                if (r2 == 0) goto L72
                com.withpersona.sdk2.inquiry.document.i r10 = com.withpersona.sdk2.inquiry.document.i.this
                java.lang.Object r3 = pt.l.a(r0)
                r9.f10223v = r3
                java.lang.Object r3 = pt.l.a(r2)
                r9.f10221t = r3
                r9.f10222u = r6
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.document.i.e(r10, r0, r2, r9)
                if (r10 != r1) goto L6f
                goto Lae
            L6f:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            L72:
                ku.n2 r10 = ku.g1.c()
                com.withpersona.sdk2.inquiry.document.i$d$a r6 = new com.withpersona.sdk2.inquiry.document.i$d$a
                com.withpersona.sdk2.inquiry.document.i r7 = com.withpersona.sdk2.inquiry.document.i.this
                r6.<init>(r7, r3)
                r9.f10223v = r0
                java.lang.Object r3 = pt.l.a(r2)
                r9.f10221t = r3
                r9.f10222u = r5
                java.lang.Object r10 = ku.i.g(r10, r6, r9)
                if (r10 != r1) goto L8e
                goto Lae
            L8e:
                mp.v r10 = new mp.v
                r10.<init>()
                com.withpersona.sdk2.inquiry.document.i$d$b r3 = new com.withpersona.sdk2.inquiry.document.i$d$b
                com.withpersona.sdk2.inquiry.document.i r5 = com.withpersona.sdk2.inquiry.document.i.this
                r3.<init>(r5, r0)
                java.lang.Object r0 = pt.l.a(r0)
                r9.f10223v = r0
                java.lang.Object r0 = pt.l.a(r2)
                r9.f10221t = r0
                r9.f10222u = r4
                java.lang.Object r10 = r10.collect(r3, r9)
                if (r10 != r1) goto Laf
            Lae:
                return r1
            Laf:
                jt.d r10 = new jt.d
                r10.<init>()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.document.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super c> iVar, nt.b<? super Unit> bVar) {
            return ((d) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public i(@NotNull String key, @NotNull Context context, @NotNull qq.c sdkFilesManager, @NotNull Function0<Unit> launchPicker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof i) && Intrinsics.c(this.key, ((i) otherWorker).key);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof i) && Intrinsics.c(this.key, ((i) otherWorker).key);
    }

    public final Object f(nu.i<? super c> iVar, List<? extends Uri> list, nt.b<? super Unit> bVar) {
        String absolutePath;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = this.context.getContentResolver();
        if (list.isEmpty()) {
            Object objEmit = iVar.emit(c.a.f10218a, bVar);
            return objEmit == ot.c.e() ? objEmit : Unit.f22483a;
        }
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (Uri uri : list) {
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                qq.c cVar = this.sdkFilesManager;
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
                    ut.b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    try {
                        ut.c.a(inputStreamOpenInputStream, null);
                        ut.c.a(fileOutputStream, null);
                        absolutePath = fileE.getAbsolutePath();
                        if (absolutePath != null) {
                            arrayList.add(absolutePath);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            ut.c.a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        ut.c.a(inputStreamOpenInputStream, th4);
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
            if (objEmit2 == ot.c.e()) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = iVar.emit(new c.Failure(arrayList, aVar), bVar);
            if (objEmit3 == ot.c.e()) {
                return objEmit3;
            }
        }
        return Unit.f22483a;
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<c> run() {
        return nu.j.y(nu.j.w(new d(null)), g1.b());
    }
}
