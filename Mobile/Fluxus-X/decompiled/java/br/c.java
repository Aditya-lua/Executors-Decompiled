package br;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import xq.t;
import xq.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements s5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f4562a;

    @NonNull
    public final ImageView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f4563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f4564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f4565e;

    public c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f4562a = view;
        this.b = imageView;
        this.f4563c = imageView2;
        this.f4564d = imageView3;
        this.f4565e = textView;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i10 = t.f37032m;
        ImageView imageView = (ImageView) s5.b.a(view, i10);
        if (imageView != null) {
            i10 = t.f37033n;
            ImageView imageView2 = (ImageView) s5.b.a(view, i10);
            if (imageView2 != null) {
                i10 = t.f37034o;
                ImageView imageView3 = (ImageView) s5.b.a(view, i10);
                if (imageView3 != null) {
                    i10 = t.f37035p;
                    TextView textView = (TextView) s5.b.a(view, i10);
                    if (textView != null) {
                        return new c(view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(u.f37047c, viewGroup);
        return a(viewGroup);
    }

    @Override // s5.a
    @NonNull
    public View getRoot() {
        return this.f4562a;
    }
}
