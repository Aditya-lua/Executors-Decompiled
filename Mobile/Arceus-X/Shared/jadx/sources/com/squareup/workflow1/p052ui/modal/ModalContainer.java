package com.squareup.workflow1.p052ui.modal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import bn.C1471c;
import bn.C1474f;
import bn.InterfaceC1472d;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.p052ui.WorkflowViewStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.AbstractC0376g0;
import p016an.C0377h;
import p016an.C0378h0;
import p016an.InterfaceC0375g;
import p016an.ViewEnvironment;
import p068d5.InterfaceC4445i;
import p109en.C5170g;
import p109en.InterfaceC5169f;
import p229jt.C7342i;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003&45B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000fH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0014¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102¨\u00066"}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "ModalRenderingT", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Len/f;", "newScreen", "Lan/y;", "viewEnvironment", "", "c", "(Len/f;Lan/y;)V", "initialModalRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "b", "(Ljava/lang/Object;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "a", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "baseViewStub", "", "Ljava/util/List;", "dialogs", "Lbn/d;", "Ljt/h;", "getParentLifecycleOwner", "()Lbn/d;", "parentLifecycleOwner", "Lbn/f;", "Lbn/f;", "stateRegistryAggregator", "KeyAndBundle", "SavedState", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public abstract class ModalContainer<ModalRenderingT> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WorkflowViewStub baseViewStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<C3386a<ModalRenderingT>> dialogs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h parentLifecycleOwner;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C1474f stateRegistryAggregator;

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006 "}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "Landroid/os/Parcelable;", "", "compatibilityKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "CREATOR", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final /* data */ class KeyAndBundle implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String compatibilityKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bundle bundle;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$KeyAndBundle$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class Companion implements Parcelable.Creator<KeyAndBundle> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.modal.ModalContainer.KeyAndBundle.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public KeyAndBundle createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNullExpressionValue(string, "parcel.readString()!!");
                Bundle bundle = parcel.readBundle(KeyAndBundle.class.getClassLoader());
                Intrinsics.checkNotNull(bundle);
                Intrinsics.checkNotNullExpressionValue(bundle, "parcel.readBundle(KeyAnd…class.java.classLoader)!!");
                return new KeyAndBundle(string, bundle);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public KeyAndBundle[] newArray(int size) {
                return new KeyAndBundle[size];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        public KeyAndBundle(@NotNull String compatibilityKey, @NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.compatibilityKey = compatibilityKey;
            this.bundle = bundle;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bundle getBundle() {
            return this.bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KeyAndBundle)) {
                return false;
            }
            KeyAndBundle keyAndBundle = (KeyAndBundle) other;
            return Intrinsics.m31980c(this.compatibilityKey, keyAndBundle.compatibilityKey) && Intrinsics.m31980c(this.bundle, keyAndBundle.bundle);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getCompatibilityKey() {
            return this.compatibilityKey;
        }

        public int hashCode() {
            return (this.compatibilityKey.hashCode() * 31) + this.bundle.hashCode();
        }

        @NotNull
        public String toString() {
            return "KeyAndBundle(compatibilityKey=" + this.compatibilityKey + ", bundle=" + this.bundle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(this.compatibilityKey);
            parcel.writeBundle(this.bundle);
        }
    }

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$b */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"", "ModalRenderingT", "Lbn/d;", "b", "()Lbn/d;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class C3387b extends AbstractC7746m implements Function0<InterfaceC1472d> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f12872i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3387b(ModalContainer<ModalRenderingT> modalContainer) {
            super(0);
            this.f12872i = modalContainer;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1472d invoke() {
            InterfaceC1472d interfaceC1472dM7552c = InterfaceC1472d.INSTANCE.m7552c(this.f12872i);
            if (interfaceC1472dM7552c != null) {
                return interfaceC1472dM7552c;
            }
            throw new IllegalStateException(Intrinsics.m31989l("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ", this.f12872i).toString());
        }
    }

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$c */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m31665d2 = {"", "ModalRenderingT", "Landroid/view/View;", "it", "Landroidx/lifecycle/l;", "a", "(Landroid/view/View;)Landroidx/lifecycle/l;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class C3388c extends AbstractC7746m implements Function1<View, AbstractC0966l> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f12873i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3388c(ModalContainer<ModalRenderingT> modalContainer) {
            super(1);
            this.f12873i = modalContainer;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC0966l invoke(@NotNull View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC0966l abstractC0966lMo4656a = this.f12873i.getParentLifecycleOwner().mo4656a();
            Intrinsics.checkNotNullExpressionValue(abstractC0966lMo4656a, "parentLifecycleOwner.lifecycle");
            return abstractC0966lMo4656a;
        }
    }

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$d */
    @Metadata(m31664d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0000\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"com/squareup/workflow1/ui/modal/ModalContainer$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "com/squareup/workflow1/ui/modal/ModalContainer$d$a", "a", "Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;", "()Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;", "dismissOnDestroy", "Landroidx/lifecycle/l;", "b", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "setLifecycle", "(Landroidx/lifecycle/l;)V", "lifecycle", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class ViewOnAttachStateChangeListenerC3389d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final a dismissOnDestroy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public AbstractC0966l lifecycle;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3386a<ModalRenderingT> f12876c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f12877d;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$d$a */
        @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/squareup/workflow1/ui/modal/ModalContainer$d$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class a implements InterfaceC0954f {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3386a<ModalRenderingT> f12878a;

            public a(C3386a<ModalRenderingT> c3386a) {
                this.f12878a = c3386a;
            }

            @Override // androidx.p616lifecycle.InterfaceC0954f
            public void onDestroy(@NotNull InterfaceC0980s owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f12878a.m16145c();
            }
        }

        public ViewOnAttachStateChangeListenerC3389d(C3386a<ModalRenderingT> c3386a, ModalContainer<ModalRenderingT> modalContainer) {
            this.f12876c = c3386a;
            this.f12877d = modalContainer;
            this.dismissOnDestroy = new a(c3386a);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDismissOnDestroy() {
            return this.dismissOnDestroy;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            AbstractC0966l abstractC0966lMo4656a = this.f12877d.getParentLifecycleOwner().mo4656a();
            abstractC0966lMo4656a.mo4935a(getDismissOnDestroy());
            this.lifecycle = abstractC0966lMo4656a;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            AbstractC0966l abstractC0966l = this.lifecycle;
            if (abstractC0966l != null) {
                abstractC0966l.mo4938d(this.dismissOnDestroy);
            }
            this.lifecycle = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WorkflowViewStub workflowViewStub = new WorkflowViewStub(context, null, 0, 0, 14, null);
        addView(workflowViewStub, new ViewGroup.LayoutParams(-1, -1));
        this.baseViewStub = workflowViewStub;
        this.dialogs = C7699p.m31892k();
        this.parentLifecycleOwner = C7342i.m30455a(EnumC7344k.NONE, new C3387b(this));
        this.stateRegistryAggregator = new C1474f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1472d getParentLifecycleOwner() {
        return (InterfaceC1472d) this.parentLifecycleOwner.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract C3386a<ModalRenderingT> mo16133b(@NotNull ModalRenderingT initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment);

    /* JADX INFO: renamed from: c */
    public final void m16134c(@NotNull InterfaceC5169f<?, ? extends ModalRenderingT> newScreen, @NotNull ViewEnvironment viewEnvironment) {
        ViewEnvironment viewEnvironment2;
        C3386a<ModalRenderingT> c3386aMo16133b;
        Intrinsics.checkNotNullParameter(newScreen, "newScreen");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.baseViewStub.m16104c(newScreen.mo24034b(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        for (ModalRenderingT modalrenderingt : newScreen.mo24033a()) {
            int i12 = i11 + 1;
            if (i11 >= this.dialogs.size() || !C0377h.m1429a(this.dialogs.get(i11).m16148f(), modalrenderingt)) {
                viewEnvironment2 = viewEnvironment;
                c3386aMo16133b = mo16133b(modalrenderingt, viewEnvironment2);
                c3386aMo16133b.m16153k(InterfaceC0375g.INSTANCE.m1419a(modalrenderingt, String.valueOf(i11)));
                View viewM24042b = C5170g.m24042b(c3386aMo16133b.getDialog());
                if (viewM24042b != null) {
                    InterfaceC1472d.INSTANCE.m7553d(viewM24042b, new C3388c(this));
                    this.stateRegistryAggregator.m7562h(viewM24042b, c3386aMo16133b.m16149g());
                    viewM24042b.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3389d(c3386aMo16133b, this));
                }
                c3386aMo16133b.getDialog().show();
            } else {
                viewEnvironment2 = viewEnvironment;
                c3386aMo16133b = C3386a.m16143b(this.dialogs.get(i11), modalrenderingt, viewEnvironment2, null, null, 12, null);
                mo16135d(c3386aMo16133b);
            }
            arrayList.add(c3386aMo16133b);
            i11 = i12;
            viewEnvironment = viewEnvironment2;
        }
        Iterator it = CollectionsKt.m31723u0(this.dialogs, arrayList).iterator();
        while (it.hasNext()) {
            ((C3386a) it.next()).m16145c();
        }
        C1474f c1474f = this.stateRegistryAggregator;
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((C3386a) obj).m16149g());
        }
        c1474f.m7564j(arrayList2);
        this.dialogs = arrayList;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo16135d(@NotNull C3386a<ModalRenderingT> dialogRef);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC4445i interfaceC4445iM7547c = C1471c.f5714a.m7547c(this);
        InterfaceC0375g.Companion companion = InterfaceC0375g.INSTANCE;
        AbstractC0376g0<?> abstractC0376g0M1433d = C0378h0.m1433d(this);
        Object objMo1422c = abstractC0376g0M1433d == null ? null : abstractC0376g0M1433d.mo1422c();
        if (objMo1422c == null) {
            objMo1422c = null;
        }
        Intrinsics.checkNotNull(objMo1422c);
        this.stateRegistryAggregator.m7560f(InterfaceC0375g.Companion.m1418b(companion, objMo1422c, null, 2, null), interfaceC4445iM7547c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.stateRegistryAggregator.m7561g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            if (savedState.m16140a().size() == this.dialogs.size()) {
                List<KeyAndBundle> listM16140a = savedState.m16140a();
                List<C3386a<ModalRenderingT>> list = this.dialogs;
                Iterator<T> it = listM16140a.iterator();
                Iterator<T> it2 = list.iterator();
                ArrayList arrayList = new ArrayList(Math.min(C7701q.m31905u(listM16140a, 10), C7701q.m31905u(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    ((C3386a) it2.next()).m16151i((KeyAndBundle) it.next());
                    arrayList.add(Unit.f29331a);
                }
            }
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f29331a;
        }
        if (unit == null) {
            super.onRestoreInstanceState(super.onSaveInstanceState());
        }
    }

    @Override // android.view.View
    @NotNull
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        List<C3386a<ModalRenderingT>> list = this.dialogs;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3386a) it.next()).m16152j());
        }
        return new SavedState(parcelableOnSaveInstanceState, arrayList);
    }

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "dialogBundles", "<init>", "(Landroid/os/Parcelable;Ljava/util/List;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "CREATOR", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<KeyAndBundle> dialogBundles;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$SavedState$a, reason: from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
        public static final class Companion implements Parcelable.Creator<SavedState> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.squareup.workflow1.ui.modal.ModalContainer.SavedState.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@Nullable Parcelable parcelable, @NotNull List<KeyAndBundle> dialogBundles) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(dialogBundles, "dialogBundles");
            this.dialogBundles = dialogBundles;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<KeyAndBundle> m16140a() {
            return this.dialogBundles;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NotNull Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, flags);
            out.writeTypedList(this.dialogBundles);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@NotNull Parcel source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            ArrayList arrayList = new ArrayList();
            source.readTypedList(arrayList, KeyAndBundle.INSTANCE);
            this.dialogBundles = arrayList;
        }
    }

    /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$a */
    @Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b'\u0010\u001fR\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, m31665d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "", "ModalRenderingT", "modalRendering", "Lan/y;", "viewEnvironment", "Landroid/app/Dialog;", "dialog", "extra", "<init>", "(Ljava/lang/Object;Lan/y;Landroid/app/Dialog;Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;Lan/y;Landroid/app/Dialog;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "j", "()Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "keyAndBundle", "", "i", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;)V", "c", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "Lan/y;", "h", "()Lan/y;", "Landroid/app/Dialog;", "d", "()Landroid/app/Dialog;", "e", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "savedStateRegistryKey", "wf1-container-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class C3386a<ModalRenderingT> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ModalRenderingT modalRendering;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ViewEnvironment viewEnvironment;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Dialog dialog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Object extra;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public String savedStateRegistryKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C3386a(@NotNull ModalRenderingT modalRendering, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.modalRendering = modalRendering;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.squareup.workflow1.ui.modal.ModalContainer$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C3386a m16143b(C3386a c3386a, Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = c3386a.modalRendering;
            }
            if ((i10 & 2) != 0) {
                viewEnvironment = c3386a.viewEnvironment;
            }
            if ((i10 & 4) != 0) {
                dialog = c3386a.dialog;
            }
            if ((i10 & 8) != 0) {
                obj2 = c3386a.extra;
            }
            return c3386a.m16144a(obj, viewEnvironment, dialog, obj2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C3386a<ModalRenderingT> m16144a(@NotNull ModalRenderingT modalRendering, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, @Nullable Object extra) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            C3386a<ModalRenderingT> c3386a = new C3386a<>(modalRendering, viewEnvironment, dialog, extra);
            c3386a.m16153k(m16149g());
            return c3386a;
        }

        /* JADX INFO: renamed from: c */
        public final void m16145c() {
            InterfaceC1472d interfaceC1472dM7552c;
            View viewM24042b = C5170g.m24042b(this.dialog);
            if (viewM24042b != null && (interfaceC1472dM7552c = InterfaceC1472d.INSTANCE.m7552c(viewM24042b)) != null) {
                interfaceC1472dM7552c.mo7543L();
            }
            this.dialog.dismiss();
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final Dialog getDialog() {
            return this.dialog;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getExtra() {
            return this.extra;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.m31980c(C3386a.class, other == null ? null : other.getClass())) {
                return false;
            }
            if (other != null) {
                return Intrinsics.m31980c(this.dialog, ((C3386a) other).dialog);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final ModalRenderingT m16148f() {
            return this.modalRendering;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final String m16149g() {
            String str = this.savedStateRegistryKey;
            if (str != null) {
                return str;
            }
            Intrinsics.m31998u("savedStateRegistryKey");
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final ViewEnvironment getViewEnvironment() {
            return this.viewEnvironment;
        }

        public int hashCode() {
            return this.dialog.hashCode();
        }

        /* JADX INFO: renamed from: i */
        public final void m16151i(@NotNull KeyAndBundle keyAndBundle) {
            Intrinsics.checkNotNullParameter(keyAndBundle, "keyAndBundle");
            if (Intrinsics.m31980c(InterfaceC0375g.Companion.m1418b(InterfaceC0375g.INSTANCE, this.modalRendering, null, 2, null), keyAndBundle.getCompatibilityKey())) {
                Window window = this.dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.restoreHierarchyState(keyAndBundle.getBundle());
            }
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final KeyAndBundle m16152j() {
            Window window = this.dialog.getWindow();
            Intrinsics.checkNotNull(window);
            Bundle saved = window.saveHierarchyState();
            String strM1418b = InterfaceC0375g.Companion.m1418b(InterfaceC0375g.INSTANCE, this.modalRendering, null, 2, null);
            Intrinsics.checkNotNullExpressionValue(saved, "saved");
            return new KeyAndBundle(strM1418b, saved);
        }

        /* JADX INFO: renamed from: k */
        public final void m16153k(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.savedStateRegistryKey = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.Object)
          (r2v0 an.y)
          (r3v0 android.app.Dialog)
          (wrap java.lang.Object:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r4v0 java.lang.Object))
         A[MD:(ModalRenderingT, an.y, android.app.Dialog, java.lang.Object):void (m)] (LINE:6) call: com.squareup.workflow1.ui.modal.ModalContainer.a.<init>(java.lang.Object, an.y, android.app.Dialog, java.lang.Object):void type: THIS */
        public /* synthetic */ C3386a(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, dialog, (i10 & 8) != 0 ? null : obj2);
        }
    }
}
