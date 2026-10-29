package mq;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.shared.data_collection.StepData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: mq.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u000bj\b\u0012\u0004\u0012\u00020\u0006`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Lmq/e;", "Lmq/a;", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/l0;)V", "Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;", "stepData", "", "a", "(Lcom/withpersona/sdk2/inquiry/shared/data_collection/StepData;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "Landroidx/lifecycle/l0;", "b", "Ljava/util/ArrayList;", "collectedData", "", "Z", "()Z", "isActive", "d", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8648e implements InterfaceC8644a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<StepData> collectedData;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isActive;

    public C8648e(@NotNull C0967l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        ArrayList<StepData> arrayList = (ArrayList) savedStateHandle.m4947b("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData");
        this.collectedData = arrayList == null ? new ArrayList<>() : arrayList;
        this.isActive = true;
    }

    @Override // mq.InterfaceC8644a
    /* JADX INFO: renamed from: a */
    public void mo34720a(@NotNull StepData stepData) {
        Intrinsics.checkNotNullParameter(stepData, "stepData");
        this.collectedData.add(stepData);
        this.savedStateHandle.m4954i("com.withpersona.sdk2.inquiry.shared.data_collection.RealDataCollector.collectedData", this.collectedData);
    }

    @Override // mq.InterfaceC8644a
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public ArrayList<StepData> m34726c() {
        return new ArrayList<>(this.collectedData);
    }
}
