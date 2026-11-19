package pq;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p000lifecycle.l0;
import av.d2;
import av.k;
import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.upload.UploadResponse;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import dv.c0;
import gu.d;
import gu.l;
import gu.m;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import mv.b0;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sw.x;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001a\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004#(/,B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010*\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120&j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012`'0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Lpq/a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "uploadService", "Lav/p0;", "coroutineScope", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lav/p0;)V", BuildConfig.FLAVOR, "absoluteFilePath", "fileUploadUrl", BuildConfig.FLAVOR, "j", "(Ljava/lang/String;Ljava/lang/String;)V", "f", "()V", "Lpq/a$e;", "i", "(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "Lpq/a$c;", BuildConfig.FLAVOR, "allowRetry", "k", "(Ljava/lang/String;Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;", "pq/a$f", "g", "()Lpq/a$f;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "Lpq/a$d;", "h", "(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lpq/a$d;", "a", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "b", "Lav/p0;", "Ldv/c0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ldv/c0;", "uploadTasks", "Lkv/a;", "d", "Lkv/a;", "mutex", "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UploadService uploadService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<HashMap<c, e>> uploadTasks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kv.a mutex;

    /* JADX INFO: renamed from: pq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$1", f = "DirectFileUploader.kt", l = {119, 220}, m = "invokeSuspend")
    public static final class C0567a extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ a A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29271t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29272u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29273v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f29274w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f29275x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f29276y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ HashMap<c, e> f29277z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0567a(HashMap<c, e> map, a aVar, eu.b<? super C0567a> bVar) {
            super(2, bVar);
            this.f29277z = map;
            this.A = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new C0567a(this.f29277z, this.A, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0567a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004c  */
        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:18:0x007e  */
        /* JADX WARN: Code duplicated, block: B:23:0x009c  */
        /* JADX WARN: Code duplicated, block: B:34:0x009b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x009c -> B:31:0x009d). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = fu.c.e()
                int r1 = r9.f29276y
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r9.f29274w
                pq.a r1 = (pq.a) r1
                java.lang.Object r5 = r9.f29273v
                kv.a r5 = (kv.a) r5
                java.lang.Object r6 = r9.f29272u
                pq.a$e r6 = (pq.a.e) r6
                java.lang.Object r7 = r9.f29271t
                java.util.Iterator r7 = (java.util.Iterator) r7
                zt.o.b(r10)
                goto L9d
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                java.lang.Object r1 = r9.f29272u
                pq.a$e r1 = (pq.a.e) r1
                java.lang.Object r1 = r9.f29271t
                java.util.Iterator r1 = (java.util.Iterator) r1
                zt.o.b(r10)
                goto L7f
            L38:
                zt.o.b(r10)
                java.util.HashMap<pq.a$c, pq.a$e> r10 = r9.f29277z
                java.util.Collection r10 = r10.values()
                java.util.Iterator r10 = r10.iterator()
                r7 = r10
            L46:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto Lbd
                java.lang.Object r10 = r7.next()
                java.lang.String r1 = "next(...)"
                p001kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
                r6 = r10
                pq.a$e r6 = (pq.a.e) r6
                zt.n r10 = r6.i()
                r1 = 0
                if (r10 != 0) goto L81
                pq.a r10 = r9.A
                java.lang.String r5 = r6.getAbsoluteFilePath()
                java.lang.String r8 = r6.getFileUploadUrl()
                r9.f29271t = r7
                java.lang.Object r6 = gu.l.a(r6)
                r9.f29272u = r6
                r9.f29273v = r4
                r9.f29274w = r4
                r9.f29276y = r3
                java.lang.Object r10 = pq.a.e(r10, r5, r8, r1, r9)
                if (r10 != r0) goto L7e
                goto L9b
            L7e:
                r1 = r7
            L7f:
                r7 = r1
                goto L46
            L81:
                pq.a r10 = r9.A
                kv.a r5 = pq.a.a(r10)
                pq.a r10 = r9.A
                r9.f29271t = r7
                r9.f29272u = r6
                r9.f29273v = r5
                r9.f29274w = r10
                r9.f29275x = r1
                r9.f29276y = r2
                java.lang.Object r1 = r5.d(r4, r9)
                if (r1 != r0) goto L9c
            L9b:
                return r0
            L9c:
                r1 = r10
            L9d:
                dv.c0 r10 = pq.a.c(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> Lb8
                java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = r6.getAbsoluteFilePath()     // Catch: java.lang.Throwable -> Lb8
                pq.a$c r1 = pq.a.c.a(r1)     // Catch: java.lang.Throwable -> Lb8
                r10.put(r1, r6)     // Catch: java.lang.Throwable -> Lb8
                kotlin.Unit r10 = p001kotlin.Unit.f21506a     // Catch: java.lang.Throwable -> Lb8
                r5.f(r4)
                goto L46
            Lb8:
                r10 = move-exception
                r5.f(r4)
                throw r10
            Lbd:
                kotlin.Unit r10 = p001kotlin.Unit.f21506a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: pq.a.C0567a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Lpq/a$c;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "filePath", "f", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;)I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "n", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "k", "j", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "i", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new C0568a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String filePath;

        /* JADX INFO: renamed from: pq.a$c$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0568a implements Parcelable.Creator<c> {
            public final String a(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return c.f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
                return c.a(a(parcel));
            }
        }

        public /* synthetic */ c(String str) {
            this.filePath = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        @NotNull
        public static String f(@NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return filePath;
        }

        public static final int g(String str) {
            return 0;
        }

        public static boolean i(String str, Object obj) {
            return (obj instanceof c) && Intrinsics.c(str, ((c) obj).getFilePath());
        }

        public static int j(String str) {
            return str.hashCode();
        }

        public static String k(String str) {
            return "FilePath(filePath=" + str + ")";
        }

        public static final void n(String str, @NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return g(this.filePath);
        }

        public boolean equals(Object obj) {
            return i(this.filePath, obj);
        }

        public int hashCode() {
            return j(this.filePath);
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final /* synthetic */ String getFilePath() {
            return this.filePath;
        }

        public String toString() {
            return k(this.filePath);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            n(this.filePath, dest, i10);
        }
    }

    /* JADX INFO: renamed from: pq.a$d, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lpq/a$d;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "fileKey", "fileName", BuildConfig.FLAVOR, "fileEncrypted", "fileContentType", BuildConfig.FLAVOR, "fileByteSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "getFileEncrypted", "()Z", "e", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UploadResult implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fileKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fileName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean fileEncrypted;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fileContentType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final long fileByteSize;

        public UploadResult(@NotNull String fileKey, @NotNull String fileName, boolean z10, @NotNull String fileContentType, long j10) {
            Intrinsics.checkNotNullParameter(fileKey, "fileKey");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileContentType, "fileContentType");
            this.fileKey = fileKey;
            this.fileName = fileName;
            this.fileEncrypted = z10;
            this.fileContentType = fileContentType;
            this.fileByteSize = j10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getFileByteSize() {
            return this.fileByteSize;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileContentType() {
            return this.fileContentType;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFileKey() {
            return this.fileKey;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadResult)) {
                return false;
            }
            UploadResult uploadResult = (UploadResult) other;
            return Intrinsics.c(this.fileKey, uploadResult.fileKey) && Intrinsics.c(this.fileName, uploadResult.fileName) && this.fileEncrypted == uploadResult.fileEncrypted && Intrinsics.c(this.fileContentType, uploadResult.fileContentType) && this.fileByteSize == uploadResult.fileByteSize;
        }

        public int hashCode() {
            return (((((((this.fileKey.hashCode() * 31) + this.fileName.hashCode()) * 31) + Boolean.hashCode(this.fileEncrypted)) * 31) + this.fileContentType.hashCode()) * 31) + Long.hashCode(this.fileByteSize);
        }

        @NotNull
        public String toString() {
            return "UploadResult(fileKey=" + this.fileKey + ", fileName=" + this.fileName + ", fileEncrypted=" + this.fileEncrypted + ", fileContentType=" + this.fileContentType + ", fileByteSize=" + this.fileByteSize + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lpq/a$e;", "Landroid/os/Parcelable;", "Lpq/a$c;", "absoluteFilePath", BuildConfig.FLAVOR, "fileUploadUrl", "Lzt/n;", "Lpq/a$d;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lzt/n;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "g", "c", "Lzt/n;", "i", "()Lzt/n;", "k", "(Lzt/n;)V", "Lav/d2;", "d", "Lav/d2;", "getJob", "()Lav/d2;", "j", "(Lav/d2;)V", "getJob$annotations", "()V", "job", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<e> CREATOR = new C0569a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String fileUploadUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public n<UploadResult> result;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public d2 job;

        /* JADX INFO: renamed from: pq.a$e$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0569a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new e(c.CREATOR.createFromParcel(parcel).getFilePath(), parcel.readString(), (n) parcel.readSerializable(), null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask", f = "DirectFileUploader.kt", l = {79}, m = "await-IoAF18A")
        public static final class b extends d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f29286t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f29288v;

            public b(eu.b<? super b> bVar) {
                super(bVar);
            }

            @Override // gu.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f29286t = obj;
                this.f29288v |= Integer.MIN_VALUE;
                Object objA = e.this.a(this);
                return objA == fu.c.e() ? objA : n.a(objA);
            }
        }

        public /* synthetic */ e(String str, String str2, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, nVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object a(@NotNull eu.b<? super n<UploadResult>> bVar) {
            b bVar2;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f29288v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f29288v = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f29286t;
            Object objE = fu.c.e();
            int i11 = bVar2.f29288v;
            if (i11 == 0) {
                o.b(obj);
                d2 d2Var = this.job;
                if (d2Var != null) {
                    bVar2.f29288v = 1;
                    if (d2Var.z(bVar2) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            n<UploadResult> nVar = this.result;
            if (nVar != null) {
                return nVar.getValue();
            }
            n.Companion companion = n.INSTANCE;
            return n.b(o.a(new IllegalStateException("Result was null.")));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getAbsoluteFilePath() {
            return this.absoluteFilePath;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        public final n<UploadResult> i() {
            return this.result;
        }

        public final void j(@Nullable d2 d2Var) {
            this.job = d2Var;
        }

        public final void k(@Nullable n<UploadResult> nVar) {
            this.result = nVar;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            c.n(this.absoluteFilePath, dest, flags);
            dest.writeString(this.fileUploadUrl);
            dest.writeSerializable(this.result);
        }

        public e(String absoluteFilePath, String fileUploadUrl, n<UploadResult> nVar) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
            this.absoluteFilePath = absoluteFilePath;
            this.fileUploadUrl = fileUploadUrl;
            this.result = nVar;
        }

        public /* synthetic */ e(String str, String str2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : nVar, null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"pq/a$f", "Ljava/util/LinkedHashMap;", "Lpq/a$c;", "Lpq/a$e;", "Lkotlin/collections/LinkedHashMap;", BuildConfig.FLAVOR, "eldest", BuildConfig.FLAVOR, "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends LinkedHashMap<c, e> {
        public /* bridge */ boolean a(String str) {
            return super.containsKey(c.a(str));
        }

        public /* bridge */ boolean b(e eVar) {
            return super.containsValue(eVar);
        }

        public /* bridge */ e c(String str) {
            return (e) super.get(c.a(str));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof c) {
                return a(((c) obj).getFilePath());
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof e) {
                return b((e) obj);
            }
            return false;
        }

        public /* bridge */ Set<Map.Entry<c, e>> e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<c, e>> entrySet() {
            return e();
        }

        public /* bridge */ Set<c> f() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof c) {
                return c(((c) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof c) ? obj2 : i(((c) obj).getFilePath(), (e) obj2);
        }

        public /* bridge */ e i(String str, e eVar) {
            return (e) super.getOrDefault(c.a(str), eVar);
        }

        public /* bridge */ int k() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<c> keySet() {
            return f();
        }

        public /* bridge */ Collection<e> l() {
            return super.values();
        }

        public /* bridge */ boolean o(String str, e eVar) {
            return super.remove(c.a(str), eVar);
        }

        public /* bridge */ e p(String str) {
            return (e) super.remove(c.a(str));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof c) {
                return p(((c) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<c, e> eldest) {
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return k();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<e> values() {
            return l();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof c) && (obj2 instanceof e)) {
                return o(((c) obj).getFilePath(), (e) obj2);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageAsync$1", f = "DirectFileUploader.kt", l = {135}, m = "invokeSuspend")
    public static final class g extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f29289t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f29291v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f29292w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f29291v = str;
            this.f29292w = str2;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return a.this.new g(this.f29291v, this.f29292w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f29289t;
            if (i10 == 0) {
                o.b(obj);
                a aVar = a.this;
                String strF = c.f(this.f29291v);
                String str = this.f29292w;
                this.f29289t = 1;
                if (aVar.k(strF, str, false, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader", f = "DirectFileUploader.kt", l = {220}, m = "uploadImageInternal-XenoRnc")
    public static final class h extends d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29293t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29294u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f29295v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f29296w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f29297x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29298y;

        public h(eu.b<? super h> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29298y = obj;
            this.A |= Integer.MIN_VALUE;
            return a.this.k(null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1", f = "DirectFileUploader.kt", l = {174}, m = "invokeSuspend")
    public static final class i extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29300t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29301u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f29302v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f29303w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ a f29304x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f29305y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ e f29306z;

        /* JADX INFO: renamed from: pq.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lsw/x;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "<anonymous>", "()Lsw/x;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1$1", f = "DirectFileUploader.kt", l = {176}, m = "invokeSuspend")
        public static final class C0570a extends m implements Function1<eu.b<? super x<UploadResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f29307t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a f29308u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f29309v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ File f29310w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ g0 f29311x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0570a(a aVar, String str, File file, g0 g0Var, eu.b<? super C0570a> bVar) {
                super(1, bVar);
                this.f29308u = aVar;
                this.f29309v = str;
                this.f29310w = file;
                this.f29311x = g0Var;
            }

            @Override // gu.a
            public final eu.b<Unit> create(eu.b<?> bVar) {
                return new C0570a(this.f29308u, this.f29309v, this.f29310w, this.f29311x, bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f29307t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                UploadService uploadService = this.f29308u.uploadService;
                String str = this.f29309v;
                mv.c0.c cVarC = mv.c0.c.INSTANCE.c("file", this.f29310w.getName(), this.f29311x);
                this.f29307t = 1;
                Object objUpload = uploadService.upload(str, cVarC, this);
                return objUpload == objE ? objE : objUpload;
            }

            @Override // p001kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Object invoke(eu.b<? super x<UploadResponse>> bVar) {
                return ((C0570a) create(bVar)).invokeSuspend(Unit.f21506a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, a aVar, String str2, e eVar, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f29303w = str;
            this.f29304x = aVar;
            this.f29305y = str2;
            this.f29306z = eVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new i(this.f29303w, this.f29304x, this.f29305y, this.f29306z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f29302v;
            if (i10 == 0) {
                o.b(obj);
                File file = new File(this.f29303w);
                g0 g0VarB = g0.INSTANCE.b(file, b0.INSTANCE.b("image/jpeg"));
                C0570a c0570a = new C0570a(this.f29304x, this.f29305y, file, g0VarB, null);
                this.f29300t = l.a(file);
                this.f29301u = l.a(g0VarB);
                this.f29302v = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(c0570a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            NetworkCallResult networkCallResult = (NetworkCallResult) obj;
            a aVar = this.f29304x;
            e eVar = this.f29306z;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                UploadResponse uploadResponse = (UploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                UploadResult uploadResultH = uploadResponse != null ? aVar.h(uploadResponse) : null;
                if (uploadResultH == null) {
                    n.Companion companion = n.INSTANCE;
                    eVar.k(n.a(n.b(o.a(new qq.c.C0592c()))));
                } else {
                    eVar.k(n.a(n.b(uploadResultH)));
                }
            }
            e eVar2 = this.f29306z;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                n.Companion companion2 = n.INSTANCE;
                eVar2.k(n.a(n.b(o.a(new InternalErrorException(networkErrorInfo)))));
            }
            return Unit.f21506a;
        }
    }

    public a(@NotNull l0 savedStateHandle, @NotNull UploadService uploadService, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(uploadService, "uploadService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.uploadService = uploadService;
        this.coroutineScope = coroutineScope;
        c0<HashMap<c, e>> c0VarE = savedStateHandle.e("com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UPLOAD_TASKS", g());
        this.uploadTasks = c0VarE;
        this.mutex = kv.g.b(false, 1, null);
        HashMap<c, e> value = c0VarE.getValue();
        c0VarE.setValue(g());
        k.d(coroutineScope, null, null, new C0567a(value, this, null), 3, null);
    }

    public final void f() {
        q0.f(this.coroutineScope, null, 1, null);
    }

    public final f g() {
        return new f();
    }

    public final UploadResult h(UploadResponse uploadResponse) {
        String fileName;
        Boolean fileEncrypted;
        Long fileByteSize;
        String fileKey = uploadResponse.getFileKey();
        if (fileKey != null && (fileName = uploadResponse.getFileName()) != null && (fileEncrypted = uploadResponse.getFileEncrypted()) != null) {
            boolean zBooleanValue = fileEncrypted.booleanValue();
            String fileContentType = uploadResponse.getFileContentType();
            if (fileContentType == null || (fileByteSize = uploadResponse.getFileByteSize()) == null) {
                return null;
            }
            return new UploadResult(fileKey, fileName, zBooleanValue, fileContentType, fileByteSize.longValue());
        }
        return null;
    }

    @Nullable
    public final Object i(@NotNull String str, @NotNull String str2, @NotNull eu.b<? super e> bVar) {
        return k(c.f(str), str2, true, bVar);
    }

    public final void j(@NotNull String absoluteFilePath, @NotNull String fileUploadUrl) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
        k.d(this.coroutineScope, null, null, new g(absoluteFilePath, fileUploadUrl, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object k(String str, String str2, boolean z10, eu.b<? super e> bVar) {
        h hVar;
        kv.a aVar;
        String str3;
        boolean z11;
        String str4;
        n<UploadResult> nVarI;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.A = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object obj = hVar.f29298y;
        Object objE = fu.c.e();
        int i11 = hVar.A;
        if (i11 == 0) {
            o.b(obj);
            aVar = this.mutex;
            hVar.f29293t = str;
            str3 = str2;
            hVar.f29294u = str3;
            hVar.f29295v = aVar;
            z11 = z10;
            hVar.f29296w = z11;
            hVar.f29297x = 0;
            hVar.A = 1;
            if (aVar.d(null, hVar) == objE) {
                return objE;
            }
            str4 = str;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = hVar.f29296w;
            aVar = (kv.a) hVar.f29295v;
            str3 = (String) hVar.f29294u;
            str4 = (String) hVar.f29293t;
            o.b(obj);
            z11 = z12;
        }
        kv.a aVar2 = aVar;
        String str5 = str3;
        try {
            e eVar = this.uploadTasks.getValue().get(c.a(str4));
            if (eVar != null && (!z11 || (nVarI = eVar.i()) == null || !n.g(nVarI.getValue()))) {
                return eVar;
            }
            e eVar2 = new e(str4, str5, null, 4, null);
            eVar2.j(k.d(this.coroutineScope, null, null, new i(str4, this, str5, eVar2, null), 3, null));
            this.uploadTasks.getValue().put(c.a(eVar2.getAbsoluteFilePath()), eVar2);
            return eVar2;
        } finally {
            aVar2.f(null);
        }
    }
}
