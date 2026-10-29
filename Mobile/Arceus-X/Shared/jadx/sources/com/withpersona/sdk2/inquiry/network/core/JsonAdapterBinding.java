package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import p471um.AbstractC11873h;

/* JADX INFO: loaded from: classes3.dex */
public final class JsonAdapterBinding<T> {

    @NotNull
    private final Class<T> clazz;

    @NotNull
    private final AbstractC11873h<T> jsonAdapter;

    public JsonAdapterBinding(@NotNull Class<T> cls, @NotNull AbstractC11873h<T> abstractC11873h) {
        this.clazz = cls;
        this.jsonAdapter = abstractC11873h;
    }

    @NotNull
    public final Class<T> getClazz() {
        return this.clazz;
    }

    @NotNull
    public final AbstractC11873h<T> getJsonAdapter() {
        return this.jsonAdapter;
    }
}
