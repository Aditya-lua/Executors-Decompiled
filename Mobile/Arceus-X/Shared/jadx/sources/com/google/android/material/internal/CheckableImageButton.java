package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.customview.view.AbsSavedState;
import p181i.C6589a;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: g */
    public static final int[] f10305g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d */
    public boolean f10306d;

    /* JADX INFO: renamed from: e */
    public boolean f10307e;

    /* JADX INFO: renamed from: f */
    public boolean f10308f;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2817a();

        /* JADX INFO: renamed from: c */
        public boolean f10309c;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        public class C2817a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX INFO: renamed from: f */
        private void m12849f(@NonNull Parcel parcel) {
            this.f10309c = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f10309c ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m12849f(parcel);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public class C2818a extends C0582a {
        public C2818a() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: f */
        public void mo2798f(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.mo2798f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48404j0(CheckableImageButton.this.m12848a());
            c13017p.m48406k0(CheckableImageButton.this.isChecked());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25009E);
    }

    /* JADX INFO: renamed from: a */
    public boolean m12848a() {
        return this.f10307e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10306d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f10306d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f10305g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        setChecked(savedState.f10309c);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10309c = this.f10306d;
        return savedState;
    }

    public void setCheckable(boolean z10) {
        if (this.f10307e != z10) {
            this.f10307e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f10307e || this.f10306d == z10) {
            return;
        }
        this.f10306d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f10308f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f10308f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10306d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10307e = true;
        this.f10308f = true;
        C0625o0.m3040m0(this, new C2818a());
    }
}
