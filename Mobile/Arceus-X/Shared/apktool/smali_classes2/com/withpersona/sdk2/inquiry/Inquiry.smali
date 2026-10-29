.class public final Lcom/withpersona/sdk2/inquiry/Inquiry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;,
        Lcom/withpersona/sdk2/inquiry/Inquiry$Contract;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 :2\u00020\u0001:\u00029:B\u0087\u0002\u0008\u0000\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"\u0012\u0008\u0010$\u001a\u0004\u0018\u00010%\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000eH\u0007J\u0008\u0010/\u001a\u000200H\u0007J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0015\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0000\u00a2\u0006\u0002\u00088R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010(R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010)R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010)R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0008\u0012\u0004\u0012\u00020#0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/Inquiry;",
        "",
        "templateId",
        "",
        "templateVersion",
        "inquiryId",
        "sessionToken",
        "oneTimeLinkCode",
        "relaySessionToken",
        "referenceId",
        "accountId",
        "fields",
        "Lcom/withpersona/sdk2/inquiry/Fields;",
        "theme",
        "",
        "environment",
        "Lcom/withpersona/sdk2/inquiry/Environment;",
        "environmentId",
        "enableErrorLogging",
        "",
        "returnCollectedData",
        "fallbackMode",
        "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
        "useServerStyles",
        "staticInquiryTemplate",
        "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;",
        "themeSetId",
        "locale",
        "styleVariant",
        "Lcom/withpersona/sdk2/inquiry/StyleVariant;",
        "consumeExceptions",
        "redirectUri",
        "shareToken",
        "fieldMappings",
        "",
        "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
        "personaHost",
        "Lcom/withpersona/sdk2/inquiry/PersonaHost;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StyleVariant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/PersonaHost;)V",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        "start",
        "",
        "activity",
        "Landroid/app/Activity;",
        "requestCode",
        "buildInlineInquiry",
        "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;",
        "toInquiryActivityIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "addArgumentsToBundle",
        "bundle",
        "Landroid/os/Bundle;",
        "addArgumentsToBundle$inquiry_dynamic_feature_release",
        "Contract",
        "Companion",
        "inquiry-dynamic-feature_release"
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
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final accountId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final consumeExceptions:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final enableErrorLogging:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final environment:Lcom/withpersona/sdk2/inquiry/Environment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final environmentId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final fieldMappings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final fields:Lcom/withpersona/sdk2/inquiry/Fields;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final inquiryId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final locale:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final oneTimeLinkCode:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final redirectUri:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final referenceId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final relaySessionToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final returnCollectedData:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final sessionToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final shareToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final templateId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final templateVersion:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final theme:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final themeSetId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final useServerStyles:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StyleVariant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/PersonaHost;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lcom/withpersona/sdk2/inquiry/Fields;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Lcom/withpersona/sdk2/inquiry/Environment;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Lcom/withpersona/sdk2/inquiry/FallbackMode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p17    # Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p18    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p19    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Lcom/withpersona/sdk2/inquiry/StyleVariant;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p24    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p25    # Lcom/withpersona/sdk2/inquiry/PersonaHost;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/Fields;",
            "Ljava/lang/Integer;",
            "Lcom/withpersona/sdk2/inquiry/Environment;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
            "Ljava/lang/Boolean;",
            "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/StyleVariant;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/PersonaHost;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p24

    const-string v1, "fieldMappings"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->templateId:Ljava/lang/String;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->templateVersion:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->inquiryId:Ljava/lang/String;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->sessionToken:Ljava/lang/String;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->oneTimeLinkCode:Ljava/lang/String;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->relaySessionToken:Ljava/lang/String;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->referenceId:Ljava/lang/String;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->accountId:Ljava/lang/String;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fields:Lcom/withpersona/sdk2/inquiry/Fields;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->theme:Ljava/lang/Integer;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->environment:Lcom/withpersona/sdk2/inquiry/Environment;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->environmentId:Ljava/lang/String;

    iput-object p13, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->enableErrorLogging:Ljava/lang/Boolean;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->returnCollectedData:Ljava/lang/Boolean;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->useServerStyles:Ljava/lang/Boolean;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->themeSetId:Ljava/lang/String;

    move-object/from16 p1, p19

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->locale:Ljava/lang/String;

    move-object/from16 p1, p20

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    move-object/from16 p1, p21

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->consumeExceptions:Ljava/lang/Boolean;

    move-object/from16 p1, p22

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->redirectUri:Ljava/lang/String;

    move-object/from16 p1, p23

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->shareToken:Ljava/lang/String;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fieldMappings:Ljava/util/List;

    move-object/from16 p1, p25

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;

    return-void
.end method

