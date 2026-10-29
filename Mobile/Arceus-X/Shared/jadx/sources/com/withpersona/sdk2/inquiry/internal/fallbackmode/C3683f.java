package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import gp.InquiryAttributes;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p082dp.C4648b;
import p082dp.InterfaceC4647a;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p471um.C11866a0;
import p471um.C11888w;
import p477ut.C11958c;
import p477ut.C11969n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "Ldp/a;", "Lum/w;", "moshi", "Landroid/content/Context;", "context", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "staticTemplateSessionFactory", "", "staticTemplateResourceId", "<init>", "(Lum/w;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;I)V", "Lgp/e;", "attributes", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;", "b", "(Lgp/e;Lnt/b;)Ljava/lang/Object;", "", "sessionToken", "Lokhttp3/RequestBody;", "body", "Ljv/x;", "c", "(Ljava/lang/String;Lokhttp3/RequestBody;Lnt/b;)Ljava/lang/Object;", "a", "Lum/w;", "Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;", "d", "I", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3683f implements InterfaceC4647a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C11888w moshi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C3686i.a staticTemplateSessionFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int staticTemplateResourceId;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.f$a */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "", "", "staticTemplateResourceId", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "a", "(I)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3683f mo18500a(int staticTemplateResourceId);
    }

    public C3683f(@NotNull C11888w moshi, @NotNull Context context, @NotNull C3686i.a staticTemplateSessionFactory, int i10) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.moshi = moshi;
        this.context = context;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
        this.staticTemplateResourceId = i10;
    }

    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo18487a(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        C7396x c7396xM30651i = C7396x.m30651i(null);
        Intrinsics.checkNotNullExpressionValue(c7396xM30651i, "success(...)");
        return c7396xM30651i;
    }

    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo18488b(@NotNull InquiryAttributes inquiryAttributes, @NotNull InterfaceC9557b<? super C7347n<C3686i>> interfaceC9557b) {
        String string;
        try {
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String strM44671h = C11969n.m44671h(bufferedReader);
                ArrayList arrayList = null;
                C11958c.m44629a(bufferedReader, null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(strM44671h).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string = jSONArrayOptJSONArray.toString()) == null) {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new C4648b("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.m44437d(C11866a0.m44298j(List.class, NextStep.class)).fromJson(string);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(C7701q.m31905u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    C7347n.Companion companion2 = C7347n.INSTANCE;
                    return C7347n.m30460b(C7348o.m30469a(new C4648b("Expected steps to contain at least one step")));
                }
                C7347n.Companion companion3 = C7347n.INSTANCE;
                C3686i.a aVar = this.staticTemplateSessionFactory;
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return C7347n.m30460b(aVar.mo18513a(arrayList, string2));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            C7347n.Companion companion4 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new C4648b("Failed to open resource as static template. Resource not found.")));
        }
    }

    @Override // p082dp.InterfaceC4647a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo18489c(@NotNull String str, @NotNull RequestBody requestBody, @NotNull InterfaceC9557b<? super C7396x<?>> interfaceC9557b) {
        C7396x c7396xM30651i = C7396x.m30651i(null);
        Intrinsics.checkNotNullExpressionValue(c7396xM30651i, "success(...)");
        return c7396xM30651i;
    }
}
