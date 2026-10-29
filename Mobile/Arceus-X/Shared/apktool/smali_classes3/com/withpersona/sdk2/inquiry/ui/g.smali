.class public final Lcom/withpersona/sdk2/inquiry/ui/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ResourceType"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/ui/g$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lan/k<",
        "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fe\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 \u0086\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0087\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJG\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JO\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000eH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019Jk\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008!\u0010\"J9\u0010\'\u001a\u00020\u000b2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J7\u0010)\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008)\u0010*J/\u0010+\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008+\u0010,J7\u0010-\u001a\u00020\u000b*\u00020\u001b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0017\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008-\u0010*J%\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001a0#H\u0002\u00a2\u0006\u0004\u00080\u00101J\'\u00106\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0002\u00a2\u0006\u0004\u00086\u00107J\'\u0010:\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u0002082\u0006\u0010\u001c\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008:\u0010;J)\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000e2\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020<0#H\u0002\u00a2\u0006\u0004\u0008>\u0010?JE\u0010D\u001a\u00020\u000b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0A2\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020<0#H\u0002\u00a2\u0006\u0004\u0008D\u0010EJ\u0013\u0010G\u001a\u00020F*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008G\u0010HJ\u0013\u0010K\u001a\u00020J*\u00020IH\u0002\u00a2\u0006\u0004\u0008K\u0010LJ\u0019\u0010N\u001a\u00020M*\u0008\u0012\u0004\u0012\u00020\u000f0#H\u0002\u00a2\u0006\u0004\u0008N\u0010OJ+\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e*\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020=0\u000eH\u0002\u00a2\u0006\u0004\u0008P\u0010QR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR \u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001d0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010UR\u0016\u0010Z\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010eR\u0014\u0010j\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010m\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010lR\u001c\u0010q\u001a\u0008\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u001c\u0010s\u001a\u0008\u0012\u0004\u0012\u00020\u000b0n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010pR(\u0010w\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000b0t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008u\u0010vR\"\u0010|\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\"\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020}\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010{R%\u0010\u0082\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020\u000b0x8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010{R#\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u00a8\u0006\u0088\u0001"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/g;",
        "Lan/k;",
        "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
        "Lpr/a;",
        "binding",
        "initialRendering",
        "<init>",
        "(Lpr/a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V",
        "rendering",
        "Lan/y;",
        "viewEnvironment",
        "",
        "x0",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V",
        "",
        "",
        "",
        "componentParams",
        "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;",
        "errors",
        "t0",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Ljava/util/Map;Ljava/util/Map;)V",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;",
        "component",
        "o1",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "Landroid/view/View;",
        "view",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
        "componentNameToConfig",
        "H0",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V",
        "q0",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V",
        "",
        "components",
        "",
        "isLoading",
        "f0",
        "(Ljava/util/List;Ljava/util/Map;Z)V",
        "c0",
        "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V",
        "e0",
        "(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V",
        "d0",
        "Lar/g;",
        "result",
        "g0",
        "(Lar/g;Ljava/util/List;)V",
        "",
        "firstBelowTheFoldChildIndex",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;",
        "footerComponent",
        "u0",
        "(Lar/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "r0",
        "(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V",
        "Lar/a;",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
        "h0",
        "(Ljava/util/List;)Ljava/util/Map;",
        "initialComponentValues",
        "",
        "outMap",
        "componentViews",
        "p0",
        "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;",
        "E0",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;",
        "",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;",
        "D0",
        "(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;",
        "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;",
        "F0",
        "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;",
        "G0",
        "(Ljava/util/Map;)Ljava/util/Map;",
        "b",
        "Lpr/a;",
        "c",
        "Ljava/util/Map;",
        "componentNameToView",
        "d",
        "e",
        "Ljava/lang/String;",
        "navBarTitle",
        "Lhr/j;",
        "f",
        "Lhr/j;",
        "inputSelectBottomSheetController",
        "Lor/a2;",
        "g",
        "Lor/a2;",
        "signatureBottomSheetController",
        "Lor/q1;",
        "h",
        "Lor/q1;",
        "nestedUiBottomSheetController",
        "Ldr/n;",
        "i",
        "Ldr/n;",
        "helpBottomSheetController",
        "j",
        "Z",
        "hasScrolledToBottom",
        "Lkotlin/Function0;",
        "k",
        "Lkotlin/jvm/functions/Function0;",
        "onComplete",
        "l",
        "onCancel",
        "Lkotlin/Function2;",
        "m",
        "Lkotlin/jvm/functions/Function2;",
        "onClick",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;",
        "n",
        "Lkotlin/jvm/functions/Function1;",
        "launchNfcScan",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;",
        "o",
        "launchJpMyNumberNfcScan",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;",
        "p",
        "onVerifyPersonaClick",
        "i0",
        "()Ljava/util/Map;",
        "uiStateValues",
        "q",
        "a",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final q:Lcom/withpersona/sdk2/inquiry/ui/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final b:Lpr/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Lhr/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lor/a2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lor/q1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Ldr/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Z

.field public k:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public l:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public p:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/ui/g;->q:Lcom/withpersona/sdk2/inquiry/ui/g$a;

    return-void
.end method

