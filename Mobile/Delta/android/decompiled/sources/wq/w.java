package wq;

import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwq/w;", "Lt7/c;", "", "Lt7/b;", "frameInfo", "d", "(Lt7/b;)Ljava/lang/Integer;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends t7.c<Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ThemeableLottieAnimationView f34531d;

    public w(ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.f34531d = themeableLottieAnimationView;
    }

    @Override // t7.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Integer a(t7.b<Integer> frameInfo) {
        Integer num = (Integer) this.f34531d.srcColorToDestColor.get(frameInfo != null ? frameInfo.g() : null);
        if (num != null) {
            return num;
        }
        if (frameInfo != null) {
            return frameInfo.b();
        }
        return null;
    }
}
