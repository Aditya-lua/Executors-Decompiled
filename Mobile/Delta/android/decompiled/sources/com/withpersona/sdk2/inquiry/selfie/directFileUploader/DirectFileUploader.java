package com.withpersona.sdk2.inquiry.selfie.directFileUploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.NetworkCallResult;
import com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt;
import com.withpersona.sdk2.inquiry.network.upload.UploadResponse;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jt.n;
import jt.o;
import jv.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.d2;
import ku.k;
import ku.p0;
import ku.q0;
import nt.b;
import nu.c0;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.l;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001a\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004#01(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010*\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120&j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012`'0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "uploadService", "Lku/p0;", "coroutineScope", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V", "", "absoluteFilePath", "fileUploadUrl", "", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "f", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "i", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "", "allowRetry", "k", "(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d", "g", "()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "h", "(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "a", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "b", "Lku/p0;", "Lnu/c0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Lnu/c0;", "uploadTasks", "Luu/a;", "d", "Luu/a;", "mutex", "e", "FilePath", "UploadTask", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DirectFileUploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final UploadService uploadService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<HashMap<FilePath, UploadTask>> uploadTasks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a mutex;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "Landroid/os/Parcelable;", "", "filePath", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)I", "Landroid/os/Parcel;", "dest", "flags", "", "n", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "k", "j", "", "other", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FilePath implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FilePath> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String filePath;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FilePath> {
            public final String a(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return FilePath.f(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FilePath[] newArray(int i10) {
                return new FilePath[i10];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ FilePath createFromParcel(Parcel parcel) {
                return FilePath.a(a(parcel));
            }
        }

        public /* synthetic */ FilePath(String str) {
            this.filePath = str;
        }

        public static final /* synthetic */ FilePath a(String str) {
            return new FilePath(str);
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
            return (obj instanceof FilePath) && Intrinsics.c(str, ((FilePath) obj).getFilePath());
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

        /* JADX INFO: renamed from: m, reason: from getter */
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

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "absoluteFilePath", "", "fileUploadUrl", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljt/n;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lnt/b;)Ljava/lang/Object;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "g", "c", "Ljt/n;", "i", "()Ljt/n;", "k", "(Ljt/n;)V", "Lku/d2;", "d", "Lku/d2;", "getJob", "()Lku/d2;", "j", "(Lku/d2;)V", "getJob$annotations", "()V", "job", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UploadTask implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UploadTask> CREATOR = new a();

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

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UploadTask> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadTask createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UploadTask(FilePath.CREATOR.createFromParcel(parcel).getFilePath(), parcel.readString(), (n) parcel.readSerializable(), null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UploadTask[] newArray(int i10) {
                return new UploadTask[i10];
            }
        }

        @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask", f = "DirectFileUploader.kt", l = {79}, m = "await-IoAF18A")
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class b extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12893t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12895v;

            public b(nt.b<? super b> bVar) {
                super(bVar);
            }

            @Override // pt.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f12893t = obj;
                this.f12895v |= Integer.MIN_VALUE;
                Object objA = UploadTask.this.a(this);
                return objA == c.e() ? objA : n.a(objA);
            }
        }

        public /* synthetic */ UploadTask(String str, String str2, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, nVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object a(@NotNull nt.b<? super n<UploadResult>> bVar) {
            b bVar2;
            if (bVar instanceof b) {
                bVar2 = (b) bVar;
                int i10 = bVar2.f12895v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    bVar2.f12895v = i10 - Integer.MIN_VALUE;
                } else {
                    bVar2 = new b(bVar);
                }
            } else {
                bVar2 = new b(bVar);
            }
            Object obj = bVar2.f12893t;
            Object objE = c.e();
            int i11 = bVar2.f12895v;
            if (i11 == 0) {
                o.b(obj);
                d2 d2Var = this.job;
                if (d2Var != null) {
                    bVar2.f12895v = 1;
                    if (d2Var.L(bVar2) == objE) {
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
            FilePath.n(this.absoluteFilePath, dest, flags);
            dest.writeString(this.fileUploadUrl);
            dest.writeSerializable(this.result);
        }

        public UploadTask(String absoluteFilePath, String fileUploadUrl, n<UploadResult> nVar) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
            this.absoluteFilePath = absoluteFilePath;
            this.fileUploadUrl = fileUploadUrl;
            this.result = nVar;
        }

        public /* synthetic */ UploadTask(String str, String str2, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : nVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$1", f = "DirectFileUploader.kt", l = {119, 220}, m = "invokeSuspend")
    public static final class a extends m implements Function2<p0, b<? super Unit>, Object> {
        public final /* synthetic */ DirectFileUploader A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12896t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12897u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12898v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12899w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12900x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f12901y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ HashMap<FilePath, UploadTask> f12902z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap<FilePath, UploadTask> map, DirectFileUploader directFileUploader, b<? super a> bVar) {
            super(2, bVar);
            this.f12902z = map;
            this.A = directFileUploader;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new a(this.f12902z, this.A, bVar);
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r9.f12901y
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r9.f12899w
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r1 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader) r1
                java.lang.Object r5 = r9.f12898v
                uu.a r5 = (uu.a) r5
                java.lang.Object r6 = r9.f12897u
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask r6 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask) r6
                java.lang.Object r7 = r9.f12896t
                java.util.Iterator r7 = (java.util.Iterator) r7
                jt.o.b(r10)
                goto L9d
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                java.lang.Object r1 = r9.f12897u
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask r1 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask) r1
                java.lang.Object r1 = r9.f12896t
                java.util.Iterator r1 = (java.util.Iterator) r1
                jt.o.b(r10)
                goto L7f
            L38:
                jt.o.b(r10)
                java.util.HashMap<com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath, com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask> r10 = r9.f12902z
                java.util.Collection r10 = r10.values()
                java.util.Iterator r10 = r10.iterator()
                r7 = r10
            L46:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto Lbd
                java.lang.Object r10 = r7.next()
                java.lang.String r1 = "next(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r1)
                r6 = r10
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask r6 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask) r6
                jt.n r10 = r6.i()
                r1 = 0
                if (r10 != 0) goto L81
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.A
                java.lang.String r5 = r6.getAbsoluteFilePath()
                java.lang.String r8 = r6.getFileUploadUrl()
                r9.f12896t = r7
                java.lang.Object r6 = pt.l.a(r6)
                r9.f12897u = r6
                r9.f12898v = r4
                r9.f12899w = r4
                r9.f12901y = r3
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.e(r10, r5, r8, r1, r9)
                if (r10 != r0) goto L7e
                goto L9b
            L7e:
                r1 = r7
            L7f:
                r7 = r1
                goto L46
            L81:
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.A
                uu.a r5 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.a(r10)
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.A
                r9.f12896t = r7
                r9.f12897u = r6
                r9.f12898v = r5
                r9.f12899w = r10
                r9.f12900x = r1
                r9.f12901y = r2
                java.lang.Object r1 = r5.f(r4, r9)
                if (r1 != r0) goto L9c
            L9b:
                return r0
            L9c:
                r1 = r10
            L9d:
                nu.c0 r10 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.c(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> Lb8
                java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = r6.getAbsoluteFilePath()     // Catch: java.lang.Throwable -> Lb8
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath r1 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.FilePath.a(r1)     // Catch: java.lang.Throwable -> Lb8
                r10.put(r1, r6)     // Catch: java.lang.Throwable -> Lb8
                kotlin.Unit r10 = kotlin.Unit.f22483a     // Catch: java.lang.Throwable -> Lb8
                r5.e(r4)
                goto L46
            Lb8:
                r10 = move-exception
                r5.e(r4)
                throw r10
            Lbd:
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$c, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "Ljava/io/Serializable;", "", "fileKey", "fileName", "", "fileEncrypted", "fileContentType", "", "fileByteSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "getFileEncrypted", "()Z", "e", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d", "Ljava/util/LinkedHashMap;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends LinkedHashMap<FilePath, UploadTask> {
        public /* bridge */ boolean a(String str) {
            return super.containsKey(FilePath.a(str));
        }

        public /* bridge */ boolean b(UploadTask uploadTask) {
            return super.containsValue(uploadTask);
        }

        public /* bridge */ UploadTask c(String str) {
            return (UploadTask) super.get(FilePath.a(str));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof FilePath) {
                return a(((FilePath) obj).getFilePath());
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof UploadTask) {
                return b((UploadTask) obj);
            }
            return false;
        }

        public /* bridge */ Set<Map.Entry<FilePath, UploadTask>> e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<FilePath, UploadTask>> entrySet() {
            return e();
        }

        public /* bridge */ Set<FilePath> f() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof FilePath) {
                return c(((FilePath) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof FilePath) ? obj2 : i(((FilePath) obj).getFilePath(), (UploadTask) obj2);
        }

        public /* bridge */ UploadTask i(String str, UploadTask uploadTask) {
            return (UploadTask) super.getOrDefault(FilePath.a(str), uploadTask);
        }

        public /* bridge */ int j() {
            return super.size();
        }

        public /* bridge */ Collection<UploadTask> k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<FilePath> keySet() {
            return f();
        }

        public /* bridge */ boolean n(String str, UploadTask uploadTask) {
            return super.remove(FilePath.a(str), uploadTask);
        }

        public /* bridge */ UploadTask o(String str) {
            return (UploadTask) super.remove(FilePath.a(str));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof FilePath) {
                return o(((FilePath) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<FilePath, UploadTask> eldest) {
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<UploadTask> values() {
            return k();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof FilePath) && (obj2 instanceof UploadTask)) {
                return n(((FilePath) obj).getFilePath(), (UploadTask) obj2);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageAsync$1", f = "DirectFileUploader.kt", l = {135}, m = "invokeSuspend")
    public static final class e extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12907t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f12909v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f12910w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, b<? super e> bVar) {
            super(2, bVar);
            this.f12909v = str;
            this.f12910w = str2;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return DirectFileUploader.this.new e(this.f12909v, this.f12910w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f12907t;
            if (i10 == 0) {
                o.b(obj);
                DirectFileUploader directFileUploader = DirectFileUploader.this;
                String strF = FilePath.f(this.f12909v);
                String str = this.f12910w;
                this.f12907t = 1;
                if (directFileUploader.k(strF, str, false, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader", f = "DirectFileUploader.kt", l = {220}, m = "uploadImageInternal-XenoRnc")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12911t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12912u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12913v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f12914w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f12915x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f12916y;

        public f(b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12916y = obj;
            this.A |= Integer.MIN_VALUE;
            return DirectFileUploader.this.k(null, null, false, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1", f = "DirectFileUploader.kt", l = {174}, m = "invokeSuspend")
    public static final class g extends m implements Function2<p0, b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12918t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12919u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f12920v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f12921w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ DirectFileUploader f12922x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f12923y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ UploadTask f12924z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "<anonymous>", "()Ljv/x;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1$1", f = "DirectFileUploader.kt", l = {176}, m = "invokeSuspend")
        public static final class a extends m implements Function1<b<? super x<UploadResponse>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f12925t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ DirectFileUploader f12926u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f12927v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ File f12928w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ RequestBody f12929x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DirectFileUploader directFileUploader, String str, File file, RequestBody requestBody, b<? super a> bVar) {
                super(1, bVar);
                this.f12926u = directFileUploader;
                this.f12927v = str;
                this.f12928w = file;
                this.f12929x = requestBody;
            }

            @Override // pt.a
            public final b<Unit> create(b<?> bVar) {
                return new a(this.f12926u, this.f12927v, this.f12928w, this.f12929x, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = c.e();
                int i10 = this.f12925t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                    return obj;
                }
                o.b(obj);
                UploadService uploadService = this.f12926u.uploadService;
                String str = this.f12927v;
                MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", this.f12928w.getName(), this.f12929x);
                this.f12925t = 1;
                Object objUpload = uploadService.upload(str, partCreateFormData, this);
                return objUpload == objE ? objE : objUpload;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(b<? super x<UploadResponse>> bVar) {
                return ((a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, DirectFileUploader directFileUploader, String str2, UploadTask uploadTask, b<? super g> bVar) {
            super(2, bVar);
            this.f12921w = str;
            this.f12922x = directFileUploader;
            this.f12923y = str2;
            this.f12924z = uploadTask;
        }

        @Override // pt.a
        public final b<Unit> create(Object obj, b<?> bVar) {
            return new g(this.f12921w, this.f12922x, this.f12923y, this.f12924z, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = c.e();
            int i10 = this.f12920v;
            if (i10 == 0) {
                o.b(obj);
                File file = new File(this.f12921w);
                RequestBody requestBodyCreate = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/jpeg"));
                a aVar = new a(this.f12922x, this.f12923y, file, requestBodyCreate, null);
                this.f12918t = l.a(file);
                this.f12919u = l.a(requestBodyCreate);
                this.f12920v = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
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
            DirectFileUploader directFileUploader = this.f12922x;
            UploadTask uploadTask = this.f12924z;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                UploadResponse uploadResponse = (UploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                UploadResult uploadResultH = uploadResponse != null ? directFileUploader.h(uploadResponse) : null;
                if (uploadResultH == null) {
                    n.Companion companion = n.INSTANCE;
                    uploadTask.k(n.a(n.b(o.a(new cq.b.c()))));
                } else {
                    uploadTask.k(n.a(n.b(uploadResultH)));
                }
            }
            UploadTask uploadTask2 = this.f12924z;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                n.Companion companion2 = n.INSTANCE;
                uploadTask2.k(n.a(n.b(o.a(new InternalErrorException(networkErrorInfo)))));
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public DirectFileUploader(@NotNull l0 savedStateHandle, @NotNull UploadService uploadService, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(uploadService, "uploadService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.uploadService = uploadService;
        this.coroutineScope = coroutineScope;
        c0<HashMap<FilePath, UploadTask>> c0VarE = savedStateHandle.e("com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UPLOAD_TASKS", g());
        this.uploadTasks = c0VarE;
        this.mutex = uu.g.b(false, 1, null);
        HashMap<FilePath, UploadTask> value = c0VarE.getValue();
        c0VarE.setValue(g());
        k.d(coroutineScope, null, null, new a(value, this, null), 3, null);
    }

    public final void f() {
        q0.f(this.coroutineScope, null, 1, null);
    }

    public final d g() {
        return new d();
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
    public final Object i(@NotNull String str, @NotNull String str2, @NotNull b<? super UploadTask> bVar) {
        return k(FilePath.f(str), str2, true, bVar);
    }

    public final void j(@NotNull String absoluteFilePath, @NotNull String fileUploadUrl) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
        k.d(this.coroutineScope, null, null, new e(absoluteFilePath, fileUploadUrl, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object k(String str, String str2, boolean z10, b<? super UploadTask> bVar) {
        f fVar;
        uu.a aVar;
        String str3;
        boolean z11;
        String str4;
        n<UploadResult> nVarI;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.A = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f12916y;
        Object objE = c.e();
        int i11 = fVar.A;
        if (i11 == 0) {
            o.b(obj);
            aVar = this.mutex;
            fVar.f12911t = str;
            str3 = str2;
            fVar.f12912u = str3;
            fVar.f12913v = aVar;
            z11 = z10;
            fVar.f12914w = z11;
            fVar.f12915x = 0;
            fVar.A = 1;
            if (aVar.f(null, fVar) == objE) {
                return objE;
            }
            str4 = str;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = fVar.f12914w;
            aVar = (uu.a) fVar.f12913v;
            str3 = (String) fVar.f12912u;
            str4 = (String) fVar.f12911t;
            o.b(obj);
            z11 = z12;
        }
        uu.a aVar2 = aVar;
        String str5 = str3;
        try {
            UploadTask uploadTask = this.uploadTasks.getValue().get(FilePath.a(str4));
            if (uploadTask != null && (!z11 || (nVarI = uploadTask.i()) == null || !n.g(nVarI.getValue()))) {
                return uploadTask;
            }
            UploadTask uploadTask2 = new UploadTask(str4, str5, null, 4, null);
            uploadTask2.j(k.d(this.coroutineScope, null, null, new g(str4, this, str5, uploadTask2, null), 3, null));
            this.uploadTasks.getValue().put(FilePath.a(uploadTask2.getAbsoluteFilePath()), uploadTask2);
            return uploadTask2;
        } finally {
            aVar2.e(null);
        }
    }
}
