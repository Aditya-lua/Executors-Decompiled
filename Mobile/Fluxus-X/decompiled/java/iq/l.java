package iq;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p000lifecycle.l0;
import av.g1;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.PermissionTrackingEventData;
import dv.c0;
import fq.CheckRequestPermissionRationaleStateView;
import fq.PermissionState;
import fq.n1;
import fq.o0;
import fq.s1;
import fq.x1;
import fq.y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0004.&$/BG\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0002¢\u0006\u0004\b#\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00060"}, d2 = {"Liq/l;", "Lls/d;", "Lfq/n1$c;", "Liq/l$e;", "Lfq/n1$a;", "Liq/l$f;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Lfq/o0$a;", "permissionRequestDialogWorkerFactory", "Lfq/j$a;", "deviceFeatureRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lav/p0;", "coroutineScope", "<init>", "(Lfq/n1$c;Landroidx/lifecycle/l0;Landroid/content/Context;Lfq/o0$a;Lfq/j$a;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lav/p0;)V", "props", "x", "(Lfq/n1$c;)Liq/l$e;", "renderProps", "renderState", BuildConfig.FLAVOR, "y", "(Lfq/n1$c;Liq/l$e;)V", "Lfq/t1;", "output", "v", "(Lfq/t1;)V", "J", "()V", "w", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Lfq/o0$a;", "h", "Lfq/j$a;", "i", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "d", "c", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends ls.d<n1.Props, e, n1.Output, f> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0.a permissionRequestDialogWorkerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final fq.j.a deviceFeatureRequestWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$1$1", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19707t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e f19709v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f19709v = eVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return l.this.new a(this.f19709v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f19707t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            l lVar = l.this;
            lVar.y(lVar.b().getValue(), this.f19709v);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$2", f = "PermissionRequestStateManager.kt", l = {80}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19710t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l f19712a;

            public a(l lVar) {
                this.f19712a = lVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(n1.Props props, eu.b<? super Unit> bVar) {
                l lVar = this.f19712a;
                e eVar = (e) lVar.d().i();
                if (eVar == null) {
                    return Unit.f21506a;
                }
                lVar.y(props, eVar);
                return Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return l.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f19710t;
            if (i10 == 0) {
                o.b(obj);
                c0<n1.Props> c0VarB = l.this.b();
                a aVar = new a(l.this);
                this.f19710t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Liq/l$c;", "Liq/l$e;", "<init>", "()V", "a", "c", "b", "Liq/l$c$a;", "Liq/l$c$b;", "Liq/l$c$c;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends e {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$c$a;", "Liq/l$c;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f19713a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0364a();

            /* JADX INFO: renamed from: iq.l$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0364a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f19713a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -200408212;
            }

            @NotNull
            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$c$b;", "Liq/l$c;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19714a = new b();

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return b.f19714a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1651676862;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: iq.l$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$c$c;", "Liq/l$c;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0365c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0365c f19715a = new C0365c();

            @NotNull
            public static final Parcelable.Creator<C0365c> CREATOR = new a();

            /* JADX INFO: renamed from: iq.l$c$c$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0365c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0365c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0365c.f19715a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0365c[] newArray(int i10) {
                    return new C0365c[i10];
                }
            }

            public C0365c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0365c);
            }

            public int hashCode() {
                return 610825882;
            }

            @NotNull
            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Liq/l$d;", BuildConfig.FLAVOR, "Lfq/n1$c;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Liq/l;", "a", "(Lfq/n1$c;Landroidx/lifecycle/l0;)Liq/l;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface d {
        @NotNull
        l a(@NotNull n1.Props initialProps, @NotNull l0 savedStateHandle);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Liq/l$e;", "Lls/c;", "<init>", "()V", "c", "b", "h", "f", "e", "a", "g", "d", "Liq/l$c;", "Liq/l$e$a;", "Liq/l$e$b;", "Liq/l$e$c;", "Liq/l$e$d;", "Liq/l$e$e;", "Liq/l$e$f;", "Liq/l$e$g;", "Liq/l$e$h;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class e extends ls.c {

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$a;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f19716a = new a();

            @NotNull
            public static final Parcelable.Creator<a> CREATOR = new C0366a();

            /* JADX INFO: renamed from: iq.l$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0366a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return a.f19716a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1216770821;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$b;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19717a = new b();

            @NotNull
            public static final Parcelable.Creator<b> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<b> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return b.f19717a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i10) {
                    return new b[i10];
                }
            }

            public b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1021319477;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$c;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f19718a = new c();

            @NotNull
            public static final Parcelable.Creator<c> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<c> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return c.f19718a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1373860566;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$d;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f19719a = new d();

            @NotNull
            public static final Parcelable.Creator<d> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<d> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return d.f19719a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i10) {
                    return new d[i10];
                }
            }

            public d() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1573796811;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: iq.l$e$e, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$e;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0367e extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0367e f19720a = new C0367e();

            @NotNull
            public static final Parcelable.Creator<C0367e> CREATOR = new a();

            /* JADX INFO: renamed from: iq.l$e$e$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<C0367e> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0367e createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return C0367e.f19720a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0367e[] newArray(int i10) {
                    return new C0367e[i10];
                }
            }

            public C0367e() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0367e);
            }

            public int hashCode() {
                return 438328941;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$f;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f19721a = new f();

            @NotNull
            public static final Parcelable.Creator<f> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<f> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return f.f19721a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i10) {
                    return new f[i10];
                }
            }

            public f() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -1427966398;
            }

            @NotNull
            public String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$g;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final g f19722a = new g();

            @NotNull
            public static final Parcelable.Creator<g> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<g> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return g.f19722a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i10) {
                    return new g[i10];
                }
            }

            public g() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return 333834169;
            }

            @NotNull
            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Liq/l$e$h;", "Liq/l$e;", "<init>", "()V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class h extends e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final h f19723a = new h();

            @NotNull
            public static final Parcelable.Creator<h> CREATOR = new a();

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<h> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final h createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return h.f19723a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final h[] newArray(int i10) {
                    return new h[i10];
                }
            }

            public h() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return -738457678;
            }

            @NotNull
            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public e() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Liq/l$f;", BuildConfig.FLAVOR, "a", "b", "Liq/l$f$a;", "Liq/l$f$b;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface f {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Liq/l$f$a;", "Liq/l$f;", "Lfq/h;", "view", "<init>", "(Lfq/h;)V", "a", "Lfq/h;", "()Lfq/h;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final fq.h view;

            public a(@NotNull fq.h view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final fq.h getView() {
                return this.view;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Liq/l$f$b;", "Liq/l$f;", "Lfq/i;", "view", "<init>", "(Lfq/i;)V", "a", "Lfq/i;", "()Lfq/i;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements f {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final CheckRequestPermissionRationaleStateView view;

            public b(@NotNull CheckRequestPermissionRationaleStateView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                this.view = view;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final CheckRequestPermissionRationaleStateView getView() {
                return this.view;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$10", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19726t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n1.Props f19728v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n1.Props props, eu.b<? super g> bVar) {
            super(1, bVar);
            this.f19728v = props;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return l.this.new g(this.f19728v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f19726t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (hr.f.b(l.this.applicationContext)) {
                l.this.v(new PermissionState(this.f19728v.getPermission(), s1.PermissionGranted));
            } else {
                l.this.d().p(c.C0365c.f19715a);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((g) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$1", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19729t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n1.Props f19731v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(n1.Props props, eu.b<? super h> bVar) {
            super(1, bVar);
            this.f19731v = props;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return l.this.new h(this.f19731v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f19729t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            if (y1.b(l.this.applicationContext, this.f19731v.getPermission())) {
                l.this.d().p(e.C0367e.f19720a);
            } else {
                l.this.d().p(e.b.f19717a);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((h) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager$handleState$6", f = "PermissionRequestStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19732t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ n1.Props f19734v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(n1.Props props, eu.b<? super i> bVar) {
            super(1, bVar);
            this.f19734v = props;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return l.this.new i(this.f19734v, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f19732t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            l.this.v(new PermissionState(this.f19734v.getPermission(), s1.PermissionGranted));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull n1.Props initialProps, @NotNull l0 savedStateHandle, @NotNull Context applicationContext, @NotNull o0.a permissionRequestDialogWorkerFactory, @NotNull fq.j.a deviceFeatureRequestWorkerFactory, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull final p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestDialogWorkerFactory, "permissionRequestDialogWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.permissionRequestDialogWorkerFactory = permissionRequestDialogWorkerFactory;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
        this.trackingEventsLogger = trackingEventsLogger;
        if (d().i() == null) {
            d().p(x(b().getValue()));
        }
        d().o(new Function1() { // from class: iq.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.r(coroutineScope, this, (l.e) obj);
            }
        });
        av.k.d(coroutineScope, g1.d(), null, new b(null), 2, null);
    }

    public static final Unit A(l lVar, n1.Props props, fq.j.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof fq.j.b.c) {
            lVar.v(new PermissionState(props.getPermission(), s1.PermissionGranted));
        } else if (it instanceof fq.j.b.a) {
            lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
        } else {
            if (!(it instanceof fq.j.b.C0302b)) {
                throw new zt.l();
            }
            lVar.w();
            lVar.v(new PermissionState(props.getPermission(), s1.SettingsLaunched));
        }
        return Unit.f21506a;
    }

    public static final Unit B(l lVar) {
        lVar.d().p(e.f.f19721a);
        return Unit.f21506a;
    }

    public static final Unit C(l lVar, n1.Props props) {
        lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public static final Unit D(l lVar, n1.Props props, o0.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, o0.b.C0308b.f16500a)) {
            lVar.d().p(e.C0367e.f19720a);
        } else {
            if (!Intrinsics.c(it, o0.b.a.f16499a)) {
                throw new zt.l();
            }
            if (props.getOptional()) {
                lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
            } else {
                lVar.d().p(e.a.f19716a);
            }
        }
        return Unit.f21506a;
    }

    public static final Unit E(l lVar, n1.Props props, boolean z10) {
        if (z10) {
            lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
        } else {
            lVar.d().p(e.g.f19722a);
        }
        return Unit.f21506a;
    }

    public static final Unit F(l lVar, n1.Props props) {
        lVar.J();
        lVar.v(new PermissionState(props.getPermission(), s1.SettingsLaunched));
        return Unit.f21506a;
    }

    public static final Unit G(l lVar, n1.Props props) {
        lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public static final Unit H(l lVar) {
        lVar.d().p(c.b.f19714a);
        return Unit.f21506a;
    }

    public static final Unit I(l lVar, n1.Props props) {
        lVar.v(new PermissionState(props.getPermission(), s1.PermissionRejected));
        return Unit.f21506a;
    }

    public static final Unit r(p0 p0Var, l lVar, e eVar) {
        if (eVar == null) {
            return Unit.f21506a;
        }
        av.k.d(p0Var, g1.d(), null, lVar.new a(eVar, null), 2, null);
        return Unit.f21506a;
    }

    public static final Unit z(l lVar, boolean z10) {
        if (z10) {
            lVar.d().p(e.h.f19723a);
        } else {
            lVar.d().p(e.f.f19721a);
        }
        return Unit.f21506a;
    }

    public final void J() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    public final void v(PermissionState output) {
        TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(x1.c(output.getPermission()), x1.b(output.getResult()), null, 4, null), false, 2, null);
        e(new n1.Output(output));
    }

    public final void w() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @NotNull
    public final e x(@NotNull n1.Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return e.c.f19718a;
    }

    public final void y(final n1.Props renderProps, e renderState) {
        if (Intrinsics.c(renderState, e.c.f19718a)) {
            d().m("check_permission_state", new h(renderProps, null));
            return;
        }
        if (Intrinsics.c(renderState, e.b.f19717a)) {
            c().setValue(new f.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: iq.c
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l.z(this.f19693a, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, e.h.f19723a)) {
            TrackingEventsLogger.logPermissionEvent$default(this.trackingEventsLogger, new PermissionTrackingEventData(x1.c(renderProps.getPermission()), "permission_sheet_presented", null, 4, null), false, 2, null);
            c0<f> c0VarC = c();
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(jq.g.D);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: iq.d
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.B(this.f19694a);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(jq.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            c0VarC.setValue(new f.a(new fq.h(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: iq.e
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.C(this.f19695a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, e.f.f19721a)) {
            d().n(this.permissionRequestDialogWorkerFactory.a(renderProps.getPermission()), new Function1() { // from class: iq.f
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l.D(this.f19696a, renderProps, (o0.b) obj);
                }
            });
            return;
        }
        if (Intrinsics.c(renderState, e.C0367e.f19720a)) {
            if (renderProps.q()) {
                d().p(c.a.f19713a);
                return;
            } else {
                d().m("request_device_feature", new i(renderProps, null));
                return;
            }
        }
        if (Intrinsics.c(renderState, e.a.f19716a)) {
            c().setValue(new f.b(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: iq.g
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l.E(this.f19697a, renderProps, ((Boolean) obj).booleanValue());
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, e.g.f19722a)) {
            c0<f> c0VarC2 = c();
            String title2 = renderProps.getTitle();
            String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
            String positiveButtonText2 = renderProps.getPositiveButtonText();
            if (positiveButtonText2 == null) {
                positiveButtonText2 = this.applicationContext.getString(jq.g.E);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
            }
            String str2 = positiveButtonText2;
            StepStyle styles2 = renderProps.getStyles();
            Function0 function1 = new Function0() { // from class: iq.h
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.F(this.f19698a, renderProps);
                }
            };
            String negativeButtonText2 = renderProps.getNegativeButtonText();
            if (negativeButtonText2 == null) {
                negativeButtonText2 = this.applicationContext.getString(jq.g.C);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
            }
            c0VarC2.setValue(new f.a(new fq.h(title2, rationaleWhenPermanentlyDenied, str2, styles2, function1, negativeButtonText2, new Function0() { // from class: iq.i
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return l.G(this.f19699a, renderProps);
                }
            })));
            return;
        }
        if (Intrinsics.c(renderState, c.a.f19713a)) {
            d().m("check_device_feature_state", new g(renderProps, null));
            return;
        }
        if (!Intrinsics.c(renderState, c.C0365c.f19715a)) {
            if (Intrinsics.c(renderState, c.b.f19714a)) {
                d().n(this.deviceFeatureRequestWorkerFactory.a(), new Function1() { // from class: iq.b
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return l.A(this.f19692a, renderProps, (fq.j.b) obj);
                    }
                });
                return;
            } else {
                if (!Intrinsics.c(renderState, e.d.f19719a)) {
                    throw new zt.l();
                }
                return;
            }
        }
        c0<f> c0VarC3 = c();
        String gpsFeatureTitle = renderProps.getGpsFeatureTitle();
        if (gpsFeatureTitle == null) {
            gpsFeatureTitle = "Couldn't access location feature";
        }
        String gpsFeatureRationale = renderProps.getGpsFeatureRationale();
        if (gpsFeatureRationale == null) {
            gpsFeatureRationale = "Location is turned off, please allow access to your device's location feature";
        }
        String positiveButtonText3 = renderProps.getPositiveButtonText();
        if (positiveButtonText3 == null) {
            positiveButtonText3 = "Allow";
        }
        StepStyle styles3 = renderProps.getStyles();
        Function0 function2 = new Function0() { // from class: iq.j
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.H(this.f19700a);
            }
        };
        String gpsFeatureModalNegativeButton = renderProps.getGpsFeatureModalNegativeButton();
        if (gpsFeatureModalNegativeButton == null) {
            gpsFeatureModalNegativeButton = "Cancel";
        }
        c0VarC3.setValue(new f.a(new fq.h(gpsFeatureTitle, gpsFeatureRationale, positiveButtonText3, styles3, function2, gpsFeatureModalNegativeButton, new Function0() { // from class: iq.k
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.I(this.f19701a, renderProps);
            }
        })));
    }
}
