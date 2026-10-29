package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import p132fn.C5717x;
import p136ft.InterfaceC5835i;
import p391qq.C10700c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3546g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<Context> f14094a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C5717x> f14095b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C10700c> f14096c;

    public C3546g(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C5717x> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        this.f14094a = interfaceC5835i;
        this.f14095b = interfaceC5835i2;
        this.f14096c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C3546g m17544a(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<C5717x> interfaceC5835i2, InterfaceC5835i<C10700c> interfaceC5835i3) {
        return new C3546g(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static GovernmentIdAnalyzeWorker m17545c(Context context, C5717x c5717x, C10700c c10700c, IdConfig.EnumC3514b enumC3514b, String str) {
        return new GovernmentIdAnalyzeWorker(context, c5717x, c10700c, enumC3514b, str);
    }

    /* JADX INFO: renamed from: b */
    public GovernmentIdAnalyzeWorker m17546b(IdConfig.EnumC3514b enumC3514b, String str) {
        return m17545c(this.f14094a.get(), this.f14095b.get(), this.f14096c.get(), enumC3514b, str);
    }
}
