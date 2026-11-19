package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import hn.a0;
import hn.w;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import mv.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.collections.q;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import sw.x;
import up.InquiryAttributes;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "Lrp/a;", "Lhn/w;", "moshi", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", BuildConfig.FLAVOR, "staticTemplateResourceId", "<init>", "(Lhn/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V", "Lup/e;", "attributes", "Lzt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lup/e;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "sessionToken", "Lmv/g0;", "body", "Lsw/x;", "a", "(Ljava/lang/String;Lmv/g0;Leu/b;)Ljava/lang/Object;", "c", "Lhn/w;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements rp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final w moshi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int staticTemplateResourceId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "staticTemplateResourceId", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "a", "(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        f a(int staticTemplateResourceId);
    }

    public f(@NotNull w moshi, @NotNull Context context, @NotNull i.a staticTemplateSessionFactory, int i10) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.moshi = moshi;
        this.context = context;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
        this.staticTemplateResourceId = i10;
    }

    @Override // rp.a
    @Nullable
    public Object a(@NotNull String str, @NotNull g0 g0Var, @NotNull eu.b<? super x<?>> bVar) {
        x xVarI = x.i(null);
        Intrinsics.checkNotNullExpressionValue(xVarI, "success(...)");
        return xVarI;
    }

    @Override // rp.a
    @Nullable
    public Object b(@NotNull InquiryAttributes inquiryAttributes, @NotNull eu.b<? super n<i>> bVar) {
        String string;
        try {
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strH = lu.n.h(bufferedReader);
                ArrayList arrayList = null;
                lu.c.a(bufferedReader, null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(strH).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string = jSONArrayOptJSONArray.toString()) == null) {
                    n.Companion companion = n.INSTANCE;
                    return n.b(o.a(new rp.b("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.d(a0.j(List.class, NextStep.class)).fromJson(string);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(q.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    n.Companion companion2 = n.INSTANCE;
                    return n.b(o.a(new rp.b("Expected steps to contain at least one step")));
                }
                n.Companion companion3 = n.INSTANCE;
                i.a aVar = this.staticTemplateSessionFactory;
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return n.b(aVar.a(arrayList, string2));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            n.Companion companion4 = n.INSTANCE;
            return n.b(o.a(new rp.b("Failed to open resource as static template. Resource not found.")));
        }
    }

    @Override // rp.a
    @Nullable
    public Object c(@NotNull String str, @NotNull g0 g0Var, @NotNull eu.b<? super x<?>> bVar) {
        x xVarI = x.i(null);
        Intrinsics.checkNotNullExpressionValue(xVarI, "success(...)");
        return xVarI;
    }
}
