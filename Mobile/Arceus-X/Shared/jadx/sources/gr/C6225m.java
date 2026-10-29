package gr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ar.C1150e;
import com.google.android.material.textfield.TextInputLayout;
import p402r5.InterfaceC10784a;

/* JADX INFO: renamed from: gr.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C6225m implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TextInputLayout f23708a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextInputLayout f23709b;

    public C6225m(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.f23708a = textInputLayout;
        this.f23709b = textInputLayout2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C6225m m27388a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new C6225m(textInputLayout, textInputLayout);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C6225m m27389c(@NonNull LayoutInflater layoutInflater) {
        return m27390d(layoutInflater, null, false);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C6225m m27390d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C1150e.f4876n, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m27388a(viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // p402r5.InterfaceC10784a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f23708a;
    }
}
