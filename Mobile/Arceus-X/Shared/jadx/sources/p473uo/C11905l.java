package p473uo;

import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p476ur.C11934c;
import p476ur.InterfaceC11932a;

/* JADX INFO: renamed from: uo.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Luo/l;", "", "Lur/a;", "webRtcManager", "<init>", "(Lur/a;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderProps", "", "f", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z", "c", "Lmn/a;", "e", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lmn/a;", "", "a", "()V", "Lur/a;", "b", "()Lur/a;", "setWebRtcManager", "d", "()Z", "isWebRtcConnected", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11905l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public InterfaceC11932a webRtcManager;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11905l(@Nullable InterfaceC11932a interfaceC11932a) {
        this.webRtcManager = interfaceC11932a;
    }

    /* JADX INFO: renamed from: a */
    public final void m44494a() {
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44538d();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC11932a getWebRtcManager() {
        return this.webRtcManager;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m44496c(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        EnumC8598a enumC8598aM44498e = m44498e(renderProps);
        return enumC8598aM44498e == EnumC8598a.Stream || enumC8598aM44498e == EnumC8598a.Upload;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m44497d() {
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return interfaceC11932a != null && interfaceC11932a.isConnected();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final EnumC8598a m44498e(@NotNull GovernmentIdWorkflow.Input renderProps) {
        EnumC8598a enumC8598a;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        VideoCaptureConfig videoCaptureConfigM17175J = renderProps.m17175J();
        List<EnumC8598a> listM17923g = videoCaptureConfigM17175J.m17923g();
        if (!videoCaptureConfigM17175J.m17925j()) {
            return EnumC8598a.None;
        }
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        boolean zM44537c = interfaceC11932a != null ? interfaceC11932a.m44537c() : false;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        boolean zM44541g = interfaceC11932a2 != null ? interfaceC11932a2.m44541g() : true;
        if (CollectionsKt.firstOrNull(videoCaptureConfigM17175J.m17923g()) == EnumC8598a.Stream && !C11934c.m44547d()) {
            List<EnumC8598a> listM17923g2 = videoCaptureConfigM17175J.m17923g();
            EnumC8598a enumC8598a2 = EnumC8598a.Upload;
            return listM17923g2.contains(enumC8598a2) ? enumC8598a2 : EnumC8598a.None;
        }
        if (zM44541g) {
            EnumC8598a enumC8598a3 = EnumC8598a.Upload;
            if (listM17923g.contains(enumC8598a3)) {
                return enumC8598a3;
            }
        }
        return (zM44537c || (enumC8598a = (EnumC8598a) CollectionsKt.firstOrNull(listM17923g)) == null) ? EnumC8598a.None : enumC8598a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m44499f(@NotNull GovernmentIdWorkflow.Input renderProps) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        return (renderProps.m17175J().m17925j() && CollectionsKt.firstOrNull(renderProps.m17175J().m17923g()) == EnumC8598a.Stream && !C11934c.m44547d()) ? false : true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (wrap ur.a:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ur.a:0x0004: INVOKE  STATIC call: ur.c.b():ur.a A[MD:():ur.a (m), WRAPPED] (LINE:3)) : (r1v0 ur.a))
     A[MD:(ur.a):void (m)] (LINE:4) call: uo.l.<init>(ur.a):void type: THIS */
    public /* synthetic */ C11905l(InterfaceC11932a interfaceC11932a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C11934c.m44545b() : interfaceC11932a);
    }
}
