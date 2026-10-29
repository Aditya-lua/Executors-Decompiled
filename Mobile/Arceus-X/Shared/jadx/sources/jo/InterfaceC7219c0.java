package jo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.ViewEnvironment;
import p523wn.InterfaceC12497c;

/* JADX INFO: renamed from: jo.c0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, m31665d2 = {"Ljo/c0;", "", "", "a", "()V", "Lan/y;", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;", "rendering", "b", "(Lan/y;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$a;)V", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7219c0 {

    /* JADX INFO: renamed from: jo.c0$a */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Ljo/c0$a;", "Lwn/c;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Ljo/c0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a extends InterfaceC12497c {
        @NotNull
        /* JADX INFO: renamed from: a */
        InterfaceC7219c0 mo17794a(@NotNull Context context, @Nullable ViewGroup container);
    }

    /* JADX INFO: renamed from: a */
    void mo30151a();

    /* JADX INFO: renamed from: b */
    void mo30152b(@NotNull ViewEnvironment viewEnvironment, @NotNull Screen.C3526a rendering);

    @NotNull
    View getRoot();
}
