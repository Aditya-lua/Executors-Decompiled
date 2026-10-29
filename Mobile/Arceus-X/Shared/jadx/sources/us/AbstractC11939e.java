package us;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import p500vs.C12258a;

/* JADX INFO: renamed from: us.e */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11939e {

    /* JADX INFO: renamed from: us.e$a */
    public interface a {
        @NonNull
        /* JADX INFO: renamed from: a */
        a mo44565a(@NonNull InterfaceC11944j interfaceC11944j);

        @NonNull
        AbstractC11939e build();
    }

    /* JADX INFO: renamed from: us.e$b */
    public interface b {
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m44560a(@NonNull Context context) {
        return new C11940f(context).mo44565a(C12258a.m45438r());
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC11939e m44561b(@NonNull Context context) {
        return m44560a(context).mo44565a(C12258a.m45438r()).build();
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo44562c(@NonNull TextView textView, @NonNull String str);

    /* JADX INFO: renamed from: d */
    public abstract void mo44563d(@NonNull TextView textView, @NonNull Spanned spanned);

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract Spanned mo44564e(@NonNull String str);
}
