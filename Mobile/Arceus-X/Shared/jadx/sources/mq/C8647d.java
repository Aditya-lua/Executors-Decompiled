package mq;

import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mq.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lmq/d;", "Lmq/a;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "a", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "", "Z", "b", "()Z", "isActive", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8647d implements InterfaceC8644a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isActive;

    @Override // mq.InterfaceC8644a
    /* JADX INFO: renamed from: a */
    public void mo34720a(@NotNull StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
    }

    @Override // mq.InterfaceC8644a
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }
}
