package es;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nn.ViewEnvironment;
import or.ComponentView;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import qr.ActionButtonComponent;
import qr.BrandingComponent;
import qr.CancelButtonComponent;
import qr.CombinedStepButtonComponent;
import qr.CompleteButtonComponent;
import qr.FooterComponent;
import qr.ImagePreviewComponent;
import qr.LinkButtonComponent;
import qr.LocalImageComponent;
import qr.Option;
import qr.PhoneNumberSnaComponent;
import qr.PrivacyPolicyComponent;
import qr.QRCodeComponent;
import qr.RemoteImageComponent;
import qr.SelectedFile;
import qr.SpacerComponent;
import qr.SubmitButtonComponent;
import qr.TextComponent;
import qr.TitleComponent;
import sr.GovernmentIdNfcData;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0087\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010*J%\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0002¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u0002082\u0006\u0010\u001c\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\b>\u0010?JE\u0010D\u001a\u00020\u000b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010K\u001a\u00020J*\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020M*\b\u0012\u0004\u0012\u00020\u000f0#H\u0002¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000eH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR(\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010{R%\u0010\u0082\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010{R#\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, d2 = {"Les/h4;", "Lnn/k;", "Les/s6$d$a;", "Lfs/a;", "binding", "initialRendering", "<init>", "(Lfs/a;Les/s6$d$a;)V", "rendering", "Lnn/z;", "viewEnvironment", BuildConfig.FLAVOR, "x0", "(Les/s6$d$a;Lnn/z;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "componentParams", "Les/g2;", "errors", "t0", "(Les/s6$d$a;Lnn/z;Ljava/util/Map;Ljava/util/Map;)V", "Lqr/g5;", "component", "o1", "(Les/s6$d$a;Lnn/z;Lqr/g5;Ljava/util/Map;Ljava/util/Map;)V", "Lqr/x5;", "Landroid/view/View;", "view", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToConfig", "H0", "(Les/s6$d$a;Lqr/x5;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lnn/z;Ljava/util/Map;)V", "q0", "(Les/s6$d$a;)V", BuildConfig.FLAVOR, "components", BuildConfig.FLAVOR, "isLoading", "f0", "(Ljava/util/List;Ljava/util/Map;Z)V", "c0", "(Landroid/view/View;Ljava/util/Map;Lqr/x5;Z)V", "e0", "(Landroid/view/View;Ljava/util/Map;Lqr/x5;)V", "d0", "Lor/j;", "result", "g0", "(Lor/j;Ljava/util/List;)V", BuildConfig.FLAVOR, "firstBelowTheFoldChildIndex", "Lqr/a0;", "footerComponent", "u0", "(Lor/j;ILqr/a0;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "r0", "(Les/s6$d$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lor/a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "h0", "(Ljava/util/List;)Ljava/util/Map;", "initialComponentValues", BuildConfig.FLAVOR, "outMap", "componentViews", "p0", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", "E0", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$d;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "D0", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$c;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "F0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$e;", "G0", "(Ljava/util/Map;)Ljava/util/Map;", "b", "Lfs/a;", "c", "Ljava/util/Map;", "componentNameToView", "d", "e", "Ljava/lang/String;", "navBarTitle", "Lvr/j;", "f", "Lvr/j;", "inputSelectBottomSheetController", "Les/f2;", "g", "Les/f2;", "signatureBottomSheetController", "Les/v1;", "h", "Les/v1;", "nestedUiBottomSheetController", "Lrr/n;", "i", "Lrr/n;", "helpBottomSheetController", "j", "Z", "hasScrolledToBottom", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "onComplete", "l", "onCancel", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "onClick", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "n", "Lkotlin/jvm/functions/Function1;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "o", "launchJpMyNumberNfcScan", "Lqr/d6;", "p", "onVerifyPersonaClick", "i0", "()Ljava/util/Map;", "uiStateValues", "q", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"ResourceType"})
public final class h4 implements nn.k<s6.d.a> {

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final fs.a binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, View> componentNameToView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, UiComponentConfig> componentNameToConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String navBarTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final vr.j inputSelectBottomSheetController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f2 signatureBottomSheetController;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final v1 nestedUiBottomSheetController;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rr.n helpBottomSheetController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean hasScrolledToBottom;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> onComplete;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function0<Unit> onCancel;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function2<? super qr.x5, ? super Boolean, Unit> onClick;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Function1<? super qr.d6, Unit> onVerifyPersonaClick;

    /* JADX INFO: renamed from: es.h4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Les/h4$a;", "Lnn/b0;", "Les/s6$d$a;", "<init>", "()V", "initialRendering", "Lnn/z;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Les/s6$d$a;Lnn/z;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lxu/c;", "getType", "()Lxu/c;", Payload.TYPE, "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements nn.b0<s6.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nn.f<s6.d.a> f14240a;

        /* JADX INFO: renamed from: es.h4$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0269a extends p001kotlin.jvm.internal.k implements Function2<s6.d.a, ViewEnvironment, Unit> {
            public C0269a(Object obj) {
                super(2, obj, h4.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void d(s6.d.a p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((h4) this.receiver).a(p8, p10);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(s6.d.a aVar, ViewEnvironment viewEnvironment) {
                d(aVar, viewEnvironment);
                return Unit.f21506a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final View c(s6.d.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            Context context2;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                context2 = context;
            }
            fs.a aVarC = fs.a.c(LayoutInflater.from(context2).cloneInContext(context));
            CoordinatorLayout coordinatorLayoutB = aVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
            Intrinsics.checkNotNull(aVarC);
            nn.f0.a(coordinatorLayoutB, initialRendering, initialViewEnvironment, new C0269a(new h4(aVarC, initialRendering)));
            CoordinatorLayout coordinatorLayoutB2 = aVarC.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "let(...)");
            return coordinatorLayoutB2;
        }

        @Override // nn.b0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull s6.d.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f14240a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // nn.b0
        @NotNull
        public xu.c<? super s6.d.a> getType() {
            return this.f14240a.getType();
        }

        public Companion() {
            this.f14240a = new nn.f<>(p001kotlin.jvm.internal.d0.b(s6.d.a.class), new pu.o() { // from class: es.g4
                @Override // pu.o
                public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return h4.Companion.c((s6.d.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"es/h4$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", BuildConfig.FLAVOR, "newState", BuildConfig.FLAVOR, "c", "(Landroid/view/View;I)V", BuildConfig.FLAVOR, "slideOffset", "b", "(Landroid/view/View;F)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends BottomSheetBehavior.g {
        public final /* synthetic */ BottomSheetBehavior<NestedScrollView> b;

