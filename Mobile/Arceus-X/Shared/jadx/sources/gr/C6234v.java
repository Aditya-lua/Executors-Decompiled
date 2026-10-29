package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1150e;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C6234v implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TextInputLayout f23740a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextInputLayout f23741b;

    public C6234v(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.f23740a = textInputLayout;
        this.f23741b = textInputLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6234v m27423a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new C6234v(textInputLayout, textInputLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6234v m27424c(@NonNull LayoutInflater layoutInflater) {
        return m27425d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6234v m27425d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4885w, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27423a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f23740a;
    }
}
