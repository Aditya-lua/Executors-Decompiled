package com.withpersona.sdk2.inquiry.selfie.directFileUploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0967l0;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059cq.C4197b;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u001a\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004#01(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R6\u0010*\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120&j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012`'0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "uploadService", "Lku/p0;", "coroutineScope", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V", "", "absoluteFilePath", "fileUploadUrl", "", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "f", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "i", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "", "allowRetry", "k", "(Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d", "g", "()Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "h", "(Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "a", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;", "b", "Lku/p0;", "Lnu/c0;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Lnu/c0;", "uploadTasks", "Luu/a;", "d", "Luu/a;", "mutex", "e", "FilePath", "UploadTask", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DirectFileUploader {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UploadService uploadService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<HashMap<FilePath, UploadTask>> uploadTasks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a mutex;

    @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "Landroid/os/Parcelable;", "", "filePath", "f", "(Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Ljava/lang/String;)I", "Landroid/os/Parcel;", "dest", "flags", "", "n", "(Ljava/lang/String;Landroid/os/Parcel;I)V", "k", "j", "", "other", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class FilePath implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FilePath> CREATOR = new C3943a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String filePath;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3943a implements Parcelable.Creator<FilePath> {
            /* JADX INFO: renamed from: a */
            public final String m20004a(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return FilePath.m19997f(parcel.readString());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FilePath[] newArray(int i10) {
                return new FilePath[i10];
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ FilePath createFromParcel(Parcel parcel) {
                return FilePath.m19996a(m20004a(parcel));
            }
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.FilePath.a(java.lang.String):com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath] */
        public /* synthetic */ FilePath(String str) {
            this.filePath = str;
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ FilePath m19996a(String str) {
            return new FilePath(str);
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public static String m19997f(@NotNull String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return filePath;
        }

        /* JADX INFO: renamed from: g */
        public static final int m19998g(String str) {
            return 0;
        }

        /* JADX INFO: renamed from: i */
        public static boolean m19999i(String str, Object obj) {
            return (obj instanceof FilePath) && Intrinsics.m31980c(str, ((FilePath) obj).getFilePath());
        }

        /* JADX INFO: renamed from: j */
        public static int m20000j(String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: k */
        public static String m20001k(String str) {
            return "FilePath(filePath=" + str + ")";
        }

        /* JADX INFO: renamed from: n */
        public static final void m20002n(String str, @NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return m19998g(this.filePath);
        }

        public boolean equals(Object obj) {
            return m19999i(this.filePath, obj);
        }

        public int hashCode() {
            return m20000j(this.filePath);
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final /* synthetic */ String getFilePath() {
            return this.filePath;
        }

        public String toString() {
            return m20001k(this.filePath);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int i10) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            m20002n(this.filePath, dest, i10);
        }
    }

    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010)\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "absoluteFilePath", "", "fileUploadUrl", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljt/n;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Lnt/b;)Ljava/lang/Object;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "g", "c", "Ljt/n;", "i", "()Ljt/n;", "k", "(Ljt/n;)V", "Lku/d2;", "d", "Lku/d2;", "getJob", "()Lku/d2;", "j", "(Lku/d2;)V", "getJob$annotations", "()V", "job", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class UploadTask implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UploadTask> CREATOR = new C3944a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String absoluteFilePath;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String fileUploadUrl;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public C7347n<UploadResult> result;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public InterfaceC7850d2 job;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3944a implements Parcelable.Creator<UploadTask> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadTask createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UploadTask(FilePath.CREATOR.createFromParcel(parcel).getFilePath(), parcel.readString(), (C7347n) parcel.readSerializable(), null);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UploadTask[] newArray(int i10) {
                return new UploadTask[i10];
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask$b */
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask", m39664f = "DirectFileUploader.kt", m39665l = {79}, m39666m = "await-IoAF18A")
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3945b extends AbstractC10342d {

            /* JADX INFO: renamed from: t */
            public /* synthetic */ Object f16531t;

            /* JADX INFO: renamed from: v */
            public int f16533v;

            public C3945b(InterfaceC9557b<? super C3945b> interfaceC9557b) {
                super(interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f16531t = obj;
                this.f16533v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                Object objM20006a = UploadTask.this.m20006a(this);
                return objM20006a == C10047c.m38805e() ? objM20006a : C7347n.m30459a(objM20006a);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 jt.n) A[MD:(java.lang.String, java.lang.String, jt.n<com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$c>):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask.<init>(java.lang.String, java.lang.String, jt.n):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ UploadTask(String str, String str2, C7347n c7347n, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, c7347n);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        /* JADX INFO: renamed from: a */
        public final Object m20006a(@NotNull InterfaceC9557b<? super C7347n<UploadResult>> interfaceC9557b) {
            C3945b c3945b;
            if (interfaceC9557b instanceof C3945b) {
                c3945b = (C3945b) interfaceC9557b;
                int i10 = c3945b.f16533v;
                if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                    c3945b.f16533v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    c3945b = new C3945b(interfaceC9557b);
                }
            } else {
                c3945b = new C3945b(interfaceC9557b);
            }
            Object obj = c3945b.f16531t;
            Object objM38805e = C10047c.m38805e();
            int i11 = c3945b.f16533v;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                InterfaceC7850d2 interfaceC7850d2 = this.job;
                if (interfaceC7850d2 != null) {
                    c3945b.f16533v = 1;
                    if (interfaceC7850d2.mo32596L(c3945b) == objM38805e) {
                        return objM38805e;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C7347n<UploadResult> c7347n = this.result;
            if (c7347n != null) {
                return c7347n.getValue();
            }
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new IllegalStateException("Result was null.")));
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
        /* JADX INFO: renamed from: i */
        public final C7347n<UploadResult> m20009i() {
            return this.result;
        }

        /* JADX INFO: renamed from: j */
        public final void m20010j(@Nullable InterfaceC7850d2 interfaceC7850d2) {
            this.job = interfaceC7850d2;
        }

        /* JADX INFO: renamed from: k */
        public final void m20011k(@Nullable C7347n<UploadResult> c7347n) {
            this.result = c7347n;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            FilePath.m20002n(this.absoluteFilePath, dest, flags);
            dest.writeString(this.fileUploadUrl);
            dest.writeSerializable(this.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public UploadTask(String absoluteFilePath, String fileUploadUrl, C7347n<UploadResult> c7347n) {
            Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
            Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
            this.absoluteFilePath = absoluteFilePath;
            this.fileUploadUrl = fileUploadUrl;
            this.result = c7347n;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 java.lang.String)
          (wrap jt.n:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null jt.n) : (r3v0 jt.n))
          (null kotlin.jvm.internal.DefaultConstructorMarker)
         A[MD:(java.lang.String, java.lang.String, jt.n, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:6) call: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask.<init>(java.lang.String, java.lang.String, jt.n, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ UploadTask(String str, String str2, C7347n c7347n, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? null : c7347n, null);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$1", m39664f = "DirectFileUploader.kt", m39665l = {119, 220}, m39666m = "invokeSuspend")
    public static final class C3946a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ DirectFileUploader f16534A;

        /* JADX INFO: renamed from: t */
        public Object f16535t;

        /* JADX INFO: renamed from: u */
        public Object f16536u;

        /* JADX INFO: renamed from: v */
        public Object f16537v;

        /* JADX INFO: renamed from: w */
        public Object f16538w;

        /* JADX INFO: renamed from: x */
        public int f16539x;

        /* JADX INFO: renamed from: y */
        public int f16540y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ HashMap<FilePath, UploadTask> f16541z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3946a(HashMap<FilePath, UploadTask> map, DirectFileUploader directFileUploader, InterfaceC9557b<? super C3946a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16541z = map;
            this.f16534A = directFileUploader;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3946a(this.f16541z, this.f16534A, interfaceC9557b);
        }

        /* JADX DEBUG: Duplicate block (B:19:0x007f) to fix multi-entry loop: BACK_EDGE: B:19:0x007f -> B:11:0x0046 */
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
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r9.f16540y
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L38
                if (r1 == r3) goto L2c
                if (r1 != r2) goto L24
                java.lang.Object r1 = r9.f16538w
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r1 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader) r1
                java.lang.Object r5 = r9.f16537v
                uu.a r5 = (p478uu.InterfaceC11970a) r5
                java.lang.Object r6 = r9.f16536u
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask r6 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask) r6
                java.lang.Object r7 = r9.f16535t
                java.util.Iterator r7 = (java.util.Iterator) r7
                p229jt.C7348o.m30470b(r10)
                goto L9d
            L24:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L2c:
                java.lang.Object r1 = r9.f16536u
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask r1 = (com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UploadTask) r1
                java.lang.Object r1 = r9.f16535t
                java.util.Iterator r1 = (java.util.Iterator) r1
                p229jt.C7348o.m30470b(r10)
                goto L7f
            L38:
                p229jt.C7348o.m30470b(r10)
                java.util.HashMap<com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath, com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$UploadTask> r10 = r9.f16541z
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
                jt.n r10 = r6.m20009i()
                r1 = 0
                if (r10 != 0) goto L81
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.f16534A
                java.lang.String r5 = r6.getAbsoluteFilePath()
                java.lang.String r8 = r6.getFileUploadUrl()
                r9.f16535t = r7
                java.lang.Object r6 = pt.C10350l.m39676a(r6)
                r9.f16536u = r6
                r9.f16537v = r4
                r9.f16538w = r4
                r9.f16540y = r3
                java.lang.Object r10 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.m19989e(r10, r5, r8, r1, r9)
                if (r10 != r0) goto L7e
                goto L9b
            L7e:
                r1 = r7
            L7f:
                r7 = r1
                goto L46
            L81:
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.f16534A
                uu.a r5 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.m19985a(r10)
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader r10 = r9.f16534A
                r9.f16535t = r7
                r9.f16536u = r6
                r9.f16537v = r5
                r9.f16538w = r10
                r9.f16539x = r1
                r9.f16540y = r2
                java.lang.Object r1 = r5.mo44674f(r4, r9)
                if (r1 != r0) goto L9c
            L9b:
                return r0
            L9c:
                r1 = r10
            L9d:
                nu.c0 r10 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.m19987c(r1)     // Catch: java.lang.Throwable -> Lb8
                java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> Lb8
                java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> Lb8
                java.lang.String r1 = r6.getAbsoluteFilePath()     // Catch: java.lang.Throwable -> Lb8
                com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$FilePath r1 = com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.FilePath.m19996a(r1)     // Catch: java.lang.Throwable -> Lb8
                r10.put(r1, r6)     // Catch: java.lang.Throwable -> Lb8
                kotlin.Unit r10 = kotlin.Unit.f29331a     // Catch: java.lang.Throwable -> Lb8
                r5.mo44673e(r4)
                goto L46
            Lb8:
                r10 = move-exception
                r5.mo44673e(r4)
                throw r10
            Lbd:
                kotlin.Unit r10 = kotlin.Unit.f29331a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.C3946a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3946a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$c, reason: from toString */
    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$c;", "Ljava/io/Serializable;", "", "fileKey", "fileName", "", "fileEncrypted", "fileContentType", "", "fileByteSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "getFileEncrypted", "()Z", "e", "J", "()J", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class UploadResult implements Serializable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fileKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fileName;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final boolean fileEncrypted;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fileContentType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
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
            return Intrinsics.m31980c(this.fileKey, uploadResult.fileKey) && Intrinsics.m31980c(this.fileName, uploadResult.fileName) && this.fileEncrypted == uploadResult.fileEncrypted && Intrinsics.m31980c(this.fileContentType, uploadResult.fileContentType) && this.fileByteSize == uploadResult.fileByteSize;
        }

        public int hashCode() {
            return (((((((this.fileKey.hashCode() * 31) + this.fileName.hashCode()) * 31) + Boolean.hashCode(this.fileEncrypted)) * 31) + this.fileContentType.hashCode()) * 31) + Long.hashCode(this.fileByteSize);
        }

        @NotNull
        public String toString() {
            return "UploadResult(fileKey=" + this.fileKey + ", fileName=" + this.fileName + ", fileEncrypted=" + this.fileEncrypted + ", fileContentType=" + this.fileContentType + ", fileByteSize=" + this.fileByteSize + ")";
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$d */
    @Metadata(m31664d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"com/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$d", "Ljava/util/LinkedHashMap;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3949d extends LinkedHashMap<FilePath, UploadTask> {
        /* JADX INFO: renamed from: a */
        public /* bridge */ boolean m20018a(String str) {
            return super.containsKey(FilePath.m19996a(str));
        }

        /* JADX INFO: renamed from: b */
        public /* bridge */ boolean m20019b(UploadTask uploadTask) {
            return super.containsValue(uploadTask);
        }

        /* JADX INFO: renamed from: c */
        public /* bridge */ UploadTask m20020c(String str) {
            return (UploadTask) super.get(FilePath.m19996a(str));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof FilePath) {
                return m20018a(((FilePath) obj).getFilePath());
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof UploadTask) {
                return m20019b((UploadTask) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public /* bridge */ Set<Map.Entry<FilePath, UploadTask>> m20021e() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<FilePath, UploadTask>> entrySet() {
            return m20021e();
        }

        /* JADX INFO: renamed from: f */
        public /* bridge */ Set<FilePath> m20022f() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof FilePath) {
                return m20020c(((FilePath) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof FilePath) ? obj2 : m20023i(((FilePath) obj).getFilePath(), (UploadTask) obj2);
        }

        /* JADX INFO: renamed from: i */
        public /* bridge */ UploadTask m20023i(String str, UploadTask uploadTask) {
            return (UploadTask) super.getOrDefault(FilePath.m19996a(str), uploadTask);
        }

        /* JADX INFO: renamed from: j */
        public /* bridge */ int m20024j() {
            return super.size();
        }

        /* JADX INFO: renamed from: k */
        public /* bridge */ Collection<UploadTask> m20025k() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<FilePath> keySet() {
            return m20022f();
        }

        /* JADX INFO: renamed from: n */
        public /* bridge */ boolean m20026n(String str, UploadTask uploadTask) {
            return super.remove(FilePath.m19996a(str), uploadTask);
        }

        /* JADX INFO: renamed from: o */
        public /* bridge */ UploadTask m20027o(String str) {
            return (UploadTask) super.remove(FilePath.m19996a(str));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof FilePath) {
                return m20027o(((FilePath) obj).getFilePath());
            }
            return null;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<FilePath, UploadTask> eldest) {
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return m20024j();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<UploadTask> values() {
            return m20025k();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof FilePath) && (obj2 instanceof UploadTask)) {
                return m20026n(((FilePath) obj).getFilePath(), (UploadTask) obj2);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageAsync$1", m39664f = "DirectFileUploader.kt", m39665l = {135}, m39666m = "invokeSuspend")
    public static final class C3950e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16547t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f16549v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f16550w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3950e(String str, String str2, InterfaceC9557b<? super C3950e> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16549v = str;
            this.f16550w = str2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return DirectFileUploader.this.new C3950e(this.f16549v, this.f16550w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16547t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                DirectFileUploader directFileUploader = DirectFileUploader.this;
                String strM19997f = FilePath.m19997f(this.f16549v);
                String str = this.f16550w;
                this.f16547t = 1;
                if (directFileUploader.m19995k(strM19997f, str, false, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3950e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$f */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader", m39664f = "DirectFileUploader.kt", m39665l = {220}, m39666m = "uploadImageInternal-XenoRnc")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3951f extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f16551A;

        /* JADX INFO: renamed from: t */
        public Object f16552t;

        /* JADX INFO: renamed from: u */
        public Object f16553u;

        /* JADX INFO: renamed from: v */
        public Object f16554v;

        /* JADX INFO: renamed from: w */
        public boolean f16555w;

        /* JADX INFO: renamed from: x */
        public int f16556x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f16557y;

        public C3951f(InterfaceC9557b<? super C3951f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f16557y = obj;
            this.f16551A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return DirectFileUploader.this.m19995k(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1", m39664f = "DirectFileUploader.kt", m39665l = {174}, m39666m = "invokeSuspend")
    public static final class C3952g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f16559t;

        /* JADX INFO: renamed from: u */
        public Object f16560u;

        /* JADX INFO: renamed from: v */
        public int f16561v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f16562w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ DirectFileUploader f16563x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f16564y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ UploadTask f16565z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$g$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Ljv/x;", "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "<anonymous>", "()Ljv/x;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1$1", m39664f = "DirectFileUploader.kt", m39665l = {176}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function1<InterfaceC9557b<? super C7396x<UploadResponse>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f16566t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ DirectFileUploader f16567u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f16568v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ File f16569w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ RequestBody f16570x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DirectFileUploader directFileUploader, String str, File file, RequestBody requestBody, InterfaceC9557b<? super a> interfaceC9557b) {
                super(1, interfaceC9557b);
                this.f16567u = directFileUploader;
                this.f16568v = str;
                this.f16569w = file;
                this.f16570x = requestBody;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f16567u, this.f16568v, this.f16569w, this.f16570x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f16566t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                UploadService uploadService = this.f16567u.uploadService;
                String str = this.f16568v;
                MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", this.f16569w.getName(), this.f16570x);
                this.f16566t = 1;
                Object objUpload = uploadService.upload(str, partCreateFormData, this);
                return objUpload == objM38805e ? objM38805e : objUpload;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9557b<? super C7396x<UploadResponse>> interfaceC9557b) {
                return ((a) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3952g(String str, DirectFileUploader directFileUploader, String str2, UploadTask uploadTask, InterfaceC9557b<? super C3952g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16562w = str;
            this.f16563x = directFileUploader;
            this.f16564y = str2;
            this.f16565z = uploadTask;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3952g(this.f16562w, this.f16563x, this.f16564y, this.f16565z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16561v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                File file = new File(this.f16562w);
                RequestBody requestBodyCreate = RequestBody.INSTANCE.create(file, MediaType.INSTANCE.parse("image/jpeg"));
                a aVar = new a(this.f16563x, this.f16564y, file, requestBodyCreate, null);
                this.f16559t = C10350l.m39676a(file);
                this.f16560u = C10350l.m39676a(requestBodyCreate);
                this.f16561v = 1;
                obj = NetworkUtilsKt.enqueueRetriableRequestWithRetry(aVar, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            NetworkCallResult networkCallResult = (NetworkCallResult) obj;
            DirectFileUploader directFileUploader = this.f16563x;
            UploadTask uploadTask = this.f16565z;
            if (networkCallResult instanceof NetworkCallResult.Success) {
                UploadResponse uploadResponse = (UploadResponse) ((NetworkCallResult.Success) networkCallResult).getResponse();
                UploadResult uploadResultM19992h = uploadResponse != null ? directFileUploader.m19992h(uploadResponse) : null;
                if (uploadResultM19992h == null) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    uploadTask.m20011k(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(new C4197b.c()))));
                } else {
                    uploadTask.m20011k(C7347n.m30459a(C7347n.m30460b(uploadResultM19992h)));
                }
            }
            UploadTask uploadTask2 = this.f16565z;
            if (networkCallResult instanceof NetworkCallResult.Failure) {
                InternalErrorInfo.NetworkErrorInfo networkErrorInfo = ((NetworkCallResult.Failure) networkCallResult).getNetworkErrorInfo();
                C7347n.Companion companion2 = C7347n.INSTANCE;
                uploadTask2.m20011k(C7347n.m30459a(C7347n.m30460b(C7348o.m30469a(new InternalErrorException(networkErrorInfo)))));
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3952g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public DirectFileUploader(@NotNull C0967l0 savedStateHandle, @NotNull UploadService uploadService, @NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(uploadService, "uploadService");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.uploadService = uploadService;
        this.coroutineScope = coroutineScope;
        InterfaceC9566c0<HashMap<FilePath, UploadTask>> interfaceC9566c0M4950e = savedStateHandle.m4950e("com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader.UPLOAD_TASKS", m19991g());
        this.uploadTasks = interfaceC9566c0M4950e;
        this.mutex = C11976g.m44697b(false, 1, null);
        HashMap<FilePath, UploadTask> value = interfaceC9566c0M4950e.getValue();
        interfaceC9566c0M4950e.setValue(m19991g());
        C7882k.m32780d(coroutineScope, null, null, new C3946a(value, this, null), 3, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m19990f() {
        C7910q0.m32890f(this.coroutineScope, null, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final C3949d m19991g() {
        return new C3949d();
    }

    /* JADX INFO: renamed from: h */
    public final UploadResult m19992h(UploadResponse uploadResponse) {
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
    /* JADX INFO: renamed from: i */
    public final Object m19993i(@NotNull String str, @NotNull String str2, @NotNull InterfaceC9557b<? super UploadTask> interfaceC9557b) {
        return m19995k(FilePath.m19997f(str), str2, true, interfaceC9557b);
    }

    /* JADX INFO: renamed from: j */
    public final void m19994j(@NotNull String absoluteFilePath, @NotNull String fileUploadUrl) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(fileUploadUrl, "fileUploadUrl");
        C7882k.m32780d(this.coroutineScope, null, null, new C3950e(absoluteFilePath, fileUploadUrl, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: k */
    public final Object m19995k(String str, String str2, boolean z10, InterfaceC9557b<? super UploadTask> interfaceC9557b) {
        C3951f c3951f;
        InterfaceC11970a interfaceC11970a;
        String str3;
        boolean z11;
        String str4;
        C7347n<UploadResult> c7347nM20009i;
        if (interfaceC9557b instanceof C3951f) {
            c3951f = (C3951f) interfaceC9557b;
            int i10 = c3951f.f16551A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3951f.f16551A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3951f = new C3951f(interfaceC9557b);
            }
        } else {
            c3951f = new C3951f(interfaceC9557b);
        }
        Object obj = c3951f.f16557y;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3951f.f16551A;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            interfaceC11970a = this.mutex;
            c3951f.f16552t = str;
            str3 = str2;
            c3951f.f16553u = str3;
            c3951f.f16554v = interfaceC11970a;
            z11 = z10;
            c3951f.f16555w = z11;
            c3951f.f16556x = 0;
            c3951f.f16551A = 1;
            if (interfaceC11970a.mo44674f(null, c3951f) == objM38805e) {
                return objM38805e;
            }
            str4 = str;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = c3951f.f16555w;
            interfaceC11970a = (InterfaceC11970a) c3951f.f16554v;
            str3 = (String) c3951f.f16553u;
            str4 = (String) c3951f.f16552t;
            C7348o.m30470b(obj);
            z11 = z12;
        }
        InterfaceC11970a interfaceC11970a2 = interfaceC11970a;
        String str5 = str3;
        try {
            UploadTask uploadTask = this.uploadTasks.getValue().get(FilePath.m19996a(str4));
            if (uploadTask != null && (!z11 || (c7347nM20009i = uploadTask.m20009i()) == null || !C7347n.m30465g(c7347nM20009i.getValue()))) {
                return uploadTask;
            }
            UploadTask uploadTask2 = new UploadTask(str4, str5, null, 4, null);
            uploadTask2.m20010j(C7882k.m32780d(this.coroutineScope, null, null, new C3952g(str4, this, str5, uploadTask2, null), 3, null));
            this.uploadTasks.getValue().put(FilePath.m19996a(uploadTask2.getAbsoluteFilePath()), uploadTask2);
            return uploadTask2;
        } finally {
            interfaceC11970a2.mo44673e(null);
        }
    }
}
