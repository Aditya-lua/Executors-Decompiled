package np;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import av.g1;
import av.n2;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0016\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Lnp/q0;", BuildConfig.FLAVOR, "Landroid/content/Context;", "applicationContext", "Lav/p0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lav/p0;)V", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "stepName", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", BuildConfig.FLAVOR, "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "c", "(Leu/b;)Ljava/lang/Object;", "a", "Lav/p0;", "Ljava/io/File;", "b", "Ljava/io/File;", "configFile", "Lnp/q0$b;", "Lnp/q0$b;", "savedData", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File configFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b savedData;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lnp/q0$b;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionToken", "inquiryId", "stepName", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "uiComponentConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "A", "()Ljava/lang/String;", "b", "c", "f", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<UiComponentConfig> uiComponentConfig;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
                }
                return new b(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull List<? extends UiComponentConfig> uiComponentConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(uiComponentConfig, "uiComponentConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.stepName = stepName;
            this.uiComponentConfig = uiComponentConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        @NotNull
        public final List<UiComponentConfig> g() {
            return this.uiComponentConfig;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.uiComponentConfig;
            dest.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26394t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q0.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f26394t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            q0.this.configFile.delete();
            q0.this.savedData = null;
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<anonymous>", "(Lav/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {129, 162}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super List<? extends UiComponentConfig>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26396t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26397u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f26398v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f26400x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f26401y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f26402z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26403t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q0 f26404u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ b f26405v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q0 q0Var, b bVar, eu.b<? super a> bVar2) {
                super(2, bVar2);
                this.f26404u = q0Var;
                this.f26405v = bVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f26404u, this.f26405v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f26403t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                this.f26404u.savedData = this.f26405v;
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26406t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q0 f26407u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Parcel f26408v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(q0 q0Var, Parcel parcel, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f26407u = q0Var;
                this.f26408v = parcel;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f26407u, this.f26408v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f26406t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                FileInputStream fileInputStream = new FileInputStream(this.f26407u.configFile);
                Parcel parcel = this.f26408v;
                try {
                    byte[] bArrC = lu.b.c(fileInputStream);
                    parcel.unmarshall(bArrC, 0, bArrC.length);
                    Unit unit = Unit.f21506a;
                    lu.c.a(fileInputStream, null);
                    return Unit.f21506a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f26400x = str;
            this.f26401y = str2;
            this.f26402z = str3;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q0.this.new d(this.f26400x, this.f26401y, this.f26402z, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super List<? extends UiComponentConfig>> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
        
            if (av.i.g(r9, r4, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object obj2;
            Object objE = fu.c.e();
            Parcel parcel = this.f26398v;
            try {
                try {
                    if (parcel != 0) {
                        if (parcel == 1) {
                            Parcel parcel2 = (Parcel) this.f26396t;
                            zt.o.b(obj);
                            parcel = parcel2;
                        } else {
                            if (parcel != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar = (b) this.f26397u;
                            zt.o.b(obj);
                        }
                        return bVar.g();
                    }
                    zt.o.b(obj);
                    if (!q0.this.configFile.exists()) {
                        return null;
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    av.l0 l0VarB = g1.b();
                    b bVar2 = new b(q0.this, parcelObtain, null);
                    this.f26396t = parcelObtain;
                    this.f26398v = 1;
                    parcel = parcelObtain;
                    if (av.i.g(l0VarB, bVar2, this) == objE) {
                    }
                    return objE;
                    parcel.setDataPosition(0);
                    Bundle bundle = parcel.readBundle(b.class.getClassLoader());
                    b bVar3 = bundle != null ? (b) u2.c.a(bundle, "data", b.class) : null;
                    parcel.recycle();
                    bVar = bVar3;
                    obj2 = parcel;
                } catch (Exception unused) {
                    parcel.recycle();
                    bVar = null;
                    obj2 = parcel;
                } catch (Throwable th2) {
                    parcel.recycle();
                    throw th2;
                }
                if (bVar != null && Intrinsics.c(bVar.getSessionToken(), this.f26400x) && Intrinsics.c(bVar.getInquiryId(), this.f26401y) && Intrinsics.c(bVar.getStepName(), this.f26402z)) {
                    n2 n2VarC = g1.c();
                    a aVar = new a(q0.this, bVar, null);
                    this.f26396t = gu.l.a(obj2);
                    this.f26397u = bVar;
                    this.f26398v = 2;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {96}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26409t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f26410u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ b f26412w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f26413t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ q0 f26414u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Bundle f26415v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q0 q0Var, Bundle bundle, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f26414u = q0Var;
                this.f26415v = bundle;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f26414u, this.f26415v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f26413t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f26414u.configFile);
                Bundle bundle = this.f26415v;
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    parcelObtain.writeBundle(bundle);
                    fileOutputStream.write(parcelObtain.marshall());
                    parcelObtain.recycle();
                    Unit unit = Unit.f21506a;
                    lu.c.a(fileOutputStream, null);
                    return Unit.f21506a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, eu.b<? super e> bVar2) {
            super(2, bVar2);
            this.f26412w = bVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return q0.this.new e(this.f26412w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f26410u;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    File parentFile = q0.this.configFile.getParentFile();
                    if (parentFile != null) {
                        gu.b.a(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", this.f26412w);
                    av.l0 l0VarB = g1.b();
                    a aVar = new a(q0.this, bundle, null);
                    this.f26409t = gu.l.a(bundle);
                    this.f26410u = 1;
                    if (av.i.g(l0VarB, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.f21506a;
        }
    }

    public q0(@NotNull Context applicationContext, @NotNull av.p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    @Nullable
    public final Object c(@NotNull eu.b<? super Unit> bVar) {
        Object objG = av.i.g(g1.c(), new c(null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull eu.b<? super List<? extends UiComponentConfig>> bVar) {
        return av.i.g(g1.a(), new d(str, str2, str3, null), bVar);
    }

    public final void e(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> componentConfigs) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        if (!Intrinsics.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalArgumentException("saveComponentConfigs must be called on the main thread.");
        }
        if (componentConfigs == null) {
            return;
        }
        b bVar = this.savedData;
        if (Intrinsics.c(bVar != null ? bVar.getSessionToken() : null, sessionToken)) {
            b bVar2 = this.savedData;
            if (Intrinsics.c(bVar2 != null ? bVar2.getInquiryId() : null, inquiryId)) {
                b bVar3 = this.savedData;
                if (Intrinsics.c(bVar3 != null ? bVar3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        b bVar4 = new b(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = bVar4;
        av.k.d(this.coroutineScope, null, null, new e(bVar4, null), 3, null);
    }
}
