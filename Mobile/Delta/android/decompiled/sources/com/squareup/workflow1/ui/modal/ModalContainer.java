package com.squareup.workflow1.ui.modal;

import an.ViewEnvironment;
import an.g;
import an.g0;
import an.h0;
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
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import bn.f;
import com.appsflyer.sdk_base.referrer.Payload;
import com.squareup.workflow1.ui.WorkflowViewStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jt.h;
import jt.i;
import jt.k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003&45B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u000fH$¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H$¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0014¢\u0006\u0004\b$\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00102¨\u00066"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer;", "", "ModalRenderingT", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Len/f;", "newScreen", "Lan/y;", "viewEnvironment", "", "c", "(Len/f;Lan/y;)V", "initialModalRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "b", "(Ljava/lang/Object;Lan/y;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "dialogRef", "d", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$a;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "a", "Lcom/squareup/workflow1/ui/WorkflowViewStub;", "baseViewStub", "", "Ljava/util/List;", "dialogs", "Lbn/d;", "Ljt/h;", "getParentLifecycleOwner", "()Lbn/d;", "parentLifecycleOwner", "Lbn/f;", "Lbn/f;", "stateRegistryAggregator", "KeyAndBundle", "SavedState", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ModalContainer<ModalRenderingT> extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WorkflowViewStub baseViewStub;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<a<ModalRenderingT>> dialogs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h parentLifecycleOwner;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f stateRegistryAggregator;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006 "}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "Landroid/os/Parcelable;", "", "compatibilityKey", "Landroid/os/Bundle;", "bundle", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class KeyAndBundle implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String compatibilityKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Bundle bundle;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$KeyAndBundle$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<KeyAndBundle> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

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

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public KeyAndBundle[] newArray(int size) {
                return new KeyAndBundle[size];
            }

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
            return Intrinsics.c(this.compatibilityKey, keyAndBundle.compatibilityKey) && Intrinsics.c(this.bundle, keyAndBundle.bundle);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ModalRenderingT", "Lbn/d;", "b", "()Lbn/d;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends m implements Function0<bn.d> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f9892i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ModalContainer<ModalRenderingT> modalContainer) {
            super(0);
            this.f9892i = modalContainer;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final bn.d invoke() {
            bn.d dVarC = bn.d.INSTANCE.c(this.f9892i);
            if (dVarC != null) {
                return dVarC;
            }
            throw new IllegalStateException(Intrinsics.l("Expected to find either a ViewTreeLifecycleOwner in the view tree, or for the context to be a LifecycleOwner, in ", this.f9892i).toString());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "ModalRenderingT", "Landroid/view/View;", "it", "Landroidx/lifecycle/l;", "a", "(Landroid/view/View;)Landroidx/lifecycle/l;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends m implements Function1<View, l> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f9893i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ModalContainer<ModalRenderingT> modalContainer) {
            super(1);
            this.f9893i = modalContainer;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l invoke(@NotNull View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            l lVarA = this.f9893i.getParentLifecycleOwner().a();
            Intrinsics.checkNotNullExpressionValue(lVarA, "parentLifecycleOwner.lifecycle");
            return lVarA;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0000\b\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/squareup/workflow1/ui/modal/ModalContainer$d", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "com/squareup/workflow1/ui/modal/ModalContainer$d$a", "a", "Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;", "()Lcom/squareup/workflow1/ui/modal/ModalContainer$d$a;", "dismissOnDestroy", "Landroidx/lifecycle/l;", "b", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "setLifecycle", "(Landroidx/lifecycle/l;)V", "lifecycle", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final a dismissOnDestroy;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public l lifecycle;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<ModalRenderingT> f9895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ModalContainer<ModalRenderingT> f9896d;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/squareup/workflow1/ui/modal/ModalContainer$d$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class a implements androidx.p000lifecycle.f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a<ModalRenderingT> f9897a;

            public a(a<ModalRenderingT> aVar) {
                this.f9897a = aVar;
            }

            @Override // androidx.p000lifecycle.f
            public void onDestroy(@NotNull s owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                this.f9897a.c();
            }
        }

        public d(a<ModalRenderingT> aVar, ModalContainer<ModalRenderingT> modalContainer) {
            this.f9895c = aVar;
            this.f9896d = modalContainer;
            this.dismissOnDestroy = new a(aVar);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getDismissOnDestroy() {
            return this.dismissOnDestroy;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            l lVarA = this.f9896d.getParentLifecycleOwner().a();
            lVarA.a(getDismissOnDestroy());
            this.lifecycle = lVarA;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            l lVar = this.lifecycle;
            if (lVar != null) {
                lVar.d(this.dismissOnDestroy);
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
        this.dialogs = p.k();
        this.parentLifecycleOwner = i.a(k.NONE, new b(this));
        this.stateRegistryAggregator = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bn.d getParentLifecycleOwner() {
        return (bn.d) this.parentLifecycleOwner.getValue();
    }

    @NotNull
    public abstract a<ModalRenderingT> b(@NotNull ModalRenderingT initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment);

    public final void c(@NotNull en.f<?, ? extends ModalRenderingT> newScreen, @NotNull ViewEnvironment viewEnvironment) {
        ViewEnvironment viewEnvironment2;
        a<ModalRenderingT> aVarB;
        Intrinsics.checkNotNullParameter(newScreen, "newScreen");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.baseViewStub.c(newScreen.b(), viewEnvironment);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        for (ModalRenderingT modalrenderingt : newScreen.a()) {
            int i12 = i11 + 1;
            if (i11 >= this.dialogs.size() || !an.h.a(this.dialogs.get(i11).f(), modalrenderingt)) {
                viewEnvironment2 = viewEnvironment;
                aVarB = b(modalrenderingt, viewEnvironment2);
                aVarB.k(g.INSTANCE.a(modalrenderingt, String.valueOf(i11)));
                View viewB = en.g.b(aVarB.getDialog());
                if (viewB != null) {
                    bn.d.INSTANCE.d(viewB, new c(this));
                    this.stateRegistryAggregator.h(viewB, aVarB.g());
                    viewB.addOnAttachStateChangeListener(new d(aVarB, this));
                }
                aVarB.getDialog().show();
            } else {
                viewEnvironment2 = viewEnvironment;
                aVarB = a.b(this.dialogs.get(i11), modalrenderingt, viewEnvironment2, null, null, 12, null);
                d(aVarB);
            }
            arrayList.add(aVarB);
            i11 = i12;
            viewEnvironment = viewEnvironment2;
        }
        Iterator it = CollectionsKt.u0(this.dialogs, arrayList).iterator();
        while (it.hasNext()) {
            ((a) it.next()).c();
        }
        f fVar = this.stateRegistryAggregator;
        ArrayList arrayList2 = new ArrayList(q.u(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((a) obj).g());
        }
        fVar.j(arrayList2);
        this.dialogs = arrayList;
    }

    public abstract void d(@NotNull a<ModalRenderingT> dialogRef);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d5.i iVarC = bn.c.f4262a.c(this);
        g.Companion companion = g.INSTANCE;
        g0<?> g0VarD = h0.d(this);
        Object objC = g0VarD == null ? null : g0VarD.c();
        if (objC == null) {
            objC = null;
        }
        Intrinsics.checkNotNull(objC);
        this.stateRegistryAggregator.f(g.Companion.b(companion, objC, null, 2, null), iVarC);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.stateRegistryAggregator.g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@NotNull Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Unit unit = null;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        if (savedState != null) {
            if (savedState.a().size() == this.dialogs.size()) {
                List<KeyAndBundle> listA = savedState.a();
                List<a<ModalRenderingT>> list = this.dialogs;
                Iterator<T> it = listA.iterator();
                Iterator<T> it2 = list.iterator();
                ArrayList arrayList = new ArrayList(Math.min(q.u(listA, 10), q.u(list, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    ((a) it2.next()).i((KeyAndBundle) it.next());
                    arrayList.add(Unit.f22483a);
                }
            }
            super.onRestoreInstanceState(((SavedState) state).getSuperState());
            unit = Unit.f22483a;
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
        List<a<ModalRenderingT>> list = this.dialogs;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).j());
        }
        return new SavedState(parcelableOnSaveInstanceState, arrayList);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superState", "", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "dialogBundles", "<init>", "(Landroid/os/Parcelable;Ljava/util/List;)V", "Landroid/os/Parcel;", Payload.SOURCE, "(Landroid/os/Parcel;)V", "out", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "CREATOR", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<KeyAndBundle> dialogBundles;

        /* JADX INFO: renamed from: com.squareup.workflow1.ui.modal.ModalContainer$SavedState$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "<init>", "()V", "Landroid/os/Parcel;", Payload.SOURCE, "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/modal/ModalContainer$SavedState;", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<SavedState> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NotNull Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }

            public Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(@Nullable Parcelable parcelable, @NotNull List<KeyAndBundle> dialogBundles) {
            super(parcelable);
            Intrinsics.checkNotNullParameter(dialogBundles, "dialogBundles");
            this.dialogBundles = dialogBundles;
        }

        @NotNull
        public final List<KeyAndBundle> a() {
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

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0005\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b'\u0010\u001fR\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b'\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "", "ModalRenderingT", "modalRendering", "Lan/y;", "viewEnvironment", "Landroid/app/Dialog;", "dialog", "extra", "<init>", "(Ljava/lang/Object;Lan/y;Landroid/app/Dialog;Ljava/lang/Object;)V", "a", "(Ljava/lang/Object;Lan/y;Landroid/app/Dialog;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/modal/ModalContainer$a;", "Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "j", "()Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;", "keyAndBundle", "", "i", "(Lcom/squareup/workflow1/ui/modal/ModalContainer$KeyAndBundle;)V", "c", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "b", "Lan/y;", "h", "()Lan/y;", "Landroid/app/Dialog;", "d", "()Landroid/app/Dialog;", "e", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "savedStateRegistryKey", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class a<ModalRenderingT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ModalRenderingT modalRendering;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ViewEnvironment viewEnvironment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Dialog dialog;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object extra;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public String savedStateRegistryKey;

        public a(@NotNull ModalRenderingT modalRendering, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.modalRendering = modalRendering;
            this.viewEnvironment = viewEnvironment;
            this.dialog = dialog;
            this.extra = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i10, Object obj3) {
            if ((i10 & 1) != 0) {
                obj = aVar.modalRendering;
            }
            if ((i10 & 2) != 0) {
                viewEnvironment = aVar.viewEnvironment;
            }
            if ((i10 & 4) != 0) {
                dialog = aVar.dialog;
            }
            if ((i10 & 8) != 0) {
                obj2 = aVar.extra;
            }
            return aVar.a(obj, viewEnvironment, dialog, obj2);
        }

        @NotNull
        public final a<ModalRenderingT> a(@NotNull ModalRenderingT modalRendering, @NotNull ViewEnvironment viewEnvironment, @NotNull Dialog dialog, @Nullable Object extra) {
            Intrinsics.checkNotNullParameter(modalRendering, "modalRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            a<ModalRenderingT> aVar = new a<>(modalRendering, viewEnvironment, dialog, extra);
            aVar.k(g());
            return aVar;
        }

        public final void c() {
            bn.d dVarC;
            View viewB = en.g.b(this.dialog);
            if (viewB != null && (dVarC = bn.d.INSTANCE.c(viewB)) != null) {
                dVarC.L();
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
            if (!Intrinsics.c(a.class, other == null ? null : other.getClass())) {
                return false;
            }
            if (other != null) {
                return Intrinsics.c(this.dialog, ((a) other).dialog);
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.workflow1.ui.modal.ModalContainer.DialogRef<*>");
        }

        @NotNull
        public final ModalRenderingT f() {
            return this.modalRendering;
        }

        @NotNull
        public final String g() {
            String str = this.savedStateRegistryKey;
            if (str != null) {
                return str;
            }
            Intrinsics.u("savedStateRegistryKey");
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

        public final void i(@NotNull KeyAndBundle keyAndBundle) {
            Intrinsics.checkNotNullParameter(keyAndBundle, "keyAndBundle");
            if (Intrinsics.c(g.Companion.b(g.INSTANCE, this.modalRendering, null, 2, null), keyAndBundle.getCompatibilityKey())) {
                Window window = this.dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.restoreHierarchyState(keyAndBundle.getBundle());
            }
        }

        @NotNull
        public final KeyAndBundle j() {
            Window window = this.dialog.getWindow();
            Intrinsics.checkNotNull(window);
            Bundle saved = window.saveHierarchyState();
            String strB = g.Companion.b(g.INSTANCE, this.modalRendering, null, 2, null);
            Intrinsics.checkNotNullExpressionValue(saved, "saved");
            return new KeyAndBundle(strB, saved);
        }

        public final void k(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.savedStateRegistryKey = str;
        }

        public /* synthetic */ a(Object obj, ViewEnvironment viewEnvironment, Dialog dialog, Object obj2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, viewEnvironment, dialog, (i10 & 8) != 0 ? null : obj2);
        }
    }
}
