package com.withpersona.sdk2.inquiry.p057ui;

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
import androidx.constraintlayout.widget.C0518c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.C0637u0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.p616lifecycle.AbstractC0968m;
import androidx.p616lifecycle.C0982t;
import ar.C1149d;
import ar.C1152g;
import ar.C1153h;
import ar.C1164s;
import ar.ComponentView;
import br.C1487a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcScanResult;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputAddress;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputFileUpload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.InputNumber;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.p057ui.C4154g;
import com.withpersona.sdk2.inquiry.p057ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.p057ui.network.C4177a;
import com.withpersona.sdk2.inquiry.p057ui.network.ComponentParam;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ActionButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.AutoSubmitableComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.BrandingComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4085a;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CancelButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ClickableStackComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CombinedStepButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CompleteButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ESignatureComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.FooterComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.HelpBottomSheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.ImagePreviewComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCheckboxGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputConfirmationCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputCurrencyComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputDateComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputFileUploadComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputInternationalDbComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMaskedTextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputMultiSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputPhoneNumberComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputRadioGroupComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputSelectComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextAreaComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.InputTextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.LinkButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.LocalImageComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.MdocComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PhoneNumberSnaComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.PrivacyPolicyComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.QRCodeComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.RemoteImageComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SelectedFile;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SheetComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SpacerComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.SubmitButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.TextComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.TitleComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponentGroup;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.VerifyPersonaButtonComponent;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.utils.GovernmentIdNfcData;
import com.withpersona.sdk2.inquiry.steps.p056ui.mdoc.MdocRequestMetadata;
import com.withpersona.sdk2.inquiry.steps.p056ui.network.Suggestion;
import com.withpersona.sdk2.inquiry.steps.p056ui.view.ShadowedNestedScrollView;
import cr.C4236f2;
import cr.C4295p1;
import cr.C4333v3;
import cr.C4335w;
import cr.InterfaceC4287o;
import cr.InterfaceC4337w1;
import cr.InterfaceC4339w3;
import cr.InterfaceC4341x;
import er.C5197f;
import er.C5199h;
import fr.C5821a;
import gr.C6216d;
import gr.C6218f;
import gr.C6221i;
import gr.C6222j;
import gr.C6223k;
import gr.C6225m;
import gr.C6226n;
import gr.C6229q;
import gr.C6235w;
import hr.C6555j;
import hu.InterfaceC6567c;
import ir.C6966c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.text.StringsKt;
import lr.C8243c;
import mr.C8652d;
import mr.InterfaceC8649a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0372e0;
import p016an.C0373f;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p084dr.C4674n;
import p092e3.C4770k0;
import p092e3.C4772l0;
import p092e3.C4776n0;
import p092e3.InterfaceC4777o;
import p117f3.AbstractC5340n;
import p203j.ActivityC6992b;
import p226jq.C7259g;
import p226jq.C7260g0;
import p226jq.C7288z;
import p227jr.C7312p;
import p227jr.C7314r;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p342or.C9849a2;
import p342or.C9943m1;
import p342or.C9971q1;
import p342or.C9978r1;
import p344ot.C10047c;
import p439t2.C11473c;
import p477ut.C11964i;
import p497vp.C12244g;
import p498vq.C12249c;
import p526wq.C12524g;
import p615zt.InterfaceC14058o;
import pr.C10317a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u0086\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0087\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJG\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015JO\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019Jk\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J9\u0010'\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J7\u0010)\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b-\u0010*J%\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0002¢\u0006\u0004\b0\u00101J'\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u0002082\u0006\u0010\u001c\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J)\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\b>\u0010?JE\u0010D\u001a\u00020\u000b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0A2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020<0#H\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010HJ\u0013\u0010K\u001a\u00020J*\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u00020M*\b\u0012\u0004\u0012\u00020\u000f0#H\u0002¢\u0006\u0004\bN\u0010OJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000eH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u001c\u0010s\u001a\b\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR(\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\"\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010{R%\u0010\u0082\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010{R#\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0088\u0001"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "Lpr/a;", "binding", "initialRendering", "<init>", "(Lpr/a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V", "rendering", "Lan/y;", "viewEnvironment", "", "x0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V", "", "", "", "componentParams", "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;", "errors", "t0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;", "component", "o1", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Landroid/view/View;", "view", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentNameToConfig", "H0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V", "q0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V", "", "components", "", "isLoading", "f0", "(Ljava/util/List;Ljava/util/Map;Z)V", "c0", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V", "e0", "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V", "d0", "Lar/g;", "result", "g0", "(Lar/g;Ljava/util/List;)V", "", "firstBelowTheFoldChildIndex", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;", "footerComponent", "u0", "(Lar/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "r0", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "Lar/a;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "h0", "(Ljava/util/List;)Ljava/util/Map;", "initialComponentValues", "", "outMap", "componentViews", "p0", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "E0", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "D0", "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "F0", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;", "G0", "(Ljava/util/Map;)Ljava/util/Map;", "b", "Lpr/a;", "c", "Ljava/util/Map;", "componentNameToView", "d", "e", "Ljava/lang/String;", "navBarTitle", "Lhr/j;", "f", "Lhr/j;", "inputSelectBottomSheetController", "Lor/a2;", "g", "Lor/a2;", "signatureBottomSheetController", "Lor/q1;", "h", "Lor/q1;", "nestedUiBottomSheetController", "Ldr/n;", "i", "Ldr/n;", "helpBottomSheetController", "j", "Z", "hasScrolledToBottom", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "onComplete", "l", "onCancel", "Lkotlin/Function2;", "m", "Lkotlin/jvm/functions/Function2;", "onClick", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "n", "Lkotlin/jvm/functions/Function1;", "launchNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "o", "launchJpMyNumberNfcScan", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;", "p", "onVerifyPersonaClick", "i0", "()Ljava/util/Map;", "uiStateValues", "q", "a", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@SuppressLint({"ResourceType"})
public final class C4154g implements InterfaceC0382k<UiWorkflow.AbstractC4142c.a> {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C10317a binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Map<String, View> componentNameToView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Map<String, UiComponentConfig> componentNameToConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String navBarTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C6555j inputSelectBottomSheetController;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C9849a2 signatureBottomSheetController;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final C9971q1 nestedUiBottomSheetController;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C4674n helpBottomSheetController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean hasScrolledToBottom;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> onComplete;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> onCancel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Function2<? super UiComponent, ? super Boolean, Unit> onClick;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public Function1<? super GovernmentIdNfcScanComponent, Unit> launchNfcScan;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public Function1<? super JpMyNumberNfcScanComponent, Unit> launchJpMyNumberNfcScan;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Function1<? super VerifyPersonaButtonComponent, Unit> onVerifyPersonaClick;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/ui/g$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "d", "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<UiWorkflow.AbstractC4142c.a> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0373f<UiWorkflow.AbstractC4142c.a> f17699a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14151a extends C7744k implements Function2<UiWorkflow.AbstractC4142c.a, ViewEnvironment, Unit> {
            public C14151a(Object obj) {
                super(2, obj, C4154g.class, "showRendering", "showRendering(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Screen$EntryScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            /* JADX INFO: renamed from: d */
            public final void m21494d(UiWorkflow.AbstractC4142c.a p8, ViewEnvironment p10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                Intrinsics.checkNotNullParameter(p10, "p1");
                ((C4154g) this.receiver).mo1442a(p8, p10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(UiWorkflow.AbstractC4142c.a aVar, ViewEnvironment viewEnvironment) {
                m21494d(aVar, viewEnvironment);
                return Unit.f29331a;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.ui.g.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static final View m21492c(UiWorkflow.AbstractC4142c.a initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
            Context context2;
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(context, "context");
            if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
                context2 = context;
            }
            C10317a c10317aM39623c = C10317a.m39623c(LayoutInflater.from(context2).cloneInContext(context));
            CoordinatorLayout coordinatorLayoutM39625b = c10317aM39623c.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b, "getRoot(...)");
            Intrinsics.checkNotNull(c10317aM39623c);
            C0372e0.m1408a(coordinatorLayoutM39625b, initialRendering, initialViewEnvironment, new C14151a(new C4154g(c10317aM39623c, initialRendering)));
            CoordinatorLayout coordinatorLayoutM39625b2 = c10317aM39623c.getRoot();
            Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b2, "let(...)");
            return coordinatorLayoutM39625b2;
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull UiWorkflow.AbstractC4142c.a initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f17699a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super UiWorkflow.AbstractC4142c.a> getType() {
            return this.f17699a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            this.f17699a = new C0373f<>(C7731d0.m32002b(UiWorkflow.AbstractC4142c.a.class), new InterfaceC14058o() { // from class: or.z3
                @Override // p615zt.InterfaceC14058o
                /* JADX INFO: renamed from: e */
                public final Object mo1397e(Object obj, Object obj2, Object obj3, Object obj4) {
                    return C4154g.Companion.m21492c((UiWorkflow.AbstractC4142c.a) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"com/withpersona/sdk2/inquiry/ui/g$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "ui_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends BottomSheetBehavior.AbstractC2756g {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BottomSheetBehavior<NestedScrollView> f17701b;

        public b(BottomSheetBehavior<NestedScrollView> bottomSheetBehavior) {
            this.f17701b = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            C4154g.this.binding.f37152j.setPadding(C4154g.this.binding.f37152j.getPaddingLeft(), C4154g.this.binding.f37152j.getPaddingTop(), C4154g.this.binding.f37152j.getPaddingRight(), this.f17701b.m12158u0() + ((int) (slideOffset * (C4154g.this.binding.f37150h.getHeight() - this.f17701b.m12158u0()))));
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.ui.UiScreenRunner$updateRendering$15$1$1", m39664f = "UiScreenRunner.kt", m39665l = {845}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f17702t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC4777o f17703u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ View f17704v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ MdocRequestMetadata f17705w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ UiComponent f17706x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC4777o interfaceC4777o, View view, MdocRequestMetadata mdocRequestMetadata, UiComponent uiComponent, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f17703u = interfaceC4777o;
            this.f17704v = view;
            this.f17705w = mdocRequestMetadata;
            this.f17706x = uiComponent;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f17703u, this.f17704v, this.f17705w, this.f17706x, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f17702t;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC4777o interfaceC4777o = this.f17703u;
                    Context context = this.f17704v.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    C4770k0 c4770k0 = new C4770k0(C7697o.m31878d(new C4776n0(((MdocRequestMetadata.GoogleWalletRequestMetadata) this.f17705w).getRequestJson())), null, false, null, false, 30, null);
                    this.f17702t = 1;
                    obj = interfaceC4777o.m23208b(context, c4770k0, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                String strM38763a = C9943m1.m38763a(((C4772l0) obj).getCredential());
                if (strM38763a != null) {
                    ((MdocComponent) this.f17706x).getMdocDataController().mo1451c(strM38763a);
                } else {
                    ((MdocComponent) this.f17706x).getErrorTextController().mo1451c(((MdocComponent) this.f17706x).getErrorRetrievingMdocText());
                }
            } catch (AbstractC5340n unused) {
                ((MdocComponent) this.f17706x).getErrorTextController().mo1451c(((MdocComponent) this.f17706x).getErrorRetrievingMdocText());
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.g$d */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements Function1<SubmitButtonComponent, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final d f17707a = new d();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(SubmitButtonComponent it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: ar.s.h(ar.s, android.content.Context, com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen, boolean, boolean, boolean, int, java.lang.Object):ar.g */
    /* JADX DEBUG: Class process forced to load method for inline: jr.p.b(android.view.View, com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle, boolean, boolean, int, java.lang.Object):void */
    public C4154g(@NotNull C10317a binding, @NotNull final UiWorkflow.AbstractC4142c.a initialRendering) {
        Map<String, UiComponentConfig> mapM20893j;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        this.binding = binding;
        this.navBarTitle = initialRendering.getNavBarTitle();
        CoordinatorLayout coordinatorLayoutM39625b = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b, "getRoot(...)");
        this.inputSelectBottomSheetController = new C6555j(coordinatorLayoutM39625b);
        CoordinatorLayout coordinatorLayoutM39625b2 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b2, "getRoot(...)");
        this.signatureBottomSheetController = new C9849a2(coordinatorLayoutM39625b2);
        CoordinatorLayout coordinatorLayoutM39625b3 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b3, "getRoot(...)");
        this.nestedUiBottomSheetController = new C9971q1(coordinatorLayoutM39625b3);
        CoordinatorLayout coordinatorLayoutM39625b4 = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b4, "getRoot(...)");
        this.helpBottomSheetController = new C4674n(coordinatorLayoutM39625b4);
        this.onComplete = new Function0() { // from class: or.d2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4154g.m21449n0();
            }
        };
        this.onCancel = new Function0() { // from class: or.o2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4154g.m21443l0();
            }
        };
        this.onClick = new Function2() { // from class: or.z2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C4154g.m21446m0((UiComponent) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.launchNfcScan = new Function1() { // from class: or.k3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21440k0((GovernmentIdNfcScanComponent) obj);
            }
        };
        this.launchJpMyNumberNfcScan = new Function1() { // from class: or.t3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21437j0((JpMyNumberNfcScanComponent) obj);
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: or.u3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21452o0((VerifyPersonaButtonComponent) obj);
            }
        };
        Context context = binding.getRoot().getContext();
        C1164s c1164s = C1164s.f4917a;
        Intrinsics.checkNotNull(context);
        List<UiComponent> listM21189f = initialRendering.m21189f();
        List<UiComponentConfig> listM21187d = initialRendering.m21187d();
        final C1152g c1152gM6522h = C1164s.m6522h(c1164s, context, new UiComponentScreen(listM21189f, listM21187d == null ? C7699p.m31892k() : listM21187d, initialRendering.getStyles()), initialRendering.getIsLoading(), false, false, 16, null);
        Integer numM21186c = initialRendering.m21186c();
        if (numM21186c != null) {
            binding.f37153k.setBackgroundColor(numM21186c.intValue());
        }
        Drawable drawableM21184a = initialRendering.m21184a(context);
        if (drawableM21184a != null) {
            binding.f37153k.setBackground(drawableM21184a);
            binding.f37145c.setBackgroundColor(0);
        }
        Integer numM21191h = initialRendering.m21191h();
        if (numM21191h != null) {
            binding.f37151i.setControlsColor(numM21191h.intValue());
        }
        List<UiComponentConfig> listM21187d2 = initialRendering.m21187d();
        this.componentNameToConfig = (listM21187d2 == null || (mapM20893j = C4086b.m20893j(listM21187d2)) == null) ? C7690k0.m31795j() : mapM20893j;
        Set<Map.Entry<String, ComponentView>> setEntrySet = c1152gM6522h.getViewBindings().m6497a().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM30477a = C7352s.m30477a(entry.getKey(), ((ComponentView) entry.getValue()).m6491d());
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        this.componentNameToView = linkedHashMap;
        this.binding.f37154l.addView(c1152gM6522h.getContentView());
        if (initialRendering.m21208y() == StyleElements.PositionType.CENTER) {
            C0518c c0518c = new C0518c();
            c0518c.m2509f(this.binding.f37144b);
            c0518c.m2511h(this.binding.f37154l.getId(), 4, this.binding.f37144b.getId(), 4);
            c0518c.m2506c(this.binding.f37144b);
        }
        FrameLayout uiStepContainer = this.binding.f37154l;
        Intrinsics.checkNotNullExpressionValue(uiStepContainer, "uiStepContainer");
        C7312p.m30410b(uiStepContainer, initialRendering.getStyles(), false, false, 6, null);
        if (c1152gM6522h.getFooterView() != null) {
            m21481g0(c1152gM6522h, initialRendering.m21189f());
        }
        CoordinatorLayout coordinatorLayoutM39625b5 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b5, "getRoot(...)");
        C12524g.m46876g(coordinatorLayoutM39625b5, new Function1() { // from class: or.v3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21411X(c1152gM6522h, this, (WindowInsetsCompat) obj);
            }
        });
        this.binding.f37152j.setOnScrollChangeListener(new NestedScrollView.InterfaceC0656e() { // from class: or.w3
            @Override // androidx.core.widget.NestedScrollView.InterfaceC0656e
            /* JADX INFO: renamed from: a */
            public final void mo3288a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
                C4154g.m21413Y(this.f36102a, initialRendering, nestedScrollView, i10, i11, i12, i13);
            }
        });
        this.binding.f37152j.post(new Runnable() { // from class: or.x3
            @Override // java.lang.Runnable
            public final void run() {
                C4154g.m21415Z(this.f36119a, initialRendering);
            }
        });
    }

    /* JADX INFO: renamed from: A0 */
    public static final Unit m21371A0(UiWorkflow.AbstractC4142c.a aVar, C4154g c4154g) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            c4154g.helpBottomSheetController.m22956x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.m21205v(), aVar.m21193j(), aVar.m21196m());
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: B0 */
    public static final Unit m21373B0(UiWorkflow.AbstractC4142c.a aVar, C4154g c4154g, List list, UiComponent tappedComponent, boolean z10) {
        Intrinsics.checkNotNullParameter(tappedComponent, "tappedComponent");
        aVar.m21201r().invoke(tappedComponent, Boolean.valueOf(z10), c4154g.m21482h0(list));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: C0 */
    public static final Unit m21375C0(UiWorkflow.AbstractC4142c.a aVar, C4154g c4154g, List list, VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.m21207x().invoke(it, c4154g.m21482h0(list));
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: I0 */
    public static final void m21382I0(C4154g c4154g, View view) {
        c4154g.onComplete.invoke();
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m21384J0(C4154g c4154g, UiComponent uiComponent, View view, View view2) {
        c4154g.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: renamed from: K0 */
    public static final void m21386K0(C4154g c4154g, UiComponent uiComponent, View view, View view2) {
        c4154g.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m21388L0(UiComponent uiComponent, ButtonWithLoadingIndicator buttonWithLoadingIndicator, View view) {
        try {
            buttonWithLoadingIndicator.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((LinkButtonComponent) uiComponent).getLink())));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m21390M0(C4154g c4154g, View view) {
        c4154g.onCancel.invoke();
    }

    /* JADX INFO: renamed from: N0 */
    public static final void m21392N0(C4154g c4154g, UiComponent uiComponent, View view) {
        c4154g.onVerifyPersonaClick.invoke(uiComponent);
    }

    /* JADX INFO: renamed from: O0 */
    public static final Unit m21394O0(View view, UiWorkflow.AbstractC4142c.a aVar, C4154g c4154g) {
        if (C5821a.f22221a.m26160b(view)) {
            SubmitButtonComponent submitButtonComponent = (SubmitButtonComponent) C5199h.m24125a(aVar.m21189f(), C7731d0.m32002b(SubmitButtonComponent.class), d.f17707a);
            if (submitButtonComponent != null) {
                c4154g.onClick.invoke(submitButtonComponent, Boolean.valueOf(view.getVisibility() == 0));
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: P0 */
    public static final void m21396P0(final MaterialAutoCompleteTextView materialAutoCompleteTextView, C1487a c1487a, final List<? extends TextInputLayout> list, final C6216d c6216d, final UiWorkflow.AbstractC4142c.a aVar, final UiComponent uiComponent, final List<Suggestion> list2) {
        materialAutoCompleteTextView.setAdapter(c1487a);
        c1487a.notifyDataSetChanged();
        materialAutoCompleteTextView.setThreshold(1);
        materialAutoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: or.p3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C4154g.m21398Q0(list, c6216d, materialAutoCompleteTextView, aVar, uiComponent, list2, adapterView, view, i10, j10);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public static final void m21398Q0(List list, C6216d c6216d, MaterialAutoCompleteTextView materialAutoCompleteTextView, UiWorkflow.AbstractC4142c.a aVar, UiComponent uiComponent, List list2, AdapterView adapterView, View view, int i10, long j10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((TextInputLayout) it.next()).setEnabled(false);
        }
        c6216d.f23673s.setVisibility(0);
        Context context = materialAutoCompleteTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C7259g.m30270d(context);
        aVar.m21206w().invoke(uiComponent, ((Suggestion) list2.get(i10)).getId());
    }

    /* JADX INFO: renamed from: R0 */
    public static final void m21400R0(C4154g c4154g, TextInputLayout textInputLayout, InterfaceC4337w1 interfaceC4337w1, InterfaceC4339w3 interfaceC4339w3, View view) {
        m21447m1(c4154g, textInputLayout, interfaceC4337w1, interfaceC4339w3);
    }

    /* JADX INFO: renamed from: S0 */
    public static final void m21402S0(C4154g c4154g, TextInputLayout textInputLayout, InterfaceC4337w1 interfaceC4337w1, InterfaceC4339w3 interfaceC4339w3, View view) {
        m21447m1(c4154g, textInputLayout, interfaceC4337w1, interfaceC4339w3);
    }

    /* JADX INFO: renamed from: T0 */
    public static final CharSequence m21404T0(Option it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getText();
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m21406U0(UiComponent uiComponent, View view, View view2) {
        AbstractC0968m abstractC0968mM4979a;
        MdocRequestMetadata mdocRequestMetadataM20820n = ((MdocComponent) uiComponent).getMdocRequestMetadata();
        if (!(mdocRequestMetadataM20820n instanceof MdocRequestMetadata.GoogleWalletRequestMetadata)) {
            throw new C7345l();
        }
        InterfaceC4777o.Companion aVar = InterfaceC4777o.INSTANCE;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC4777o interfaceC4777oM23210a = aVar.m23210a(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ActivityC6992b activityC6992bM30267a = C7259g.m30267a(context2);
        if (activityC6992bM30267a == null || (abstractC0968mM4979a = C0982t.m4979a(activityC6992bM30267a)) == null) {
            return;
        }
        C7882k.m32780d(abstractC0968mM4979a, null, null, new c(interfaceC4777oM23210a, view, mdocRequestMetadataM20820n, uiComponent, null), 3, null);
    }

    /* JADX INFO: renamed from: V0 */
    public static final void m21408V0(C4154g c4154g, UiComponent uiComponent, View view, View view2) {
        c4154g.onClick.invoke(uiComponent, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m21410W0(final UiComponent uiComponent, C4154g c4154g) {
        m21418a1(c4154g, ((InputInternationalDbComponent) uiComponent).getCountrySelectComponent(), new Function1() { // from class: or.q3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21412X0(uiComponent, (List) obj);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m21411X(C1152g c1152g, C4154g c4154g, WindowInsetsCompat insets) {
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
        View footerView = c1152g.getFooterView();
        if (footerView == null) {
            c4154g.binding.f37152j.setPadding(i12, i11, i13, iMax);
        } else {
            ShadowedNestedScrollView nestedScroll = c4154g.binding.f37152j;
            Intrinsics.checkNotNullExpressionValue(nestedScroll, "nestedScroll");
            nestedScroll.setPadding(i12, i11, i13, nestedScroll.getPaddingBottom());
            footerView.setPadding(i12, footerView.getPaddingTop(), i13, iMax);
        }
        MaterialDivider footerDivider = c4154g.binding.f37146d;
        Intrinsics.checkNotNullExpressionValue(footerDivider, "footerDivider");
        ViewGroup.LayoutParams layoutParams = footerDivider.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = insetsIgnoringVisibility.bottom;
        footerDivider.setLayoutParams(marginLayoutParams);
        CoordinatorLayout footerSheetCoordinatorLayout = c4154g.binding.f37148f;
        Intrinsics.checkNotNullExpressionValue(footerSheetCoordinatorLayout, "footerSheetCoordinatorLayout");
        footerSheetCoordinatorLayout.setPadding(i12, footerSheetCoordinatorLayout.getPaddingTop(), i13, iMax);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: X0 */
    public static final Unit m21412X0(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getCountryOptionsController().m24147c(it);
        inputInternationalDbComponent.getIdTypeOptionsController().m24147c(C7699p.m31892k());
        inputInternationalDbComponent.getIdValueController().mo1451c("");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Y */
    public static final void m21413Y(C4154g c4154g, UiWorkflow.AbstractC4142c.a aVar, NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "<unused var>");
        m21417a0(c4154g, aVar);
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m21414Y0(final UiComponent uiComponent, C4154g c4154g) {
        m21418a1(c4154g, ((InputInternationalDbComponent) uiComponent).m20716t(), new Function1() { // from class: or.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21416Z0(uiComponent, (List) obj);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m21415Z(C4154g c4154g, UiWorkflow.AbstractC4142c.a aVar) {
        m21417a0(c4154g, aVar);
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m21416Z0(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) uiComponent;
        inputInternationalDbComponent.getIdTypeOptionsController().m24147c(it);
        inputInternationalDbComponent.getIdValueController().mo1451c("");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m21417a0(C4154g c4154g, UiWorkflow.AbstractC4142c.a aVar) {
        if (c4154g.hasScrolledToBottom || c4154g.binding.f37152j.canScrollVertically(1)) {
            return;
        }
        c4154g.hasScrolledToBottom = true;
        c4154g.m21486q0(aVar);
    }

    /* JADX INFO: renamed from: a1 */
    public static final void m21418a1(final C4154g c4154g, InterfaceC4337w1 interfaceC4337w1, final Function1<? super List<Option>, Unit> function1) {
        if (interfaceC4337w1 == null) {
            return;
        }
        c4154g.binding.f37151i.getBackButton().setEnabled(false);
        c4154g.binding.f37151i.setImportantForAccessibility(4);
        c4154g.binding.f37154l.setImportantForAccessibility(4);
        c4154g.inputSelectBottomSheetController.m28409t(interfaceC4337w1, new Function1() { // from class: or.s3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21421b1(this.f36051a, function1, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m21421b1(C4154g c4154g, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        c4154g.binding.f37151i.getBackButton().setEnabled(true);
        c4154g.binding.f37151i.setImportantForAccessibility(1);
        c4154g.binding.f37154l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m21423c1(final UiComponent uiComponent, C4154g c4154g) {
        m21427e1(c4154g, ((InputPhoneNumberComponent) uiComponent).getCountryCodeSelectComponent(), new Function1() { // from class: or.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21425d1(uiComponent, (List) obj);
            }
        });
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m21425d1(UiComponent uiComponent, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((InputPhoneNumberComponent) uiComponent).getCountryCodeOptionsController().m24147c(it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m21427e1(final C4154g c4154g, InterfaceC4337w1 interfaceC4337w1, final Function1<? super List<Option>, Unit> function1) {
        if (interfaceC4337w1 == null) {
            return;
        }
        c4154g.binding.f37151i.getBackButton().setEnabled(false);
        c4154g.binding.f37151i.setImportantForAccessibility(4);
        c4154g.binding.f37154l.setImportantForAccessibility(4);
        c4154g.inputSelectBottomSheetController.m28409t(interfaceC4337w1, new Function1() { // from class: or.r3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21429f1(this.f36033a, function1, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m21429f1(C4154g c4154g, Function1 function1, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        c4154g.binding.f37151i.getBackButton().setEnabled(true);
        c4154g.binding.f37151i.setImportantForAccessibility(1);
        c4154g.binding.f37154l.setImportantForAccessibility(1);
        if (!selectedItems.isEmpty()) {
            function1.invoke(selectedItems);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: g1 */
    public static final void m21431g1(final C4154g c4154g, final UiComponent uiComponent, ESignature eSignature, UiWorkflow.AbstractC4142c.a aVar, ViewEnvironment viewEnvironment, View view) {
        c4154g.binding.f37151i.getBackButton().setEnabled(false);
        c4154g.binding.f37151i.setImportantForAccessibility(4);
        c4154g.binding.f37154l.setImportantForAccessibility(4);
        c4154g.signatureBottomSheetController.m38749p((ESignatureComponent) uiComponent, eSignature, aVar.getStyles(), viewEnvironment, new Function2() { // from class: or.l3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C4154g.m21433h1(this.f35912a, uiComponent, ((Boolean) obj).booleanValue(), (Bitmap) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m21433h1(C4154g c4154g, UiComponent uiComponent, boolean z10, Bitmap bitmap) {
        c4154g.binding.f37151i.getBackButton().setEnabled(true);
        c4154g.binding.f37151i.setImportantForAccessibility(1);
        c4154g.binding.f37154l.setImportantForAccessibility(1);
        if (!z10) {
            ((ESignatureComponent) uiComponent).getBitmapController().m24097c(bitmap);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: i1 */
    public static final void m21435i1(C4154g c4154g, UiComponent uiComponent, View view) {
        c4154g.launchNfcScan.invoke(uiComponent);
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m21437j0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent) {
        Intrinsics.checkNotNullParameter(jpMyNumberNfcScanComponent, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m21438j1(UiWorkflow.AbstractC4142c.a aVar, C4154g c4154g, View view) {
        if (aVar.getHelpBottomSheetViewModel() != null) {
            c4154g.helpBottomSheetController.m22956x(aVar.getStyles(), aVar.getHelpBottomSheetViewModel(), aVar.m21205v(), aVar.m21193j(), aVar.m21196m());
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m21440k0(GovernmentIdNfcScanComponent governmentIdNfcScanComponent) {
        Intrinsics.checkNotNullParameter(governmentIdNfcScanComponent, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k1 */
    public static final void m21441k1(C4154g c4154g, UiComponent uiComponent, View view) {
        c4154g.launchJpMyNumberNfcScan.invoke(uiComponent);
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m21443l0() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l1 */
    public static final CharSequence m21444l1(SelectedFile it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getFileName();
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m21446m0(UiComponent uiComponent, boolean z10) {
        Intrinsics.checkNotNullParameter(uiComponent, "<unused var>");
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: m1 */
    public static final void m21447m1(final C4154g c4154g, final TextInputLayout textInputLayout, InterfaceC4337w1 interfaceC4337w1, final InterfaceC4339w3<?> interfaceC4339w3) {
        c4154g.binding.f37151i.getBackButton().setEnabled(false);
        textInputLayout.setEnabled(false);
        c4154g.binding.f37151i.setImportantForAccessibility(4);
        c4154g.binding.f37154l.setImportantForAccessibility(4);
        c4154g.inputSelectBottomSheetController.m28409t(interfaceC4337w1, new Function1() { // from class: or.m3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21450n1(this.f35929a, textInputLayout, interfaceC4339w3, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m21449n0() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: n1 */
    public static final Unit m21450n1(C4154g c4154g, TextInputLayout textInputLayout, InterfaceC4339w3 interfaceC4339w3, List selectedItems) {
        Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
        c4154g.binding.f37151i.getBackButton().setEnabled(true);
        textInputLayout.setEnabled(true);
        textInputLayout.requestLayout();
        c4154g.binding.f37151i.setImportantForAccessibility(1);
        c4154g.binding.f37154l.setImportantForAccessibility(1);
        interfaceC4339w3.getSelectedOptionsController().m24147c(selectedItems);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Unit m21452o0(VerifyPersonaButtonComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f29331a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.withpersona.sdk2.inquiry.steps.ui.components.SheetComponent */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public static final Unit m21454p1(UiWorkflow.AbstractC4142c.a aVar, SheetComponent sheetComponent, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        aVar.m21203t().invoke(sheetComponent, it);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: q1 */
    public static final Unit m21456q1(C4154g c4154g, UiComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c4154g.nestedUiBottomSheetController.m38772f();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: r1 */
    public static final void m21458r1(Function1 function1, ComponentView componentView, View view) {
        function1.invoke(componentView.m6490c());
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m21460s0(ClickableStackComponent clickableStackComponent, C4154g c4154g, ConstraintLayout constraintLayout, View view) {
        clickableStackComponent.m20547k(true);
        c4154g.onClick.invoke(clickableStackComponent, Boolean.valueOf(constraintLayout.getVisibility() == 0));
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m21464v0(C4154g c4154g, View view, BottomSheetBehavior bottomSheetBehavior, View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = c4154g.binding.f37147e.getBottom();
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c4154g.binding.f37150h.offsetDescendantRectToMyCoords(view, rect);
        int iM12158u0 = bottomSheetBehavior.m12158u0();
        bottomSheetBehavior.m12120S0(rect.top);
        if (iM12158u0 != bottomSheetBehavior.m12158u0()) {
            ShadowedNestedScrollView shadowedNestedScrollView = c4154g.binding.f37152j;
            shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), c4154g.binding.f37152j.getPaddingTop(), c4154g.binding.f37152j.getPaddingRight(), bottomSheetBehavior.m12158u0());
        }
        bottomSheetBehavior.m12118Q0(bottom);
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m21466w0(C4154g c4154g, BottomSheetBehavior bottomSheetBehavior, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int bottom = c4154g.binding.f37147e.getBottom();
        bottomSheetBehavior.m12120S0(bottom);
        bottomSheetBehavior.m12118Q0(bottom);
        ShadowedNestedScrollView shadowedNestedScrollView = c4154g.binding.f37152j;
        shadowedNestedScrollView.setPadding(shadowedNestedScrollView.getPaddingLeft(), c4154g.binding.f37152j.getPaddingTop(), c4154g.binding.f37152j.getPaddingRight(), bottom);
    }

    /* JADX DEBUG: Class process forced to load method for inline: dr.n.o(dr.n, kotlin.jvm.functions.Function0, int, java.lang.Object):boolean */
    /* JADX INFO: renamed from: y0 */
    public static final Unit m21469y0(C4154g c4154g, UiWorkflow.AbstractC4142c.a aVar) {
        if (!c4154g.inputSelectBottomSheetController.m28404l() && !c4154g.signatureBottomSheetController.m38746h() && !C4674n.m22943o(c4154g.helpBottomSheetController, null, 1, null)) {
            if (aVar.getNavigationState().getShowBackButton()) {
                aVar.m21199p().invoke();
            } else {
                aVar.m21200q().invoke();
            }
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z0 */
    public static final Unit m21471z0(UiWorkflow.AbstractC4142c.a aVar) {
        aVar.m21200q().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: D0 */
    public final ComponentParam.ComponentNumber m21472D0(Number number) {
        return new ComponentParam.ComponentNumber(number);
    }

    /* JADX INFO: renamed from: E0 */
    public final ComponentParam.ComponentString m21473E0(String str) {
        return new ComponentParam.ComponentString(str);
    }

    /* JADX INFO: renamed from: F0 */
    public final ComponentParam.ComponentStringList m21474F0(List<String> list) {
        return new ComponentParam.ComponentStringList(list);
    }

    /* JADX INFO: renamed from: G0 */
    public final Map<String, Object> m21475G0(Map<String, ? extends ComponentParam> map) {
        Set<Map.Entry<String, ? extends ComponentParam>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM30477a = C7352s.m30477a(entry.getKey(), C4177a.m21637a((ComponentParam) entry.getValue()));
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m21476H0(final UiWorkflow.AbstractC4142c.a rendering, final UiComponent component, final View view, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors, final ViewEnvironment viewEnvironment, Map<String, ? extends UiComponentConfig> componentNameToConfig) {
        ArrayList arrayList;
        InputFileUpload.Attributes attributes;
        List<InputFileUpload.PrefillItem> prefill;
        InputTextBasedComponentStyle documentNumberStyle;
        InputTextBasedComponentStyle cardAccessNumberStyle;
        String placeholder;
        InputTextBasedComponentStyle styles;
        Map<String, UiComponentErrorInfo> map;
        InputTextBasedComponentStyle inputTextStyle;
        InputTextBasedComponentStyle inputTextStyle2;
        Map<String, UiComponentErrorInfo> map2 = errors;
        if (component instanceof CompleteButtonComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: or.l2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21382I0(this.f35911a, view2);
                }
            });
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof SubmitButtonComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator.setOnClickListener(new View.OnClickListener() { // from class: or.x2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21384J0(this.f36116a, component, view, view2);
                }
            });
            buttonWithLoadingIndicator.setIsLoading(rendering.getIsLoading() && ((SubmitButtonComponent) component).getWasTapped());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof ActionButtonComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            ButtonWithLoadingIndicator buttonWithLoadingIndicator2 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator2.setOnClickListener(new View.OnClickListener() { // from class: or.y2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21386K0(this.f36135a, component, view, view2);
                }
            });
            buttonWithLoadingIndicator2.setIsLoading(rendering.getIsLoading() && ((ActionButtonComponent) component).getWasTapped());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof LinkButtonComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator");
            final ButtonWithLoadingIndicator buttonWithLoadingIndicator3 = (ButtonWithLoadingIndicator) view;
            buttonWithLoadingIndicator3.setOnClickListener(new View.OnClickListener() { // from class: or.a3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21388L0(component, buttonWithLoadingIndicator3, view2);
                }
            });
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof CancelButtonComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type android.widget.Button");
            ((Button) view).setOnClickListener(new View.OnClickListener() { // from class: or.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21390M0(this.f35718a, view2);
                }
            });
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            return;
        }
        if (component instanceof VerifyPersonaButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: or.c3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C4154g.m21392N0(this.f35734a, component, view2);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator4 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator4 != null) {
                buttonWithLoadingIndicator4.setIsLoading(rendering.getIsLoading() && ((VerifyPersonaButtonComponent) component).getWasTapped());
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit = Unit.f29331a;
            return;
        }
        if (component instanceof InputTextComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout = (TextInputLayout) view;
            UiComponentErrorInfo uiComponentErrorInfo = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a = uiComponentErrorInfo != null ? uiComponentErrorInfo.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a;
            C8652d.m34731d(textInputLayout, uiInputComponentError != null ? uiInputComponentError.getMessage() : null, ((InputTextComponent) component).getErrorTextStyle());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit2 = Unit.f29331a;
            return;
        }
        if (component instanceof InputTextAreaComponent) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout2 = (TextInputLayout) view;
            UiComponentErrorInfo uiComponentErrorInfo2 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a2 = uiComponentErrorInfo2 != null ? uiComponentErrorInfo2.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a2 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a2 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError2 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a2;
            C8652d.m34731d(textInputLayout2, uiInputComponentError2 != null ? uiInputComponentError2.getMessage() : null, ((InputTextAreaComponent) component).getErrorTextStyle());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit3 = Unit.f29331a;
            return;
        }
        if (component instanceof InputConfirmationCodeComponent) {
            ((InputConfirmationCodeComponent) component).getSubmitCodeHelper().m26164c(new Function0() { // from class: or.d3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4154g.m21394O0(view, rendering, this);
                }
            });
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit4 = Unit.f29331a;
            return;
        }
        if (component instanceof InputAddressComponent) {
            Object tag = view.getTag();
            Intrinsics.m31981d(tag, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding");
            C6216d c6216d = (C6216d) tag;
            List<View> listM31895n = C7699p.m31895n(c6216d.f23660f, c6216d.f23668n, c6216d.f23656b, c6216d.f23667m, c6216d.f23666l);
            InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
            UiComponentConfig uiComponentConfig = componentNameToConfig.get(inputAddressComponent.getName());
            Intrinsics.m31981d(uiComponentConfig, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress");
            InputAddress inputAddress = (InputAddress) uiComponentConfig;
            UiComponentErrorInfo uiComponentErrorInfo3 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a3 = uiComponentErrorInfo3 != null ? uiComponentErrorInfo3.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a3 instanceof UiComponentError.UiInputAddressComponentError)) {
                uiComponentErrorM20987a3 = null;
            }
            UiComponentError.UiInputAddressComponentError uiInputAddressComponentError = (UiComponentError.UiInputAddressComponentError) uiComponentErrorM20987a3;
            List<Suggestion> listM20611A = inputAddressComponent.m20611A();
            if (listM20611A == null) {
                listM20611A = C7699p.m31892k();
            }
            List<Suggestion> list = listM20611A;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            List<Suggestion> list2 = list;
            ArrayList arrayList2 = new ArrayList(C7701q.m31905u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Suggestion) it.next()).toString());
            }
            List listM0 = CollectionsKt.m31687M0(arrayList2);
            InputAddress.AddressComponentStyle styles2 = inputAddress.getStyles();
            C1487a c1487a = new C1487a(context, R.layout.simple_list_item_1, listM0, (styles2 == null || (inputTextStyle2 = styles2.getInputTextStyle()) == null) ? null : inputTextStyle2.getFocusedTextBasedStyle());
            MaterialAutoCompleteTextView addressFieldExpandedTextView = c6216d.f23661g;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpandedTextView, "addressFieldExpandedTextView");
            m21396P0(addressFieldExpandedTextView, c1487a, listM31895n, c6216d, rendering, component, list);
            MaterialAutoCompleteTextView addressFieldCollapsedTextView = c6216d.f23659e;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsedTextView, "addressFieldCollapsedTextView");
            m21396P0(addressFieldCollapsedTextView, c1487a, listM31895n, c6216d, rendering, component, list);
            if (Intrinsics.m31980c(inputAddressComponent.getIsAddressAutocompleteLoading(), Boolean.FALSE)) {
                Iterator it2 = listM31895n.iterator();
                while (it2.hasNext()) {
                    ((TextInputLayout) it2.next()).setEnabled(true);
                }
                c6216d.f23673s.setVisibility(8);
            }
            if (uiInputAddressComponentError != null) {
                inputAddressComponent.m20618K(Boolean.FALSE);
            }
            if (Intrinsics.m31980c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.FALSE)) {
                c6216d.f23663i.setVisibility(8);
                c6216d.f23664j.setVisibility(0);
                c6216d.f23665k.setLabelFor(c6216d.f23664j.getId());
            } else if (Intrinsics.m31980c(inputAddressComponent.getIsAddressComponentsCollapsed(), Boolean.TRUE) || inputAddressComponent.getIsAddressComponentsCollapsed() == null) {
                c6216d.f23663i.setVisibility(0);
                c6216d.f23664j.setVisibility(8);
                c6216d.f23665k.setLabelFor(c6216d.f23663i.getId());
            }
            m21479e0(view, componentParams, component);
            for (View view2 : listM31895n) {
                Intrinsics.checkNotNull(view2);
                m21478d0(view2, componentParams, component, rendering.getIsLoading());
            }
            InputAddress.AddressComponentStyle styles3 = inputAddress.getStyles();
            TextBasedComponentStyle errorTextStyle = (styles3 == null || (inputTextStyle = styles3.getInputTextStyle()) == null) ? null : inputTextStyle.getErrorTextStyle();
            TextInputLayout addressFieldCollapsed = c6216d.f23658d;
            Intrinsics.checkNotNullExpressionValue(addressFieldCollapsed, "addressFieldCollapsed");
            C8652d.m34731d(addressFieldCollapsed, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressFieldExpanded = c6216d.f23660f;
            Intrinsics.checkNotNullExpressionValue(addressFieldExpanded, "addressFieldExpanded");
            C8652d.m34731d(addressFieldExpanded, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_1") : null, errorTextStyle);
            TextInputLayout addressSuite = c6216d.f23668n;
            Intrinsics.checkNotNullExpressionValue(addressSuite, "addressSuite");
            C8652d.m34731d(addressSuite, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("street_2") : null, errorTextStyle);
            TextInputLayout addressCity = c6216d.f23656b;
            Intrinsics.checkNotNullExpressionValue(addressCity, "addressCity");
            C8652d.m34731d(addressCity, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("city") : null, errorTextStyle);
            TextInputLayout addressSubdivision = c6216d.f23667m;
            Intrinsics.checkNotNullExpressionValue(addressSubdivision, "addressSubdivision");
            C8652d.m34731d(addressSubdivision, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("subdivision") : null, errorTextStyle);
            TextInputLayout addressPostalCode = c6216d.f23666l;
            Intrinsics.checkNotNullExpressionValue(addressPostalCode, "addressPostalCode");
            C8652d.m34731d(addressPostalCode, uiInputAddressComponentError != null ? uiInputAddressComponentError.getMessage().get("postal_code") : null, errorTextStyle);
            Unit unit5 = Unit.f29331a;
            return;
        }
        if ((component instanceof InputSelectComponent) || (component instanceof InputMultiSelectComponent)) {
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            final TextInputLayout textInputLayout3 = (TextInputLayout) view;
            Intrinsics.m31981d(component, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent");
            final InterfaceC4337w1 interfaceC4337w1 = (InterfaceC4337w1) component;
            final InterfaceC4339w3 interfaceC4339w3 = (InterfaceC4339w3) component;
            textInputLayout3.setOnClickListener(new View.OnClickListener() { // from class: or.e3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C4154g.m21400R0(this.f35775a, textInputLayout3, interfaceC4337w1, interfaceC4339w3, view3);
                }
            });
            EditText editText = textInputLayout3.getEditText();
            if (editText != null) {
                editText.setOnClickListener(new View.OnClickListener() { // from class: or.f3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C4154g.m21402S0(this.f35796a, textInputLayout3, interfaceC4337w1, interfaceC4339w3, view3);
                    }
                });
                Unit unit6 = Unit.f29331a;
            }
            EditText editText2 = textInputLayout3.getEditText();
            if (editText2 != null) {
                editText2.setText(CollectionsKt.m31715m0(interfaceC4339w3.getSelectedOptionsController().m24146b(), "\n", null, null, 0, null, new Function1() { // from class: or.g3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4154g.m21404T0((Option) obj);
                    }
                }, 30, null));
                Unit unit7 = Unit.f29331a;
            }
            Option option = (Option) CollectionsKt.firstOrNull(interfaceC4339w3.getSelectedOptionsController().m24146b());
            C8243c.m33620h(textInputLayout3, option != null ? option.getLeadingImageUrl() : null);
            UiComponentErrorInfo uiComponentErrorInfo4 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a4 = uiComponentErrorInfo4 != null ? uiComponentErrorInfo4.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a4 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a4 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError3 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a4;
            String message = uiInputComponentError3 != null ? uiInputComponentError3.getMessage() : null;
            InputSelectBoxComponentStyle styles4 = interfaceC4337w1.getF27964a();
            C8652d.m34731d(textInputLayout3, message, styles4 != null ? styles4.getErrorTextStyle() : null);
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit8 = Unit.f29331a;
            return;
        }
        if (component instanceof InputRadioGroupComponent) {
            Object tag2 = view.getTag();
            Intrinsics.m31981d(tag2, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding");
            C6226n c6226n = (C6226n) tag2;
            UiComponentErrorInfo uiComponentErrorInfo5 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a5 = uiComponentErrorInfo5 != null ? uiComponentErrorInfo5.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a5 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a5 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError4 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a5;
            String message2 = uiInputComponentError4 != null ? uiInputComponentError4.getMessage() : null;
            TextView radioGroupError = c6226n.f23712c;
            Intrinsics.checkNotNullExpressionValue(radioGroupError, "radioGroupError");
            if (message2 == null || StringsKt.m32182p0(message2)) {
                radioGroupError.setVisibility(8);
                radioGroupError.setText("");
            } else {
                radioGroupError.setVisibility(0);
                radioGroupError.setText(message2);
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById = view.findViewById(C1149d.f4851u0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            Iterator<View> it3 = C0637u0.m3198a((ViewGroup) viewFindViewById).iterator();
            while (it3.hasNext()) {
                m21478d0(it3.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit9 = Unit.f29331a;
            return;
        }
        if (component instanceof UiComponentGroup) {
            for (UiComponent uiComponent : ((UiComponentGroup) component).getChildren()) {
                View view3 = this.componentNameToView.get(uiComponent.getName());
                if (view3 != null) {
                    Map<String, UiComponentErrorInfo> map3 = map2;
                    m21476H0(rendering, uiComponent, view3, componentParams, map3, viewEnvironment, componentNameToConfig);
                    map = map3;
                } else {
                    map = map2;
                }
                map2 = map;
            }
            if ((component instanceof ClickableStackComponent) && (view instanceof ConstraintLayout)) {
                m21487r0(rendering, (ClickableStackComponent) component, (ConstraintLayout) view);
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit10 = Unit.f29331a;
            return;
        }
        if (component instanceof MdocComponent) {
            Object tag3 = view.getTag();
            Intrinsics.m31981d(tag3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentViewHolder");
            C4333v3 c4333v3 = (C4333v3) tag3;
            String strM20817j = ((MdocComponent) component).getErrorText();
            c4333v3.getLaunchButton().setOnClickListener(new View.OnClickListener() { // from class: or.m2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C4154g.m21406U0(component, view, view4);
                }
            });
            m21477c0(c4333v3.getLaunchButton(), componentParams, component, rendering.getIsLoading());
            UiComponentErrorInfo uiComponentErrorInfo6 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a6 = uiComponentErrorInfo6 != null ? uiComponentErrorInfo6.m20987a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError5 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorM20987a6 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorM20987a6);
            if (uiInputComponentError5 != null) {
                strM20817j = uiInputComponentError5.getMessage();
            }
            if (strM20817j == null || StringsKt.m32182p0(strM20817j)) {
                c4333v3.getErrorLabel().setVisibility(8);
                Unit unit11 = Unit.f29331a;
                return;
            } else {
                TextView errorLabel = c4333v3.getErrorLabel();
                errorLabel.setText(strM20817j);
                errorLabel.setVisibility(0);
                return;
            }
        }
        if (component instanceof ButtonComponent) {
            view.setOnClickListener(new View.OnClickListener() { // from class: or.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C4154g.m21408V0(this.f35944a, component, view, view4);
                }
            });
            ButtonWithLoadingIndicator buttonWithLoadingIndicator5 = view instanceof ButtonWithLoadingIndicator ? (ButtonWithLoadingIndicator) view : null;
            if (buttonWithLoadingIndicator5 != null) {
                buttonWithLoadingIndicator5.setIsLoading(rendering.getIsLoading() && ((ButtonComponent) component).getWasTapped());
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit12 = Unit.f29331a;
            return;
        }
        if (component instanceof InputDateComponent) {
            Object tag4 = view.getTag();
            Intrinsics.m31981d(tag4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding");
            C6218f c6218f = (C6218f) tag4;
            UiComponentErrorInfo uiComponentErrorInfo7 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a7 = uiComponentErrorInfo7 != null ? uiComponentErrorInfo7.m20987a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError6 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorM20987a7 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorM20987a7);
            if (uiInputComponentError6 != null) {
                c6218f.f23682f.setError(uiInputComponentError6.getMessage());
                c6218f.f23679c.setError(uiInputComponentError6.getMessage());
                c6218f.f23684h.setError(uiInputComponentError6.getMessage());
                c6218f.f23681e.setText(uiInputComponentError6.getMessage());
                c6218f.f23681e.setVisibility(0);
            } else {
                c6218f.f23682f.setError("");
                c6218f.f23679c.setError("");
                c6218f.f23684h.setError("");
                c6218f.f23681e.setText("");
                c6218f.f23681e.setVisibility(8);
            }
            m21479e0(view, componentParams, component);
            View month = c6218f.f23682f;
            Intrinsics.checkNotNullExpressionValue(month, "month");
            m21478d0(month, componentParams, component, rendering.getIsLoading());
            View day = c6218f.f23679c;
            Intrinsics.checkNotNullExpressionValue(day, "day");
            m21478d0(day, componentParams, component, rendering.getIsLoading());
            View year = c6218f.f23684h;
            Intrinsics.checkNotNullExpressionValue(year, "year");
            m21478d0(year, componentParams, component, rendering.getIsLoading());
            Unit unit13 = Unit.f29331a;
            return;
        }
        if (component instanceof InputInternationalDbComponent) {
            Object tag5 = view.getTag();
            Intrinsics.m31981d(tag5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding");
            C6229q c6229q = (C6229q) tag5;
            UiComponentErrorInfo uiComponentErrorInfo8 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a8 = uiComponentErrorInfo8 != null ? uiComponentErrorInfo8.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a8 instanceof UiComponentError.UiInputInternationalDbComponentError)) {
                uiComponentErrorM20987a8 = null;
            }
            UiComponentError.UiInputInternationalDbComponentError uiInputInternationalDbComponentError = (UiComponentError.UiInputInternationalDbComponentError) uiComponentErrorM20987a8;
            Map<String, String> message3 = uiInputInternationalDbComponentError != null ? uiInputInternationalDbComponentError.getMessage() : null;
            C4085a.m20877n((InputInternationalDbComponent) component, c6229q, new Function0() { // from class: or.p2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4154g.m21410W0(component, this);
                }
            }, new Function0() { // from class: or.q2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4154g.m21414Y0(component, this);
                }
            }, message3 != null ? message3.get("idb_country") : null, message3 != null ? message3.get("idb_type") : null, message3 != null ? message3.get("idb_value") : null);
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit14 = Unit.f29331a;
            return;
        }
        if (component instanceof InputMaskedTextComponent) {
            UiComponentErrorInfo uiComponentErrorInfo9 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a9 = uiComponentErrorInfo9 != null ? uiComponentErrorInfo9.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a9 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a9 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError7 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a9;
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout4 = (TextInputLayout) view;
            String message4 = uiInputComponentError7 != null ? uiInputComponentError7.getMessage() : null;
            InputTextBasedComponentStyle inputTextBasedComponentStyleM20736k = ((InputMaskedTextComponent) component).getStyles();
            C8652d.m34731d(textInputLayout4, message4, inputTextBasedComponentStyleM20736k != null ? inputTextBasedComponentStyleM20736k.getErrorTextStyle() : null);
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit15 = Unit.f29331a;
            return;
        }
        if (component instanceof InputPhoneNumberComponent) {
            Object tag6 = view.getTag();
            Intrinsics.m31981d(tag6, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding");
            C6225m c6225m = (C6225m) tag6;
            UiComponentErrorInfo uiComponentErrorInfo10 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a10 = uiComponentErrorInfo10 != null ? uiComponentErrorInfo10.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a10 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a10 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError8 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a10;
            TextInputLayout inputLayout = c6225m.f23709b;
            Intrinsics.checkNotNullExpressionValue(inputLayout, "inputLayout");
            String message5 = uiInputComponentError8 != null ? uiInputComponentError8.getMessage() : null;
            InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
            C8652d.m34731d(inputLayout, message5, inputPhoneNumberComponent.getErrorTextStyle());
            C4295p1.m21838e(inputPhoneNumberComponent, c6225m, new Function0() { // from class: or.r2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4154g.m21423c1(component, this);
                }
            });
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit16 = Unit.f29331a;
            return;
        }
        if (component instanceof InputNumberComponent) {
            UiComponentErrorInfo uiComponentErrorInfo11 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a11 = uiComponentErrorInfo11 != null ? uiComponentErrorInfo11.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a11 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a11 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError9 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a11;
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            TextInputLayout textInputLayout5 = (TextInputLayout) view;
            String message6 = uiInputComponentError9 != null ? uiInputComponentError9.getMessage() : null;
            UiComponentConfig uiComponentConfig2 = componentNameToConfig.get(((InputNumberComponent) component).getName());
            InputNumber inputNumber = uiComponentConfig2 instanceof InputNumber ? (InputNumber) uiComponentConfig2 : null;
            C8652d.m34731d(textInputLayout5, message6, (inputNumber == null || (styles = inputNumber.getStyles()) == null) ? null : styles.getErrorTextStyle());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit17 = Unit.f29331a;
            return;
        }
        if (component instanceof InputCurrencyComponent) {
            UiComponentErrorInfo uiComponentErrorInfo12 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a12 = uiComponentErrorInfo12 != null ? uiComponentErrorInfo12.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a12 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a12 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError10 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a12;
            Intrinsics.m31981d(view, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout");
            C8652d.m34731d((TextInputLayout) view, uiInputComponentError10 != null ? uiInputComponentError10.getMessage() : null, ((InputCurrencyComponent) component).getErrorTextStyle());
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit18 = Unit.f29331a;
            return;
        }
        if (component instanceof InputCheckboxComponent) {
            Object tag7 = view.getTag();
            Intrinsics.m31981d(tag7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding");
            C6221i c6221i = (C6221i) tag7;
            UiComponentErrorInfo uiComponentErrorInfo13 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a13 = uiComponentErrorInfo13 != null ? uiComponentErrorInfo13.m20987a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError11 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorM20987a13 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorM20987a13);
            if (uiInputComponentError11 != null) {
                c6221i.f23694d.setText(uiInputComponentError11.getMessage());
                c6221i.f23694d.setVisibility(0);
            } else {
                c6221i.f23694d.setText("");
                c6221i.f23694d.setVisibility(8);
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit19 = Unit.f29331a;
            return;
        }
        if (component instanceof InputCheckboxGroupComponent) {
            Object tag8 = view.getTag();
            Intrinsics.m31981d(tag8, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding");
            C6222j c6222j = (C6222j) tag8;
            UiComponentErrorInfo uiComponentErrorInfo14 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a14 = uiComponentErrorInfo14 != null ? uiComponentErrorInfo14.m20987a(component.getLastValueUpdateTs()) : null;
            UiComponentError.UiInputComponentError uiInputComponentError12 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorM20987a14 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorM20987a14);
            if (uiInputComponentError12 != null) {
                c6222j.f23698c.setText(uiInputComponentError12.getMessage());
                c6222j.f23698c.setVisibility(0);
            } else {
                c6222j.f23698c.setText("");
                c6222j.f23698c.setVisibility(8);
            }
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            View viewFindViewById2 = view.findViewById(C1149d.f4844r);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            Iterator<View> it4 = C0637u0.m3198a((ViewGroup) viewFindViewById2).iterator();
            while (it4.hasNext()) {
                m21478d0(it4.next(), componentParams, component, rendering.getIsLoading());
            }
            Unit unit20 = Unit.f29331a;
            return;
        }
        if (component instanceof ESignatureComponent) {
            Object tag9 = view.getTag();
            Intrinsics.m31981d(tag9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
            C6235w c6235w = (C6235w) tag9;
            ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
            UiComponentConfig uiComponentConfig3 = componentNameToConfig.get(eSignatureComponent.getName());
            Intrinsics.m31981d(uiComponentConfig3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature");
            final ESignature eSignature = (ESignature) uiComponentConfig3;
            UiComponentErrorInfo uiComponentErrorInfo15 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a15 = uiComponentErrorInfo15 != null ? uiComponentErrorInfo15.m20987a(component.getLastValueUpdateTs()) : null;
            if (!(uiComponentErrorM20987a15 instanceof UiComponentError.UiInputComponentError)) {
                uiComponentErrorM20987a15 = null;
            }
            UiComponentError.UiInputComponentError uiInputComponentError13 = (UiComponentError.UiInputComponentError) uiComponentErrorM20987a15;
            if (uiInputComponentError13 != null) {
                c6235w.f23745d.setText(uiInputComponentError13.getMessage());
                c6235w.f23745d.setVisibility(0);
            } else {
                c6235w.f23745d.setText("");
                c6235w.f23745d.setVisibility(8);
            }
            ESignature.Attributes attributes2 = eSignature.getAttributes();
            if ((attributes2 != null ? attributes2.getLabel() : null) != null) {
                TextView textView = c6235w.f23746e;
                ESignature.Attributes attributes3 = eSignature.getAttributes();
                textView.setText(attributes3 != null ? attributes3.getLabel() : null);
                c6235w.f23746e.setVisibility(0);
            } else {
                c6235w.f23746e.setText("");
                c6235w.f23746e.setVisibility(8);
            }
            Bitmap bitmapM24096b = eSignatureComponent.getBitmapController().m24096b();
            if (bitmapM24096b == null) {
                Object tag10 = view.getTag();
                Intrinsics.m31981d(tag10, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag10).f23743b.setVisibility(0);
                Object tag11 = view.getTag();
                Intrinsics.m31981d(tag11, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                TextView textView2 = ((C6235w) tag11).f23743b;
                ESignature.Attributes attributes4 = eSignature.getAttributes();
                if (attributes4 == null || (placeholder = attributes4.getPlaceholder()) == null) {
                    placeholder = "+ Add signature";
                }
                textView2.setText(placeholder);
                Object tag12 = view.getTag();
                Intrinsics.m31981d(tag12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag12).f23748g.setVisibility(8);
                Object tag13 = view.getTag();
                Intrinsics.m31981d(tag13, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag13).f23744c.setVisibility(8);
            } else {
                Object tag14 = view.getTag();
                Intrinsics.m31981d(tag14, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag14).f23748g.setImageBitmap(bitmapM24096b);
                Object tag15 = view.getTag();
                Intrinsics.m31981d(tag15, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag15).f23743b.setVisibility(8);
                Object tag16 = view.getTag();
                Intrinsics.m31981d(tag16, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag16).f23748g.setVisibility(0);
                Object tag17 = view.getTag();
                Intrinsics.m31981d(tag17, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding");
                ((C6235w) tag17).f23744c.setVisibility(0);
            }
            c6235w.f23747f.setOnClickListener(new View.OnClickListener() { // from class: or.s2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C4154g.m21431g1(this.f36046a, component, eSignature, rendering, viewEnvironment, view4);
                }
            });
            m21479e0(view, componentParams, component);
            View signatureContainer = c6235w.f23747f;
            Intrinsics.checkNotNullExpressionValue(signatureContainer, "signatureContainer");
            m21478d0(signatureContainer, componentParams, component, rendering.getIsLoading());
            Unit unit21 = Unit.f29331a;
            return;
        }
        if (component instanceof GovernmentIdNfcScanComponent) {
            Object tag18 = view.getTag();
            Intrinsics.m31981d(tag18, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder");
            C4335w c4335w = (C4335w) tag18;
            ButtonWithLoadingIndicator buttonWithLoadingIndicatorM21983f = c4335w.getLaunchButton();
            buttonWithLoadingIndicatorM21983f.setIsLoading(rendering.getIsLoading() && ((GovernmentIdNfcScanComponent) component).getWasTapped());
            m21477c0(buttonWithLoadingIndicatorM21983f, componentParams, component, rendering.getIsLoading());
            buttonWithLoadingIndicatorM21983f.setOnClickListener(new View.OnClickListener() { // from class: or.t2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    C4154g.m21435i1(this.f36063a, component, view4);
                }
            });
            View viewM21984g = c4335w.getTipsButton();
            if (viewM21984g != null) {
                viewM21984g.setOnClickListener(new View.OnClickListener() { // from class: or.u2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C4154g.m21438j1(rendering, this, view4);
                    }
                });
                Unit unit22 = Unit.f29331a;
            }
            UiComponentErrorInfo uiComponentErrorInfo16 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a16 = uiComponentErrorInfo16 != null ? uiComponentErrorInfo16.m20987a(component.getLastValueUpdateTs()) : null;
            if (uiComponentErrorM20987a16 == null) {
                uiComponentErrorM20987a16 = null;
            }
            if (uiComponentErrorM20987a16 instanceof UiComponentError.UiInputComponentError) {
                TextView textViewM21981d = c4335w.getErrorLabel();
                textViewM21981d.setText(((UiComponentError.UiInputComponentError) uiComponentErrorM20987a16).getMessage());
                textViewM21981d.setVisibility(0);
                return;
            }
            if (!(uiComponentErrorM20987a16 instanceof UiComponentError.UiGovernmentIdNfcScanComponentError)) {
                c4335w.getErrorLabel().setVisibility(8);
                Unit unit23 = Unit.f29331a;
                return;
            }
            TextInputLayout textInputLayoutM21978a = c4335w.getCardAccessNumber();
            UiComponentError.UiGovernmentIdNfcScanComponentError uiGovernmentIdNfcScanComponentError = (UiComponentError.UiGovernmentIdNfcScanComponentError) uiComponentErrorM20987a16;
            String str = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.cardAccessNumberName);
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles5 = governmentIdNfcScanComponent.getConfig().getStyles();
            C8652d.m34731d(textInputLayoutM21978a, str, (styles5 == null || (cardAccessNumberStyle = styles5.getCardAccessNumberStyle()) == null) ? null : cardAccessNumberStyle.getErrorTextStyle());
            TextInputLayout textInputLayoutM21980c = c4335w.getDocumentNumber();
            String str2 = uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.documentNumberName);
            GovernmentIdNfcScan.GovernmentIdNfcScanStyles styles6 = governmentIdNfcScanComponent.getConfig().getStyles();
            C8652d.m34731d(textInputLayoutM21980c, str2, (styles6 == null || (documentNumberStyle = styles6.getDocumentNumberStyle()) == null) ? null : documentNumberStyle.getErrorTextStyle());
            c4335w.getDateOfBirthBinding().f23681e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.dateOfBirthName));
            c4335w.getDateOfBirthBinding().f23681e.setVisibility(0);
            c4335w.getExpirationDateBinding().f23681e.setText(uiGovernmentIdNfcScanComponentError.getMessage().get(GovernmentIdNfcScan.expirationDateName));
            c4335w.getExpirationDateBinding().f23681e.setVisibility(0);
            Unit unit24 = Unit.f29331a;
            return;
        }
        if (component instanceof JpMyNumberNfcScanComponent) {
            Object tag19 = view.getTag();
            Intrinsics.m31981d(tag19, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanViewHolder");
            C4236f2 c4236f2 = (C4236f2) tag19;
            ButtonWithLoadingIndicator buttonWithLoadingIndicatorM21764b = c4236f2.getScanButton();
            buttonWithLoadingIndicatorM21764b.setIsLoading(rendering.getIsLoading() && ((JpMyNumberNfcScanComponent) component).getWasTapped());
            m21477c0(buttonWithLoadingIndicatorM21764b, componentParams, component, rendering.getIsLoading());
            if (((JpMyNumberNfcScanComponent) component).getValidOperation() == null) {
                buttonWithLoadingIndicatorM21764b.setEnabled(false);
            } else {
                buttonWithLoadingIndicatorM21764b.setOnClickListener(new View.OnClickListener() { // from class: or.v2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        C4154g.m21441k1(this.f36089a, component, view4);
                    }
                });
            }
            UiComponentErrorInfo uiComponentErrorInfo17 = map2.get(component.getName());
            UiComponentError uiComponentErrorM20987a17 = uiComponentErrorInfo17 != null ? uiComponentErrorInfo17.m20987a(component.getLastValueUpdateTs()) : null;
            UiComponentError uiComponentError = uiComponentErrorM20987a17 == null ? null : uiComponentErrorM20987a17;
            if (!(uiComponentError instanceof UiComponentError.UiInputComponentError)) {
                c4236f2.getErrorLabel().setVisibility(8);
                Unit unit25 = Unit.f29331a;
                return;
            } else {
                TextView textViewM21763a = c4236f2.getErrorLabel();
                textViewM21763a.setText(((UiComponentError.UiInputComponentError) uiComponentError).getMessage());
                textViewM21763a.setVisibility(0);
                return;
            }
        }
        if ((component instanceof CreatePersonaSheetComponent) || (component instanceof ImagePreviewComponent) || (component instanceof LocalImageComponent) || (component instanceof PrivacyPolicyComponent) || (component instanceof QRCodeComponent) || (component instanceof RemoteImageComponent) || (component instanceof SpacerComponent) || (component instanceof TextComponent) || (component instanceof TitleComponent) || (component instanceof BrandingComponent)) {
            m21477c0(view, componentParams, component, rendering.getIsLoading());
            Unit unit26 = Unit.f29331a;
            return;
        }
        if (!(component instanceof InputFileUploadComponent)) {
            if (component instanceof PhoneNumberSnaComponent) {
                Unit unit27 = Unit.f29331a;
                return;
            } else {
                if (!(component instanceof HelpBottomSheetComponent)) {
                    throw new C7345l();
                }
                Unit unit28 = Unit.f29331a;
                return;
            }
        }
        Object tag20 = view.getTag();
        Intrinsics.m31981d(tag20, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding");
        C6223k c6223k = (C6223k) tag20;
        InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
        UiComponentConfig uiComponentConfig4 = componentNameToConfig.get(inputFileUploadComponent.getName());
        InputFileUpload inputFileUpload = uiComponentConfig4 instanceof InputFileUpload ? (InputFileUpload) uiComponentConfig4 : null;
        if (!inputFileUploadComponent.m20697k().isEmpty()) {
            c6223k.f23702c.setText(CollectionsKt.m31715m0(inputFileUploadComponent.m20697k(), ", ", null, null, 0, null, new Function1() { // from class: or.w2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4154g.m21444l1((SelectedFile) obj);
                }
            }, 30, null));
            c6223k.f23702c.setVisibility(0);
        } else if (inputFileUploadComponent.getHasPrefill()) {
            if (inputFileUpload == null || (attributes = inputFileUpload.getAttributes()) == null || (prefill = attributes.getPrefill()) == null) {
                arrayList = null;
            } else {
                List<InputFileUpload.PrefillItem> list3 = prefill;
                ArrayList arrayList3 = new ArrayList(C7701q.m31905u(list3, 10));
                Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((InputFileUpload.PrefillItem) it5.next()).getFilename());
                }
                arrayList = arrayList3;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                c6223k.f23702c.setText(C12244g.f43259o);
                c6223k.f23702c.setVisibility(0);
            } else {
                c6223k.f23702c.setText(CollectionsKt.m31715m0(arrayList, ", ", null, null, 0, null, null, 62, null));
                c6223k.f23702c.setVisibility(0);
            }
        } else {
            c6223k.f23702c.setText(C12244g.f43259o);
            c6223k.f23702c.setVisibility(0);
        }
        UiComponentErrorInfo uiComponentErrorInfo18 = map2.get(component.getName());
        UiComponentError uiComponentErrorM20987a18 = uiComponentErrorInfo18 != null ? uiComponentErrorInfo18.m20987a(component.getLastValueUpdateTs()) : null;
        UiComponentError.UiInputComponentError uiInputComponentError14 = (UiComponentError.UiInputComponentError) (!(uiComponentErrorM20987a18 instanceof UiComponentError.UiInputComponentError) ? null : uiComponentErrorM20987a18);
        if (uiInputComponentError14 != null) {
            c6223k.f23703d.setText(uiInputComponentError14.getMessage());
            c6223k.f23703d.setVisibility(0);
        } else {
            c6223k.f23703d.setText("");
            c6223k.f23703d.setVisibility(8);
        }
        m21477c0(view, componentParams, component, rendering.getIsLoading());
        Unit unit29 = Unit.f29331a;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m21477c0(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z10) {
        m21479e0(view, map, uiComponent);
        m21478d0(view, map, uiComponent, z10);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m21478d0(View view, Map<String, ? extends Object> map, UiComponent uiComponent, boolean z10) {
        Boolean value;
        if (uiComponent instanceof InterfaceC4287o) {
            JsonLogicBoolean disabled = ((InterfaceC4287o) uiComponent).getDisabled();
            boolean z11 = false;
            boolean zBooleanValue = (disabled == null || (value = disabled.getValue(map, map.get(uiComponent.getName()), m21483i0())) == null) ? false : value.booleanValue();
            if (!z10 && !zBooleanValue) {
                z11 = true;
            }
            view.setEnabled(z11);
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m21479e0(View view, Map<String, ? extends Object> map, UiComponent uiComponent) {
        Boolean value;
        if (uiComponent instanceof InterfaceC4341x) {
            InterfaceC4341x interfaceC4341x = (InterfaceC4341x) uiComponent;
            JsonLogicBoolean hidden = interfaceC4341x.getHidden();
            boolean z10 = ((hidden == null || (value = hidden.getValue(map, map.get(uiComponent.getName()), m21483i0())) == null) ? false : value.booleanValue()) || ((uiComponent instanceof TitleComponent) && ((TitleComponent) uiComponent).getIsTextBlank());
            view.setVisibility(z10 ? 8 : 0);
            Iterator<T> it = interfaceC4341x.mo20534i().iterator();
            while (it.hasNext()) {
                ((InterfaceC8649a) it.next()).mo34727a(map, z10, m21483i0());
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m21480f0(List<? extends UiComponent> components, Map<String, ? extends Object> componentParams, boolean isLoading) {
        for (UiComponent uiComponent : components) {
            View view = this.componentNameToView.get(uiComponent.getName());
            if (view != null) {
                m21477c0(view, componentParams, uiComponent, isLoading);
                if (uiComponent instanceof UiComponentGroup) {
                    m21480f0(((UiComponentGroup) uiComponent).getChildren(), componentParams, isLoading);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m21481g0(C1152g result, List<? extends UiComponent> components) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : components) {
            if (obj instanceof FooterComponent) {
                arrayList.add(obj);
            }
        }
        FooterComponent footerComponent = (FooterComponent) CollectionsKt.firstOrNull(arrayList);
        if (footerComponent == null) {
            return;
        }
        Integer numM20582g = footerComponent.getFirstBelowTheFoldChildIndex();
        if (numM20582g != null) {
            m21489u0(result, numM20582g.intValue(), footerComponent);
        } else {
            this.binding.f37145c.addView(result.getFooterView());
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final Map<String, ComponentParam> m21482h0(List<ComponentView> components) {
        LinkedHashMap linkedHashMap;
        Map<String, ? extends Object> mapM31795j = C7690k0.m31795j();
        int i10 = 0;
        while (true) {
            linkedHashMap = new LinkedHashMap();
            m21485p0(mapM31795j, linkedHashMap, components);
            Map<String, ? extends Object> mapM21475G0 = m21475G0(linkedHashMap);
            if (Intrinsics.m31980c(mapM31795j, mapM21475G0) || i10 >= 20) {
                break;
            }
            i10++;
            mapM31795j = mapM21475G0;
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i0 */
    public final Map<String, Object> m21483i0() {
        return C7688j0.m31791g(C7352s.m30477a("scrolled_to_bottom_of_screen", Boolean.valueOf(this.hasScrolledToBottom)));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m21484o1(final UiWorkflow.AbstractC4142c.a rendering, ViewEnvironment viewEnvironment, final SheetComponent component, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors) {
        C1153h viewBindings;
        Map<String, ComponentView> mapM6497a;
        if (!(component instanceof CreatePersonaSheetComponent)) {
            throw new C7345l();
        }
        CreatePersonaSheet.CardCtaPage.ComponentNameMapping componentNameMapping = ((CreatePersonaSheetComponent) component).getCtaCard().getComponentNameMapping();
        List<Pair<String, Function1<UiComponent, Unit>>> listM20521b = new NestedUiStep.C4025a().m20520a(componentNameMapping != null ? componentNameMapping.getStartButton() : null, new Function1() { // from class: or.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21454p1(rendering, component, (UiComponent) obj);
            }
        }).m20520a(componentNameMapping != null ? componentNameMapping.getDismissButton() : null, new Function1() { // from class: or.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4154g.m21456q1(this.f35876a, (UiComponent) obj);
            }
        }).m20521b();
        C1152g c1152gM38771e = this.nestedUiBottomSheetController.m38771e();
        if (c1152gM38771e == null || (viewBindings = c1152gM38771e.getViewBindings()) == null || (mapM6497a = viewBindings.m6497a()) == null) {
            return;
        }
        for (Map.Entry<String, ComponentView> entry : mapM6497a.entrySet()) {
            m21476H0(rendering, entry.getValue().m6490c(), entry.getValue().m6491d(), componentParams, errors, viewEnvironment, this.componentNameToConfig);
        }
        for (Pair<String, Function1<UiComponent, Unit>> pair : listM20521b) {
            String strM31673c = pair.m31673c();
            final Function1<UiComponent, Unit> function1M31674d = pair.m31674d();
            final ComponentView componentView = mapM6497a.get(strM31673c);
            if (componentView != null) {
                componentView.m6491d().setOnClickListener(new View.OnClickListener() { // from class: or.k2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C4154g.m21458r1(function1M31674d, componentView, view);
                    }
                });
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final void m21485p0(Map<String, ? extends Object> initialComponentValues, Map<String, ComponentParam> outMap, List<ComponentView> componentViews) {
        File fileM42954a;
        byte[] bArrM44649g;
        File fileM42954a2;
        byte[] bArrM44649g2;
        File fileM42954a3;
        byte[] bArrM44649g3;
        Map<String, String> mapM18920g;
        Boolean value;
        for (ComponentView componentView : componentViews) {
            UiComponent component = componentView.getComponent();
            componentView.getView();
            linkedHashMap = null;
            LinkedHashMap linkedHashMap = null;
            strEncodeToString = null;
            strEncodeToString = null;
            String strEncodeToString = null;
            InterfaceC4341x interfaceC4341x = component instanceof InterfaceC4341x ? (InterfaceC4341x) component : null;
            JsonLogicBoolean hidden = interfaceC4341x != null ? interfaceC4341x.getHidden() : null;
            if (!((hidden == null || (value = hidden.getValue(initialComponentValues, initialComponentValues.get(component.getName()), m21483i0())) == null) ? false : value.booleanValue())) {
                if (component instanceof InputTextComponent) {
                    InputTextComponent inputTextComponent = (InputTextComponent) component;
                    outMap.put(inputTextComponent.getName(), m21473E0(inputTextComponent.getTextController().mo1450b()));
                } else if (component instanceof InputTextAreaComponent) {
                    InputTextAreaComponent inputTextAreaComponent = (InputTextAreaComponent) component;
                    outMap.put(inputTextAreaComponent.getName(), m21473E0(inputTextAreaComponent.getTextController().mo1450b()));
                } else if (component instanceof InputPhoneNumberComponent) {
                    InputPhoneNumberComponent inputPhoneNumberComponent = (InputPhoneNumberComponent) component;
                    String strM24110h = C5197f.f20219a.m24110h((Option) CollectionsKt.m31706d0(inputPhoneNumberComponent.getCountryCodeOptionsController().m24146b()));
                    outMap.put(inputPhoneNumberComponent.getName(), m21473E0(strM24110h + " " + inputPhoneNumberComponent.getTextController().mo1450b()));
                } else if (component instanceof InputConfirmationCodeComponent) {
                    InputConfirmationCodeComponent inputConfirmationCodeComponent = (InputConfirmationCodeComponent) component;
                    outMap.put(inputConfirmationCodeComponent.getName(), m21473E0(inputConfirmationCodeComponent.getTextController().mo1450b()));
                } else if (component instanceof InputDateComponent) {
                    InputDateComponent inputDateComponent = (InputDateComponent) component;
                    outMap.put(inputDateComponent.getName(), m21473E0(inputDateComponent.getDateController().m24121f()));
                } else if (component instanceof InputInternationalDbComponent) {
                    InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) component;
                    outMap.put(inputInternationalDbComponent.getName(), new ComponentParam.InternationalDbParams(inputInternationalDbComponent.getSelectedCountry(), inputInternationalDbComponent.getSelectedIdType(), inputInternationalDbComponent.getIdValue()));
                } else if (component instanceof InputMaskedTextComponent) {
                    InputMaskedTextComponent inputMaskedTextComponent = (InputMaskedTextComponent) component;
                    outMap.put(inputMaskedTextComponent.getName(), m21473E0(inputMaskedTextComponent.getTextController().mo1450b()));
                } else if (component instanceof InputSelectComponent) {
                    InputSelectComponent inputSelectComponent = (InputSelectComponent) component;
                    if (!inputSelectComponent.mo20725m().isEmpty()) {
                        outMap.put(inputSelectComponent.getName(), m21473E0(((Option) CollectionsKt.m31706d0(inputSelectComponent.mo20725m())).getValue()));
                    }
                } else if (component instanceof InputMultiSelectComponent) {
                    InputMultiSelectComponent inputMultiSelectComponent = (InputMultiSelectComponent) component;
                    if (!inputMultiSelectComponent.mo20725m().isEmpty()) {
                        String name = inputMultiSelectComponent.getName();
                        List<Option> listMo20725m = inputMultiSelectComponent.mo20725m();
                        ArrayList arrayList = new ArrayList(C7701q.m31905u(listMo20725m, 10));
                        Iterator<T> it = listMo20725m.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Option) it.next()).getValue());
                        }
                        outMap.put(name, m21474F0(arrayList));
                    }
                } else if (component instanceof InputAddressComponent) {
                    InputAddressComponent inputAddressComponent = (InputAddressComponent) component;
                    outMap.put(inputAddressComponent.getName(), new ComponentParam.Address(inputAddressComponent.getTextControllerForAddressStreet1().mo1450b(), inputAddressComponent.getTextControllerForAddressStreet2().mo1450b(), inputAddressComponent.getTextControllerForAddressCity().mo1450b(), inputAddressComponent.getTextControllerForAddressSubdivision().mo1450b(), inputAddressComponent.getTextControllerForAddressPostalCode().mo1450b()));
                } else if (component instanceof UiComponentGroup) {
                    List<UiComponent> children = ((UiComponentGroup) component).getChildren();
                    ArrayList arrayList2 = new ArrayList();
                    for (UiComponent uiComponent : children) {
                        View view = this.componentNameToView.get(uiComponent.getName());
                        ComponentView componentView2 = view == null ? null : new ComponentView(uiComponent, view);
                        if (componentView2 != null) {
                            arrayList2.add(componentView2);
                        }
                    }
                    m21485p0(initialComponentValues, outMap, arrayList2);
                } else if (component instanceof InputCheckboxComponent) {
                    InputCheckboxComponent inputCheckboxComponent = (InputCheckboxComponent) component;
                    outMap.put(inputCheckboxComponent.getName(), new ComponentParam.ComponentBoolean(inputCheckboxComponent.getTwoStateViewController().m24155b()));
                } else if (component instanceof InputCheckboxGroupComponent) {
                    InputCheckboxGroupComponent inputCheckboxGroupComponent = (InputCheckboxGroupComponent) component;
                    outMap.put(inputCheckboxGroupComponent.getName(), m21474F0(CollectionsKt.m31687M0(inputCheckboxGroupComponent.m20661k())));
                } else if (component instanceof InputRadioGroupComponent) {
                    InputRadioGroupComponent inputRadioGroupComponent = (InputRadioGroupComponent) component;
                    outMap.put(inputRadioGroupComponent.getName(), new ComponentParam.ComponentString(inputRadioGroupComponent.getTextController().mo1450b()));
                } else if (component instanceof InputNumberComponent) {
                    InputNumberComponent inputNumberComponent = (InputNumberComponent) component;
                    Number numberM24141b = inputNumberComponent.getNumberController().m24141b();
                    if (numberM24141b != null) {
                        outMap.put(inputNumberComponent.getName(), m21472D0(numberM24141b));
                    }
                } else if (component instanceof InputCurrencyComponent) {
                    InputCurrencyComponent inputCurrencyComponent = (InputCurrencyComponent) component;
                    Number numberM24141b2 = inputCurrencyComponent.getNumberController().m24141b();
                    if (numberM24141b2 != null) {
                        outMap.put(inputCurrencyComponent.getName(), m21472D0(numberM24141b2));
                    }
                } else if (component instanceof ESignatureComponent) {
                    ESignatureComponent eSignatureComponent = (ESignatureComponent) component;
                    Bitmap bitmapM24096b = eSignatureComponent.getBitmapController().m24096b();
                    outMap.put(eSignatureComponent.getName(), new ComponentParam.ESignature(bitmapM24096b != null ? C5199h.m24131g(bitmapM24096b) : null));
                } else if (component instanceof GovernmentIdNfcScanComponent) {
                    GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) component;
                    GovernmentIdNfcData governmentIdNfcDataM24135b = governmentIdNfcScanComponent.getNfcDataController().m24135b();
                    if (governmentIdNfcDataM24135b != null) {
                        Uri dg1Uri = governmentIdNfcDataM24135b.getDg1Uri();
                        String strEncodeToString2 = (dg1Uri == null || (fileM42954a3 = C11473c.m42954a(dg1Uri)) == null || (bArrM44649g3 = C11964i.m44649g(fileM42954a3)) == null) ? null : Base64.encodeToString(bArrM44649g3, 0);
                        Uri dg2Uri = governmentIdNfcDataM24135b.getDg2Uri();
                        String strEncodeToString3 = (dg2Uri == null || (fileM42954a2 = C11473c.m42954a(dg2Uri)) == null || (bArrM44649g2 = C11964i.m44649g(fileM42954a2)) == null) ? null : Base64.encodeToString(bArrM44649g2, 0);
                        Uri sodUri = governmentIdNfcDataM24135b.getSodUri();
                        if (sodUri != null && (fileM42954a = C11473c.m42954a(sodUri)) != null && (bArrM44649g = C11964i.m44649g(fileM42954a)) != null) {
                            strEncodeToString = Base64.encodeToString(bArrM44649g, 0);
                        }
                        outMap.put(governmentIdNfcScanComponent.getName(), new ComponentParam.GovernmentIdNfcScan(strEncodeToString2, strEncodeToString3, strEncodeToString, governmentIdNfcDataM24135b.getChipAuthenticationStatus()));
                    }
                } else if (component instanceof JpMyNumberNfcScanComponent) {
                    JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent = (JpMyNumberNfcScanComponent) component;
                    JpMyNumberNfcScanResult jpMyNumberNfcScanResultM24138b = jpMyNumberNfcScanComponent.getScanResultController().m24138b();
                    if (jpMyNumberNfcScanResultM24138b != null && (mapM18920g = jpMyNumberNfcScanResultM24138b.m18920g()) != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, String> entry : mapM18920g.entrySet()) {
                            if ((entry.getValue().length() > 0) != false) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (!(linkedHashMap == null || linkedHashMap.isEmpty())) {
                        outMap.put(jpMyNumberNfcScanComponent.getName(), new ComponentParam.JpMyNumberNfcScanParams(linkedHashMap));
                    }
                } else if (component instanceof MdocComponent) {
                    MdocComponent mdocComponent = (MdocComponent) component;
                    String strMo1450b = mdocComponent.getMdocDataController().mo1450b();
                    if (!StringsKt.m32182p0(strMo1450b)) {
                        outMap.put(mdocComponent.getName(), m21473E0(strMo1450b));
                    }
                } else if (component instanceof InputFileUploadComponent) {
                    InputFileUploadComponent inputFileUploadComponent = (InputFileUploadComponent) component;
                    String name2 = inputFileUploadComponent.getName();
                    List<SelectedFile> listM20697k = inputFileUploadComponent.m20697k();
                    ArrayList arrayList3 = new ArrayList(C7701q.m31905u(listM20697k, 10));
                    Iterator<T> it2 = listM20697k.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((SelectedFile) it2.next()).getUri());
                    }
                    outMap.put(name2, new ComponentParam.FileUpload(arrayList3, inputFileUploadComponent.getHasPrefill()));
                } else if (!(component instanceof ActionButtonComponent) && !(component instanceof CancelButtonComponent) && !(component instanceof CombinedStepButtonComponent) && !(component instanceof CompleteButtonComponent) && !(component instanceof LinkButtonComponent) && !(component instanceof SubmitButtonComponent) && !(component instanceof ImagePreviewComponent) && !(component instanceof LocalImageComponent) && !(component instanceof PrivacyPolicyComponent) && !(component instanceof QRCodeComponent) && !(component instanceof RemoteImageComponent) && !(component instanceof SpacerComponent) && !(component instanceof TextComponent) && !(component instanceof TitleComponent) && !(component instanceof BrandingComponent) && !(component instanceof CreatePersonaSheetComponent) && !(component instanceof VerifyPersonaButtonComponent) && !(component instanceof HelpBottomSheetComponent) && !(component instanceof PhoneNumberSnaComponent)) {
                    throw new C7345l();
                }
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m21486q0(UiWorkflow.AbstractC4142c.a rendering) {
        List<UiComponent> listM21189f = rendering.m21189f();
        ArrayList arrayList = new ArrayList();
        for (UiComponent uiComponent : listM21189f) {
            View view = this.componentNameToView.get(uiComponent.getName());
            ComponentView componentView = view == null ? null : new ComponentView(uiComponent, view);
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        m21480f0(rendering.m21189f(), m21475G0(m21482h0(arrayList)), rendering.getIsLoading());
    }

    /* JADX INFO: renamed from: r0 */
    public final void m21487r0(UiWorkflow.AbstractC4142c.a rendering, final ClickableStackComponent component, final ConstraintLayout view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: or.o3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4154g.m21460s0(component, this, view, view2);
            }
        });
        if (component.getIsActive()) {
            C7314r.m30412a(view, component.getStyles());
        } else if (rendering.getIsLoading()) {
            C7314r.m30415d(view, component.getStyles());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m21488t0(UiWorkflow.AbstractC4142c.a rendering, ViewEnvironment viewEnvironment, Map<String, ? extends Object> componentParams, Map<String, UiComponentErrorInfo> errors) {
        Object obj;
        List<UiComponent> listM21189f = rendering.m21189f();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM21189f) {
            if (obj2 instanceof SheetComponent) {
                arrayList.add(obj2);
            }
        }
        SheetComponent sheetComponentM38770d = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        int i10 = 0;
        if (sheetComponentM38770d != null) {
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
            } while (!Intrinsics.m31980c(((SheetComponent) obj).getName(), sheetComponentM38770d.getName()));
            SheetComponent sheetComponent = (SheetComponent) obj;
            if (sheetComponent != null && !sheetComponent.getShowing()) {
                this.nestedUiBottomSheetController.m38772f();
            }
        }
        if (this.nestedUiBottomSheetController.getCurrentSheetComponent() == null) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj3 = arrayList.get(i10);
                i10++;
                SheetComponent sheetComponent2 = (SheetComponent) obj3;
                if (!sheetComponent2.getShown()) {
                    sheetComponent2.mo20566p2(true);
                    this.nestedUiBottomSheetController.m38773g(sheetComponent2, viewEnvironment);
                    break;
                }
            }
        }
        SheetComponent sheetComponentM38770d2 = this.nestedUiBottomSheetController.getCurrentSheetComponent();
        if (sheetComponentM38770d2 != null) {
            m21484o1(rendering, viewEnvironment, sheetComponentM38770d2, componentParams, errors);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m21489u0(C1152g result, int firstBelowTheFoldChildIndex, FooterComponent footerComponent) {
        this.binding.f37146d.setVisibility(0);
        this.binding.f37148f.setVisibility(0);
        View footerView = result.getFooterView();
        Drawable background = footerView != null ? footerView.getBackground() : null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        int color = colorDrawable != null ? colorDrawable.getColor() : 0;
        Drawable background2 = this.binding.f37150h.getBackground();
        LayerDrawable layerDrawable = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(C9978r1.f36019k) : null;
        GradientDrawable gradientDrawable = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(color);
        }
        this.binding.f37147e.addView(result.getFooterView());
        UiComponent uiComponent = (UiComponent) CollectionsKt.m31708f0(footerComponent.getChildren(), firstBelowTheFoldChildIndex);
        final View view = this.componentNameToView.get(uiComponent != null ? uiComponent.getName() : null);
        final BottomSheetBehavior bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(this.binding.f37150h);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorM12102q0, "from(...)");
        this.binding.f37152j.setVerticalFadingEdgeEnabled(false);
        if (view != null) {
            this.binding.f37149g.setVisibility(0);
            this.binding.f37147e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: or.h3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C4154g.m21464v0(this.f35839a, view, bottomSheetBehaviorM12102q0, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        } else {
            this.binding.f37149g.setVisibility(4);
            this.binding.f37147e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: or.i3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    C4154g.m21466w0(this.f35859a, bottomSheetBehaviorM12102q0, view2, i10, i11, i12, i13, i14, i15, i16, i17);
                }
            });
        }
        bottomSheetBehaviorM12102q0.m12131c0(new b(bottomSheetBehaviorM12102q0));
    }

    /* JADX DEBUG: Class process forced to load method for inline: jq.g0.b(android.view.View, java.lang.String, kotlin.jvm.functions.Function0, android.view.View, int, int, int, java.lang.Object):void */
    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull final UiWorkflow.AbstractC4142c.a rendering, @NotNull ViewEnvironment viewEnvironment) {
        int iM30328d;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        Context context = this.binding.getRoot().getContext();
        List<UiComponent> listM21189f = rendering.m21189f();
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM21189f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            UiComponent uiComponent = (UiComponent) it.next();
            View view = this.componentNameToView.get(uiComponent.getName());
            Object componentView = view != null ? new ComponentView(uiComponent, view) : null;
            if (componentView != null) {
                arrayList.add(componentView);
            }
        }
        Map<String, ComponentParam> mapM21482h0 = m21482h0(arrayList);
        Map<String, Object> mapM21475G0 = m21475G0(mapM21482h0);
        List<UiComponentErrorInfo> listM21188e = rendering.m21188e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(C7701q.m31905u(listM21188e, 10)), 16));
        for (Object obj : listM21188e) {
            linkedHashMap.put(((UiComponentErrorInfo) obj).getName(), obj);
        }
        Integer numM21186c = rendering.m21186c();
        if (numM21186c == null || numM21186c.intValue() == 0) {
            Intrinsics.checkNotNull(context);
            iM30328d = C7288z.m30328d(context, R.attr.colorBackground, null, false, 6, null);
        } else {
            iM30328d = numM21186c.intValue();
        }
        Intrinsics.checkNotNull(context);
        C12249c.m45393b(viewEnvironment, context, iM30328d);
        this.launchNfcScan = rendering.m21195l();
        this.launchJpMyNumberNfcScan = rendering.m21194k();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ComponentView componentView2 = (ComponentView) arrayList.get(i10);
            m21476H0(rendering, componentView2.getComponent(), componentView2.getView(), mapM21475G0, linkedHashMap, viewEnvironment, this.componentNameToConfig);
        }
        NavigationState navigationStateM21198o = rendering.getNavigationState();
        Pi2NavigationBar navigationBar = this.binding.f37151i;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        CoordinatorLayout coordinatorLayoutM39625b = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b, "getRoot(...)");
        String str = this.navBarTitle;
        StepStyles.UiStepStyle uiStepStyleM21182A = rendering.getStyles();
        Rect rectM24132h = uiStepStyleM21182A != null ? C5199h.m24132h(uiStepStyleM21182A) : null;
        StepStyles.UiStepStyle uiStepStyleM21182A2 = rendering.getStyles();
        C6966c.m29334d(navigationStateM21198o, new Function0() { // from class: or.y3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4154g.m21469y0(this.f36138a, rendering);
            }
        }, new Function0() { // from class: or.e2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4154g.m21471z0(rendering);
            }
        }, new Function0() { // from class: or.f2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4154g.m21371A0(rendering, this);
            }
        }, navigationBar, coordinatorLayoutM39625b, rectM24132h, str, uiStepStyleM21182A2 != null ? uiStepStyleM21182A2.getNavBarTitleStyleValue() : null);
        CoordinatorLayout coordinatorLayoutM39625b2 = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(coordinatorLayoutM39625b2, "getRoot(...)");
        C7260g0.m30278b(coordinatorLayoutM39625b2, rendering.getError(), rendering.m21204u(), null, 0, 0, 56, null);
        this.onComplete = rendering.m21202s();
        this.onCancel = rendering.m21200q();
        this.onClick = new Function2() { // from class: or.g2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return C4154g.m21373B0(rendering, this, arrayList, (UiComponent) obj2, ((Boolean) obj3).booleanValue());
            }
        };
        this.onVerifyPersonaClick = new Function1() { // from class: or.h2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return C4154g.m21375C0(rendering, this, arrayList, (VerifyPersonaButtonComponent) obj2);
            }
        };
        UiWorkflow.AbstractC4142c.a.AutoSubmit c14149aM21185b = rendering.getAutoSubmit();
        if (c14149aM21185b != null) {
            if (c14149aM21185b.getIsReadyToSubmit()) {
                AutoSubmitableComponent autoSubmitableComponentM21210a = c14149aM21185b.getComponent();
                if ((autoSubmitableComponentM21210a instanceof ActionButtonComponent) || (autoSubmitableComponentM21210a instanceof SubmitButtonComponent)) {
                    Function2<? super UiComponent, ? super Boolean, Unit> function2 = this.onClick;
                    View view2 = this.componentNameToView.get(((ButtonComponent) autoSubmitableComponentM21210a).getName());
                    if (view2 != null && view2.getVisibility() == 0) {
                        z10 = true;
                    }
                    function2.invoke(autoSubmitableComponentM21210a, Boolean.valueOf(z10));
                } else if (autoSubmitableComponentM21210a instanceof CancelButtonComponent) {
                    this.onCancel.invoke();
                } else if (autoSubmitableComponentM21210a instanceof CompleteButtonComponent) {
                    this.onComplete.invoke();
                } else if (autoSubmitableComponentM21210a instanceof PhoneNumberSnaComponent) {
                    PhoneNumberSnaComponent phoneNumberSnaComponent = (PhoneNumberSnaComponent) autoSubmitableComponentM21210a;
                    rendering.m21201r().invoke(autoSubmitableComponentM21210a, Boolean.FALSE, C7688j0.m31791g(new Pair(phoneNumberSnaComponent.getName(), new ComponentParam.PhoneNumberSnaParams(phoneNumberSnaComponent.getCode(), phoneNumberSnaComponent.getErrorName(), phoneNumberSnaComponent.getErrorMessage()))));
                }
            } else if (c14149aM21185b.getCountdownText() != null) {
                View view3 = this.componentNameToView.get(c14149aM21185b.getComponent().getName());
                if (view3 instanceof ButtonWithLoadingIndicator) {
                    ((ButtonWithLoadingIndicator) view3).setText(c14149aM21185b.getCountdownText());
                } else if (view3 instanceof MaterialButton) {
                    ((MaterialButton) view3).setText(c14149aM21185b.getCountdownText());
                }
            }
        }
        m21488t0(rendering, viewEnvironment, mapM21482h0, linkedHashMap);
        if (!rendering.getShouldLaunchHelpBottomSheet() || rendering.getHelpBottomSheetViewModel() == null) {
            return;
        }
        this.helpBottomSheetController.m22956x(rendering.getStyles(), rendering.getHelpBottomSheetViewModel(), rendering.m21205v(), rendering.m21193j(), rendering.m21196m());
    }
}
