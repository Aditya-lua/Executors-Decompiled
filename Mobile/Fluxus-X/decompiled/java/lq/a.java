package lq;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f22456a;

    @NonNull
    public final MaterialSwitch b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialToolbar f22457c;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialToolbar materialToolbar) {
        this.f22456a = constraintLayout;
        this.b = materialSwitch;
        this.f22457c = materialToolbar;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i10 = kq.a.f21729c;
        MaterialSwitch materialSwitch = (MaterialSwitch) s5.b.a(view, i10);
        if (materialSwitch != null) {
            i10 = kq.a.f21730d;
            MaterialToolbar materialToolbar = (MaterialToolbar) s5.b.a(view, i10);
            if (materialToolbar != null) {
                return new a((ConstraintLayout) view, materialSwitch, materialToolbar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(kq.b.f21731a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // s5.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f22456a;
    }
}
