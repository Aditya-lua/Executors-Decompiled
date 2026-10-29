package com.withpersona.sdk2.inquiry.p057ui;

import com.withpersona.sdk2.inquiry.p057ui.network.JsonObjectAdapter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p016an.InterfaceC0364a0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f;", "", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4153f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.f$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/f$a;", "", "<init>", "()V", "", "Lan/a0;", "b", "()Ljava/util/Set;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.f.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<Object> m21368a() {
            return C7700p0.m31904c(JsonObjectAdapter.f17802a);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<InterfaceC0364a0<?>> m21369b() {
            return C7700p0.m31904c(C4154g.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<Object> m21366a() {
        return INSTANCE.m21368a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<InterfaceC0364a0<?>> m21367b() {
        return INSTANCE.m21369b();
    }
}
