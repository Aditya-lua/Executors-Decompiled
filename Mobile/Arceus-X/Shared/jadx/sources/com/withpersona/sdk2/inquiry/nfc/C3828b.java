package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p152go.C6159e;
import p152go.C6176v;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p390qp.C10695i;
import p390qp.C10696j;
import p390qp.EnumC10687a;
import p390qp.EnumC10688b;
import p391qq.C10700c;
import p477ut.C11958c;
import p477ut.C11964i;
import p499vr.InterfaceC12257h;
import p525wp.C12504c;
import p581ym.InterfaceC13222o;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001>B\u008b\u0001\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Lvr/h;", "Lg/c;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "passportNfcReaderLauncher", "Landroid/content/Context;", "context", "Lwp/c;", "sandboxFlags", "Lqq/c;", "sdkFilesManager", "Lgo/e;", "featureFlagManager", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lqp/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "<init>", "(Lg/c;Landroid/content/Context;Lwp/c;Lqq/c;Lgo/e;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "otherWorker", "", "b", "(Lym/o;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lg/c;", "c", "Landroid/content/Context;", "d", "Lwp/c;", "e", "Lqq/c;", "f", "Lgo/e;", "g", "Ljava/lang/String;", "h", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "i", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "j", "Ljava/util/List;", "k", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "l", "Ljava/lang/Integer;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "a", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3828b implements InterfaceC13222o<PassportNfcReaderOutput>, InterfaceC12257h<PassportNfcReaderOutput> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AbstractC5854c<PassportNfcReaderConfig> passportNfcReaderLauncher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C12504c sandboxFlags;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C10700c sdkFilesManager;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C6159e featureFlagManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String cardAccessNumber;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final MrzKey mrzKey;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final PassportNfcStrings passportNfcStrings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final List<EnumC10688b> enabledDataGroups;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final Integer theme;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b$a */
    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JU\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/b$a;", "", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lqp/b;", "enabledDataGroups", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "Lcom/withpersona/sdk2/inquiry/nfc/b;", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)Lcom/withpersona/sdk2/inquiry/nfc/b;", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        @NotNull
        /* JADX INFO: renamed from: a */
        C3828b mo18997a(@NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends EnumC10688b> enabledDataGroups, @Nullable StepStyles.UiStepStyle styles, @Nullable Integer theme, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles);
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.b$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1", m39664f = "ScanNfcWorker.kt", m39665l = {68, 94, 98, 103}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC9577i<? super PassportNfcReaderOutput>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f15751t;

        /* JADX INFO: renamed from: u */
        public Object f15752u;

        /* JADX INFO: renamed from: v */
        public Object f15753v;

        /* JADX INFO: renamed from: w */
        public int f15754w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f15755x;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            b bVar = C3828b.this.new b(interfaceC9557b);
            bVar.f15755x = obj;
            return bVar;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0183 */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:73:0x0010 */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f0, code lost:
        
            if (r0.emit(r8, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0180, code lost:
        
            if (p256ku.C7946z0.m32938b(r6, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
        
            if (r0.emit(r3, r17) == r2) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [int] */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM37804u;
            InterfaceC9577i interfaceC9577i = (InterfaceC9577i) this.f15755x;
            Object objM38805e = C10047c.m38805e();
            ?? r8 = this.f15754w;
            try {
                if (r8 != 0) {
                    if (r8 == 1) {
                        C7348o.m30470b(obj);
                        return Unit.f29331a;
                    }
                    if (r8 == 2) {
                        C7348o.m30470b(obj);
                        objM37804u = obj;
                        PassportNfcReaderOutput passportNfcReaderOutput = (PassportNfcReaderOutput) objM37804u;
                        long integer = C3828b.this.context.getResources().getInteger(C10696j.f38221a);
                        this.f15755x = interfaceC9577i;
                        this.f15751t = passportNfcReaderOutput;
                        this.f15754w = 3;
                        r8 = passportNfcReaderOutput;
                    } else if (r8 == 3) {
                        PassportNfcReaderOutput passportNfcReaderOutput2 = (PassportNfcReaderOutput) this.f15751t;
                        C7348o.m30470b(obj);
                        r8 = passportNfcReaderOutput2;
                    } else {
                        if (r8 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                    }
                    return Unit.f29331a;
                }
                C7348o.m30470b(obj);
                if (C3828b.this.sandboxFlags.m46821b()) {
                    File fileM40782e = C3828b.this.sdkFilesManager.m40782e(".dat");
                    FileOutputStream fileOutputStream = new FileOutputStream(fileM40782e);
                    try {
                        C11964i.m44653k(fileM40782e, "this_is_some_fake_dg1_data", null, 2, null);
                        Unit unit = Unit.f29331a;
                        C11958c.m44629a(fileOutputStream, null);
                        File fileM40782e2 = C3828b.this.sdkFilesManager.m40782e(".dat");
                        FileOutputStream fileOutputStream2 = new FileOutputStream(fileM40782e2);
                        try {
                            C11964i.m44653k(fileM40782e2, "this_is_some_fake_dg2_data", null, 2, null);
                            C11958c.m44629a(fileOutputStream2, null);
                            File fileM40782e3 = C3828b.this.sdkFilesManager.m40782e(".dat");
                            FileOutputStream fileOutputStream3 = new FileOutputStream(fileM40782e3);
                            try {
                                C11964i.m44653k(fileM40782e3, "this_is_some_fake_sod_data", null, 2, null);
                                C11958c.m44629a(fileOutputStream3, null);
                                Toast.makeText(C3828b.this.context, "Using simulated government ID NFC data", 0).show();
                                PassportNfcReaderOutput.Success success = new PassportNfcReaderOutput.Success(Uri.fromFile(fileM40782e), Uri.fromFile(fileM40782e2), Uri.fromFile(fileM40782e3), EnumC10687a.NotRequested, C3828b.this.passportNfcStrings.getSuccessfulScanTransitionComponentName());
                                this.f15755x = C10350l.m39676a(interfaceC9577i);
                                this.f15751t = C10350l.m39676a(fileM40782e);
                                this.f15752u = C10350l.m39676a(fileM40782e2);
                                this.f15753v = C10350l.m39676a(fileM40782e3);
                                this.f15754w = 1;
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    C11958c.m44629a(fileOutputStream3, th2);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                C11958c.m44629a(fileOutputStream2, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            C11958c.m44629a(fileOutputStream, th6);
                            throw th7;
                        }
                    }
                } else {
                    C3828b.this.passportNfcReaderLauncher.m26240b(new PassportNfcReaderConfig(C3828b.this.cardAccessNumber, C3828b.this.mrzKey, C3828b.this.passportNfcStrings, C3828b.this.enabledDataGroups, C3828b.this.theme, C3828b.this.stepStyles, C3828b.this.componentStyles, C3828b.this.featureFlagManager.m27145a(C6176v.f23555a)));
                    C10695i c10695i = new C10695i();
                    this.f15755x = interfaceC9577i;
                    this.f15754w = 2;
                    objM37804u = C9579j.m37804u(c10695i, this);
                    if (objM37804u != objM38805e) {
                        PassportNfcReaderOutput passportNfcReaderOutput3 = (PassportNfcReaderOutput) objM37804u;
                        long integer2 = C3828b.this.context.getResources().getInteger(C10696j.f38221a);
                        this.f15755x = interfaceC9577i;
                        this.f15751t = passportNfcReaderOutput3;
                        this.f15754w = 3;
                        r8 = passportNfcReaderOutput3;
                    }
                }
                return objM38805e;
            } catch (Resources.NotFoundException unused) {
            }
            this.f15755x = C10350l.m39676a(interfaceC9577i);
            this.f15751t = C10350l.m39676a(r8);
            this.f15754w = 4;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super PassportNfcReaderOutput> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends qp.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3828b(@NotNull AbstractC5854c<PassportNfcReaderConfig> passportNfcReaderLauncher, @NotNull Context context, @NotNull C12504c sandboxFlags, @NotNull C10700c sdkFilesManager, @NotNull C6159e featureFlagManager, @NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends EnumC10688b> enabledDataGroups, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable Integer num, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.sdkFilesManager = sdkFilesManager;
        this.featureFlagManager = featureFlagManager;
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.stepStyles = uiStepStyle;
        this.theme = num;
        this.componentStyles = governmentIdNfcScanStyles;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: a */
    public boolean mo7572a(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7572a(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o
    /* JADX INFO: renamed from: b */
    public boolean mo7573b(@NotNull InterfaceC13222o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return otherWorker instanceof C3828b;
    }

    @Override // p499vr.InterfaceC12257h
    /* JADX INFO: renamed from: c */
    public boolean mo7574c(@NotNull InterfaceC12257h<?> interfaceC12257h) {
        return super.mo7574c(interfaceC12257h);
    }

    @Override // p581ym.InterfaceC13222o, p499vr.InterfaceC12257h
    @NotNull
    public InterfaceC9575h<PassportNfcReaderOutput> run() {
        return C9579j.m37806w(new b(null));
    }
}
