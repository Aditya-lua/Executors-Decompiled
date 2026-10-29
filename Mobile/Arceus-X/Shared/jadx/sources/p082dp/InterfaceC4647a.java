package p082dp;

import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3686i;
import gp.InquiryAttributes;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: dp.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, m31665d2 = {"Ldp/a;", "", "Lgp/e;", "attributes", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Ljv/x;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "a", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC4647a {
    @Nullable
    /* JADX INFO: renamed from: a */
    Object mo18487a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: b */
    Object mo18488b(@NotNull InquiryAttributes inquiryAttributes, @NotNull InterfaceC9557b<? super C7347n<C3686i>> interfaceC9557b);

    @Nullable
    /* JADX INFO: renamed from: c */
    Object mo18489c(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b);
}
