package com.withpersona.sdk2.inquiry.internal.network;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0002\n\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "b", "Meta", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class TransitionBackRequest {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Meta meta;

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$Meta;", "", "", "fromStep", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String fromStep;

        public Meta(@NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            this.fromStep = fromStep;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest$a;", "", "<init>", "()V", "", "fromStep", "Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "a", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/TransitionBackRequest;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.internal.network.TransitionBackRequest.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final TransitionBackRequest m18672a(@NotNull String fromStep) {
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            return new TransitionBackRequest(new Meta(fromStep));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public TransitionBackRequest(@NotNull Meta meta) {
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.meta = meta;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }
}
