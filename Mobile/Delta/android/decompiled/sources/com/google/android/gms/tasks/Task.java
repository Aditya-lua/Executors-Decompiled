package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import sb.c;
import sb.e;
import sb.f;
import sb.g;
import sb.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task<TResult> {
    @NonNull
    public Task<TResult> a(@NonNull Executor executor, @NonNull e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public Task<TResult> b(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public Task<TResult> c(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @NonNull
    public abstract Task<TResult> d(@NonNull Executor executor, @NonNull f fVar);

    @NonNull
    public abstract Task<TResult> e(@NonNull f fVar);

    @NonNull
    public abstract Task<TResult> f(@NonNull Executor executor, @NonNull g<? super TResult> gVar);

    @NonNull
    public abstract Task<TResult> g(@NonNull g<? super TResult> gVar);

    public abstract Exception getException();

    public abstract TResult getResult();

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> h(@NonNull Executor executor, @NonNull c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> i(@NonNull Executor executor, @NonNull c<TResult, Task<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract boolean isSuccessful();

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> j(@NonNull c<TResult, Task<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract <X extends Throwable> TResult k(@NonNull Class<X> cls);

    public abstract boolean l();

    public abstract boolean m();

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> n(@NonNull Executor executor, @NonNull j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @NonNull
    public <TContinuationResult> Task<TContinuationResult> o(@NonNull j<TResult, TContinuationResult> jVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
