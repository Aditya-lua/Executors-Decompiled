package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorException;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader;
import com.withpersona.sdk2.inquiry.selfie.pose.PoseInfo;
import com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.steps.ui.CustomPendingPage;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.workflows.WorkflowState;
import fq.l2;
import g0.h1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import ku.p0;
import ku.z0;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rp.i0;
import rp.j1;
import ym.Snapshot;
import ym.r;
import ym.w;
import ym.z;
import yp.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00ad\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0085\u0001®\u0001\u0087\u0001\u0089\u0001B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'JC\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b.\u0010/JC\u00101\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002002\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JC\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b5\u00106JC\u00108\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002072\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b8\u00109JC\u0010;\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020:2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b;\u0010<JC\u0010>\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020=2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b>\u0010?JC\u0010A\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020@2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bA\u0010BJC\u0010D\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020C2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bD\u0010EJC\u0010G\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020F2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bG\u0010HJC\u0010J\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020I2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bJ\u0010KJC\u0010M\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020L2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bM\u0010NJC\u0010P\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020O2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bP\u0010QJC\u0010S\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020R2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bS\u0010TJC\u0010V\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020U2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^J-\u0010c\u001a\u00020b2\u001c\u0010a\u001a\u00180_R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040`H\u0002¢\u0006\u0004\bc\u0010dJC\u0010f\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020e2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bf\u0010gJC\u0010i\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020h2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bi\u0010jJG\u0010p\u001a\u00020\u0003\"\f\b\u0000\u0010l*\u00020\u0003*\u00020k*\u00160_R\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030`2\u0006\u0010m\u001a\u00028\u00002\b\u0010o\u001a\u0004\u0018\u00010nH\u0002¢\u0006\u0004\bp\u0010qJ3\u0010r\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\br\u0010sJ;\u0010u\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010t\u001a\u00020\u0004H\u0002¢\u0006\u0004\bu\u0010vJ7\u0010y\u001a\u00020b*\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\b\u0010}\u001a\u0004\u0018\u00010|H\u0016¢\u0006\u0004\b~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u001a\u0010¨\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010¬\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001¨\u0006¯\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;", "Lym/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "Landroid/content/Context;", "applicationContext", "Lcq/b$a;", "submitVerificationWorker", "Ltr/b$a;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "selfieAnalyzeWorker", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lhq/j;", "localVideoCaptureRenderer", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lln/a;", "cameraStatsManager", "Luq/a;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "directFileUploader", "Ldq/a$b;", "selfiePoseManagerFactory", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "inquiryThemeManager", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "selfieEventLogger", "Lqq/c;", "sdkFilesManager", "Lgo/e;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lhq/j;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;Lgo/e;)V", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;", "renderState", "Lym/k$a;", "context", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "D2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;", "q3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lym/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;", "B3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;", "P2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;", "a3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;", "Z1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;", "f2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;", "K1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;", "T1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;", "m2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;", "P3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "c4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z", "w1", "Lmn/a;", "b4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;", "Lym/r$c;", "Lym/r;", "updater", "", "Z3", "(Lym/r$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;", "w2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;", "i3", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/a;", "T", "currentState", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "capturedSelfie", "x1", "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "V3", "(Lym/k$a;)V", "output", "X3", "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V", "", "error", "W3", "(Lym/k$a;Ljava/lang/Throwable;)V", "props", "Lym/i;", "snapshot", "v1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "y1", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lym/k$a;)Ljava/lang/Object;", "state", "a4", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lym/i;", "a", "Landroid/content/Context;", "b", "Lcq/b$a;", "c", "Ltr/b$a;", "d", "Lcom/withpersona/sdk2/inquiry/selfie/e$b;", "e", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "f", "Lhq/j;", "g", "Lcom/withpersona/sdk2/camera/e$a;", "h", "Lhn/c$a;", "i", "Lln/a;", "j", "Luq/a;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;", "l", "Ldq/a$b;", "m", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "n", "Lcom/withpersona/sdk2/inquiry/selfie/g;", "o", "Lqq/c;", "p", "Lgo/e;", "Lur/a;", "q", "Lur/a;", "webRtcManager", "Ldq/a;", "r", "Ldq/a;", "selfiePoseManager", "s", "Input", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieWorkflow extends ym.k<Input, SelfieState, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final cq.b.a submitVerificationWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tr.b.a webRtcWorkerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.e.b selfieAnalyzeWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestWorkflow permissionRequestWorkflow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.j localVideoCaptureRenderer;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hn.c.a camera2ControllerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ln.a cameraStatsManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uq.a navigationStateManager;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DirectFileUploader directFileUploader;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dq.a.b selfiePoseManagerFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.shared.inquiryTheme.a inquiryThemeManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final qq.c sdkFilesManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final go.e featureFlagManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ur.a webRtcManager;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public dq.a selfiePoseManager;

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0083\u0001Bµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0007\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u001d\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000202¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000202HÖ\u0001¢\u0006\u0004\b=\u00104J\u001a\u0010@\u001a\u00020\u00072\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010<R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bM\u0010L\u001a\u0004\bO\u0010NR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010<R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010NR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bT\u0010L\u001a\u0004\bU\u0010NR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bO\u0010_\u001a\u0004\bb\u0010aR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bZ\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bV\u0010<R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\bT\u0010<R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\bP\u0010<R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bj\u0010<R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010C\u001a\u0004\bk\u0010<R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bl\u0010<R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bm\u0010<R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\bl\u0010n\u001a\u0004\bo\u0010pR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bk\u0010q\u001a\u0004\br\u0010sR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bD\u0010t\u001a\u0004\bB\u0010uR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bj\u0010v\u001a\u0004\bw\u0010xR\u0017\u0010(\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b`\u0010y\u001a\u0004\bz\u0010{R\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bg\u0010~R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bh\u0010<R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bw\u0010C\u001a\u0004\bi\u0010<R\u0017\u0010-\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\bz\u0010L\u001a\u0004\b\u007f\u0010NR\u001c\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bc\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "strings", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "orderedPosesBuffered", "", "poseTimeoutMs", "cameraPermissionsTitle", "cameraPermissionsRationale", "cameraPermissionsModalPositiveButton", "cameraPermissionsModalNegativeButton", "microphonePermissionsTitle", "microphonePermissionsRationale", "microphonePermissionsModalPositiveButton", "microphonePermissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "videoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "poseConfigs", "Lyp/a;", "designVersion", "fileUploadUrl", "flowWatermarkText", "usePerPoseReveal", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "customPendingPage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lyp/a;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "y", "b", "u", "c", "s", "d", "t", "e", "Z", "f", "()Z", "m", "g", "p", "h", "I", "i", "K", "j", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "L", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "k", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "J", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "Ljava/util/List;", "A", "()Ljava/util/List;", "C", "n", "Ljava/lang/Long;", "G", "()Ljava/lang/Long;", "o", "q", "r", "z", "x", "w", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "N", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "P", "()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "D", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "E", "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "B", "Lyp/a;", "()Lyp/a;", "O", "F", "Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;", "Strings", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Input implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        @NotNull
        public final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        @NotNull
        public final yp.a designVersion;

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

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sessionToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromComponent;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fromStep;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean backStepEnabled;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String fieldKeySelfie;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean skipPromptPage;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Strings strings;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final SelfieType selfieType;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<PoseInfo> orderedPoses;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final List<PoseInfo> orderedPosesBuffered;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Long poseTimeoutMs;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsTitle;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsRationale;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalPositiveButton;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String cameraPermissionsModalNegativeButton;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsTitle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsRationale;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String microphonePermissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final VideoCaptureConfig videoCaptureConfig;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final PendingPageTextPosition pendingPageTextVerticalPosition;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000201¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000201HÖ\u0001¢\u0006\u0004\b<\u00103J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010;R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010;R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010;R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010C\u001a\u0004\bJ\u0010;R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010C\u001a\u0004\bL\u0010;R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bM\u0010C\u001a\u0004\bN\u0010;R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\bO\u0010;R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bP\u0010C\u001a\u0004\bQ\u0010;R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010C\u001a\u0004\bR\u0010;R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u0010;R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bU\u0010;R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bW\u0010;R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bX\u0010C\u001a\u0004\bY\u0010;R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bZ\u0010;R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\b[\u0010;R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010C\u001a\u0004\b_\u0010;R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\b`\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\ba\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bb\u0010C\u001a\u0004\bc\u0010;R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010C\u001a\u0004\be\u0010;R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bg\u0010;R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010C\u001a\u0004\b^\u0010;R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010C\u001a\u0004\b\\\u0010;R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bj\u0010C\u001a\u0004\bk\u0010;R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bl\u0010C\u001a\u0004\bf\u0010;R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bm\u0010C\u001a\u0004\bi\u0010;R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bn\u0010C\u001a\u0004\bl\u0010;R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bm\u0010;R\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bk\u0010C\u001a\u0004\bo\u0010;R\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bp\u0010C\u001a\u0004\bh\u0010;R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bq\u0010C\u001a\u0004\bd\u0010;R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bb\u0010;R\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\br\u0010C\u001a\u0004\bB\u0010;R\u0019\u0010%\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bs\u0010C\u001a\u0004\bS\u0010;R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b[\u0010C\u001a\u0004\bs\u0010;R\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010C\u001a\u0004\bt\u0010;R\u0019\u0010(\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010C\u001a\u0004\bu\u0010;R\u0019\u0010)\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bv\u0010C\u001a\u0004\bw\u0010;R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\be\u0010C\u001a\u0004\bx\u0010;R\u0019\u0010+\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bM\u0010;R\u0019\u0010,\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bx\u0010C\u001a\u0004\by\u0010;R\u0019\u0010-\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b_\u0010C\u001a\u0004\bp\u0010;R\u0019\u0010.\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bt\u0010C\u001a\u0004\bX\u0010;¨\u0006z"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;", "Landroid/os/Parcelable;", "", Title.type, "prompt", "disclosure", "startButton", "capturePageTitle", "capturePageNavBarTitle", "promptPageNavBarTitle", "pendingPageNavBarTitle", "checkPageNavBarTitle", "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCentered", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintLookUp", "selfieHintLookDown", "selfieHintHoldStill", "selfieHintPoseTimeout", "processingTitle", "processingDescription", "selfieCheckPageTitle", "selfieCheckPageDescription", "selfieCheckPageLabelFront", "selfieCheckPageLabelLeft", "selfieCheckPageLabelRight", "selfieCheckPageLabelUp", "selfieCheckPageLabelDown", "selfieCheckPageBtnSubmit", "selfieCheckPageBtnRetake", "autoCaptureOn", "captureSuccess", "selfieHintCenterFaceDescription", "selfieHintLookLeftDescription", "selfieHintLookRightDescription", "selfieHintLookUpDescription", "selfieHintLookDownDescription", "cameraLoadingTitle", "selfieHintVerifying", "selfieHintAutoCaptureTimeout", "disclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "b", "r", "c", "n", "d", "h0", "e", "i", "f", "g", "s", "h", "o", "k", "j", "d0", "G", "l", "K", "m", "L", "W", "J", "p", "b0", "q", "Q", "S", "U", "t", "O", "u", "N", "v", "c0", "w", "x", "y", "D", "z", "A", "B", "C", "E", "F", "H", "I", "R", "T", "M", "V", "P", "g0", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strings implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Strings> CREATOR = new a();

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

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String startButton;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String capturePageTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String capturePageNavBarTitle;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String promptPageNavBarTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String pendingPageNavBarTitle;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String checkPageNavBarTitle;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintTakePhoto;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintCenterFace;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooClose;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceTooFar;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintMultipleFaces;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintFaceIncomplete;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintPoseNotCentered;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookLeft;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintLookRight;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookUp;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintLookDown;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String selfieHintHoldStill;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieHintPoseTimeout;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingTitle;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final String processingDescription;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageTitle;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
            @Nullable
            public final String selfieCheckPageDescription;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Strings> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Strings createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Strings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

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
                return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.prompt, strings.prompt) && Intrinsics.c(this.disclosure, strings.disclosure) && Intrinsics.c(this.startButton, strings.startButton) && Intrinsics.c(this.capturePageTitle, strings.capturePageTitle) && Intrinsics.c(this.capturePageNavBarTitle, strings.capturePageNavBarTitle) && Intrinsics.c(this.promptPageNavBarTitle, strings.promptPageNavBarTitle) && Intrinsics.c(this.pendingPageNavBarTitle, strings.pendingPageNavBarTitle) && Intrinsics.c(this.checkPageNavBarTitle, strings.checkPageNavBarTitle) && Intrinsics.c(this.selfieHintTakePhoto, strings.selfieHintTakePhoto) && Intrinsics.c(this.selfieHintCenterFace, strings.selfieHintCenterFace) && Intrinsics.c(this.selfieHintFaceTooClose, strings.selfieHintFaceTooClose) && Intrinsics.c(this.selfieHintFaceTooFar, strings.selfieHintFaceTooFar) && Intrinsics.c(this.selfieHintMultipleFaces, strings.selfieHintMultipleFaces) && Intrinsics.c(this.selfieHintFaceIncomplete, strings.selfieHintFaceIncomplete) && Intrinsics.c(this.selfieHintPoseNotCentered, strings.selfieHintPoseNotCentered) && Intrinsics.c(this.selfieHintLookLeft, strings.selfieHintLookLeft) && Intrinsics.c(this.selfieHintLookRight, strings.selfieHintLookRight) && Intrinsics.c(this.selfieHintLookUp, strings.selfieHintLookUp) && Intrinsics.c(this.selfieHintLookDown, strings.selfieHintLookDown) && Intrinsics.c(this.selfieHintHoldStill, strings.selfieHintHoldStill) && Intrinsics.c(this.selfieHintPoseTimeout, strings.selfieHintPoseTimeout) && Intrinsics.c(this.processingTitle, strings.processingTitle) && Intrinsics.c(this.processingDescription, strings.processingDescription) && Intrinsics.c(this.selfieCheckPageTitle, strings.selfieCheckPageTitle) && Intrinsics.c(this.selfieCheckPageDescription, strings.selfieCheckPageDescription) && Intrinsics.c(this.selfieCheckPageLabelFront, strings.selfieCheckPageLabelFront) && Intrinsics.c(this.selfieCheckPageLabelLeft, strings.selfieCheckPageLabelLeft) && Intrinsics.c(this.selfieCheckPageLabelRight, strings.selfieCheckPageLabelRight) && Intrinsics.c(this.selfieCheckPageLabelUp, strings.selfieCheckPageLabelUp) && Intrinsics.c(this.selfieCheckPageLabelDown, strings.selfieCheckPageLabelDown) && Intrinsics.c(this.selfieCheckPageBtnSubmit, strings.selfieCheckPageBtnSubmit) && Intrinsics.c(this.selfieCheckPageBtnRetake, strings.selfieCheckPageBtnRetake) && Intrinsics.c(this.autoCaptureOn, strings.autoCaptureOn) && Intrinsics.c(this.captureSuccess, strings.captureSuccess) && Intrinsics.c(this.selfieHintCenterFaceDescription, strings.selfieHintCenterFaceDescription) && Intrinsics.c(this.selfieHintLookLeftDescription, strings.selfieHintLookLeftDescription) && Intrinsics.c(this.selfieHintLookRightDescription, strings.selfieHintLookRightDescription) && Intrinsics.c(this.selfieHintLookUpDescription, strings.selfieHintLookUpDescription) && Intrinsics.c(this.selfieHintLookDownDescription, strings.selfieHintLookDownDescription) && Intrinsics.c(this.cameraLoadingTitle, strings.cameraLoadingTitle) && Intrinsics.c(this.selfieHintVerifying, strings.selfieHintVerifying) && Intrinsics.c(this.selfieHintAutoCaptureTimeout, strings.selfieHintAutoCaptureTimeout) && Intrinsics.c(this.disclaimer, strings.disclaimer);
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

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
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
                return new Input(string, string2, string3, string4, z10, z11, string5, z12, z13, stringsCreateFromParcel, selfieType, arrayList2, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (StepStyles.SelfieStepStyle) parcel.readParcelable(Input.class.getClassLoader()), VideoCaptureConfig.CREATOR.createFromParcel(parcel), (NextStep.Selfie.AssetConfig) parcel.readParcelable(Input.class.getClassLoader()), PendingPageTextPosition.valueOf(parcel.readString()), PoseConfigs.CREATOR.createFromParcel(parcel), yp.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (CustomPendingPage) parcel.readParcelable(Input.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Input[] newArray(int i10) {
                return new Input[i10];
            }
        }

        public Input(@NotNull String sessionToken, @NotNull String inquiryId, @NotNull String fromComponent, @NotNull String fromStep, boolean z10, boolean z11, @NotNull String fieldKeySelfie, boolean z12, boolean z13, @NotNull Strings strings, @NotNull SelfieType selfieType, @NotNull List<PoseInfo> orderedPoses, @Nullable List<PoseInfo> list, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull NextStep.Selfie.AssetConfig assetConfig, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @NotNull PoseConfigs poseConfigs, @NotNull yp.a designVersion, @Nullable String str9, @Nullable String str10, boolean z14, @Nullable CustomPendingPage customPendingPage) {
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
        public final List<PoseInfo> A() {
            return this.orderedPoses;
        }

        @Nullable
        public final List<PoseInfo> C() {
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
            return Intrinsics.c(this.sessionToken, input.sessionToken) && Intrinsics.c(this.inquiryId, input.inquiryId) && Intrinsics.c(this.fromComponent, input.fromComponent) && Intrinsics.c(this.fromStep, input.fromStep) && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && Intrinsics.c(this.fieldKeySelfie, input.fieldKeySelfie) && this.requireStrictSelfieCapture == input.requireStrictSelfieCapture && this.skipPromptPage == input.skipPromptPage && Intrinsics.c(this.strings, input.strings) && Intrinsics.c(this.selfieType, input.selfieType) && Intrinsics.c(this.orderedPoses, input.orderedPoses) && Intrinsics.c(this.orderedPosesBuffered, input.orderedPosesBuffered) && Intrinsics.c(this.poseTimeoutMs, input.poseTimeoutMs) && Intrinsics.c(this.cameraPermissionsTitle, input.cameraPermissionsTitle) && Intrinsics.c(this.cameraPermissionsRationale, input.cameraPermissionsRationale) && Intrinsics.c(this.cameraPermissionsModalPositiveButton, input.cameraPermissionsModalPositiveButton) && Intrinsics.c(this.cameraPermissionsModalNegativeButton, input.cameraPermissionsModalNegativeButton) && Intrinsics.c(this.microphonePermissionsTitle, input.microphonePermissionsTitle) && Intrinsics.c(this.microphonePermissionsRationale, input.microphonePermissionsRationale) && Intrinsics.c(this.microphonePermissionsModalPositiveButton, input.microphonePermissionsModalPositiveButton) && Intrinsics.c(this.microphonePermissionsModalNegativeButton, input.microphonePermissionsModalNegativeButton) && Intrinsics.c(this.styles, input.styles) && Intrinsics.c(this.videoCaptureConfig, input.videoCaptureConfig) && Intrinsics.c(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition && Intrinsics.c(this.poseConfigs, input.poseConfigs) && this.designVersion == input.designVersion && Intrinsics.c(this.fileUploadUrl, input.fileUploadUrl) && Intrinsics.c(this.flowWatermarkText, input.flowWatermarkText) && this.usePerPoseReveal == input.usePerPoseReveal && Intrinsics.c(this.customPendingPage, input.customPendingPage);
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
        public final yp.a getDesignVersion() {
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

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "", "<init>", "()V", "b", "d", "a", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f12633a = new a();

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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0231b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0231b f12634a = new C0231b();

            public C0231b() {
                super(null);
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof C0231b);
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
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return (other instanceof Error) && Intrinsics.c(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @NotNull
            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f12636a = new d();

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

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", "<init>", "()V", "b", "e", "c", "a", "f", "g", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bL\u0018\u00002\u00020\u0001:\u0002>BB\u009d\u0003\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0019\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010-\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020\f\u0012\u0006\u0010/\u001a\u00020\f\u0012\u0006\u00100\u001a\u00020\f\u0012\u0006\u00101\u001a\u00020\f\u0012\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0019\u0012\b\u00104\u001a\u0004\u0018\u000103\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u00106\u001a\u00020\f\u0012\u0006\u00107\u001a\u00020\f\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u0010?\u001a\u0004\bI\u0010AR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bJ\u0010AR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010AR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\bM\u0010AR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bL\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010U\u001a\u0004\bV\u0010WR\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bS\u0010Y\u001a\u0004\bZ\u0010[R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bZ\u0010]\u001a\u0004\b`\u0010_R'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019j\u0002`\u001b8\u0006¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bb\u0010cR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bd\u0010_R\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b`\u0010i\u001a\u0004\bj\u0010kR\u0017\u0010\"\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bd\u0010n\u001a\u0004\bG\u0010oR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bF\u0010rR#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bs\u0010a\u001a\u0004\be\u0010cR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bJ\u0010t\u001a\u0004\bs\u0010uR\u0019\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bD\u0010xR\u0017\u0010-\u001a\u00020'8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bN\u0010{R\u0017\u0010.\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\b|\u0010QR\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\b}\u0010QR\u0017\u00100\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010O\u001a\u0004\b~\u0010QR\u0017\u00101\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bg\u0010O\u001a\u0004\b\u007f\u0010QR#\u00102\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u00198\u0006¢\u0006\f\n\u0004\bt\u0010a\u001a\u0004\bl\u0010cR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\bj\u0010\u0080\u0001\u001a\u0005\bp\u0010\u0081\u0001R\u0017\u00105\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bm\u0010O\u001a\u0004\by\u0010QR\u0017\u00106\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bP\u0010O\u001a\u0004\bv\u0010QR\u0017\u00107\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b}\u0010O\u001a\u0004\b>\u0010QR\u0019\u00109\u001a\u0002088\u0006¢\u0006\u000e\n\u0005\b\u007f\u0010\u0082\u0001\u001a\u0005\bK\u0010\u0083\u0001R\u0019\u0010:\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b|\u0010?\u001a\u0004\bt\u0010AR\u0019\u0010;\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b~\u0010?\u001a\u0004\b\\\u0010A¨\u0006\u0084\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "description", "autoCaptureText", "captureSuccessText", "disclaimerText", "realTimeHint", "hintAutoCaptureTimeoutText", "hintVerifyingText", "", "isAutoCaptureOn", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "onCameraFacingModeSelected", "", "poseScore", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "brightnessInfo", "facingMode", "isFlashEnabled", "isAutoFlashOnManualCaptureEnabled", "isFlashOn", "isDimLightConditions", "onFlashSet", "Lkn/a;", "pose", "requestingPermissions", "recordingLocallyRequired", "allowSwitchCamera", "Lyp/a;", "designVersion", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lkotlin/jvm/functions/Function1;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZLkotlin/jvm/functions/Function1;Lkn/a;ZZZLyp/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "D", "()Ljava/lang/String;", "b", "m", "c", "g", "d", "e", "f", "i", "y", "h", "k", "l", "j", "Z", "I", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "n", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "C", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "B", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "p", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "o", "Lkotlin/jvm/functions/Function0;", "q", "()Lkotlin/jvm/functions/Function0;", "t", "Lkotlin/jvm/functions/Function1;", "r", "()Lkotlin/jvm/functions/Function1;", "v", "s", "Lmn/a;", "E", "()Lmn/a;", "Lur/a;", "G", "()Lur/a;", "u", "H", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "w", "Lhn/c$a;", "()Lhn/c$a;", "x", "F", "()F", "z", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "A", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "L", "J", "M", "K", "Lkn/a;", "()Lkn/a;", "Lyp/a;", "()Lyp/a;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends c {

            /* JADX INFO: renamed from: A, reason: from kotlin metadata */
            @NotNull
            public final CameraProperties.b facingMode;

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
            public final kn.a pose;

            /* JADX INFO: renamed from: H, reason: from kotlin metadata */
            public final boolean requestingPermissions;

            /* JADX INFO: renamed from: I, reason: from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: J, reason: from kotlin metadata */
            public final boolean allowSwitchCamera;

            /* JADX INFO: renamed from: K, reason: from kotlin metadata */
            @NotNull
            public final yp.a designVersion;

            /* JADX INFO: renamed from: L, reason: from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: M, reason: from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String autoCaptureText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String captureSuccessText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String disclaimerText;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String realTimeHint;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintAutoCaptureTimeoutText;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String hintVerifyingText;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            public final boolean isAutoCaptureOn;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AbstractC0232a mode;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final mn.a videoCaptureMethod;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final ur.a webRtcManager;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

            /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final hn.c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<CameraProperties.b, Unit> onCameraFacingModeSelected;

            /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
            public final float poseScore;

            /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final SelfieBrightnessInfo brightnessInfo;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\b\t\n\u000b\f\u0005\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "h", "j", "g", "c", "i", "e", "f", "b", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class AbstractC0232a {

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "sessionToken", "inquiryId", "stepName", "Lkotlin/Function2;", "Lkn/a;", "", "", "onComplete", "Lkotlin/Function1;", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Ljava/lang/String;", "getSessionToken", "()Ljava/lang/String;", "c", "getInquiryId", "d", "getStepName", "e", "Lkotlin/jvm/functions/Function2;", "getOnComplete", "()Lkotlin/jvm/functions/Function2;", "f", "Lkotlin/jvm/functions/Function1;", "getOnError", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0233a extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final String sessionToken;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String inquiryId;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final String stepName;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function2<kn.a, Boolean, Unit> onComplete;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0233a(@NotNull b overlay, @NotNull String sessionToken, @NotNull String inquiryId, @NotNull String stepName, @NotNull Function2<? super kn.a, ? super Boolean, Unit> onComplete, @NotNull Function1<? super Throwable, Unit> onError) {
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$b */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class b extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$c, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "countDown", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;I)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "I", "()I", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0234c extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final int countDown;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0234c(@NotNull b overlay, int i10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.countDown = i10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "d", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class d extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onAnimationComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final boolean getStartFinalize() {
                        return this.startFinalize;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$e */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "c", "Z", "()Z", "e", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class e extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
                        return this.processImage;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getIsCapturing() {
                        return this.isCapturing;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$f */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onCaptureClicked", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class f extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$g */
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "poseHintComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class g extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public b getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$h */
                @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "recordLocalVideo", "", "maxRecordingLengthMs", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "", "onError", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;ZJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Z", "e", "()Z", "c", "J", "()J", "d", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class h extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<CameraProperties, Unit> d() {
                        return this.previewReady;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final boolean getRecordLocalVideo() {
                        return this.recordLocalVideo;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$i */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Lkotlin/jvm/functions/Function0;Z)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class i extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final b overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$a$a$j */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$j;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "overlay", "", "maxRecordingLengthMs", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;J)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "b", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class j extends AbstractC0232a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.a.AbstractC0232a
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

                public /* synthetic */ AbstractC0232a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract b getOverlay();

                public AbstractC0232a() {
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum b {
                CLEAR,
                CENTER,
                LOOK_LEFT,
                LOOK_RIGHT,
                LOOK_UP,
                LOOK_DOWN,
                FINALIZING;


                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public static final /* synthetic */ qt.a f12692i = qt.b.a(a());
            }

            public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, AbstractC0232a abstractC0232a, StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, NavigationState navigationState, Function0 function0, Function0 function1, Function1 function2, Function0 function3, mn.a aVar, ur.a aVar2, boolean z12, com.withpersona.sdk2.camera.e.a aVar3, hn.c.a aVar4, Function1 function4, float f10, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.b bVar, boolean z13, boolean z14, boolean z15, boolean z16, Function1 function5, kn.a aVar5, boolean z17, boolean z18, boolean z19, yp.a aVar6, String str10, String str11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i10 & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, z10, abstractC0232a, selfieStepStyle, z11, navigationState, function0, function1, function2, function3, aVar, aVar2, z12, aVar3, aVar4, function4, f10, selfieBrightnessInfo, bVar, z13, z14, z15, z16, function5, aVar5, z17, z18, z19, aVar6, (i11 & 32) != 0 ? null : str10, (i11 & 64) != 0 ? null : str11);
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
            public final mn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: F, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: G, reason: from getter */
            public final ur.a getWebRtcManager() {
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
            public final hn.c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: e, reason: from getter */
            public final com.withpersona.sdk2.camera.e.a getCameraXControllerFactory() {
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
            public final yp.a getDesignVersion() {
                return this.designVersion;
            }

            @Nullable
            /* JADX INFO: renamed from: i, reason: from getter */
            public final String getDisclaimerText() {
                return this.disclaimerText;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final CameraProperties.b getFacingMode() {
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
            public final AbstractC0232a getMode() {
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
            public final Function0<Unit> q() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> r() {
                return this.onCameraError;
            }

            @NotNull
            public final Function1<CameraProperties.b, Unit> s() {
                return this.onCameraFacingModeSelected;
            }

            @NotNull
            public final Function0<Unit> t() {
                return this.onCancel;
            }

            @NotNull
            public final Function1<Boolean, Unit> u() {
                return this.onFlashSet;
            }

            @NotNull
            public final Function0<Unit> v() {
                return this.onPermissionChanged;
            }

            @Nullable
            /* JADX INFO: renamed from: w, reason: from getter */
            public final kn.a getPose() {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z10, @NotNull AbstractC0232a mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, boolean z11, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar, boolean z12, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull Function1<? super CameraProperties.b, Unit> onCameraFacingModeSelected, float f10, @Nullable SelfieBrightnessInfo selfieBrightnessInfo, @NotNull CameraProperties.b facingMode, boolean z13, boolean z14, boolean z15, boolean z16, @NotNull Function1<? super Boolean, Unit> onFlashSet, @Nullable kn.a aVar2, boolean z17, boolean z18, boolean z19, @NotNull yp.a designVersion, @Nullable String str10, @Nullable String str11) {
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
                this.webRtcManager = aVar;
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
                this.pose = aVar2;
                this.requestingPermissions = z17;
                this.recordingLocallyRequired = z18;
                this.allowSwitchCamera = z19;
                this.designVersion = designVersion;
                this.watermarkText = str10;
                this.navBarTitle = str11;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b$\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\"\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b%\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b/\u00108R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b)\u00108R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b'\u00107\u001a\u0004\b,\u00108R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b3\u00108¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "prompt", "disclosure", "start", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "instructionAsset", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "selfieType", "", "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;", "orderedPoses", "navBarTitle", "errorMessage", "Lkotlin/Function0;", "", "onClick", "onBack", "onCancel", "onErrorDismissed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "k", "c", "d", "m", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "l", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;", "i", "Ljava/util/List;", "j", "()Ljava/util/List;", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String disclosure;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String start;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage instructionAsset;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final SelfieType selfieType;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final List<PoseInfo> orderedPoses;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String errorMessage;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onClick;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
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
            public final Function0<Unit> f() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> g() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onClick;
            }

            @NotNull
            public final Function0<Unit> i() {
                return this.onErrorDismissed;
            }

            @NotNull
            public final List<PoseInfo> j() {
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

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\u0018\u00002\u00020\u0001:\u0003*,&BÓ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b&\u00104R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010=\u001a\u0004\b@\u0010>R'\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013j\u0002`\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b?\u0010BR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010=\u001a\u0004\bC\u0010>R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b7\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\bK\u00108R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b(\u0010L\u001a\u0004\b,\u0010MR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bF\u0010N\u001a\u0004\b*\u0010OR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bD\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bI\u0010'\u001a\u0004\bP\u0010)R\u0019\u0010#\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010'\u001a\u0004\b5\u0010)¨\u0006Q"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "message", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "mode", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "assetOverrides", "", "requireStrictSelfieCapture", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onCameraError", "onPermissionChanged", "Lmn/a;", "videoCaptureMethod", "Lur/a;", "webRtcManager", "isAudioRequired", "Lcom/withpersona/sdk2/camera/e$a;", "cameraXControllerFactory", "Lhn/c$a;", "camera2ControllerFactory", "recordingLocallyRequired", "watermarkText", "navBarTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;ZLjava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "d", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "e", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "n", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "f", "Z", "m", "()Z", "g", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "i", "j", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "k", "l", "Lmn/a;", "p", "()Lmn/a;", "Lur/a;", "r", "()Lur/a;", "s", "Lcom/withpersona/sdk2/camera/e$a;", "()Lcom/withpersona/sdk2/camera/e$a;", "Lhn/c$a;", "()Lhn/c$a;", "q", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0235c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @Nullable
            public final String message;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final b mode;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final AssetOverrides assetOverrides;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            public final boolean requireStrictSelfieCapture;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function1<Throwable, Unit> onCameraError;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onPermissionChanged;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final mn.a videoCaptureMethod;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final ur.a webRtcManager;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            public final boolean isAudioRequired;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final com.withpersona.sdk2.camera.e.a cameraXControllerFactory;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final hn.c.a camera2ControllerFactory;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
            public final boolean recordingLocallyRequired;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String watermarkText;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$a, reason: from toString */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "leftPoseImage", "rightPoseImage", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "b", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AssetOverrides {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                    return Intrinsics.c(this.leftPoseImage, assetOverrides.leftPoseImage) && Intrinsics.c(this.rightPoseImage, assetOverrides.rightPoseImage);
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
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u0005\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "a", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "g", "i", "f", "b", "h", "d", "e", "c", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static abstract class b {

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$a */
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "isCapturing", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "b", "Z", "()Z", "c", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class a extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(@NotNull EnumC0238c overlay, boolean z10, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.showProgress = z10;
                        this.isCapturing = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
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
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "", "countDown", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "I", "b", "()I", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0236b extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    public final int countDown;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0236b(int i10, @NotNull EnumC0238c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.countDown = i10;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
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
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BA\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Ljava/io/File;", "", "finalizeVideo", "Lkotlin/Function0;", "onAnimationComplete", "", "startFinalize", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function1;", "b", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "Z", "e", "()Z", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class C0237c extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<File, Unit> finalizeVideo;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onAnimationComplete;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean startFinalize;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0237c(@NotNull Function1<? super File, Unit> finalizeVideo, @NotNull Function0<Unit> onAnimationComplete, boolean z10, @NotNull EnumC0238c overlay, boolean z11) {
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function1<File, Unit> b() {
                        return this.finalizeVideo;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
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
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BQ\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "", "", "processImage", "", "onError", "", "forceCapture", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "isCapturing", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "c", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "e", "f", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class d extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<String, Unit> processImage;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean forceCapture;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    public final boolean isCapturing;

                    public /* synthetic */ d(Function1 function1, Function1 function2, boolean z10, EnumC0238c enumC0238c, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                        this(function1, function2, (i10 & 4) != 0 ? false : z10, enumC0238c, z11, z12);
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getForceCapture() {
                        return this.forceCapture;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<String, Unit> d() {
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

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public d(@NotNull Function1<? super String, Unit> processImage, @NotNull Function1<? super Throwable, Unit> onError, boolean z10, @NotNull EnumC0238c overlay, boolean z11, boolean z12) {
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
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onCaptureClicked", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class e extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onCaptureClicked;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public e(@NotNull Function0<Unit> onCaptureClicked, @NotNull EnumC0238c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onCaptureClicked, "onCaptureClicked");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onCaptureClicked = onCaptureClicked;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.onCaptureClicked;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$f */
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "poseHintComplete", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class f extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> poseHintComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public f(@NotNull Function0<Unit> poseHintComplete, @NotNull EnumC0238c overlay, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(poseHintComplete, "poseHintComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.poseHintComplete = poseHintComplete;
                        this.overlay = overlay;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    @NotNull
                    public final Function0<Unit> b() {
                        return this.poseHintComplete;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$g */
                @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "previewReady", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "showProgress", "recordLocalVideo", "", "maxRecordingLengthMs", "", "onError", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZJLkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "c", "Z", "f", "()Z", "e", "J", "()J", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class g extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<CameraProperties, Unit> previewReady;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean recordLocalVideo;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function1<Throwable, Unit> onError;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public g(@NotNull Function1<? super CameraProperties, Unit> previewReady, @NotNull EnumC0238c overlay, boolean z10, boolean z11, long j10, @NotNull Function1<? super Throwable, Unit> onError) {
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

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }

                    @NotNull
                    public final Function1<Throwable, Unit> c() {
                        return this.onError;
                    }

                    @NotNull
                    public final Function1<CameraProperties, Unit> d() {
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
                @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lkotlin/Function0;", "", "onComplete", "", "imageCaptured", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "showProgress", "<init>", "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V", "a", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "b", "Z", "()Z", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "d", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class h extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final Function0<Unit> onComplete;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final boolean imageCaptured;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public h(@NotNull Function0<Unit> onComplete, boolean z10, @NotNull EnumC0238c overlay, boolean z11) {
                        super(null);
                        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.onComplete = onComplete;
                        this.imageCaptured = z10;
                        this.overlay = overlay;
                        this.showProgress = z11;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final boolean getImageCaptured() {
                        return this.imageCaptured;
                    }

                    @NotNull
                    public final Function0<Unit> c() {
                        return this.onComplete;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public boolean getShowProgress() {
                        return this.showProgress;
                    }
                }

                /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$b$i */
                @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "overlay", "", "maxRecordingLengthMs", "", "showProgress", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "b", "J", "()J", "c", "Z", "getShowProgress", "()Z", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final class i extends b {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @NotNull
                    public final EnumC0238c overlay;

                    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
                    public final long maxRecordingLengthMs;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
                    public final boolean showProgress;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public i(@NotNull EnumC0238c overlay, long j10, boolean z10) {
                        super(null);
                        Intrinsics.checkNotNullParameter(overlay, "overlay");
                        this.overlay = overlay;
                        this.maxRecordingLengthMs = j10;
                        this.showProgress = z10;
                    }

                    @Override // com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.c.C0235c.b
                    @NotNull
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public EnumC0238c getOverlay() {
                        return this.overlay;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final long getMaxRecordingLengthMs() {
                        return this.maxRecordingLengthMs;
                    }
                }

                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                /* JADX INFO: renamed from: a */
                public abstract EnumC0238c getOverlay();

                public b() {
                }
            }

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$c$c, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public enum EnumC0238c {
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


                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public static final /* synthetic */ qt.a f12771t = qt.b.a(a());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0235c(@Nullable String str, @Nullable String str2, @NotNull b mode, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull AssetOverrides assetOverrides, boolean z10, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @NotNull Function1<? super Throwable, Unit> onCameraError, @NotNull Function0<Unit> onPermissionChanged, @NotNull mn.a videoCaptureMethod, @Nullable ur.a aVar, boolean z11, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, boolean z12, @Nullable String str3, @Nullable String str4) {
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
                this.webRtcManager = aVar;
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
            public final hn.c.a getCamera2ControllerFactory() {
                return this.camera2ControllerFactory;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final com.withpersona.sdk2.camera.e.a getCameraXControllerFactory() {
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
            public final Function0<Unit> h() {
                return this.onBack;
            }

            @NotNull
            public final Function1<Throwable, Unit> i() {
                return this.onCameraError;
            }

            @NotNull
            public final Function0<Unit> j() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> k() {
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
            public final mn.a getVideoCaptureMethod() {
                return this.videoCaptureMethod;
            }

            @Nullable
            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getWatermarkText() {
                return this.watermarkText;
            }

            @Nullable
            /* JADX INFO: renamed from: r, reason: from getter */
            public final ur.a getWebRtcManager() {
                return this.webRtcManager;
            }

            /* JADX INFO: renamed from: s, reason: from getter */
            public final boolean getIsAudioRequired() {
                return this.isAudioRequired;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u0010\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "uiScreen", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lkotlin/Function0;", "", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "f", "()Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;", "b", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "e", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final UiComponentScreen uiScreen;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
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
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lkotlin/Function0;", "", "rendered", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class e extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> rendered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(@NotNull Function0<Unit> rendered) {
                super(null);
                Intrinsics.checkNotNullParameter(rendered, "rendered");
                this.rendered = rendered;
            }

            @NotNull
            public final Function0<Unit> a() {
                return this.rendered;
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\u0015Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b$\u0010'R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001d\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b!\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b\u0015\u0010)¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "strings", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfies", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onUsePhotos", "onRetakePhotos", "onBack", "onCancel", "", "navBarTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "h", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "i", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "d", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "e", "Lkotlin/jvm/functions/Function0;", "f", "()Lkotlin/jvm/functions/Function0;", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class f extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Strings strings;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final List<Selfie> selfies;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onUsePhotos;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetakePhotos;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$c$f$a, reason: from toString */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "", "", Title.type, "description", "selfieLabelFront", "selfieLabelLeft", "selfieLabelRight", "selfieLabelUp", "selfieLabelDown", "submitButton", "retakeButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "b", "c", "d", "e", "f", "g", "h", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Strings {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String title;

                /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
                @NotNull
                public final String description;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelFront;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelLeft;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelRight;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelUp;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String selfieLabelDown;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                @NotNull
                public final String submitButton;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
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
                    return Intrinsics.c(this.title, strings.title) && Intrinsics.c(this.description, strings.description) && Intrinsics.c(this.selfieLabelFront, strings.selfieLabelFront) && Intrinsics.c(this.selfieLabelLeft, strings.selfieLabelLeft) && Intrinsics.c(this.selfieLabelRight, strings.selfieLabelRight) && Intrinsics.c(this.selfieLabelUp, strings.selfieLabelUp) && Intrinsics.c(this.selfieLabelDown, strings.selfieLabelDown) && Intrinsics.c(this.submitButton, strings.submitButton) && Intrinsics.c(this.retakeButton, strings.retakeButton);
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
            public final Function0<Unit> c() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> d() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> e() {
                return this.onRetakePhotos;
            }

            @NotNull
            public final Function0<Unit> f() {
                return this.onUsePhotos;
            }

            @NotNull
            public final List<Selfie> g() {
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

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b!\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b&\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u001e\u001a\u0004\b;\u0010 R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b8\u0010=R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b;\u00102\u001a\u0004\b5\u00103¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "", Title.type, "Lqq/c;", "sdkFilesManager", "description", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "navigationState", "Lkotlin/Function0;", "", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "customLoadingAsset", "navBarTitle", "Lyp/a;", "designVersion", "centerSelfieFilePath", "uploadScanningHintText", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "recoverableSubmitError", "onRetrySubmit", "<init>", "(Ljava/lang/String;Lqq/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lyp/a;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V", "a", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "b", "Lqq/c;", "l", "()Lqq/c;", "c", "d", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "j", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "g", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "h", "i", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "k", "Lyp/a;", "()Lyp/a;", "o", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class g extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public final qq.c sdkFilesManager;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final String description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final StepStyles.SelfieStepStyle styles;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final NavigationState navigationState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onBack;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onCancel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final RemoteImage customLoadingAsset;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String navBarTitle;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final yp.a designVersion;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String centerSelfieFilePath;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final String uploadScanningHintText;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            @Nullable
            public final InternalErrorInfo recoverableSubmitError;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final Function0<Unit> onRetrySubmit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(@NotNull String title, @NotNull qq.c sdkFilesManager, @NotNull String description, @NotNull PendingPageTextPosition pendingPageTextVerticalPosition, @Nullable StepStyles.SelfieStepStyle selfieStepStyle, @NotNull NavigationState navigationState, @NotNull Function0<Unit> onBack, @NotNull Function0<Unit> onCancel, @Nullable RemoteImage remoteImage, @Nullable String str, @NotNull yp.a designVersion, @Nullable String str2, @Nullable String str3, @Nullable InternalErrorInfo internalErrorInfo, @NotNull Function0<Unit> onRetrySubmit) {
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
            public final yp.a getDesignVersion() {
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
            public final Function0<Unit> g() {
                return this.onBack;
            }

            @NotNull
            public final Function0<Unit> h() {
                return this.onCancel;
            }

            @NotNull
            public final Function0<Unit> i() {
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
            public final qq.c getSdkFilesManager() {
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

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12808a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[kn.a.values().length];
            try {
                iArr[kn.a.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kn.a.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kn.a.Up.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kn.a.Down.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kn.a.Center.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12808a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[x.Up.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[x.Down.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$1", f = "SelfieWorkflow.kt", l = {165}, m = "invokeSuspend")
    public static final class e extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12809t;

        public e(nt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return SelfieWorkflow.this.new e(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12809t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.j jVar = fn.j.f16915a;
                Context context = SelfieWorkflow.this.applicationContext;
                this.f12809t = 1;
                if (jVar.b(context, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            ur.a aVar = SelfieWorkflow.this.webRtcManager;
            if (aVar != null) {
                aVar.d();
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$render$2", f = "SelfieWorkflow.kt", l = {}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12811t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12812u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12813v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f12812u = aVar;
            this.f12813v = selfieWorkflow;
        }

        public static final Unit r(SelfieWorkflow selfieWorkflow, r.c cVar) {
            selfieWorkflow.Z3(cVar);
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.f12812u, this.f12813v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f12811t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            ym.h<r<? super Input, SelfieState, ? extends b>> hVarD = this.f12812u.d();
            final SelfieWorkflow selfieWorkflow = this.f12813v;
            hVarD.a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.w4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.f.r(selfieWorkflow, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1", f = "SelfieWorkflow.kt", l = {493}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12814t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f12816v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12817w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(int i10, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f12816v = i10;
            this.f12817w = aVar;
        }

        public static final Unit r(SelfieWorkflow selfieWorkflow, PoseInfo poseInfo, r.c cVar) {
            Object objC = cVar.c();
            SelfieState.AcquireNextPose acquireNextPose = objC instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objC : null;
            if (acquireNextPose == null) {
                return Unit.f22483a;
            }
            cVar.e(selfieWorkflow.x1(cVar, SelfieState.AcquireNextPose.A(acquireNextPose, null, 0L, null, null, null, false, kotlin.collections.o.d(poseInfo), null, false, 447, null), null));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return SelfieWorkflow.this.new g(this.f12816v, this.f12817w, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = ot.c.e();
            int i10 = this.f12814t;
            if (i10 == 0) {
                jt.o.b(obj);
                dq.a aVar = SelfieWorkflow.this.selfiePoseManager;
                if (aVar == null) {
                    Intrinsics.u("selfiePoseManager");
                    aVar = null;
                }
                int i11 = this.f12816v;
                this.f12814t = 1;
                objK = aVar.k(i11, this);
                if (objK == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                objK = ((jt.n) obj).getValue();
            }
            ym.k<Input, SelfieState, b, Object>.a aVar2 = this.f12817w;
            final SelfieWorkflow selfieWorkflow = SelfieWorkflow.this;
            if (jt.n.h(objK)) {
                final PoseInfo poseInfo = (PoseInfo) objK;
                aVar2.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.x4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SelfieWorkflow.g.r(selfieWorkflow, poseInfo, (ym.r.c) obj2);
                    }
                }, 1, null));
            }
            SelfieWorkflow selfieWorkflow2 = SelfieWorkflow.this;
            ym.k<Input, SelfieState, b, Object>.a aVar3 = this.f12817w;
            Throwable thE = jt.n.e(objK);
            if (thE != null) {
                selfieWorkflow2.W3(aVar3, thE);
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1", f = "SelfieWorkflow.kt", l = {1379, 1381}, m = "invokeSuspend")
    public static final class h extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f12818t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f12819u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieState.Capture f12820v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12821w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12822x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(SelfieState.Capture capture, SelfieWorkflow selfieWorkflow, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f12820v = capture;
            this.f12821w = selfieWorkflow;
            this.f12822x = aVar;
        }

        public static final Unit r(SelfieState.Capture capture, r.c cVar) {
            Object objC = cVar.c();
            SelfieState.Capture capture2 = objC instanceof SelfieState.Capture ? (SelfieState.Capture) objC : null;
            if (capture2 != null && Intrinsics.c(capture2.getCaptureDeadlineEpochMs(), capture.getCaptureDeadlineEpochMs())) {
                l2.c(capture2);
                if (((Input) cVar.b()).getSkipPromptPage()) {
                    cVar.e(new SelfieState.AcquireNextPose(capture2.getCameraProperties(), capture2.getStartSelfieTimestamp(), kotlin.collections.p.k(), p.k(cVar, false), capture2.getCameraFacingMode(), capture2.getIsFlashEnabled(), capture2.g(), capture2.getPoseConfigs(), capture2.getAutoCaptureSupported()));
                } else {
                    cVar.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
                }
                return Unit.f22483a;
            }
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new h(this.f12820v, this.f12821w, this.f12822x, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r10.o(r9) == r0) goto L18;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r9.f12819u
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                jt.o.b(r10)
                goto L5f
            L13:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1b:
                long r5 = r9.f12818t
                jt.o.b(r10)
                goto L46
            L21:
                jt.o.b(r10)
                com.withpersona.sdk2.inquiry.selfie.SelfieState$Capture r10 = r9.f12820v
                java.lang.Long r10 = r10.getCaptureDeadlineEpochMs()
                long r5 = r10.longValue()
                long r7 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r7
                kotlin.time.a$a r10 = kotlin.time.a.INSTANCE
                ju.b r10 = ju.b.MILLISECONDS
                long r7 = kotlin.time.b.q(r5, r10)
                r9.f12818t = r5
                r9.f12819u = r4
                java.lang.Object r10 = ku.z0.c(r7, r9)
                if (r10 != r0) goto L46
                goto L5e
            L46:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r10 = r9.f12821w
                dq.a r10 = com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.q1(r10)
                if (r10 != 0) goto L54
                java.lang.String r10 = "selfiePoseManager"
                kotlin.jvm.internal.Intrinsics.u(r10)
                r10 = r3
            L54:
                r9.f12818t = r5
                r9.f12819u = r2
                java.lang.Object r10 = r10.o(r9)
                if (r10 != r0) goto L5f
            L5e:
                return r0
            L5f:
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r10 = r9.f12821w
                com.withpersona.sdk2.inquiry.selfie.g r10 = com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.p1(r10)
                r10.n()
                ym.k<com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, java.lang.Object>$a r10 = r9.f12822x
                ym.h r10 = r10.d()
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r0 = r9.f12821w
                com.withpersona.sdk2.inquiry.selfie.SelfieState$Capture r1 = r9.f12820v
                yp.y4 r2 = new yp.y4
                r2.<init>()
                ym.r r0 = ym.w.g(r0, r3, r2, r4, r3)
                r10.a(r0)
                kotlin.Unit r10 = kotlin.Unit.f22483a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$3", f = "SelfieWorkflow.kt", l = {1537}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12823t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12824u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12825v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, nt.b<? super i> bVar) {
            super(2, bVar);
            this.f12824u = aVar;
            this.f12825v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(r.c cVar) {
            Object objC = cVar.c();
            SelfieState.Capture capture = objC instanceof SelfieState.Capture ? (SelfieState.Capture) objC : null;
            if (capture == null) {
                return Unit.f22483a;
            }
            cVar.e(capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.a.ReadyToCapture, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new i(this.f12824u, this.f12825v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12823t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f12823t = 1;
                if (z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            this.f12824u.d().a(z.d(this.f12825v, null, new Function1() { // from class: yp.z4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.i.r((ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$4", f = "SelfieWorkflow.kt", l = {1551}, m = "invokeSuspend")
    public static final class j extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12826t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12827u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12828v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, nt.b<? super j> bVar) {
            super(2, bVar);
            this.f12827u = aVar;
            this.f12828v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(r.c cVar) {
            Object objC = cVar.c();
            SelfieState.Capture capture = objC instanceof SelfieState.Capture ? (SelfieState.Capture) objC : null;
            if (capture == null) {
                return Unit.f22483a;
            }
            cVar.e(capture.z((57343 & 1) != 0 ? capture.selfieError : null, (57343 & 2) != 0 ? capture.poseScore : 0.0f, (57343 & 4) != 0 ? capture.brightnessInfo : null, (57343 & 8) != 0 ? capture.selfies : null, (57343 & 16) != 0 ? capture.posesNeeded : null, (57343 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture.autoCaptureSupported : false, (57343 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture.isFlashEnabled : false, (57343 & 8192) != 0 ? capture.flashState : SelfieState.a.Enabled, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture.isDimLightConditions : false));
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new j(this.f12827u, this.f12828v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12826t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f12826t = 1;
                if (z0.b(3000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            this.f12827u.d().a(z.d(this.f12828v, null, new Function1() { // from class: yp.a5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.j.r((ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2", f = "SelfieWorkflow.kt", l = {1187}, m = "invokeSuspend")
    public static final class k extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f12829t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f12830u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Input f12831v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12832w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12833x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ SelfieState.CountdownToCapture f12834y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Input input, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, SelfieState.CountdownToCapture countdownToCapture, nt.b<? super k> bVar) {
            super(2, bVar);
            this.f12831v = input;
            this.f12832w = aVar;
            this.f12833x = selfieWorkflow;
            this.f12834y = countdownToCapture;
        }

        public static final Unit r(long j10, SelfieState.CountdownToCapture countdownToCapture, Input input, r.c cVar) {
            Object objC = cVar.c();
            SelfieState.CountdownToCapture countdownToCapture2 = objC instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) objC : null;
            if (countdownToCapture2 == null) {
                return Unit.f22483a;
            }
            int countDown = countdownToCapture2.getCountDown();
            if (countDown <= 1 || j10 <= 0) {
                cVar.e(new SelfieState.Capture(countdownToCapture2.getSelfieError(), countdownToCapture.getPoseScore(), countdownToCapture.getBrightnessInfo(), countdownToCapture2.w(), countdownToCapture2.g(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), p.k(cVar, false), input.getPoseConfigs(), countdownToCapture.getCameraFacingMode(), countdownToCapture.getIsFlashEnabled(), null, null, countdownToCapture.getIsDimLightConditions(), 24640, null));
            } else {
                cVar.e(countdownToCapture2.z((32764 & 1) != 0 ? countdownToCapture2.countDown : countDown - 1, (32764 & 2) != 0 ? countdownToCapture2.selfieError : countdownToCapture2.getSelfieError(), (32764 & 4) != 0 ? countdownToCapture2.startCaptureTimestamp : 0L, (32764 & 8) != 0 ? countdownToCapture2.cameraProperties : null, (32764 & 16) != 0 ? countdownToCapture2.startSelfieTimestamp : 0L, (32764 & 32) != 0 ? countdownToCapture2.poseScore : 0.0f, (32764 & 64) != 0 ? countdownToCapture2.brightnessInfo : null, (32764 & 128) != 0 ? countdownToCapture2.posesNeeded : null, (32764 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToCapture2.selfies : null, (32764 & Barcode.FORMAT_UPC_A) != 0 ? countdownToCapture2.backState : null, (32764 & Barcode.FORMAT_UPC_E) != 0 ? countdownToCapture2.poseConfigs : null, (32764 & Barcode.FORMAT_PDF417) != 0 ? countdownToCapture2.autoCaptureSupported : false, (32764 & Barcode.FORMAT_AZTEC) != 0 ? countdownToCapture2.cameraFacingMode : null, (32764 & 8192) != 0 ? countdownToCapture2.isFlashEnabled : false, (32764 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? countdownToCapture2.isDimLightConditions : false));
            }
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new k(this.f12831v, this.f12832w, this.f12833x, this.f12834y, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            final long j10;
            Object objE = ot.c.e();
            int i10 = this.f12830u;
            if (i10 == 0) {
                jt.o.b(obj);
                long jA = n.a(this.f12831v);
                this.f12829t = jA;
                this.f12830u = 1;
                if (z0.b(jA, this) == objE) {
                    return objE;
                }
                j10 = jA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f12829t;
                jt.o.b(obj);
            }
            ym.h<r<? super Input, SelfieState, ? extends b>> hVarD = this.f12832w.d();
            SelfieWorkflow selfieWorkflow = this.f12833x;
            final SelfieState.CountdownToCapture countdownToCapture = this.f12834y;
            final Input input = this.f12831v;
            hVarD.a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.b5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.k.r(j10, countdownToCapture, input, (ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToManualCapture$1", f = "SelfieWorkflow.kt", l = {1282}, m = "invokeSuspend")
    public static final class l extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12835t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12836u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12837v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, nt.b<? super l> bVar) {
            super(2, bVar);
            this.f12836u = aVar;
            this.f12837v = selfieWorkflow;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(r.c cVar) {
            Object objC = cVar.c();
            SelfieState.CountdownToManualCapture countdownToManualCapture = objC instanceof SelfieState.CountdownToManualCapture ? (SelfieState.CountdownToManualCapture) objC : null;
            if (countdownToManualCapture == null) {
                return Unit.f22483a;
            }
            int countDown = countdownToManualCapture.getCountDown();
            if (countDown >= 1) {
                cVar.e(countdownToManualCapture.z((4092 & 1) != 0 ? countdownToManualCapture.countDown : countDown - 1, (4092 & 2) != 0 ? countdownToManualCapture.selfieError : countdownToManualCapture.getSelfieError(), (4092 & 4) != 0 ? countdownToManualCapture.cameraProperties : null, (4092 & 8) != 0 ? countdownToManualCapture.posesNeeded : null, (4092 & 16) != 0 ? countdownToManualCapture.startCaptureTimestamp : 0L, (4092 & 32) != 0 ? countdownToManualCapture.autoCaptureSupported : false, (4092 & 64) != 0 ? countdownToManualCapture.startSelfieTimestamp : 0L, (4092 & 128) != 0 ? countdownToManualCapture.backState : null, (4092 & Barcode.FORMAT_QR_CODE) != 0 ? countdownToManualCapture.poseConfigs : null, (4092 & Barcode.FORMAT_UPC_A) != 0 ? countdownToManualCapture.cameraFacingMode : null, (4092 & Barcode.FORMAT_UPC_E) != 0 ? countdownToManualCapture.isFlashEnabled : false, (4092 & Barcode.FORMAT_PDF417) != 0 ? countdownToManualCapture.isDimLightConditions : false));
            }
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new l(this.f12836u, this.f12837v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f12835t;
            if (i10 == 0) {
                jt.o.b(obj);
                this.f12835t = 1;
                if (z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            this.f12836u.d().a(z.d(this.f12837v, null, new Function1() { // from class: yp.c5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.l.r((ym.r.c) obj2);
                }
            }, 1, null));
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((l) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$runManualCaptureEnabledChecker$1", f = "SelfieWorkflow.kt", l = {2130}, m = "invokeSuspend")
    public static final class m extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12838t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ y f12839u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ym.k<Input, SelfieState, b, Object>.a f12840v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow f12841w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(y yVar, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, SelfieWorkflow selfieWorkflow, nt.b<? super m> bVar) {
            super(2, bVar);
            this.f12839u = yVar;
            this.f12840v = aVar;
            this.f12841w = selfieWorkflow;
        }

        public static final Unit r(y yVar, r.c cVar) {
            WorkflowState workflowState = (SelfieState) cVar.c();
            if ((workflowState instanceof com.withpersona.sdk2.inquiry.selfie.b) && ((com.withpersona.sdk2.inquiry.selfie.b) workflowState).o()) {
                cVar.e(workflowState);
                yVar.f22568a = false;
            }
            return Unit.f22483a;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new m(this.f12839u, this.f12840v, this.f12841w, bVar);
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r5.f12838t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jt.o.b(r6)
                goto L2b
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jt.o.b(r6)
            L1a:
                kotlin.jvm.internal.y r6 = r5.f12839u
                boolean r6 = r6.f22568a
                if (r6 == 0) goto L43
                r5.f12838t = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = ku.z0.b(r3, r5)
                if (r6 != r0) goto L2b
                return r0
            L2b:
                ym.k<com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$Input, com.withpersona.sdk2.inquiry.selfie.SelfieState, com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$b, java.lang.Object>$a r6 = r5.f12840v
                ym.h r6 = r6.d()
                com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow r1 = r5.f12841w
                kotlin.jvm.internal.y r3 = r5.f12839u
                yp.d5 r4 = new yp.d5
                r4.<init>()
                r3 = 0
                ym.r r1 = ym.w.g(r1, r3, r4, r2, r3)
                r6.a(r1)
                goto L1a
            L43:
                kotlin.Unit r6 = kotlin.Unit.f22483a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((m) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public SelfieWorkflow(@NotNull Context applicationContext, @NotNull cq.b.a submitVerificationWorker, @NotNull tr.b.a webRtcWorkerFactory, @NotNull com.withpersona.sdk2.inquiry.selfie.e.b selfieAnalyzeWorker, @NotNull PermissionRequestWorkflow permissionRequestWorkflow, @NotNull hq.j localVideoCaptureRenderer, @NotNull com.withpersona.sdk2.camera.e.a cameraXControllerFactory, @NotNull hn.c.a camera2ControllerFactory, @NotNull ln.a cameraStatsManager, @NotNull uq.a navigationStateManager, @NotNull DirectFileUploader directFileUploader, @NotNull dq.a.b selfiePoseManagerFactory, @NotNull com.withpersona.sdk2.inquiry.shared.inquiryTheme.a inquiryThemeManager, @NotNull com.withpersona.sdk2.inquiry.selfie.g selfieEventLogger, @NotNull qq.c sdkFilesManager, @NotNull go.e featureFlagManager) {
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
        this.webRtcManager = ur.c.b();
    }

    public static final Unit A1(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, kn.a aVar2, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar2, "<unused var>");
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.B1(this.f36201a, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit A2(Input input, SelfieState.ReviewCaptures reviewCaptures, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.k(action, false), input.A(), input.getPoseConfigs(), false, reviewCaptures.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit A3(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit B1(SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.AcquireNextPose acquireNextPose = objC instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objC : null;
        if (acquireNextPose == null) {
            return Unit.f22483a;
        }
        action.e(selfieWorkflow.x1(action, acquireNextPose, null));
        return Unit.f22483a;
    }

    public static final Unit B2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit C1(ym.k.a aVar, SelfieWorkflow selfieWorkflow, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.q4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.D1((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit C2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final r C3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final Input input, final ym.k.a aVar, final tr.b.AbstractC0578b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof tr.b.AbstractC0578b.C0579b) {
            return z.d(selfieWorkflow, null, new Function1() { // from class: yp.g4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.D3(waitForWebRtcSetup, selfieWorkflow, it, input, aVar, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof tr.b.AbstractC0578b.Error) {
            return z.d(selfieWorkflow, null, new Function1() { // from class: yp.h4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.K3(aVar, selfieWorkflow, waitForWebRtcSetup, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit D1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.AcquireNextPose acquireNextPose = objC instanceof SelfieState.AcquireNextPose ? (SelfieState.AcquireNextPose) objC : null;
        if (acquireNextPose == null) {
            return Unit.f22483a;
        }
        l2.c(acquireNextPose);
        action.e(new SelfieState.AcquireNextPose(acquireNextPose.getCameraProperties(), acquireNextPose.getStartSelfieTimestamp(), kotlin.collections.p.k(), p.k(action, false), acquireNextPose.getCameraFacingMode(), acquireNextPose.getIsFlashEnabled(), acquireNextPose.g(), acquireNextPose.getPoseConfigs(), acquireNextPose.getAutoCaptureSupported()));
        return Unit.f22483a;
    }

    public static final Unit D3(final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, final SelfieWorkflow selfieWorkflow, tr.b.AbstractC0578b abstractC0578b, final Input input, final ym.k.a aVar, r.c action) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        CameraProperties cameraProperties = waitForWebRtcSetup.getCameraProperties();
        ur.a aVar2 = selfieWorkflow.webRtcManager;
        if (aVar2 != null) {
            aVar2.h(selfieWorkflow.webRtcWorkerFactory.getService());
        }
        ur.a aVar3 = selfieWorkflow.webRtcManager;
        if (aVar3 != null) {
            aVar3.i(selfieWorkflow.applicationContext);
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
        ur.a aVar4 = selfieWorkflow.webRtcManager;
        if (aVar4 != null) {
            tr.b.AbstractC0578b.C0579b c0579b = (tr.b.AbstractC0578b.C0579b) abstractC0578b;
            aVar4.e(c0579b.getResult().getUsername(), c0579b.getResult().getCredential(), c0579b.getResult().getServerUrl(), waitForWebRtcSetup.getWebRtcJwt(), i11, i10, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: yp.u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.E3(aVar, selfieWorkflow, input, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: yp.v0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.G3(aVar, selfieWorkflow, waitForWebRtcSetup);
                }
            }, new Function0() { // from class: yp.w0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.I3(this.f36310a, input);
                }
            }, new Function1() { // from class: yp.x0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.J3(this.f36320a, (String) obj);
                }
            });
        }
        return Unit.f22483a;
    }

    public static final Unit E1(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit E2(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ShowInstructions showInstructions) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.f4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.F2(this.f36097a, input, showInstructions, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit E3(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.F3(this.f36339a, input, waitForWebRtcSetup, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit F1(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit F2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.ShowInstructions showInstructions, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.c();
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.l(action, false, 1, null), input.A(), input.getPoseConfigs(), false, showInstructions.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit F3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.l(input.getFromStep());
        selfieWorkflow.selfieEventLogger.b((SelfieState) action.c());
        action.e(new SelfieState.StartCapture(false, null, 0.0f, null, waitForWebRtcSetup.g(), null, System.currentTimeMillis(), false, waitForWebRtcSetup.getStartSelfieTimestamp(), waitForWebRtcSetup.getCameraProperties(), p.k(action, false), input.getPoseConfigs(), waitForWebRtcSetup.getCameraFacingMode(), waitForWebRtcSetup.getIsFlashEnabled(), false, 163, null));
        return Unit.f22483a;
    }

    public static final Unit G1(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit G2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit G3(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.H3(this.f36048a, waitForWebRtcSetup, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit H1(ym.k.a aVar, SelfieWorkflow selfieWorkflow, final CameraProperties.b facingMode) {
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.p4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.I1(facingMode, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit H2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit H3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.webRtcManager.a();
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22483a;
    }

    public static final Unit I1(CameraProperties.b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), bVar, 3, null));
        return Unit.f22483a;
    }

    public static final Unit I2() {
        return Unit.f22483a;
    }

    public static final Unit I3(SelfieWorkflow selfieWorkflow, Input input) {
        selfieWorkflow.selfieEventLogger.j(input.getFromStep());
        return Unit.f22483a;
    }

    public static final Unit J1(boolean z10) {
        return Unit.f22483a;
    }

    public static final Unit J3(SelfieWorkflow selfieWorkflow, String step) {
        Intrinsics.checkNotNullParameter(step, "step");
        selfieWorkflow.selfieEventLogger.i(step);
        return Unit.f22483a;
    }

    public static final Unit K2(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.ShowPoseHint showPoseHint, final Input input) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.y3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.L2(showPoseHint, input, selfieWorkflow, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit K3(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.L3(this.f36330a, waitForWebRtcSetup, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final r L1(final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, final ym.k.a aVar, final com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.a4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.M1(output, selfieWorkflow, capture, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit L2(SelfieState.ShowPoseHint showPoseHint, Input input, SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        List<PoseInfo> listG = showPoseHint.g();
        List<Selfie> listW = showPoseHint.w();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean autoCaptureSupported = showPoseHint.getAutoCaptureSupported();
        CameraProperties cameraProperties = showPoseHint.getCameraProperties();
        long startSelfieTimestamp = showPoseHint.getStartSelfieTimestamp();
        SelfieState selfieStateK = p.k(action, false);
        PoseConfigs poseConfigs = input.getPoseConfigs();
        CameraProperties.b cameraFacingMode = showPoseHint.getCameraFacingMode();
        boolean isFlashEnabled = showPoseHint.getIsFlashEnabled();
        Long lValueOf = null;
        dq.a aVar = null;
        if (input.getUsePerPoseReveal()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            dq.a aVar2 = selfieWorkflow.selfiePoseManager;
            if (aVar2 == null) {
                Intrinsics.u("selfiePoseManager");
            } else {
                aVar = aVar2;
            }
            lValueOf = Long.valueOf(jCurrentTimeMillis2 + aVar.getPerPoseTimeoutMs());
        }
        action.e(new SelfieState.Capture(null, 0.0f, null, listW, listG, jCurrentTimeMillis, autoCaptureSupported, startSelfieTimestamp, cameraProperties, selfieStateK, poseConfigs, cameraFacingMode, isFlashEnabled, null, lValueOf, false, 8193, null));
        return Unit.f22483a;
    }

    public static final Unit L3(SelfieWorkflow selfieWorkflow, SelfieState.WaitForWebRtcSetup waitForWebRtcSetup, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        ur.a aVar = selfieWorkflow.webRtcManager;
        if (aVar != null) {
            aVar.a();
        }
        action.e(new SelfieState.RestartCamera(false, false, p.k(action, false), waitForWebRtcSetup.getCameraFacingMode(), 3, null));
        return Unit.f22483a;
    }

    public static final Unit M1(com.withpersona.sdk2.inquiry.selfie.e.c cVar, SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.Capture capture2 = objC instanceof SelfieState.Capture ? (SelfieState.Capture) objC : null;
        if (capture2 == null) {
            return Unit.f22483a;
        }
        if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a) {
            com.withpersona.sdk2.inquiry.selfie.e.c.a aVar2 = (com.withpersona.sdk2.inquiry.selfie.e.c.a) cVar;
            if (aVar2.getSelfie() != null) {
                Selfie selfie = aVar2.getSelfie();
                if (selfie == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                selfieWorkflow.selfieEventLogger.g(capture2, selfie);
                action.e(selfieWorkflow.x1(action, capture, selfie));
            } else {
                action.e(capture2.z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : 0.0f, (57343 & 4) != 0 ? capture2.brightnessInfo : null, (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : SelfieState.a.FlashOn, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : false));
            }
        } else if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) {
            com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) cVar;
            if (c0240c.getError() == kn.b.FaceDetectionUnsupported) {
                action.e(capture2.z((57343 & 1) != 0 ? capture2.selfieError : null, (57343 & 2) != 0 ? capture2.poseScore : c0240c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0240c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
            } else {
                action.e(capture2.z((57343 & 1) != 0 ? capture2.selfieError : c0240c.getError(), (57343 & 2) != 0 ? capture2.poseScore : c0240c.getPoseScore(), (57343 & 4) != 0 ? capture2.brightnessInfo : c0240c.getBrightnessInfo(), (57343 & 8) != 0 ? capture2.selfies : null, (57343 & 16) != 0 ? capture2.posesNeeded : null, (57343 & 32) != 0 ? capture2.startCaptureTimestamp : 0L, (57343 & 64) != 0 ? capture2.autoCaptureSupported : false, (57343 & 128) != 0 ? capture2.startSelfieTimestamp : 0L, (57343 & Barcode.FORMAT_QR_CODE) != 0 ? capture2.cameraProperties : null, (57343 & Barcode.FORMAT_UPC_A) != 0 ? capture2.backState : null, (57343 & Barcode.FORMAT_UPC_E) != 0 ? capture2.poseConfigs : null, (57343 & Barcode.FORMAT_PDF417) != 0 ? capture2.cameraFacingMode : null, (57343 & Barcode.FORMAT_AZTEC) != 0 ? capture2.isFlashEnabled : false, (57343 & 8192) != 0 ? capture2.flashState : null, (57343 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? capture2.captureDeadlineEpochMs : null, (57343 & 32768) != 0 ? capture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
            }
        } else {
            if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b)) {
                throw new jt.l();
            }
            selfieWorkflow.W3(aVar, ((com.withpersona.sdk2.inquiry.selfie.e.c.b) cVar).getError());
        }
        return Unit.f22483a;
    }

    public static final Unit M2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit M3(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit N1(PoseInfo poseInfo, kn.a aVar, ym.k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.Capture capture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.O1(this.f36296a, capture, selfieImage, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit N2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit N3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit O1(SelfieWorkflow selfieWorkflow, SelfieState.Capture capture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, capture, selfieImage));
        return Unit.f22483a;
    }

    public static final Unit O2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit O3(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit P1(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22483a;
    }

    public static final Unit Q1(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final r Q2(final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input, final ym.k.a aVar, final com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.j4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.R2(output, startCapture, input, selfieWorkflow, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit Q3(ym.k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.WebRtcFinished webRtcFinished) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.m4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.R3(webRtcFinished, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit R1(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit R2(com.withpersona.sdk2.inquiry.selfie.e.c cVar, SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.StartCapture startCapture2 = objC instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) objC : null;
        if (startCapture2 == null) {
            return Unit.f22483a;
        }
        if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a) {
            com.withpersona.sdk2.inquiry.selfie.e.c.a aVar2 = (com.withpersona.sdk2.inquiry.selfie.e.c.a) cVar;
            action.e(new SelfieState.StartCaptureFaceDetected(startCapture.getStartCaptureTimestamp(), startCapture.getCameraProperties(), startCapture.getStartSelfieTimestamp(), aVar2.getPoseScore(), aVar2.getBrightnessInfo(), startCapture.g(), startCapture.w(), p.k(action, false), input.getPoseConfigs(), startCapture.getAutoCaptureSupported(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), aVar2.getIsDimLightConditions()));
        } else if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
            selfieWorkflow.W3(aVar, ((com.withpersona.sdk2.inquiry.selfie.e.c.b) cVar).getError());
        } else {
            if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                throw new jt.l();
            }
            com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) cVar;
            action.e(c0240c.getError() == kn.b.FaceDetectionUnsupported ? startCapture2.z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : null, (16242 & 4) != 0 ? startCapture2.poseScore : c0240c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0240c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture2.isDimLightConditions : c0240c.getIsDimLightConditions()) : startCapture2.z((16242 & 1) != 0 ? startCapture2.centered : false, (16242 & 2) != 0 ? startCapture2.selfieError : c0240c.getError(), (16242 & 4) != 0 ? startCapture2.poseScore : c0240c.getPoseScore(), (16242 & 8) != 0 ? startCapture2.brightnessInfo : c0240c.getBrightnessInfo(), (16242 & 16) != 0 ? startCapture2.posesNeeded : null, (16242 & 32) != 0 ? startCapture2.selfies : null, (16242 & 64) != 0 ? startCapture2.startCaptureTimestamp : 0L, (16242 & 128) != 0 ? startCapture2.autoCaptureSupported : false, (16242 & Barcode.FORMAT_QR_CODE) != 0 ? startCapture2.startSelfieTimestamp : 0L, (16242 & Barcode.FORMAT_UPC_A) != 0 ? startCapture2.cameraProperties : null, (16242 & Barcode.FORMAT_UPC_E) != 0 ? startCapture2.backState : null, (16242 & Barcode.FORMAT_PDF417) != 0 ? startCapture2.poseConfigs : null, (16242 & Barcode.FORMAT_AZTEC) != 0 ? startCapture2.cameraFacingMode : null, (16242 & 8192) != 0 ? startCapture2.isFlashEnabled : false, (16242 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? startCapture2.isDimLightConditions : c0240c.getIsDimLightConditions()));
        }
        return Unit.f22483a;
    }

    public static final Unit R3(SelfieState.WebRtcFinished webRtcFinished, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(p.D(action, webRtcFinished.w(), webRtcFinished.getWebRtcObjectId(), webRtcFinished.getCameraProperties(), webRtcFinished.getStartSelfieTimestamp(), p.k(action, false)));
        return Unit.f22483a;
    }

    public static final Unit S1(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit S2(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, final Input input) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.T2(startCapture, input, selfieWorkflow, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit S3(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit T2(SelfieState.StartCapture startCapture, Input input, SelfieWorkflow selfieWorkflow, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.StartCapture startCapture2 = objC instanceof SelfieState.StartCapture ? (SelfieState.StartCapture) objC : null;
        if (startCapture2 == null) {
            return Unit.f22483a;
        }
        action.e(new SelfieState.CountdownToManualCapture(3, null, startCapture2.getCameraProperties(), startCapture2.g(), System.currentTimeMillis(), startCapture2.getAutoCaptureSupported(), startCapture.getStartSelfieTimestamp(), p.k(action, false), input.getPoseConfigs(), startCapture.getCameraFacingMode(), startCapture.getIsFlashEnabled(), startCapture.getIsDimLightConditions(), 2, null));
        selfieWorkflow.selfieEventLogger.d(startCapture2);
        return Unit.f22483a;
    }

    public static final Unit T3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit U1(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.w3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.V1((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit U2(PoseInfo poseInfo, kn.a aVar, ym.k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.StartCapture startCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.V2(this.f36253a, startCapture, selfieImage, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit U3(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit V1(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.CaptureTransition captureTransition = objC instanceof SelfieState.CaptureTransition ? (SelfieState.CaptureTransition) objC : null;
        SelfieState nextState = captureTransition != null ? captureTransition.getNextState() : null;
        if (nextState != null) {
            action.e(nextState);
        }
        return Unit.f22483a;
    }

    public static final Unit V2(SelfieWorkflow selfieWorkflow, SelfieState.StartCapture startCapture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, startCapture, selfieImage));
        return Unit.f22483a;
    }

    public static final Unit W1(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit W2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22483a;
    }

    public static final Unit X1(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit X2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit Y1(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit Y2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit Y3(b bVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.d(bVar);
        return Unit.f22483a;
    }

    public static final Unit Z2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final r a2(final SelfieWorkflow selfieWorkflow, final ym.k.a aVar, final SelfieState.CountdownToCapture countdownToCapture, final Input input, final com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.u4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.b2(output, selfieWorkflow, aVar, countdownToCapture, input, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit b2(com.withpersona.sdk2.inquiry.selfie.e.c cVar, SelfieWorkflow selfieWorkflow, ym.k.a aVar, SelfieState.CountdownToCapture countdownToCapture, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.CountdownToCapture countdownToCapture2 = objC instanceof SelfieState.CountdownToCapture ? (SelfieState.CountdownToCapture) objC : null;
        if (countdownToCapture2 == null) {
            return Unit.f22483a;
        }
        if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a)) {
            if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
                selfieWorkflow.W3(aVar, ((com.withpersona.sdk2.inquiry.selfie.e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                    throw new jt.l();
                }
                action.e(new SelfieState.StartCapture(false, null, countdownToCapture2.getPoseScore(), countdownToCapture2.getBrightnessInfo(), countdownToCapture.g(), countdownToCapture.w(), countdownToCapture2.getStartCaptureTimestamp(), false, countdownToCapture2.getStartSelfieTimestamp(), countdownToCapture2.getCameraProperties(), p.k(action, false), input.getPoseConfigs(), countdownToCapture2.getCameraFacingMode(), countdownToCapture2.getIsFlashEnabled(), ((com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) cVar).getIsDimLightConditions(), 131, null));
            }
        }
        return Unit.f22483a;
    }

    public static final r b3(final SelfieWorkflow selfieWorkflow, final ym.k.a aVar, final SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, final Input input, final com.withpersona.sdk2.inquiry.selfie.e.c output) {
        Intrinsics.checkNotNullParameter(output, "output");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.c4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.c3(output, selfieWorkflow, aVar, startCaptureFaceDetected, input, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit c2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit c3(com.withpersona.sdk2.inquiry.selfie.e.c cVar, SelfieWorkflow selfieWorkflow, ym.k.a aVar, SelfieState.StartCaptureFaceDetected startCaptureFaceDetected, Input input, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.a)) {
            if (cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.b) {
                selfieWorkflow.W3(aVar, ((com.withpersona.sdk2.inquiry.selfie.e.c.b) cVar).getError());
            } else {
                if (!(cVar instanceof com.withpersona.sdk2.inquiry.selfie.e.c.C0240c)) {
                    throw new jt.l();
                }
                com.withpersona.sdk2.inquiry.selfie.e.c.C0240c c0240c = (com.withpersona.sdk2.inquiry.selfie.e.c.C0240c) cVar;
                kn.b error = c0240c.getError();
                List<PoseInfo> listG = startCaptureFaceDetected.g();
                List<Selfie> listW = startCaptureFaceDetected.w();
                long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
                CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
                action.e(new SelfieState.StartCapture(false, error, c0240c.getPoseScore(), c0240c.getBrightnessInfo(), listG, listW, startCaptureTimestamp, false, startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), c0240c.getIsDimLightConditions(), 129, null));
            }
        }
        return Unit.f22483a;
    }

    public static final Unit d2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final r d3(final SelfieWorkflow selfieWorkflow, final Input input, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.o4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.e3(this.f36186a, input, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit e2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit e3(SelfieWorkflow selfieWorkflow, Input input, r.c action) {
        SelfieState countdownToCapture;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = objC instanceof SelfieState.StartCaptureFaceDetected ? (SelfieState.StartCaptureFaceDetected) objC : null;
        if (startCaptureFaceDetected == null) {
            return Unit.f22483a;
        }
        selfieWorkflow.selfieEventLogger.a(startCaptureFaceDetected);
        if (input.getDesignVersion() == yp.a.K0000 && startCaptureFaceDetected.j() == kn.a.Center) {
            List<PoseInfo> listG = startCaptureFaceDetected.g();
            List<Selfie> listW = startCaptureFaceDetected.w();
            long startCaptureTimestamp = startCaptureFaceDetected.getStartCaptureTimestamp();
            CameraProperties cameraProperties = startCaptureFaceDetected.getCameraProperties();
            countdownToCapture = new SelfieState.Capture(null, startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), listW, listG, startCaptureTimestamp, startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getStartSelfieTimestamp(), cameraProperties, p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), null, null, startCaptureFaceDetected.getIsDimLightConditions(), 24577, null);
        } else {
            countdownToCapture = new SelfieState.CountdownToCapture(3, null, startCaptureFaceDetected.getStartCaptureTimestamp(), startCaptureFaceDetected.getCameraProperties(), startCaptureFaceDetected.getStartSelfieTimestamp(), startCaptureFaceDetected.getPoseScore(), startCaptureFaceDetected.getBrightnessInfo(), startCaptureFaceDetected.g(), startCaptureFaceDetected.w(), p.k(action, false), input.getPoseConfigs(), startCaptureFaceDetected.getAutoCaptureSupported(), startCaptureFaceDetected.getCameraFacingMode(), startCaptureFaceDetected.getIsFlashEnabled(), startCaptureFaceDetected.getIsDimLightConditions(), 2, null);
        }
        action.e(countdownToCapture);
        return Unit.f22483a;
    }

    public static final Unit f3(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit g2(PoseInfo poseInfo, kn.a aVar, ym.k.a aVar2, final SelfieWorkflow selfieWorkflow, final SelfieState.CountdownToManualCapture countdownToManualCapture, String absolutePath) {
        Intrinsics.checkNotNullParameter(absolutePath, "absolutePath");
        final Selfie.SelfieImage selfieImage = new Selfie.SelfieImage(absolutePath, Selfie.a.MANUAL, aVar, System.currentTimeMillis(), poseInfo.getToken());
        aVar2.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.t0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.h2(this.f36268a, countdownToManualCapture, selfieImage, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit g3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit h2(SelfieWorkflow selfieWorkflow, SelfieState.CountdownToManualCapture countdownToManualCapture, Selfie.SelfieImage selfieImage, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(selfieWorkflow.x1(action, countdownToManualCapture, selfieImage));
        return Unit.f22483a;
    }

    public static final Unit h3(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit i2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        selfieWorkflow.W3(aVar, it);
        return Unit.f22483a;
    }

    public static final Unit j2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final r j3(final SelfieWorkflow selfieWorkflow, final ym.k.a aVar, final boolean z10, final cq.b.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof cq.b.d.C0260b) {
            return z.d(selfieWorkflow, null, new Function1() { // from class: yp.r4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.k3(this.f36244a, aVar, (ym.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof cq.b.d.Error) {
            return z.d(selfieWorkflow, null, new Function1() { // from class: yp.s4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.l3(z10, it, selfieWorkflow, aVar, (ym.r.c) obj);
                }
            }, 1, null);
        }
        throw new jt.l();
    }

    public static final Unit k2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit k3(SelfieWorkflow selfieWorkflow, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.X3(aVar, b.d.f12636a);
        return Unit.f22483a;
    }

    public static final Unit l2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    public static final Unit l3(boolean z10, cq.b.d dVar, SelfieWorkflow selfieWorkflow, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.Submit submit = objC instanceof SelfieState.Submit ? (SelfieState.Submit) objC : null;
        if (submit == null) {
            return Unit.f22483a;
        }
        if (z10) {
            cq.b.d.Error error = (cq.b.d.Error) dVar;
            if (p.B(error.getCause())) {
                action.e(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, 0, error.getCause(), 127, null));
            } else {
                selfieWorkflow.X3(aVar, new b.Error(((cq.b.d.Error) dVar).getCause()));
            }
        } else {
            selfieWorkflow.X3(aVar, new b.Error(((cq.b.d.Error) dVar).getCause()));
        }
        return Unit.f22483a;
    }

    public static final Unit m3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit n2(ym.k.a aVar, final SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.FinalizeWebRtc finalizeWebRtc, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.l4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.o2(this.f36154a, input, finalizeWebRtc, it, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit n3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit o2(SelfieWorkflow selfieWorkflow, Input input, SelfieState.FinalizeWebRtc finalizeWebRtc, String str, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        selfieWorkflow.selfieEventLogger.m(input.getFromStep());
        action.e(new SelfieState.WebRtcFinished(finalizeWebRtc.w(), str, finalizeWebRtc.getCameraProperties(), finalizeWebRtc.getStartSelfieTimestamp(), p.k(action, false), finalizeWebRtc.getCameraFacingMode()));
        selfieWorkflow.webRtcManager.d();
        return Unit.f22483a;
    }

    public static final Unit o3(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.n4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.p3((ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit p2() {
        return Unit.f22483a;
    }

    public static final Unit p3(r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.Submit submit = objC instanceof SelfieState.Submit ? (SelfieState.Submit) objC : null;
        if (submit == null) {
            return Unit.f22483a;
        }
        action.e(SelfieState.Submit.A(submit, null, null, null, 0L, null, null, submit.getSubmitAttempt() + 1, null, 63, null));
        return Unit.f22483a;
    }

    public static final Unit q2(ym.k.a aVar, SelfieWorkflow selfieWorkflow) {
        p.x(aVar, selfieWorkflow.webRtcManager);
        return Unit.f22483a;
    }

    public static final Unit r2(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit r3(SelfieWorkflow selfieWorkflow, ym.k.a aVar) {
        selfieWorkflow.X3(aVar, b.C0231b.f12634a);
        return Unit.f22483a;
    }

    public static final Unit s2(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final Unit s3(SelfieWorkflow selfieWorkflow, ym.k.a aVar, Input input) {
        p.z(selfieWorkflow.applicationContext, aVar, input, selfieWorkflow.w1(input));
        return Unit.f22483a;
    }

    public static final r t3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final ym.k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.x3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.u3(it, waitForCameraFeed, input, selfieWorkflow, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit u2(ym.k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.RestartCamera restartCamera) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.i4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.v2(input, restartCamera, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit u3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == j1.PermissionGranted) {
            action.e(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, true, false, null, null, null, false, null, false, 254, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.X3(aVar, b.a.f12633a);
        } else {
            selfieWorkflow.X3(aVar, new b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22483a;
    }

    public static final Unit v2(Input input, SelfieState.RestartCamera restartCamera, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.e(new SelfieState.WaitForCameraFeed(false, false, p.k(action, false), input.A(), input.getPoseConfigs(), false, restartCamera.getCameraFacingMode(), false, 163, null));
        return Unit.f22483a;
    }

    public static final r v3(final SelfieWorkflow selfieWorkflow, final SelfieState.WaitForCameraFeed waitForCameraFeed, final Input input, final ym.k.a aVar, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return z.d(selfieWorkflow, null, new Function1() { // from class: yp.t4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.w3(it, waitForCameraFeed, input, selfieWorkflow, aVar, (ym.r.c) obj);
            }
        }, 1, null);
    }

    public static final Unit w3(PermissionRequestWorkflow.Output output, SelfieState.WaitForCameraFeed waitForCameraFeed, Input input, SelfieWorkflow selfieWorkflow, ym.k.a aVar, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (output.getPermissionState().getResult() == j1.PermissionGranted) {
            action.e(SelfieState.WaitForCameraFeed.A(waitForCameraFeed, false, true, null, null, null, false, null, false, 253, null));
        } else if (!input.getSkipPromptPage()) {
            action.e(new SelfieState.ShowInstructions(null, null, null, 6, null));
        } else if (input.getBackStepEnabled()) {
            selfieWorkflow.X3(aVar, b.a.f12633a);
        } else {
            selfieWorkflow.X3(aVar, new b.Error(new InternalErrorInfo.PermissionErrorInfo("User rejected camera permissions for the selfie flow.")));
        }
        return Unit.f22483a;
    }

    public static final Unit x2(ym.k.a aVar, SelfieWorkflow selfieWorkflow, final SelfieState.ReviewCaptures reviewCaptures) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.y2(reviewCaptures, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit x3(final SelfieWorkflow selfieWorkflow, ym.k.a aVar, final Input input, final SelfieState.WaitForCameraFeed waitForCameraFeed, final long j10, final CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        selfieWorkflow.selfieEventLogger.n();
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.b4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.y3(this.f36051a, input, waitForCameraFeed, cameraProperties, j10, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit y2(SelfieState.ReviewCaptures reviewCaptures, r.c action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object objC = action.c();
        SelfieState.ReviewCaptures reviewCaptures2 = objC instanceof SelfieState.ReviewCaptures ? (SelfieState.ReviewCaptures) objC : null;
        if (reviewCaptures2 == null) {
            return Unit.f22483a;
        }
        SelfieState.ReviewCaptures reviewCaptures3 = reviewCaptures2;
        action.e(new SelfieState.Submit(reviewCaptures3.w(), reviewCaptures3.getWebRtcObjectId(), reviewCaptures3.getCameraProperties(), reviewCaptures3.getStartSelfieTimestamp(), p.k(action, true), reviewCaptures.getCameraFacingMode(), 0, null, 192, null));
        return Unit.f22483a;
    }

    public static final Unit y3(SelfieWorkflow selfieWorkflow, Input input, SelfieState.WaitForCameraFeed waitForCameraFeed, CameraProperties cameraProperties, long j10, r.c action) {
        SelfieState showPoseHint;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (selfieWorkflow.b4(input) == mn.a.Stream) {
            selfieWorkflow.selfieEventLogger.k();
            action.e(new SelfieState.WaitForWebRtcSetup(input.getVideoCaptureConfig().getWebRtcJwt(), cameraProperties, j10, p.k(action, false), waitForCameraFeed.g(), input.getPoseConfigs(), true, waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled()));
        } else {
            selfieWorkflow.selfieEventLogger.b((SelfieState) action.c());
            kn.a pose = ((PoseInfo) CollectionsKt.d0(waitForCameraFeed.g())).getPose();
            if (input.getUsePerPoseReveal()) {
                showPoseHint = new SelfieState.AcquireNextPose(cameraProperties, j10, kotlin.collections.p.k(), p.k(action, false), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), waitForCameraFeed.g(), input.getPoseConfigs(), true);
            } else if (pose == kn.a.Center) {
                showPoseHint = new SelfieState.StartCapture(false, null, 0.0f, null, waitForCameraFeed.g(), null, System.currentTimeMillis(), false, j10, cameraProperties, p.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled(), false, 163, null);
            } else {
                showPoseHint = new SelfieState.ShowPoseHint(kotlin.collections.p.k(), waitForCameraFeed.g(), true, cameraProperties, j10, p.k(action, false), input.getPoseConfigs(), waitForCameraFeed.getCameraFacingMode(), waitForCameraFeed.getIsFlashEnabled());
            }
            action.e(showPoseHint);
        }
        return Unit.f22483a;
    }

    public static final Unit z2(ym.k.a aVar, SelfieWorkflow selfieWorkflow, final Input input, final SelfieState.ReviewCaptures reviewCaptures) {
        aVar.d().a(z.d(selfieWorkflow, null, new Function1() { // from class: yp.e4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.A2(input, reviewCaptures, (ym.r.c) obj);
            }
        }, 1, null));
        return Unit.f22483a;
    }

    public static final Unit z3(ym.k.a aVar, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        p.n(aVar, false, 1, null).invoke(it);
        return Unit.f22483a;
    }

    public final c B3(final Input renderProps, final SelfieState.WaitForWebRtcSetup renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        w.l(context, this.webRtcWorkerFactory.a(renderProps.getVideoCaptureConfig().getWebRtcJwt()), d0.k(tr.b.class), "", new Function1() { // from class: yp.z3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.C3(this.f36343a, renderState, renderProps, context, (tr.b.AbstractC0578b) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0235c.b.i iVar = new c.C0235c.b.i(c.C0235c.EnumC0238c.CLEAR, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1N = p.n(context, false, 1, null);
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar = this.webRtcManager;
        return o.m(renderProps, context, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, iVar, p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.k4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.M3(context, this);
            }
        }, new Function0() { // from class: yp.v4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.N3(this.f36308a, context);
            }
        }, function1N, new Function0() { // from class: yp.a1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.O3(this.f36039a, context, renderProps);
            }
        }, aVarB4, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final c.b D2(final Input renderProps, final SelfieState.ShowInstructions renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        String title = renderProps.getStrings().getTitle();
        String prompt = renderProps.getStrings().getPrompt();
        String disclosure = renderProps.getStrings().getDisclosure();
        String startButton = renderProps.getStrings().getStartButton();
        NavigationState navigationStateB = this.navigationStateManager.b();
        SelfieType selfieType = renderProps.getSelfieType();
        RemoteImage selfiePictograph = null;
        if (Intrinsics.c(selfieType, SelfieType.CenterOnly.f12562a)) {
            NextStep.Selfie.AssetConfig.PromptPage promptPage = renderProps.getAssetConfig().getPromptPage();
            if (promptPage != null) {
                selfiePictograph = promptPage.getSelfieCenterPictograph();
            }
        } else {
            if (!Intrinsics.c(selfieType, SelfieType.ThreePhotos.f12564a) && !Intrinsics.c(selfieType, SelfieType.ConfigurablePoses.f12563a)) {
                throw new jt.l();
            }
            NextStep.Selfie.AssetConfig.PromptPage promptPage2 = renderProps.getAssetConfig().getPromptPage();
            if (promptPage2 != null) {
                selfiePictograph = promptPage2.getSelfiePictograph();
            }
        }
        return new c.b(title, prompt, disclosure, startButton, renderProps.getStyles(), selfiePictograph, navigationStateB, renderProps.getSelfieType(), renderProps.A(), renderProps.getStrings().getPromptPageNavBarTitle(), null, new Function0() { // from class: yp.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.E2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: yp.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.G2(context, this);
            }
        }, new Function0() { // from class: yp.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.H2(this.f36152a, context);
            }
        }, new Function0() { // from class: yp.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.I2();
            }
        });
    }

    public final c J2(final Input renderProps, final SelfieState.ShowPoseHint renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        x xVar;
        String selfieHintPoseNotCentered;
        c.C0235c.EnumC0238c enumC0238c;
        int i10 = d.f12808a[renderState.j().ordinal()];
        if (i10 == 1) {
            xVar = x.Left;
        } else if (i10 == 2) {
            xVar = x.Right;
        } else if (i10 == 3) {
            xVar = x.Up;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new jt.l();
                }
                throw new IllegalStateException("Pose hint cannot be shown for center pose");
            }
            xVar = x.Down;
        }
        int[] iArr = d.b;
        int i11 = iArr[xVar.ordinal()];
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
                throw new jt.l();
            }
            selfieHintPoseNotCentered = renderProps.getStrings().getSelfieHintLookDown();
        }
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        int i12 = iArr[xVar.ordinal()];
        if (i12 == 1) {
            enumC0238c = c.C0235c.EnumC0238c.CENTER;
        } else if (i12 == 2) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT_HINT;
        } else if (i12 == 3) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT_HINT;
        } else if (i12 == 4) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_UP_HINT;
        } else {
            if (i12 != 5) {
                throw new jt.l();
            }
            enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN_HINT;
        }
        c.C0235c.b.f fVar = new c.C0235c.b.f(new Function0() { // from class: yp.i1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.K2(context, this, renderState, renderProps);
            }
        }, enumC0238c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        String str = selfieHintPoseNotCentered;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1N = p.n(context, false, 1, null);
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar = this.webRtcManager;
        c.C0235c.AssetOverrides assetOverridesC = p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar2 = this.cameraXControllerFactory;
        hn.c.a aVar3 = this.camera2ControllerFactory;
        return o.m(renderProps, context, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, null, renderState.getAutoCaptureSupported(), fVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.j1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.M2(context, this);
            }
        }, new Function0() { // from class: yp.k1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.N2(this.f36143a, context);
            }
        }, function1N, new Function0() { // from class: yp.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.O2(this.f36159a, context, renderProps);
            }
        }, aVarB4, aVar, recordAudio, aVar2, aVar3, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
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
    public final c K1(final Input renderProps, final SelfieState.Capture renderState, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        SelfieState.a flashState;
        String str;
        String selfieHintCenterFace;
        int i10;
        c.C0235c.EnumC0238c enumC0238c;
        c.C0235c.EnumC0238c enumC0238c2;
        final SelfieWorkflow selfieWorkflow;
        c.C0235c.b aVar;
        SelfieState.a aVar2;
        SelfieState.a aVar3;
        boolean z10;
        boolean z11;
        final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar4 = context;
        if (renderState.getCaptureDeadlineEpochMs() != null) {
            aVar4.b("per_pose_capture_timeout_" + renderState.getCaptureDeadlineEpochMs(), new h(renderState, this, aVar4, null));
        }
        final PoseInfo poseInfoP = renderState.p();
        final kn.a pose = poseInfoP.getPose();
        if (renderState.getIsFlashEnabled()) {
            flashState = renderState.getFlashState() == SelfieState.a.Disabled ? SelfieState.a.Enabled : renderState.getFlashState();
        } else {
            flashState = SelfieState.a.Disabled;
        }
        SelfieState.a aVar5 = flashState;
        if (renderState.k().getAutoCaptureEnabled()) {
            w.l(aVar4, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), aVar5 == SelfieState.a.Disabled || aVar5 == SelfieState.a.ReadyToCapture), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: yp.n2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.L1(this.f36171a, renderState, aVar4, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        }
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        if (pose == kn.a.Left) {
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookLeft();
        } else {
            if (pose != kn.a.Right) {
                if (renderState.getSelfieError() != null) {
                    str = strB;
                } else if (pose == kn.a.Center) {
                    selfieHintCenterFace = renderProps.getStrings().getSelfieHintCenterFace();
                } else {
                    str = null;
                }
                i10 = d.f12808a[pose.ordinal()];
                if (i10 != 1) {
                    enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT;
                } else if (i10 != 2) {
                    enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT;
                } else if (i10 != 3) {
                    enumC0238c = c.C0235c.EnumC0238c.LOOK_UP;
                } else if (i10 != 4) {
                    enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN;
                } else {
                    if (i10 == 5) {
                        throw new jt.l();
                    }
                    enumC0238c = c.C0235c.EnumC0238c.CENTER;
                }
                enumC0238c2 = enumC0238c;
                if (renderState.o() || aVar5 == SelfieState.a.FlashOn || aVar5 == SelfieState.a.ReadyToCapture) {
                    selfieWorkflow = this;
                    aVar = new c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
                } else {
                    Function1 function1 = new Function1() { // from class: yp.o2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelfieWorkflow.N1(poseInfoP, pose, aVar4, this, renderState, (String) obj);
                        }
                    };
                    aVar4 = aVar4;
                    selfieWorkflow = this;
                    aVar = new c.C0235c.b.d(function1, new Function1() { // from class: yp.p2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SelfieWorkflow.P1(this.f36193a, aVar4, (Throwable) obj);
                        }
                    }, false, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false, 4, null);
                }
                if (!renderState.o()) {
                    selfieWorkflow.V3(aVar4);
                }
                aVar2 = SelfieState.a.FlashOn;
                if (aVar5 == aVar2) {
                    aVar4.b("wait_to_capture_with_flash_on", new i(aVar4, selfieWorkflow, null));
                }
                aVar3 = SelfieState.a.ReadyToCapture;
                if (aVar5 == aVar3) {
                    aVar4.b("turn_off_flash", new j(aVar4, selfieWorkflow, null));
                }
                mn.a aVarB4 = b4(renderProps);
                String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
                String str2 = strB;
                boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
                NavigationState navigationStateB = selfieWorkflow.navigationStateManager.b();
                Function1 function1N = p.n(aVar4, false, 1, null);
                ur.a aVar6 = selfieWorkflow.webRtcManager;
                c.C0235c.AssetOverrides assetOverridesC = p.C(renderProps);
                boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
                com.withpersona.sdk2.camera.e.a aVar7 = selfieWorkflow.cameraXControllerFactory;
                hn.c.a aVar8 = selfieWorkflow.camera2ControllerFactory;
                String str3 = str;
                boolean autoCaptureSupported = renderState.getAutoCaptureSupported();
                kn.a aVarJ = renderState.j();
                float poseScore = renderState.getPoseScore();
                SelfieBrightnessInfo brightnessInfo = renderState.getBrightnessInfo();
                CameraProperties.b cameraFacingMode = renderState.getCameraFacingMode();
                boolean isFlashEnabled = renderState.getIsFlashEnabled();
                boolean zA = selfieWorkflow.featureFlagManager.a(go.a.f18282a);
                if (renderState.getFlashState() != aVar2 || renderState.getFlashState() == aVar3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isDimLightConditions = renderState.getIsDimLightConditions();
                if (b4(renderProps) == mn.a.Upload) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return o.m(renderProps, aVar4, aVarJ, capturePageTitle, (1006632960 & 16) != 0 ? null : str3, str2, autoCaptureSupported, aVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.q2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.Q1(aVar4, selfieWorkflow);
                    }
                }, new Function0() { // from class: yp.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.R1(this.f36242a, aVar4);
                    }
                }, function1N, new Function0() { // from class: yp.t2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SelfieWorkflow.S1(this.f36272a, aVar4, renderProps);
                    }
                }, aVarB4, aVar6, recordAudio, aVar7, aVar8, poseScore, brightnessInfo, cameraFacingMode, isFlashEnabled, zA, isDimLightConditions, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
            }
            selfieHintCenterFace = renderProps.getStrings().getSelfieHintLookRight();
        }
        str = selfieHintCenterFace;
        i10 = d.f12808a[pose.ordinal()];
        if (i10 != 1) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 != 2) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 != 3) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 != 4) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 == 5) {
                throw new jt.l();
            }
            enumC0238c = c.C0235c.EnumC0238c.CENTER;
        }
        enumC0238c2 = enumC0238c;
        if (renderState.o()) {
            selfieWorkflow = this;
            aVar = new c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else {
            selfieWorkflow = this;
            aVar = new c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        }
        if (!renderState.o()) {
            selfieWorkflow.V3(aVar4);
        }
        aVar2 = SelfieState.a.FlashOn;
        if (aVar5 == aVar2) {
            aVar4.b("wait_to_capture_with_flash_on", new i(aVar4, selfieWorkflow, null));
        }
        aVar3 = SelfieState.a.ReadyToCapture;
        if (aVar5 == aVar3) {
            aVar4.b("turn_off_flash", new j(aVar4, selfieWorkflow, null));
        }
        mn.a aVarB5 = b4(renderProps);
        String capturePageTitle2 = renderProps.getStrings().getCapturePageTitle();
        String str4 = strB;
        boolean requireStrictSelfieCapture2 = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB2 = selfieWorkflow.navigationStateManager.b();
        Function1 function1N2 = p.n(aVar4, false, 1, null);
        ur.a aVar9 = selfieWorkflow.webRtcManager;
        c.C0235c.AssetOverrides assetOverridesC2 = p.C(renderProps);
        boolean recordAudio2 = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar10 = selfieWorkflow.cameraXControllerFactory;
        hn.c.a aVar11 = selfieWorkflow.camera2ControllerFactory;
        String str5 = str;
        boolean autoCaptureSupported2 = renderState.getAutoCaptureSupported();
        kn.a aVarJ2 = renderState.j();
        float poseScore2 = renderState.getPoseScore();
        SelfieBrightnessInfo brightnessInfo2 = renderState.getBrightnessInfo();
        CameraProperties.b cameraFacingMode2 = renderState.getCameraFacingMode();
        boolean isFlashEnabled2 = renderState.getIsFlashEnabled();
        boolean zA2 = selfieWorkflow.featureFlagManager.a(go.a.f18282a);
        if (renderState.getFlashState() != aVar2) {
            z10 = true;
        } else {
            z10 = true;
        }
        boolean isDimLightConditions2 = renderState.getIsDimLightConditions();
        if (b4(renderProps) == mn.a.Upload) {
            z11 = true;
        } else {
            z11 = false;
        }
        return o.m(renderProps, aVar4, aVarJ2, capturePageTitle2, (1006632960 & 16) != 0 ? null : str5, str4, autoCaptureSupported2, aVar, assetOverridesC2, requireStrictSelfieCapture2, navigationStateB2, new Function0() { // from class: yp.q2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.Q1(aVar4, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.r2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.R1(this.f36242a, aVar4);
            }
        }, function1N2, new Function0() { // from class: yp.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.S1(this.f36272a, aVar4, renderProps);
            }
        }, aVarB5, aVar9, recordAudio2, aVar10, aVar11, poseScore2, brightnessInfo2, cameraFacingMode2, isFlashEnabled2, zA2, isDimLightConditions2, (1006632960 & 67108864) != 0 ? false : z10, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : z11, (1006632960 & 536870912) != 0);
    }

    public final c P2(final Input renderProps, final SelfieState.StartCapture renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0235c.EnumC0238c enumC0238c;
        final SelfieWorkflow selfieWorkflow;
        Object obj;
        c.C0235c.b aVar;
        final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar2 = context;
        if (renderState.k().getAutoCaptureEnabled()) {
            w.l(aVar2, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: yp.n1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.Q2(this.f36168a, renderState, renderProps, aVar2, (com.withpersona.sdk2.inquiry.selfie.e.c) obj2);
                }
            });
        }
        final PoseInfo poseInfoP = renderState.p();
        final kn.a pose = poseInfoP.getPose();
        boolean zO = renderState.o();
        if (!zO) {
            V3(aVar2);
        }
        int i10 = d.f12808a[pose.ordinal()];
        if (i10 == 1) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new jt.l();
            }
            enumC0238c = c.C0235c.EnumC0238c.CENTER;
        }
        c.C0235c.EnumC0238c enumC0238c2 = enumC0238c;
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintTakePhoto = strB == null ? renderProps.getStrings().getSelfieHintTakePhoto() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (!zO) {
            selfieWorkflow = this;
            obj = null;
            aVar = new c.C0235c.b.a(enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else if (w1(renderProps)) {
            aVar = new c.C0235c.b.e(new Function0() { // from class: yp.o1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SelfieWorkflow.S2(aVar2, this, renderState, renderProps);
                }
            }, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
            selfieWorkflow = this;
            obj = null;
        } else {
            Function1 function1 = new Function1() { // from class: yp.p1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.U2(poseInfoP, pose, context, this, renderState, (String) obj2);
                }
            };
            aVar2 = context;
            obj = null;
            selfieWorkflow = this;
            aVar = new c.C0235c.b.d(function1, new Function1() { // from class: yp.q1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SelfieWorkflow.W2(this.f36202a, aVar2, (Throwable) obj2);
                }
            }, false, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false, 4, null);
        }
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = selfieWorkflow.navigationStateManager.b();
        Function1 function1N = p.n(aVar2, false, 1, obj);
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar3 = selfieWorkflow.webRtcManager;
        return o.m(renderProps, aVar2, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintTakePhoto, strB, renderState.getAutoCaptureSupported(), aVar, p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.r1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.X2(aVar2, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.s1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.Y2(this.f36255a, aVar2);
            }
        }, function1N, new Function0() { // from class: yp.t1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.Z2(this.f36270a, aVar2, renderProps);
            }
        }, aVarB4, aVar3, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final c P3(final Input renderProps, final SelfieState.WebRtcFinished renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0235c.b.h hVar = new c.C0235c.b.h(new Function0() { // from class: yp.u2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.Q3(context, this, renderState);
            }
        }, false, c.C0235c.EnumC0238c.COMPLETE, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1N = p.n(context, false, 1, null);
        ur.a aVar = this.webRtcManager;
        return o.m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, hVar, p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.v2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.S3(context, this);
            }
        }, new Function0() { // from class: yp.w2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.T3(this.f36312a, context);
            }
        }, function1N, new Function0() { // from class: yp.x2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.U3(this.f36322a, context, renderProps);
            }
        }, b4(renderProps), aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final c T1(final Input renderProps, SelfieState.CaptureTransition renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0235c.EnumC0238c enumC0238c;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getNextState() instanceof SelfieState.Submit) {
            enumC0238c = c.C0235c.EnumC0238c.COMPLETE_WITH_CAPTURE;
        } else {
            int i10 = d.f12808a[renderState.getCompletedPose().ordinal()];
            if (i10 == 1) {
                enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT_COMPLETE;
            } else if (i10 == 2) {
                enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT_COMPLETE;
            } else if (i10 == 3) {
                enumC0238c = c.C0235c.EnumC0238c.LOOK_UP_COMPLETE;
            } else if (i10 == 4) {
                enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN_COMPLETE;
            } else {
                if (i10 != 5) {
                    throw new jt.l();
                }
                enumC0238c = c.C0235c.EnumC0238c.CENTER_COMPLETE;
            }
        }
        return o.m(renderProps, context, null, capturePageTitle, (1006632960 & 16) != 0 ? null : null, null, false, new c.C0235c.b.h(new Function0() { // from class: yp.a2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.U1(context, this);
            }
        }, true, enumC0238c, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: yp.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.W1(context, this);
            }
        }, new Function0() { // from class: yp.c2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.X1(this.f36063a, context);
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: yp.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.Y1(this.f36076a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashOn(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final void V3(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        y yVar = new y();
        yVar.f22568a = true;
        context.b("check_if_manual_capture_enabled", new m(yVar, context, this, null));
    }

    public final void W3(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar, Throwable th2) {
        String message;
        String message2 = th2.getMessage();
        if (message2 != null && StringsKt.a0(message2, "ENOSPC", false, 2, null)) {
            X3(aVar, new b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        if (!(th2 instanceof h1)) {
            if (th2 instanceof InternalErrorException) {
                X3(aVar, new b.Error(((InternalErrorException) th2).getErrorInfo()));
                return;
            }
            X3(aVar, new b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
            return;
        }
        Throwable cause = th2.getCause();
        if (cause != null && (message = cause.getMessage()) != null && StringsKt.a0(message, "ENOSPC", false, 2, null)) {
            X3(aVar, new b.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
            return;
        }
        X3(aVar, new b.Error(new InternalErrorInfo.UnknownErrorInfo("Unknown error. Type: " + th2.getClass().getCanonicalName())));
    }

    public final void X3(ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context, final b output) {
        ur.a aVar;
        if (((output instanceof b.d) || (output instanceof b.a) || (output instanceof b.Error) || (output instanceof b.C0231b)) && (aVar = this.webRtcManager) != null) {
            aVar.d();
        }
        context.d().a(z.d(this, null, new Function1() { // from class: yp.d4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.Y3(output, (ym.r.c) obj);
            }
        }, 1, null));
    }

    public final c Z1(final Input renderProps, SelfieState.CountdownToCapture renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        final SelfieState.CountdownToCapture countdownToCapture;
        if (renderState.k().getAutoCaptureEnabled()) {
            countdownToCapture = renderState;
            w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: yp.q3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.a2(this.f36204a, context, countdownToCapture, renderProps, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        } else {
            countdownToCapture = renderState;
        }
        context.b("countdown_" + countdownToCapture.getCountDown(), new k(renderProps, context, this, renderState, null));
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        c.C0235c.b.C0236b c0236b = new c.C0235c.b.C0236b(renderState.getCountDown(), c.C0235c.EnumC0238c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1N = p.n(context, false, 1, null);
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar = this.webRtcManager;
        return o.m(renderProps, context, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintCenterFace, strB, renderState.getAutoCaptureSupported(), c0236b, p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.r3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.c2(context, this);
            }
        }, new Function0() { // from class: yp.s3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.d2(this.f36258a, context);
            }
        }, function1N, new Function0() { // from class: yp.t3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.e2(this.f36274a, context, renderProps);
            }
        }, aVarB4, aVar, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final void Z3(r<? super Input, SelfieState, ? extends b>.c updater) {
        updater.d(new b.Error(new InternalErrorInfo.WebRtcIntegrationErrorInfo("WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.")));
    }

    public final c a3(final Input renderProps, final SelfieState.StartCaptureFaceDetected renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        if (renderState.k().getAutoCaptureEnabled()) {
            w.l(context, this.selfieAnalyzeWorker.a(this.selfieEventLogger, renderState.p(), false), d0.k(com.withpersona.sdk2.inquiry.selfie.e.class), "", new Function1() { // from class: yp.u1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.b3(this.f36291a, context, renderState, renderProps, (com.withpersona.sdk2.inquiry.selfie.e.c) obj);
                }
            });
        }
        w.l(context, ym.o.Companion.b(ym.o.INSTANCE, 1000L, null, 2, null), d0.l(ym.o.class, KTypeProjection.INSTANCE.a(d0.k(Unit.class))), "", new Function1() { // from class: yp.v1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.d3(this.f36305a, renderProps, (Unit) obj);
            }
        });
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        String selfieHintHoldStill = renderProps.getStrings().getSelfieHintHoldStill();
        String selfieHintHoldStill2 = renderProps.getStrings().getSelfieHintHoldStill();
        c.C0235c.b.a aVar = new c.C0235c.b.a(c.C0235c.EnumC0238c.CENTER, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function1 function1N = p.n(context, false, 1, null);
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar2 = this.webRtcManager;
        c.C0235c.AssetOverrides assetOverridesC = p.C(renderProps);
        boolean recordAudio = renderProps.getVideoCaptureConfig().getRecordAudio();
        com.withpersona.sdk2.camera.e.a aVar3 = this.cameraXControllerFactory;
        hn.c.a aVar4 = this.camera2ControllerFactory;
        return o.m(renderProps, context, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : selfieHintHoldStill, selfieHintHoldStill2, renderState.getAutoCaptureSupported(), aVar, assetOverridesC, requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.x1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.f3(context, this);
            }
        }, new Function0() { // from class: yp.y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.g3(this.f36331a, context);
            }
        }, function1N, new Function0() { // from class: yp.z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.h3(this.f36341a, context, renderProps);
            }
        }, aVarB4, aVar2, recordAudio, aVar3, aVar4, renderState.getPoseScore(), renderState.getBrightnessInfo(), renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public Snapshot g(@NotNull SelfieState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return an.q.a(state);
    }

    public final mn.a b4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objK = videoCaptureConfig.k(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        return jt.n.e(objK) == null ? (mn.a) objK : mn.a.None;
    }

    public final boolean c4(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        if (jt.n.e(objI) != null) {
            return false;
        }
        ((Boolean) objI).getClass();
        return true;
    }

    public final c f2(final Input renderProps, final SelfieState.CountdownToManualCapture renderState, ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        c.C0235c.EnumC0238c enumC0238c;
        final SelfieWorkflow selfieWorkflow;
        c.C0235c.b c0236b;
        final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a aVar = context;
        final PoseInfo poseInfoP = renderState.p();
        final kn.a pose = poseInfoP.getPose();
        int i10 = d.f12808a[pose.ordinal()];
        if (i10 == 1) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_LEFT;
        } else if (i10 == 2) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_RIGHT;
        } else if (i10 == 3) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_UP;
        } else if (i10 == 4) {
            enumC0238c = c.C0235c.EnumC0238c.LOOK_DOWN;
        } else {
            if (i10 != 5) {
                throw new jt.l();
            }
            enumC0238c = c.C0235c.EnumC0238c.CENTER;
        }
        c.C0235c.EnumC0238c enumC0238c2 = enumC0238c;
        aVar.b("countdown_to_manual_capture_" + renderState.getCountDown(), new l(aVar, this, null));
        kn.b selfieError = renderState.getSelfieError();
        String strB = selfieError != null ? n.b(selfieError, renderProps.getStrings(), renderState.j()) : null;
        String selfieHintCenterFace = strB == null ? renderProps.getStrings().getSelfieHintCenterFace() : strB;
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        if (renderState.getCountDown() == 0) {
            Function1 function1 = new Function1() { // from class: yp.d1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.g2(poseInfoP, pose, aVar, this, renderState, (String) obj);
                }
            };
            aVar = aVar;
            selfieWorkflow = this;
            c0236b = new c.C0235c.b.d(function1, new Function1() { // from class: yp.e1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.i2(this.f36083a, aVar, (Throwable) obj);
                }
            }, true, enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), false);
        } else {
            selfieWorkflow = this;
            c0236b = new c.C0235c.b.C0236b(renderState.getCountDown(), enumC0238c2, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a));
        }
        c.C0235c.b bVar = c0236b;
        boolean requireStrictSelfieCapture = renderProps.getRequireStrictSelfieCapture();
        NavigationState navigationStateB = selfieWorkflow.navigationStateManager.b();
        Function1 function1N = p.n(aVar, false, 1, null);
        String str = selfieHintCenterFace;
        mn.a aVarB4 = b4(renderProps);
        ur.a aVar2 = selfieWorkflow.webRtcManager;
        return o.m(renderProps, aVar, renderState.j(), capturePageTitle, (1006632960 & 16) != 0 ? null : str, strB, renderState.getAutoCaptureSupported(), bVar, p.C(renderProps), requireStrictSelfieCapture, navigationStateB, new Function0() { // from class: yp.f1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.j2(aVar, selfieWorkflow);
            }
        }, new Function0() { // from class: yp.g1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.k2(this.f36102a, aVar);
            }
        }, function1N, new Function0() { // from class: yp.h1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.l2(this.f36111a, aVar, renderProps);
            }
        }, aVarB4, aVar2, renderProps.getVideoCaptureConfig().getRecordAudio(), selfieWorkflow.cameraXControllerFactory, selfieWorkflow.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), selfieWorkflow.featureFlagManager.a(go.a.f18282a), renderState.getIsDimLightConditions(), (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final c i3(Input renderProps, SelfieState.Submit renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        dq.a aVar;
        final boolean z10 = renderProps.getDesignVersion() == yp.a.K0000;
        if (renderState.getRecoverableSubmitError() == null) {
            cq.b.a aVar2 = this.submitVerificationWorker;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            String fromComponent = renderProps.getFromComponent();
            String fromStep = renderProps.getFromStep();
            List<Selfie> listW = renderState.w();
            SelfieType selfieType = renderProps.getSelfieType();
            String fieldKeySelfie = renderProps.getFieldKeySelfie();
            String webRtcObjectId = renderState.getWebRtcObjectId();
            CameraProperties cameraProperties = renderState.getCameraProperties();
            long startSelfieTimestamp = renderState.getStartSelfieTimestamp();
            String fileUploadUrl = renderProps.getFileUploadUrl();
            dq.a aVar3 = this.selfiePoseManager;
            if (aVar3 == null) {
                Intrinsics.u("selfiePoseManager");
                aVar = null;
            } else {
                aVar = aVar3;
            }
            w.l(context, aVar2.a(sessionToken, inquiryId, fromComponent, fromStep, selfieType, fieldKeySelfie, listW, webRtcObjectId, cameraProperties, startSelfieTimestamp, fileUploadUrl, aVar), d0.k(cq.b.class), "submit_" + renderState.getSubmitAttempt(), new Function1() { // from class: yp.e3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.j3(this.f36086a, context, z10, (cq.b.d) obj);
                }
            });
        }
        uq.a.d(this.navigationStateManager, false, false, false, false, 12, null);
        String processingTitle = renderProps.getStrings().getProcessingTitle();
        qq.c cVar = this.sdkFilesManager;
        String processingDescription = renderProps.getStrings().getProcessingDescription();
        PendingPageTextPosition pendingPageTextVerticalPosition = renderProps.getPendingPageTextVerticalPosition();
        StepStyles.SelfieStepStyle styles = renderProps.getStyles();
        NavigationState navigationStateB = this.navigationStateManager.b();
        Function0 function0 = new Function0() { // from class: yp.f3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.m3(this.f36096a, context);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.n3(this.f36104a, context);
            }
        };
        NextStep.Selfie.AssetConfig.RecordPage recordPage = renderProps.getAssetConfig().getRecordPage();
        return new c.g(processingTitle, cVar, processingDescription, pendingPageTextVerticalPosition, styles, navigationStateB, function0, function1, recordPage != null ? recordPage.getLoadingPictograph() : null, renderProps.getStrings().getPendingPageNavBarTitle(), renderProps.getDesignVersion(), p.w(renderState), renderProps.getStrings().getSelfieHintVerifying(), renderState.getRecoverableSubmitError(), new Function0() { // from class: yp.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.o3(context, this);
            }
        });
    }

    public final c m2(final Input renderProps, SelfieState.FinalizeWebRtc renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        final SelfieState.FinalizeWebRtc finalizeWebRtc;
        ur.a aVar = this.webRtcManager;
        if (aVar != null) {
            finalizeWebRtc = renderState;
            aVar.f(renderProps.getFromStep(), new Function1() { // from class: yp.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.n2(context, this, renderProps, finalizeWebRtc, (String) obj);
                }
            });
        } else {
            finalizeWebRtc = renderState;
        }
        return o.m(renderProps, context, null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new c.C0235c.b.h(new Function0() { // from class: yp.z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.p2();
            }
        }, false, c.C0235c.EnumC0238c.FINALIZING, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a)), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: yp.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.q2(context, this);
            }
        }, new Function0() { // from class: yp.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.r2(this.f36050a, context);
            }
        }, p.m(context, false), new Function0() { // from class: yp.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.s2(this.f36064a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, finalizeWebRtc.getCameraFacingMode(), false, this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : false, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
    }

    public final Object q3(final Input renderProps, final SelfieState.WaitForCameraFeed renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        boolean z10 = (renderState.getHasRequestedCameraPermissions() || com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, i0.Camera)) ? false : true;
        boolean z11 = !renderState.getHasRequestedAudioPermissions() && w1(renderProps) && jq.g.f(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio() && !com.withpersona.sdk2.inquiry.permissions.g.b(this.applicationContext, i0.RecordAudio);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        PoseInfo poseInfo = (PoseInfo) CollectionsKt.firstOrNull(renderState.g());
        c cVarM = o.m(renderProps, context, poseInfo != null ? poseInfo.getPose() : null, renderProps.getStrings().getCapturePageTitle(), (1006632960 & 16) != 0 ? null : null, null, false, new c.C0235c.b.g(new Function1() { // from class: yp.i3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.x3(this.f36125a, context, renderProps, renderState, jCurrentTimeMillis, (CameraProperties) obj);
            }
        }, c.C0235c.EnumC0238c.CLEAR, !Intrinsics.c(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.f12563a), b4(renderProps) == mn.a.Upload, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), new Function1() { // from class: yp.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.z3(context, (Throwable) obj);
            }
        }), p.C(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: yp.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.A3(context, this);
            }
        }, new Function0() { // from class: yp.l3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.r3(this.f36153a, context);
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: yp.m3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.s3(this.f36161a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, (1006632960 & 67108864) != 0 ? false : false, (1006632960 & 134217728) != 0 ? false : z10 || z11, (1006632960 & 268435456) != 0 ? false : false, (1006632960 & 536870912) != 0);
        if (z10) {
            i0 i0Var = i0.Camera;
            String cameraPermissionsTitle = renderProps.getCameraPermissionsTitle();
            String str = cameraPermissionsTitle != null ? cameraPermissionsTitle : "";
            String cameraPermissionsRationale = renderProps.getCameraPermissionsRationale();
            if (cameraPermissionsRationale == null) {
                cameraPermissionsRationale = this.applicationContext.getString(vp.g.H);
                Intrinsics.checkNotNullExpressionValue(cameraPermissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(vp.g.G, jq.g.b(context2));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return com.withpersona.sdk2.inquiry.permissions.g.d(cVarM, context, true, i0Var, (3592 & 8) != 0 ? false : false, str, cameraPermissionsRationale, string, renderProps.getCameraPermissionsModalPositiveButton(), renderProps.getCameraPermissionsModalNegativeButton(), (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (3592 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : null, new Function1() { // from class: yp.n3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflow.t3(this.f36173a, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
                }
            });
        }
        if (!z11) {
            return cVarM;
        }
        i0 i0Var2 = i0.RecordAudio;
        String microphonePermissionsRationale = renderProps.getMicrophonePermissionsRationale();
        if (microphonePermissionsRationale == null) {
            microphonePermissionsRationale = this.applicationContext.getString(vp.g.S);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsRationale, "getString(...)");
        }
        Context context3 = this.applicationContext;
        String string2 = context3.getString(vp.g.R, jq.g.b(context3));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String microphonePermissionsModalPositiveButton = renderProps.getMicrophonePermissionsModalPositiveButton();
        String microphonePermissionsModalNegativeButton = renderProps.getMicrophonePermissionsModalNegativeButton();
        PermissionRequestWorkflow permissionRequestWorkflow = this.permissionRequestWorkflow;
        String microphonePermissionsTitle = renderProps.getMicrophonePermissionsTitle();
        return com.withpersona.sdk2.inquiry.permissions.g.d(cVarM, context, true, i0Var2, (3592 & 8) != 0 ? false : false, microphonePermissionsTitle != null ? microphonePermissionsTitle : "", microphonePermissionsRationale, string2, microphonePermissionsModalPositiveButton, microphonePermissionsModalNegativeButton, (3592 & Barcode.FORMAT_UPC_A) != 0 ? null : null, (3592 & Barcode.FORMAT_UPC_E) != 0 ? null : null, (3592 & Barcode.FORMAT_PDF417) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (3592 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: yp.p3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.v3(this.f36194a, renderState, renderProps, context, (PermissionRequestWorkflow.Output) obj);
            }
        });
    }

    public final c t2(final Input renderProps, final SelfieState.RestartCamera renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        ur.a aVar = this.webRtcManager;
        if (aVar != null) {
            aVar.d();
        }
        return new c.e(new Function0() { // from class: yp.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.u2(context, this, renderProps, renderState);
            }
        });
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public SelfieState d(@NotNull Input props, @Nullable Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.selfiePoseManager = this.selfiePoseManagerFactory.a(props.getInquiryId(), props.getSessionToken(), props.getFromStep(), props.C(), props.getPoseTimeoutMs());
        this.selfieEventLogger.o(props.getUsePerPoseReveal());
        if (snapshot != null) {
            xu.h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.I() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrO = hVarB.O();
                parcelObtain.unmarshall(bArrO, 0, bArrO.length);
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
        return props.getSkipPromptPage() ? new SelfieState.WaitForCameraFeed(false, false, null, props.A(), props.getPoseConfigs(), false, CameraProperties.b.User, false, 163, null) : new SelfieState.ShowInstructions(null, null, null, 6, null);
    }

    public final boolean w1(Input renderProps) {
        VideoCaptureConfig videoCaptureConfig = renderProps.getVideoCaptureConfig();
        ur.a aVar = this.webRtcManager;
        Boolean boolValueOf = aVar != null ? Boolean.valueOf(aVar.c()) : null;
        ur.a aVar2 = this.webRtcManager;
        Object objI = videoCaptureConfig.i(boolValueOf, aVar2 != null ? Boolean.valueOf(aVar2.g()) : null, this.applicationContext);
        if (jt.n.e(objI) == null) {
            return ((Boolean) objI).booleanValue();
        }
        return false;
    }

    public final c w2(final Input renderProps, final SelfieState.ReviewCaptures renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        String selfieCheckPageTitle = renderProps.getStrings().getSelfieCheckPageTitle();
        if (selfieCheckPageTitle == null) {
            selfieCheckPageTitle = this.applicationContext.getString(vp.g.Q);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageTitle, "getString(...)");
        }
        String selfieCheckPageDescription = renderProps.getStrings().getSelfieCheckPageDescription();
        if (selfieCheckPageDescription == null) {
            selfieCheckPageDescription = this.applicationContext.getString(vp.g.I);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageDescription, "getString(...)");
        }
        String selfieCheckPageLabelFront = renderProps.getStrings().getSelfieCheckPageLabelFront();
        if (selfieCheckPageLabelFront == null) {
            selfieCheckPageLabelFront = this.applicationContext.getString(vp.g.M);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelFront, "getString(...)");
        }
        String selfieCheckPageLabelLeft = renderProps.getStrings().getSelfieCheckPageLabelLeft();
        if (selfieCheckPageLabelLeft == null) {
            selfieCheckPageLabelLeft = this.applicationContext.getString(vp.g.N);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelLeft, "getString(...)");
        }
        String selfieCheckPageLabelRight = renderProps.getStrings().getSelfieCheckPageLabelRight();
        if (selfieCheckPageLabelRight == null) {
            selfieCheckPageLabelRight = this.applicationContext.getString(vp.g.O);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelRight, "getString(...)");
        }
        String selfieCheckPageLabelUp = renderProps.getStrings().getSelfieCheckPageLabelUp();
        if (selfieCheckPageLabelUp == null) {
            selfieCheckPageLabelUp = this.applicationContext.getString(vp.g.P);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelUp, "getString(...)");
        }
        String selfieCheckPageLabelDown = renderProps.getStrings().getSelfieCheckPageLabelDown();
        if (selfieCheckPageLabelDown == null) {
            selfieCheckPageLabelDown = this.applicationContext.getString(vp.g.L);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageLabelDown, "getString(...)");
        }
        String selfieCheckPageBtnSubmit = renderProps.getStrings().getSelfieCheckPageBtnSubmit();
        if (selfieCheckPageBtnSubmit == null) {
            selfieCheckPageBtnSubmit = this.applicationContext.getString(vp.g.K);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnSubmit, "getString(...)");
        }
        String selfieCheckPageBtnRetake = renderProps.getStrings().getSelfieCheckPageBtnRetake();
        if (selfieCheckPageBtnRetake == null) {
            selfieCheckPageBtnRetake = this.applicationContext.getString(vp.g.J);
            Intrinsics.checkNotNullExpressionValue(selfieCheckPageBtnRetake, "getString(...)");
        }
        return new c.f(new c.f.Strings(selfieCheckPageTitle, selfieCheckPageDescription, selfieCheckPageLabelFront, selfieCheckPageLabelLeft, selfieCheckPageLabelRight, selfieCheckPageLabelUp, selfieCheckPageLabelDown, selfieCheckPageBtnSubmit, selfieCheckPageBtnRetake), renderState.z(), renderProps.getStyles(), this.navigationStateManager.b(), new Function0() { // from class: yp.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.x2(context, this, renderState);
            }
        }, new Function0() { // from class: yp.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.z2(context, this, renderProps, renderState);
            }
        }, new Function0() { // from class: yp.g2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.B2(context, this);
            }
        }, new Function0() { // from class: yp.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.C2(this.f36124a, context);
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
    public final <T extends SelfieState & a> SelfieState x1(r<? super Input, SelfieState, ?>.c cVar, T t8, Selfie selfie) {
        SelfieState selfieStateD;
        long j10;
        if (selfie != null) {
            this.selfieEventLogger.f(t8, selfie);
        }
        String fileUploadUrl = cVar.b().getFileUploadUrl();
        if (fileUploadUrl != null && (selfie instanceof Selfie.SelfieImage)) {
            this.directFileUploader.j(((Selfie.SelfieImage) selfie).getAbsoluteFilePath(), fileUploadUrl);
        }
        List<Selfie> listX0 = selfie != null ? CollectionsKt.x0(t8.w(), selfie) : t8.w();
        List<PoseInfo> listY = selfie != null ? CollectionsKt.Y(t8.g(), 1) : t8.g();
        if (cVar.b().getUsePerPoseReveal()) {
            dq.a aVar = this.selfiePoseManager;
            if (aVar == null) {
                Intrinsics.u("selfiePoseManager");
                aVar = null;
            }
            aVar.n(listX0.size() + 1);
        }
        if (cVar.b().getUsePerPoseReveal() && selfie != null) {
            T t10 = t8;
            if (!((PoseInfo) CollectionsKt.d0(t10.g())).getIsLast()) {
                T t11 = t8;
                selfieStateD = new SelfieState.AcquireNextPose(t10.getCameraProperties(), t10.getStartSelfieTimestamp(), listX0, t8.getBackState(), t8.getCameraFacingMode(), t11.getIsFlashEnabled(), listY, t11.getPoseConfigs(), t11.getAutoCaptureSupported());
            } else if (listY.isEmpty()) {
                if (b4(cVar.b()) == mn.a.Upload) {
                    if (cVar.b().getDesignVersion() == yp.a.K0000) {
                        j10 = 0;
                    } else {
                        j10 = 3000;
                    }
                    T t12 = t8;
                    selfieStateD = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t12.getCameraProperties(), t12.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
                } else if (b4(cVar.b()) == mn.a.Stream) {
                    T t13 = t8;
                    selfieStateD = new SelfieState.FinalizeWebRtc(listX0, t13.getCameraProperties(), t13.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
                } else {
                    T t14 = t8;
                    selfieStateD = p.D(cVar, listX0, null, t14.getCameraProperties(), t14.getStartSelfieTimestamp(), t8.getBackState());
                }
            } else if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == kn.a.Center) {
                T t15 = t8;
                selfieStateD = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t15.getStartSelfieTimestamp(), t15.getCameraProperties(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t16 = t8;
                selfieStateD = new SelfieState.ShowPoseHint(listX0, listY, t16.getAutoCaptureSupported(), t16.getCameraProperties(), t16.getStartSelfieTimestamp(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (listY.isEmpty()) {
            if (((PoseInfo) CollectionsKt.d0(listY)).getPose() == kn.a.Center) {
                T t17 = t8;
                selfieStateD = new SelfieState.StartCapture(false, null, 0.0f, null, listY, listX0, System.currentTimeMillis(), false, t17.getStartSelfieTimestamp(), t17.getCameraProperties(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled(), false, 131, null);
            } else {
                T t18 = t8;
                selfieStateD = new SelfieState.ShowPoseHint(listX0, listY, t18.getAutoCaptureSupported(), t18.getCameraProperties(), t18.getStartSelfieTimestamp(), t8.getBackState(), cVar.b().getPoseConfigs(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
            }
        } else if (b4(cVar.b()) == mn.a.Upload) {
            if (cVar.b().getDesignVersion() == yp.a.K0000) {
                j10 = 0;
            } else {
                j10 = 3000;
            }
            T t19 = t8;
            selfieStateD = new SelfieState.FinalizeLocalVideoCapture(listX0, j10, false, false, t19.getCameraProperties(), t19.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode(), 12, null);
        } else if (b4(cVar.b()) == mn.a.Stream) {
            T t110 = t8;
            selfieStateD = new SelfieState.FinalizeWebRtc(listX0, t110.getCameraProperties(), t110.getStartSelfieTimestamp(), t8.getBackState(), t8.getCameraFacingMode());
        } else {
            T t111 = t8;
            selfieStateD = p.D(cVar, listX0, null, t111.getCameraProperties(), t111.getStartSelfieTimestamp(), t8.getBackState());
        }
        SelfieState selfieState = selfieStateD;
        return selfie == null ? selfieState : new SelfieState.CaptureTransition(selfieState, t8.j(), t8.getBackState(), t8.getCameraFacingMode(), t8.getIsFlashEnabled());
    }

    @Override // ym.k
    @NotNull
    /* JADX INFO: renamed from: y1, reason: merged with bridge method [inline-methods] */
    public Object f(@NotNull Input renderProps, @NotNull SelfieState renderState, @NotNull ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        Object objZ1;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!p.H(renderState)) {
            context.b("close_camera", new e(null));
        }
        if (!c4(renderProps)) {
            context.b("output_webrtc_error", new f(context, this, null));
        }
        boolean z10 = renderState instanceof SelfieState.Submit;
        uq.a.d(this.navigationStateManager, renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !z10, false, 8, null);
        this.selfieEventLogger.e(renderProps.getFromStep(), l2.f(renderState));
        if (renderState instanceof SelfieState.ShowInstructions) {
            objZ1 = D2(renderProps, (SelfieState.ShowInstructions) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForWebRtcSetup) {
            objZ1 = B3(renderProps, (SelfieState.WaitForWebRtcSetup) renderState, context);
        } else if (renderState instanceof SelfieState.WaitForCameraFeed) {
            objZ1 = q3(renderProps, (SelfieState.WaitForCameraFeed) renderState, context);
        } else if (renderState instanceof SelfieState.RestartCamera) {
            objZ1 = t2(renderProps, (SelfieState.RestartCamera) renderState, context);
        } else if (renderState instanceof SelfieState.ShowPoseHint) {
            objZ1 = J2(renderProps, (SelfieState.ShowPoseHint) renderState, context);
        } else if (renderState instanceof SelfieState.StartCapture) {
            objZ1 = P2(renderProps, (SelfieState.StartCapture) renderState, context);
        } else if (renderState instanceof SelfieState.StartCaptureFaceDetected) {
            objZ1 = a3(renderProps, (SelfieState.StartCaptureFaceDetected) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToCapture) {
            objZ1 = Z1(renderProps, (SelfieState.CountdownToCapture) renderState, context);
        } else if (renderState instanceof SelfieState.CountdownToManualCapture) {
            objZ1 = f2(renderProps, (SelfieState.CountdownToManualCapture) renderState, context);
        } else if (renderState instanceof SelfieState.Capture) {
            objZ1 = K1(renderProps, (SelfieState.Capture) renderState, context);
        } else if (renderState instanceof SelfieState.CaptureTransition) {
            objZ1 = T1(renderProps, (SelfieState.CaptureTransition) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeLocalVideoCapture) {
            objZ1 = this.localVideoCaptureRenderer.q(renderProps, (SelfieState.FinalizeLocalVideoCapture) renderState, context);
        } else if (renderState instanceof SelfieState.FinalizeWebRtc) {
            objZ1 = m2(renderProps, (SelfieState.FinalizeWebRtc) renderState, context);
        } else if (renderState instanceof SelfieState.WebRtcFinished) {
            objZ1 = P3(renderProps, (SelfieState.WebRtcFinished) renderState, context);
        } else if (renderState instanceof SelfieState.ReviewCaptures) {
            objZ1 = w2(renderProps, (SelfieState.ReviewCaptures) renderState, context);
        } else if (z10) {
            objZ1 = i3(renderProps, (SelfieState.Submit) renderState, context);
        } else {
            if (!(renderState instanceof SelfieState.AcquireNextPose)) {
                throw new jt.l();
            }
            objZ1 = z1(renderProps, (SelfieState.AcquireNextPose) renderState, context);
        }
        return objZ1 instanceof c.C0235c ? com.withpersona.sdk2.inquiry.permissions.g.c(objZ1) : objZ1;
    }

    public final c z1(final Input renderProps, SelfieState.AcquireNextPose renderState, final ym.k<? super Input, SelfieState, ? extends b, ? extends Object>.a context) {
        int size = renderState.w().size();
        context.b("fetch_pose_" + size, new g(size, context, null));
        return new c.a(renderProps.getStrings().getCapturePageTitle(), null, null, null, renderProps.getStrings().getCaptureSuccess(), renderProps.getStrings().getDisclaimer(), null, renderProps.getStrings().getSelfieHintAutoCaptureTimeout(), renderProps.getStrings().getSelfieHintVerifying(), false, new c.a.AbstractC0232a.C0233a(c.a.b.CLEAR, renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), new Function2() { // from class: yp.p0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SelfieWorkflow.A1(context, this, (kn.a) obj, ((Boolean) obj2).booleanValue());
            }
        }, new Function1() { // from class: yp.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.C1(context, this, (Throwable) obj);
            }
        }), renderProps.getStyles(), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.b(), new Function0() { // from class: yp.w1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.E1(context, this);
            }
        }, new Function0() { // from class: yp.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.F1(this.f36113a, context);
            }
        }, p.n(context, false, 1, null), new Function0() { // from class: yp.s2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieWorkflow.G1(this.f36256a, context, renderProps);
            }
        }, b4(renderProps), this.webRtcManager, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ControllerFactory, new Function1() { // from class: yp.d3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.H1(context, this, (CameraProperties.b) obj);
            }
        }, 0.0f, null, renderState.getCameraFacingMode(), renderState.getIsFlashEnabled(), this.featureFlagManager.a(go.a.f18282a), false, false, new Function1() { // from class: yp.o3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflow.J1(((Boolean) obj).booleanValue());
            }
        }, null, false, false, false, renderProps.getDesignVersion(), renderProps.getFlowWatermarkText(), null, 0, 64, null);
    }
}
