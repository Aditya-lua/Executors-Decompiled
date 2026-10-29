.class public final Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B-\u0008\u0000\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\t\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u0012\u0010\r\u001a\u00020\u00002\u0008\u0008\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0012\u0010*\u001a\u00020\u00002\u0008\u0010*\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u001d\u001a\u00020\u00002\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0011J\u0010\u0010 \u001a\u00020\u00002\u0008\u0010 \u001a\u0004\u0018\u00010\u0003J\u0010\u0010!\u001a\u00020\u00002\u0008\u0010!\u001a\u0004\u0018\u00010\u0003J\u0014\u0010\"\u001a\u00020\u00002\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u0006\u0010,\u001a\u00020-J\u000f\u0010.\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0002\u0010/R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017R\u0010\u0010 \u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;",
        "",
        "templateId",
        "",
        "templateVersion",
        "staticInquiryTemplate",
        "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V",
        "accountId",
        "referenceId",
        "fields",
        "Lcom/withpersona/sdk2/inquiry/Fields;",
        "theme",
        "",
        "Ljava/lang/Integer;",
        "userProvidedTheme",
        "",
        "themeSetId",
        "environment",
        "Lcom/withpersona/sdk2/inquiry/Environment;",
        "environmentId",
        "enableErrorLogging",
        "Ljava/lang/Boolean;",
        "returnCollectedData",
        "fallbackMode",
        "Lcom/withpersona/sdk2/inquiry/FallbackMode;",
        "useServerStyles",
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
        "fromTemplateId",
        "themeSource",
        "Lcom/withpersona/sdk2/inquiry/ThemeSource;",
        "routingCountry",
        "host",
        "build",
        "Lcom/withpersona/sdk2/inquiry/Inquiry;",
        "resolveTheme",
        "()Ljava/lang/Integer;",
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


# instance fields
.field private accountId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private consumeExceptions:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private enableErrorLogging:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private environment:Lcom/withpersona/sdk2/inquiry/Environment;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private environmentId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private fieldMappings:Ljava/util/List;
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

.field private fields:Lcom/withpersona/sdk2/inquiry/Fields;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private locale:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private redirectUri:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private referenceId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private returnCollectedData:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private shareToken:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;
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

.field private theme:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private themeSetId:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private useServerStyles:Ljava/lang/Boolean;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private userProvidedTheme:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->templateId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->templateVersion:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    .line 6
    sget-object p1, Lcom/withpersona/sdk2/inquiry/FallbackMode;->NEVER:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    .line 7
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fieldMappings:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V

    return-void
.end method

.method private final resolveTheme()Ljava/lang/Integer;
    .locals 2

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->userProvidedTheme:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->theme:Ljava/lang/Integer;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/StyleVariant;->DARK:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    if-ne v0, v1, :cond_1

    sget v0, Lvp/h;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->theme:Ljava/lang/Integer;

    return-object v0
.end method


# virtual methods
.method public final accountId(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->referenceId:Ljava/lang/String;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->accountId:Ljava/lang/String;

    return-object p0
.end method

.method public final build()Lcom/withpersona/sdk2/inquiry/Inquiry;
    .locals 27
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->templateId:Ljava/lang/String;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->templateVersion:Ljava/lang/String;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->referenceId:Ljava/lang/String;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->accountId:Ljava/lang/String;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fields:Lcom/withpersona/sdk2/inquiry/Fields;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->resolveTheme()Ljava/lang/Integer;

    move-result-object v11

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->themeSetId:Ljava/lang/String;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->environment:Lcom/withpersona/sdk2/inquiry/Environment;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->environmentId:Ljava/lang/String;

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->enableErrorLogging:Ljava/lang/Boolean;

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->returnCollectedData:Ljava/lang/Boolean;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->useServerStyles:Ljava/lang/Boolean;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->staticInquiryTemplate:Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->locale:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->consumeExceptions:Ljava/lang/Boolean;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->redirectUri:Ljava/lang/String;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->shareToken:Ljava/lang/String;

    move-object/from16 v24, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fieldMappings:Ljava/util/List;

    move-object/from16 v25, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;

    move-object/from16 v26, v1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/Inquiry;

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v26}, Lcom/withpersona/sdk2/inquiry/Inquiry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/Fields;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/Environment;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/FallbackMode;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StyleVariant;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/PersonaHost;)V

    return-object v1
.end method

.method public final consumeExceptions(Z)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->consumeExceptions:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final enableErrorLogging(Z)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->enableErrorLogging:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final environment(Lcom/withpersona/sdk2/inquiry/Environment;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/Environment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "environment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->environment:Lcom/withpersona/sdk2/inquiry/Environment;

    return-object p0
.end method

.method public final environmentId(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "environmentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->environmentId:Ljava/lang/String;

    return-object p0
.end method

.method public final fallbackMode(Lcom/withpersona/sdk2/inquiry/FallbackMode;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/FallbackMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/withpersona/sdk2/inquiry/ExperimentalFallbackMode;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fallbackMode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fallbackMode:Lcom/withpersona/sdk2/inquiry/FallbackMode;

    return-object p0
.end method

.method public final fieldMappings(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "fieldMappings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fieldMappings:Ljava/util/List;

    return-object p0
.end method

.method public final fields(Lcom/withpersona/sdk2/inquiry/Fields;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/Fields;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->fields:Lcom/withpersona/sdk2/inquiry/Fields;

    return-object p0
.end method

.method public final fromTemplateId(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "templateId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final host(Lcom/withpersona/sdk2/inquiry/PersonaHost;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/PersonaHost;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "personaHost"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->personaHost:Lcom/withpersona/sdk2/inquiry/PersonaHost;

    return-object p0
.end method

.method public final locale(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->locale:Ljava/lang/String;

    return-object p0
.end method

.method public final redirectUri(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->redirectUri:Ljava/lang/String;

    return-object p0
.end method

.method public final referenceId(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->accountId:Ljava/lang/String;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->referenceId:Ljava/lang/String;

    return-object p0
.end method

.method public final returnCollectedData(Z)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->returnCollectedData:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final routingCountry(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    return-object p0
.end method

.method public final shareToken(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->shareToken:Ljava/lang/String;

    return-object p0
.end method

.method public final styleVariant(Lcom/withpersona/sdk2/inquiry/StyleVariant;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/StyleVariant;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->styleVariant:Lcom/withpersona/sdk2/inquiry/StyleVariant;

    return-object p0
.end method

.method public final theme(I)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->theme:Ljava/lang/Integer;

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->userProvidedTheme:Z

    .line 3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->useServerStyles:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final theme(Lcom/withpersona/sdk2/inquiry/ThemeSource;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/ThemeSource;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "themeSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/ThemeSource;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->theme:Ljava/lang/Integer;

    .line 5
    invoke-interface {p1}, Lcom/withpersona/sdk2/inquiry/ThemeSource;->getTheme()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->userProvidedTheme:Z

    .line 6
    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/ServerThemeSource;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->useServerStyles:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final themeSetId(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lcom/withpersona/sdk2/inquiry/ExperimentalThemeSetId;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "themeSetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;->themeSetId:Ljava/lang/String;

    return-object p0
.end method