        public b(BottomSheetBehavior<NestedScrollView> bottomSheetBehavior) {
            this.b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            h4.this.binding.f16583j.setPadding(h4.this.binding.f16583j.getPaddingLeft(), h4.this.binding.f16583j.getPaddingTop(), h4.this.binding.f16583j.getPaddingRight(), this.b.u0() + ((int) (slideOffset * (h4.this.binding.f16581h.getHeight() - this.b.u0()))));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$15$1$1", f = "UiScreenRunner.kt", l = {845}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14242t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e3.o f14243u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ View f14244v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ wr.a f14245w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ qr.x5 f14246x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e3.o oVar, View view, wr.a aVar, qr.x5 x5Var, eu.b<? super c> bVar) {
            super(2, bVar);
            this.f14243u = oVar;
            this.f14244v = view;
            this.f14245w = aVar;
            this.f14246x = x5Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new c(this.f14243u, this.f14244v, this.f14245w, this.f14246x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f14242t;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    e3.o oVar = this.f14243u;
                    Context context = this.f14244v.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    e3.k0 k0Var = new e3.k0(p001kotlin.collections.o.d(new e3.n0(((wr.a.GoogleWalletRequestMetadata) this.f14245w).getRequestJson())), null, false, null, false, 30, null);
                    this.f14242t = 1;
                    obj = oVar.c(context, k0Var, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                String strA = r1.a(((e3.l0) obj).getCredential());
                if (strA != null) {
                    ((MdocComponent) this.f14246x).getMdocDataController().c(strA);
                } else {
                    ((MdocComponent) this.f14246x).getErrorTextController().c(((MdocComponent) this.f14246x).getErrorRetrievingMdocText());
                }
            } catch (f3.n unused) {
                ((MdocComponent) this.f14246x).getErrorTextController().c(((MdocComponent) this.f14246x).getErrorRetrievingMdocText());
            }
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Function1<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f14247a = new d();

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public h4(@NotNull fs.a binding, @NotNull final s6.d.a initialRendering) {
        Map<String, UiComponentConfig> mapJ;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        this.binding = binding;
        this.navBarTitle = initialRendering.getNavBarTitle();
        CoordinatorLayout coordinatorLayoutB = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        this.inputSelectBottomSheetController = new vr.j(coordinatorLayoutB);
        CoordinatorLayout coordinatorLayoutB2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        this.signatureBottomSheetController = new f2(coordinatorLayoutB2);
        CoordinatorLayout coordinatorLayoutB3 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB3, "getRoot(...)");
        this.nestedUiBottomSheetController = new v1(coordinatorLayoutB3);
        CoordinatorLayout coordinatorLayoutB4 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB4, "getRoot(...)");
        this.helpBottomSheetController = new rr.n(coordinatorLayoutB4);
        this.onComplete = new Function0() { // from class: es.k2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h4.n0();
            }
        };
        this.onCancel = new Function0() { // from class: es.v2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h4.l0();
            }
        };
        this.onClick = new Function2() { // from class: es.g3
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h4.m0((qr.x5) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.launchNfcScan = new Function1() { // from class: es.r3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.k0((GovernmentIdNfcScanComponent) obj);
            }
        };
        this.launchJpMyNumberNfcScan = new Function1() { // from class: es.a4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.j0((JpMyNumberNfcScanComponent) obj);
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: es.b4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.o0((qr.d6) obj);
            }
        };
        Context context = binding.getRoot().getContext();
        or.v vVar = or.v.f28513a;
        Intrinsics.checkNotNull(context);
        List<qr.x5> listF = initialRendering.f();
        List<UiComponentConfig> listD = initialRendering.d();
        final or.j jVarH = or.v.h(vVar, context, new UiComponentScreen(listF, listD == null ? p001kotlin.collections.p.k() : listD, initialRendering.getStyles()), initialRendering.getIsLoading(), false, false, 16, null);
        Integer numC = initialRendering.c();
        if (numC != null) {
            binding.f16584k.setBackgroundColor(numC.intValue());
        }
        Drawable drawableA = initialRendering.a(context);
        if (drawableA != null) {
            binding.f16584k.setBackground(drawableA);
            binding.f16576c.setBackgroundColor(0);
        }
        Integer numH = initialRendering.h();
        if (numH != null) {
            binding.f16582i.setControlsColor(numH.intValue());
        }
        List<UiComponentConfig> listD2 = initialRendering.d();
        this.componentNameToConfig = (listD2 == null || (mapJ = com.withpersona.sdk2.inquiry.steps.ui.components.g.j(listD2)) == null) ? p001kotlin.collections.k0.j() : mapJ;
        Set<Map.Entry<String, ComponentView>> setEntrySet = jVarH.getViewBindings().a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = zt.s.a(entry.getKey(), ((ComponentView) entry.getValue()).d());
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        this.componentNameToView = linkedHashMap;
        this.binding.f16585l.addView(jVarH.getContentView());
        if (initialRendering.y() == StyleElements.PositionType.CENTER) {
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            cVar.f(this.binding.b);
            cVar.h(this.binding.f16585l.getId(), 4, this.binding.b.getId(), 4);
            cVar.c(this.binding.b);
        }
        FrameLayout uiStepContainer = this.binding.f16585l;
        Intrinsics.checkNotNullExpressionValue(uiStepContainer, "uiStepContainer");
        yr.p.b(uiStepContainer, initialRendering.getStyles(), false, false, 6, null);
        if (jVarH.getFooterView() != null) {
            g0(jVarH, initialRendering.f());
        }
        CoordinatorLayout coordinatorLayoutB5 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB5, "getRoot(...)");
        kr.g.g(coordinatorLayoutB5, new Function1() { // from class: es.c4
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.X(jVarH, this, (WindowInsetsCompat) obj);
            }
        });
        this.binding.f16583j.setOnScrollChangeListener(new NestedScrollView.e() { // from class: es.d4
            @Override // androidx.core.widget.NestedScrollView.e
            public final void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
                h4.Y(this.f14177a, initialRendering, nestedScrollView, i10, i11, i12, i13);
            }
        });
        this.binding.f16583j.post(new Runnable() { // from class: es.e4
            @Override // java.lang.Runnable
            public final void run() {
                h4.Z(this.f14191a, initialRendering);
            }
        });
    }

    public static final Unit A0(s6.d.a aVar, h4 h4Var) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            h4Var.helpBottomSheetController.x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.v(), aVar.j(), aVar.m());
        }
        return Unit.f21506a;
    }

    public static final Unit B0(s6.d.a aVar, h4 h4Var, List list, qr.x5 tappedComponent, boolean z10) {
        Intrinsics.checkNotNullParameter(tappedComponent, "tappedComponent");
        aVar.r().invoke(tappedComponent, Boolean.valueOf(z10), h4Var.h0(list));
        return Unit.f21506a;
    }

    public static final Unit C0(s6.d.a aVar, h4 h4Var, List list, qr.d6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.x().invoke(it, h4Var.h0(list));
        return Unit.f21506a;
    }

    public static final void I0(h4 h4Var, View view) {
        h4Var.onComplete.invoke();
    }

    public static final void J0(h4 h4Var, qr.x5 x5Var, View view, View view2) {
        h4Var.onClick.invoke(x5Var, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void K0(h4 h4Var, qr.x5 x5Var, View view, View view2) {
        h4Var.onClick.invoke(x5Var, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final void L0(qr.x5 x5Var, ButtonWithLoadingIndicator buttonWithLoadingIndicator, View view) {
        try {
            buttonWithLoadingIndicator.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((LinkButtonComponent) x5Var).getLink())));
        } catch (Exception unused) {
        }
    }

    public static final void M0(h4 h4Var, View view) {
        h4Var.onCancel.invoke();
    }

    public static final void N0(h4 h4Var, qr.x5 x5Var, View view) {
        h4Var.onVerifyPersonaClick.invoke(x5Var);
    }

    public static final Unit O0(View view, s6.d.a aVar, h4 h4Var) {
        if (tr.a.f32836a.b(view)) {
            SubmitButtonComponent p5Var = (SubmitButtonComponent) sr.h.a(aVar.f(), p001kotlin.jvm.internal.d0.b(SubmitButtonComponent.class), d.f14247a);
            if (p5Var != null) {
                h4Var.onClick.invoke(p5Var, Boolean.valueOf(view.getVisibility() == 0));
            }
        }
        return Unit.f21506a;
    }

    public static final void P0(final MaterialAutoCompleteTextView materialAutoCompleteTextView, pr.a aVar, final List<? extends TextInputLayout> list, final ur.d dVar, final s6.d.a aVar2, final qr.x5 x5Var, final List<Suggestion> list2) {
        materialAutoCompleteTextView.setAdapter(aVar);
        aVar.notifyDataSetChanged();
        materialAutoCompleteTextView.setThreshold(1);
        materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: es.w3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                h4.Q0(list, dVar, materialAutoCompleteTextView, aVar2, x5Var, list2, adapterView, view, i10, j10);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Q0(List list, ur.d dVar, MaterialAutoCompleteTextView materialAutoCompleteTextView, s6.d.a aVar, qr.x5 x5Var, List list2, AdapterView adapterView, View view, int i10, long j10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(false);
        }
        dVar.f33879s.setVisibility(0);
        Context context = materialAutoCompleteTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        xq.g.d(context);
        aVar.w().invoke(x5Var, ((Suggestion) list2.get(i10)).getId());
    }

    public static final void R0(h4 h4Var, TextInputLayout textInputLayout, qr.i2 i2Var, qr.k4 k4Var, View view) {
        m1(h4Var, textInputLayout, i2Var, k4Var);
    }

    public static final void S0(h4 h4Var, TextInputLayout textInputLayout, qr.i2 i2Var, qr.k4 k4Var, View view) {
        m1(h4Var, textInputLayout, i2Var, k4Var);
    }

    public static final CharSequence T0(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    public static final void U0(qr.x5 x5Var, View view, View view2) {
        androidx.p000lifecycle.m mVarA;
        wr.a aVarN = ((MdocComponent) x5Var).getMdocRequestMetadata();
        if (!(aVarN instanceof wr.a.GoogleWalletRequestMetadata)) {
            throw new zt.l();
        }
        e3.o.Companion aVar = e3.o.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        e3.o oVarA = aVar.a(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        j.b bVarA = xq.g.a(context2);
        if (bVarA == null || (mVarA = androidx.p000lifecycle.t.a(bVarA)) == null) {
            return;
        }
        av.k.d(mVarA, null, null, new c(oVarA, view, aVarN, x5Var, null), 3, null);
    }

    public static final void V0(h4 h4Var, qr.x5 x5Var, View view, View view2) {
        h4Var.onClick.invoke(x5Var, Boolean.valueOf(view.getVisibility() == 0));
    }

    public static final Unit W0(final qr.x5 x5Var, h4 h4Var) {
        a1(h4Var, ((InputInternationalDbComponent) x5Var).getCountrySelectComponent(), new Function1() { // from class: es.x3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.X0(x5Var, (List) obj);
            }
        });
        return Unit.f21506a;
    }

    public static final Unit X(or.j jVar, h4 h4Var, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i10 = insets2.bottom;
        int i11 = insetsIgnoringVisibility.top;
        int iMax = Integer.max(insetsIgnoringVisibility.bottom, i10);
        int i12 = insetsIgnoringVisibility.left;
        int i13 = insetsIgnoringVisibility.right;
        View viewB = jVar.getFooterView();
        if (viewB == null) {
            h4Var.binding.f16583j.setPadding(i12, i11, i13, iMax);
        } else {
            ShadowedNestedScrollView nestedScroll = h4Var.binding.f16583j;
            Intrinsics.checkNotNullExpressionValue(nestedScroll, "nestedScroll");
            nestedScroll.setPadding(i12, i11, i13, nestedScroll.getPaddingBottom());
            viewB.setPadding(i12, viewB.getPaddingTop(), i13, iMax);
        }
        MaterialDivider footerDivider = h4Var.binding.f16577d;
        Intrinsics.checkNotNullExpressionValue(footerDivider, "footerDivider");
        ViewGroup.LayoutParams layoutParams = footerDivider.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insetsIgnoringVisibility.bottom;
        footerDivider.setLayoutParams(marginLayoutParams);
        CoordinatorLayout footerSheetCoordinatorLayout = h4Var.binding.f16579f;
        Intrinsics.checkNotNullExpressionValue(footerSheetCoordinatorLayout, "footerSheetCoordinatorLayout");
        footerSheetCoordinatorLayout.setPadding(i12, footerSheetCoordinatorLayout.getPaddingTop(), i13, iMax);
        return Unit.f21506a;
    }

    public static final Unit X0(qr.x5 x5Var, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent bVar = (InputInternationalDbComponent) x5Var;
        bVar.getCountryOptionsController().c(it);
        bVar.getIdTypeOptionsController().c(p001kotlin.collections.p.k());
        bVar.getIdValueController().c(BuildConfig.FLAVOR);
        return Unit.f21506a;
    }

    public static final void Y(h4 h4Var, s6.d.a aVar, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        a0(h4Var, aVar);
    }

    public static final Unit Y0(final qr.x5 x5Var, h4 h4Var) {
        a1(h4Var, ((InputInternationalDbComponent) x5Var).t(), new Function1() { // from class: es.q3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.Z0(x5Var, (List) obj);
            }
        });
        return Unit.f21506a;
    }

    public static final void Z(h4 h4Var, s6.d.a aVar) {
        a0(h4Var, aVar);
    }

    public static final Unit Z0(qr.x5 x5Var, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent bVar = (InputInternationalDbComponent) x5Var;
        bVar.getIdTypeOptionsController().c(it);
        bVar.getIdValueController().c(BuildConfig.FLAVOR);
        return Unit.f21506a;
    }

    public static final void a0(h4 h4Var, s6.d.a aVar) {
        if (h4Var.hasScrolledToBottom || h4Var.binding.f16583j.canScrollVertically(1)) {
            return;
        }
        h4Var.hasScrolledToBottom = true;
        h4Var.q0(aVar);
    }

    public static final void a1(final h4 h4Var, qr.i2 i2Var, final Function1<? super List<Option>, Unit> function1) {
        if (i2Var == null) {
            return;
        }
        h4Var.binding.f16582i.getBackButton().setEnabled(false);
        h4Var.binding.f16582i.setImportantForAccessibility(4);
        h4Var.binding.f16585l.setImportantForAccessibility(4);
        h4Var.inputSelectBottomSheetController.t(i2Var, new Function1() { // from class: es.z3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.b1(this.f14674a, function1, (List) obj);
            }
        });
    }

    public static final Unit b1(h4 h4Var, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        h4Var.binding.f16582i.getBackButton().setEnabled(true);
        h4Var.binding.f16582i.setImportantForAccessibility(1);
        h4Var.binding.f16585l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f21506a;
    }

    public static final Unit c1(final qr.x5 x5Var, h4 h4Var) {
        e1(h4Var, ((InputPhoneNumberComponent) x5Var).getCountryCodeSelectComponent(), new Function1() { // from class: es.u3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.d1(x5Var, (List) obj);
            }
        });
        return Unit.f21506a;
    }

    public static final Unit d1(qr.x5 x5Var, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((InputPhoneNumberComponent) x5Var).getCountryCodeOptionsController().c(it);
        return Unit.f21506a;
    }

    public static final void e1(final h4 h4Var, qr.i2 i2Var, final Function1<? super List<Option>, Unit> function1) {
        if (i2Var == null) {
            return;
        }
        h4Var.binding.f16582i.getBackButton().setEnabled(false);
        h4Var.binding.f16582i.setImportantForAccessibility(4);
        h4Var.binding.f16585l.setImportantForAccessibility(4);
        h4Var.inputSelectBottomSheetController.t(i2Var, new Function1() { // from class: es.y3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.f1(this.f14658a, function1, (List) obj);
            }
        });
    }

    public static final Unit f1(h4 h4Var, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        h4Var.binding.f16582i.getBackButton().setEnabled(true);
        h4Var.binding.f16582i.setImportantForAccessibility(1);
        h4Var.binding.f16585l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f21506a;
    }

    public static final void g1(final h4 h4Var, final qr.x5 x5Var, ESignature eSignature, s6.d.a aVar, ViewEnvironment viewEnvironment, View view) {
        h4Var.binding.f16582i.getBackButton().setEnabled(false);
        h4Var.binding.f16582i.setImportantForAccessibility(4);
        h4Var.binding.f16585l.setImportantForAccessibility(4);
        h4Var.signatureBottomSheetController.p((ESignatureComponent) x5Var, eSignature, aVar.getStyles(), viewEnvironment, new Function2() { // from class: es.s3
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h4.h1(this.f14444a, x5Var, ((Boolean) obj).booleanValue(), (Bitmap) obj2);
            }
        });
    }

    public static final Unit h1(h4 h4Var, qr.x5 x5Var, boolean z10, Bitmap bitmap) {
        h4Var.binding.f16582i.getBackButton().setEnabled(true);
        h4Var.binding.f16582i.setImportantForAccessibility(1);
        h4Var.binding.f16585l.setImportantForAccessibility(1);
        if (!z10) {
            ((ESignatureComponent) x5Var).getBitmapController().c(bitmap);
        }
        return Unit.f21506a;
    }

    public static final void i1(h4 h4Var, qr.x5 x5Var, View view) {
        h4Var.launchNfcScan.invoke(x5Var);
    }

    public static final Unit j0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent) {
        Intrinsics.checkNotNullParameter(jpMyNumberNfcScanComponent, "<unused var>");
        return Unit.f21506a;
    }

    public static final void j1(s6.d.a aVar, h4 h4Var, View view) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            h4Var.helpBottomSheetController.x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.v(), aVar.j(), aVar.m());
        }
    }

    public static final Unit k0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<unused var>");
        return Unit.f21506a;
    }

    public static final void k1(h4 h4Var, qr.x5 x5Var, View view) {
        h4Var.launchJpMyNumberNfcScan.invoke(x5Var);
    }

    public static final Unit l0() {
        return Unit.f21506a;
    }

    public static final CharSequence l1(SelectedFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFileName();
    }

    public static final Unit m0(qr.x5 x5Var, boolean z10) {
        Intrinsics.checkNotNullParameter(x5Var, "<unused var>");
        return Unit.f21506a;
    }

    public static final void m1(final h4 h4Var, final TextInputLayout textInputLayout, qr.i2 i2Var, final qr.k4<?> k4Var) {
        h4Var.binding.f16582i.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        h4Var.binding.f16582i.setImportantForAccessibility(4);
        h4Var.binding.f16585l.setImportantForAccessibility(4);
        h4Var.inputSelectBottomSheetController.t(i2Var, new Function1() { // from class: es.t3
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.n1(this.f14539a, textInputLayout, k4Var, (List) obj);
            }
        });
    }

    public static final Unit n0() {
        return Unit.f21506a;
    }

    public static final Unit n1(h4 h4Var, TextInputLayout textInputLayout, qr.k4 k4Var, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        h4Var.binding.f16582i.getBackButton().setEnabled(true);
        textInputLayout.setEnabled(true);
        textInputLayout.requestLayout();
        h4Var.binding.f16582i.setImportantForAccessibility(1);
        h4Var.binding.f16585l.setImportantForAccessibility(1);
        k4Var.getSelectedOptionsController().c(selectedItems);
        return Unit.f21506a;
    }

    public static final Unit o0(qr.d6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f21506a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit p1(s6.d.a aVar, qr.g5 g5Var, qr.x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.t().invoke(g5Var, it);
        return Unit.f21506a;
    }

    public static final Unit q1(h4 h4Var, qr.x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        h4Var.nestedUiBottomSheetController.f();
        return Unit.f21506a;
    }

    public static final void r1(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.c());
    }

    public static final void s0(ClickableStackComponent clickableStackComponent, h4 h4Var, ConstraintLayout constraintLayout, View view) {
        clickableStackComponent.k(true);
        h4Var.onClick.invoke(clickableStackComponent, Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }

    public static final void v0(h4 h4Var, View view, BottomSheetBehavior bottomSheetBehavior, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = h4Var.binding.f16578e.getBottom();
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        h4Var.binding.f16581h.offsetDescendantRectToMyCoords(view, rect);
        int iU0 = bottomSheetBehavior.u0();
        bottomSheetBehavior.S0(rect.top);
        if (iU0 != bottomSheetBehavior.u0()) {
            ShadowedNestedScrollView shadowedNestedScrollView = h4Var.binding.f16583j;
            shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), h4Var.binding.f16583j.getPaddingTop(), h4Var.binding.f16583j.getPaddingRight(), bottomSheetBehavior.u0());
        }
        bottomSheetBehavior.Q0(bottom);
    }

    public static final void w0(h4 h4Var, BottomSheetBehavior bottomSheetBehavior, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = h4Var.binding.f16578e.getBottom();
        bottomSheetBehavior.S0(bottom);
        bottomSheetBehavior.Q0(bottom);
        ShadowedNestedScrollView shadowedNestedScrollView = h4Var.binding.f16583j;
        shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), h4Var.binding.f16583j.getPaddingTop(), h4Var.binding.f16583j.getPaddingRight(), bottom);
    }

    public static final Unit y0(h4 h4Var, s6.d.a aVar) {
        if (!h4Var.inputSelectBottomSheetController.l() && !h4Var.signatureBottomSheetController.h() && !rr.n.o(h4Var.helpBottomSheetController, null, 1, null)) {
            if (aVar.getNavigationState().getShowBackButton()) {
                aVar.p().invoke();
            } else {
                aVar.q().invoke();
            }
        }
        return Unit.f21506a;
    }

    public static final Unit z0(s6.d.a aVar) {
        aVar.q().invoke();
        return Unit.f21506a;
    }

    public final ComponentParam.c D0(Number number) {
        return new ComponentParam.c(number);
    }

    public final ComponentParam.d E0(String str) {
        return new ComponentParam.d(str);
    }

    public final ComponentParam.e F0(List<String> list) {
        return new ComponentParam.e(list);
    }

    public final Map<String, Object> G0(Map<String, ? extends ComponentParam> map) {
        Set<Map.Entry<String, ? extends ComponentParam>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = zt.s.a(entry.getKey(), com.withpersona.sdk2.inquiry.ui.network.a.a((ComponentParam) entry.getValue()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    public final void H0(final s6.d.a rendering, final qr.x5 component, final View view, Map<String, ? extends Object> componentParams, Map<String, g2> errors, final ViewEnvironment viewEnvironment, Map<String, ? extends UiComponentConfig> componentNameToConfig) {
        ArrayList arrayList;
        InputFileUpload.Attributes attributes;
        List<InputFileUpload.PrefillItem> prefill;
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String placeholder;
        InputTextBasedComponentStyle styles;
        Map<String, g2> map;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        Map<String, g2> map2 = errors;
        if (component instanceof CompleteButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: es.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.I0(this.f14443a, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof SubmitButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: es.e3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.J0(this.f14189a, component, view, view2);
                }
            });
            buttonWithLoadingIndicator.setIsLoading(rendering.getIsLoading() && ((SubmitButtonComponent) component).getWasTapped());
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ActionButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() { // from class: es.f3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.K0(this.f14204a, component, view, view2);
                }
            });
            buttonWithLoadingIndicator2.setIsLoading(rendering.getIsLoading() && ((ActionButtonComponent) component).getWasTapped());
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof LinkButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            final ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator3.setOnClickListener(new View.OnClickListener() { // from class: es.h3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.L0(component, buttonWithLoadingIndicator3, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof CancelButtonComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: es.i3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.M0(this.f14256a, view2);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof qr.d6) {
            view.setOnClickListener(new View.OnClickListener() { // from class: es.j3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h4.N0(this.f14290a, component, view2);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator4 != null) {
                buttonWithLoadingIndicator4.setIsLoading(rendering.getIsLoading() && ((qr.d6) component).getWasTapped());
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit = Unit.f21506a;
            return;
        }
        if (component instanceof InputTextComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout = (TextInputLayout) view;
            g2 g2Var = map2.get(component.getName());
            UiComponentError uiComponentErrorA = g2Var != null ? g2Var.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError = (UiComponentError.UiInputComponentError) uiComponentErrorA;
            bs.d.d(textInputLayout, uiInputComponentError != null ? uiInputComponentError.getMessage() : null, ((InputTextComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit2 = Unit.f21506a;
            return;
        }
        if (component instanceof InputTextAreaComponent) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            g2 g2Var2 = map2.get(component.getName());
            UiComponentError uiComponentErrorA2 = g2Var2 != null ? g2Var2.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA2 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA2 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError2 = (UiComponentError.UiInputComponentError) uiComponentErrorA2;
            bs.d.d(textInputLayout2, uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null, ((InputTextAreaComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit3 = Unit.f21506a;
            return;
        }
        if (component instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) component).getSubmitCodeHelper().c(new Function0() { // from class: es.k3
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h4.O0(view, rendering, this);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit4 = Unit.f21506a;
            return;
        }
        if (component instanceof InputAddressComponent) {
            Object tag = view.getTag();
            Intrinsics.d(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
            ur.d dVar = (ur.d) tag;
            List<View> listN = p001kotlin.collections.p.n(dVar.f33866f, dVar.f33874n, dVar.b, dVar.f33873m, dVar.f33872l);
            InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
            UiComponentConfig uiComponentConfig = componentNameToConfig.get(inputAddressComponent.getName());
            Intrinsics.d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            g2 g2Var3 = map2.get(component.getName());
            UiComponentError uiComponentErrorA3 = g2Var3 != null ? g2Var3.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA3 instanceof UiComponentError.UiInputAddressComponentError)) {
                uiComponentErrorA3 = null;
            }
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentErrorA3;
            List<Suggestion> listZ = inputAddressComponent.z();
            if (listZ == null) {
                listZ = p001kotlin.collections.p.k();
            }
            List<Suggestion> list = listZ;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<Suggestion> list2 = list;
            ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Suggestion) it.next()).toString());
            }
            List listM0 = CollectionsKt.M0(arrayList2);
            InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
            pr.a aVar = new pr.a(context, R.layout.simple_list_item_1, listM0, (styles2 == null || (inputTextStyle2 = styles2.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            MaterialAutoCompleteTextView addressFieldExpandedTextView = dVar.f33867g;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpandedTextView, "addressFieldExpandedTextView");
            P0(addressFieldExpandedTextView, aVar, listN, dVar, rendering, component, list);
            MaterialAutoCompleteTextView addressFieldCollapsedTextView = dVar.f33865e;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsedTextView, "addressFieldCollapsedTextView");
            P0(addressFieldCollapsedTextView, aVar, listN, dVar, rendering, component, list);
            if (Intrinsics.c(inputAddressComponent.getIsAddressAutocompleteLoading(), Boolean.FALSE)) {
                Iterator it2 = listN.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                dVar.f33879s.setVisibility(8);
            }
            if (uiInputAddressComponentError != null) {
                inputAddressComponent.J(Boolean.FALSE);
            }
            if (Intrinsics.c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.FALSE)) {
                dVar.f33869i.setVisibility(8);
                dVar.f33870j.setVisibility(0);
                dVar.f33871k.setLabelFor(dVar.f33870j.getId());
            } else if (Intrinsics.c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.TRUE) || inputAddressComponent.getIsAddressComponentsCollapsed() == null) {
                dVar.f33869i.setVisibility(0);
                dVar.f33870j.setVisibility(8);
                dVar.f33871k.setLabelFor(dVar.f33869i.getId());
            }
            e0(view, componentParams, component);
            for (View view2 : listN) {
                Intrinsics.checkNotNull(view2);
                d0(view2, componentParams, component, rendering.getIsLoading());
            }
            InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
            TextBasedComponentStyle errorTextStyle = (styles3 == null || (inputTextStyle = styles3.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            TextInputLayout addressFieldCollapsed = dVar.f33864d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            bs.d.d(addressFieldCollapsed, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressFieldExpanded = dVar.f33866f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            bs.d.d(addressFieldExpanded, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressSuite = dVar.f33874n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            bs.d.d(addressSuite, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_2") : null, errorTextStyle);
            TextInputLayout addressCity = dVar.b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            bs.d.d(addressCity, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("city") : null, errorTextStyle);
            TextInputLayout addressSubdivision = dVar.f33873m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            bs.d.d(addressSubdivision, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("subdivision") : null, errorTextStyle);
            TextInputLayout addressPostalCode = dVar.f33872l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            bs.d.d(addressPostalCode, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("postal_code") : null, errorTextStyle);
            Unit unit5 = Unit.f21506a;
            return;
        }
        if ((component instanceof InputSelectComponent) || (component instanceof InputMultiSelectComponent)) {
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            final TextInputLayout textInputLayout3 = (TextInputLayout) view;
            Intrinsics.d(component, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
            final qr.i2 i2Var = (qr.i2) component;
            final qr.k4 k4Var = (qr.k4) component;
            textInputLayout3.setOnClickListener(new View.OnClickListener() { // from class: es.l3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    h4.R0(this.f14339a, textInputLayout3, i2Var, k4Var, view3);
                }
            });
            EditText editText = textInputLayout3.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: es.m3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        h4.S0(this.f14352a, textInputLayout3, i2Var, k4Var, view3);
                    }
                });
                Unit unit6 = Unit.f21506a;
            }
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                editText2.setText(CollectionsKt.m0(k4Var.getSelectedOptionsController().b(), "\n", null, null, 0, null, new Function1() { // from class: es.n3
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return h4.T0((Option) obj);
                    }
                }, 30, null));
                Unit unit7 = Unit.f21506a;
            }
            Option option = (Option) CollectionsKt.firstOrNull(k4Var.getSelectedOptionsController().b());
            as.c.h(textInputLayout3, option != null ? option.getLeadingImageUrl() : null);
            g2 g2Var4 = map2.get(component.getName());
            UiComponentError uiComponentErrorA4 = g2Var4 != null ? g2Var4.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA4 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA4 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError3 = (UiComponentError.UiInputComponentError) uiComponentErrorA4;
            String message = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle styles4 = i2Var.getF35957a();
            bs.d.d(textInputLayout3, message, styles4 != null ? styles4.getErrorTextStyle() : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit8 = Unit.f21506a;
            return;
        }
        if (component instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            Intrinsics.d(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
            ur.n nVar = (ur.n) tag2;
            g2 g2Var5 = map2.get(component.getName());
            UiComponentError uiComponentErrorA5 = g2Var5 != null ? g2Var5.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA5 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA5 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError4 = (UiComponentError.UiInputComponentError) uiComponentErrorA5;
            String message2 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView radioGroupError = nVar.f33909c;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            if (message2 == null || StringsKt.p0(message2)) {
                radioGroupError.setVisibility(8);
                radioGroupError.setText(BuildConfig.FLAVOR);
            } else {
                radioGroupError.setVisibility(0);
                radioGroupError.setText(message2);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById = view.findViewById(or.f.f28452u0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            Iterator<View> it3 = androidx.core.view.u0.a((ViewGroup) viewFindViewById).iterator();
            while (it3.hasNext()) {
                d0(it3.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit9 = Unit.f21506a;
            return;
        }
        if (component instanceof qr.y5) {
            for (qr.x5 x5Var : ((qr.y5) component).getChildren()) {
                View view3 = this.componentNameToView.get(x5Var.getName());
                if (view3 != null) {
                    Map<String, g2> map3 = map2;
                    H0(rendering, x5Var, view3, componentParams, map3, viewEnvironment, componentNameToConfig);
                    map = map3;
                } else {
                    map = map2;
                }
                map2 = map;
            }
            if ((component instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                r0(rendering, (ClickableStackComponent) component, (ConstraintLayout) view);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit10 = Unit.f21506a;
            return;
        }
        if (component instanceof MdocComponent) {
            Object tag3 = view.getTag();
            Intrinsics.d(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentViewHolder");
            qr.j4 j4Var = (qr.j4) tag3;
            String strJ = ((MdocComponent) component).getErrorText();
            j4Var.getLaunchButton().setOnClickListener(new View.OnClickListener() { // from class: es.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    h4.U0(component, view, view4);
                }
            });
            c0(j4Var.getLaunchButton(), componentParams, component, rendering.getIsLoading());
            g2 g2Var6 = map2.get(component.getName());
            UiComponentError uiComponentErrorA6 = g2Var6 != null ? g2Var6.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError5 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorA6 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorA6);
            if (uiInputComponentError5 != null) {
                strJ = uiInputComponentError5.getMessage();
            }
            if (strJ == null || StringsKt.p0(strJ)) {
                j4Var.getErrorLabel().setVisibility(8);
                Unit unit11 = Unit.f21506a;
                return;
            } else {
                TextView errorLabel = j4Var.getErrorLabel();
                errorLabel.setText(strJ);
                errorLabel.setVisibility(0);
                return;
            }
        }
        if (component instanceof qr.i) {
            view.setOnClickListener(new View.OnClickListener() { // from class: es.u2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    h4.V0(this.f14551a, component, view, view4);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator5 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator5 != null) {
                buttonWithLoadingIndicator5.setIsLoading(rendering.getIsLoading() && ((qr.i) component).getWasTapped());
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit12 = Unit.f21506a;
            return;
        }
        if (component instanceof InputDateComponent) {
            Object tag4 = view.getTag();
            Intrinsics.d(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
            ur.f fVar = (ur.f) tag4;
            g2 g2Var7 = map2.get(component.getName());
            UiComponentError uiComponentErrorA7 = g2Var7 != null ? g2Var7.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError6 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorA7 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorA7);
            if (uiInputComponentError6 != null) {
                fVar.f33886f.setError(uiInputComponentError6.getMessage());
                fVar.f33883c.setError(uiInputComponentError6.getMessage());
                fVar.f33888h.setError(uiInputComponentError6.getMessage());
                fVar.f33885e.setText(uiInputComponentError6.getMessage());
                fVar.f33885e.setVisibility(0);
            } else {
                fVar.f33886f.setError(BuildConfig.FLAVOR);
                fVar.f33883c.setError(BuildConfig.FLAVOR);
                fVar.f33888h.setError(BuildConfig.FLAVOR);
                fVar.f33885e.setText(BuildConfig.FLAVOR);
                fVar.f33885e.setVisibility(8);
            }
            e0(view, componentParams, component);
            View month = fVar.f33886f;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            d0(month, componentParams, component, rendering.getIsLoading());
            View day = fVar.f33883c;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            d0(day, componentParams, component, rendering.getIsLoading());
            View year = fVar.f33888h;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            d0(year, componentParams, component, rendering.getIsLoading());
            Unit unit13 = Unit.f21506a;
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            Object tag5 = view.getTag();
            Intrinsics.d(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
            ur.q qVar = (ur.q) tag5;
            g2 g2Var8 = map2.get(component.getName());
            UiComponentError uiComponentErrorA8 = g2Var8 != null ? g2Var8.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA8 instanceof UiComponentError.UiInputInternationalDbComponentError)) {
                uiComponentErrorA8 = null;
            }
            UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiComponentError.UiInputInternationalDbComponentError) uiComponentErrorA8;
            Map<String, String> message3 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
            com.withpersona.sdk2.inquiry.steps.ui.components.c.n((InputInternationalDbComponent) component, qVar, new Function0() { // from class: es.w2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h4.W0(component, this);
                }
            }, new Function0() { // from class: es.x2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h4.Y0(component, this);
                }
            }, message3 != null ? message3.get("idb_country") : null, message3 != null ? message3.get("idb_type") : null, message3 != null ? message3.get("idb_value") : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit14 = Unit.f21506a;
            return;
        }
        if (component instanceof InputMaskedTextComponent) {
            g2 g2Var9 = map2.get(component.getName());
            UiComponentError uiComponentErrorA9 = g2Var9 != null ? g2Var9.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA9 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA9 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError7 = (UiComponentError.UiInputComponentError) uiComponentErrorA9;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout4 = (TextInputLayout) view;
            String message4 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
            InputTextBasedComponentStyle inputTextBasedComponentStyleK = ((InputMaskedTextComponent) component).getStyles();
            bs.d.d(textInputLayout4, message4, inputTextBasedComponentStyleK != null ? inputTextBasedComponentStyleK.getErrorTextStyle() : null);
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit15 = Unit.f21506a;
            return;
        }
        if (component instanceof InputPhoneNumberComponent) {
            Object tag6 = view.getTag();
            Intrinsics.d(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding");
            ur.m mVar = (ur.m) tag6;
            g2 g2Var10 = map2.get(component.getName());
            UiComponentError uiComponentErrorA10 = g2Var10 != null ? g2Var10.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA10 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA10 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError8 = (UiComponentError.UiInputComponentError) uiComponentErrorA10;
            TextInputLayout inputLayout = mVar.b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            String message5 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
            InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
            bs.d.d(inputLayout, message5, inputPhoneNumberComponent.getErrorTextStyle());
            qr.b2.e(inputPhoneNumberComponent, mVar, new Function0() { // from class: es.y2
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h4.c1(component, this);
                }
            });
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit16 = Unit.f21506a;
            return;
        }
        if (component instanceof InputNumberComponent) {
            g2 g2Var11 = map2.get(component.getName());
            UiComponentError uiComponentErrorA11 = g2Var11 != null ? g2Var11.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA11 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA11 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError9 = (UiComponentError.UiInputComponentError) uiComponentErrorA11;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout5 = (TextInputLayout) view;
            String message6 = uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null;
            UiComponentConfig uiComponentConfig2 = componentNameToConfig.get(((InputNumberComponent) component).getName());
            InputNumber inputNumber = uiComponentConfig2 instanceof InputNumber ? (InputNumber) uiComponentConfig2 : null;
            bs.d.d(textInputLayout5, message6, (inputNumber == null || (styles = inputNumber.getStyles()) == null) ? null : styles.getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit17 = Unit.f21506a;
            return;
        }
        if (component instanceof InputCurrencyComponent) {
            g2 g2Var12 = map2.get(component.getName());
            UiComponentError uiComponentErrorA12 = g2Var12 != null ? g2Var12.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA12 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA12 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError10 = (UiComponentError.UiInputComponentError) uiComponentErrorA12;
            Intrinsics.d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            bs.d.d((TextInputLayout) view, uiInputComponentError10 != null ? uiInputComponentError10.getMessage() : null, ((InputCurrencyComponent) component).getErrorTextStyle());
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit18 = Unit.f21506a;
            return;
        }
        if (component instanceof InputCheckboxComponent) {
            Object tag7 = view.getTag();
            Intrinsics.d(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
            ur.i iVar = (ur.i) tag7;
            g2 g2Var13 = map2.get(component.getName());
            UiComponentError uiComponentErrorA13 = g2Var13 != null ? g2Var13.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError11 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorA13 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorA13);
            if (uiInputComponentError11 != null) {
                iVar.f33896d.setText(uiInputComponentError11.getMessage());
                iVar.f33896d.setVisibility(0);
            } else {
                iVar.f33896d.setText(BuildConfig.FLAVOR);
                iVar.f33896d.setVisibility(8);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit19 = Unit.f21506a;
            return;
        }
        if (component instanceof InputCheckboxGroupComponent) {
            Object tag8 = view.getTag();
            Intrinsics.d(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
            ur.j jVar = (ur.j) tag8;
            g2 g2Var14 = map2.get(component.getName());
            UiComponentError uiComponentErrorA14 = g2Var14 != null ? g2Var14.a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError12 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorA14 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorA14);
            if (uiInputComponentError12 != null) {
                jVar.f33899c.setText(uiInputComponentError12.getMessage());
                jVar.f33899c.setVisibility(0);
            } else {
                jVar.f33899c.setText(BuildConfig.FLAVOR);
                jVar.f33899c.setVisibility(8);
            }
            c0(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById2 = view.findViewById(or.f.f28445r);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            Iterator<View> it4 = androidx.core.view.u0.a((ViewGroup) viewFindViewById2).iterator();
            while (it4.hasNext()) {
                d0(it4.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit20 = Unit.f21506a;
            return;
        }
        if (component instanceof ESignatureComponent) {
            Object tag9 = view.getTag();
            Intrinsics.d(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            ur.w wVar = (ur.w) tag9;
            ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
            UiComponentConfig uiComponentConfig3 = componentNameToConfig.get(eSignatureComponent.getName());
            Intrinsics.d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
            final ESignature eSignature = (ESignature) uiComponentConfig3;
            g2 g2Var15 = map2.get(component.getName());
            UiComponentError uiComponentErrorA15 = g2Var15 != null ? g2Var15.a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorA15 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorA15 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError13 = (UiComponentError.UiInputComponentError) uiComponentErrorA15;
            if (uiInputComponentError13 != null) {
                wVar.f33934d.setText(uiInputComponentError13.getMessage());
                wVar.f33934d.setVisibility(0);
            } else {
                wVar.f33934d.setText(BuildConfig.FLAVOR);
                wVar.f33934d.setVisibility(8);
            }
            ESignature.Attributes attributes2 = eSignature.getAttributes();
            if ((attributes2 != null ? attributes2.getLabel() : null) != null) {
                TextView textView = wVar.f33935e;
                ESignature.Attributes attributes3 = eSignature.getAttributes();
                textView.setText(attributes3 != null ? attributes3.getLabel() : null);
                wVar.f33935e.setVisibility(0);
            } else {
                wVar.f33935e.setText(BuildConfig.FLAVOR);
                wVar.f33935e.setVisibility(8);
            }
            Bitmap bitmapB = eSignatureComponent.getBitmapController().b();
            if (bitmapB == null) {
                Object tag10 = view.getTag();
                Intrinsics.d(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag10).b.setVisibility(0);
                Object tag11 = view.getTag();
                Intrinsics.d(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                TextView textView2 = ((ur.w) tag11).b;
                ESignature.Attributes attributes4 = eSignature.getAttributes();
                if (attributes4 == null || (placeholder = attributes4.getPlaceholder()) == null) {
                    placeholder = "+ Add signature";
                }
                textView2.setText(placeholder);
                Object tag12 = view.getTag();
                Intrinsics.d(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag12).f33937g.setVisibility(8);
                Object tag13 = view.getTag();
                Intrinsics.d(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag13).f33933c.setVisibility(8);
            } else {
                Object tag14 = view.getTag();
                Intrinsics.d(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag14).f33937g.setImageBitmap(bitmapB);
                Object tag15 = view.getTag();
                Intrinsics.d(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag15).b.setVisibility(8);
                Object tag16 = view.getTag();
                Intrinsics.d(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag16).f33937g.setVisibility(0);
                Object tag17 = view.getTag();
                Intrinsics.d(tag17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((ur.w) tag17).f33933c.setVisibility(0);
            }
            wVar.f33936f.setOnClickListener(new View.OnClickListener() { // from class: es.z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    h4.g1(this.f14670a, component, eSignature, rendering, viewEnvironment, view4);
                }
            });
            e0(view, componentParams, component);
            View signatureContainer = wVar.f33936f;
            Intrinsics.checkNotNullExpressionValue(signatureContainer, "signatureContainer");
            d0(signatureContainer, componentParams, component, rendering.getIsLoading());
            Unit unit21 = Unit.f21506a;
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            Object tag18 = view.getTag();
            Intrinsics.d(tag18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
            qr.f0 f0Var = (qr.f0) tag18;
            ButtonWithLoadingIndicator buttonWithLoadingIndicatorF = f0Var.getLaunchButton();
            buttonWithLoadingIndicatorF.setIsLoading(rendering.getIsLoading() && ((GovernmentIdNfcScanComponent) component).getWasTapped());
            c0(buttonWithLoadingIndicatorF, componentParams, component, rendering.getIsLoading());
            buttonWithLoadingIndicatorF.setOnClickListener(new View.OnClickListener() { // from class: es.a3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    h4.i1(this.f14143a, component, view4);
                }
            });
            View viewG = f0Var.getTipsButton();
            if (viewG != null) {
                viewG.setOnClickListener(new View.OnClickListener() { // from class: es.b3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        h4.j1(rendering, this, view4);
                    }
                });
                Unit unit22 = Unit.f21506a;
            }
            g2 g2Var16 = map2.get(component.getName());
            UiComponentError uiComponentErrorA16 = g2Var16 != null ? g2Var16.a(component.getLastValueUpdateTs()) : null;
            if (uiComponentErrorA16 == null) {
                uiComponentErrorA16 = null;
            }
            if (uiComponentErrorA16 instanceof UiComponentError.UiInputComponentError) {
                TextView textViewD = f0Var.getErrorLabel();
                textViewD.setText(((UiComponentError.UiInputComponentError) uiComponentErrorA16).getMessage());
                textViewD.setVisibility(0);
                return;
            }
            if (!(uiComponentErrorA16 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError)) {
                f0Var.getErrorLabel().setVisibility(8);
                Unit unit23 = Unit.f21506a;
                return;
            }
            TextInputLayout textInputLayoutA = f0Var.getCardAccessNumber();
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentErrorA16;
            String str = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScanComponent.getConfig().getStyles();
            bs.d.d(textInputLayoutA, str, (styles5 == null || (cardAccessNumberStyle = styles5.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
            TextInputLayout textInputLayoutC = f0Var.getDocumentNumber();
            String str2 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = governmentIdNfcScanComponent.getConfig().getStyles();
            bs.d.d(textInputLayoutC, str2, (styles6 == null || (documentNumberStyle = styles6.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
            f0Var.getDateOfBirthBinding().f33885e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
            f0Var.getDateOfBirthBinding().f33885e.setVisibility(0);
            f0Var.getExpirationDateBinding().f33885e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
            f0Var.getExpirationDateBinding().f33885e.setVisibility(0);
            Unit unit24 = Unit.f21506a;
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            Object tag19 = view.getTag();
            Intrinsics.d(tag19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanViewHolder");
            qr.r2 r2Var = (qr.r2) tag19;
            ButtonWithLoadingIndicator buttonWithLoadingIndicatorB = r2Var.getScanButton();
            buttonWithLoadingIndicatorB.setIsLoading(rendering.getIsLoading() && ((JpMyNumberNfcScanComponent) component).getWasTapped());
            c0(buttonWithLoadingIndicatorB, componentParams, component, rendering.getIsLoading());
            if (((JpMyNumberNfcScanComponent) component).getValidOperation() == null) {
                buttonWithLoadingIndicatorB.setEnabled(false);
            } else {
                buttonWithLoadingIndicatorB.setOnClickListener(new View.OnClickListener() { // from class: es.c3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        h4.k1(this.f14167a, component, view4);
                    }
                });
            }
            g2 g2Var17 = map2.get(component.getName());
            UiComponentError uiComponentErrorA17 = g2Var17 != null ? g2Var17.a(component.getLastValueUpdateTs()) : null;
            UiComponentError uiComponentError = uiComponentErrorA17 == null ? null : uiComponentErrorA17;
            if (!(uiComponentError instanceof UiComponentError.UiInputComponentError)) {
                r2Var.getErrorLabel().setVisibility(8);
                Unit unit25 = Unit.f21506a;
                return;
            } else {
                TextView textViewA = r2Var.getErrorLabel();
                textViewA.setText(((UiComponentError.UiInputComponentError) uiComponentError).getMessage());
                textViewA.setVisibility(0);
                return;
            }
        }
        if ((component instanceof CreatePersonaSheetComponent) || (component instanceof ImagePreviewComponent) || (component instanceof LocalImageComponent) || (component instanceof PrivacyPolicyComponent) || (component instanceof QRCodeComponent) || (component instanceof RemoteImageComponent) || (component instanceof SpacerComponent) || (component instanceof TextComponent) || (component instanceof TitleComponent) || (component instanceof BrandingComponent)) {
            c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit26 = Unit.f21506a;
            return;
        }
        if (!(component instanceof InputFileUploadComponent)) {
            if (component instanceof PhoneNumberSnaComponent) {
                Unit unit27 = Unit.f21506a;
                return;
            } else {
                if (!(component instanceof qr.g0)) {
                    throw new zt.l();
                }
                Unit unit28 = Unit.f21506a;
                return;
            }
        }
        Object tag20 = view.getTag();
        Intrinsics.d(tag20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding");
        ur.k kVar = (ur.k) tag20;
        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
        UiComponentConfig uiComponentConfig4 = componentNameToConfig.get(inputFileUploadComponent.getName());
        InputFileUpload inputFileUpload = uiComponentConfig4 instanceof InputFileUpload ? (InputFileUpload) uiComponentConfig4 : null;
        if (!inputFileUploadComponent.k().isEmpty()) {
            kVar.f33902c.setText(CollectionsKt.m0(inputFileUploadComponent.k(), ", ", null, null, 0, null, new Function1() { // from class: es.d3
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h4.l1((SelectedFile) obj);
                }
            }, 30, null));
            kVar.f33902c.setVisibility(0);
        } else if (inputFileUploadComponent.getHasPrefill()) {
            if (inputFileUpload == null || (attributes = inputFileUpload.getAttributes()) == null || (prefill = attributes.getPrefill()) == null) {
                arrayList = null;
            } else {
                List<InputFileUpload.PrefillItem> list3 = prefill;
                ArrayList arrayList3 = new ArrayList(p001kotlin.collections.q.u(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((InputFileUpload.PrefillItem) it5.next()).getFilename());
                }
                arrayList = arrayList3;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                kVar.f33902c.setText(jq.g.f20885o);
                kVar.f33902c.setVisibility(0);
            } else {
                kVar.f33902c.setText(CollectionsKt.m0(arrayList, ", ", null, null, 0, null, null, 62, null));
                kVar.f33902c.setVisibility(0);
            }
        } else {
            kVar.f33902c.setText(jq.g.f20885o);
            kVar.f33902c.setVisibility(0);
        }
        g2 g2Var18 = map2.get(component.getName());
        UiComponentError uiComponentErrorA18 = g2Var18 != null ? g2Var18.a(component.getLastValueUpdateTs()) : null;
        UiComponentError.UiInputComponentError uiInputComponentError14 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorA18 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorA18);
        if (uiInputComponentError14 != null) {
            kVar.f33903d.setText(uiInputComponentError14.getMessage());
            kVar.f33903d.setVisibility(0);
        } else {
            kVar.f33903d.setText(BuildConfig.FLAVOR);
            kVar.f33903d.setVisibility(8);
        }
        c0(view, componentParams, component, rendering.getIsLoading());
        Unit unit29 = Unit.f21506a;
    }

    public final void c0(View view, Map<String, ? extends Object> map, qr.x5 x5Var, boolean z10) {
        e0(view, map, x5Var);
        d0(view, map, x5Var, z10);
    }

    public final void d0(View view, Map<String, ? extends Object> map, qr.x5 x5Var, boolean z10) {
        Boolean value;
        if (x5Var instanceof qr.w) {
            JsonLogicBoolean disabled = ((qr.w) x5Var).getDisabled();
            boolean z11 = false;
            boolean zBooleanValue = (disabled == null || (value = disabled.getValue(map, map.get(x5Var.getName()), i0())) == null) ? false : value.booleanValue();
            if (!z10 && !zBooleanValue) {
                z11 = true;
            }
            view.setEnabled(z11);
            view.requestLayout();
        }
    }

    public final void e0(View view, Map<String, ? extends Object> map, qr.x5 x5Var) {
        Boolean value;
        if (x5Var instanceof qr.h0) {
            qr.h0 h0Var = (qr.h0) x5Var;
            JsonLogicBoolean hidden = h0Var.getHidden();
            boolean z10 = ((hidden == null || (value = hidden.getValue(map, map.get(x5Var.getName()), i0())) == null) ? false : value.booleanValue()) || ((x5Var instanceof TitleComponent) && ((TitleComponent) x5Var).getIsTextBlank());
            view.setVisibility(z10 ? 8 : 0);
            Iterator<T> it = h0Var.i().iterator();
            while (it.hasNext()) {
                ((bs.a) it.next()).a(map, z10, i0());
            }
        }
    }

    public final void f0(List<? extends qr.x5> components, Map<String, ? extends Object> componentParams, boolean isLoading) {
        for (qr.x5 x5Var : components) {
            View view = this.componentNameToView.get(x5Var.getName());
            if (view != null) {
                c0(view, componentParams, x5Var, isLoading);
                if (x5Var instanceof qr.y5) {
                    f0(((qr.y5) x5Var).getChildren(), componentParams, isLoading);
                }
            }
        }
    }

    public final void g0(or.j result, List<? extends qr.x5> components) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof FooterComponent) {
                arrayList.add(obj);
            }
        }
        FooterComponent a0Var = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        if (a0Var == null) {
            return;
        }
        Integer numG = a0Var.getFirstBelowTheFoldChildIndex();
        if (numG != null) {
            u0(result, numG.intValue(), a0Var);
        } else {
            this.binding.f16576c.addView(result.getFooterView());
        }
    }

    public final Map<String, ComponentParam> h0(List<ComponentView> components) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> mapJ = p001kotlin.collections.k0.j();
        int i10 = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            p0(mapJ, linkedHashMap, components);
            Map<String, ? extends Object> mapG0 = G0(linkedHashMap);
            if (Intrinsics.c(mapJ, mapG0) || i10 >= 20) {
                break;
            }
            i10++;
            mapJ = mapG0;
        }
        return linkedHashMap;
    }

    public final Map<String, Object> i0() {
        return p001kotlin.collections.j0.g(zt.s.a("scrolled_to_bottom_of_screen", Boolean.valueOf(this.hasScrolledToBottom)));
    }

    public final void o1(final s6.d.a rendering, ViewEnvironment viewEnvironment, final qr.g5 component, Map<String, ? extends Object> componentParams, Map<String, g2> errors) {
        or.k viewBindings;
        Map<String, ComponentView> mapA;
        if (!(component instanceof CreatePersonaSheetComponent)) {
            throw new zt.l();
        }
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) component).getCtaCard().getComponentNameMapping();
        List<Pair<String, Function1<qr.x5, Unit>>> listB = new or.c.a().a(componentNameMapping != null ? componentNameMapping.getStartButton() : null, new Function1() { // from class: es.p2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.p1(rendering, component, (qr.x5) obj);
            }
        }).a(componentNameMapping != null ? componentNameMapping.getDismissButton() : null, new Function1() { // from class: es.q2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h4.q1(this.f14420a, (qr.x5) obj);
            }
        }).b();
        or.j jVarE = this.nestedUiBottomSheetController.e();
        if (jVarE == null || (viewBindings = jVarE.getViewBindings()) == null || (mapA = viewBindings.a()) == null) {
            return;
        }
        for (Map.Entry<String, ComponentView> entry : mapA.entrySet()) {
            H0(rendering, entry.getValue().c(), entry.getValue().d(), componentParams, errors, viewEnvironment, this.componentNameToConfig);
        }
        for (Pair<String, Function1<qr.x5, Unit>> pair : listB) {
            String strC = pair.c();
            final Function1<qr.x5, Unit> function1D = pair.d();
            final ComponentView componentView = mapA.get(strC);
            if (componentView != null) {
                componentView.d().setOnClickListener(new View.OnClickListener() { // from class: es.r2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        h4.r1(function1D, componentView, view);
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(Map<String, ? extends Object> initialComponentValues, Map<String, ComponentParam> outMap, List<ComponentView> componentViews) {
        File fileA;
        byte[] bArrG;
        File fileA2;
        byte[] bArrG2;
        File fileA3;
        byte[] bArrG3;
        Map<String, String> mapG;
        Boolean value;
        for (ComponentView componentView : componentViews) {
            qr.x5 component = componentView.getComponent();
            componentView.getView();
            linkedHashMap = null;
            LinkedHashMap linkedHashMap = null;
            strEncodeToString = null;
            strEncodeToString = null;
            String strEncodeToString = null;
            qr.h0 h0Var = component instanceof qr.h0 ? (qr.h0) component : null;
            JsonLogicBoolean hidden = h0Var != null ? h0Var.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(initialComponentValues, initialComponentValues.get(component.getName()), i0())) == null) ? false : value.booleanValue())) {
                if (component instanceof InputTextComponent) {
                    InputTextComponent inputTextComponent = (InputTextComponent) component;
                    outMap.put(inputTextComponent.getName(), E0(inputTextComponent.getTextController().b()));
                } else if (component instanceof InputTextAreaComponent) {
                    InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) component;
                    outMap.put(inputTextAreaComponent.getName(), E0(inputTextAreaComponent.getTextController().b()));
                } else if (component instanceof InputPhoneNumberComponent) {
                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                    String strH = sr.f.f31881a.h((Option) CollectionsKt.d0(inputPhoneNumberComponent.getCountryCodeOptionsController().b()));
                    outMap.put(inputPhoneNumberComponent.getName(), E0(strH + " " + inputPhoneNumberComponent.getTextController().b()));
                } else if (component instanceof InputConfirmationCodeComponent) {
                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) component;
                    outMap.put(inputConfirmationCodeComponent.getName(), E0(inputConfirmationCodeComponent.getTextController().b()));
                } else if (component instanceof InputDateComponent) {
                    InputDateComponent inputDateComponent = (InputDateComponent) component;
                    outMap.put(inputDateComponent.getName(), E0(inputDateComponent.getDateController().f()));
                } else if (component instanceof InputInternationalDbComponent) {
                    InputInternationalDbComponent bVar = (InputInternationalDbComponent) component;
                    outMap.put(bVar.getName(), new ComponentParam.i(bVar.getSelectedCountry(), bVar.getSelectedIdType(), bVar.getIdValue()));
                } else if (component instanceof InputMaskedTextComponent) {
                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) component;
                    outMap.put(inputMaskedTextComponent.getName(), E0(inputMaskedTextComponent.getTextController().b()));
                } else if (component instanceof InputSelectComponent) {
                    InputSelectComponent eVar = (InputSelectComponent) component;
                    if (!eVar.l().isEmpty()) {
                        outMap.put(eVar.getName(), E0(((Option) CollectionsKt.d0(eVar.l())).getValue()));
                    }
                } else if (component instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent dVar = (InputMultiSelectComponent) component;
                    if (!dVar.l().isEmpty()) {
                        String name = dVar.getName();
                        List<Option> listL = dVar.l();
                        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listL, 10));
                        Iterator<T> it = listL.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Option) it.next()).getValue());
                        }
                        outMap.put(name, F0(arrayList));
                    }
                } else if (component instanceof InputAddressComponent) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                    outMap.put(inputAddressComponent.getName(), new ComponentParam.a(inputAddressComponent.getTextControllerForAddressStreet1().b(), inputAddressComponent.getTextControllerForAddressStreet2().b(), inputAddressComponent.getTextControllerForAddressCity().b(), inputAddressComponent.getTextControllerForAddressSubdivision().b(), inputAddressComponent.getTextControllerForAddressPostalCode().b()));
                } else if (component instanceof qr.y5) {
                    List<qr.x5> children = ((qr.y5) component).getChildren();
                    ArrayList arrayList2 = new ArrayList();
                    for (qr.x5 x5Var : children) {
                        View view = this.componentNameToView.get(x5Var.getName());
                        ComponentView componentView2 = view == null ? null : new ComponentView(x5Var, view);
                        if (componentView2 != null) {
                            arrayList2.add(componentView2);
                        }
                    }
                    p0(initialComponentValues, outMap, arrayList2);
                } else if (component instanceof InputCheckboxComponent) {
                    InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) component;
                    outMap.put(inputCheckboxComponent.getName(), new ComponentParam.b(inputCheckboxComponent.getTwoStateViewController().b()));
                } else if (component instanceof InputCheckboxGroupComponent) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) component;
                    outMap.put(inputCheckboxGroupComponent.getName(), F0(CollectionsKt.M0(inputCheckboxGroupComponent.k())));
                } else if (component instanceof InputRadioGroupComponent) {
                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) component;
                    outMap.put(inputRadioGroupComponent.getName(), new ComponentParam.d(inputRadioGroupComponent.getTextController().b()));
                } else if (component instanceof InputNumberComponent) {
                    InputNumberComponent inputNumberComponent = (InputNumberComponent) component;
                    Number numberB = inputNumberComponent.getNumberController().b();
                    if (numberB != null) {
                        outMap.put(inputNumberComponent.getName(), D0(numberB));
                    }
                } else if (component instanceof InputCurrencyComponent) {
                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) component;
                    Number numberB2 = inputCurrencyComponent.getNumberController().b();
                    if (numberB2 != null) {
                        outMap.put(inputCurrencyComponent.getName(), D0(numberB2));
                    }
                } else if (component instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                    Bitmap bitmapB = eSignatureComponent.getBitmapController().b();
                    outMap.put(eSignatureComponent.getName(), new ComponentParam.f(bitmapB != null ? sr.h.g(bitmapB) : null));
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                    GovernmentIdNfcData governmentIdNfcDataB = governmentIdNfcScanComponent.getNfcDataController().b();
                    if (governmentIdNfcDataB != null) {
                        Uri dg1Uri = governmentIdNfcDataB.getDg1Uri();
                        String strEncodeToString2 = (dg1Uri == null || (fileA3 = t2.c.a(dg1Uri)) == null || (bArrG3 = lu.i.g(fileA3)) == null) ? null : Base64.encodeToString(bArrG3, 0);
                        Uri dg2Uri = governmentIdNfcDataB.getDg2Uri();
                        String strEncodeToString3 = (dg2Uri == null || (fileA2 = t2.c.a(dg2Uri)) == null || (bArrG2 = lu.i.g(fileA2)) == null) ? null : Base64.encodeToString(bArrG2, 0);
                        Uri sodUri = governmentIdNfcDataB.getSodUri();
                        if (sodUri != null && (fileA = t2.c.a(sodUri)) != null && (bArrG = lu.i.g(fileA)) != null) {
                            strEncodeToString = Base64.encodeToString(bArrG, 0);
                        }
                        outMap.put(governmentIdNfcScanComponent.getName(), new ComponentParam.h(strEncodeToString2, strEncodeToString3, strEncodeToString, governmentIdNfcDataB.getChipAuthenticationStatus()));
                    }
                } else if (component instanceof JpMyNumberNfcScanComponent) {
                    JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
                    zp.o oVarB = jpMyNumberNfcScanComponent.getScanResultController().b();
                    if (oVarB != null && (mapG = oVarB.g()) != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : mapG.entrySet()) {
                            if ((entry.getValue().length() > 0) != false) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (!(linkedHashMap == null || linkedHashMap.isEmpty())) {
                        outMap.put(jpMyNumberNfcScanComponent.getName(), new ComponentParam.j(linkedHashMap));
                    }
                } else if (component instanceof MdocComponent) {
                    MdocComponent fVar = (MdocComponent) component;
                    String strB = fVar.getMdocDataController().b();
                    if (!StringsKt.p0(strB)) {
                        outMap.put(fVar.getName(), E0(strB));
                    }
                } else if (component instanceof InputFileUploadComponent) {
                    InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
                    String name2 = inputFileUploadComponent.getName();
                    List<SelectedFile> listK = inputFileUploadComponent.k();
                    ArrayList arrayList3 = new ArrayList(p001kotlin.collections.q.u(listK, 10));
                    Iterator<T> it2 = listK.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((SelectedFile) it2.next()).getUri());
                    }
                    outMap.put(name2, new ComponentParam.g(arrayList3, inputFileUploadComponent.getHasPrefill()));
                } else if (!(component instanceof ActionButtonComponent) && !(component instanceof CancelButtonComponent) && !(component instanceof CombinedStepButtonComponent) && !(component instanceof CompleteButtonComponent) && !(component instanceof LinkButtonComponent) && !(component instanceof SubmitButtonComponent) && !(component instanceof ImagePreviewComponent) && !(component instanceof LocalImageComponent) && !(component instanceof PrivacyPolicyComponent) && !(component instanceof QRCodeComponent) && !(component instanceof RemoteImageComponent) && !(component instanceof SpacerComponent) && !(component instanceof TextComponent) && !(component instanceof TitleComponent) && !(component instanceof BrandingComponent) && !(component instanceof CreatePersonaSheetComponent) && !(component instanceof qr.d6) && !(component instanceof qr.g0) && !(component instanceof PhoneNumberSnaComponent)) {
                    throw new zt.l();
                }
            }
        }
    }

    public final void q0(s6.d.a rendering) {
        List<qr.x5> listF = rendering.f();
        ArrayList arrayList = new ArrayList();
        for (qr.x5 x5Var : listF) {
            View view = this.componentNameToView.get(x5Var.getName());
            ComponentView componentView = view == null ? null : new ComponentView(x5Var, view);
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        f0(rendering.f(), G0(h0(arrayList)), rendering.getIsLoading());
    }

    public final void r0(s6.d.a rendering, final ClickableStackComponent component, final ConstraintLayout view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: es.v3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h4.s0(component, this, view, view2);
            }
        });
        if (component.getIsActive()) {
            yr.r.a(view, component.getStyles());
        } else if (rendering.getIsLoading()) {
            yr.r.d(view, component.getStyles());
        }
    }

    public final void t0(s6.d.a rendering, ViewEnvironment viewEnvironment, Map<String, ? extends Object> componentParams, Map<String, g2> errors) {
        Object obj;
        List<qr.x5> listF = rendering.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listF) {
            if (obj2 instanceof qr.g5) {
                arrayList.add(obj2);
            }
        }
        qr.g5 g5VarD = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        int i10 = 0;
        if (g5VarD != null) {
            int size = arrayList.size();
            int i11 = 0;
            do {
                if (i11 >= size) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList.get(i11);
                    i11++;
                }
            } while (!Intrinsics.c(((qr.g5) obj).getName(), g5VarD.getName()));
            qr.g5 g5Var = (qr.g5) obj;
            if (g5Var != null && !g5Var.getShowing()) {
                this.nestedUiBottomSheetController.f();
            }
        }
        if (this.nestedUiBottomSheetController.getCurrentSheetComponent() == null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj3 = arrayList.get(i10);
                i10++;
                qr.g5 g5Var2 = (qr.g5) obj3;
                if (!g5Var2.getShown()) {
                    g5Var2.s2(true);
                    this.nestedUiBottomSheetController.g(g5Var2, viewEnvironment);
                    break;
                }
            }
        }
        qr.g5 g5VarD2 = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (g5VarD2 != null) {
            o1(rendering, viewEnvironment, g5VarD2, componentParams, errors);
        }
    }

    public final void u0(or.j result, int firstBelowTheFoldChildIndex, FooterComponent footerComponent) {
        this.binding.f16577d.setVisibility(0);
        this.binding.f16579f.setVisibility(0);
        View footerView = result.getFooterView();
        Drawable background = footerView != null ? footerView.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        Drawable background2 = this.binding.f16581h.getBackground();
        LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(w1.f14586k) : null;
        GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        this.binding.f16578e.addView(result.getFooterView());
        qr.x5 x5Var = (qr.x5) CollectionsKt.f0(footerComponent.getChildren(), firstBelowTheFoldChildIndex);
        final View view = this.componentNameToView.get(x5Var != null ? x5Var.getName() : null);
        final BottomSheetBehavior bottomSheetBehaviorQ0 = BottomSheetBehavior.q0(this.binding.f16581h);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorQ0, "from(...)");
        this.binding.f16583j.setVerticalFadingEdgeEnabled(false);
        if (view != null) {
            this.binding.f16580g.setVisibility(0);
            this.binding.f16578e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: es.o3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    h4.v0(this.f14395a, view, bottomSheetBehaviorQ0, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        } else {
            this.binding.f16580g.setVisibility(4);
            this.binding.f16578e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: es.p3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    h4.w0(this.f14410a, bottomSheetBehaviorQ0, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        bottomSheetBehaviorQ0.c0(new b(bottomSheetBehaviorQ0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nn.k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull final s6.d.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        int iD;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        List<qr.x5> listF = rendering.f();
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            qr.x5 x5Var = (qr.x5) it.next();
            View view = this.componentNameToView.get(x5Var.getName());
            Object componentView = view != null ? new ComponentView(x5Var, view) : null;
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        Map<String, ComponentParam> mapH0 = h0(arrayList);
        Map<String, Object> mapG0 = G0(mapH0);
        List<g2> listE = rendering.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(listE, 10)), 16));
        for (Object obj : listE) {
            linkedHashMap.put(((g2) obj).getName(), obj);
        }
        Integer numC = rendering.c();
        if (numC == null || numC.intValue() == 0) {
            Intrinsics.checkNotNull(context);
            iD = xq.z.d(context, R.attr.colorBackground, null, false, 6, null);
        } else {
            iD = numC.intValue();
        }
        Intrinsics.checkNotNull(context);
        jr.c.b(viewEnvironment, context, iD);
        this.launchNfcScan = rendering.l();
        this.launchJpMyNumberNfcScan = rendering.k();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ComponentView componentView2 = (ComponentView) arrayList.get(i10);
            H0(rendering, componentView2.getComponent(), componentView2.getView(), mapG0, linkedHashMap, viewEnvironment, this.componentNameToConfig);
        }
        ir.a aVarO = rendering.getNavigationState();
        Pi2NavigationBar navigationBar = this.binding.f16582i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutB = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB, "getRoot(...)");
        String str = this.navBarTitle;
        StepStyles.UiStepStyle uiStepStyleA = rendering.getStyles();
        Rect rectH = uiStepStyleA != null ? sr.h.h(uiStepStyleA) : null;
        StepStyles.UiStepStyle uiStepStyleA2 = rendering.getStyles();
        xr.c.d(aVarO, new Function0() { // from class: es.f4
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h4.y0(this.f14206a, rendering);
            }
        }, new Function0() { // from class: es.l2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h4.z0(rendering);
            }
        }, new Function0() { // from class: es.m2
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h4.A0(rendering, this);
            }
        }, navigationBar, coordinatorLayoutB, rectH, str, uiStepStyleA2 != null ? uiStepStyleA2.getNavBarTitleStyleValue() : null);
        CoordinatorLayout coordinatorLayoutB2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutB2, "getRoot(...)");
        xq.g0.b(coordinatorLayoutB2, rendering.getError(), rendering.u(), null, 0, 0, 56, null);
        this.onComplete = rendering.s();
        this.onCancel = rendering.q();
        this.onClick = new Function2() { // from class: es.n2
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return h4.B0(rendering, this, arrayList, (qr.x5) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: es.o2
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return h4.C0(rendering, this, arrayList, (qr.d6) obj2);
            }
        };
        s6.d.a.AutoSubmit c0280aB = rendering.getAutoSubmit();
        if (c0280aB != null) {
            if (c0280aB.getIsReadyToSubmit()) {
                qr.d dVarA = c0280aB.getComponent();
                if ((dVarA instanceof ActionButtonComponent) || (dVarA instanceof SubmitButtonComponent)) {
                    Function2<? super qr.x5, ? super Boolean, Unit> function2 = this.onClick;
                    View view2 = this.componentNameToView.get(((qr.i) dVarA).getName());
                    if (view2 != null && view2.getVisibility() == 0) {
                        z10 = true;
                    }
                    function2.invoke(dVarA, Boolean.valueOf(z10));
                } else if (dVarA instanceof CancelButtonComponent) {
                    this.onCancel.invoke();
                } else if (dVarA instanceof CompleteButtonComponent) {
                    this.onComplete.invoke();
                } else if (dVarA instanceof PhoneNumberSnaComponent) {
                    PhoneNumberSnaComponent m4Var = (PhoneNumberSnaComponent) dVarA;
                    rendering.r().invoke(dVarA, Boolean.FALSE, p001kotlin.collections.j0.g(new Pair(m4Var.getName(), new ComponentParam.k(m4Var.getCode(), m4Var.getErrorName(), m4Var.getErrorMessage()))));
                }
            } else if (c0280aB.getCountdownText() != null) {
                View view3 = this.componentNameToView.get(c0280aB.getComponent().getName());
                if (view3 instanceof ButtonWithLoadingIndicator) {
                    ((ButtonWithLoadingIndicator) view3).setText(c0280aB.getCountdownText());
                } else if (view3 instanceof MaterialButton) {
                    ((MaterialButton) view3).setText(c0280aB.getCountdownText());
                }
            }
        }
        t0(rendering, viewEnvironment, mapH0, linkedHashMap);
        if (!rendering.getShouldLaunchHelpBottomSheet() || rendering.getHelpBottomSheetViewModel() == null) {
            return;
        }
        this.helpBottomSheetController.x(rendering.getStyles(), rendering.getHelpBottomSheetViewModel(), rendering.v(), rendering.j(), rendering.m());
    }
}
