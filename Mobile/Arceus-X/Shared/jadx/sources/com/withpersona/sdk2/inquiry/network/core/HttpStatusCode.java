package com.withpersona.sdk2.inquiry.network.core;

import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpStatusCode {
    public static final int BAD_GATEWAY_502 = 502;
    public static final int CONFLICT_409 = 409;
    public static final int NETWORK_ERROR_0 = 0;
    public static final int NOT_FOUND_404 = 404;
    public static final int PAYLOAD_TOO_LARGE_413 = 413;
    public static final int TOO_MANY_REQUESTS_429 = 429;
    public static final int UNAUTHORIZED_401 = 401;
    public static final int UNPROCESSABLE_ENTITY_422 = 422;

    @NotNull
    public static final HttpStatusCode INSTANCE = new HttpStatusCode();

    @NotNull
    private static final IntRange CLIENT_ERRORS = new IntRange(400, 499);

    @NotNull
    private static final IntRange SERVER_ERRORS = new IntRange(500, 599);

    private HttpStatusCode() {
    }

    @NotNull
    public final IntRange getCLIENT_ERRORS() {
        return CLIENT_ERRORS;
    }

    @NotNull
    public final IntRange getSERVER_ERRORS() {
        return SERVER_ERRORS;
    }
}
