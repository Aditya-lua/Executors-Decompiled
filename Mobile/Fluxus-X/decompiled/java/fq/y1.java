package fq;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0085\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\"\u0010\u0007\u001a\u001e0\u0005R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\r2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u001b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f*\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020\b*\u00020$2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0'*\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"PropsT", "StateT", "OutputT", "RenderingT", BuildConfig.FLAVOR, "Lln/k$a;", "Lln/k;", "context", BuildConfig.FLAVOR, "requestPermissions", "Lfq/n0;", "permission", "optional", BuildConfig.FLAVOR, Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalNegativeButton", "Lfq/n1;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "key", "Lkotlin/Function1;", "Lfq/n1$a;", "Lln/r;", "handler", "Lcq/c;", "d", "(Ljava/lang/Object;Lln/k$a;ZLfq/n0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfq/n1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcq/c;", "c", "(Ljava/lang/Object;)Lcq/c;", "Landroid/content/Context;", "b", "(Landroid/content/Context;Lfq/n0;)Z", BuildConfig.FLAVOR, "permissions", "a", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "permissions_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class y1 {
    @NotNull
    public static final List<n0> a(@NotNull Context context, @NotNull List<? extends n0> permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (!b(context, (n0) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean b(@NotNull Context context, @NotNull n0 permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return l2.b.a(context, x1.c(permission)) == 0;
    }

    @NotNull
    public static final cq.c<Object, Object> c(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new cq.c<>(obj, p001kotlin.collections.p.k(), "PermissionFlowModal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <PropsT, StateT, OutputT, RenderingT> cq.c<Object, Object> d(@NotNull Object obj, @NotNull ln.k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context, boolean z10, @NotNull n0 permission, boolean z11, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull n1 permissionRequestWorkflow, @Nullable StepStyle stepStyle, @NotNull String key, @NotNull Function1<? super n1.Output, ? extends ln.r<? super PropsT, StateT, ? extends OutputT>> handler) {
        cq.c<Object, Object> cVarA;
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rationale, "rationale");
        Intrinsics.checkNotNullParameter(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!z10) {
            return c(obj);
        }
        Object objC = context.c(permissionRequestWorkflow, new n1.Props(permission, z11, title, rationale, rationaleWhenPermanentlyDenied, str, str2, str3, str4, str5, stepStyle), key, handler);
        return (objC == null || (cVarA = cq.d.a(objC, obj, "PermissionFlowModal")) == null) ? c(obj) : cVarA;
    }
}
