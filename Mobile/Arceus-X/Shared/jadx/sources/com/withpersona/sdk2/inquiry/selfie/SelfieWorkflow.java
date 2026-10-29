package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.camera.C3405e;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.C3858g;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.C3953e;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.C4007a;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.p056ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import hn.C6434c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kn.EnumC7638a;
import kn.EnumC7639b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7758y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import mn.EnumC8598a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0388q;
import p059cq.C4197b;
import p083dq.C4658a;
import p132fn.C5689j;
import p134fq.C5776l2;
import p140g0.C5891h1;
import p152go.C6152a;
import p152go.C6159e;
import p178hq.C6544j;
import p226jq.C7259g;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.C7946z0;
import p256ku.InterfaceC7906p0;
import p276ln.InterfaceC8169a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p391qq.C10700c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p419rp.EnumC11024i0;
import p419rp.EnumC11028j1;
import p475uq.C11930a;
import p476ur.C11934c;
import p476ur.InterfaceC11932a;
import p497vp.C12244g;
import p560xu.C12930h;
import p581ym.AbstractC13218k;
import p581ym.AbstractC13225r;
import p581ym.C13230w;
import p581ym.C13233z;
import p581ym.InterfaceC13215h;
import p581ym.InterfaceC13222o;
import p581ym.Snapshot;
import p584yp.EnumC13272a;
import p584yp.EnumC13424x;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import tr.C11742b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00ad\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0085\u0001®\u0001\u0087\u0001\u0089\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JC\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002002\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b5\u00106JC\u00108\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002072\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b8\u00109JC\u0010;\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020:2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b;\u0010<JC\u0010>\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020=2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b>\u0010?JC\u0010A\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020@2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bA\u0010BJC\u0010D\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020C2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020F2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bG\u0010HJC\u0010J\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020I2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bJ\u0010KJC\u0010M\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020L2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bM\u0010NJC\u0010P\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020O2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bP\u0010QJC\u0010S\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020R2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bS\u0010TJC\u0010V\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020U2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^J-\u0010c\u001a\u00020b2\u001c\u0010a\u001a\u00180_R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040`H\u0002¢\u0006\u0004\bc\u0010dJC\u0010f\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020e2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bf\u0010gJC\u0010i\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020h2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bi\u0010jJG\u0010p\u001a\u00020\u0003\"\f\b\u0000\u0010l*\u00020\u0003*\u00020k*\u00160_R\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030`2\u0006\u0010m\u001a\u00028\u00002\b\u0010o\u001a\u0004\u0018\u00010nH\u0002¢\u0006\u0004\bp\u0010qJ3\u0010r\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\br\u0010sJ;\u0010u\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010t\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ7\u0010y\u001a\u00020b*\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lcq/b$a;", "submitVerificationWorker", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lhq/j;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Ldq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "inquiryThemeManager", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lqq/c;", "sdkFilesManager", "Lgo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lhq/j;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;Lgo/e;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "renderState", "Lym/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "D2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "q3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lym/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "B3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "P2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "f2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "K1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "T1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "m2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "P3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "c4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "w1", "Lmn/a;", "b4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;", "Lym/r$c;", "Lym/r;", "updater", "", "Z3", "(Lym/r$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "i3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "x1", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "V3", "(Lym/k$a;)V", "output", "X3", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "W3", "(Lym/k$a;Ljava/lang/Throwable;)V", "props", "Lym/i;", "snapshot", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "y1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lym/k$a;)Ljava/lang/Object;", "state", "a4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcq/b$a;", "c", "Ltr/b$a;", "d", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "e", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "f", "Lhq/j;", "g", "Lcom/withpersona/sdk2/camera/e$a;", "h", "Lhn/c$a;", "i", "Lln/a;", "j", "Luq/a;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "l", "Ldq/a$b;", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "n", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "o", "Lqq/c;", "p", "Lgo/e;", "Lur/a;", "q", "Lur/a;", "webRtcManager", "Ldq/a;", "r", "Ldq/a;", "selfiePoseManager", "s", "Input", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class SelfieWorkflow extends AbstractC13218k<Input, SelfieState, AbstractC3927b, Object> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C4197b.a submitVerificationWorker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C11742b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C3953e.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C6544j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C3405e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C6434c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8169a cameraStatsManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C11930a navigationStateManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final C4658a.b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final C4007a inquiryThemeManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final C3955g selfieEventLogger;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC11932a webRtcManager;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public C4658a selfiePoseManager;

    @Metadata(m31664d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0083\u0001Bµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000202¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b=\u00104J\u001a\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010<R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010NR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bO\u0010_\u001a\u0004\bb\u0010aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bZ\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bV\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bT\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bP\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bj\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bk\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bl\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bm\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bl\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bk\u0010q\u001a\u0004\br\u0010sR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bD\u0010t\u001a\u0004\bB\u0010uR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bj\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b`\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bg\u0010~R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bh\u0010<R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bi\u0010<R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bz\u0010L\u001a\u0004\b\u007f\u0010NR\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bc\u0010\u0082\u0001¨\u0006\u0084\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "orderedPosesBuffered", "", "poseTimeoutMs", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lyp/a;", "designVersion", "fileUploadUrl", "flowWatermarkText", "usePerPoseReveal", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lyp/a;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "y", "b", "u", "c", "s", "d", "t", "e", "Z", "f", "()Z", "m", "g", "p", "h", "I", "i", "K", "j", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "L", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "J", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "Ljava/util/List;", "A", "()Ljava/util/List;", "C", "n", "Ljava/lang/Long;", "G", "()Ljava/lang/Long;", "o", "q", "r", "z", "x", "w", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "N", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "P", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "D", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "E", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "B", "Lyp/a;", "()Lyp/a;", "O", "F", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "Strings", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new C3925a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @NotNull
        public final EnumC13272a designVersion;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        @Nullable
        public final String fileUploadUrl;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        @Nullable
        public final String flowWatermarkText;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        public final boolean usePerPoseReveal;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        @Nullable
        public final CustomPendingPage customPendingPage;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
        @NotNull
        public final Strings strings;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
        @NotNull
        public final SelfieType selfieType;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> orderedPoses;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffered;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsTitle;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsRationale;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsTitle;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsRationale;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        @Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000201HÖ\u0001¢\u0006\u0004\b<\u00103J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010;R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010;R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010;R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010;R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bR\u0010;R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010;R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bU\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bZ\u0010;R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\b[\u0010;R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010;R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\b`\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\ba\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010;R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010;R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\b^\u0010;R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\b\\\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bk\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bf\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bi\u0010;R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bl\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bm\u0010;R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bo\u0010;R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bh\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\bd\u0010;R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bb\u0010;R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bB\u0010;R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bS\u0010;R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\bs\u0010;R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bt\u0010;R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bu\u0010;R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010C\u001a\u0004\bw\u0010;R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010C\u001a\u0004\bx\u0010;R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bM\u0010;R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010C\u001a\u0004\by\u0010;R\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\bp\u0010;R\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bX\u0010;¨\u0006z"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Landroid/os/Parcelable;", "", Title.type, "prompt", "disclosure", "startButton", "capturePageTitle", "capturePageNavBarTitle", "promptPageNavBarTitle", "pendingPageNavBarTitle", "checkPageNavBarTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintLookUp", "selfieHintLookDown", "selfieHintHoldStill", "selfieHintPoseTimeout", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageLabelUp", "selfieCheckPageLabelDown", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "selfieHintLookUpDescription", "selfieHintLookDownDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "r", "c", "n", "d", "h0", "e", "i", "f", "g", "s", "h", "o", "k", "j", "d0", "G", "l", "K", "m", "L", "W", "J", "p", "b0", "q", "Q", "S", "U", "t", "O", "u", "N", "v", "c0", "w", "x", "y", "D", "z", "A", "B", "C", "E", "F", "H", "I", "R", "T", "M", "V", "P", "g0", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new C3924a();

            /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelFront;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelLeft;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelRight;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelUp;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageLabelDown;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnSubmit;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageBtnRetake;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
            @Nullable
            public final String autoCaptureOn;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
            @Nullable
            public final String captureSuccess;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintCenterFaceDescription;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookLeftDescription;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookRightDescription;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUpDescription;

            /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDownDescription;

            /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
            @Nullable
            public final String cameraLoadingTitle;

            /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintVerifying;

            /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintAutoCaptureTimeout;

            /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
            @Nullable
            public final String disclaimer;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
            @NotNull
            public final String startButton;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
            @NotNull
            public final String capturePageTitle;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
            @Nullable
            public final String promptPageNavBarTitle;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintTakePhoto;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintCenterFace;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooClose;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooFar;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintMultipleFaces;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceIncomplete;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintPoseNotCentered;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookLeft;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookRight;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUp;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDown;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintHoldStill;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintPoseTimeout;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageTitle;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageDescription;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input$Strings$a */
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C3924a implements Parcelable.Creator<Strings> {
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Strings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Strings[] newArray(int i10) {
                    return new Strings[i10];
                }
            }

            public Strings(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String startButton, @NotNull String capturePageTitle, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String selfieHintTakePhoto, @NotNull String selfieHintCenterFace, @NotNull String selfieHintFaceTooClose, @NotNull String selfieHintFaceTooFar, @NotNull String selfieHintMultipleFaces, @NotNull String selfieHintFaceIncomplete, @NotNull String selfieHintPoseNotCentered, @NotNull String selfieHintLookLeft, @NotNull String selfieHintLookRight, @Nullable String str5, @Nullable String str6, @NotNull String selfieHintHoldStill, @Nullable String str7, @NotNull String processingTitle, @NotNull String processingDescription, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(startButton, "startButton");
                Intrinsics.checkNotNullParameter(capturePageTitle, "capturePageTitle");
                Intrinsics.checkNotNullParameter(selfieHintTakePhoto, "selfieHintTakePhoto");
                Intrinsics.checkNotNullParameter(selfieHintCenterFace, "selfieHintCenterFace");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooClose, "selfieHintFaceTooClose");
                Intrinsics.checkNotNullParameter(selfieHintFaceTooFar, "selfieHintFaceTooFar");
                Intrinsics.checkNotNullParameter(selfieHintMultipleFaces, "selfieHintMultipleFaces");
                Intrinsics.checkNotNullParameter(selfieHintFaceIncomplete, "selfieHintFaceIncomplete");
                Intrinsics.checkNotNullParameter(selfieHintPoseNotCentered, "selfieHintPoseNotCentered");
                Intrinsics.checkNotNullParameter(selfieHintLookLeft, "selfieHintLookLeft");
                Intrinsics.checkNotNullParameter(selfieHintLookRight, "selfieHintLookRight");
                Intrinsics.checkNotNullParameter(selfieHintHoldStill, "selfieHintHoldStill");
                Intrinsics.checkNotNullParameter(processingTitle, "processingTitle");
                Intrinsics.checkNotNullParameter(processingDescription, "processingDescription");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.startButton = startButton;
                this.capturePageTitle = capturePageTitle;
                this.capturePageNavBarTitle = str;
                this.promptPageNavBarTitle = str2;
                this.pendingPageNavBarTitle = str3;
                this.checkPageNavBarTitle = str4;
                this.selfieHintTakePhoto = selfieHintTakePhoto;
                this.selfieHintCenterFace = selfieHintCenterFace;
                this.selfieHintFaceTooClose = selfieHintFaceTooClose;
                this.selfieHintFaceTooFar = selfieHintFaceTooFar;
                this.selfieHintMultipleFaces = selfieHintMultipleFaces;
                this.selfieHintFaceIncomplete = selfieHintFaceIncomplete;
                this.selfieHintPoseNotCentered = selfieHintPoseNotCentered;
                this.selfieHintLookLeft = selfieHintLookLeft;
                this.selfieHintLookRight = selfieHintLookRight;
                this.selfieHintLookUp = str5;
                this.selfieHintLookDown = str6;
                this.selfieHintHoldStill = selfieHintHoldStill;
                this.selfieHintPoseTimeout = str7;
                this.processingTitle = processingTitle;
                this.processingDescription = processingDescription;
                this.selfieCheckPageTitle = str8;
                this.selfieCheckPageDescription = str9;
                this.selfieCheckPageLabelFront = str10;
                this.selfieCheckPageLabelLeft = str11;
                this.selfieCheckPageLabelRight = str12;
                this.selfieCheckPageLabelUp = str13;
                this.selfieCheckPageLabelDown = str14;
                this.selfieCheckPageBtnSubmit = str15;
                this.selfieCheckPageBtnRetake = str16;
                this.autoCaptureOn = str17;
                this.captureSuccess = str18;
                this.selfieHintCenterFaceDescription = str19;
                this.selfieHintLookLeftDescription = str20;
                this.selfieHintLookRightDescription = str21;
                this.selfieHintLookUpDescription = str22;
                this.selfieHintLookDownDescription = str23;
                this.cameraLoadingTitle = str24;
                this.selfieHintVerifying = str25;
                this.selfieHintAutoCaptureTimeout = str26;
                this.disclaimer = str27;
            }

            @Nullable
            /* JADX INFO: renamed from: A, reason: from getter */
            public final String getSelfieCheckPageLabelRight() {
                return this.selfieCheckPageLabelRight;
            }

            @Nullable
            /* JADX INFO: renamed from: C, reason: from getter */
            public final String getSelfieCheckPageLabelUp() {
                return this.selfieCheckPageLabelUp;
            }

            @Nullable
            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getSelfieCheckPageTitle() {
                return this.selfieCheckPageTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: E, reason: from getter */
            public final String getSelfieHintAutoCaptureTimeout() {
                return this.selfieHintAutoCaptureTimeout;
            }

            @NotNull
            /* JADX INFO: renamed from: G, reason: from getter */
            public final String getSelfieHintCenterFace() {
                return this.selfieHintCenterFace;
            }

            @Nullable
            /* JADX INFO: renamed from: I, reason: from getter */
            public final String getSelfieHintCenterFaceDescription() {
                return this.selfieHintCenterFaceDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: J, reason: from getter */
            public final String getSelfieHintFaceIncomplete() {
                return this.selfieHintFaceIncomplete;
            }

            @NotNull
            /* JADX INFO: renamed from: K, reason: from getter */
            public final String getSelfieHintFaceTooClose() {
                return this.selfieHintFaceTooClose;
            }

            @NotNull
            /* JADX INFO: renamed from: L, reason: from getter */
            public final String getSelfieHintFaceTooFar() {
                return this.selfieHintFaceTooFar;
            }

            @NotNull
            /* JADX INFO: renamed from: N, reason: from getter */
            public final String getSelfieHintHoldStill() {
                return this.selfieHintHoldStill;
            }

            @Nullable
            /* JADX INFO: renamed from: O, reason: from getter */
            public final String getSelfieHintLookDown() {
                return this.selfieHintLookDown;
            }

            @Nullable
            /* JADX INFO: renamed from: P, reason: from getter */
            public final String getSelfieHintLookDownDescription() {
                return this.selfieHintLookDownDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: Q, reason: from getter */
            public final String getSelfieHintLookLeft() {
                return this.selfieHintLookLeft;
            }

            @Nullable
            /* JADX INFO: renamed from: R, reason: from getter */
            public final String getSelfieHintLookLeftDescription() {
                return this.selfieHintLookLeftDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: S, reason: from getter */
            public final String getSelfieHintLookRight() {
                return this.selfieHintLookRight;
            }

            @Nullable
            /* JADX INFO: renamed from: T, reason: from getter */
            public final String getSelfieHintLookRightDescription() {
                return this.selfieHintLookRightDescription;
            }

            @Nullable
            /* JADX INFO: renamed from: U, reason: from getter */
            public final String getSelfieHintLookUp() {
                return this.selfieHintLookUp;
            }

            @Nullable
            /* JADX INFO: renamed from: V, reason: from getter */
            public final String getSelfieHintLookUpDescription() {
                return this.selfieHintLookUpDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: W, reason: from getter */
            public final String getSelfieHintMultipleFaces() {
                return this.selfieHintMultipleFaces;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAutoCaptureOn() {
                return this.autoCaptureOn;
            }

            @NotNull
            /* JADX INFO: renamed from: b0, reason: from getter */
            public final String getSelfieHintPoseNotCentered() {
                return this.selfieHintPoseNotCentered;
            }

            @Nullable
            /* JADX INFO: renamed from: c0, reason: from getter */
            public final String getSelfieHintPoseTimeout() {
                return this.selfieHintPoseTimeout;
            }

            @NotNull
            /* JADX INFO: renamed from: d0, reason: from getter */
            public final String getSelfieHintTakePhoto() {
                return this.selfieHintTakePhoto;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Strings)) {
                    return false;
                }
                Strings strings = (Strings) other;
                return Intrinsics.m31980c(this.title, strings.title) && Intrinsics.m31980c(this.prompt, strings.prompt) && Intrinsics.m31980c(this.disclosure, strings.disclosure) && Intrinsics.m31980c(this.startButton, strings.startButton) && Intrinsics.m31980c(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.m31980c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.m31980c(this.promptPageNavBarTitle, strings.promptPageNavBarTitle) && Intrinsics.m31980c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.m31980c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.m31980c(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.m31980c(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.m31980c(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.m31980c(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.m31980c(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.m31980c(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.m31980c(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.m31980c(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.m31980c(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.m31980c(this.selfieHintLookUp, strings.selfieHintLookUp) && Intrinsics.m31980c(this.selfieHintLookDown, strings.selfieHintLookDown) && Intrinsics.m31980c(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.m31980c(this.selfieHintPoseTimeout, strings.selfieHintPoseTimeout) && Intrinsics.m31980c(this.processingTitle, strings.processingTitle) && Intrinsics.m31980c(this.processingDescription, strings.processingDescription) && Intrinsics.m31980c(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.m31980c(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.m31980c(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.m31980c(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.m31980c(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.m31980c(this.selfieCheckPageLabelUp, strings.selfieCheckPageLabelUp) && Intrinsics.m31980c(this.selfieCheckPageLabelDown, strings.selfieCheckPageLabelDown) && Intrinsics.m31980c(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.m31980c(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.m31980c(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.m31980c(this.captureSuccess, strings.captureSuccess) && Intrinsics.m31980c(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.m31980c(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.m31980c(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.m31980c(this.selfieHintLookUpDescription, strings.selfieHintLookUpDescription) && Intrinsics.m31980c(this.selfieHintLookDownDescription, strings.selfieHintLookDownDescription) && Intrinsics.m31980c(this.cameraLoadingTitle, strings.cameraLoadingTitle) && Intrinsics.m31980c(this.selfieHintVerifying, strings.selfieHintVerifying) && Intrinsics.m31980c(this.selfieHintAutoCaptureTimeout, strings.selfieHintAutoCaptureTimeout) && Intrinsics.m31980c(this.disclaimer, strings.disclaimer);
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCameraLoadingTitle() {
                return this.cameraLoadingTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getCapturePageNavBarTitle() {
                return this.capturePageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: g0, reason: from getter */
            public final String getSelfieHintVerifying() {
                return this.selfieHintVerifying;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* JADX INFO: renamed from: h0, reason: from getter */
            public final String getStartButton() {
                return this.startButton;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.title.hashCode() * 31) + this.prompt.hashCode()) * 31) + this.disclosure.hashCode()) * 31) + this.startButton.hashCode()) * 31) + this.capturePageTitle.hashCode()) * 31;
                String str = this.capturePageNavBarTitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.promptPageNavBarTitle;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.pendingPageNavBarTitle;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.checkPageNavBarTitle;
                int iHashCode5 = (((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.selfieHintTakePhoto.hashCode()) * 31) + this.selfieHintCenterFace.hashCode()) * 31) + this.selfieHintFaceTooClose.hashCode()) * 31) + this.selfieHintFaceTooFar.hashCode()) * 31) + this.selfieHintMultipleFaces.hashCode()) * 31) + this.selfieHintFaceIncomplete.hashCode()) * 31) + this.selfieHintPoseNotCentered.hashCode()) * 31) + this.selfieHintLookLeft.hashCode()) * 31) + this.selfieHintLookRight.hashCode()) * 31;
                String str5 = this.selfieHintLookUp;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.selfieHintLookDown;
                int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.selfieHintHoldStill.hashCode()) * 31;
                String str7 = this.selfieHintPoseTimeout;
                int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.processingTitle.hashCode()) * 31) + this.processingDescription.hashCode()) * 31;
                String str8 = this.selfieCheckPageTitle;
                int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.selfieCheckPageDescription;
                int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.selfieCheckPageLabelFront;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.selfieCheckPageLabelLeft;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.selfieCheckPageLabelRight;
                int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.selfieCheckPageLabelUp;
                int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.selfieCheckPageLabelDown;
                int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
                String str15 = this.selfieCheckPageBtnSubmit;
                int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
                String str16 = this.selfieCheckPageBtnRetake;
                int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
                String str17 = this.autoCaptureOn;
                int iHashCode18 = (iHashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
                String str18 = this.captureSuccess;
                int iHashCode19 = (iHashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31;
                String str19 = this.selfieHintCenterFaceDescription;
                int iHashCode20 = (iHashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
                String str20 = this.selfieHintLookLeftDescription;
                int iHashCode21 = (iHashCode20 + (str20 == null ? 0 : str20.hashCode())) * 31;
                String str21 = this.selfieHintLookRightDescription;
                int iHashCode22 = (iHashCode21 + (str21 == null ? 0 : str21.hashCode())) * 31;
                String str22 = this.selfieHintLookUpDescription;
                int iHashCode23 = (iHashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
                String str23 = this.selfieHintLookDownDescription;
                int iHashCode24 = (iHashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
                String str24 = this.cameraLoadingTitle;
                int iHashCode25 = (iHashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
                String str25 = this.selfieHintVerifying;
                int iHashCode26 = (iHashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
                String str26 = this.selfieHintAutoCaptureTimeout;
                int iHashCode27 = (iHashCode26 + (str26 == null ? 0 : str26.hashCode())) * 31;
                String str27 = this.disclaimer;
                return iHashCode27 + (str27 != null ? str27.hashCode() : 0);
            }

            @NotNull
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getCapturePageTitle() {
                return this.capturePageTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getCaptureSuccess() {
                return this.captureSuccess;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getCheckPageNavBarTitle() {
                return this.checkPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getPendingPageNavBarTitle() {
                return this.pendingPageNavBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final String getProcessingDescription() {
                return this.processingDescription;
            }

            @NotNull
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getProcessingTitle() {
                return this.processingTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @Nullable
            /* JADX INFO: renamed from: s, reason: from getter */
            public final String getPromptPageNavBarTitle() {
                return this.promptPageNavBarTitle;
            }

            @Nullable
            /* JADX INFO: renamed from: t, reason: from getter */
            public final String getSelfieCheckPageBtnRetake() {
                return this.selfieCheckPageBtnRetake;
            }

            @NotNull
            public String toString() {
                return "Strings(title=" + this.title + ", prompt=" + this.prompt + ", disclosure=" + this.disclosure + ", startButton=" + this.startButton + ", capturePageTitle=" + this.capturePageTitle + ", capturePageNavBarTitle=" + this.capturePageNavBarTitle + ", promptPageNavBarTitle=" + this.promptPageNavBarTitle + ", pendingPageNavBarTitle=" + this.pendingPageNavBarTitle + ", checkPageNavBarTitle=" + this.checkPageNavBarTitle + ", selfieHintTakePhoto=" + this.selfieHintTakePhoto + ", selfieHintCenterFace=" + this.selfieHintCenterFace + ", selfieHintFaceTooClose=" + this.selfieHintFaceTooClose + ", selfieHintFaceTooFar=" + this.selfieHintFaceTooFar + ", selfieHintMultipleFaces=" + this.selfieHintMultipleFaces + ", selfieHintFaceIncomplete=" + this.selfieHintFaceIncomplete + ", selfieHintPoseNotCentered=" + this.selfieHintPoseNotCentered + ", selfieHintLookLeft=" + this.selfieHintLookLeft + ", selfieHintLookRight=" + this.selfieHintLookRight + ", selfieHintLookUp=" + this.selfieHintLookUp + ", selfieHintLookDown=" + this.selfieHintLookDown + ", selfieHintHoldStill=" + this.selfieHintHoldStill + ", selfieHintPoseTimeout=" + this.selfieHintPoseTimeout + ", processingTitle=" + this.processingTitle + ", processingDescription=" + this.processingDescription + ", selfieCheckPageTitle=" + this.selfieCheckPageTitle + ", selfieCheckPageDescription=" + this.selfieCheckPageDescription + ", selfieCheckPageLabelFront=" + this.selfieCheckPageLabelFront + ", selfieCheckPageLabelLeft=" + this.selfieCheckPageLabelLeft + ", selfieCheckPageLabelRight=" + this.selfieCheckPageLabelRight + ", selfieCheckPageLabelUp=" + this.selfieCheckPageLabelUp + ", selfieCheckPageLabelDown=" + this.selfieCheckPageLabelDown + ", selfieCheckPageBtnSubmit=" + this.selfieCheckPageBtnSubmit + ", selfieCheckPageBtnRetake=" + this.selfieCheckPageBtnRetake + ", autoCaptureOn=" + this.autoCaptureOn + ", captureSuccess=" + this.captureSuccess + ", selfieHintCenterFaceDescription=" + this.selfieHintCenterFaceDescription + ", selfieHintLookLeftDescription=" + this.selfieHintLookLeftDescription + ", selfieHintLookRightDescription=" + this.selfieHintLookRightDescription + ", selfieHintLookUpDescription=" + this.selfieHintLookUpDescription + ", selfieHintLookDownDescription=" + this.selfieHintLookDownDescription + ", cameraLoadingTitle=" + this.cameraLoadingTitle + ", selfieHintVerifying=" + this.selfieHintVerifying + ", selfieHintAutoCaptureTimeout=" + this.selfieHintAutoCaptureTimeout + ", disclaimer=" + this.disclaimer + ")";
            }

            @Nullable
            /* JADX INFO: renamed from: u, reason: from getter */
            public final String getSelfieCheckPageBtnSubmit() {
                return this.selfieCheckPageBtnSubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: v, reason: from getter */
            public final String getSelfieCheckPageDescription() {
                return this.selfieCheckPageDescription;
            }

            @Nullable
            /* JADX INFO: renamed from: w, reason: from getter */
            public final String getSelfieCheckPageLabelDown() {
                return this.selfieCheckPageLabelDown;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.title);
                dest.writeString(this.prompt);
                dest.writeString(this.disclosure);
                dest.writeString(this.startButton);
                dest.writeString(this.capturePageTitle);
                dest.writeString(this.capturePageNavBarTitle);
                dest.writeString(this.promptPageNavBarTitle);
                dest.writeString(this.pendingPageNavBarTitle);
                dest.writeString(this.checkPageNavBarTitle);
                dest.writeString(this.selfieHintTakePhoto);
                dest.writeString(this.selfieHintCenterFace);
                dest.writeString(this.selfieHintFaceTooClose);
                dest.writeString(this.selfieHintFaceTooFar);
                dest.writeString(this.selfieHintMultipleFaces);
                dest.writeString(this.selfieHintFaceIncomplete);
                dest.writeString(this.selfieHintPoseNotCentered);
                dest.writeString(this.selfieHintLookLeft);
                dest.writeString(this.selfieHintLookRight);
                dest.writeString(this.selfieHintLookUp);
                dest.writeString(this.selfieHintLookDown);
                dest.writeString(this.selfieHintHoldStill);
                dest.writeString(this.selfieHintPoseTimeout);
                dest.writeString(this.processingTitle);
                dest.writeString(this.processingDescription);
                dest.writeString(this.selfieCheckPageTitle);
                dest.writeString(this.selfieCheckPageDescription);
                dest.writeString(this.selfieCheckPageLabelFront);
                dest.writeString(this.selfieCheckPageLabelLeft);
                dest.writeString(this.selfieCheckPageLabelRight);
                dest.writeString(this.selfieCheckPageLabelUp);
                dest.writeString(this.selfieCheckPageLabelDown);
                dest.writeString(this.selfieCheckPageBtnSubmit);
                dest.writeString(this.selfieCheckPageBtnRetake);
                dest.writeString(this.autoCaptureOn);
                dest.writeString(this.captureSuccess);
                dest.writeString(this.selfieHintCenterFaceDescription);
                dest.writeString(this.selfieHintLookLeftDescription);
                dest.writeString(this.selfieHintLookRightDescription);
                dest.writeString(this.selfieHintLookUpDescription);
                dest.writeString(this.selfieHintLookDownDescription);
                dest.writeString(this.cameraLoadingTitle);
                dest.writeString(this.selfieHintVerifying);
                dest.writeString(this.selfieHintAutoCaptureTimeout);
                dest.writeString(this.disclaimer);
            }

            @Nullable
            /* JADX INFO: renamed from: x, reason: from getter */
            public final String getSelfieCheckPageLabelFront() {
                return this.selfieCheckPageLabelFront;
            }

            @Nullable
            /* JADX INFO: renamed from: z, reason: from getter */
            public final String getSelfieCheckPageLabelLeft() {
                return this.selfieCheckPageLabelLeft;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3925a implements Parcelable.Creator<Input> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Input createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z10 = true;
                if (parcel.readInt() == 0) {
                    z10 = false;
                }
                boolean z11 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                boolean z12 = parcel.readInt() != 0 ? z10 : false;
                boolean z13 = parcel.readInt() != 0 ? z10 : false;
                Strings stringsCreateFromParcel = Strings.CREATOR.createFromParcel(parcel);
                SelfieType selfieType = (SelfieType) parcel.readParcelable(Input.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(PoseInfo.CREATOR.createFromParcel(parcel));
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int i13 = 0;
                    while (i13 != i12) {
                        arrayList.add(PoseInfo.CREATOR.createFromParcel(parcel));
                        i13++;
                        i12 = i12;
                    }
                }
                return new Input(string, string2, string3, string4, z10, z11, string5, z12, z13, stringsCreateFromParcel, selfieType, arrayList2, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.SelfieStepStyle) parcel.readParcelable(Input.class.getClassLoader()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.Selfie.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), PoseConfigs.CREATOR.createFromParcel(parcel), EnumC13272a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull Strings strings, @NotNull SelfieType selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable List<PoseInfo> list, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.Selfie.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @NotNull PoseConfigs poseConfigs, @NotNull EnumC13272a designVersion, @Nullable String str9, @Nullable String str10, boolean z14, @Nullable CustomPendingPage customPendingPage) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(fromComponent, "fromComponent");
            Intrinsics.checkNotNullParameter(fromStep, "fromStep");
            Intrinsics.checkNotNullParameter(fieldKeySelfie, "fieldKeySelfie");
            Intrinsics.checkNotNullParameter(strings, "strings");
            Intrinsics.checkNotNullParameter(selfieType, "selfieType");
            Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
            Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
            Intrinsics.checkNotNullParameter(assetConfig, "assetConfig");
            Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
            Intrinsics.checkNotNullParameter(designVersion, "designVersion");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z10;
            this.cancelButtonEnabled = z11;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z12;
            this.skipPromptPage = z13;
            this.strings = strings;
            this.selfieType = selfieType;
            this.orderedPoses = orderedPoses;
            this.orderedPosesBuffered = list;
            this.poseTimeoutMs = l10;
            this.cameraPermissionsTitle = str;
            this.cameraPermissionsRationale = str2;
            this.cameraPermissionsModalPositiveButton = str3;
            this.cameraPermissionsModalNegativeButton = str4;
            this.microphonePermissionsTitle = str5;
            this.microphonePermissionsRationale = str6;
            this.microphonePermissionsModalPositiveButton = str7;
            this.microphonePermissionsModalNegativeButton = str8;
            this.styles = selfieStepStyle;
            this.videoCaptureConfig = videoCaptureConfig;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.poseConfigs = poseConfigs;
            this.designVersion = designVersion;
            this.fileUploadUrl = str9;
            this.flowWatermarkText = str10;
            this.usePerPoseReveal = z14;
            this.customPendingPage = customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: A */
        public final List<PoseInfo> m19683A() {
            return this.orderedPoses;
        }

        @Nullable
        /* JADX INFO: renamed from: C */
        public final List<PoseInfo> m19684C() {
            return this.orderedPosesBuffered;
        }

        @NotNull
        /* JADX INFO: renamed from: D, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        @NotNull
        /* JADX INFO: renamed from: E, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        @Nullable
        /* JADX INFO: renamed from: G, reason: from getter */
        public final Long getPoseTimeoutMs() {
            return this.poseTimeoutMs;
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final SelfieType getSelfieType() {
            return this.selfieType;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final Strings getStrings() {
            return this.strings;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final boolean getUsePerPoseReveal() {
            return this.usePerPoseReveal;
        }

        @NotNull
        /* JADX INFO: renamed from: P, reason: from getter */
        public final VideoCaptureConfig getVideoCaptureConfig() {
            return this.videoCaptureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return Intrinsics.m31980c(this.sessionToken, input.sessionToken) && Intrinsics.m31980c(this.inquiryId, input.inquiryId) && Intrinsics.m31980c(this.fromComponent, input.fromComponent) && Intrinsics.m31980c(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.m31980c(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.m31980c(this.strings, input.strings) && Intrinsics.m31980c(this.selfieType, input.selfieType) && Intrinsics.m31980c(this.orderedPoses, input.orderedPoses) && Intrinsics.m31980c(this.orderedPosesBuffered, input.orderedPosesBuffered) && Intrinsics.m31980c(this.poseTimeoutMs, input.poseTimeoutMs) && Intrinsics.m31980c(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.m31980c(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.m31980c(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.m31980c(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.m31980c(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.m31980c(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.m31980c(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.m31980c(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.m31980c(this.styles, input.styles) && Intrinsics.m31980c(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.m31980c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.m31980c(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion && Intrinsics.m31980c(this.fileUploadUrl, input.fileUploadUrl) && Intrinsics.m31980c(this.flowWatermarkText, input.flowWatermarkText) && this.usePerPoseReveal == input.usePerPoseReveal && Intrinsics.m31980c(this.customPendingPage, input.customPendingPage);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getCameraPermissionsModalNegativeButton() {
            return this.cameraPermissionsModalNegativeButton;
        }

        public int hashCode() {
            int iHashCode = ((((((((((((((((((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.strings.hashCode()) * 31) + this.selfieType.hashCode()) * 31) + this.orderedPoses.hashCode()) * 31;
            List<PoseInfo> list = this.orderedPosesBuffered;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Long l10 = this.poseTimeoutMs;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.cameraPermissionsTitle;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cameraPermissionsRationale;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.cameraPermissionsModalPositiveButton;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cameraPermissionsModalNegativeButton;
            int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.microphonePermissionsTitle;
            int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.microphonePermissionsRationale;
            int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.microphonePermissionsModalPositiveButton;
            int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.microphonePermissionsModalNegativeButton;
            int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode12 = (((((((((((iHashCode11 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31) + this.videoCaptureConfig.hashCode()) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + this.poseConfigs.hashCode()) * 31) + this.designVersion.hashCode()) * 31;
            String str9 = this.fileUploadUrl;
            int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.flowWatermarkText;
            int iHashCode14 = (((iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.usePerPoseReveal)) * 31;
            CustomPendingPage customPendingPage = this.customPendingPage;
            return iHashCode14 + (customPendingPage != null ? customPendingPage.hashCode() : 0);
        }

        @Nullable
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getCameraPermissionsModalPositiveButton() {
            return this.cameraPermissionsModalPositiveButton;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getCameraPermissionsRationale() {
            return this.cameraPermissionsRationale;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getCameraPermissionsTitle() {
            return this.cameraPermissionsTitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public final CustomPendingPage getCustomPendingPage() {
            return this.customPendingPage;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final EnumC13272a getDesignVersion() {
            return this.designVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        @Nullable
        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getFileUploadUrl() {
            return this.fileUploadUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getFlowWatermarkText() {
            return this.flowWatermarkText;
        }

        @NotNull
        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        @NotNull
        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @NotNull
        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", strings=" + this.strings + ", selfieType=" + this.selfieType + ", orderedPoses=" + this.orderedPoses + ", orderedPosesBuffered=" + this.orderedPosesBuffered + ", poseTimeoutMs=" + this.poseTimeoutMs + ", cameraPermissionsTitle=" + this.cameraPermissionsTitle + ", cameraPermissionsRationale=" + this.cameraPermissionsRationale + ", cameraPermissionsModalPositiveButton=" + this.cameraPermissionsModalPositiveButton + ", cameraPermissionsModalNegativeButton=" + this.cameraPermissionsModalNegativeButton + ", microphonePermissionsTitle=" + this.microphonePermissionsTitle + ", microphonePermissionsRationale=" + this.microphonePermissionsRationale + ", microphonePermissionsModalPositiveButton=" + this.microphonePermissionsModalPositiveButton + ", microphonePermissionsModalNegativeButton=" + this.microphonePermissionsModalNegativeButton + ", styles=" + this.styles + ", videoCaptureConfig=" + this.videoCaptureConfig + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", poseConfigs=" + this.poseConfigs + ", designVersion=" + this.designVersion + ", fileUploadUrl=" + this.fileUploadUrl + ", flowWatermarkText=" + this.flowWatermarkText + ", usePerPoseReveal=" + this.usePerPoseReveal + ", customPendingPage=" + this.customPendingPage + ")";
        }

        @NotNull
        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        @Nullable
        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getMicrophonePermissionsModalNegativeButton() {
            return this.microphonePermissionsModalNegativeButton;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final String getMicrophonePermissionsModalPositiveButton() {
            return this.microphonePermissionsModalPositiveButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            this.strings.writeToParcel(dest, flags);
            dest.writeParcelable(this.selfieType, flags);
            List<PoseInfo> list = this.orderedPoses;
            dest.writeInt(list.size());
            Iterator<PoseInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<PoseInfo> list2 = this.orderedPosesBuffered;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<PoseInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            Long l10 = this.poseTimeoutMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
            dest.writeString(this.cameraPermissionsTitle);
            dest.writeString(this.cameraPermissionsRationale);
            dest.writeString(this.cameraPermissionsModalPositiveButton);
            dest.writeString(this.cameraPermissionsModalNegativeButton);
            dest.writeString(this.microphonePermissionsTitle);
            dest.writeString(this.microphonePermissionsRationale);
            dest.writeString(this.microphonePermissionsModalPositiveButton);
            dest.writeString(this.microphonePermissionsModalNegativeButton);
            dest.writeParcelable(this.styles, flags);
            this.videoCaptureConfig.writeToParcel(dest, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            this.poseConfigs.writeToParcel(dest, flags);
            dest.writeString(this.designVersion.name());
            dest.writeString(this.fileUploadUrl);
            dest.writeString(this.flowWatermarkText);
            dest.writeInt(this.usePerPoseReveal ? 1 : 0);
            dest.writeParcelable(this.customPendingPage, flags);
        }

        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getMicrophonePermissionsRationale() {
            return this.microphonePermissionsRationale;
        }

        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getMicrophonePermissionsTitle() {
            return this.microphonePermissionsTitle;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "<init>", "()V", "b", "d", "a", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3927b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$a */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class a extends AbstractC3927b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final a f16223a = new a();

            public a() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 869674411;
            }

            @NotNull
            public String toString() {
                return "Back";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$b */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class b extends AbstractC3927b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final b f16224a = new b();

            public b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1455860573;
            }

            @NotNull
            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$c, reason: from toString */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class Error extends AbstractC3927b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @NotNull
            public final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull InternalErrorInfo cause) {
                super(null);
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.m31980c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$d */
        @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class d extends AbstractC3927b {

            /* JADX INFO: renamed from: a */
            @NotNull
            public static final d f16226a = new d();

            public d() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 905373494;
            }

            @NotNull
            public String toString() {
                return "Finished";
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3927b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3927b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "<init>", "()V", "b", "e", "c", "a", "f", "g", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class AbstractC3928c {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a */
        @Metadata(m31664d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bL\u0018\u00002\u00020\u0001:\u0002>BB\u009d\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020\f\u0012\u0006\u00100\u001a\u00020\f\u0012\u0006\u00101\u001a\u00020\f\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0019\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bJ\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bM\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010]\u001a\u0004\b`\u0010_R'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b8\u0006¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bd\u0010_R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b`\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bd\u0010n\u001a\u0004\bG\u0010oR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bF\u0010rR#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bs\u0010a\u001a\u0004\be\u0010cR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bJ\u0010t\u001a\u0004\bs\u0010uR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bD\u0010xR\u0017\u0010-\u001a\u00020'8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bN\u0010{R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\b|\u0010QR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\b}\u0010QR\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\b~\u0010QR\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\b\u007f\u0010QR#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bl\u0010cR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bp\u0010\u0081\u0001R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bm\u0010O\u001a\u0004\by\u0010QR\u0017\u00106\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bv\u0010QR\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b}\u0010O\u001a\u0004\b>\u0010QR\u0019\u00109\u001a\u0002088\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0082\u0001\u001a\u0005\bK\u0010\u0083\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010?\u001a\u0004\bt\u0010AR\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010?\u001a\u0004\b\\\u0010A¨\u0006\u0084\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "description", "autoCaptureText", "captureSuccessText", "disclaimerText", "realTimeHint", "hintAutoCaptureTimeoutText", "hintVerifyingText", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "onCameraFacingModeSelected", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isFlashOn", "isDimLightConditions", "onFlashSet", "Lkn/a;", "pose", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lyp/a;", "designVersion", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lkotlin/jvm/functions/Function1;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZLkotlin/jvm/functions/Function1;Lkn/a;ZZZLyp/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "b", "m", "c", "g", "d", "e", "f", "i", "y", "h", "k", "l", "j", "Z", "I", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "B", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "p", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "t", "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "v", "s", "Lmn/a;", "E", "()Lmn/a;", "Lur/a;", "G", "()Lur/a;", "u", "H", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "w", "Lhn/c$a;", "()Lhn/c$a;", "x", "F", "()F", "z", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "A", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "L", "J", "M", "K", "Lkn/a;", "()Lkn/a;", "Lyp/a;", "()Lyp/a;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a extends AbstractC3928c {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            @NotNull
            public final CameraProperties.EnumC3397b facingMode;

            /* JADX INFO: renamed from: B, reason: from kotlin metadata */
            public final boolean isFlashEnabled;

            /* JADX INFO: renamed from: C, reason: from kotlin metadata */
            public final boolean isAutoFlashOnManualCaptureEnabled;

            /* JADX INFO: renamed from: D, reason: from kotlin metadata */
            public final boolean isFlashOn;

            /* JADX INFO: renamed from: E, reason: from kotlin metadata */
            public final boolean isDimLightConditions;

            /* JADX INFO: renamed from: F, reason: from kotlin metadata */
            @NotNull
            public final Function1<Boolean, Unit> onFlashSet;

            /* JADX INFO: renamed from: G, reason: from kotlin metadata */
            @Nullable
            public final EnumC7638a pose;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            public final boolean requestingPermissions;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            public final boolean allowSwitchCamera;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            @NotNull
            public final EnumC13272a designVersion;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final String description;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            public final String autoCaptureText;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            public final String captureSuccessText;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @Nullable
            public final String disclaimerText;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @Nullable
            public final String realTimeHint;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @Nullable
            public final String hintAutoCaptureTimeoutText;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @Nullable
            public final String hintVerifyingText;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            public final boolean isAutoCaptureOn;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @NotNull
            public final AbstractC14138a mode;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            @NotNull
            public final EnumC8598a videoCaptureMethod;

            /* JADX INFO: renamed from: t, reason: from kotlin metadata */
            @Nullable
            public final InterfaceC11932a webRtcManager;

            /* JADX INFO: renamed from: u, reason: from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: v, reason: from kotlin metadata */
            @NotNull
            public final C3405e.a cameraXControllerFactory;

            /* JADX INFO: renamed from: w, reason: from kotlin metadata */
            @NotNull
            public final C6434c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: x, reason: from kotlin metadata */
            @NotNull
            public final Function1<CameraProperties.EnumC3397b, Unit> onCameraFacingModeSelected;

            /* JADX INFO: renamed from: y, reason: from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: z, reason: from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\u0005\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "h", "j", "g", "c", "i", "e", "f", "b", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static abstract class AbstractC14138a {

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$a, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "sessionToken", "inquiryId", "stepName", "Lkotlin/Function2;", "Lkn/a;", "", "", "onComplete", "Lkotlin/Function1;", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "c", "getInquiryId", "d", "getStepName", "e", "Lkotlin/jvm/functions/Function2;", "getOnComplete", "()Lkotlin/jvm/functions/Function2;", "f", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14139a extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final String sessionToken;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    @NotNull
                    public final String inquiryId;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    @NotNull
                    public final String stepName;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    @NotNull
                    public final Function2<EnumC7638a, Boolean, Unit> onComplete;

                    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super kn.a, ? super java.lang.Boolean, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C14139a(@NotNull b overlay, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull Function2<? super EnumC7638a, ? super Boolean, Unit> onComplete, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
                        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                        Intrinsics.checkNotNullParameter(stepName, "stepName");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.sessionToken = sessionToken;
                        this.inquiryId = inquiryId;
                        this.stepName = stepName;
                        this.onComplete = onComplete;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$b */
                @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class b extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(@NotNull b overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.isCapturing = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$c */
                @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "countDown", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;I)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "I", "()I", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class c extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final int countDown;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(@NotNull b overlay, int i10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.countDown = i10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$d */
                @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "d", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class d extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(@NotNull b overlay, @NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        this.overlay = overlay;
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function1<File, Unit> m19805b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function0<Unit> m19806c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$e */
                @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "()Z", "e", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class e extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public e(@NotNull b overlay, @NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.isCapturing = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function1<Throwable, Unit> m19809c() {
                        return this.onError;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: d */
                    public final Function1<String, Unit> m19810d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$f */
                @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onCaptureClicked", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class f extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull b overlay, @NotNull Function0<Unit> onCaptureClicked) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        this.overlay = overlay;
                        this.onCaptureClicked = onCaptureClicked;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function0<Unit> m19812b() {
                        return this.onCaptureClicked;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$g */
                @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "poseHintComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class g extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public g(@NotNull b overlay, @NotNull Function0<Unit> poseHintComplete) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        this.overlay = overlay;
                        this.poseHintComplete = poseHintComplete;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function0<Unit> m19813b() {
                        return this.poseHintComplete;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$h */
                @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Z", "e", "()Z", "c", "J", "()J", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class h extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public h(@NotNull b overlay, boolean z10, long j10, @NotNull Function1<? super CameraProperties, Unit> previewReady, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.overlay = overlay;
                        this.recordLocalVideo = z10;
                        this.maxRecordingLengthMs = j10;
                        this.previewReady = previewReady;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function1<Throwable, Unit> m19815c() {
                        return this.onError;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: d */
                    public final Function1<CameraProperties, Unit> m19816d() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$i */
                @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class i extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull b overlay, @NotNull Function0<Unit> onComplete, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        this.overlay = overlay;
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function0<Unit> m19819c() {
                        return this.onComplete;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$j */
                @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "maxRecordingLengthMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;J)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "J", "()J", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class j extends AbstractC14138a {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public j(@NotNull b overlay, long j10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.a.AbstractC14138a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.a.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ AbstractC14138a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract b getOverlay();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public AbstractC14138a() {
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$b */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public enum b {
                CLEAR,
                CENTER,
                LOOK_LEFT,
                LOOK_RIGHT,
                LOOK_UP,
                LOOK_DOWN,
                FINALIZING;


                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ InterfaceC10707a f16307i = C10708b.m40805a(m19821a());
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
              (r43v0 java.lang.String)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r82v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
              (r45v0 java.lang.String)
              (r46v0 java.lang.String)
              (r47v0 java.lang.String)
              (r48v0 java.lang.String)
              (r49v0 java.lang.String)
              (r50v0 java.lang.String)
              (r51v0 java.lang.String)
              (r52v0 boolean)
              (r53v0 com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a)
              (r54v0 com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle)
              (r55v0 boolean)
              (r56v0 com.withpersona.sdk2.inquiry.shared.navigation.NavigationState)
              (r57v0 kotlin.jvm.functions.Function0)
              (r58v0 kotlin.jvm.functions.Function0)
              (r59v0 kotlin.jvm.functions.Function1)
              (r60v0 kotlin.jvm.functions.Function0)
              (r61v0 mn.a)
              (r62v0 ur.a)
              (r63v0 boolean)
              (r64v0 com.withpersona.sdk2.camera.e$a)
              (r65v0 hn.c$a)
              (r66v0 kotlin.jvm.functions.Function1)
              (r67v0 float)
              (r68v0 com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo)
              (r69v0 com.withpersona.sdk2.camera.CameraProperties$b)
              (r70v0 boolean)
              (r71v0 boolean)
              (r72v0 boolean)
              (r73v0 boolean)
              (r74v0 kotlin.jvm.functions.Function1)
              (r75v0 kn.a)
              (r76v0 boolean)
              (r77v0 boolean)
              (r78v0 boolean)
              (r79v0 yp.a)
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0009: ARITH (r83v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r80v0 java.lang.String))
              (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0012: ARITH (r83v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r81v0 java.lang.String))
             A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle, boolean, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, mn.a, ur.a, boolean, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.camera.CameraProperties$b, kotlin.Unit>, float, com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo, com.withpersona.sdk2.camera.CameraProperties$b, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kn.a, boolean, boolean, boolean, yp.a, java.lang.String, java.lang.String):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles$SelfieStepStyle, boolean, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, mn.a, ur.a, boolean, com.withpersona.sdk2.camera.e$a, hn.c$a, kotlin.jvm.functions.Function1, float, com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo, com.withpersona.sdk2.camera.CameraProperties$b, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function1, kn.a, boolean, boolean, boolean, yp.a, java.lang.String, java.lang.String):void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, AbstractC14138a abstractC14138a, StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, NavigationState navigationState, Function0 function0, Function0 function1, Function1 function2, Function0 function3, EnumC8598a enumC8598a, InterfaceC11932a interfaceC11932a, boolean z12, C3405e.a aVar, C6434c.a aVar2, Function1 function4, float f10, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.EnumC3397b enumC3397b, boolean z13, boolean z14, boolean z15, boolean z16, Function1 function5, EnumC7638a enumC7638a, boolean z17, boolean z18, boolean z19, EnumC13272a enumC13272a, String str10, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, z10, abstractC14138a, selfieStepStyle, z11, navigationState, function0, function1, function2, function3, enumC8598a, interfaceC11932a, z12, aVar, aVar2, function4, f10, selfieBrightnessInfo, enumC3397b, z13, z14, z15, z16, function5, enumC7638a, z17, z18, z19, enumC13272a, (i11 & 32) != 0 ? null : str10, (i11 & 64) != 0 ? null : str11);
            }

            /* JADX INFO: renamed from: A, reason: from getter */
            public final boolean getRequestingPermissions() {
                return this.requestingPermissions;
            }

            /* JADX INFO: renamed from: B, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* JADX INFO: renamed from: C, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* JADX INFO: renamed from: D, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* JADX INFO: renamed from: E, reason: from getter */
            public final EnumC8598a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: F, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: G, reason: from getter */
            public final InterfaceC11932a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: H, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }

            /* JADX INFO: renamed from: I, reason: from getter */
            public final boolean getIsAutoCaptureOn() {
                return this.isAutoCaptureOn;
            }

            /* JADX INFO: renamed from: J, reason: from getter */
            public final boolean getIsAutoFlashOnManualCaptureEnabled() {
                return this.isAutoFlashOnManualCaptureEnabled;
            }

            /* JADX INFO: renamed from: K, reason: from getter */
            public final boolean getIsDimLightConditions() {
                return this.isDimLightConditions;
            }

            /* JADX INFO: renamed from: L, reason: from getter */
            public final boolean getIsFlashEnabled() {
                return this.isFlashEnabled;
            }

            /* JADX INFO: renamed from: M, reason: from getter */
            public final boolean getIsFlashOn() {
                return this.isFlashOn;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAllowSwitchCamera() {
                return this.allowSwitchCamera;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getAutoCaptureText() {
                return this.autoCaptureText;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final SelfieBrightnessInfo getBrightnessInfo() {
                return this.brightnessInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final C6434c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final C3405e.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getCaptureSuccessText() {
                return this.captureSuccessText;
            }

            @Nullable
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* JADX INFO: renamed from: h, reason: from getter */
            public final EnumC13272a getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getDisclaimerText() {
                return this.disclaimerText;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final CameraProperties.EnumC3397b getFacingMode() {
                return this.facingMode;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getHintAutoCaptureTimeoutText() {
                return this.hintAutoCaptureTimeoutText;
            }

            @Nullable
            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getHintVerifyingText() {
                return this.hintVerifyingText;
            }

            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final AbstractC14138a getMode() {
                return this.mode;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: q */
            public final Function0<Unit> m19792q() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: r */
            public final Function1<Throwable, Unit> m19793r() {
                return this.onCameraError;
            }

            @NotNull
            /* JADX INFO: renamed from: s */
            public final Function1<CameraProperties.EnumC3397b, Unit> m19794s() {
                return this.onCameraFacingModeSelected;
            }

            @NotNull
            /* JADX INFO: renamed from: t */
            public final Function0<Unit> m19795t() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: u */
            public final Function1<Boolean, Unit> m19796u() {
                return this.onFlashSet;
            }

            @NotNull
            /* JADX INFO: renamed from: v */
            public final Function0<Unit> m19797v() {
                return this.onPermissionChanged;
            }

            @Nullable
            /* JADX INFO: renamed from: w, reason: from getter */
            public final EnumC7638a getPose() {
                return this.pose;
            }

            /* JADX INFO: renamed from: x, reason: from getter */
            public final float getPoseScore() {
                return this.poseScore;
            }

            @Nullable
            /* JADX INFO: renamed from: y, reason: from getter */
            public final String getRealTimeHint() {
                return this.realTimeHint;
            }

            /* JADX INFO: renamed from: z, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r38v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.camera.CameraProperties$b, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r46v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @NotNull AbstractC14138a mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z12, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull Function1<? super CameraProperties.EnumC3397b, Unit> onCameraFacingModeSelected, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.EnumC3397b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull Function1<? super Boolean, Unit> onFlashSet, @Nullable EnumC7638a enumC7638a, boolean z17, boolean z18, boolean z19, @NotNull EnumC13272a designVersion, @Nullable String str10, @Nullable String str11) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
                Intrinsics.checkNotNullParameter(onCameraFacingModeSelected, "onCameraFacingModeSelected");
                Intrinsics.checkNotNullParameter(facingMode, "facingMode");
                Intrinsics.checkNotNullParameter(onFlashSet, "onFlashSet");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                this.title = str;
                this.message = str2;
                this.description = str3;
                this.autoCaptureText = str4;
                this.captureSuccessText = str5;
                this.disclaimerText = str6;
                this.realTimeHint = str7;
                this.hintAutoCaptureTimeoutText = str8;
                this.hintVerifyingText = str9;
                this.isAutoCaptureOn = z10;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.requireStrictSelfieCapture = z11;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = interfaceC11932a;
                this.isAudioRequired = z12;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.onCameraFacingModeSelected = onCameraFacingModeSelected;
                this.poseScore = f10;
                this.brightnessInfo = selfieBrightnessInfo;
                this.facingMode = facingMode;
                this.isFlashEnabled = z13;
                this.isAutoFlashOnManualCaptureEnabled = z14;
                this.isFlashOn = z15;
                this.isDimLightConditions = z16;
                this.onFlashSet = onFlashSet;
                this.pose = enumC7638a;
                this.requestingPermissions = z17;
                this.recordingLocallyRequired = z18;
                this.allowSwitchCamera = z19;
                this.designVersion = designVersion;
                this.watermarkText = str10;
                this.navBarTitle = str11;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$b */
        @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b/\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b)\u00108R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b,\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b3\u00108¨\u00069"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "navBarTitle", "errorMessage", "Lkotlin/Function0;", "", "onClick", "onBack", "onCancel", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "k", "c", "d", "m", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class b extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final String start;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @Nullable
            public final RemoteImage instructionAsset;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            public final SelfieType selfieType;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final List<PoseInfo> orderedPoses;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @Nullable
            public final String errorMessage;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onClick;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onErrorDismissed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull String title, @NotNull String prompt, @NotNull String disclosure, @NotNull String start, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @Nullable RemoteImage remoteImage, @NotNull NavigationState navigationState, @NotNull SelfieType selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable String str, @Nullable String str2, @NotNull Function0<Unit> onClick, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function0<Unit> onErrorDismissed) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(prompt, "prompt");
                Intrinsics.checkNotNullParameter(disclosure, "disclosure");
                Intrinsics.checkNotNullParameter(start, "start");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(selfieType, "selfieType");
                Intrinsics.checkNotNullParameter(orderedPoses, "orderedPoses");
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onErrorDismissed, "onErrorDismissed");
                this.title = title;
                this.prompt = prompt;
                this.disclosure = disclosure;
                this.start = start;
                this.styles = selfieStepStyle;
                this.instructionAsset = remoteImage;
                this.navigationState = navigationState;
                this.selfieType = selfieType;
                this.orderedPoses = orderedPoses;
                this.navBarTitle = str;
                this.errorMessage = str2;
                this.onClick = onClick;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onErrorDismissed = onErrorDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDisclosure() {
                return this.disclosure;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            @Nullable
            /* JADX INFO: renamed from: c, reason: from getter */
            public final RemoteImage getInstructionAsset() {
                return this.instructionAsset;
            }

            @Nullable
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: f */
            public final Function0<Unit> m19827f() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: g */
            public final Function0<Unit> m19828g() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: h */
            public final Function0<Unit> m19829h() {
                return this.onClick;
            }

            @NotNull
            /* JADX INFO: renamed from: i */
            public final Function0<Unit> m19830i() {
                return this.onErrorDismissed;
            }

            @NotNull
            /* JADX INFO: renamed from: j */
            public final List<PoseInfo> m19831j() {
                return this.orderedPoses;
            }

            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final SelfieType getSelfieType() {
                return this.selfieType;
            }

            @NotNull
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getStart() {
                return this.start;
            }

            @Nullable
            /* JADX INFO: renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c */
        @Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001:\u0003*,&BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b&\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010>R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010BR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bC\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\bK\u00108R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\b,\u0010MR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b*\u0010OR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bD\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010'\u001a\u0004\bP\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\b5\u0010)¨\u0006Q"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "recordingLocallyRequired", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;ZLjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "e", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "f", "Z", "m", "()Z", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "i", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "l", "Lmn/a;", "p", "()Lmn/a;", "Lur/a;", "r", "()Lur/a;", "s", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "Lhn/c$a;", "()Lhn/c$a;", "q", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class c extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final b mode;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public final AssetOverrides assetOverrides;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            @NotNull
            public final EnumC8598a videoCaptureMethod;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            @Nullable
            public final InterfaceC11932a webRtcManager;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            @NotNull
            public final C3405e.a cameraXControllerFactory;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            @NotNull
            public final C6434c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$a, reason: from toString */
            @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "b", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class AssetOverrides {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage leftPoseImage;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @Nullable
                public final RemoteImage rightPoseImage;

                public AssetOverrides(@Nullable RemoteImage remoteImage, @Nullable RemoteImage remoteImage2) {
                    this.leftPoseImage = remoteImage;
                    this.rightPoseImage = remoteImage2;
                }

                @Nullable
                /* JADX INFO: renamed from: a, reason: from getter */
                public final RemoteImage getLeftPoseImage() {
                    return this.leftPoseImage;
                }

                @Nullable
                /* JADX INFO: renamed from: b, reason: from getter */
                public final RemoteImage getRightPoseImage() {
                    return this.rightPoseImage;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AssetOverrides)) {
                        return false;
                    }
                    AssetOverrides assetOverrides = (AssetOverrides) other;
                    return Intrinsics.m31980c(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.m31980c(this.rightPoseImage, assetOverrides.rightPoseImage);
                }

                public int hashCode() {
                    RemoteImage remoteImage = this.leftPoseImage;
                    int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
                    RemoteImage remoteImage2 = this.rightPoseImage;
                    return iHashCode + (remoteImage2 != null ? remoteImage2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AssetOverrides(leftPoseImage=" + this.leftPoseImage + ", rightPoseImage=" + this.rightPoseImage + ")";
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b */
            @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "g", "i", "f", "b", "h", "d", "e", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static abstract class b {

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$a */
                @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "b", "Z", "()Z", "c", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class a extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(@NotNull EnumC14142c overlay, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.isCapturing = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$b, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "countDown", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "I", "b", "()I", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14140b extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    public final int countDown;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14140b(int i10, @NotNull EnumC14142c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.countDown = i10;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final int getCountDown() {
                        return this.countDown;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$c, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "e", "()Z", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class C14141c extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C14141c(@NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10, @NotNull EnumC14142c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(finalizeVideo, "finalizeVideo");
                        Intrinsics.checkNotNullParameter(onAnimationComplete, "onAnimationComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.finalizeVideo = finalizeVideo;
                        this.onAnimationComplete = onAnimationComplete;
                        this.startFinalize = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function1<File, Unit> m19863b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function0<Unit> m19864c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$d */
                @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BQ\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "isCapturing", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "c", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "e", "f", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class d extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
                      (r8v0 kotlin.jvm.functions.Function1)
                      (r9v0 kotlin.jvm.functions.Function1)
                      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
                      (r11v0 com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c)
                      (r12v0 boolean)
                      (r13v0 boolean)
                     A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>, boolean, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c, boolean, boolean):void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.c.b.d.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c, boolean, boolean):void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public /* synthetic */ d(Function1 function1, Function1 function2, boolean z10, EnumC14142c enumC14142c, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function2, (i10 & 4) != 0 ? false : z10, enumC14142c, z11, z12);
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function1<Throwable, Unit> m19868c() {
                        return this.onError;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: d */
                    public final Function1<String, Unit> m19869d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(@NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, @NotNull EnumC14142c overlay, boolean z11, boolean z12) {
                        super(null);
                        Intrinsics.checkNotNullParameter(processImage, "processImage");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.processImage = processImage;
                        this.onError = onError;
                        this.forceCapture = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                        this.isCapturing = z12;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$e */
                @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onCaptureClicked", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class e extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(@NotNull Function0<Unit> onCaptureClicked, @NotNull EnumC14142c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function0<Unit> m19872b() {
                        return this.onCaptureClicked;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$f */
                @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "poseHintComplete", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class f extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull Function0<Unit> poseHintComplete, @NotNull EnumC14142c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: b */
                    public final Function0<Unit> m19874b() {
                        return this.poseHintComplete;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g */
                @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "recordLocalVideo", "", "maxRecordingLengthMs", "", "onError", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZJLkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "f", "()Z", "e", "J", "()J", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class g extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.camera.CameraProperties, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(@NotNull Function1<? super CameraProperties, Unit> previewReady, @NotNull EnumC14142c overlay, boolean z10, boolean z11, long j10, @NotNull Function1<? super Throwable, Unit> onError) {
                        super(null);
                        Intrinsics.checkNotNullParameter(previewReady, "previewReady");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        Intrinsics.checkNotNullParameter(onError, "onError");
                        this.previewReady = previewReady;
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.recordLocalVideo = z11;
                        this.maxRecordingLengthMs = j10;
                        this.onError = onError;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function1<Throwable, Unit> m19877c() {
                        return this.onError;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: d */
                    public final Function1<CameraProperties, Unit> m19878d() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$h */
                @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "d", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class h extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(@NotNull Function0<Unit> onComplete, boolean z10, @NotNull EnumC14142c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    /* JADX INFO: renamed from: c */
                    public final Function0<Unit> m19882c() {
                        return this.onComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$i */
                @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "b", "J", "()J", "c", "Z", "getShowProgress", "()Z", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
                public static final class i extends b {

                    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC14142c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull EnumC14142c overlay, long j10, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.AbstractC3928c.c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC14142c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.c.b.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract EnumC14142c getOverlay();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                public b() {
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public enum EnumC14142c {
                CLEAR,
                CENTER,
                CENTER_COMPLETE,
                LOOK_LEFT_HINT,
                LOOK_LEFT,
                LOOK_LEFT_COMPLETE,
                LOOK_RIGHT_HINT,
                LOOK_RIGHT,
                LOOK_RIGHT_COMPLETE,
                LOOK_UP_HINT,
                LOOK_UP,
                LOOK_UP_COMPLETE,
                LOOK_DOWN_HINT,
                LOOK_DOWN,
                LOOK_DOWN_COMPLETE,
                FINALIZING,
                COMPLETE_WITH_CAPTURE,
                COMPLETE;


                /* JADX INFO: renamed from: t */
                public static final /* synthetic */ InterfaceC10707a f16399t = C10708b.m40805a(m19885a());
            }

            /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(@Nullable String str, @Nullable String str2, @NotNull b mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull AssetOverrides assetOverrides, boolean z10, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull EnumC8598a videoCaptureMethod, @Nullable InterfaceC11932a interfaceC11932a, boolean z11, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, boolean z12, @Nullable String str3, @Nullable String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
                Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
                Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
                Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
                Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
                this.title = str;
                this.message = str2;
                this.mode = mode;
                this.styles = selfieStepStyle;
                this.assetOverrides = assetOverrides;
                this.requireStrictSelfieCapture = z10;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.onCameraError = onCameraError;
                this.onPermissionChanged = onPermissionChanged;
                this.videoCaptureMethod = videoCaptureMethod;
                this.webRtcManager = interfaceC11932a;
                this.isAudioRequired = z11;
                this.cameraXControllerFactory = cameraXControllerFactory;
                this.camera2ControllerFactory = camera2ControllerFactory;
                this.recordingLocallyRequired = z12;
                this.watermarkText = str3;
                this.navBarTitle = str4;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final AssetOverrides getAssetOverrides() {
                return this.assetOverrides;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final C6434c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final C3405e.a getCameraXControllerFactory() {
                return this.cameraXControllerFactory;
            }

            @Nullable
            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final b getMode() {
                return this.mode;
            }

            @Nullable
            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: g, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: h */
            public final Function0<Unit> m19844h() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: i */
            public final Function1<Throwable, Unit> m19845i() {
                return this.onCameraError;
            }

            @NotNull
            /* JADX INFO: renamed from: j */
            public final Function0<Unit> m19846j() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: k */
            public final Function0<Unit> m19847k() {
                return this.onPermissionChanged;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getRecordingLocallyRequired() {
                return this.recordingLocallyRequired;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getRequireStrictSelfieCapture() {
                return this.requireStrictSelfieCapture;
            }

            @Nullable
            /* JADX INFO: renamed from: n, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* JADX INFO: renamed from: p, reason: from getter */
            public final EnumC8598a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: r, reason: from getter */
            public final InterfaceC11932a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$d */
        @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0010\u0010\u001f¨\u0006 "}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class d extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(@NotNull UiComponentScreen uiScreen, @NotNull NavigationState navigationState, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(uiScreen, "uiScreen");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.uiScreen = uiScreen;
                this.navigationState = navigationState;
                this.styles = selfieStepStyle;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final Function0<Unit> m19888c() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function0<Unit> m19889d() {
                return this.onCancel;
            }

            @Nullable
            /* JADX INFO: renamed from: e, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final UiComponentScreen getUiScreen() {
                return this.uiScreen;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$e */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lkotlin/Function0;", "", "rendered", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class e extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> rendered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Function0<Unit> rendered) {
                super(null);
                Intrinsics.checkNotNullParameter(rendered, "rendered");
                this.rendered = rendered;
            }

            @NotNull
            /* JADX INFO: renamed from: a */
            public final Function0<Unit> m19892a() {
                return this.rendered;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$f */
        @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0015Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001d\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b!\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u0015\u0010)¨\u0006*"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "strings", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "h", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "e", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class f extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final Strings strings;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final List<Selfie> selfies;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onUsePhotos;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetakePhotos;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$f$a, reason: from toString */
            @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006!"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "", "", Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "selfieLabelUp", "selfieLabelDown", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "d", "e", "f", "g", "h", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final /* data */ class Strings {

                /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
                @NotNull
                public final String title;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final String description;

                /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelFront;

                /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelLeft;

                /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelRight;

                /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelUp;

                /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelDown;

                /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
                @NotNull
                public final String submitButton;

                /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
                @NotNull
                public final String retakeButton;

                public Strings(@NotNull String title, @NotNull String description, @NotNull String selfieLabelFront, @NotNull String selfieLabelLeft, @NotNull String selfieLabelRight, @NotNull String selfieLabelUp, @NotNull String selfieLabelDown, @NotNull String submitButton, @NotNull String retakeButton) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(description, "description");
                    Intrinsics.checkNotNullParameter(selfieLabelFront, "selfieLabelFront");
                    Intrinsics.checkNotNullParameter(selfieLabelLeft, "selfieLabelLeft");
                    Intrinsics.checkNotNullParameter(selfieLabelRight, "selfieLabelRight");
                    Intrinsics.checkNotNullParameter(selfieLabelUp, "selfieLabelUp");
                    Intrinsics.checkNotNullParameter(selfieLabelDown, "selfieLabelDown");
                    Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                    Intrinsics.checkNotNullParameter(retakeButton, "retakeButton");
                    this.title = title;
                    this.description = description;
                    this.selfieLabelFront = selfieLabelFront;
                    this.selfieLabelLeft = selfieLabelLeft;
                    this.selfieLabelRight = selfieLabelRight;
                    this.selfieLabelUp = selfieLabelUp;
                    this.selfieLabelDown = selfieLabelDown;
                    this.submitButton = submitButton;
                    this.retakeButton = retakeButton;
                }

                @NotNull
                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDescription() {
                    return this.description;
                }

                @NotNull
                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getRetakeButton() {
                    return this.retakeButton;
                }

                @NotNull
                /* JADX INFO: renamed from: c, reason: from getter */
                public final String getSelfieLabelDown() {
                    return this.selfieLabelDown;
                }

                @NotNull
                /* JADX INFO: renamed from: d, reason: from getter */
                public final String getSelfieLabelFront() {
                    return this.selfieLabelFront;
                }

                @NotNull
                /* JADX INFO: renamed from: e, reason: from getter */
                public final String getSelfieLabelLeft() {
                    return this.selfieLabelLeft;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Strings)) {
                        return false;
                    }
                    Strings strings = (Strings) other;
                    return Intrinsics.m31980c(this.title, strings.title) && Intrinsics.m31980c(this.description, strings.description) && Intrinsics.m31980c(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.m31980c(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.m31980c(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.m31980c(this.selfieLabelUp, strings.selfieLabelUp) && Intrinsics.m31980c(this.selfieLabelDown, strings.selfieLabelDown) && Intrinsics.m31980c(this.submitButton, strings.submitButton) && Intrinsics.m31980c(this.retakeButton, strings.retakeButton);
                }

                @NotNull
                /* JADX INFO: renamed from: f, reason: from getter */
                public final String getSelfieLabelRight() {
                    return this.selfieLabelRight;
                }

                @NotNull
                /* JADX INFO: renamed from: g, reason: from getter */
                public final String getSelfieLabelUp() {
                    return this.selfieLabelUp;
                }

                @NotNull
                /* JADX INFO: renamed from: h, reason: from getter */
                public final String getSubmitButton() {
                    return this.submitButton;
                }

                public int hashCode() {
                    return (((((((((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.selfieLabelFront.hashCode()) * 31) + this.selfieLabelLeft.hashCode()) * 31) + this.selfieLabelRight.hashCode()) * 31) + this.selfieLabelUp.hashCode()) * 31) + this.selfieLabelDown.hashCode()) * 31) + this.submitButton.hashCode()) * 31) + this.retakeButton.hashCode();
                }

                @NotNull
                /* JADX INFO: renamed from: i, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                public String toString() {
                    return "Strings(title=" + this.title + ", description=" + this.description + ", selfieLabelFront=" + this.selfieLabelFront + ", selfieLabelLeft=" + this.selfieLabelLeft + ", selfieLabelRight=" + this.selfieLabelRight + ", selfieLabelUp=" + this.selfieLabelUp + ", selfieLabelDown=" + this.selfieLabelDown + ", submitButton=" + this.submitButton + ", retakeButton=" + this.retakeButton + ")";
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.selfie.Selfie> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public f(@NotNull Strings strings, @NotNull List<? extends Selfie> selfies, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onUsePhotos, @NotNull Function0<Unit> onRetakePhotos, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable String str) {
                super(null);
                Intrinsics.checkNotNullParameter(strings, "strings");
                Intrinsics.checkNotNullParameter(selfies, "selfies");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onUsePhotos, "onUsePhotos");
                Intrinsics.checkNotNullParameter(onRetakePhotos, "onRetakePhotos");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                this.strings = strings;
                this.selfies = selfies;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onUsePhotos = onUsePhotos;
                this.onRetakePhotos = onRetakePhotos;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.navBarTitle = str;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: c */
            public final Function0<Unit> m19895c() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: d */
            public final Function0<Unit> m19896d() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: e */
            public final Function0<Unit> m19897e() {
                return this.onRetakePhotos;
            }

            @NotNull
            /* JADX INFO: renamed from: f */
            public final Function0<Unit> m19898f() {
                return this.onUsePhotos;
            }

            @NotNull
            /* JADX INFO: renamed from: g */
            public final List<Selfie> m19899g() {
                return this.selfies;
            }

            @NotNull
            /* JADX INFO: renamed from: h, reason: from getter */
            public final Strings getStrings() {
                return this.strings;
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$g */
        @Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b!\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b&\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b;\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b8\u0010=R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b5\u00103¨\u0006>"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "Lqq/c;", "sdkFilesManager", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lyp/a;", "designVersion", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "<init>", "(Ljava/lang/String;Lqq/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lyp/a;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", "Lqq/c;", "l", "()Lqq/c;", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "k", "Lyp/a;", "()Lyp/a;", "o", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class g extends AbstractC3928c {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final C10700c sdkFilesManager;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @NotNull
            public final String description;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @Nullable
            public final RemoteImage customLoadingAsset;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @NotNull
            public final EnumC13272a designVersion;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            @Nullable
            public final String centerSelfieFilePath;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            @Nullable
            public final String uploadScanningHintText;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            @Nullable
            public final InternalErrorInfo recoverableSubmitError;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetrySubmit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@NotNull String title, @NotNull C10700c sdkFilesManager, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable RemoteImage remoteImage, @Nullable String str, @NotNull EnumC13272a designVersion, @Nullable String str2, @Nullable String str3, @Nullable InternalErrorInfo internalErrorInfo, @NotNull Function0<Unit> onRetrySubmit) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                Intrinsics.checkNotNullParameter(navigationState, "navigationState");
                Intrinsics.checkNotNullParameter(onBack, "onBack");
                Intrinsics.checkNotNullParameter(onCancel, "onCancel");
                Intrinsics.checkNotNullParameter(designVersion, "designVersion");
                Intrinsics.checkNotNullParameter(onRetrySubmit, "onRetrySubmit");
                this.title = title;
                this.sdkFilesManager = sdkFilesManager;
                this.description = description;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
                this.styles = selfieStepStyle;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.customLoadingAsset = remoteImage;
                this.navBarTitle = str;
                this.designVersion = designVersion;
                this.centerSelfieFilePath = str2;
                this.uploadScanningHintText = str3;
                this.recoverableSubmitError = internalErrorInfo;
                this.onRetrySubmit = onRetrySubmit;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCenterSelfieFilePath() {
                return this.centerSelfieFilePath;
            }

            @Nullable
            /* JADX INFO: renamed from: b, reason: from getter */
            public final RemoteImage getCustomLoadingAsset() {
                return this.customLoadingAsset;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            /* JADX INFO: renamed from: d, reason: from getter */
            public final EnumC13272a getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getNavBarTitle() {
                return this.navBarTitle;
            }

            @NotNull
            /* JADX INFO: renamed from: f, reason: from getter */
            public final NavigationState getNavigationState() {
                return this.navigationState;
            }

            @NotNull
            /* JADX INFO: renamed from: g */
            public final Function0<Unit> m19917g() {
                return this.onBack;
            }

            @NotNull
            /* JADX INFO: renamed from: h */
            public final Function0<Unit> m19918h() {
                return this.onCancel;
            }

            @NotNull
            /* JADX INFO: renamed from: i */
            public final Function0<Unit> m19919i() {
                return this.onRetrySubmit;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            @Nullable
            /* JADX INFO: renamed from: k, reason: from getter */
            public final InternalErrorInfo getRecoverableSubmitError() {
                return this.recoverableSubmitError;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final C10700c getSdkFilesManager() {
                return this.sdkFilesManager;
            }

            @Nullable
            /* JADX INFO: renamed from: m, reason: from getter */
            public final StepStyles.SelfieStepStyle getStyles() {
                return this.styles;
            }

            @NotNull
            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getUploadScanningHintText() {
                return this.uploadScanningHintText;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ AbstractC3928c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC3928c() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3929d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16440a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f16441b;

        static {
            int[] iArr = new int[EnumC7638a.values().length];
            try {
                iArr[EnumC7638a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7638a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7638a.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7638a.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC7638a.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16440a = iArr;
            int[] iArr2 = new int[EnumC13424x.values().length];
            try {
                iArr2[EnumC13424x.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC13424x.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC13424x.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC13424x.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC13424x.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f16441b = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", m39664f = "SelfieWorkflow.kt", m39665l = {165}, m39666m = "invokeSuspend")
    public static final class C3930e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16442t;

        public C3930e(InterfaceC9557b<? super C3930e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return SelfieWorkflow.this.new C3930e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16442t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C5689j c5689j = C5689j.f21847a;
                Context context = SelfieWorkflow.this.applicationContext;
                this.f16442t = 1;
                if (c5689j.m25813b(context, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            InterfaceC11932a interfaceC11932a = SelfieWorkflow.this.webRtcManager;
            if (interfaceC11932a != null) {
                interfaceC11932a.m44538d();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3930e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", m39664f = "SelfieWorkflow.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class C3931f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16444t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16445u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow f16446v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3931f(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, InterfaceC9557b<? super C3931f> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16445u = aVar;
            this.f16446v = selfieWorkflow;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19927r(SelfieWorkflow selfieWorkflow, AbstractC13225r.c cVar) {
            selfieWorkflow.m19667Z3(cVar);
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3931f(this.f16445u, this.f16446v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f16444t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC13215h<AbstractC13225r<? super Input, SelfieState, ? extends AbstractC3927b>> interfaceC13215hMo48837d = this.f16445u.mo48837d();
            final SelfieWorkflow selfieWorkflow = this.f16446v;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3931f.m19927r(selfieWorkflow, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3931f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1", m39664f = "SelfieWorkflow.kt", m39665l = {493}, m39666m = "invokeSuspend")
    public static final class C3932g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16447t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ int f16449v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16450w;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3932g(int i10, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, InterfaceC9557b<? super C3932g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16449v = i10;
            this.f16450w = aVar;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19929r(SelfieWorkflow selfieWorkflow, PoseInfo poseInfo, AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.AcquireNextPose acquireNextPose = objM48901c instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objM48901c : null;
            if (acquireNextPose == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(selfieWorkflow.m19680x1(cVar, SelfieState.AcquireNextPose.m19299A(acquireNextPose, null, 0L, null, null, null, false, C7697o.m31878d(poseInfo), null, false, 447, null), null));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return SelfieWorkflow.this.new C3932g(this.f16449v, this.f16450w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM22913k;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16447t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C4658a c4658a = SelfieWorkflow.this.selfiePoseManager;
                if (c4658a == null) {
                    Intrinsics.m31998u("selfiePoseManager");
                    c4658a = null;
                }
                int i11 = this.f16449v;
                this.f16447t = 1;
                objM22913k = c4658a.m22913k(i11, this);
                if (objM22913k == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                objM22913k = ((C7347n) obj).getValue();
            }
            AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a aVar = this.f16450w;
            final SelfieWorkflow selfieWorkflow = SelfieWorkflow.this;
            if (C7347n.m30466h(objM22913k)) {
                final PoseInfo poseInfo = (PoseInfo) objM22913k;
                aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.x4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SelfieWorkflow.C3932g.m19929r(selfieWorkflow, poseInfo, (AbstractC13225r.c) obj2);
                    }
                }, 1, null));
            }
            SelfieWorkflow selfieWorkflow2 = SelfieWorkflow.this;
            AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a aVar2 = this.f16450w;
            Throwable thM30463e = C7347n.m30463e(objM22913k);
            if (thM30463e != null) {
                selfieWorkflow2.m19664W3(aVar2, thM30463e);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3932g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$h */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1", m39664f = "SelfieWorkflow.kt", m39665l = {1379, 1381}, m39666m = "invokeSuspend")
    public static final class C3933h extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f16451t;

        /* JADX INFO: renamed from: u */
        public int f16452u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieState.Capture f16453v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow f16454w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16455x;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3933h(SelfieState.Capture capture, SelfieWorkflow selfieWorkflow, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, InterfaceC9557b<? super C3933h> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16453v = capture;
            this.f16454w = selfieWorkflow;
            this.f16455x = aVar;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19931r(SelfieState.Capture capture, AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.Capture capture2 = objM48901c instanceof SelfieState.Capture ? (SelfieState.Capture) objM48901c : null;
            if (capture2 != null && Intrinsics.m31980c(capture2.getCaptureDeadlineEpochMs(), capture.getCaptureDeadlineEpochMs())) {
                C5776l2.m26151c(capture2);
                if (((Input) cVar.m48900b()).getSkipPromptPage()) {
                    cVar.m48903e(new SelfieState.AcquireNextPose(capture2.getCameraProperties(), capture2.getStartSelfieTimestamp(), C7699p.m31892k(), C3965p.m20179k(cVar, false), capture2.getCameraFacingMode(), capture2.getIsFlashEnabled(), capture2.mo19302g(), capture2.getPoseConfigs(), capture2.getAutoCaptureSupported()));
                } else {
                    cVar.m48903e(new SelfieState.ShowInstructions(null, null, null, 6, null));
                }
                return Unit.f29331a;
            }
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3933h(this.f16453v, this.f16454w, this.f16455x, interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r10.m22917o(r9) == r0) goto L18;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long jLongValue;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16452u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                jLongValue = this.f16453v.getCaptureDeadlineEpochMs().longValue() - System.currentTimeMillis();
                C7800a.Companion companion = C7800a.INSTANCE;
                long jM32372q = C7801b.m32372q(jLongValue, EnumC7361b.MILLISECONDS);
                this.f16451t = jLongValue;
                this.f16452u = 1;
                if (C7946z0.m32939c(jM32372q, this) != objM38805e) {
                }
                return objM38805e;
            }
            if (i10 == 1) {
                jLongValue = this.f16451t;
                C7348o.m30470b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f16454w.selfieEventLogger.m20063n();
            InterfaceC13215h<AbstractC13225r<? super Input, SelfieState, ? extends AbstractC3927b>> interfaceC13215hMo48837d = this.f16455x.mo48837d();
            SelfieWorkflow selfieWorkflow = this.f16454w;
            final SelfieState.Capture capture = this.f16453v;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.y4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3933h.m19931r(capture, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
            C4658a c4658a = this.f16454w.selfiePoseManager;
            if (c4658a == null) {
                Intrinsics.m31998u("selfiePoseManager");
                c4658a = null;
            }
            this.f16451t = jLongValue;
            this.f16452u = 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3933h) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$i */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", m39664f = "SelfieWorkflow.kt", m39665l = {1537}, m39666m = "invokeSuspend")
    public static final class C3934i extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16456t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16457u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow f16458v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3934i(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, InterfaceC9557b<? super C3934i> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16457u = aVar;
            this.f16458v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m19933r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.Capture capture = objM48901c instanceof SelfieState.Capture ? (SelfieState.Capture) objM48901c : null;
            if (capture == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.EnumC3920a.ReadyToCapture, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3934i(this.f16457u, this.f16458v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16456t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f16456t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f16457u.mo48837d().mo17905a(C13233z.m48946d(this.f16458v, null, new Function1() { // from class: yp.z4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3934i.m19933r((AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3934i) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$j */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$4", m39664f = "SelfieWorkflow.kt", m39665l = {1551}, m39666m = "invokeSuspend")
    public static final class C3935j extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16459t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16460u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow f16461v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3935j(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, InterfaceC9557b<? super C3935j> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16460u = aVar;
            this.f16461v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m19935r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.Capture capture = objM48901c instanceof SelfieState.Capture ? (SelfieState.Capture) objM48901c : null;
            if (capture == null) {
                return Unit.f29331a;
            }
            cVar.m48903e(capture.m19322z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture.cameraProperties : null, (57343 & 512) != 0 ? capture.backState : null, (57343 & 1024) != 0 ? capture.poseConfigs : null, (57343 & 2048) != 0 ? capture.cameraFacingMode : null, (57343 & 4096) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.EnumC3920a.Enabled, (57343 & 16384) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3935j(this.f16460u, this.f16461v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16459t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f16459t = 1;
                if (C7946z0.m32938b(3000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f16460u.mo48837d().mo17905a(C13233z.m48946d(this.f16461v, null, new Function1() { // from class: yp.a5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3935j.m19935r((AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3935j) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$k */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", m39664f = "SelfieWorkflow.kt", m39665l = {1187}, m39666m = "invokeSuspend")
    public static final class C3936k extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public long f16462t;

        /* JADX INFO: renamed from: u */
        public int f16463u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Input f16464v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16465w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ SelfieWorkflow f16466x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ SelfieState.CountdownToCapture f16467y;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3936k(Input input, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, SelfieState.CountdownToCapture countdownToCapture, InterfaceC9557b<? super C3936k> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16464v = input;
            this.f16465w = aVar;
            this.f16466x = selfieWorkflow;
            this.f16467y = countdownToCapture;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19937r(long j10, SelfieState.CountdownToCapture countdownToCapture, Input input, AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.CountdownToCapture countdownToCapture2 = objM48901c instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) objM48901c : null;
            if (countdownToCapture2 == null) {
                return Unit.f29331a;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                cVar.m48903e(new SelfieState.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), countdownToCapture2.mo19297w(), countdownToCapture2.mo19302g(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), C3965p.m20179k(cVar, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24640, null));
            } else {
                cVar.m48903e(countdownToCapture2.m19337z((32764 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture2.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture2.posesNeeded : null, (32764 & 256) != 0 ? countdownToCapture2.selfies : null, (32764 & 512) != 0 ? countdownToCapture2.backState : null, (32764 & 1024) != 0 ? countdownToCapture2.poseConfigs : null, (32764 & 2048) != 0 ? countdownToCapture2.autoCaptureSupported : false, (32764 & 4096) != 0 ? countdownToCapture2.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture2.isFlashEnabled : false, (32764 & 16384) != 0 ? countdownToCapture2.isDimLightConditions : false));
            }
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3936k(this.f16464v, this.f16465w, this.f16466x, this.f16467y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            final long j10;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16463u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long jM20115a = C3962n.m20115a(this.f16464v);
                this.f16462t = jM20115a;
                this.f16463u = 1;
                if (C7946z0.m32938b(jM20115a, this) == objM38805e) {
                    return objM38805e;
                }
                j10 = jM20115a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f16462t;
                C7348o.m30470b(obj);
            }
            InterfaceC13215h<AbstractC13225r<? super Input, SelfieState, ? extends AbstractC3927b>> interfaceC13215hMo48837d = this.f16465w.mo48837d();
            SelfieWorkflow selfieWorkflow = this.f16466x;
            final SelfieState.CountdownToCapture countdownToCapture = this.f16467y;
            final Input input = this.f16464v;
            interfaceC13215hMo48837d.mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3936k.m19937r(j10, countdownToCapture, input, (AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3936k) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$l */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", m39664f = "SelfieWorkflow.kt", m39665l = {1282}, m39666m = "invokeSuspend")
    public static final class C3937l extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16468t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16469u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ SelfieWorkflow f16470v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3937l(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, InterfaceC9557b<? super C3937l> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16469u = aVar;
            this.f16470v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: r */
        public static final Unit m19939r(AbstractC13225r.c cVar) {
            Object objM48901c = cVar.m48901c();
            SelfieState.CountdownToManualCapture countdownToManualCapture = objM48901c instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) objM48901c : null;
            if (countdownToManualCapture == null) {
                return Unit.f29331a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                cVar.m48903e(countdownToManualCapture.m19344z((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & 256) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & 512) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & 1024) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & 2048) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3937l(this.f16469u, this.f16470v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f16468t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                this.f16468t = 1;
                if (C7946z0.m32938b(1000L, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            this.f16469u.mo48837d().mo17905a(C13233z.m48946d(this.f16470v, null, new Function1() { // from class: yp.c5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.C3937l.m19939r((AbstractC13225r.c) obj2);
                }
            }, 1, null));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3937l) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$m */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", m39664f = "SelfieWorkflow.kt", m39665l = {2130}, m39666m = "invokeSuspend")
    public static final class C3938m extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f16471t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C7758y f16472u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC13218k<Input, SelfieState, AbstractC3927b, Object>.a f16473v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ SelfieWorkflow f16474w;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: ym.k<? super com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, ? extends com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, ? extends java.lang.Object>$a */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3938m(C7758y c7758y, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, InterfaceC9557b<? super C3938m> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f16472u = c7758y;
            this.f16473v = aVar;
            this.f16474w = selfieWorkflow;
        }

        /* JADX INFO: renamed from: r */
        public static final Unit m19941r(C7758y c7758y, AbstractC13225r.c cVar) {
            WorkflowState workflowState = (SelfieState) cVar.m48901c();
            if ((workflowState instanceof InterfaceC3940b) && ((InterfaceC3940b) workflowState).mo19320o()) {
                cVar.m48903e(workflowState);
                c7758y.f29445a = false;
            }
            return Unit.f29331a;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3938m(this.f16472u, this.f16473v, this.f16474w, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:13:0x002a A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r5.f16471t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p229jt.C7348o.m30470b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                p229jt.C7348o.m30470b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f16472u
                boolean r6 = r6.f29445a
                if (r6 == 0) goto L43
                r5.f16471t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = p256ku.C7946z0.m32938b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                ym.k<com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, java.lang.Object>$a r6 = r5.f16473v
                ym.h r6 = r6.mo48837d()
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r1 = r5.f16474w
                kotlin.jvm.internal.y r3 = r5.f16472u
                yp.d5 r4 = new yp.d5
                r4.<init>()
                r3 = 0
                ym.r r1 = p581ym.C13230w.m48932g(r1, r3, r4, r2, r3)
                r6.mo17905a(r1)
                goto L1a
            L43:
                kotlin.Unit r6 = kotlin.Unit.f29331a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.C3938m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3938m) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public SelfieWorkflow(@NotNull Context applicationContext, @NotNull C4197b.a submitVerificationWorker, @NotNull C11742b.a webRtcWorkerFactory, @NotNull C3953e.b selfieAnalyzeWorker, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull C6544j localVideoCaptureRenderer, @NotNull C3405e.a cameraXControllerFactory, @NotNull C6434c.a camera2ControllerFactory, @NotNull InterfaceC8169a cameraStatsManager, @NotNull C11930a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull C4658a.b selfiePoseManagerFactory, @NotNull C4007a inquiryThemeManager, @NotNull C3955g selfieEventLogger, @NotNull C10700c sdkFilesManager, @NotNull C6159e featureFlagManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(submitVerificationWorker, "submitVerificationWorker");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(selfieAnalyzeWorker, "selfieAnalyzeWorker");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(localVideoCaptureRenderer, "localVideoCaptureRenderer");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ControllerFactory, "camera2ControllerFactory");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(directFileUploader, "directFileUploader");
        Intrinsics.checkNotNullParameter(selfiePoseManagerFactory, "selfiePoseManagerFactory");
        Intrinsics.checkNotNullParameter(inquiryThemeManager, "inquiryThemeManager");
        Intrinsics.checkNotNullParameter(selfieEventLogger, "selfieEventLogger");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.submitVerificationWorker = submitVerificationWorker;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.selfieAnalyzeWorker = selfieAnalyzeWorker;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.localVideoCaptureRenderer = localVideoCaptureRenderer;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ControllerFactory = camera2ControllerFactory;
        this.cameraStatsManager = cameraStatsManager;
        this.navigationStateManager = navigationStateManager;
        this.directFileUploader = directFileUploader;
        this.selfiePoseManagerFactory = selfiePoseManagerFactory;
        this.inquiryThemeManager = inquiryThemeManager;
        this.selfieEventLogger = selfieEventLogger;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.webRtcManager = C11934c.m44545b();
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m19429A1(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, EnumC7638a enumC7638a, boolean z10) {
        Intrinsics.checkNotNullParameter(enumC7638a, "<unused var>");
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19434B1(this.f46871a, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A2 */
    public static final Unit m19430A2(Input input, SelfieState.ReviewCaptures reviewCaptures, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(new SelfieState.WaitForCameraFeed(false, false, C3965p.m20179k(action, false), input.m19683A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m19431A3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B1 */
    public static final Unit m19434B1(SelfieWorkflow selfieWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.AcquireNextPose acquireNextPose = objM48901c instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objM48901c : null;
        if (acquireNextPose == null) {
            return Unit.f29331a;
        }
        action.m48903e(selfieWorkflow.m19680x1(action, acquireNextPose, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B2 */
    public static final Unit m19435B2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C1 */
    public static final Unit m19438C1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.q4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19443D1((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C2 */
    public static final Unit m19439C2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C3 */
    public static final AbstractC13225r m19440C3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final AbstractC13218k.a aVar, final C11742b.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C11742b.b.C14265b) {
            return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.g4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19444D3(waitForWebRtcSetup, selfieWorkflow, it, input, aVar, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C11742b.b.Error) {
            return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.h4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19477K3(aVar, selfieWorkflow, waitForWebRtcSetup, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m19443D1(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.AcquireNextPose acquireNextPose = objM48901c instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objM48901c : null;
        if (acquireNextPose == null) {
            return Unit.f29331a;
        }
        C5776l2.m26151c(acquireNextPose);
        action.m48903e(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), C7699p.m31892k(), C3965p.m20179k(action, false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), acquireNextPose.mo19302g(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m19444D3(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final SelfieWorkflow selfieWorkflow, C11742b.b bVar, final Input input, final AbstractC13218k.a aVar, AbstractC13225r.c action) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
        InterfaceC11932a interfaceC11932a = selfieWorkflow.webRtcManager;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44542h(selfieWorkflow.webRtcWorkerFactory.getAndroidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String());
        }
        InterfaceC11932a interfaceC11932a2 = selfieWorkflow.webRtcManager;
        if (interfaceC11932a2 != null) {
            interfaceC11932a2.m44543i(selfieWorkflow.applicationContext);
        }
        int width = cameraProperties.getSize().getWidth();
        int height = cameraProperties.getSize().getHeight();
        if (cameraProperties.getRotation() == 90 || cameraProperties.getRotation() == 270) {
            i10 = width;
            i11 = height;
        } else {
            i11 = width;
            i10 = height;
        }
        InterfaceC11932a interfaceC11932a3 = selfieWorkflow.webRtcManager;
        if (interfaceC11932a3 != null) {
            C11742b.b.C14265b c14265b = (C11742b.b.C14265b) bVar;
            interfaceC11932a3.m44539e(c14265b.getResult().getUsername(), c14265b.getResult().getCredential(), c14265b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: yp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.m19449E3(aVar, selfieWorkflow, input, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: yp.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.m19459G3(aVar, selfieWorkflow, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: yp.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.m19469I3(this.f47039a, input);
                }
            }, new Function1() { // from class: yp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19473J3(this.f47053a, (String) obj);
                }
            });
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m19447E1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E2 */
    public static final Unit m19448E2(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ShowInstructions showInstructions) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19453F2(this.f46726a, input, showInstructions, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m19449E3(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19454F3(this.f47080a, input, waitForWebRtcSetup, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F1 */
    public static final Unit m19452F1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F2 */
    public static final Unit m19453F2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.ShowInstructions showInstructions, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.m20052c();
        action.m48903e(new SelfieState.WaitForCameraFeed(false, false, C3965p.m20180l(action, false, 1, null), input.m19683A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m19454F3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.m20061l(input.getFromStep());
        selfieWorkflow.selfieEventLogger.m20051b((SelfieState) action.m48901c());
        action.m48903e(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.mo19302g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), C3965p.m20179k(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Unit m19457G1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G2 */
    public static final Unit m19458G2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m19459G3(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19464H3(this.f46656a, waitForWebRtcSetup, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H1 */
    public static final Unit m19462H1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, final CameraProperties.EnumC3397b facingMode) {
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19467I1(facingMode, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H2 */
    public static final Unit m19463H2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m19464H3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.webRtcManager.m44535a();
        action.m48903e(new SelfieState.RestartCamera(false, false, C3965p.m20179k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m19467I1(CameraProperties.EnumC3397b enumC3397b, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(new SelfieState.RestartCamera(false, false, C3965p.m20179k(action, false), enumC3397b, 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I2 */
    public static final Unit m19468I2() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m19469I3(SelfieWorkflow selfieWorkflow, Input input) {
        selfieWorkflow.selfieEventLogger.m20059j(input.getFromStep());
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J1 */
    public static final Unit m19472J1(boolean z10) {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m19473J3(SelfieWorkflow selfieWorkflow, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        selfieWorkflow.selfieEventLogger.m20058i(step);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K2 */
    public static final Unit m19476K2(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.ShowPoseHint showPoseHint, final Input input) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.y3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19481L2(showPoseHint, input, selfieWorkflow, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m19477K3(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19482L3(this.f47067a, waitForWebRtcSetup, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L1 */
    public static final AbstractC13225r m19480L1(final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, final AbstractC13218k.a aVar, final C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.a4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19485M1(output, selfieWorkflow, capture, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: L2 */
    public static final Unit m19481L2(SelfieState.ShowPoseHint showPoseHint, Input input, SelfieWorkflow selfieWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<PoseInfo> listMo19302g = showPoseHint.mo19302g();
        List<Selfie> listMo19297w = showPoseHint.mo19297w();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean autoCaptureSupported = showPoseHint.getAutoCaptureSupported();
        CameraProperties cameraProperties = showPoseHint.getCameraProperties();
        long startSelfieTimestamp = showPoseHint.getStartSelfieTimestamp();
        SelfieState selfieStateM20179k = C3965p.m20179k(action, false);
        PoseConfigs poseConfigs = input.getPoseConfigs();
        CameraProperties.EnumC3397b cameraFacingMode = showPoseHint.getCameraFacingMode();
        boolean isFlashEnabled = showPoseHint.getIsFlashEnabled();
        Long lValueOf = null;
        C4658a c4658a = null;
        if (input.getUsePerPoseReveal()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            C4658a c4658a2 = selfieWorkflow.selfiePoseManager;
            if (c4658a2 == null) {
                Intrinsics.m31998u("selfiePoseManager");
            } else {
                c4658a = c4658a2;
            }
            lValueOf = Long.valueOf(jCurrentTimeMillis2 + c4658a.getPerPoseTimeoutMs());
        }
        action.m48903e(new SelfieState.Capture(null, 0.0f, null, listMo19297w, listMo19302g, jCurrentTimeMillis, autoCaptureSupported, startSelfieTimestamp, cameraProperties, selfieStateM20179k, poseConfigs, cameraFacingMode, isFlashEnabled, null, lValueOf, false, 8193, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m19482L3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        InterfaceC11932a interfaceC11932a = selfieWorkflow.webRtcManager;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44535a();
        }
        action.m48903e(new SelfieState.RestartCamera(false, false, C3965p.m20179k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M1 */
    public static final Unit m19485M1(C3953e.c cVar, SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.Capture capture2 = objM48901c instanceof SelfieState.Capture ? (SelfieState.Capture) objM48901c : null;
        if (capture2 == null) {
            return Unit.f29331a;
        }
        if (cVar instanceof C3953e.c.a) {
            C3953e.c.a aVar2 = (C3953e.c.a) cVar;
            if (aVar2.getSelfie() != null) {
                Selfie selfie = aVar2.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                selfieWorkflow.selfieEventLogger.m20056g(capture2, selfie);
                action.m48903e(selfieWorkflow.m19680x1(action, capture, selfie));
            } else {
                action.m48903e(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : SelfieState.EnumC3920a.FlashOn, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (cVar instanceof C3953e.c.C14143c) {
            C3953e.c.C14143c c14143c = (C3953e.c.C14143c) cVar;
            if (c14143c.getError() == EnumC7639b.FaceDetectionUnsupported) {
                action.m48903e(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c14143c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c14143c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
            } else {
                action.m48903e(capture2.m19322z((57343 & 1) != 0 ? capture2.selfieError : c14143c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c14143c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c14143c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & 256) != 0 ? capture2.cameraProperties : null, (57343 & 512) != 0 ? capture2.backState : null, (57343 & 1024) != 0 ? capture2.poseConfigs : null, (57343 & 2048) != 0 ? capture2.cameraFacingMode : null, (57343 & 4096) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & 16384) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
            }
        } else {
            if (!(cVar instanceof C3953e.c.b)) {
                throw new C7345l();
            }
            selfieWorkflow.m19664W3(aVar, ((C3953e.c.b) cVar).getError());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M2 */
    public static final Unit m19486M2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m19487M3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N1 */
    public static final Unit m19490N1(PoseInfo poseInfo, EnumC7638a enumC7638a, AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, enumC7638a, System.currentTimeMillis(), poseInfo.getToken());
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19495O1(this.f47017a, capture, selfieImage, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N2 */
    public static final Unit m19491N2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m19492N3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O1 */
    public static final Unit m19495O1(SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, Selfie.SelfieImage selfieImage, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(selfieWorkflow.m19680x1(action, capture, selfieImage));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O2 */
    public static final Unit m19496O2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m19497O3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P1 */
    public static final Unit m19500P1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.m19664W3(aVar, it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q1 */
    public static final Unit m19503Q1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Q2 */
    public static final AbstractC13225r m19504Q2(final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input, final AbstractC13218k.a aVar, final C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19509R2(output, startCapture, input, selfieWorkflow, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m19505Q3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.WebRtcFinished webRtcFinished) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.m4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19510R3(webRtcFinished, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R1 */
    public static final Unit m19508R1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R2 */
    public static final Unit m19509R2(C3953e.c cVar, SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.StartCapture startCapture2 = objM48901c instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) objM48901c : null;
        if (startCapture2 == null) {
            return Unit.f29331a;
        }
        if (cVar instanceof C3953e.c.a) {
            C3953e.c.a aVar2 = (C3953e.c.a) cVar;
            action.m48903e(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar2.getPoseScore(), aVar2.getBrightnessInfo(), startCapture.mo19302g(), startCapture.mo19297w(), C3965p.m20179k(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar2.getIsDimLightConditions()));
        } else if (cVar instanceof C3953e.c.b) {
            selfieWorkflow.m19664W3(aVar, ((C3953e.c.b) cVar).getError());
        } else {
            if (!(cVar instanceof C3953e.c.C14143c)) {
                throw new C7345l();
            }
            C3953e.c.C14143c c14143c = (C3953e.c.C14143c) cVar;
            action.m48903e(c14143c.getError() == EnumC7639b.FaceDetectionUnsupported ? startCapture2.m19382z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c14143c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c14143c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture2.cameraProperties : null, (16242 & 1024) != 0 ? startCapture2.backState : null, (16242 & 2048) != 0 ? startCapture2.poseConfigs : null, (16242 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c14143c.getIsDimLightConditions()) : startCapture2.m19382z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c14143c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c14143c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c14143c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & 256) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & 512) != 0 ? startCapture2.cameraProperties : null, (16242 & 1024) != 0 ? startCapture2.backState : null, (16242 & 2048) != 0 ? startCapture2.poseConfigs : null, (16242 & 4096) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & 16384) != 0 ? startCapture2.isDimLightConditions : c14143c.getIsDimLightConditions()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m19510R3(SelfieState.WebRtcFinished webRtcFinished, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(C3965p.m20164D(action, webRtcFinished.mo19297w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), C3965p.m20179k(action, false)));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S1 */
    public static final Unit m19513S1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S2 */
    public static final Unit m19514S2(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19518T2(startCapture, input, selfieWorkflow, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m19515S3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T2 */
    public static final Unit m19518T2(SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.StartCapture startCapture2 = objM48901c instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) objM48901c : null;
        if (startCapture2 == null) {
            return Unit.f29331a;
        }
        action.m48903e(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.mo19302g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), C3965p.m20179k(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        selfieWorkflow.selfieEventLogger.m20053d(startCapture2);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m19519T3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m19522U1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.w3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19527V1((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U2 */
    public static final Unit m19523U2(PoseInfo poseInfo, EnumC7638a enumC7638a, AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, enumC7638a, System.currentTimeMillis(), poseInfo.getToken());
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19528V2(this.f46959a, startCapture, selfieImage, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m19524U3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V1 */
    public static final Unit m19527V1(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.CaptureTransition captureTransition = objM48901c instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) objM48901c : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            action.m48903e(nextState);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: V2 */
    public static final Unit m19528V2(SelfieWorkflow selfieWorkflow, SelfieState.StartCapture startCapture, Selfie.SelfieImage selfieImage, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(selfieWorkflow.m19680x1(action, startCapture, selfieImage));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W1 */
    public static final Unit m19531W1(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: W2 */
    public static final Unit m19532W2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.m19664W3(aVar, it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X1 */
    public static final Unit m19535X1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X2 */
    public static final Unit m19536X2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final Unit m19539Y1(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y2 */
    public static final Unit m19540Y2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m19541Y3(AbstractC3927b abstractC3927b, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48902d(abstractC3927b);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z2 */
    public static final Unit m19544Z2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a2 */
    public static final AbstractC13225r m19547a2(final SelfieWorkflow selfieWorkflow, final AbstractC13218k.a aVar, final SelfieState.CountdownToCapture countdownToCapture, final Input input, final C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19550b2(output, selfieWorkflow, aVar, countdownToCapture, input, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: b2 */
    public static final Unit m19550b2(C3953e.c cVar, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, SelfieState.CountdownToCapture countdownToCapture, Input input, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.CountdownToCapture countdownToCapture2 = objM48901c instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) objM48901c : null;
        if (countdownToCapture2 == null) {
            return Unit.f29331a;
        }
        if (!(cVar instanceof C3953e.c.a)) {
            if (cVar instanceof C3953e.c.b) {
                selfieWorkflow.m19664W3(aVar, ((C3953e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof C3953e.c.C14143c)) {
                    throw new C7345l();
                }
                action.m48903e(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.mo19302g(), countdownToCapture.mo19297w(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), C3965p.m20179k(action, false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((C3953e.c.C14143c) cVar).getIsDimLightConditions(), 131, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: b3 */
    public static final AbstractC13225r m19551b3(final SelfieWorkflow selfieWorkflow, final AbstractC13218k.a aVar, final SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final C3953e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19555c3(output, selfieWorkflow, aVar, startCaptureFaceDetected, input, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: c2 */
    public static final Unit m19554c2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c3 */
    public static final Unit m19555c3(C3953e.c cVar, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(cVar instanceof C3953e.c.a)) {
            if (cVar instanceof C3953e.c.b) {
                selfieWorkflow.m19664W3(aVar, ((C3953e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof C3953e.c.C14143c)) {
                    throw new C7345l();
                }
                C3953e.c.C14143c c14143c = (C3953e.c.C14143c) cVar;
                EnumC7639b error = c14143c.getError();
                List<PoseInfo> listMo19302g = startCaptureFaceDetected.mo19302g();
                List<Selfie> listMo19297w = startCaptureFaceDetected.mo19297w();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.m48903e(new SelfieState.StartCapture(false, error, c14143c.getPoseScore(), c14143c.getBrightnessInfo(), listMo19302g, listMo19297w, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, C3965p.m20179k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c14143c.getIsDimLightConditions(), 129, null));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m19558d2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d3 */
    public static final AbstractC13225r m19559d3(final SelfieWorkflow selfieWorkflow, final Input input, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19563e3(this.f46850a, input, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: e2 */
    public static final Unit m19562e2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e3 */
    public static final Unit m19563e3(SelfieWorkflow selfieWorkflow, Input input, AbstractC13225r.c action) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = objM48901c instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) objM48901c : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f29331a;
        }
        selfieWorkflow.selfieEventLogger.m20050a(startCaptureFaceDetected);
        if (input.getDesignVersion() == EnumC13272a.K0000 && startCaptureFaceDetected.mo19304j() == EnumC7638a.Center) {
            List<PoseInfo> listMo19302g = startCaptureFaceDetected.mo19302g();
            List<Selfie> listMo19297w = startCaptureFaceDetected.mo19297w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listMo19297w, listMo19302g, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, C3965p.m20179k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.mo19302g(), startCaptureFaceDetected.mo19297w(), C3965p.m20179k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        action.m48903e(countdownToCapture);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f3 */
    public static final Unit m19566f3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g2 */
    public static final Unit m19569g2(PoseInfo poseInfo, EnumC7638a enumC7638a, AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.EnumC3902a.MANUAL, enumC7638a, System.currentTimeMillis(), poseInfo.getToken());
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19574h2(this.f46980a, countdownToManualCapture, selfieImage, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g3 */
    public static final Unit m19570g3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h2 */
    public static final Unit m19574h2(SelfieWorkflow selfieWorkflow, SelfieState.CountdownToManualCapture countdownToManualCapture, Selfie.SelfieImage selfieImage, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(selfieWorkflow.m19680x1(action, countdownToManualCapture, selfieImage));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h3 */
    public static final Unit m19575h3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m19579i2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.m19664W3(aVar, it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j2 */
    public static final Unit m19583j2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j3 */
    public static final AbstractC13225r m19584j3(final SelfieWorkflow selfieWorkflow, final AbstractC13218k.a aVar, final boolean z10, final C4197b.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof C4197b.d.b) {
            return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19589k3(this.f46948a, aVar, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof C4197b.d.Error) {
            return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.s4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19594l3(z10, it, selfieWorkflow, aVar, (AbstractC13225r.c) obj);
                }
            }, 1, null);
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: k2 */
    public static final Unit m19588k2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k3 */
    public static final Unit m19589k3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.d.f16226a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l2 */
    public static final Unit m19593l2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX INFO: renamed from: l3 */
    public static final Unit m19594l3(boolean z10, C4197b.d dVar, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.Submit submit = objM48901c instanceof SelfieState.Submit ? (SelfieState.Submit) objM48901c : null;
        if (submit == null) {
            return Unit.f29331a;
        }
        if (z10) {
            C4197b.d.Error error = (C4197b.d.Error) dVar;
            if (C3965p.m20162B(error.getCause())) {
                action.m48903e(SelfieState.Submit.m19393A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
            } else {
                selfieWorkflow.m19665X3(aVar, new AbstractC3927b.Error(((C4197b.d.Error) dVar).getCause()));
            }
        } else {
            selfieWorkflow.m19665X3(aVar, new AbstractC3927b.Error(((C4197b.d.Error) dVar).getCause()));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m3 */
    public static final Unit m19598m3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n2 */
    public static final Unit m19602n2(AbstractC13218k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.FinalizeWebRtc finalizeWebRtc, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19607o2(this.f46809a, input, finalizeWebRtc, it, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n3 */
    public static final Unit m19603n3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o2 */
    public static final Unit m19607o2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String str, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.m20062m(input.getFromStep());
        action.m48903e(new SelfieState.WebRtcFinished(finalizeWebRtc.mo19297w(), str, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), C3965p.m20179k(action, false), finalizeWebRtc.getCameraFacingMode()));
        selfieWorkflow.webRtcManager.m44538d();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o3 */
    public static final Unit m19608o3(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.n4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19613p3((AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p2 */
    public static final Unit m19612p2() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: p3 */
    public static final Unit m19613p3(AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.Submit submit = objM48901c instanceof SelfieState.Submit ? (SelfieState.Submit) objM48901c : null;
        if (submit == null) {
            return Unit.f29331a;
        }
        action.m48903e(SelfieState.Submit.m19393A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q2 */
    public static final Unit m19617q2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow) {
        C3965p.m20192x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r2 */
    public static final Unit m19621r2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r3 */
    public static final Unit m19622r3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar) {
        selfieWorkflow.m19665X3(aVar, AbstractC3927b.b.f16224a);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s2 */
    public static final Unit m19626s2(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m19627s3(SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, Input input) {
        C3965p.m20194z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.m19678w1(input));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: t3 */
    public static final AbstractC13225r m19631t3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final AbstractC13218k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.x3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19636u3(it, waitForCameraFeed, input, selfieWorkflow, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m19635u2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.RestartCamera restartCamera) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.i4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19639v2(input, restartCamera, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m19636u3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == EnumC11028j1.PermissionGranted) {
            action.m48903e(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            action.m48903e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.m19665X3(aVar, AbstractC3927b.a.f16223a);
        } else {
            selfieWorkflow.m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m19639v2(Input input, SelfieState.RestartCamera restartCamera, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.m48903e(new SelfieState.WaitForCameraFeed(false, false, C3965p.m20179k(action, false), input.m19683A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: v3 */
    public static final AbstractC13225r m19640v3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final AbstractC13218k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19643w3(it, waitForCameraFeed, input, selfieWorkflow, aVar, (AbstractC13225r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m19643w3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == EnumC11028j1.PermissionGranted) {
            action.m48903e(SelfieState.WaitForCameraFeed.m19402A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            action.m48903e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.m19665X3(aVar, AbstractC3927b.a.f16223a);
        } else {
            selfieWorkflow.m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x2 */
    public static final Unit m19646x2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.ReviewCaptures reviewCaptures) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19650y2(reviewCaptures, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: x3 */
    public static final Unit m19647x3(final SelfieWorkflow selfieWorkflow, AbstractC13218k.a aVar, final Input input, final SelfieState.WaitForCameraFeed waitForCameraFeed, final long j10, final CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        selfieWorkflow.selfieEventLogger.m20063n();
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.b4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19651y3(this.f46662a, input, waitForCameraFeed, cameraProperties, j10, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m19650y2(SelfieState.ReviewCaptures reviewCaptures, AbstractC13225r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objM48901c = action.m48901c();
        SelfieState.ReviewCaptures reviewCaptures2 = objM48901c instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) objM48901c : null;
        if (reviewCaptures2 == null) {
            return Unit.f29331a;
        }
        SelfieState.ReviewCaptures reviewCaptures3 = reviewCaptures2;
        action.m48903e(new SelfieState.Submit(reviewCaptures3.mo19297w(), reviewCaptures3.getWebRtcObjectId(), reviewCaptures3.getCameraProperties(), reviewCaptures3.getStartSelfieTimestamp(), C3965p.m20179k(action, true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y3 */
    public static final Unit m19651y3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, CameraProperties cameraProperties, long j10, AbstractC13225r.c action) {
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (selfieWorkflow.m19670b4(input) == EnumC8598a.Stream) {
            selfieWorkflow.selfieEventLogger.m20060k();
            action.m48903e(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, C3965p.m20179k(action, false), waitForCameraFeed.m19405g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            selfieWorkflow.selfieEventLogger.m20051b((SelfieState) action.m48901c());
            EnumC7638a pose = ((PoseInfo) CollectionsKt.m31706d0(waitForCameraFeed.m19405g())).getPose();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, C7699p.m31892k(), C3965p.m20179k(action, false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.m19405g(), input.getPoseConfigs(), true);
            } else if (pose == EnumC7638a.Center) {
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.m19405g(), null, System.currentTimeMillis(), false, j10, cameraProperties, C3965p.m20179k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new SelfieState.ShowPoseHint(C7699p.m31892k(), waitForCameraFeed.m19405g(), true, cameraProperties, j10, C3965p.m20179k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            action.m48903e(showPoseHint);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z2 */
    public static final Unit m19654z2(AbstractC13218k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ReviewCaptures reviewCaptures) {
        aVar.mo48837d().mo17905a(C13233z.m48946d(selfieWorkflow, null, new Function1() { // from class: yp.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19430A2(input, reviewCaptures, (AbstractC13225r.c) obj);
            }
        }, 1, null));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m19655z3(AbstractC13218k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C3965p.m20182n(aVar, false, 1, null).invoke(it);
        return Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.withpersona.sdk2.inquiry.selfie.o.n(com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, ym.k$a, kn.a, java.lang.String, java.lang.String, java.lang.String, boolean, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$a, boolean, com.withpersona.sdk2.inquiry.shared.navigation.NavigationState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, mn.a, ur.a, boolean, com.withpersona.sdk2.camera.e$a, hn.c$a, float, com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo, com.withpersona.sdk2.camera.CameraProperties$b, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, java.lang.Object):com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c */
    /* JADX INFO: renamed from: B3 */
    public final AbstractC3928c m19656B3(final Input renderProps, final SelfieState.WaitForWebRtcSetup renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        C13230w.m48937l(context, this.webRtcWorkerFactory.m43961a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), C7731d0.m32011k(C11742b.class), "", new Function1() { // from class: yp.z3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19440C3(this.f47086a, renderState, renderProps, context, (C11742b.b) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        AbstractC3928c.c.b.i iVar = new AbstractC3928c.c.b.i(AbstractC3928c.c.EnumC14142c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(context, false, 1, null);
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20154m(renderProps, context, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19487M3(context, this);
            }
        }, new Function0() { // from class: yp.v4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19492N3(this.f47035a, context);
            }
        }, function1M20182n, new Function0() { // from class: yp.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19497O3(this.f46642a, context, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: D2 */
    public final AbstractC3928c.b m19657D2(final Input renderProps, final SelfieState.ShowInstructions renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        SelfieType selfieType = renderProps.getSelfieType();
        RemoteImage selfiePictograph = null;
        if (Intrinsics.m31980c(selfieType, SelfieType.CenterOnly.f16125a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.m31980c(selfieType, SelfieType.ThreePhotos.f16127a) && !Intrinsics.m31980c(selfieType, SelfieType.ConfigurablePoses.f16126a)) {
                throw new C7345l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new AbstractC3928c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, navigationStateM44528b, renderProps.getSelfieType(), renderProps.m19683A(), renderProps.getStrings().getPromptPageNavBarTitle(), null, new Function0() { // from class: yp.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19448E2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: yp.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19458G2(context, this);
            }
        }, new Function0() { // from class: yp.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19463H2(this.f46805a, context);
            }
        }, new Function0() { // from class: yp.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19468I2();
            }
        });
    }

    /* JADX INFO: renamed from: J2 */
    public final AbstractC3928c m19658J2(final Input renderProps, final SelfieState.ShowPoseHint renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        EnumC13424x enumC13424x;
        String selfieHintPoseNotCentered;
        AbstractC3928c.c.EnumC14142c enumC14142c;
        int i10 = C3929d.f16440a[renderState.mo19304j().ordinal()];
        if (i10 == 1) {
            enumC13424x = EnumC13424x.Left;
        } else if (i10 == 2) {
            enumC13424x = EnumC13424x.Right;
        } else if (i10 == 3) {
            enumC13424x = EnumC13424x.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new C7345l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            enumC13424x = EnumC13424x.Down;
        }
        int[] iArr = C3929d.f16441b;
        int i11 = iArr[enumC13424x.ordinal()];
        if (i11 == 1) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintPoseNotCentered();
        } else if (i11 == 2) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookLeft();
        } else if (i11 == 3) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookRight();
        } else if (i11 == 4) {
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookUp();
        } else {
            if (i11 != 5) {
                throw new C7345l();
            }
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookDown();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[enumC13424x.ordinal()];
        if (i12 == 1) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER;
        } else if (i12 == 2) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT_HINT;
        } else if (i12 == 3) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_HINT;
        } else if (i12 == 4) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new C7345l();
            }
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN_HINT;
        }
        AbstractC3928c.c.b.f fVar = new AbstractC3928c.c.b.f(new Function0() { // from class: yp.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19476K2(context, this, renderState, renderProps);
            }
        }, enumC14142c, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        String str = selfieHintPoseNotCentered;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(context, false, 1, null);
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar = this.cameraXControllerFactory;
        C6434c.a aVar2 = this.camera2ControllerFactory;
        return C3964o.m20154m(renderProps, context, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19486M2(context, this);
            }
        }, new Function0() { // from class: yp.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19491N2(this.f46790a, context);
            }
        }, function1M20182n, new Function0() { // from class: yp.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19496O2(this.f46815a, context, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, recordAudio, aVar, aVar2, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0149  */
    /* JADX WARN: Code duplicated, block: B:75:0x0157  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    /* JADX INFO: renamed from: K1 */
    public final AbstractC3928c m19659K1(final Input renderProps, final SelfieState.Capture renderState, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        SelfieState.EnumC3920a flashState;
        String str;
        String selfieHintCenterFace;
        int i10;
        AbstractC3928c.c.EnumC14142c enumC14142c;
        AbstractC3928c.c.EnumC14142c enumC14142c2;
        final SelfieWorkflow selfieWorkflow;
        AbstractC3928c.c.b aVar;
        SelfieState.EnumC3920a enumC3920a;
        SelfieState.EnumC3920a enumC3920a2;
        boolean z10;
        boolean z11;
        final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar2 = context;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            aVar2.mo48835b("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new C3933h(renderState, this, aVar2, null));
        }
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        final EnumC7638a pose = poseInfoMo19321p.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == SelfieState.EnumC3920a.Disabled ? SelfieState.EnumC3920a.Enabled : renderState.getFlashState();
        } else {
            flashState = SelfieState.EnumC3920a.Disabled;
        }
        SelfieState.EnumC3920a enumC3920a3 = flashState;
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            C13230w.m48937l(aVar2, this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), enumC3920a3 == SelfieState.EnumC3920a.Disabled || enumC3920a3 == SelfieState.EnumC3920a.ReadyToCapture), C7731d0.m32011k(C3953e.class), "", new Function1() { // from class: yp.n2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19480L1(this.f46831a, renderState, aVar2, (C3953e.c) obj);
                }
            });
        }
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        if (pose == EnumC7638a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else {
            if (pose != EnumC7638a.Right) {
                if (renderState.getSelfieError() != null) {
                    str = strM20116b;
                } else if (pose == EnumC7638a.Center) {
                    selfieHintCenterFace = renderProps.getStrings().getSelfieHintCenterFace();
                } else {
                    str = null;
                }
                i10 = C3929d.f16440a[pose.ordinal()];
                if (i10 != 1) {
                    enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
                } else if (i10 != 2) {
                    enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
                } else if (i10 != 3) {
                    enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP;
                } else if (i10 != 4) {
                    enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
                } else {
                    if (i10 == 5) {
                        throw new C7345l();
                    }
                    enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER;
                }
                enumC14142c2 = enumC14142c;
                if (renderState.mo19320o() || enumC3920a3 == SelfieState.EnumC3920a.FlashOn || enumC3920a3 == SelfieState.EnumC3920a.ReadyToCapture) {
                    selfieWorkflow = this;
                    aVar = new AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
                } else {
                    Function1 function1 = new Function1() { // from class: yp.o2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelfieWorkflow.m19490N1(poseInfoMo19321p, pose, aVar2, this, renderState, (String) obj);
                        }
                    };
                    aVar2 = aVar2;
                    selfieWorkflow = this;
                    aVar = new AbstractC3928c.c.b.d(function1, new Function1() { // from class: yp.p2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelfieWorkflow.m19500P1(this.f46860a, aVar2, (Throwable) obj);
                        }
                    }, false, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false, 4, null);
                }
                if (!renderState.mo19320o()) {
                    selfieWorkflow.m19663V3(aVar2);
                }
                enumC3920a = SelfieState.EnumC3920a.FlashOn;
                if (enumC3920a3 == enumC3920a) {
                    aVar2.mo48835b("wait_to_capture_with_flash_on", new C3934i(aVar2, selfieWorkflow, null));
                }
                enumC3920a2 = SelfieState.EnumC3920a.ReadyToCapture;
                if (enumC3920a3 == enumC3920a2) {
                    aVar2.mo48835b("turn_off_flash", new C3935j(aVar2, selfieWorkflow, null));
                }
                EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
                String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
                String str2 = strM20116b;
                boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
                NavigationState navigationStateM44528b = selfieWorkflow.navigationStateManager.m44528b();
                Function1 function1M20182n = C3965p.m20182n(aVar2, false, 1, null);
                InterfaceC11932a interfaceC11932a = selfieWorkflow.webRtcManager;
                AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
                boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
                C3405e.a aVar3 = selfieWorkflow.cameraXControllerFactory;
                C6434c.a aVar4 = selfieWorkflow.camera2ControllerFactory;
                String str3 = str;
                boolean autoCaptureSupported = renderState.getAutoCaptureSupported();
                EnumC7638a enumC7638aMo19304j = renderState.mo19304j();
                float poseScore = renderState.getPoseScore();
                SelfieBrightnessInfo brightnessInfo = renderState.getBrightnessInfo();
                CameraProperties.EnumC3397b cameraFacingMode = renderState.getCameraFacingMode();
                boolean isFlashEnabled = renderState.getIsFlashEnabled();
                boolean zM27145a = selfieWorkflow.featureFlagManager.m27145a(C6152a.f23511a);
                if (renderState.getFlashState() != enumC3920a || renderState.getFlashState() == enumC3920a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isDimLightConditions = renderState.getIsDimLightConditions();
                if (m19670b4(renderProps) == EnumC8598a.Upload) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return C3964o.m20154m(renderProps, aVar2, enumC7638aMo19304j, capturePageTitle, (1006632960 & 16) != 0 ? null : str3, str2, autoCaptureSupported, aVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.q2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.m19503Q1(aVar2, selfieWorkflow);
                    }
                }, new Function0() { // from class: yp.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.m19508R1(this.f46944a, aVar2);
                    }
                }, function1M20182n, new Function0() { // from class: yp.t2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.m19513S1(this.f46986a, aVar2, renderProps);
                    }
                }, enumC8598aM19670b4, interfaceC11932a, recordAudio, aVar3, aVar4, poseScore, brightnessInfo, cameraFacingMode, isFlashEnabled, zM27145a, isDimLightConditions, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
            }
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        }
        str = selfieHintCenterFace;
        i10 = C3929d.f16440a[pose.ordinal()];
        if (i10 != 1) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 != 2) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 != 3) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 != 4) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 == 5) {
                throw new C7345l();
            }
            enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER;
        }
        enumC14142c2 = enumC14142c;
        if (renderState.mo19320o()) {
            selfieWorkflow = this;
            aVar = new AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else {
            selfieWorkflow = this;
            aVar = new AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        }
        if (!renderState.mo19320o()) {
            selfieWorkflow.m19663V3(aVar2);
        }
        enumC3920a = SelfieState.EnumC3920a.FlashOn;
        if (enumC3920a3 == enumC3920a) {
            aVar2.mo48835b("wait_to_capture_with_flash_on", new C3934i(aVar2, selfieWorkflow, null));
        }
        enumC3920a2 = SelfieState.EnumC3920a.ReadyToCapture;
        if (enumC3920a3 == enumC3920a2) {
            aVar2.mo48835b("turn_off_flash", new C3935j(aVar2, selfieWorkflow, null));
        }
        EnumC8598a enumC8598aM19670b5 = m19670b4(renderProps);
        String capturePageTitle2 = renderProps.getStrings().getCapturePageTitle();
        String str4 = strM20116b;
        boolean requireStrictSelfieCapture2 = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b2 = selfieWorkflow.navigationStateManager.m44528b();
        Function1 function1M20182n2 = C3965p.m20182n(aVar2, false, 1, null);
        InterfaceC11932a interfaceC11932a2 = selfieWorkflow.webRtcManager;
        AbstractC3928c.c.AssetOverrides assetOverridesM20163C2 = C3965p.m20163C(renderProps);
        boolean recordAudio2 = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar5 = selfieWorkflow.cameraXControllerFactory;
        C6434c.a aVar6 = selfieWorkflow.camera2ControllerFactory;
        String str5 = str;
        boolean autoCaptureSupported2 = renderState.getAutoCaptureSupported();
        EnumC7638a enumC7638aMo19304j2 = renderState.mo19304j();
        float poseScore2 = renderState.getPoseScore();
        SelfieBrightnessInfo brightnessInfo2 = renderState.getBrightnessInfo();
        CameraProperties.EnumC3397b cameraFacingMode2 = renderState.getCameraFacingMode();
        boolean isFlashEnabled2 = renderState.getIsFlashEnabled();
        boolean zM27145a2 = selfieWorkflow.featureFlagManager.m27145a(C6152a.f23511a);
        if (renderState.getFlashState() != enumC3920a) {
            z10 = true;
        } else {
            z10 = true;
        }
        boolean isDimLightConditions2 = renderState.getIsDimLightConditions();
        if (m19670b4(renderProps) == EnumC8598a.Upload) {
            z11 = true;
        } else {
            z11 = false;
        }
        return C3964o.m20154m(renderProps, aVar2, enumC7638aMo19304j2, capturePageTitle2, (1006632960 & 16) != 0 ? null : str5, str4, autoCaptureSupported2, aVar, assetOverridesM20163C2, requireStrictSelfieCapture2, navigationStateM44528b2, new Function0() { // from class: yp.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19503Q1(aVar2, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.r2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19508R1(this.f46944a, aVar2);
            }
        }, function1M20182n2, new Function0() { // from class: yp.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19513S1(this.f46986a, aVar2, renderProps);
            }
        }, enumC8598aM19670b5, interfaceC11932a2, recordAudio2, aVar5, aVar6, poseScore2, brightnessInfo2, cameraFacingMode2, isFlashEnabled2, zM27145a2, isDimLightConditions2, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: P2 */
    public final AbstractC3928c m19660P2(final Input renderProps, final SelfieState.StartCapture renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        AbstractC3928c.c.EnumC14142c enumC14142c;
        final SelfieWorkflow selfieWorkflow;
        Object obj;
        AbstractC3928c.c.b aVar;
        final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar2 = context;
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            C13230w.m48937l(aVar2, this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), C7731d0.m32011k(C3953e.class), "", new Function1() { // from class: yp.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.m19504Q2(this.f46827a, renderState, renderProps, aVar2, (C3953e.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        final EnumC7638a pose = poseInfoMo19321p.getPose();
        boolean zMo19320o = renderState.mo19320o();
        if (!zMo19320o) {
            m19663V3(aVar2);
        }
        int i10 = C3929d.f16440a[pose.ordinal()];
        if (i10 == 1) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 == 4) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new C7345l();
            }
            enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER;
        }
        AbstractC3928c.c.EnumC14142c enumC14142c2 = enumC14142c;
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintTakePhoto = strM20116b == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strM20116b;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zMo19320o) {
            selfieWorkflow = this;
            obj = null;
            aVar = new AbstractC3928c.c.b.a(enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else if (m19678w1(renderProps)) {
            aVar = new AbstractC3928c.c.b.e(new Function0() { // from class: yp.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.m19514S2(aVar2, this, renderState, renderProps);
                }
            }, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
            selfieWorkflow = this;
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: yp.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.m19523U2(poseInfoMo19321p, pose, context, this, renderState, (String) obj2);
                }
            };
            aVar2 = context;
            obj = null;
            selfieWorkflow = this;
            aVar = new AbstractC3928c.c.b.d(function1, new Function1() { // from class: yp.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.m19532W2(this.f46872a, aVar2, (Throwable) obj2);
                }
            }, false, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = selfieWorkflow.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(aVar2, false, 1, obj);
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = selfieWorkflow.webRtcManager;
        return C3964o.m20154m(renderProps, aVar2, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strM20116b, renderState.getAutoCaptureSupported(), aVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19536X2(aVar2, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19540Y2(this.f46962a, aVar2);
            }
        }, function1M20182n, new Function0() { // from class: yp.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19544Z2(this.f46983a, aVar2, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: P3 */
    public final AbstractC3928c m19661P3(final Input renderProps, final SelfieState.WebRtcFinished renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        AbstractC3928c.c.b.h hVar = new AbstractC3928c.c.b.h(new Function0() { // from class: yp.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19505Q3(context, this, renderState);
            }
        }, false, AbstractC3928c.c.EnumC14142c.COMPLETE, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(context, false, 1, null);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20154m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19515S3(context, this);
            }
        }, new Function0() { // from class: yp.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19519T3(this.f47043a, context);
            }
        }, function1M20182n, new Function0() { // from class: yp.x2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19524U3(this.f47056a, context, renderProps);
            }
        }, m19670b4(renderProps), interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: T1 */
    public final AbstractC3928c m19662T1(final Input renderProps, SelfieState.CaptureTransition renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        AbstractC3928c.c.EnumC14142c enumC14142c;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = C3929d.f16440a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new C7345l();
                }
                enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER_COMPLETE;
            }
        }
        return C3964o.m20154m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new AbstractC3928c.c.b.h(new Function0() { // from class: yp.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19522U1(context, this);
            }
        }, true, enumC14142c, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: yp.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19531W1(context, this);
            }
        }, new Function0() { // from class: yp.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19535X1(this.f46678a, context);
            }
        }, C3965p.m20182n(context, false, 1, null), new Function0() { // from class: yp.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19539Y1(this.f46696a, context, renderProps);
            }
        }, m19670b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m19663V3(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        C7758y c7758y = new C7758y();
        c7758y.f29445a = true;
        context.mo48835b("check_if_manual_capture_enabled", new C3938m(c7758y, context, this, null));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m19664W3(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar, Throwable th2) {
        String message;
        String message2 = th2.getMessage();
        if (message2 != null && StringsKt.m32152a0(message2, "ENOSPC", false, 2, null)) {
            m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof C5891h1)) {
            if (th2 instanceof InternalErrorException) {
                m19665X3(aVar, new AbstractC3927b.Error(((InternalErrorException) th2).getErrorInfo()));
                return;
            }
            m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.m32152a0(message, "ENOSPC", false, 2, null)) {
            m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        m19665X3(aVar, new AbstractC3927b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
    }

    /* JADX INFO: renamed from: X3 */
    public final void m19665X3(AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context, final AbstractC3927b output) {
        InterfaceC11932a interfaceC11932a;
        if (((output instanceof AbstractC3927b.d) || (output instanceof AbstractC3927b.a) || (output instanceof AbstractC3927b.Error) || (output instanceof AbstractC3927b.b)) && (interfaceC11932a = this.webRtcManager) != null) {
            interfaceC11932a.m44538d();
        }
        context.mo48837d().mo17905a(C13233z.m48946d(this, null, new Function1() { // from class: yp.d4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19541Y3(output, (AbstractC13225r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: renamed from: Z1 */
    public final AbstractC3928c m19666Z1(final Input renderProps, SelfieState.CountdownToCapture renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        final SelfieState.CountdownToCapture countdownToCapture;
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            countdownToCapture = renderState;
            C13230w.m48937l(context, this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), C7731d0.m32011k(C3953e.class), "", new Function1() { // from class: yp.q3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19547a2(this.f46876a, context, countdownToCapture, renderProps, (C3953e.c) obj);
                }
            });
        } else {
            countdownToCapture = renderState;
        }
        context.mo48835b("countdown_" + countdownToCapture.getCountDown(), new C3936k(renderProps, context, this, renderState, null));
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintCenterFace = strM20116b == null ? renderProps.getStrings().getSelfieHintCenterFace() : strM20116b;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        AbstractC3928c.c.b.C14140b c14140b = new AbstractC3928c.c.b.C14140b(renderState.getCountDown(), AbstractC3928c.c.EnumC14142c.CENTER, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(context, false, 1, null);
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        return C3964o.m20154m(renderProps, context, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strM20116b, renderState.getAutoCaptureSupported(), c14140b, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.r3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19554c2(context, this);
            }
        }, new Function0() { // from class: yp.s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19558d2(this.f46967a, context);
            }
        }, function1M20182n, new Function0() { // from class: yp.t3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19562e2(this.f46989a, context, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m19667Z3(AbstractC13225r<? super Input, SelfieState, ? extends AbstractC3927b>.c updater) {
        updater.m48902d(new AbstractC3927b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    /* JADX INFO: renamed from: a3 */
    public final AbstractC3928c m19668a3(final Input renderProps, final SelfieState.StartCaptureFaceDetected renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        if (renderState.mo19318k().getAutoCaptureEnabled()) {
            C13230w.m48937l(context, this.selfieAnalyzeWorker.mo20039a(this.selfieEventLogger, renderState.mo19321p(), false), C7731d0.m32011k(C3953e.class), "", new Function1() { // from class: yp.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19551b3(this.f47010a, context, renderState, renderProps, (C3953e.c) obj);
                }
            });
        }
        C13230w.m48937l(context, InterfaceC13222o.Companion.m48891b(InterfaceC13222o.INSTANCE, 1000L, null, 2, null), C7731d0.m32012l(InterfaceC13222o.class, KTypeProjection.INSTANCE.m32095a(C7731d0.m32011k(Unit.class))), "", new Function1() { // from class: yp.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19559d3(this.f47030a, renderProps, (Unit) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        AbstractC3928c.c.b.a aVar = new AbstractC3928c.c.b.a(AbstractC3928c.c.EnumC14142c.CENTER, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(context, false, 1, null);
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        AbstractC3928c.c.AssetOverrides assetOverridesM20163C = C3965p.m20163C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        C3405e.a aVar2 = this.cameraXControllerFactory;
        C6434c.a aVar3 = this.camera2ControllerFactory;
        return C3964o.m20154m(renderProps, context, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesM20163C, requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19566f3(context, this);
            }
        }, new Function0() { // from class: yp.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19570g3(this.f47069a, context);
            }
        }, function1M20182n, new Function0() { // from class: yp.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19575h3(this.f47083a, context, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, recordAudio, aVar2, aVar3, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX DEBUG: Method merged with bridge method: g(Ljava/lang/Object;)Lym/i; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public Snapshot mo16432g(@NotNull SelfieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return C0388q.m1447a(state);
    }

    /* JADX INFO: renamed from: b4 */
    public final EnumC8598a m19670b4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20264k = videoCaptureConfig.m20264k(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        return C7347n.m30463e(objM20264k) == null ? (EnumC8598a) objM20264k : EnumC8598a.None;
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m19671c4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20262i = videoCaptureConfig.m20262i(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        if (C7347n.m30463e(objM20262i) != null) {
            return false;
        }
        ((Boolean) objM20262i).getClass();
        return true;
    }

    /* JADX INFO: renamed from: f2 */
    public final AbstractC3928c m19672f2(final Input renderProps, final SelfieState.CountdownToManualCapture renderState, AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        AbstractC3928c.c.EnumC14142c enumC14142c;
        final SelfieWorkflow selfieWorkflow;
        AbstractC3928c.c.b c14140b;
        final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a aVar = context;
        final PoseInfo poseInfoMo19321p = renderState.mo19321p();
        final EnumC7638a pose = poseInfoMo19321p.getPose();
        int i10 = C3929d.f16440a[pose.ordinal()];
        if (i10 == 1) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_UP;
        } else if (i10 == 4) {
            enumC14142c = AbstractC3928c.c.EnumC14142c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new C7345l();
            }
            enumC14142c = AbstractC3928c.c.EnumC14142c.CENTER;
        }
        AbstractC3928c.c.EnumC14142c enumC14142c2 = enumC14142c;
        aVar.mo48835b("countdown_to_manual_capture_" + renderState.getCountDown(), new C3937l(aVar, this, null));
        EnumC7639b selfieError = renderState.getSelfieError();
        String strM20116b = selfieError != null ? C3962n.m20116b(selfieError, renderProps.getStrings(), renderState.mo19304j()) : null;
        String selfieHintCenterFace = strM20116b == null ? renderProps.getStrings().getSelfieHintCenterFace() : strM20116b;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            Function1 function1 = new Function1() { // from class: yp.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19569g2(poseInfoMo19321p, pose, aVar, this, renderState, (String) obj);
                }
            };
            aVar = aVar;
            selfieWorkflow = this;
            c14140b = new AbstractC3928c.c.b.d(function1, new Function1() { // from class: yp.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19579i2(this.f46705a, aVar, (Throwable) obj);
                }
            }, true, enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), false);
        } else {
            selfieWorkflow = this;
            c14140b = new AbstractC3928c.c.b.C14140b(renderState.getCountDown(), enumC14142c2, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a));
        }
        AbstractC3928c.c.b bVar = c14140b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateM44528b = selfieWorkflow.navigationStateManager.m44528b();
        Function1 function1M20182n = C3965p.m20182n(aVar, false, 1, null);
        String str = selfieHintCenterFace;
        EnumC8598a enumC8598aM19670b4 = m19670b4(renderProps);
        InterfaceC11932a interfaceC11932a = selfieWorkflow.webRtcManager;
        return C3964o.m20154m(renderProps, aVar, renderState.mo19304j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strM20116b, renderState.getAutoCaptureSupported(), bVar, C3965p.m20163C(renderProps), requireStrictSelfieCapture, navigationStateM44528b, new Function0() { // from class: yp.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19583j2(aVar, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19588k2(this.f46733a, aVar);
            }
        }, function1M20182n, new Function0() { // from class: yp.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19593l2(this.f46746a, aVar, renderProps);
            }
        }, enumC8598aM19670b4, interfaceC11932a, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.m27145a(C6152a.f23511a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: i3 */
    public final AbstractC3928c m19673i3(Input renderProps, SelfieState.Submit renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        C4658a c4658a;
        final boolean z10 = renderProps.getDesignVersion() == EnumC13272a.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            C4197b.a aVar = this.submitVerificationWorker;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            String fromComponent = renderProps.getFromComponent();
            String fromStep = renderProps.getFromStep();
            List<Selfie> listMo19297w = renderState.mo19297w();
            SelfieType selfieType = renderProps.getSelfieType();
            String fieldKeySelfie = renderProps.getFieldKeySelfie();
            String webRtcObjectId = renderState.getWebRtcObjectId();
            CameraProperties cameraProperties = renderState.getCameraProperties();
            long startSelfieTimestamp = renderState.getStartSelfieTimestamp();
            String fileUploadUrl = renderProps.getFileUploadUrl();
            C4658a c4658a2 = this.selfiePoseManager;
            if (c4658a2 == null) {
                Intrinsics.m31998u("selfiePoseManager");
                c4658a = null;
            } else {
                c4658a = c4658a2;
            }
            C13230w.m48937l(context, aVar.mo21719a(sessionToken, inquiryId, fromComponent, fromStep, selfieType, fieldKeySelfie, listMo19297w, webRtcObjectId, cameraProperties, startSelfieTimestamp, fileUploadUrl, c4658a), C7731d0.m32011k(C4197b.class), "submit_" + renderState.getSubmitAttempt(), new Function1() { // from class: yp.e3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19584j3(this.f46710a, context, z10, (C4197b.d) obj);
                }
            });
        }
        C11930a.m44527d(this.navigationStateManager, false, false, false, false, 12, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        C10700c c10700c = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateM44528b = this.navigationStateManager.m44528b();
        Function0 function0 = new Function0() { // from class: yp.f3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19598m3(this.f46724a, context);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19603n3(this.f46737a, context);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new AbstractC3928c.g(processingTitle, c10700c, processingDescription, pendingPageTextVerticalPosition, styles, navigationStateM44528b, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), C3965p.m20191w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: yp.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19608o3(context, this);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final AbstractC3928c m19674m2(final Input renderProps, SelfieState.FinalizeWebRtc renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        if (interfaceC11932a != null) {
            finalizeWebRtc = renderState;
            interfaceC11932a.m44540f(renderProps.getFromStep(), new Function1() { // from class: yp.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19602n2(context, this, renderProps, finalizeWebRtc, (String) obj);
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        return C3964o.m20154m(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new AbstractC3928c.c.b.h(new Function0() { // from class: yp.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19612p2();
            }
        }, false, AbstractC3928c.c.EnumC14142c.FINALIZING, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a)), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: yp.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19617q2(context, this);
            }
        }, new Function0() { // from class: yp.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19621r2(this.f46660a, context);
            }
        }, C3965p.m20181m(context, false), new Function0() { // from class: yp.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19626s2(this.f46680a, context, renderProps);
            }
        }, m19670b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    /* JADX INFO: renamed from: q3 */
    public final Object m19675q3(final Input renderProps, final SelfieState.WaitForCameraFeed renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || C3858g.m19164b(this.applicationContext, EnumC11024i0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && m19678w1(renderProps) && C7259g.m30272f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !C3858g.m19164b(this.applicationContext, EnumC11024i0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.m19405g());
        AbstractC3928c abstractC3928cM20154m = C3964o.m20154m(renderProps, context, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new AbstractC3928c.c.b.g(new Function1() { // from class: yp.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19647x3(this.f46767a, context, renderProps, renderState, jCurrentTimeMillis, (CameraProperties) obj);
            }
        }, AbstractC3928c.c.EnumC14142c.CLEAR, !Intrinsics.m31980c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f16126a), m19670b4(renderProps) == EnumC8598a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: yp.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19655z3(context, (Throwable) obj);
            }
        }), C3965p.m20163C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: yp.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19431A3(context, this);
            }
        }, new Function0() { // from class: yp.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19622r3(this.f46807a, context);
            }
        }, C3965p.m20182n(context, false, 1, null), new Function0() { // from class: yp.m3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19627s3(this.f46818a, context, renderProps);
            }
        }, m19670b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            EnumC11024i0 enumC11024i0 = EnumC11024i0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle != null ? cameraPermissionsTitle : "";
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(C12244g.f43223H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(C12244g.f43222G, C7259g.m30268b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return C3858g.m19166d(abstractC3928cM20154m, context, true, enumC11024i0, (3592 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : null, new Function1() { // from class: yp.n3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.m19631t3(this.f46834a, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
                }
            });
        }
        if (!z11) {
            return abstractC3928cM20154m;
        }
        EnumC11024i0 enumC11024i1 = EnumC11024i0.RecordAudio;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(C12244g.f43234S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string2 = context3.getString(C12244g.f43233R, C7259g.m30268b(context3));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        return C3858g.m19166d(abstractC3928cM20154m, context, true, enumC11024i1, (3592 & 8) != 0 ? false : false, microphonePermissionsTitle != null ? microphonePermissionsTitle : "", microphonePermissionsRationale, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (3592 & 512) != 0 ? null : null, (3592 & 1024) != 0 ? null : null, (3592 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: yp.p3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19640v3(this.f46862a, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t2 */
    public final AbstractC3928c m19676t2(final Input renderProps, final SelfieState.RestartCamera renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        if (interfaceC11932a != null) {
            interfaceC11932a.m44538d();
        }
        return new AbstractC3928c.e(new Function0() { // from class: yp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19635u2(context, this, renderProps, renderState);
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public SelfieState mo16430d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.selfiePoseManager = this.selfiePoseManagerFactory.mo22918a(props.getInquiryId(), props.getSessionToken(), props.getFromStep(), props.m19684C(), props.getPoseTimeoutMs());
        this.selfieEventLogger.m20064o(props.getUsePerPoseReveal());
        if (snapshot != null) {
            C12930h c12930hM48870b = snapshot.m48870b();
            Parcelable parcelable = null;
            if (c12930hM48870b.m48089I() <= 0) {
                c12930hM48870b = null;
            }
            if (c12930hM48870b != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrMo48094O = c12930hM48870b.mo48094O();
                parcelObtain.unmarshall(bArrMo48094O, 0, bArrMo48094O.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            SelfieState selfieState = (SelfieState) parcelable;
            if (selfieState != null) {
                return selfieState;
            }
        }
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.m19683A(), props.getPoseConfigs(), false, CameraProperties.EnumC3397b.User, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    /* JADX INFO: renamed from: w1 */
    public final boolean m19678w1(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        InterfaceC11932a interfaceC11932a = this.webRtcManager;
        Boolean boolValueOf = interfaceC11932a != null ? Boolean.valueOf(interfaceC11932a.m44537c()) : null;
        InterfaceC11932a interfaceC11932a2 = this.webRtcManager;
        Object objM20262i = videoCaptureConfig.m20262i(boolValueOf, interfaceC11932a2 != null ? Boolean.valueOf(interfaceC11932a2.m44541g()) : null, this.applicationContext);
        if (C7347n.m30463e(objM20262i) == null) {
            return ((Boolean) objM20262i).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: w2 */
    public final AbstractC3928c m19679w2(final Input renderProps, final SelfieState.ReviewCaptures renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(C12244g.f43232Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(C12244g.f43224I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(C12244g.f43228M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(C12244g.f43229N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(C12244g.f43230O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(C12244g.f43231P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(C12244g.f43227L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(C12244g.f43226K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(C12244g.f43225J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new AbstractC3928c.f(new AbstractC3928c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.m19365z(), renderProps.getStyles(), this.navigationStateManager.m44528b(), new Function0() { // from class: yp.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19646x2(context, this, renderState);
            }
        }, new Function0() { // from class: yp.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19654z2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: yp.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19435B2(context, this);
            }
        }, new Function0() { // from class: yp.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19439C2(this.f46765a, context);
            }
        }, renderProps.getStrings().getCheckPageNavBarTitle());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:38:0x014f  */
    /* JADX WARN: Code duplicated, block: B:40:0x015d  */
    /* JADX WARN: Code duplicated, block: B:42:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0170  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    /* JADX WARN: Code duplicated, block: B:47:0x019e  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b9  */
    /* JADX INFO: renamed from: x1 */
    public final <T extends SelfieState & InterfaceC3939a> SelfieState m19680x1(AbstractC13225r<? super Input, SelfieState, ?>.c cVar, T t8, Selfie selfie) {
        SelfieState selfieStateM20164D;
        long j10;
        if (selfie != null) {
            this.selfieEventLogger.m20055f(t8, selfie);
        }
        String fileUploadUrl = cVar.m48900b().getFileUploadUrl();
        if (fileUploadUrl != null && (selfie instanceof Selfie.SelfieImage)) {
            this.directFileUploader.m19994j(((Selfie.SelfieImage) selfie).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<Selfie> listX0 = selfie != null ? CollectionsKt.m31726x0(t8.mo19297w(), selfie) : t8.mo19297w();
        List<PoseInfo> listY = selfie != null ? CollectionsKt.m31701Y(t8.mo19302g(), 1) : t8.mo19302g();
        if (cVar.m48900b().getUsePerPoseReveal()) {
            C4658a c4658a = this.selfiePoseManager;
            if (c4658a == null) {
                Intrinsics.m31998u("selfiePoseManager");
                c4658a = null;
            }
            c4658a.m22916n(listX0.size() + 1);
        }
        if (cVar.m48900b().getUsePerPoseReveal() && selfie != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.m31706d0(t10.mo19302g())).getIsLast()) {
                T t11 = t8;
                selfieStateM20164D = new SelfieState.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (m19670b4(cVar.m48900b()) == EnumC8598a.Upload) {
                    if (cVar.m48900b().getDesignVersion() == EnumC13272a.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    selfieStateM20164D = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (m19670b4(cVar.m48900b()) == EnumC8598a.Stream) {
                    T t13 = t8;
                    selfieStateM20164D = new SelfieState.FinalizeWebRtc(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    selfieStateM20164D = C3965p.m20164D(cVar, listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.m31706d0(listY)).getPose() == EnumC7638a.Center) {
                T t15 = t8;
                selfieStateM20164D = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), cVar.m48900b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                selfieStateM20164D = new SelfieState.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), cVar.m48900b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.m31706d0(listY)).getPose() == EnumC7638a.Center) {
                T t17 = t8;
                selfieStateM20164D = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), cVar.m48900b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                selfieStateM20164D = new SelfieState.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), cVar.m48900b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (m19670b4(cVar.m48900b()) == EnumC8598a.Upload) {
            if (cVar.m48900b().getDesignVersion() == EnumC13272a.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            selfieStateM20164D = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (m19670b4(cVar.m48900b()) == EnumC8598a.Stream) {
            T t110 = t8;
            selfieStateM20164D = new SelfieState.FinalizeWebRtc(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            selfieStateM20164D = C3965p.m20164D(cVar, listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        SelfieState selfieState = selfieStateM20164D;
        return selfie == null ? selfieState : new SelfieState.CaptureTransition(selfieState, t8.mo19304j(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    /* JADX DEBUG: Method merged with bridge method: f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object; */
    @Override // p581ym.AbstractC13218k
    @NotNull
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public Object mo16431f(@NotNull Input renderProps, @NotNull SelfieState renderState, @NotNull AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        Object objM19682z1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C3965p.m20168H(renderState)) {
            context.mo48835b("close_camera", new C3930e(null));
        }
        if (!m19671c4(renderProps)) {
            context.mo48835b("output_webrtc_error", new C3931f(context, this, null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        C11930a.m44527d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.m20054e(renderProps.getFromStep(), C5776l2.m26154f(renderState));
        if (renderState instanceof SelfieState.ShowInstructions) {
            objM19682z1 = m19657D2(renderProps, (SelfieState.ShowInstructions) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            objM19682z1 = m19656B3(renderProps, (SelfieState.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            objM19682z1 = m19675q3(renderProps, (SelfieState.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            objM19682z1 = m19676t2(renderProps, (SelfieState.RestartCamera) renderState, context);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            objM19682z1 = m19658J2(renderProps, (SelfieState.ShowPoseHint) renderState, context);
        } else if (renderState instanceof SelfieState.StartCapture) {
            objM19682z1 = m19660P2(renderProps, (SelfieState.StartCapture) renderState, context);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            objM19682z1 = m19668a3(renderProps, (SelfieState.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            objM19682z1 = m19666Z1(renderProps, (SelfieState.CountdownToCapture) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            objM19682z1 = m19672f2(renderProps, (SelfieState.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof SelfieState.Capture) {
            objM19682z1 = m19659K1(renderProps, (SelfieState.Capture) renderState, context);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            objM19682z1 = m19662T1(renderProps, (SelfieState.CaptureTransition) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            objM19682z1 = this.localVideoCaptureRenderer.m28378q(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            objM19682z1 = m19674m2(renderProps, (SelfieState.FinalizeWebRtc) renderState, context);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            objM19682z1 = m19661P3(renderProps, (SelfieState.WebRtcFinished) renderState, context);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            objM19682z1 = m19679w2(renderProps, (SelfieState.ReviewCaptures) renderState, context);
        } else if (z10) {
            objM19682z1 = m19673i3(renderProps, (SelfieState.Submit) renderState, context);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new C7345l();
            }
            objM19682z1 = m19682z1(renderProps, (SelfieState.AcquireNextPose) renderState, context);
        }
        return objM19682z1 instanceof AbstractC3928c.c ? C3858g.m19165c(objM19682z1) : objM19682z1;
    }

    /* JADX INFO: renamed from: z1 */
    public final AbstractC3928c m19682z1(final Input renderProps, SelfieState.AcquireNextPose renderState, final AbstractC13218k<? super Input, SelfieState, ? extends AbstractC3927b, ? extends Object>.a context) {
        int size = renderState.mo19297w().size();
        context.mo48835b("fetch_pose_" + size, new C3932g(size, context, null));
        return new AbstractC3928c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new AbstractC3928c.a.AbstractC14138a.C14139a(AbstractC3928c.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: yp.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SelfieWorkflow.m19429A1(context, this, (EnumC7638a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: yp.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19438C1(context, this, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.m44528b(), new Function0() { // from class: yp.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19447E1(context, this);
            }
        }, new Function0() { // from class: yp.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19452F1(this.f46749a, context);
            }
        }, C3965p.m20182n(context, false, 1, null), new Function0() { // from class: yp.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m19457G1(this.f46964a, context, renderProps);
            }
        }, m19670b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: yp.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19462H1(context, this, (CameraProperties.EnumC3397b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.m27145a(C6152a.f23511a), false, false, new Function1() { // from class: yp.o3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.m19472J1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }
}
