package p526wq;

import com.withpersona.sdk2.inquiry.shared.p055ui.ThemeableLottieAnimationView;
import kotlin.Metadata;
import p444t7.C11551b;
import p444t7.C11552c;

/* JADX INFO: renamed from: wq.w */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lwq/w;", "Lt7/c;", "", "Lt7/b;", "frameInfo", "d", "(Lt7/b;)Ljava/lang/Integer;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12540w extends C11552c<Integer> {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ThemeableLottieAnimationView f44768d;

    public C12540w(ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f44768d = themeableLottieAnimationView;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Lt7/b;)Ljava/lang/Object; */
    @Override // p444t7.C11552c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Integer mo8441a(C11551b<Integer> frameInfo) {
        Integer num = (Integer) this.f44768d.srcColorToDestColor.get(frameInfo != null ? frameInfo.m43193g() : null);
        if (num != null) {
            return num;
        }
        if (frameInfo != null) {
            return frameInfo.m43188b();
        }
        return null;
    }
}
