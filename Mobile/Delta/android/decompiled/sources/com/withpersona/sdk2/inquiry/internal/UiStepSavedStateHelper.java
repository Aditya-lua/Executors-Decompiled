package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0016\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "", "Landroid/content/Context;", "applicationContext", "Lku/p0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lku/p0;)V", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "c", "(Lnt/b;)Ljava/lang/Object;", "a", "Lku/p0;", "Ljava/io/File;", "b", "Ljava/io/File;", "configFile", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "savedData", "UiStepUiComponentConfig", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UiStepSavedStateHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File configFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiStepUiComponentConfig savedData;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "uiComponentConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "c", "f", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UiStepUiComponentConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepUiComponentConfig> CREATOR = new a();

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
        public static final class a implements Parcelable.Creator<UiStepUiComponentConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepUiComponentConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(UiStepUiComponentConfig.class.getClassLoader()));
                }
                return new UiStepUiComponentConfig(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepUiComponentConfig[] newArray(int i10) {
                return new UiStepUiComponentConfig[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiStepUiComponentConfig(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull List<? extends UiComponentConfig> uiComponentConfig) {
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

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11420t;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f11420t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            UiStepSavedStateHelper.this.configFile.delete();
            UiStepSavedStateHelper.this.savedData = null;
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {129, 162}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<p0, nt.b<? super List<? extends UiComponentConfig>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11422t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f11423u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f11424v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f11426x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f11427y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f11428z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11429t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11430u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ UiStepUiComponentConfig f11431v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, UiStepUiComponentConfig uiStepUiComponentConfig, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f11430u = uiStepSavedStateHelper;
                this.f11431v = uiStepUiComponentConfig;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f11430u, this.f11431v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f11429t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                this.f11430u.savedData = this.f11431v;
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11432t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11433u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Parcel f11434v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UiStepSavedStateHelper uiStepSavedStateHelper, Parcel parcel, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f11433u = uiStepSavedStateHelper;
                this.f11434v = parcel;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f11433u, this.f11434v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f11432t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                FileInputStream fileInputStream = new FileInputStream(this.f11433u.configFile);
                Parcel parcel = this.f11434v;
                try {
                    byte[] bArrC = ut.b.c(fileInputStream);
                    parcel.unmarshall(bArrC, 0, bArrC.length);
                    Unit unit = Unit.f22483a;
                    ut.c.a(fileInputStream, null);
                    return Unit.f22483a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f11426x = str;
            this.f11427y = str2;
            this.f11428z = str3;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new c(this.f11426x, this.f11427y, this.f11428z, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
        
            if (ku.i.g(r9, r4, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super List<? extends UiComponentConfig>> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", f = "UiStepSavedStateHelper.kt", l = {96}, m = "invokeSuspend")
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f11435t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f11436u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ UiStepUiComponentConfig f11438w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f11439t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ UiStepSavedStateHelper f11440u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Bundle f11441v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, Bundle bundle, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f11440u = uiStepSavedStateHelper;
                this.f11441v = bundle;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f11440u, this.f11441v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f11439t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f11440u.configFile);
                Bundle bundle = this.f11441v;
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    parcelObtain.writeBundle(bundle);
                    fileOutputStream.write(parcelObtain.marshall());
                    parcelObtain.recycle();
                    Unit unit = Unit.f22483a;
                    ut.c.a(fileOutputStream, null);
                    return Unit.f22483a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(UiStepUiComponentConfig uiStepUiComponentConfig, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f11438w = uiStepUiComponentConfig;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return UiStepSavedStateHelper.this.new d(this.f11438w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11436u;
            try {
                if (i10 == 0) {
                    jt.o.b(obj);
                    File parentFile = UiStepSavedStateHelper.this.configFile.getParentFile();
                    if (parentFile != null) {
                        pt.b.a(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", this.f11438w);
                    l0 l0VarB = g1.b();
                    a aVar = new a(UiStepSavedStateHelper.this, bundle, null);
                    this.f11435t = pt.l.a(bundle);
                    this.f11436u = 1;
                    if (ku.i.g(l0VarB, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public UiStepSavedStateHelper(@NotNull Context applicationContext, @NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    @Nullable
    public final Object c(@NotNull nt.b<? super Unit> bVar) {
        Object objG = ku.i.g(g1.c(), new b(null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    @Nullable
    public final Object d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull nt.b<? super List<? extends UiComponentConfig>> bVar) {
        return ku.i.g(g1.a(), new c(str, str2, str3, null), bVar);
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
        UiStepUiComponentConfig uiStepUiComponentConfig = this.savedData;
        if (Intrinsics.c(uiStepUiComponentConfig != null ? uiStepUiComponentConfig.getSessionToken() : null, sessionToken)) {
            UiStepUiComponentConfig uiStepUiComponentConfig2 = this.savedData;
            if (Intrinsics.c(uiStepUiComponentConfig2 != null ? uiStepUiComponentConfig2.getInquiryId() : null, inquiryId)) {
                UiStepUiComponentConfig uiStepUiComponentConfig3 = this.savedData;
                if (Intrinsics.c(uiStepUiComponentConfig3 != null ? uiStepUiComponentConfig3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        UiStepUiComponentConfig uiStepUiComponentConfig4 = new UiStepUiComponentConfig(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = uiStepUiComponentConfig4;
        ku.k.d(this.coroutineScope, null, null, new d(uiStepUiComponentConfig4, null), 3, null);
    }
}
