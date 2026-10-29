.class public final Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/Inquiry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/Inquiry$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u0007*\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u0018J%\u0010 \u001a\u00020\u001f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008 \u0010!J#\u0010#\u001a\u00020\u001f2\u0008\u0010\"\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u00a2\u0006\u0004\u0008#\u0010$J\r\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008&\u0010\u0003J\r\u0010\'\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010\u0003R.\u0010/\u001a\u0004\u0018\u00010(2\u0008\u0010)\u001a\u0004\u0018\u00010(8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008.\u0010\u0003\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-\u00a8\u00060"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "Landroid/content/Context;",
        "context",
        "Lzo/v;",
        "getStatus",
        "(Landroid/os/Bundle;Landroid/content/Context;)Lzo/v;",
        "",
        "templateId",
        "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;",
        "fromTemplate",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;",
        "templateVersion",
        "fromTemplateVersion",
        "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;",
        "staticInquiryTemplate",
        "fromStaticTemplate",
        "(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;",
        "inquiryId",
        "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;",
        "fromInquiry",
        "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;",
        "oneTimeLinkCode",
        "fromOneTimeLinkCode",
        "relaySessionToken",
        "fromRelaySessionToken",
        "Landroid/content/Intent;",
        "intent",
        "Lcom/withpersona/sdk2/inquiry/InquiryResponse;",
        "onActivityResult",
        "(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;",
        "bundle",
        "extractInquiryResponseFromBundle",
        "(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;",
        "",
        "prefetchModels",
        "cancelRunningInquiries",
        "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "value",
        "getOnEventListener",
        "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "setOnEventListener",
        "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V",
        "getOnEventListener$annotations",
        "onEventListener",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getOnEventListener$annotations()V
    .locals 0
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInquiryApi;
    .end annotation

    return-void
.end method

.method private final getStatus(Landroid/os/Bundle;Landroid/content/Context;)Lzo/v;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const-string v1, "PERSONA_ACTIVITY_RESULT"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    invoke-static {p1}, Lzo/v;->valueOf(Ljava/lang/String;)Lzo/v;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    if-nez p2, :cond_2

    sget-object p1, Lzo/v;->b:Lzo/v;

    return-object p1

    :cond_2
    new-instance p1, Leo/a;

    invoke-direct {p1, p2}, Leo/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1}, Leo/a;->f()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lzo/v;->c:Lzo/v;

    goto :goto_0

    :cond_3
    sget-object p1, Lzo/v;->b:Lzo/v;

    :goto_0
    return-object p1
.end method

.method public static synthetic onActivityResult$default(Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;Landroid/content/Intent;Landroid/content/Context;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->onActivityResult(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cancelRunningInquiries()V
    .locals 4

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->INSTANCE:Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;->cancelRunningInquiries$default(Lcom/withpersona/sdk2/inquiry/InquiryActivityBroadcastManager;ZILjava/lang/Object;)V

    return-void
.end method

.method public final extractInquiryResponseFromBundle(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->getStatus(Landroid/os/Bundle;Landroid/content/Context;)Lzo/v;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "INQUIRY_ID_KEY"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    sget-object v3, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_a

    const/4 v3, 0x2

    if-eq v0, v3, :cond_8

    const/4 v2, 0x3

    if-ne v0, v2, :cond_7

    if-eqz p1, :cond_1

    const-string v0, "ERROR_DEBUG_MESSAGE_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz p2, :cond_2

    new-instance v2, Leo/a;

    invoke-direct {v2, p2}, Leo/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2}, Leo/a;->e()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v1

    :goto_2
    if-eqz p1, :cond_3

    :try_start_0
    const-string v2, "ERROR_CODE_KEY"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    goto :goto_3

    :cond_3
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_4

    move-object v1, p1

    :cond_4
    if-nez v1, :cond_5

    sget-object v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->h:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    sget-object p1, Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;->h:Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;

    goto :goto_5

    :cond_5
    :goto_4
    move-object p1, v1

    :goto_5
    new-instance v1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;

    if-nez v0, :cond_6

    const-string v0, "An otherwise unexpected error occurred."

    :cond_6
    invoke-direct {v1, v0, p1, p2}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Error;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;Ljava/lang/String;)V

    return-object v1

    :cond_7
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_8
    if-eqz p1, :cond_9

    const-string p2, "SESSION_TOKEN_KEY"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_9
    new-instance p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;

    invoke-direct {p1, v2, v1}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Cancel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_a
    if-eqz p1, :cond_b

    const-string p2, "FIELDS_MAP_KEY"

    const-class v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;

    invoke-static {p1, p2, v0}, Lu2/c;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;

    if-nez p2, :cond_c

    :cond_b
    new-instance p2, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;

    invoke-static {}, Lkotlin/collections/k0;->j()Ljava/util/Map;

    move-result-object v0

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;-><init>(Ljava/util/Map;)V

    :cond_c
    if-eqz p1, :cond_d

    const-string v0, "INQUIRY_STATUS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_d
    move-object v0, v1

    :goto_6
    if-eqz p1, :cond_e

    const-string v1, "COLLECTED_DATA"

    const-class v3, Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;

    invoke-static {p1, v1, v3}, Lu2/c;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;

    :cond_e
    new-instance p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/internal/InquiryFieldsMap;->a()Ljava/util/Map;

    move-result-object p2

    invoke-direct {p1, v2, v0, p2, v1}, Lcom/withpersona/sdk2/inquiry/InquiryResponse$Complete;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/withpersona/sdk2/inquiry/types/collected_data/CollectedData;)V

    return-object p1
.end method

.method public final fromInquiry(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->Companion:Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;->fromInquiryId$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final fromOneTimeLinkCode(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "oneTimeLinkCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->Companion:Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;->fromOneTimeLinkCode$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final fromRelaySessionToken(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "relaySessionToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/InquiryBuilder;->Companion:Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;->fromRelaySessionToken$inquiry_dynamic_feature_release(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final fromStaticTemplate(Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 7
    .param p1    # Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lcom/withpersona/sdk2/inquiry/ExperimentalInquiryFlow;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "staticInquiryTemplate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final fromTemplate(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
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

.method public final fromTemplateVersion(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "templateVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final getOnEventListener()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lzo/w;->b:Lzo/w$a;

    invoke-virtual {v0}, Lzo/w$a;->a()Lzo/w;

    move-result-object v0

    invoke-virtual {v0}, Lzo/w;->c()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;

    move-result-object v0

    return-object v0
.end method

.method public final onActivityResult(Landroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 2
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->onActivityResult$default(Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;Landroid/content/Intent;Landroid/content/Context;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p1

    return-object p1
.end method

.method public final onActivityResult(Landroid/content/Intent;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/Inquiry$Companion;->extractInquiryResponseFromBundle(Landroid/os/Bundle;Landroid/content/Context;)Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    move-result-object p1

    return-object p1
.end method

.method public final prefetchModels()V
    .locals 1

    sget-object v0, Lzo/d0;->a:Lzo/d0;

    invoke-virtual {v0}, Lzo/d0;->a()V

    return-void
.end method

.method public final setOnEventListener(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lzo/w;->b:Lzo/w$a;

    invoke-virtual {v0}, Lzo/w$a;->a()Lzo/w;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzo/w;->d(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V

    return-void
.end method
