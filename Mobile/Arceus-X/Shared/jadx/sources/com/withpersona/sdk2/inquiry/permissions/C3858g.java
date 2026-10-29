package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p261l2.C7975b;
import p340op.C9837c;
import p340op.C9838d;
import p419rp.C11040n1;
import p419rp.EnumC11024i0;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\\\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0085\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u00020\u00042\"\u0010\u0007\u001a\u001e0\u0005R\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001a\u001a\u00020\r2$\u0010\u001e\u001a \u0012\u0004\u0012\u00020\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001d0\u001b¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001f*\u00020\u0004¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010%\u001a\u00020\b*\u00020$2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0'*\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0'¢\u0006\u0004\b)\u0010*¨\u0006+"}, m31665d2 = {"PropsT", "StateT", "OutputT", "RenderingT", "", "Lym/k$a;", "Lym/k;", "context", "", "requestPermissions", "Lrp/i0;", "permission", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "key", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "Lym/r;", "handler", "Lop/c;", "d", "(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lop/c;", "c", "(Ljava/lang/Object;)Lop/c;", "Landroid/content/Context;", "b", "(Landroid/content/Context;Lrp/i0;)Z", "", "permissions", "a", "(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;", "permissions_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3858g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<EnumC11024i0> m19163a(@NotNull Context context, @NotNull List<? extends EnumC11024i0> permissions) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (!m19164b(context, (EnumC11024i0) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19164b(@NotNull Context context, @NotNull EnumC11024i0 permission) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(permission, "permission");
        return C7975b.m33003a(context, C11040n1.m41737c(permission)) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final C9837c<Object, Object> m19165c(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new C9837c<>(obj, C7699p.m31892k(), "PermissionFlowModal");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r34v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$Output, ? extends ym.r<? super PropsT, StateT, ? extends OutputT>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <PropsT, StateT, OutputT, RenderingT> C9837c<Object, Object> m19166d(@NotNull Object obj, @NotNull AbstractC13218k<? super PropsT, StateT, ? extends OutputT, ? extends RenderingT>.a context, boolean z10, @NotNull EnumC11024i0 permission, boolean z11, @NotNull String title, @NotNull String rationale, @NotNull String rationaleWhenPermanentlyDenied, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @Nullable StepStyle stepStyle, @NotNull String key, @NotNull Function1<? super PermissionRequestWorkflow.Output, ? extends AbstractC13225r<? super PropsT, StateT, ? extends OutputT>> handler) {
        C9837c<Object, Object> c9837cM38723a;
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
            return m19165c(obj);
        }
        Object objMo48836c = context.mo48836c(permissionRequestWorkflow, new PermissionRequestWorkflow.Props(permission, z11, title, rationale, rationaleWhenPermanentlyDenied, str, str2, str3, str4, str5, stepStyle), key, handler);
        return (objMo48836c == null || (c9837cM38723a = C9838d.m38723a(objMo48836c, obj, "PermissionFlowModal")) == null) ? m19165c(obj) : c9837cM38723a;
    }
}
