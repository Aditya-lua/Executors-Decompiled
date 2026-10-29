package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import androidx.p616lifecycle.C0967l0;
import com.withpersona.sdk2.inquiry.internal.InquiryState;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig;
import gp.C6181a;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB+\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0012\u0010\u0017R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\f¨\u0006\""}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Ljava/util/List;Ljava/lang/String;Landroidx/lifecycle/l0;)V", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "g", "Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "a", "()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;", "Ljava/util/List;", "b", "Landroidx/lifecycle/l0;", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "inquiryId", "d", "authorization", "", "value", "()I", "h", "(I)V", "currentStepIndex", "currentStep", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3686i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<NextStep> steps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0967l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String inquiryId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String authorization;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.i$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;", "steps", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "a", "(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3686i mo18513a(@NotNull List<? extends NextStep> steps, @NotNull String sessionToken);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.NextStep> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3686i(@NotNull List<? extends NextStep> steps, @NotNull String sessionToken, @NotNull C0967l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.steps = steps;
        this.savedStateHandle = savedStateHandle;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.inquiryId = string;
        this.authorization = "Bearer " + sessionToken;
    }

    /* JADX DEBUG: Class process forced to load method for inline: gp.a.I(com.withpersona.sdk2.inquiry.network.dto.NextStep$Ui, java.lang.String, java.lang.String, java.lang.String, java.util.Map, com.withpersona.sdk2.inquiry.shared.inquiry_session.InquirySessionConfig, java.lang.String, java.lang.String, int, java.lang.Object):com.withpersona.sdk2.inquiry.internal.InquiryState */
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InquiryState m18505a() {
        NextStep nextStepM18507c = m18507c();
        if (nextStepM18507c instanceof NextStep.C3793Ui) {
            return C6181a.m27209I((NextStep.C3793Ui) nextStepM18507c, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.m20427a(), null, null, 96, null);
        }
        if (nextStepM18507c instanceof NextStep.GovernmentId) {
            return C6181a.m27206F((NextStep.GovernmentId) nextStepM18507c, this.authorization, this.inquiryId, null, InquirySessionConfig.INSTANCE.m20427a(), null, null, 48, null);
        }
        if (nextStepM18507c instanceof NextStep.Selfie) {
            return C6181a.m27208H((NextStep.Selfie) nextStepM18507c, this.authorization, this.inquiryId, InquirySessionConfig.INSTANCE.m20427a(), null, null, 24, null);
        }
        if (nextStepM18507c instanceof NextStep.Document) {
            return C6181a.m27205E((NextStep.Document) nextStepM18507c, this.authorization, this.inquiryId, InquirySessionConfig.INSTANCE.m20427a(), null, null, 24, null);
        }
        if (nextStepM18507c instanceof NextStep.Complete) {
            return C6181a.m27204D((NextStep.Complete) nextStepM18507c, this.authorization, this.inquiryId, "fake_status", null, InquirySessionConfig.INSTANCE.m20427a(), null, null, 32, null);
        }
        if (nextStepM18507c instanceof NextStep.Integration) {
            return C6181a.m27207G((NextStep.Integration) nextStepM18507c, this.authorization, this.inquiryId, "fake_status", InquirySessionConfig.INSTANCE.m20427a(), null, null, 48, null);
        }
        if (!Intrinsics.m31980c(nextStepM18507c, NextStep.Unknown.INSTANCE)) {
            throw new C7345l();
        }
        throw new IllegalArgumentException("Unknown type for step " + nextStepM18507c.getName());
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAuthorization() {
        return this.authorization;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final NextStep m18507c() {
        return this.steps.get(m18508d());
    }

    /* JADX INFO: renamed from: d */
    public final int m18508d() {
        Integer num = (Integer) this.savedStateHandle.m4947b("current_fallback_mode_step_index");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final NextStep m18510f() {
        if (m18508d() == C7699p.m31894m(this.steps)) {
            return null;
        }
        m18512h(m18508d() + 1);
        return this.steps.get(m18508d());
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final NextStep m18511g() {
        if (m18508d() == 0) {
            return null;
        }
        m18512h(m18508d() - 1);
        return this.steps.get(m18508d());
    }

    /* JADX INFO: renamed from: h */
    public final void m18512h(int i10) {
        this.savedStateHandle.m4954i("current_fallback_mode_step_index", Integer.valueOf(i10));
    }
}
