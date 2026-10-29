package p434sp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p402r5.InterfaceC10784a;
import p419rp.C11046p1;

/* JADX INFO: renamed from: sp.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11442a implements InterfaceC10784a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f40446a;

    public C11442a(@NonNull View view) {
        this.f40446a = view;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C11442a m42855a(@NonNull View view) {
        if (view != null) {
            return new C11442a(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C11442a m42856b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C11046p1.f39035a, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return m42855a(viewInflate);
    }

    @Override // p402r5.InterfaceC10784a
    @NonNull
    public View getRoot() {
        return this.f40446a;
    }
}
