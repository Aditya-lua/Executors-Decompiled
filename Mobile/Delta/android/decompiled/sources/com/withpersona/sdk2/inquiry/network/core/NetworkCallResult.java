package com.withpersona.sdk2.inquiry.network.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NetworkCallResult<T> {

    public static final class Failure<T> extends NetworkCallResult<T> {

        @NotNull
        private final InternalErrorInfo.NetworkErrorInfo networkErrorInfo;

        public Failure(@NotNull InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
            super(null);
            this.networkErrorInfo = networkErrorInfo;
        }

        @NotNull
        public final InternalErrorInfo.NetworkErrorInfo getNetworkErrorInfo() {
            return this.networkErrorInfo;
        }
    }

    public static final class Success<T> extends NetworkCallResult<T> {

        @Nullable
        private final T response;

        public Success(@Nullable T t8) {
            super(null);
            this.response = t8;
        }

        @Nullable
        public final T getResponse() {
            return this.response;
        }
    }

    public /* synthetic */ NetworkCallResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkCallResult() {
    }
}