.method public constructor <init>(Lpr/a;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 11
    .param p1    # Lpr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialRendering"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->e:Ljava/lang/String;

    new-instance v0, Lhr/j;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lhr/j;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->f:Lhr/j;

    new-instance v0, Lor/a2;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lor/a2;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->g:Lor/a2;

    new-instance v0, Lor/q1;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lor/q1;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    new-instance v0, Ldr/n;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ldr/n;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->i:Ldr/n;

    new-instance v0, Lor/d2;

    invoke-direct {v0}, Lor/d2;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->k:Lkotlin/jvm/functions/Function0;

    new-instance v0, Lor/o2;

    invoke-direct {v0}, Lor/o2;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->l:Lkotlin/jvm/functions/Function0;

    new-instance v0, Lor/z2;

    invoke-direct {v0}, Lor/z2;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    new-instance v0, Lor/k3;

    invoke-direct {v0}, Lor/k3;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->n:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lor/t3;

    invoke-direct {v0}, Lor/t3;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->o:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lor/u3;

    invoke-direct {v0}, Lor/u3;-><init>()V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->p:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget-object v3, Lar/s;->a:Lar/s;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v5, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->d()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v1

    :cond_0
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v6

    invoke-direct {v5, v0, v1, v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;-><init>(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v6

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lar/s;->h(Lar/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;ZZZILjava/lang/Object;)Lar/g;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->c()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, p1, Lpr/a;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    invoke-virtual {p2, v4}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v3, p1, Lpr/a;->k:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p1, Lpr/a;->c:Landroid/widget/FrameLayout;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_2
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->h()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object p1, p1, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {p1, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->setControlsColor(I)V

    :cond_3
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->d()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/b;->j(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object p1

    :cond_5
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->d:Ljava/util/Map;

    invoke-virtual {v0}, Lar/g;->c()Lar/h;

    move-result-object p1

    invoke-virtual {p1}, Lar/h;->a()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/j0;->f(I)I

    move-result v1

    const/16 v3, 0x10

    invoke-static {v1, v3}, Lkotlin/ranges/d;->c(II)I

    move-result v1

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lar/a;

    invoke-virtual {v1}, Lar/a;->d()Landroid/view/View;

    move-result-object v1

    invoke-static {v4, v1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Lar/g;->a()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->y()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;

    move-result-object p1

    sget-object v1, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;->CENTER:Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;

    if-ne p1, v1, :cond_7

    new-instance p1, Landroidx/constraintlayout/widget/c;

    invoke-direct {p1}, Landroidx/constraintlayout/widget/c;-><init>()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v1, v1, Lpr/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/c;->f(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v1, v1, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v3, v3, Lpr/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    const/4 v4, 0x4

    invoke-virtual {p1, v1, v4, v3, v4}, Landroidx/constraintlayout/widget/c;->h(IIII)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v1, v1, Lpr/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v1}, Landroidx/constraintlayout/widget/c;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_7
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v3, p1, Lpr/a;->l:Landroid/widget/FrameLayout;

    const-string p1, "uiStepContainer"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Ljr/p;->b(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZZILjava/lang/Object;)V

    invoke-virtual {v0}, Lar/g;->b()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->g0(Lar/g;Ljava/util/List;)V

    :cond_8
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    invoke-virtual {p1}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lor/v3;

    invoke-direct {v1, v0, p0}, Lor/v3;-><init>(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-static {p1, v1}, Lwq/g;->g(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    new-instance v0, Lor/w3;

    invoke-direct {v0, p0, p2}, Lor/w3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    invoke-virtual {p1, v0}, Landroidx/core/widget/NestedScrollView;->setOnScrollChangeListener(Landroidx/core/widget/NestedScrollView$e;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    new-instance v0, Lor/x3;

    invoke-direct {v0, p0, p2}, Lor/x3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic A(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->O0(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 7

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->i:Ldr/n;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->v()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->j()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->m()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Ldr/n;->x(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ldr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->p1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;
    .locals 1

    const-string v0, "tappedComponent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->r()Lzt/n;

    move-result-object p0

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->h0(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p3, p4, p1}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/ui/g;->S0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V

    return-void
.end method

.method public static final C0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->x()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->h0(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p0, p3, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->T0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->L0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->y0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->n1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/ui/g;->Y(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Landroidx/core/widget/NestedScrollView;IIII)V

    return-void
.end method

.method public static synthetic I(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->X0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->k:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic J(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->K0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static final J0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic K(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->i1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    return-void
.end method

.method public static final K0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->U0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static final L0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;Landroid/view/View;)V
    .locals 1

    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    check-cast p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {p2, v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic M(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->X(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->l:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic N(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->q1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->p:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->k1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    return-void
.end method

.method public static final O0(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 2

    sget-object v0, Lfr/a;->a:Lfr/a;

    invoke-virtual {v0, p0}, Lfr/a;->b(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/ui/g$d;->a:Lcom/withpersona/sdk2/inquiry/ui/g$d;

    const-class v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    invoke-static {p1, v1, v0}, Ler/h;->a(Ljava/util/List;Lhu/c;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    if-eqz p1, :cond_1

    iget-object p2, p2, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic P(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->o0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P0(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lbr/a;Ljava/util/List;Lgr/d;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;",
            "Lbr/a;",
            "Ljava/util/List<",
            "+",
            "Lcom/google/android/material/textfield/TextInputLayout;",
            ">;",
            "Lgr/d;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    new-instance v0, Lor/p3;

    move-object v3, p0

    move-object v1, p2

    move-object v2, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lor/p3;-><init>(Ljava/util/List;Lgr/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)V

    invoke-virtual {v3, v0}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public static synthetic Q(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/withpersona/sdk2/inquiry/ui/g;->v0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static final Q0(Ljava/util/List;Lgr/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    const/4 p7, 0x0

    if-eqz p6, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p6, p7}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lgr/d;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    invoke-virtual {p0, p7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string p1, "getContext(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ljq/g;->d(Landroid/content/Context;)V

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->w()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-interface {p5, p8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;->f()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p4, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic R(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLandroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->h1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLandroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->m1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V

    return-void
.end method

.method public static synthetic S()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/ui/g;->l0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final S0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->m1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V

    return-void
.end method

.method public static synthetic T(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->d1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final T0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->getText()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->m0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final U0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 10

    move-object p2, p0

    check-cast p2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->n()Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;

    move-result-object v3

    instance-of p2, v3, Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$GoogleWalletRequestMetadata;

    if-eqz p2, :cond_1

    sget-object p2, Le3/o;->a:Le3/o$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Le3/o$a;->a(Landroid/content/Context;)Le3/o;

    move-result-object p2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljq/g;->a(Landroid/content/Context;)Lj/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v6

    if-eqz v6, :cond_0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/g$c;

    const/4 v5, 0x0

    move-object v4, p0

    move-object v2, p1

    move-object v1, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/ui/g$c;-><init>(Le3/o;Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lnt/b;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, v6

    const/4 v6, 0x0

    move-object v7, v0

    invoke-static/range {v4 .. v9}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_0
    return-void

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic V(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/ui/g;->B0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final V0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic W(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->V0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static final W0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 2

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->m()Lcr/w1;

    move-result-object v0

    new-instance v1, Lor/q3;

    invoke-direct {v1, p0}, Lor/q3;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->a1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final X(Lar/g;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/core/view/WindowInsetsCompat;)Lkotlin/Unit;
    .locals 6

    const-string v0, "insets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/core/view/WindowInsetsCompat;->getInsetsIgnoringVisibility(I)Landroidx/core/graphics/Insets;

    move-result-object v0

    const-string v1, "getInsetsIgnoringVisibility(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->ime()I

    move-result v1

    invoke-virtual {p2, v1}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object p2

    const-string v1, "getInsets(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p2, Landroidx/core/graphics/Insets;->bottom:I

    iget v1, v0, Landroidx/core/graphics/Insets;->top:I

    iget v2, v0, Landroidx/core/graphics/Insets;->bottom:I

    invoke-static {v2, p2}, Ljava/lang/Integer;->max(II)I

    move-result p2

    iget v2, v0, Landroidx/core/graphics/Insets;->left:I

    iget v3, v0, Landroidx/core/graphics/Insets;->right:I

    invoke-virtual {p0}, Lar/g;->b()Landroid/view/View;

    move-result-object p0

    if-nez p0, :cond_0

    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p0, v2, v1, v3, p2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    :cond_0
    iget-object v4, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v4, v4, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    const-string v5, "nestedScroll"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v4, v2, v1, v3, v5}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0, v2, v1, v3, p2}, Landroid/view/View;->setPadding(IIII)V

    :goto_0
    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->d:Lcom/google/android/material/divider/MaterialDivider;

    const-string v1, "footerDivider"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroidx/core/graphics/Insets;->bottom:I

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->f:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    const-string p1, "footerSheetCoordinatorLayout"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p1

    invoke-virtual {p0, v2, p1, v3, p2}, Landroid/view/View;->setPadding(IIII)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final X0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->k()Ler/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ler/m;->c(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->s()Ler/m;

    move-result-object p1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Ler/m;->c(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->v()Lan/r;

    move-result-object p0

    const-string p1, ""

    invoke-interface {p0, p1}, Lan/r;->c(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Y(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Landroidx/core/widget/NestedScrollView;IIII)V
    .locals 0

    const-string p3, "<unused var>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->a0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    return-void
.end method

.method public static final Y0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 2

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->t()Lcr/w1;

    move-result-object v0

    new-instance v1, Lor/j3;

    invoke-direct {v1, p0}, Lor/j3;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->a1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Z(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->a0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    return-void
.end method

.method public static final Z0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->s()Ler/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Ler/m;->c(Ljava/util/List;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->v()Lan/r;

    move-result-object p0

    const-string p1, ""

    invoke-interface {p0, p1}, Lan/r;->c(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 2

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->j:Z

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->q0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    :cond_0
    return-void
.end method

.method public static final a1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcr/w1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/g;",
            "Lcr/w1;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->f:Lhr/j;

    new-instance v1, Lor/s3;

    invoke-direct {v1, p0, p2}, Lor/s3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v1}, Lhr/j;->t(Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->s0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic b0(Lcom/withpersona/sdk2/inquiry/ui/g;)Lpr/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    return-object p0
.end method

.method public static final b1(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;
    .locals 2

    const-string v0, "selectedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    move-object p0, p2

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic c(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->j0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 2

    move-object v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->o()Lcr/w1;

    move-result-object v0

    new-instance v1, Lor/n3;

    invoke-direct {v1, p0}, Lor/n3;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-static {p1, v0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->e1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;Lgr/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/withpersona/sdk2/inquiry/ui/g;->Q0(Ljava/util/List;Lgr/d;Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static final d1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->n()Ler/m;

    move-result-object p0

    invoke-virtual {p0, p1}, Ler/m;->c(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic e(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/withpersona/sdk2/inquiry/ui/g;->w0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static final e1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcr/w1;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/g;",
            "Lcr/w1;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->f:Lhr/j;

    new-instance v1, Lor/r3;

    invoke-direct {v1, p0, p2}, Lor/r3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v1}, Lhr/j;->t(Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->r1(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V

    return-void
.end method

.method public static final f1(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;
    .locals 2

    const-string v0, "selectedItems"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    move-object p0, p2

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->j1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V

    return-void
.end method

.method public static final g1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Landroid/view/View;)V
    .locals 7

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p5, p5, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {p5}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object p5

    const/4 v0, 0x0

    invoke-virtual {p5, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p5, p5, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const/4 v0, 0x4

    invoke-virtual {p5, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p5, p5, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {p5, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->g:Lor/a2;

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v4

    new-instance v6, Lor/l3;

    invoke-direct {v6, p0, p1}, Lor/l3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    move-object v3, p2

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Lor/a2;->p(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lan/y;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static synthetic h()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/ui/g;->n0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final h1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;ZLandroid/graphics/Bitmap;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    if-nez p2, :cond_0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->a()Ler/c;

    move-result-object p0

    invoke-virtual {p0, p3}, Ler/c;->c(Landroid/graphics/Bitmap;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->n:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->N0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    return-void
.end method

.method public static final j0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 6

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object v0, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->i:Ldr/n;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->v()Lkotlin/jvm/functions/Function0;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->j()Lkotlin/jvm/functions/Function0;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->m()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Ldr/n;->x(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ldr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    :cond_0
    return-void
.end method

.method public static synthetic k(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->C0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->o:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->f1(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final l1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->b1(Lcom/withpersona/sdk2/inquiry/ui/g;Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)Lkotlin/Unit;
    .locals 0

    const-string p1, "<unused var>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/g;",
            "Lcom/google/android/material/textfield/TextInputLayout;",
            "Lcr/w1;",
            "Lcr/w3<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->f:Lhr/j;

    new-instance v1, Lor/m3;

    invoke-direct {v1, p0, p1, p3}, Lor/m3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;)V

    invoke-virtual {v0, p2, v1}, Lhr/j;->t(Lcr/w1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->z0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final n1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w3;Ljava/util/List;)Lkotlin/Unit;
    .locals 2

    const-string v0, "selectedItems"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;->getBackButton()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    invoke-virtual {p1, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->l:Landroid/widget/FrameLayout;

    invoke-virtual {p0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-interface {p2}, Lcr/w3;->a()Ler/m;

    move-result-object p0

    invoke-virtual {p0, p3}, Ler/m;->c(Ljava/util/List;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->l1(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->M0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V

    return-void
.end method

.method public static final p1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->t()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->I0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;)V

    return-void
.end method

.method public static final q1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {p0}, Lor/q1;->f()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->W0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r1(Lkotlin/jvm/functions/Function1;Lar/a;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p1}, Lar/a;->c()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->Z(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    return-void
.end method

.method public static final s0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;)V
    .locals 0

    const/4 p3, 0x1

    invoke-virtual {p0, p3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;->k(Z)V

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/ui/g;->R0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->A0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->J0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static final v0(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p3, p3, Lpr/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p3}, Landroid/view/View;->getBottom()I

    move-result p3

    new-instance p4, Landroid/graphics/Rect;

    invoke-direct {p4}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, p4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p5, p5, Lpr/a;->h:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {p5, p1, p4}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u0()I

    move-result p1

    iget p4, p4, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2, p4}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S0(I)V

    invoke-virtual {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u0()I

    move-result p4

    if-eq p1, p4, :cond_0

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    iget-object p5, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p5, p5, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p5}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    invoke-virtual {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u0()I

    move-result p6

    invoke-virtual {p1, p4, p5, p0, p6}, Landroid/view/View;->setPadding(IIII)V

    :cond_0
    invoke-virtual {p2, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q0(I)V

    return-void
.end method

.method public static synthetic w(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->Z0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p2, p2, Lpr/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->S0(I)V

    invoke-virtual {p1, p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q0(I)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    iget-object p4, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p4, p4, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p4}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p0, p0, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    invoke-virtual {p1, p3, p4, p0, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static synthetic x(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/ui/g;->g1(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->Y0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y0(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;
    .locals 2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->f:Lhr/j;

    invoke-virtual {v0}, Lhr/j;->l()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->g:Lor/a2;

    invoke-virtual {v0}, Lor/a2;->h()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->i:Ldr/n;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Ldr/n;->o(Ldr/n;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->o()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;->f()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->p()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->q()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic z(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->k0(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->q()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final D0(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public final E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final F0(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final G0(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/j0;->f(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/d;->c(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/ui/network/a;->a(Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final H0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;",
            ">;",
            "Lan/y;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v1, p5

    move-object/from16 v7, p7

    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;

    const-string v3, "null cannot be cast to non-null type android.widget.Button"

    if-eqz v2, :cond_0

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    check-cast v1, Landroid/widget/Button;

    new-instance v2, Lor/l2;

    invoke-direct {v2, v0}, Lor/l2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void

    :cond_0
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator"

    if-eqz v2, :cond_2

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    check-cast v1, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    new-instance v2, Lor/x2;

    invoke-direct {v2, v0, v6, v8}, Lor/x2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v6

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;->Y0()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v1, v10}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void

    :cond_2
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    if-eqz v2, :cond_4

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    check-cast v1, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    new-instance v2, Lor/y2;

    invoke-direct {v2, v0, v6, v8}, Lor/y2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, v6

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;->Y0()Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v10, 0x1

    goto :goto_1

    :cond_3
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v1, v10}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void

    :cond_4
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;

    if-eqz v2, :cond_5

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    check-cast v1, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    new-instance v2, Lor/a3;

    invoke-direct {v2, v6, v1}, Lor/a3;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;)V

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void

    :cond_5
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;

    if-eqz v2, :cond_6

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v8

    check-cast v1, Landroid/widget/Button;

    new-instance v2, Lor/b3;

    invoke-direct {v2, v0}, Lor/b3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void

    :cond_6
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    if-eqz v2, :cond_a

    new-instance v1, Lor/c3;

    invoke-direct {v1, v0, v6}, Lor/c3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-virtual {v8, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    instance-of v1, v8, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    if-eqz v1, :cond_7

    move-object v12, v8

    check-cast v12, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    goto :goto_2

    :cond_7
    const/4 v12, 0x0

    :goto_2
    if-eqz v12, :cond_9

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    if-eqz v1, :cond_8

    move-object v1, v6

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;->Y0()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v10, 0x1

    goto :goto_3

    :cond_8
    const/4 v10, 0x0

    :goto_3
    invoke-virtual {v12, v10}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    :cond_9
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_a
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;

    const-string v3, "null cannot be cast to non-null type com.google.android.material.textfield.TextInputLayout"

    if-eqz v2, :cond_e

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v8

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_b

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_4

    :cond_b
    const/4 v1, 0x0

    :goto_4
    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v3, :cond_c

    const/4 v1, 0x0

    :cond_c
    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :cond_d
    const/4 v12, 0x0

    :goto_5
    move-object v1, v6

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;->k()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    invoke-static {v2, v12, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_e
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;

    if-eqz v2, :cond_12

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v8

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_f

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_6

    :cond_f
    const/4 v1, 0x0

    :goto_6
    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v3, :cond_10

    const/4 v1, 0x0

    :cond_10
    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v12

    goto :goto_7

    :cond_11
    const/4 v12, 0x0

    :goto_7
    move-object v1, v6

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;->k()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    invoke-static {v2, v12, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_12
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;

    if-eqz v2, :cond_13

    move-object v1, v6

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->k()Lfr/c;

    move-result-object v1

    new-instance v2, Lor/d3;

    invoke-direct {v2, v8, v5, v0}, Lor/d3;-><init>(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-virtual {v1, v2}, Lfr/c;->c(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v6, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_13
    instance-of v2, v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    const/16 v4, 0xa

    if-eqz v2, :cond_27

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiAddressFieldBinding"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/d;

    iget-object v3, v2, Lgr/d;->f:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v14, v2, Lgr/d;->n:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v15, v2, Lgr/d;->b:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v12, v2, Lgr/d;->m:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v11, v2, Lgr/d;->l:Lcom/google/android/material/textfield/TextInputLayout;

    filled-new-array {v3, v14, v15, v12, v11}, [Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object v11, v6

    check-cast v11, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v7, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v12, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.InputAddress"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v7

    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_14

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v14

    invoke-virtual {v1, v14, v15}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_8

    :cond_14
    const/4 v1, 0x0

    :goto_8
    instance-of v7, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;

    if-nez v7, :cond_15

    const/4 v1, 0x0

    :cond_15
    move-object v14, v1

    check-cast v14, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->A()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_16

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v1

    :cond_16
    move-object v7, v1

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v15, "getContext(...)"

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v15, v7

    check-cast v15, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v15, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v13, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_17
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->M0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;

    move-result-object v13

    if-eqz v13, :cond_18

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v13

    if-eqz v13, :cond_18

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getFocusedTextBasedStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v13

    goto :goto_a

    :cond_18
    const/4 v13, 0x0

    :goto_a
    new-instance v15, Lbr/a;

    const v10, 0x1090003

    invoke-direct {v15, v1, v10, v4, v13}, Lbr/a;-><init>(Landroid/content/Context;ILjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v1, v2, Lgr/d;->g:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    const-string v4, "addressFieldExpandedTextView"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v2

    move-object v2, v15

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/g;->P0(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lbr/a;Ljava/util/List;Lgr/d;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)V

    iget-object v1, v4, Lgr/d;->e:Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;

    const-string v5, "addressFieldCollapsedTextView"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/g;->P0(Lcom/google/android/material/textfield/MaterialAutoCompleteTextView;Lbr/a;Ljava/util/List;Lgr/d;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Ljava/util/List;)V

    move-object v10, v6

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->I()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    move-object v1, v3

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    goto :goto_b

    :cond_19
    iget-object v1, v4, Lgr/d;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1a
    if-eqz v14, :cond_1b

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v11, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->K(Ljava/lang/Boolean;)V

    :cond_1b
    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->J()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-object v1, v4, Lgr/d;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v4, Lgr/d;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v4, Lgr/d;->k:Landroid/widget/TextView;

    iget-object v2, v4, Lgr/d;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setLabelFor(I)V

    goto :goto_c

    :cond_1c
    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->J()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->J()Ljava/lang/Boolean;

    move-result-object v1

    if-nez v1, :cond_1e

    :cond_1d
    iget-object v1, v4, Lgr/d;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v4, Lgr/d;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v4, Lgr/d;->k:Landroid/widget/TextView;

    iget-object v2, v4, Lgr/d;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setLabelFor(I)V

    :cond_1e
    :goto_c
    invoke-virtual {v0, v8, v9, v10}, Lcom/withpersona/sdk2/inquiry/ui/g;->e0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v3

    invoke-virtual {v0, v2, v9, v10, v3}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    goto :goto_d

    :cond_1f
    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputAddress$AddressComponentStyle;->getInputTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v1

    goto :goto_e

    :cond_20
    const/4 v1, 0x0

    :goto_e
    iget-object v2, v4, Lgr/d;->d:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "addressFieldCollapsed"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "street_1"

    if-eqz v14, :cond_21

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_f

    :cond_21
    const/4 v5, 0x0

    :goto_f
    invoke-static {v2, v5, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v4, Lgr/d;->f:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "addressFieldExpanded"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_22

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_10

    :cond_22
    const/4 v3, 0x0

    :goto_10
    invoke-static {v2, v3, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v4, Lgr/d;->n:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "addressSuite"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_23

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v3

    const-string v5, "street_2"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_11

    :cond_23
    const/4 v3, 0x0

    :goto_11
    invoke-static {v2, v3, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v4, Lgr/d;->b:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "addressCity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_24

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v3

    const-string v5, "city"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_12

    :cond_24
    const/4 v3, 0x0

    :goto_12
    invoke-static {v2, v3, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v4, Lgr/d;->m:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "addressSubdivision"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_25

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v3

    const-string v5, "subdivision"

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_13

    :cond_25
    const/4 v3, 0x0

    :goto_13
    invoke-static {v2, v3, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v4, Lgr/d;->l:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "addressPostalCode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v14, :cond_26

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputAddressComponentError;->getMessage()Ljava/util/Map;

    move-result-object v3

    const-string v4, "postal_code"

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Ljava/lang/String;

    goto :goto_14

    :cond_26
    const/4 v12, 0x0

    :goto_14
    invoke-static {v2, v12, v1}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_27
    move-object v10, v6

    const/4 v5, 0x1

    instance-of v2, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;

    if-nez v2, :cond_28

    instance-of v2, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;

    if-eqz v2, :cond_29

    :cond_28
    move-object v2, v1

    move-object/from16 v1, p1

    goto/16 :goto_54

    :cond_29
    instance-of v2, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;

    const-string v6, "findViewById(...)"

    const-string v11, ""

    if-eqz v2, :cond_30

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputRadioGroupBinding"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/n;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_2a

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_15

    :cond_2a
    const/4 v1, 0x0

    :goto_15
    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v3, :cond_2b

    const/4 v1, 0x0

    :cond_2b
    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v1, :cond_2c

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v12

    goto :goto_16

    :cond_2c
    const/4 v12, 0x0

    :goto_16
    iget-object v1, v2, Lgr/n;->c:Landroid/widget/TextView;

    const-string v2, "radioGroupError"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v12, :cond_2d

    invoke-static {v12}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2e

    :cond_2d
    const/16 v2, 0x8

    goto :goto_17

    :cond_2e
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_18

    :goto_17
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_18
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget v1, Lar/d;->u0:I

    invoke-virtual {v8, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewGroup;

    invoke-static {v1}, Landroidx/core/view/u0;->a(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v3

    invoke-virtual {v0, v2, v9, v10, v3}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    goto :goto_19

    :cond_2f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_30
    instance-of v2, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    if-eqz v2, :cond_34

    move-object v2, v10

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;->getChildren()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_32

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_31

    move-object/from16 v6, p6

    move-object v5, v1

    move-object v4, v9

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/g;->H0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V

    move-object v2, v5

    goto :goto_1b

    :cond_31
    move-object v2, v1

    move-object/from16 v1, p1

    :goto_1b
    move-object v1, v2

    goto :goto_1a

    :cond_32
    move-object/from16 v1, p1

    instance-of v2, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

    if-eqz v2, :cond_33

    instance-of v2, v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v2, :cond_33

    move-object v2, v10

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

    move-object v3, v8

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/ui/g;->r0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_33
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_34
    move-object v2, v1

    move-object/from16 v1, p1

    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    if-eqz v12, :cond_3a

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.MdocComponentViewHolder"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcr/v3;

    move-object v4, v10

    check-cast v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcr/v3;->b()Landroid/view/View;

    move-result-object v5

    new-instance v6, Lor/m2;

    invoke-direct {v6, v10, v8}, Lor/m2;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3}, Lcr/v3;->b()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v5, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_35

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_1c

    :cond_35
    const/4 v1, 0x0

    :goto_1c
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v2, :cond_36

    const/4 v12, 0x0

    goto :goto_1d

    :cond_36
    move-object v12, v1

    :goto_1d
    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v12, :cond_37

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    :cond_37
    if-eqz v4, :cond_39

    invoke-static {v4}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_38

    goto :goto_1e

    :cond_38
    invoke-virtual {v3}, Lcr/v3;->a()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_39
    :goto_1e
    invoke-virtual {v3}, Lcr/v3;->a()Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_3a
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    if-eqz v12, :cond_3e

    new-instance v2, Lor/n2;

    invoke-direct {v2, v0, v10, v8}, Lor/n2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    instance-of v2, v8, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    if-eqz v2, :cond_3b

    move-object v12, v8

    check-cast v12, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    goto :goto_1f

    :cond_3b
    const/4 v12, 0x0

    :goto_1f
    if-eqz v12, :cond_3d

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v2

    if-eqz v2, :cond_3c

    move-object v2, v10

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->Y0()Z

    move-result v2

    if-eqz v2, :cond_3c

    goto :goto_20

    :cond_3c
    const/4 v5, 0x0

    :goto_20
    invoke-virtual {v12, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    :cond_3d
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_3e
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;

    if-eqz v12, :cond_42

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiDateFieldBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/f;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_3f

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_21

    :cond_3f
    const/4 v2, 0x0

    :goto_21
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_40

    const/4 v12, 0x0

    goto :goto_22

    :cond_40
    move-object v12, v2

    :goto_22
    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v12, :cond_41

    iget-object v2, v3, Lgr/f;->f:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->h:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->e:Landroid/widget/TextView;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->e:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_23

    :cond_41
    iget-object v2, v3, Lgr/f;->f:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->c:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->h:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v2, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/f;->e:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_23
    invoke-virtual {v0, v8, v9, v10}, Lcom/withpersona/sdk2/inquiry/ui/g;->e0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    iget-object v2, v3, Lgr/f;->f:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "month"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v4

    invoke-virtual {v0, v2, v9, v10, v4}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    iget-object v2, v3, Lgr/f;->c:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "day"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v4

    invoke-virtual {v0, v2, v9, v10, v4}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    iget-object v2, v3, Lgr/f;->h:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v3, "year"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v2, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_42
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    if-eqz v12, :cond_49

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInternationalDbFieldBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v3

    check-cast v17, Lgr/q;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_43

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_24

    :cond_43
    const/4 v2, 0x0

    :goto_24
    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;

    if-nez v3, :cond_44

    const/4 v2, 0x0

    :cond_44
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;

    if-eqz v2, :cond_45

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputInternationalDbComponentError;->getMessage()Ljava/util/Map;

    move-result-object v2

    goto :goto_25

    :cond_45
    const/4 v2, 0x0

    :goto_25
    move-object/from16 v16, v10

    check-cast v16, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    new-instance v3, Lor/p2;

    invoke-direct {v3, v10, v0}, Lor/p2;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    new-instance v4, Lor/q2;

    invoke-direct {v4, v10, v0}, Lor/q2;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    if-eqz v2, :cond_46

    const-string v5, "idb_country"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v20, v5

    goto :goto_26

    :cond_46
    const/16 v20, 0x0

    :goto_26
    if-eqz v2, :cond_47

    const-string v5, "idb_type"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object/from16 v21, v5

    goto :goto_27

    :cond_47
    const/16 v21, 0x0

    :goto_27
    if-eqz v2, :cond_48

    const-string v5, "idb_value"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Ljava/lang/String;

    move-object/from16 v22, v12

    :goto_28
    move-object/from16 v18, v3

    move-object/from16 v19, v4

    goto :goto_29

    :cond_48
    const/16 v22, 0x0

    goto :goto_28

    :goto_29
    invoke-static/range {v16 .. v22}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/a;->n(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;Lgr/q;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_49
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;

    if-eqz v12, :cond_4e

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_4a

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_2a

    :cond_4a
    const/4 v2, 0x0

    :goto_2a
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_4b

    const/4 v2, 0x0

    :cond_4b
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v8

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v2, :cond_4c

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_2b

    :cond_4c
    const/4 v2, 0x0

    :goto_2b
    move-object v4, v10

    check-cast v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;->k()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v4

    if-eqz v4, :cond_4d

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v12

    goto :goto_2c

    :cond_4d
    const/4 v12, 0x0

    :goto_2c
    invoke-static {v3, v2, v12}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_4e
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    if-eqz v12, :cond_52

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputPhoneNumberBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/m;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_4f

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_2d

    :cond_4f
    const/4 v2, 0x0

    :goto_2d
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_50

    const/4 v2, 0x0

    :cond_50
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    iget-object v4, v3, Lgr/m;->b:Lcom/google/android/material/textfield/TextInputLayout;

    const-string v5, "inputLayout"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v2, :cond_51

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v12

    goto :goto_2e

    :cond_51
    const/4 v12, 0x0

    :goto_2e
    move-object v2, v10

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->q()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v5

    invoke-static {v4, v12, v5}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    new-instance v4, Lor/r2;

    invoke-direct {v4, v10, v0}, Lor/r2;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-static {v2, v3, v4}, Lcr/p1;->e(Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;Lgr/m;Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_52
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;

    if-eqz v12, :cond_58

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_53

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_2f

    :cond_53
    const/4 v2, 0x0

    :goto_2f
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_54

    const/4 v2, 0x0

    :cond_54
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v8

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v2, :cond_55

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_30

    :cond_55
    const/4 v2, 0x0

    :goto_30
    move-object v4, v10

    check-cast v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

    if-eqz v5, :cond_56

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;

    goto :goto_31

    :cond_56
    const/4 v4, 0x0

    :goto_31
    if-eqz v4, :cond_57

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputNumber;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v4

    if-eqz v4, :cond_57

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v12

    goto :goto_32

    :cond_57
    const/4 v12, 0x0

    :goto_32
    invoke-static {v3, v2, v12}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_58
    instance-of v12, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;

    if-eqz v12, :cond_5c

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_59

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_33

    :cond_59
    const/4 v2, 0x0

    :goto_33
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_5a

    const/4 v2, 0x0

    :cond_5a
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v8

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v2, :cond_5b

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v12

    goto :goto_34

    :cond_5b
    const/4 v12, 0x0

    :goto_34
    move-object v2, v10

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;->k()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v2

    invoke-static {v3, v12, v2}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_5c
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    if-eqz v3, :cond_60

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/i;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_5d

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_35

    :cond_5d
    const/4 v2, 0x0

    :goto_35
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_5e

    const/4 v12, 0x0

    goto :goto_36

    :cond_5e
    move-object v12, v2

    :goto_36
    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v12, :cond_5f

    iget-object v2, v3, Lgr/i;->d:Landroid/widget/TextView;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/i;->d:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_37

    :cond_5f
    iget-object v2, v3, Lgr/i;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/i;->d:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_37
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_60
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;

    if-eqz v3, :cond_65

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputCheckboxGroupBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/j;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_61

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_38

    :cond_61
    const/4 v2, 0x0

    :goto_38
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_62

    const/4 v12, 0x0

    goto :goto_39

    :cond_62
    move-object v12, v2

    :goto_39
    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v12, :cond_63

    iget-object v2, v3, Lgr/j;->c:Landroid/widget/TextView;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/j;->c:Landroid/widget/TextView;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3a

    :cond_63
    iget-object v2, v3, Lgr/j;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/j;->c:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_3a
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v2

    invoke-virtual {v0, v8, v9, v10, v2}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget v2, Lar/d;->r:I

    invoke-virtual {v8, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    invoke-static {v2}, Landroidx/core/view/u0;->a(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_64

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v4

    invoke-virtual {v0, v3, v9, v10, v4}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    goto :goto_3b

    :cond_64
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_65
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    if-eqz v3, :cond_6e

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiSignatureFieldBinding"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v3

    check-cast v6, Lgr/w;

    move-object v3, v10

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const-string v7, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.network.dto.ui.components.ESignature"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_66

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_3c

    :cond_66
    const/4 v2, 0x0

    :goto_3c
    instance-of v7, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v7, :cond_67

    const/4 v2, 0x0

    :cond_67
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v2, :cond_68

    iget-object v7, v6, Lgr/w;->d:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v6, Lgr/w;->d:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3d

    :cond_68
    iget-object v2, v6, Lgr/w;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v6, Lgr/w;->d:Landroid/widget/TextView;

    const/16 v7, 0x8

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_3d
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;

    move-result-object v2

    if-eqz v2, :cond_69

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v2

    goto :goto_3e

    :cond_69
    const/4 v2, 0x0

    :goto_3e
    if-eqz v2, :cond_6b

    iget-object v2, v6, Lgr/w;->e:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;

    move-result-object v7

    if-eqz v7, :cond_6a

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;->getLabel()Ljava/lang/String;

    move-result-object v12

    goto :goto_3f

    :cond_6a
    const/4 v12, 0x0

    :goto_3f
    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v6, Lgr/w;->e:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_40

    :cond_6b
    iget-object v2, v6, Lgr/w;->e:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v6, Lgr/w;->e:Landroid/widget/TextView;

    const/16 v7, 0x8

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_40
    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->a()Ler/c;

    move-result-object v2

    invoke-virtual {v2}, Ler/c;->b()Landroid/graphics/Bitmap;

    move-result-object v2

    if-nez v2, :cond_6d

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->b:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->b:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;

    move-result-object v3

    if-eqz v3, :cond_6c

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$Attributes;->getPlaceholder()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6c

    goto :goto_41

    :cond_6c
    const-string v3, "+ Add signature"

    :goto_41
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->g:Landroid/widget/ImageView;

    const/16 v7, 0x8

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_42

    :cond_6d
    const/16 v7, 0x8

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/w;

    iget-object v3, v3, Lgr/w;->g:Landroid/widget/ImageView;

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->g:Landroid/widget/ImageView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lgr/w;

    iget-object v2, v2, Lgr/w;->c:Landroid/widget/ImageView;

    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_42
    iget-object v7, v6, Lgr/w;->f:Lcom/google/android/material/card/MaterialCardView;

    new-instance v0, Lor/s2;

    move-object v4, v1

    move-object v3, v5

    move-object v2, v10

    move-object/from16 v1, p0

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Lor/s2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V

    move-object v2, v0

    move-object v0, v1

    move-object v1, v4

    invoke-virtual {v7, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, v8, v9, v10}, Lcom/withpersona/sdk2/inquiry/ui/g;->e0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    iget-object v2, v6, Lgr/w;->f:Lcom/google/android/material/card/MaterialCardView;

    const-string v3, "signatureContainer"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v2, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_6e
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    if-eqz v3, :cond_77

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanViewHolder"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcr/w;

    invoke-virtual {v3}, Lcr/w;->f()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v6

    if-eqz v6, :cond_6f

    move-object v6, v10

    check-cast v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->Y0()Z

    move-result v6

    if-eqz v6, :cond_6f

    goto :goto_43

    :cond_6f
    const/4 v5, 0x0

    :goto_43
    invoke-virtual {v4, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v5

    invoke-virtual {v0, v4, v9, v10, v5}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    new-instance v5, Lor/t2;

    invoke-direct {v5, v0, v10}, Lor/t2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-virtual {v4, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3}, Lcr/w;->g()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_70

    new-instance v5, Lor/u2;

    invoke-direct {v5, v1, v0}, Lor/u2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_70
    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_71

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_44

    :cond_71
    const/4 v1, 0x0

    :goto_44
    if-nez v1, :cond_72

    const/4 v1, 0x0

    :cond_72
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v2, :cond_73

    invoke-virtual {v3}, Lcr/w;->d()Landroid/widget/TextView;

    move-result-object v2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_73
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    if-eqz v2, :cond_76

    invoke-virtual {v3}, Lcr/w;->a()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;->getMessage()Ljava/util/Map;

    move-result-object v4

    const-string v5, "card_access_number"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    move-object v5, v10

    check-cast v5, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->j()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;

    move-result-object v6

    if-eqz v6, :cond_74

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;->getCardAccessNumberStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v6

    if-eqz v6, :cond_74

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v6

    goto :goto_45

    :cond_74
    const/4 v6, 0x0

    :goto_45
    invoke-static {v2, v4, v6}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v3}, Lcr/w;->c()Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object v2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;->getMessage()Ljava/util/Map;

    move-result-object v4

    const-string v6, "document_number"

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->j()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;

    move-result-object v5

    if-eqz v5, :cond_75

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;->getDocumentNumberStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;

    move-result-object v5

    if-eqz v5, :cond_75

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v12

    goto :goto_46

    :cond_75
    const/4 v12, 0x0

    :goto_46
    invoke-static {v2, v4, v12}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v3}, Lcr/w;->b()Lgr/f;

    move-result-object v2

    iget-object v2, v2, Lgr/f;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;->getMessage()Ljava/util/Map;

    move-result-object v4

    const-string v5, "date_of_birth"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcr/w;->b()Lgr/f;

    move-result-object v2

    iget-object v2, v2, Lgr/f;->e:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v3}, Lcr/w;->e()Lgr/f;

    move-result-object v2

    iget-object v2, v2, Lgr/f;->e:Landroid/widget/TextView;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiGovernmentIdNfcScanComponentError;->getMessage()Ljava/util/Map;

    move-result-object v1

    const-string v4, "expiration_date"

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcr/w;->e()Lgr/f;

    move-result-object v1

    iget-object v1, v1, Lgr/f;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_76
    invoke-virtual {v3}, Lcr/w;->d()Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_77
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    if-eqz v3, :cond_7d

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanViewHolder"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcr/f2;

    invoke-virtual {v3}, Lcr/f2;->b()Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v6

    if-eqz v6, :cond_78

    move-object v6, v10

    check-cast v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;->Y0()Z

    move-result v6

    if-eqz v6, :cond_78

    goto :goto_47

    :cond_78
    const/4 v5, 0x0

    :goto_47
    invoke-virtual {v4, v5}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setIsLoading(Z)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v4, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    move-object v1, v10

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;->k()Llp/k;

    move-result-object v1

    if-nez v1, :cond_79

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setEnabled(Z)V

    goto :goto_48

    :cond_79
    new-instance v1, Lor/v2;

    invoke-direct {v1, v0, v10}, Lor/v2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-virtual {v4, v1}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_48
    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v1, :cond_7a

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v1

    goto :goto_49

    :cond_7a
    const/4 v1, 0x0

    :goto_49
    if-nez v1, :cond_7b

    const/4 v12, 0x0

    goto :goto_4a

    :cond_7b
    move-object v12, v1

    :goto_4a
    nop

    instance-of v1, v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v1, :cond_7c

    invoke-virtual {v3}, Lcr/f2;->a()Landroid/widget/TextView;

    move-result-object v1

    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_7c
    invoke-virtual {v3}, Lcr/f2;->a()Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_7d
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;

    if-nez v3, :cond_8c

    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;

    if-eqz v3, :cond_7e

    goto/16 :goto_53

    :cond_7e
    instance-of v3, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    if-eqz v3, :cond_89

    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.databinding.Pi2UiInputFileUploadBinding"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lgr/k;

    move-object v5, v10

    check-cast v5, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;

    if-eqz v7, :cond_7f

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;

    goto :goto_4b

    :cond_7f
    const/4 v6, 0x0

    :goto_4b
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->k()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_80

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->k()Ljava/util/List;

    move-result-object v5

    move-object/from16 v18, v5

    check-cast v18, Ljava/lang/Iterable;

    new-instance v24, Lor/w2;

    invoke-direct/range {v24 .. v24}, Lor/w2;-><init>()V

    const/16 v25, 0x1e

    const/16 v26, 0x0

    const-string v19, ", "

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v18 .. v26}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_4f

    :cond_80
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->j()Z

    move-result v5

    if-eqz v5, :cond_85

    if-eqz v6, :cond_82

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;

    move-result-object v5

    if-eqz v5, :cond_82

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$Attributes;->getPrefill()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_82

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_81

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItem;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputFileUpload$PrefillItem;->getFilename()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4c

    :cond_81
    move-object/from16 v18, v6

    goto :goto_4d

    :cond_82
    const/16 v18, 0x0

    :goto_4d
    if-eqz v18, :cond_83

    invoke-interface/range {v18 .. v18}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_84

    :cond_83
    const/4 v7, 0x0

    goto :goto_4e

    :cond_84
    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    const/16 v25, 0x3e

    const/16 v26, 0x0

    const-string v19, ", "

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v18 .. v26}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4f

    :goto_4e
    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    sget v5, Lvp/g;->o:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4f

    :cond_85
    const/4 v7, 0x0

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    sget v5, Lvp/g;->o:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    iget-object v4, v3, Lgr/k;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    :goto_4f
    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_86

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_50

    :cond_86
    const/4 v2, 0x0

    :goto_50
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v4, :cond_87

    const/4 v12, 0x0

    goto :goto_51

    :cond_87
    move-object v12, v2

    :goto_51
    check-cast v12, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v12, :cond_88

    iget-object v2, v3, Lgr/k;->d:Landroid/widget/TextView;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/k;->d:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_52

    :cond_88
    iget-object v2, v3, Lgr/k;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, v3, Lgr/k;->d:Landroid/widget/TextView;

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    :goto_52
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_89
    instance-of v1, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;

    if-eqz v1, :cond_8a

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_8a
    instance-of v1, v10, Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    if-eqz v1, :cond_8b

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :cond_8b
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_8c
    :goto_53
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void

    :goto_54
    invoke-static {v8, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v8

    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    const-string v4, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent"

    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v10

    check-cast v4, Lcr/w1;

    move-object v5, v10

    check-cast v5, Lcr/w3;

    new-instance v6, Lor/e3;

    invoke-direct {v6, v0, v3, v4, v5}, Lor/e3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v6

    if-eqz v6, :cond_8d

    new-instance v7, Lor/f3;

    invoke-direct {v7, v0, v3, v4, v5}, Lor/f3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/textfield/TextInputLayout;Lcr/w1;Lcr/w3;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_8d
    invoke-virtual {v3}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v6

    if-eqz v6, :cond_8e

    invoke-interface {v5}, Lcr/w3;->a()Ler/m;

    move-result-object v7

    invoke-virtual {v7}, Ler/m;->b()Ljava/util/List;

    move-result-object v7

    move-object/from16 v16, v7

    check-cast v16, Ljava/lang/Iterable;

    new-instance v22, Lor/g3;

    invoke-direct/range {v22 .. v22}, Lor/g3;-><init>()V

    const/16 v23, 0x1e

    const/16 v24, 0x0

    const-string v17, "\n"

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v16 .. v24}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_8e
    invoke-interface {v5}, Lcr/w3;->a()Ler/m;

    move-result-object v5

    invoke-virtual {v5}, Ler/m;->b()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    if-eqz v5, :cond_8f

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->a()Ljava/lang/String;

    move-result-object v5

    goto :goto_55

    :cond_8f
    const/4 v5, 0x0

    :goto_55
    invoke-static {v3, v5}, Llr/c;->h(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;)V

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    if-eqz v2, :cond_90

    invoke-interface {v10}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->R0()J

    move-result-wide v5

    invoke-virtual {v2, v5, v6}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->a(J)Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;

    move-result-object v2

    goto :goto_56

    :cond_90
    const/4 v2, 0x0

    :goto_56
    instance-of v5, v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-nez v5, :cond_91

    const/4 v2, 0x0

    :cond_91
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;

    if-eqz v2, :cond_92

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError$UiInputComponentError;->getMessage()Ljava/lang/String;

    move-result-object v2

    goto :goto_57

    :cond_92
    const/4 v2, 0x0

    :goto_57
    invoke-interface {v4}, Lcr/w1;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;

    move-result-object v4

    if-eqz v4, :cond_93

    invoke-interface {v4}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;->getErrorTextStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v12

    goto :goto_58

    :cond_93
    const/4 v12, 0x0

    :goto_58
    invoke-static {v3, v2, v12}, Lmr/d;->d(Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result v1

    invoke-virtual {v0, v8, v9, v10, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lan/y;)V
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->x0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V

    return-void
.end method

.method public final c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Z)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->e0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/ui/g;->d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    return-void
.end method

.method public final d0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Z)V"
        }
    .end annotation

    instance-of v0, p3, Lcr/o;

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v0, p3

    check-cast v0, Lcr/o;

    invoke-interface {v0}, Lcr/o;->getDisabled()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->i0()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, p2, p3, v2}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->getValue(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_0

    :cond_1
    move p2, v1

    :goto_0
    if-nez p4, :cond_2

    if-nez p2, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final e0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            ")V"
        }
    .end annotation

    instance-of v0, p3, Lcr/x;

    if-nez v0, :cond_0

    goto :goto_4

    :cond_0
    move-object v0, p3

    check-cast v0, Lcr/x;

    invoke-interface {v0}, Lcr/x;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->i0()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v1, p2, v3, v4}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->getValue(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-nez v1, :cond_3

    instance-of v1, p3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;

    if-eqz v1, :cond_2

    check-cast p3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;->a()Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_1

    :cond_2
    move p3, v2

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p3, 0x1

    :goto_2
    if-eqz p3, :cond_4

    const/16 v2, 0x8

    :cond_4
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {v0}, Lcr/x;->i()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmr/a;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->i0()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, p2, p3, v1}, Lmr/a;->a(Ljava/util/Map;ZLjava/util/Map;)V

    goto :goto_3

    :cond_5
    :goto_4
    return-void
.end method

.method public final f0(Ljava/util/List;Ljava/util/Map;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;Z)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1, p2, v0, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->c0(Landroid/view/View;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Z)V

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;->getChildren()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/withpersona/sdk2/inquiry/ui/g;->f0(Ljava/util/List;Ljava/util/Map;Z)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final g0(Lar/g;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lar/g;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;

    if-nez p2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;->g()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/withpersona/sdk2/inquiry/ui/g;->u0(Lar/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p2, p2, Lpr/a;->c:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lar/g;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final h0(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lar/a;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0, v0, v2, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->p0(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V

    invoke-virtual {p0, v2}, Lcom/withpersona/sdk2/inquiry/ui/g;->G0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0x14

    if-lt v1, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move-object v0, v3

    goto :goto_0

    :cond_1
    :goto_1
    return-object v2
.end method

.method public final i0()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->j:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "scrolled_to_bottom_of_screen"

    invoke-static {v1, v0}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final o1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
            "Lan/y;",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;",
            ">;)V"
        }
    .end annotation

    instance-of v2, p3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    if-eqz v2, :cond_5

    move-object v2, p3

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;->i()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage;->getComponentNameMapping()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    invoke-direct {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;-><init>()V

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;->getStartButton()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    new-instance v6, Lor/i2;

    invoke-direct {v6, p1, p3}, Lor/i2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;)V

    invoke-virtual {v3, v5, v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CreatePersonaSheet$CardCtaPage$ComponentNameMapping;->getDismissButton()Ljava/lang/String;

    move-result-object v4

    :cond_1
    new-instance v2, Lor/j2;

    invoke-direct {v2, p0}, Lor/j2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;)V

    invoke-virtual {v1, v4, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object v8

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v1}, Lor/q1;->e()Lar/g;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lar/g;->c()Lar/h;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lar/h;->a()Ljava/util/Map;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lar/a;

    invoke-virtual {v2}, Lar/a;->c()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lar/a;

    invoke-virtual {v1}, Lar/a;->d()Landroid/view/View;

    move-result-object v3

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->d:Ljava/util/Map;

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    move-object v4, p4

    move-object/from16 v5, p5

    invoke-virtual/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/g;->H0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V

    goto :goto_1

    :cond_2
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lar/a;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lar/a;->d()Landroid/view/View;

    move-result-object v3

    new-instance v4, Lor/k2;

    invoke-direct {v4, v1, v2}, Lor/k2;-><init>(Lkotlin/jvm/functions/Function1;Lar/a;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_4
    return-void

    :cond_5
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public final p0(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
            ">;",
            "Ljava/util/List<",
            "Lar/a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lar/a;

    invoke-virtual {v0}, Lar/a;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v1

    invoke-virtual {v0}, Lar/a;->b()Landroid/view/View;

    instance-of v0, v1, Lcr/x;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object v0, v1

    check-cast v0, Lcr/x;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcr/x;->getHidden()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/ui/g;->i0()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v0, p1, v4, v5}, Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;->getValue(Ljava/util/Map;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_3

    :cond_3
    move v0, v3

    :goto_3
    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;

    if-eqz v0, :cond_5

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;

    if-eqz v0, :cond_6

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputTextAreaComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_6
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    if-eqz v0, :cond_7

    sget-object v0, Ler/f;->a:Ler/f;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->n()Ler/m;

    move-result-object v2

    invoke-virtual {v2}, Ler/m;->b()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v0, v2}, Ler/f;->h(Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputPhoneNumberComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v0

    invoke-interface {p2, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;

    if-eqz v0, :cond_8

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputConfirmationCodeComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_8
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;

    if-eqz v0, :cond_9

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputDateComponent;->f()Ler/g;

    move-result-object v1

    invoke-virtual {v1}, Ler/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    if-eqz v0, :cond_a

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->x()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->z()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputInternationalDbComponent;->u()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$InternationalDbParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_a
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;

    if-eqz v0, :cond_b

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMaskedTextComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_b
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;

    if-eqz v0, :cond_c

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputSelectComponent;->m()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_c
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;

    const/16 v4, 0xa

    if-eqz v0, :cond_e

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputMultiSelectComponent;->m()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/Option;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_d
    invoke-virtual {p0, v2}, Lcom/withpersona/sdk2/inquiry/ui/g;->F0(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_e
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    if-eqz v0, :cond_f

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->m()Lan/r;

    move-result-object v3

    invoke-interface {v3}, Lan/r;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->n()Lan/r;

    move-result-object v4

    invoke-interface {v4}, Lan/r;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->a()Lan/r;

    move-result-object v5

    invoke-interface {v5}, Lan/r;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->g()Lan/r;

    move-result-object v6

    invoke-interface {v6}, Lan/r;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_f
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    if-eqz v0, :cond_13

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentGroup;->getChildren()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_11

    move-object v5, v2

    goto :goto_6

    :cond_11
    new-instance v5, Lar/a;

    invoke-direct {v5, v3, v4}, Lar/a;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    :goto_6
    if-eqz v5, :cond_10

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_12
    invoke-virtual {p0, p1, p2, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->p0(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V

    goto/16 :goto_0

    :cond_13
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    if-eqz v0, :cond_14

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxComponent;->f()Ler/p;

    move-result-object v1

    invoke-virtual {v1}, Ler/p;->b()Z

    move-result v1

    invoke-direct {v2, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentBoolean;-><init>(Z)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_14
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;

    if-eqz v0, :cond_15

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCheckboxGroupComponent;->k()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->M0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->F0(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentStringList;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_15
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;

    if-eqz v0, :cond_16

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputRadioGroupComponent;->f()Lan/r;

    move-result-object v1

    invoke-interface {v1}, Lan/r;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_16
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;

    if-eqz v0, :cond_17

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;->f()Ler/k;

    move-result-object v0

    invoke-virtual {v0}, Ler/k;->b()Ljava/lang/Number;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputNumberComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->D0(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_17
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;

    if-eqz v0, :cond_18

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;->f()Ler/k;

    move-result-object v0

    invoke-virtual {v0}, Ler/k;->b()Ljava/lang/Number;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputCurrencyComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->D0(Ljava/lang/Number;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentNumber;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_18
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    if-eqz v0, :cond_1a

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->a()Ler/c;

    move-result-object v0

    invoke-virtual {v0}, Ler/c;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-static {v0}, Ler/h;->g(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object v2

    :cond_19
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ESignature;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_1a
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    if-eqz v0, :cond_1e

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->o()Ler/i;

    move-result-object v0

    invoke-virtual {v0}, Ler/i;->b()Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;->f()Landroid/net/Uri;

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-static {v4}, Lt2/c;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-static {v4}, Lut/i;->g(Ljava/io/File;)[B

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-static {v4, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    goto :goto_7

    :cond_1b
    move-object v4, v2

    :goto_7
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;->g()Landroid/net/Uri;

    move-result-object v5

    if-eqz v5, :cond_1c

    invoke-static {v5}, Lt2/c;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v5

    if-eqz v5, :cond_1c

    invoke-static {v5}, Lut/i;->g(Ljava/io/File;)[B

    move-result-object v5

    if-eqz v5, :cond_1c

    invoke-static {v5, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_1c
    move-object v5, v2

    :goto_8
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;->i()Landroid/net/Uri;

    move-result-object v6

    if-eqz v6, :cond_1d

    invoke-static {v6}, Lt2/c;->a(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_1d

    invoke-static {v6}, Lut/i;->g(Ljava/io/File;)[B

    move-result-object v6

    if-eqz v6, :cond_1d

    invoke-static {v6, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    :cond_1d
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/utils/GovernmentIdNfcData;->a()Lqp/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;

    invoke-direct {v3, v4, v5, v2, v0}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$GovernmentIdNfcScan;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqp/a;)V

    invoke-interface {p2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_1e
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    if-eqz v0, :cond_24

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;->j()Ler/j;

    move-result-object v0

    invoke-virtual {v0}, Ler/j;->b()Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;

    move-result-object v0

    const/4 v4, 0x1

    if-eqz v0, :cond_21

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/jpmynumber/JpMyNumberNfcScanResult;->g()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_21

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1f
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_20

    move v6, v4

    goto :goto_a

    :cond_20
    move v6, v3

    :goto_a
    if-eqz v6, :cond_1f

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_21
    if-eqz v2, :cond_22

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_23

    :cond_22
    move v3, v4

    :cond_23
    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$JpMyNumberNfcScanParams;-><init>(Ljava/util/Map;)V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_24
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    if-eqz v0, :cond_25

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->m()Lan/r;

    move-result-object v0

    invoke-interface {v0}, Lan/r;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->E0(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$ComponentString;

    move-result-object v0

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_25
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    if-eqz v0, :cond_27

    check-cast v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->k()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_26

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;->f()Landroid/net/Uri;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_26
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputFileUploadComponent;->j()Z

    move-result v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;

    invoke-direct {v2, v3, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$FileUpload;-><init>(Ljava/util/List;Z)V

    invoke-interface {p2, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_27
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CombinedStepButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LinkButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/LocalImageComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PrivacyPolicyComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/RemoteImageComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CreatePersonaSheetComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/HelpBottomSheetComponent;

    if-nez v0, :cond_0

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;

    if-eqz v0, :cond_28

    goto/16 :goto_0

    :cond_28
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_29
    return-void
.end method

.method public final q0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V
    .locals 5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    new-instance v4, Lar/a;

    invoke-direct {v4, v2, v3}, Lar/a;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/g;->h0(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/ui/g;->G0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result p1

    invoke-virtual {p0, v1, v0, p1}, Lcom/withpersona/sdk2/inquiry/ui/g;->f0(Ljava/util/List;Ljava/util/Map;Z)V

    return-void
.end method

.method public final r0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 1

    new-instance v0, Lor/o3;

    invoke-direct {v0, p2, p0, p3}, Lor/o3;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;Lcom/withpersona/sdk2/inquiry/ui/g;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;->g()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;

    move-result-object p1

    invoke-static {p3, p1}, Ljr/r;->a(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->B()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;->g()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;

    move-result-object p1

    invoke-static {p3, p1}, Ljr/r;->d(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;)V

    :cond_1
    return-void
.end method

.method public final t0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Ljava/util/Map;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;",
            "Lan/y;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v0}, Lor/q1;->d()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :cond_2
    if-ge v4, v3, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v4, v4, 0x1

    move-object v6, v5

    check-cast v6, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    if-eqz v5, :cond_4

    invoke-interface {v5}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;->E1()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v0}, Lor/q1;->f()V

    :cond_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v0}, Lor/q1;->d()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    :cond_5
    if-ge v2, v0, :cond_6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;->V2()Z

    move-result v4

    if-nez v4, :cond_5

    const/4 v0, 0x1

    invoke-interface {v3, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;->p2(Z)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v0, v3, p2}, Lor/q1;->g(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Lan/y;)V

    :cond_6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->h:Lor/q1;

    invoke-virtual {v0}, Lor/q1;->d()Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;

    move-result-object v4

    if-eqz v4, :cond_7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/ui/g;->o1(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SheetComponent;Ljava/util/Map;Ljava/util/Map;)V

    :cond_7
    return-void
.end method

.method public final u0(Lar/g;ILcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;)V
    .locals 5

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->d:Lcom/google/android/material/divider/MaterialDivider;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->f:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    invoke-virtual {p1}, Lar/g;->b()Landroid/view/View;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    instance-of v3, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v3, :cond_1

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v0

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v3, v3, Lpr/a;->h:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    instance-of v4, v3, Landroid/graphics/drawable/LayerDrawable;

    if-eqz v4, :cond_3

    check-cast v3, Landroid/graphics/drawable/LayerDrawable;

    goto :goto_3

    :cond_3
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_4

    sget v4, Lor/r1;->k:I

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_4

    :cond_4
    move-object v3, v2

    :goto_4
    instance-of v4, v3, Landroid/graphics/drawable/GradientDrawable;

    if-eqz v4, :cond_5

    check-cast v3, Landroid/graphics/drawable/GradientDrawable;

    goto :goto_5

    :cond_5
    move-object v3, v2

    :goto_5
    if-eqz v3, :cond_6

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    :cond_6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v0, v0, Lpr/a;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Lar/g;->b()Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/FooterComponent;->getChildren()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    if-eqz p1, :cond_7

    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v2

    :cond_7
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p2, p2, Lpr/a;->h:Landroidx/core/widget/NestedScrollView;

    invoke-static {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q0(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p2

    const-string p3, "from(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p3, p3, Lpr/a;->j:Lcom/withpersona/sdk2/inquiry/steps/ui/view/ShadowedNestedScrollView;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    if-eqz p1, :cond_8

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p3, p3, Lpr/a;->g:Landroid/view/View;

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p3, p3, Lpr/a;->e:Landroid/widget/LinearLayout;

    new-instance v0, Lor/h3;

    invoke-direct {v0, p0, p1, p2}, Lor/h3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Landroid/view/View;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_6

    :cond_8
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->g:Landroid/view/View;

    const/4 p3, 0x4

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object p1, p1, Lpr/a;->e:Landroid/widget/LinearLayout;

    new-instance p3, Lor/i3;

    invoke-direct {p3, p0, p2}, Lor/i3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_6
    new-instance p1, Lcom/withpersona/sdk2/inquiry/ui/g$b;

    invoke-direct {p1, p0, p2}, Lcom/withpersona/sdk2/inquiry/ui/g$b;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    invoke-virtual {p2, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;)V

    return-void
.end method

.method public x0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;)V
    .locals 25
    .param p1    # Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lan/y;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v6, p2

    const-string v2, "rendering"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "viewEnvironment"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    invoke-virtual {v2}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v14, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance v14, Lar/a;

    invoke-direct {v14, v3, v4}, Lar/a;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;)V

    :goto_1
    if-eqz v14, :cond_0

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v13}, Lcom/withpersona/sdk2/inquiry/ui/g;->h0(Ljava/util/List;)Ljava/util/Map;

    move-result-object v15

    invoke-virtual {v0, v15}, Lcom/withpersona/sdk2/inquiry/ui/g;->G0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/j0;->f(I)I

    move-result v3

    const/16 v5, 0x10

    invoke-static {v3, v5}, Lkotlin/ranges/d;->c(II)I

    move-result v3

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/ui/UiComponentErrorInfo;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->c()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    const v8, 0x1010031

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Ljq/z;->d(Landroid/content/Context;ILandroid/util/TypedValue;ZILjava/lang/Object;)I

    move-result v2

    :goto_4
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v6, v7, v2}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->l()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->n:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->k()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->o:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    move v2, v9

    :goto_5
    if-ge v2, v8, :cond_6

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v10, v2, 0x1

    check-cast v3, Lar/a;

    invoke-virtual {v3}, Lar/a;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;

    move-result-object v2

    invoke-virtual {v3}, Lar/a;->b()Landroid/view/View;

    move-result-object v3

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->d:Ljava/util/Map;

    invoke-virtual/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/ui/g;->H0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;Landroid/view/View;Ljava/util/Map;Ljava/util/Map;Lan/y;Ljava/util/Map;)V

    move v2, v10

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->o()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v16

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    iget-object v2, v2, Lpr/a;->i:Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;

    const-string v3, "navigationBar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    invoke-virtual {v3}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v3

    const-string v4, "getRoot(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->e:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-static {v8}, Ler/h;->h(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)Landroid/graphics/Rect;

    move-result-object v8

    move-object/from16 v22, v8

    goto :goto_6

    :cond_7
    move-object/from16 v22, v14

    :goto_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;->getNavBarTitleStyleValue()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;

    move-result-object v14

    :cond_8
    move-object/from16 v24, v14

    new-instance v8, Lor/y3;

    invoke-direct {v8, v0, v1}, Lor/y3;-><init>(Lcom/withpersona/sdk2/inquiry/ui/g;Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    new-instance v10, Lor/e2;

    invoke-direct {v10, v1}, Lor/e2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;)V

    new-instance v11, Lor/f2;

    invoke-direct {v11, v1, v0}, Lor/f2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;)V

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v23, v7

    move-object/from16 v17, v8

    move-object/from16 v18, v10

    move-object/from16 v19, v11

    invoke-static/range {v16 .. v24}, Lir/c;->d(Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;Landroid/graphics/Rect;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->b:Lpr/a;

    invoke-virtual {v2}, Lpr/a;->b()Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->g()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->u()Lkotlin/jvm/functions/Function0;

    move-result-object v18

    const/16 v22, 0x38

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v2

    invoke-static/range {v16 .. v23}, Ljq/g0;->b(Landroid/view/View;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/view/View;IIILjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->s()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->k:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->q()Lkotlin/jvm/functions/Function0;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->l:Lkotlin/jvm/functions/Function0;

    new-instance v2, Lor/g2;

    invoke-direct {v2, v1, v0, v13}, Lor/g2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;)V

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    new-instance v2, Lor/h2;

    invoke-direct {v2, v1, v0, v13}, Lor/h2;-><init>(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lcom/withpersona/sdk2/inquiry/ui/g;Ljava/util/List;)V

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->p:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->b()Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->c()Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v2

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    if-nez v3, :cond_c

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    if-eqz v3, :cond_9

    goto :goto_7

    :cond_9
    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;

    if-eqz v3, :cond_a

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->l:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto/16 :goto_8

    :cond_a
    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;

    if-eqz v3, :cond_b

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->k:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    goto/16 :goto_8

    :cond_b
    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;

    if-eqz v3, :cond_10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->r()Lzt/n;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v7, Lkotlin/Pair;

    move-object v8, v2

    check-cast v8, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;->getName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;->g()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;->k()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/PhoneNumberSnaComponent;->j()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v10, v11, v12, v8}, Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam$PhoneNumberSnaParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v7, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    invoke-interface {v3, v2, v4, v7}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_c
    :goto_7
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->m:Lkotlin/jvm/functions/Function2;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;

    invoke-interface {v7}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ButtonComponent;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    if-nez v4, :cond_d

    const/4 v9, 0x1

    :cond_d
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_e
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_10

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->c:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->a()Lcom/withpersona/sdk2/inquiry/steps/ui/components/AutoSubmitableComponent;

    move-result-object v4

    invoke-interface {v4}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    instance-of v4, v3, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    if-eqz v4, :cond_f

    check-cast v3, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_f
    instance-of v4, v3, Lcom/google/android/material/button/MaterialButton;

    if-eqz v4, :cond_10

    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_10
    :goto_8
    invoke-virtual {v0, v1, v6, v15, v5}, Lcom/withpersona/sdk2/inquiry/ui/g;->t0(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;Lan/y;Ljava/util/Map;Ljava/util/Map;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->z()Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object v2

    if-eqz v2, :cond_11

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/ui/g;->i:Ldr/n;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->A()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->i()Ldr/o;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->v()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->j()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$c$a;->m()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-virtual/range {v3 .. v8}, Ldr/n;->x(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ldr/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    :cond_11
    return-void
.end method
