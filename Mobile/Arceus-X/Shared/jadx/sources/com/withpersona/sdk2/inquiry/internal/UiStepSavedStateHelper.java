package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p456u2.C11774c;
import p477ut.C11957b;
import p477ut.C11958c;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0016\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001d¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "", "Landroid/content/Context;", "applicationContext", "Lku/p0;", "coroutineScope", "<init>", "(Landroid/content/Context;Lku/p0;)V", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "c", "(Lnt/b;)Ljava/lang/Object;", "a", "Lku/p0;", "Ljava/io/File;", "b", "Ljava/io/File;", "configFile", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "savedData", "UiStepUiComponentConfig", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class UiStepSavedStateHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File configFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public UiStepUiComponentConfig savedData;

    @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "uiComponentConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "c", "f", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class UiStepUiComponentConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepUiComponentConfig> CREATOR = new C3667a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final String stepName;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<UiComponentConfig> uiComponentConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$UiStepUiComponentConfig$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3667a implements Parcelable.Creator<UiStepUiComponentConfig> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
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

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepUiComponentConfig[] newArray(int i10) {
                return new UiStepUiComponentConfig[i10];
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
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
        /* JADX INFO: renamed from: g */
        public final List<UiComponentConfig> m18333g() {
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", m39664f = "UiStepSavedStateHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3669b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f14704t;

        public C3669b(InterfaceC9557b<? super C3669b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return UiStepSavedStateHelper.this.new C3669b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f14704t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            UiStepSavedStateHelper.this.configFile.delete();
            UiStepSavedStateHelper.this.savedData = null;
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3669b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", m39664f = "UiStepSavedStateHelper.kt", m39665l = {129, 162}, m39666m = "invokeSuspend")
    public static final class C3670c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super List<? extends UiComponentConfig>>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f14706t;

        /* JADX INFO: renamed from: u */
        public Object f14707u;

        /* JADX INFO: renamed from: v */
        public int f14708v;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f14710x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f14711y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f14712z;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", m39664f = "UiStepSavedStateHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f14713t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ UiStepSavedStateHelper f14714u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ UiStepUiComponentConfig f14715v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, UiStepUiComponentConfig uiStepUiComponentConfig, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f14714u = uiStepSavedStateHelper;
                this.f14715v = uiStepUiComponentConfig;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f14714u, this.f14715v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f14713t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                this.f14714u.savedData = this.f14715v;
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$c$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1", m39664f = "UiStepSavedStateHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f14716t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ UiStepSavedStateHelper f14717u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Parcel f14718v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(UiStepSavedStateHelper uiStepSavedStateHelper, Parcel parcel, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f14717u = uiStepSavedStateHelper;
                this.f14718v = parcel;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f14717u, this.f14718v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f14716t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                FileInputStream fileInputStream = new FileInputStream(this.f14717u.configFile);
                Parcel parcel = this.f14718v;
                try {
                    byte[] bArrM44628c = C11957b.m44628c(fileInputStream);
                    parcel.unmarshall(bArrM44628c, 0, bArrM44628c.length);
                    Unit unit = Unit.f29331a;
                    C11958c.m44629a(fileInputStream, null);
                    return Unit.f29331a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3670c(String str, String str2, String str3, InterfaceC9557b<? super C3670c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14710x = str;
            this.f14711y = str2;
            this.f14712z = str3;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return UiStepSavedStateHelper.this.new C3670c(this.f14710x, this.f14711y, this.f14712z, interfaceC9557b);
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x000b */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.os.Parcel */
        /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: java.lang.Object */
        /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: android.os.Parcel */
        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
        
            if (p256ku.C7872i.m32684g(r9, r4, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.os.Parcel] */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiStepUiComponentConfig uiStepUiComponentConfig;
            Object obj2;
            Object objM38805e = C10047c.m38805e();
            Parcel parcel = this.f14708v;
            try {
                try {
                    if (parcel != 0) {
                        if (parcel == 1) {
                            Parcel parcel2 = (Parcel) this.f14706t;
                            C7348o.m30470b(obj);
                            parcel = parcel2;
                        } else {
                            if (parcel != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uiStepUiComponentConfig = (UiStepUiComponentConfig) this.f14707u;
                            C7348o.m30470b(obj);
                        }
                        return uiStepUiComponentConfig.m18333g();
                    }
                    C7348o.m30470b(obj);
                    if (!UiStepSavedStateHelper.this.configFile.exists()) {
                        return null;
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                    b bVar = new b(UiStepSavedStateHelper.this, parcelObtain, null);
                    this.f14706t = parcelObtain;
                    this.f14708v = 1;
                    parcel = parcelObtain;
                    if (C7872i.m32684g(abstractC7888l0M32644b, bVar, this) == objM38805e) {
                    }
                    return objM38805e;
                    parcel.setDataPosition(0);
                    Bundle bundle = parcel.readBundle(UiStepUiComponentConfig.class.getClassLoader());
                    UiStepUiComponentConfig uiStepUiComponentConfig2 = bundle != null ? (UiStepUiComponentConfig) C11774c.m44055a(bundle, "data", UiStepUiComponentConfig.class) : null;
                    parcel.recycle();
                    uiStepUiComponentConfig = uiStepUiComponentConfig2;
                    obj2 = parcel;
                } catch (Exception unused) {
                    parcel.recycle();
                    uiStepUiComponentConfig = null;
                    obj2 = parcel;
                } catch (Throwable th2) {
                    parcel.recycle();
                    throw th2;
                }
                if (uiStepUiComponentConfig != null && Intrinsics.m31980c(uiStepUiComponentConfig.getSessionToken(), this.f14710x) && Intrinsics.m31980c(uiStepUiComponentConfig.getInquiryId(), this.f14711y) && Intrinsics.m31980c(uiStepUiComponentConfig.getStepName(), this.f14712z)) {
                    AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                    a aVar = new a(UiStepSavedStateHelper.this, uiStepUiComponentConfig, null);
                    this.f14706t = C10350l.m39676a(obj2);
                    this.f14707u = uiStepUiComponentConfig;
                    this.f14708v = 2;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<? extends UiComponentConfig>> interfaceC9557b) {
            return ((C3670c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", m39664f = "UiStepSavedStateHelper.kt", m39665l = {96}, m39666m = "invokeSuspend")
    public static final class C3671d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f14719t;

        /* JADX INFO: renamed from: u */
        public int f14720u;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ UiStepUiComponentConfig f14722w;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", m39664f = "UiStepSavedStateHelper.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f14723t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ UiStepSavedStateHelper f14724u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Bundle f14725v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UiStepSavedStateHelper uiStepSavedStateHelper, Bundle bundle, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f14724u = uiStepSavedStateHelper;
                this.f14725v = bundle;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f14724u, this.f14725v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f14723t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f14724u.configFile);
                Bundle bundle = this.f14725v;
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    parcelObtain.writeBundle(bundle);
                    fileOutputStream.write(parcelObtain.marshall());
                    parcelObtain.recycle();
                    Unit unit = Unit.f29331a;
                    C11958c.m44629a(fileOutputStream, null);
                    return Unit.f29331a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        C11958c.m44629a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3671d(UiStepUiComponentConfig uiStepUiComponentConfig, InterfaceC9557b<? super C3671d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f14722w = uiStepUiComponentConfig;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return UiStepSavedStateHelper.this.new C3671d(this.f14722w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f14720u;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    File parentFile = UiStepSavedStateHelper.this.configFile.getParentFile();
                    if (parentFile != null) {
                        C10340b.m39658a(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", this.f14722w);
                    AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                    a aVar = new a(UiStepSavedStateHelper.this, bundle, null);
                    this.f14719t = C10350l.m39676a(bundle);
                    this.f14720u = 1;
                    if (C7872i.m32684g(abstractC7888l0M32644b, aVar, this) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3671d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public UiStepSavedStateHelper(@NotNull Context applicationContext, @NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m18328c(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM32684g = C7872i.m32684g(C7864g1.m32645c(), new C3669b(null), interfaceC9557b);
        return objM32684g == C10047c.m38805e() ? objM32684g : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m18329d(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InterfaceC9557b<? super List<? extends UiComponentConfig>> interfaceC9557b) {
        return C7872i.m32684g(C7864g1.m32643a(), new C3670c(str, str2, str3, null), interfaceC9557b);
    }

    /* JADX INFO: renamed from: e */
    public final void m18330e(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @Nullable List<? extends UiComponentConfig> componentConfigs) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        if (!Intrinsics.m31980c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalArgumentException("saveComponentConfigs must be called on the main thread.");
        }
        if (componentConfigs == null) {
            return;
        }
        UiStepUiComponentConfig uiStepUiComponentConfig = this.savedData;
        if (Intrinsics.m31980c(uiStepUiComponentConfig != null ? uiStepUiComponentConfig.getSessionToken() : null, sessionToken)) {
            UiStepUiComponentConfig uiStepUiComponentConfig2 = this.savedData;
            if (Intrinsics.m31980c(uiStepUiComponentConfig2 != null ? uiStepUiComponentConfig2.getInquiryId() : null, inquiryId)) {
                UiStepUiComponentConfig uiStepUiComponentConfig3 = this.savedData;
                if (Intrinsics.m31980c(uiStepUiComponentConfig3 != null ? uiStepUiComponentConfig3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        UiStepUiComponentConfig uiStepUiComponentConfig4 = new UiStepUiComponentConfig(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = uiStepUiComponentConfig4;
        C7882k.m32780d(this.coroutineScope, null, null, new C3671d(uiStepUiComponentConfig4, null), 3, null);
    }
}
