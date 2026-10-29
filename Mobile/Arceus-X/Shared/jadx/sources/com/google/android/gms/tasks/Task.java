package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import sb.InterfaceC11248c;
import sb.InterfaceC11252e;
import sb.InterfaceC11254f;
import sb.InterfaceC11256g;
import sb.InterfaceC11262j;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<TResult> mo11887a(@NonNull Executor executor, @NonNull InterfaceC11252e interfaceC11252e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<TResult> mo11888b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Task<TResult> mo11889c(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public abstract Task<TResult> mo11890d(@NonNull Executor executor, @NonNull InterfaceC11254f interfaceC11254f);

    @NonNull
    /* JADX INFO: renamed from: e */
    public abstract Task<TResult> mo11891e(@NonNull InterfaceC11254f interfaceC11254f);

    @NonNull
    /* JADX INFO: renamed from: f */
    public abstract Task<TResult> mo11892f(@NonNull Executor executor, @NonNull InterfaceC11256g<? super TResult> interfaceC11256g);

    @NonNull
    /* JADX INFO: renamed from: g */
    public abstract Task<TResult> mo11893g(@NonNull InterfaceC11256g<? super TResult> interfaceC11256g);

    public abstract Exception getException();

    public abstract TResult getResult();

    @NonNull
    /* JADX INFO: renamed from: h */
    public <TContinuationResult> Task<TContinuationResult> mo11894h(@NonNull Executor executor, @NonNull InterfaceC11248c<TResult, TContinuationResult> interfaceC11248c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public <TContinuationResult> Task<TContinuationResult> mo11895i(@NonNull Executor executor, @NonNull InterfaceC11248c<TResult, Task<TContinuationResult>> interfaceC11248c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract boolean isSuccessful();

    @NonNull
    /* JADX INFO: renamed from: j */
    public <TContinuationResult> Task<TContinuationResult> mo11896j(@NonNull InterfaceC11248c<TResult, Task<TContinuationResult>> interfaceC11248c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* JADX INFO: renamed from: k */
    public abstract <X extends Throwable> TResult mo11897k(@NonNull Class<X> cls);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo11898l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo11899m();

    @NonNull
    /* JADX INFO: renamed from: n */
    public <TContinuationResult> Task<TContinuationResult> mo11900n(@NonNull Executor executor, @NonNull InterfaceC11262j<TResult, TContinuationResult> interfaceC11262j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public <TContinuationResult> Task<TContinuationResult> mo11901o(@NonNull InterfaceC11262j<TResult, TContinuationResult> interfaceC11262j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
