package com.appsflyer.sdk_base.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContentProviderFetcher<T> {
    protected final String authority;
    private final Executor backgroundExecutor;
    protected final Context context;
    protected final AFLoggerBase logger;
    private final String[] sig;
    private final FutureTask<T> task = new FutureTask<>(new Callable() { // from class: com.appsflyer.sdk_base.util.c
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.f7188a.lambda$new$0();
        }
    });

    public ContentProviderFetcher(Context context, AFLoggerBase aFLoggerBase, Executor executor, String str, String... strArr) {
        this.context = context;
        this.authority = str;
        this.logger = aFLoggerBase;
        this.sig = strArr;
        this.backgroundExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0() {
        if (valid()) {
            return query();
        }
        return null;
    }

    @Nullable
    public T get() {
        try {
            return this.task.get(500L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            onError(e10, false);
            return null;
        }
    }

    public void onError(Throwable th2, boolean z10) {
        this.logger.m8963e(LogTag.REFERRER, th2.getMessage() != null ? th2.getMessage() : "", th2, false, z10);
    }

    public abstract T query();

    public void start() {
        this.backgroundExecutor.execute(this.task);
    }

    public boolean valid() {
        try {
            ProviderInfo providerInfoResolveContentProvider = this.context.getPackageManager().resolveContentProvider(this.authority, 128);
            return providerInfoResolveContentProvider != null && Arrays.asList(this.sig).contains(AndroidExtensionsKt.signature(this.context.getPackageManager(), providerInfoResolveContentProvider.packageName));
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e10) {
            onError(e10, false);
            return false;
        }
    }
}
