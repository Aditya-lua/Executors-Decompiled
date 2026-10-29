package p607zk;

import mv.InterfaceC8692a;
import mv.InterfaceC8706o;
import okhttp3.ResponseBody;
import p031bl.C1445a;
import p031bl.C1446b;
import p031bl.C1447c;
import p031bl.C1448d;
import p231jv.InterfaceC7376d;

/* JADX INFO: renamed from: zk.k */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC13831k {
    @InterfaceC8706o("/platform-chat-api/v1/send-messages")
    /* JADX INFO: renamed from: a */
    InterfaceC7376d<ResponseBody> m50319a(@InterfaceC8692a C1448d c1448d);

    @InterfaceC8706o("/platform-chat-api/v1/mark-conversations")
    /* JADX INFO: renamed from: b */
    InterfaceC7376d<ResponseBody> m50320b(@InterfaceC8692a C1446b c1446b);

    @InterfaceC8706o("/platform-chat-api/v1/mark-conversations")
    /* JADX INFO: renamed from: c */
    InterfaceC7376d<ResponseBody> m50321c(@InterfaceC8692a C1445a c1445a);

    @InterfaceC8706o("/platform-chat-api/v1/send-messages")
    /* JADX INFO: renamed from: d */
    InterfaceC7376d<ResponseBody> m50322d(@InterfaceC8692a C1447c c1447c);
}
