package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.NonNull;
import c9.b;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {
    @NonNull
    public static b a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) m.l(googleSignInOptions));
    }
}
