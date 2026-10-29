package com.withpersona.sdk2.inquiry.document;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.withpersona.sdk2.inquiry.document.C3446i;
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
import mp.C8639v;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p139g.C5859h;
import p139g.C5860i;
import p154h.C6253f;
import p229jt.C7334d;
import p229jt.C7348o;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7866g3;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p477ut.C11957b;
import p477ut.C11958c;
import p499vr.InterfaceC12257h;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0003\u0013$\u0011B/\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001c\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "Lvr/h;", "", "key", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "Lkotlin/Function0;", "", "launchPicker", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lqq/c;Lkotlin/jvm/functions/Function0;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lnu/i;", "", "Landroid/net/Uri;", "documentSelectResult", "f", "(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Lqq/c;", "e", "Lkotlin/jvm/functions/Function0;", "a", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3446i implements InterfaceC13222o<c>, InterfaceC12257h<c> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum a {
        FileNotFound,
        PermissionDenied;


        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ InterfaceC10707a f13244d = C10708b.m40805a(m16632a());
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$b */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$b;", "", "Lg/c;", "", "", "openDocumentLauncher", "Lg/h;", "selectFromPhotoLibraryLauncher", "Landroid/content/Context;", "context", "Lqq/c;", "sdkFilesManager", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;Lqq/c;)V", "Lcom/withpersona/sdk2/inquiry/document/i;", "c", "()Lcom/withpersona/sdk2/inquiry/document/i;", "e", "a", "Lg/c;", "b", "Landroid/content/Context;", "d", "Lqq/c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5854c<String[]> openDocumentLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AbstractC5854c<C5859h> selectFromPhotoLibraryLauncher;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final C10700c sdkFilesManager;

        public b(@NotNull AbstractC5854c<String[]> openDocumentLauncher, @NotNull AbstractC5854c<C5859h> selectFromPhotoLibraryLauncher, @NotNull Context context, @NotNull C10700c sdkFilesManager) {
            Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
            Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            this.openDocumentLauncher = openDocumentLauncher;
            this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
            this.context = context;
            this.sdkFilesManager = sdkFilesManager;
        }

        /* JADX INFO: renamed from: d */
        public static final Unit m16635d(b bVar) {
            bVar.openDocumentLauncher.m26240b(new String[]{"image/*", "application/pdf"});
            return Unit.f29331a;
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m16636f(b bVar) {
            bVar.selectFromPhotoLibraryLauncher.m26240b(C5860i.m26282b(C6253f.d.f23773a, 0, false, null, 14, null));
            return Unit.f29331a;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C3446i m16637c() {
            return new C3446i("DocumentPicker", this.context, this.sdkFilesManager, new Function0() { // from class: zn.l2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3446i.b.m16635d(this.f48619a);
                }
            });
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C3446i m16638e() {
            return new C3446i("PhotoLibraryPicker", this.context, this.sdkFilesManager, new Function0() { // from class: zn.m2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C3446i.b.m16636f(this.f48623a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$c */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<init>", "()V", "c", "b", "a", "Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$a;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "<init>", "()V", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f13249a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$c$b, reason: from toString */
        @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$b;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "Lcom/withpersona/sdk2/inquiry/document/i$a;", "reason", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/i$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/document/i$a;", "getReason", "()Lcom/withpersona/sdk2/inquiry/document/i$a;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Failure extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
            /* JADX INFO: renamed from: a */
            public final List<String> m16639a() {
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
                return Intrinsics.m31980c(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
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
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/i$c$c;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Success extends c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final List<String> absoluteFilePaths;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<String> absoluteFilePaths) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                this.absoluteFilePaths = absoluteFilePaths;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<String> m16640a() {
                return this.absoluteFilePaths;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.m31980c(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.i.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/document/i$c;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", m39664f = "DocumentsSelectWorker.kt", m39665l = {45, 49, 53, 57}, m39666m = "invokeSuspend")
    public static final class d extends AbstractC10351m implements Function2<InterfaceC9577i<? super c>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f13253t;

        /* JADX INFO: renamed from: u */
        public int f13254u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f13255v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", m39664f = "DocumentsSelectWorker.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13257t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ C3446i f13258u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3446i c3446i, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f13258u = c3446i;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f13258u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f13257t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f13258u.launchPicker.invoke();
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$d$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3446i f13259a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ InterfaceC9577i<c> f13260b;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: nu.i<? super com.withpersona.sdk2.inquiry.document.i$c> */
            /* JADX WARN: Multi-variable type inference failed */
            public b(C3446i c3446i, InterfaceC9577i<? super c> interfaceC9577i) {
                this.f13259a = c3446i;
                this.f13260b = interfaceC9577i;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<? extends Uri> list, InterfaceC9557b<? super Unit> interfaceC9557b) {
                Object objM16631f = this.f13259a.m16631f(this.f13260b, list, interfaceC9557b);
                return objM16631f == C10047c.m38805e() ? objM16631f : Unit.f29331a;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.i$d$c */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$documentSelectResult$1", m39664f = "DocumentsSelectWorker.kt", m39665l = {46}, m39666m = "invokeSuspend")
        public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f13261t;

            public c(InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new c(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f13261t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                C8639v c8639v = new C8639v();
                this.f13261t = 1;
                Object objM37805v = C9579j.m37805v(c8639v, this);
                return objM37805v == objM38805e ? objM38805e : objM37805v;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<? extends Uri>> interfaceC9557b) {
                return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            d dVar = C3446i.this.new d(interfaceC9557b);
            dVar.f13255v = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r10.m16631f(r0, r2, r9) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        
            if (r10.collect(r3, r9) == r1) goto L29;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f13255v;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13254u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                c cVar = new c(null);
                this.f13255v = interfaceC9577i;
                this.f13254u = 1;
                obj = C7866g3.m32662e(100L, cVar, this);
                if (obj != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    C7348o.m30470b(obj);
                    return Unit.f29331a;
                }
                if (i10 == 3) {
                    list = (List) this.f13253t;
                    C7348o.m30470b(obj);
                    C8639v c8639v = new C8639v();
                    b bVar = new b(C3446i.this, interfaceC9577i);
                    this.f13255v = C10350l.m39676a(interfaceC9577i);
                    this.f13253t = C10350l.m39676a(list);
                    this.f13254u = 4;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                throw new C7334d();
            }
            C7348o.m30470b(obj);
            list = (List) obj;
            if (list != null) {
                C3446i c3446i = C3446i.this;
                this.f13255v = C10350l.m39676a(interfaceC9577i);
                this.f13253t = C10350l.m39676a(list);
                this.f13254u = 2;
            } else {
                AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                a aVar = new a(C3446i.this, null);
                this.f13255v = interfaceC9577i;
                this.f13253t = C10350l.m39676a(list);
                this.f13254u = 3;
                if (C7872i.m32684g(abstractC7900n2M32645c, aVar, this) != objM38805e) {
                    C8639v c8639v2 = new C8639v();
                    b bVar2 = new b(C3446i.this, interfaceC9577i);
                    this.f13255v = C10350l.m39676a(interfaceC9577i);
                    this.f13253t = C10350l.m39676a(list);
                    this.f13254u = 4;
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super c> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C3446i(@NotNull String key, @NotNull Context context, @NotNull C10700c sdkFilesManager, @NotNull Function0<Unit> launchPicker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C3446i) && Intrinsics.m31980c(this.key, ((C3446i) otherWorker).key);
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof C3446i) && Intrinsics.m31980c(this.key, ((C3446i) otherWorker).key);
    }

    /* JADX INFO: renamed from: f */
    public final Object m16631f(InterfaceC9577i<? super c> interfaceC9577i, List<? extends Uri> list, InterfaceC9557b<? super Unit> interfaceC9557b) {
        String absolutePath;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = this.context.getContentResolver();
        if (list.isEmpty()) {
            Object objEmit = interfaceC9577i.emit(c.a.f13249a, interfaceC9557b);
            return objEmit == C10047c.m38805e() ? objEmit : Unit.f29331a;
        }
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        for (Uri uri : list) {
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                C10700c c10700c = this.sdkFilesManager;
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "jpg";
                }
                File fileM40782e = c10700c.m40782e(extensionFromMimeType);
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new FileNotFoundException();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
                try {
                    C11957b.m44627b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    try {
                        C11958c.m44629a(inputStreamOpenInputStream, null);
                        C11958c.m44629a(fileOutputStream, null);
                        absolutePath = fileM40782e.getAbsolutePath();
                        if (absolutePath != null) {
                            arrayList.add(absolutePath);
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            C11958c.m44629a(fileOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        C11958c.m44629a(inputStreamOpenInputStream, th4);
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
            Object objEmit2 = interfaceC9577i.emit(new c.Success(arrayList), interfaceC9557b);
            if (objEmit2 == C10047c.m38805e()) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = interfaceC9577i.emit(new c.Failure(arrayList, aVar), interfaceC9557b);
            if (objEmit3 == C10047c.m38805e()) {
                return objEmit3;
            }
        }
        return Unit.f29331a;
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<c> run() {
        return C9579j.m37808y(C9579j.m37806w(new d(null)), C7864g1.m32644b());
    }
}
