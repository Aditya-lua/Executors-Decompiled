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
import androidx.core.view.o0;
import com.google.mlkit.vision.barcode.common.Barcode;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f7945g = {R.attr.state_checked};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7948f;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            pVar.j0(CheckableImageButton.this.a());
            pVar.k0(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends r3.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7950c;

        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@NonNull Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void f(@NonNull Parcel parcel) {
            this.f7950c = parcel.readInt() == 1;
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7950c ? 1 : 0);
        }

        public b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            f(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.E);
    }

    public boolean a() {
        return this.f7947e;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7946d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (!this.f7946d) {
            return super.onCreateDrawableState(i10);
        }
        int[] iArr = f7945g;
        return View.mergeDrawableStates(super.onCreateDrawableState(i10 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f7950c);
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f7950c = this.f7946d;
        return bVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f7947e != z10) {
            this.f7947e = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f7947e || this.f7946d == z10) {
            return;
        }
        this.f7946d = z10;
        refreshDrawableState();
        sendAccessibilityEvent(Barcode.FORMAT_PDF417);
    }

    public void setPressable(boolean z10) {
        this.f7948f = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f7948f) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7946d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7947e = true;
        this.f7948f = true;
        o0.m0(this, new a());
    }
}