.method public static final synthetic access$toInquiryActivityIntent(Lcom/withpersona/sdk2/inquiry/Inquiry;Landroid/content/Context;)Landroid/content/Intent;
    .locals 0

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry;->toInquiryActivityIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final extractInquiryResponseFromBundle(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 1
    .param p0    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->extractInquiryResponseFromBundle(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final fromInquiry(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromInquiry(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final fromOneTimeLinkCode(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromOneTimeLinkCode(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final fromRelaySessionToken(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromRelaySessionToken(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final fromStaticTemplate(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInquiryFlow;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromStaticTemplate(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final fromTemplate(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromTemplate(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final fromTemplateVersion(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->fromTemplateVersion(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    move-result-object p0

    return-object p0
.end method

.method public static final onActivityResult(Landroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->onActivityResult(Landroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final onActivityResult(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 1
    .param p0    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    sget-object v0, Lcom/withpersona/sdk2/inquiry/Inquiry;->Companion:Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->onActivityResult(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p0

    return-object p0
.end method

.method private final toInquiryActivityIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.withpersona.sdk2.inquiry.internal.InquiryActivity"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry;->addArgumentsToBundle$inquiry_dynamic_feature_release(Landroid/os/Bundle;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->replaceExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    return-object v0
.end method


# virtual methods
.method public final addArgumentsToBundle$inquiry_dynamic_feature_release(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "bundle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->templateId:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "TEMPLATE_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->templateVersion:Ljava/lang/String;

    if-eqz v0, :cond_1

    const-string v1, "TEMPLATE_VERSION_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->inquiryId:Ljava/lang/String;

    if-eqz v0, :cond_2

    const-string v1, "INQUIRY_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->oneTimeLinkCode:Ljava/lang/String;

    if-eqz v0, :cond_3

    const-string v1, "ONE_TIME_LINK_CODE"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->relaySessionToken:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v1, "RELAY_SESSION_TOKEN"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->sessionToken:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v1, "SESSION_TOKEN_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->referenceId:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v1, "REFERENCE_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->accountId:Ljava/lang/String;

    if-eqz v0, :cond_7

    const-string v1, "ACCOUNT_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fields:Lcom/withpersona/sdk2/inquiry/Fields;

    if-eqz v0, :cond_8

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/Fields;->getFields$inquiry_dynamic_feature_release()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;-><init>(Ljava/util/Map;)V

    const-string v0, "FIELDS_MAP_KEY"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_8
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->theme:Ljava/lang/Integer;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const-string v1, "THEME_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_9
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    if-eqz v0, :cond_a

    const-string v1, "STATIC_INQUIRY_TEMPLATE_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_a
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->environment:Lcom/withpersona/sdk2/inquiry/Environment;

    if-eqz v0, :cond_b

    const-string v1, "ENVIRONMENT_KEY"

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->environmentId:Ljava/lang/String;

    if-eqz v0, :cond_c

    const-string v1, "ENVIRONMENT_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->enableErrorLogging:Ljava/lang/Boolean;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "ENABLE_ERROR_LOGGING"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_d
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->returnCollectedData:Ljava/lang/Boolean;

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "RETURN_COLLECTED_DATA"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_e
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    if-eqz v0, :cond_f

    const-string v1, "FALLBACK_MODE"

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_f
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->useServerStyles:Ljava/lang/Boolean;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "USE_SERVER_STYLES"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_10
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->themeSetId:Ljava/lang/String;

    if-eqz v0, :cond_11

    const-string v1, "THEME_SET_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_11
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->locale:Ljava/lang/String;

    if-eqz v0, :cond_12

    const-string v1, "LOCALE"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    if-eqz v0, :cond_13

    const-string v1, "STYLE_VARIANT"

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/StyleVariant;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->consumeExceptions:Ljava/lang/Boolean;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "CONSUME_EXCEPTIONS"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_14
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->redirectUri:Ljava/lang/String;

    if-eqz v0, :cond_15

    const-string v1, "REDIRECT_URI"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_15
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->shareToken:Ljava/lang/String;

    if-eqz v0, :cond_16

    const-string v1, "SHARE_TOKEN"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_16
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fieldMappings:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_17

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMappings;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->fieldMappings:Ljava/util/List;

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldMappings;-><init>(Ljava/util/List;)V

    const-string v1, "FIELD_MAPPINGS"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_17
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/Inquiry;->personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;

    if-eqz v0, :cond_18

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpointsKt;->getEndpoints(Lcom/withpersona/sdk2/inquiry/PersonaHost;)Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;

    move-result-object v0

    if-eqz v0, :cond_18

    const-string v1, "SERVER_ENDPOINT"

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;->getServerEndpoint()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "WEB_RTC_SERVER_ENDPOINT"

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;->getWebRtcServerEndpoint()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "FALLBACK_MODE_SERVER_ENDPOINT"

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;->getFallbackModeServerEndpoint()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "TRACKING_EVENTS_SERVER_ENDPOINT"

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;->getTrackingEventsServerEndpoint()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_18
    return-void
.end method

.method public final buildInlineInquiry()Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;
    .locals 1
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInlineApi;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;-><init>(Lcom/withpersona/sdk2/inquiry/Inquiry;)V

    return-object v0
.end method

.method public final start(Landroid/app/Activity;I)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/Inquiry;->toInquiryActivityIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
