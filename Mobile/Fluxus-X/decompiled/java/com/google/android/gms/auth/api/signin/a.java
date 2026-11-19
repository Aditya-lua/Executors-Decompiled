package com.google.android.gms.auth.api.signin;

import android.content.Context;
import androidx.annotation.NonNull;
import d9.b;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {
    @NonNull
    public static b a(@NonNull Context context, @NonNull GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) s.l(googleSignInOptions));
    }
}
