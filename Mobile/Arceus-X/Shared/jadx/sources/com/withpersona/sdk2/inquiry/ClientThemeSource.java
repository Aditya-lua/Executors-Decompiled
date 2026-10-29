package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ClientThemeSource;", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "theme", "", "<init>", "(Ljava/lang/Integer;)V", "getTheme", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class ClientThemeSource implements ThemeSource {

    @Nullable
    private final Integer theme;

    public ClientThemeSource(@Nullable Integer num) {
        this.theme = num;
    }

    @Override // com.withpersona.sdk2.inquiry.ThemeSource
    @Nullable
    public Integer getTheme() {
        return this.theme;
    }
}
