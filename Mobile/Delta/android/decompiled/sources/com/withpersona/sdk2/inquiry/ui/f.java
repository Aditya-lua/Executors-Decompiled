package com.withpersona.sdk2.inquiry.ui;

import an.a0;
import com.withpersona.sdk2.inquiry.ui.network.JsonObjectAdapter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f;", "", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$a;", "", "<init>", "()V", "", "Lan/a0;", "b", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Object> a() {
            return p0.c(JsonObjectAdapter.f13950a);
        }

        @NotNull
        public final Set<a0<?>> b() {
            return p0.c(g.INSTANCE);
        }

        public Companion() {
        }
    }

    @NotNull
    public static final Set<Object> a() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<a0<?>> b() {
        return INSTANCE.b();
    }
}
