.class public final Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;
.implements Lcom/roblox/universalapp/facialageestimation/a$a;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\tJ\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\tJ\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0015R\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/universalapp/facialageestimation/a$a;",
        "<init>",
        "()V",
        "",
        "stateName",
        "",
        "logFAECounter",
        "(Ljava/lang/String;)V",
        "",
        "nativeListenerPtr",
        "setListener",
        "(J)V",
        "",
        "isAvailable",
        "()Z",
        "isInInquiryFlow",
        "inquiryId",
        "sessionToken",
        "startInquiry",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "onComplete",
        "onCancel",
        "debugMessage",
        "onError",
        "TAG",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "Lcom/roblox/universalapp/facialageestimation/a;",
        "personaSdk",
        "Lcom/roblox/universalapp/facialageestimation/a;",
        "Z",
        "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "faeCounter$delegate",
        "Ljt/h;",
        "getFaeCounter",
        "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;",
        "faeCounter",
        "universalapp_googleProdRelease"
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
.field public static final INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "FacialAgeEstimationProtocol"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final faeCounter$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static isInInquiryFlow:Z

.field private static nativeListenerPtr:Ljava/lang/Long;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static personaSdk:Lcom/roblox/universalapp/facialageestimation/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-direct {v0}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    new-instance v0, Lgm/a;

    invoke-direct {v0}, Lgm/a;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->faeCounter$delegate:Ljt/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->faeCounter_delegate$lambda$0()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method private static final faeCounter_delegate$lambda$0()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 4

    sget-object v0, Lsm/c;->a:Lsm/c;

    sget-object v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;->COUNTER:Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;

    invoke-static {v0}, Lkotlin/collections/p0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lsm/c$a;

    const-string v2, "fae_counter"

    invoke-direct {v1, v2, v0}, Lsm/c$a;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    const/16 v0, 0xa

    const/16 v2, 0x17

    const/16 v3, 0x7e9

    invoke-interface {v1, v3, v0, v2}, Lsm/a;->b(III)V

    const-string v0, "Facial age estimation related counters"

    invoke-interface {v1, v0}, Lsm/a;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$a;->d()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    return-object v0
.end method

.method private final getFaeCounter()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->faeCounter$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    return-object v0
.end method

.method private final logFAECounter(Ljava/lang/String;)V
    .locals 6

    invoke-direct {p0}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->getFaeCounter()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;

    move-result-object v0

    sget-object v1, Lsm/c;->a:Lsm/c;

    new-instance v1, Lsm/c$b;

    invoke-direct {v1}, Lsm/c$b;-><init>()V

    const-string v2, "state"

    invoke-interface {v1, v2, p1}, Lsm/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Lsm/c$b;->l()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Lsm/c;->g(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;DILjava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final isAvailable()Z
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->personaSdk:Lcom/roblox/universalapp/facialageestimation/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isInInquiryFlow()Z
    .locals 1

    sget-boolean v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    return v0
.end method

.method public onCancel(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inquiry canceled: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FacialAgeEstimationProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->nativeListenerPtr:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/roblox/universalapp/facialageestimation/JNIInquiryResultListener;->onCancel(JLjava/lang/String;)V

    sget-object p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    const-string v0, "fae_inquiry_canceled"

    invoke-direct {p1, v0}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "fae_null_native_listener"

    invoke-direct {p0, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    const-string p1, "Native listener pointer is null"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onComplete(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inquiry completed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FacialAgeEstimationProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->nativeListenerPtr:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1}, Lcom/roblox/universalapp/facialageestimation/JNIInquiryResultListener;->onComplete(JLjava/lang/String;)V

    sget-object p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    const-string v0, "fae_inquiry_completed"

    invoke-direct {p1, v0}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "Native listener pointer is null"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string p1, "fae_null_native_listener"

    invoke-direct {p0, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 3
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lj/b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_1

    goto/16 :goto_2

    :cond_1
    :try_start_0
    const-string v0, "com.roblox.client.personasdk.PersonaActivityResultLauncher"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.roblox.universalapp.facialageestimation.PersonaSdk"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/roblox/universalapp/facialageestimation/a;

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/facialageestimation/a;->onActivityCreated(Lj/b;)V

    sput-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->personaSdk:Lcom/roblox/universalapp/facialageestimation/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    instance-of v0, p1, Ljava/lang/ClassNotFoundException;

    const-string v1, "FacialAgeEstimationProtocol"

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Class not found: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_2
    instance-of v0, p1, Ljava/lang/NoSuchMethodException;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No such method: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_3
    instance-of v0, p1, Ljava/lang/IllegalAccessException;

    if-nez v0, :cond_5

    instance-of v0, p1, Ljava/lang/reflect/InvocationTargetException;

    if-nez v0, :cond_5

    instance-of v0, p1, Ljava/lang/InstantiationException;

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown error: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_5
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to create PersonaActivityResultLauncher instance: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->personaSdk:Lcom/roblox/universalapp/facialageestimation/a;

    const/4 p1, 0x0

    sput-boolean p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    return-void
.end method

.method public onError(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "debugMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inquiry error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", debug message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FacialAgeEstimationProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    sput-boolean v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->nativeListenerPtr:Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lcom/roblox/universalapp/facialageestimation/JNIInquiryResultListener;->onError(JLjava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    const-string p2, "fae_inquiry_error"

    invoke-direct {p1, p2}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "fae_null_native_listener"

    invoke-direct {p0, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public final setListener(J)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sput-object p1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->nativeListenerPtr:Ljava/lang/Long;

    return-void
.end method

.method public final startInquiry(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "inquiryId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->personaSdk:Lcom/roblox/universalapp/facialageestimation/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    sput-boolean v1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->isInInquiryFlow:Z

    sget-object v1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-interface {v0, p1, p2, v1}, Lcom/roblox/universalapp/facialageestimation/a;->launchInquiry(Ljava/lang/String;Ljava/lang/String;Lcom/roblox/universalapp/facialageestimation/a$a;)V

    const-string p1, "fae_launch_inquiry"

    invoke-direct {v1, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p2, "FacialAgeEstimationProtocol"

    const-string v0, "PersonaSdk is not initialized"

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->nativeListenerPtr:Ljava/lang/Long;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2, p1, v0}, Lcom/roblox/universalapp/facialageestimation/JNIInquiryResultListener;->onError(JLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "fae_null_native_listener"

    invoke-direct {p0, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    const-string p1, "Native listener pointer is null"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const-string p1, "fae_sdk_not_initialized"

    invoke-direct {p0, p1}, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->logFAECounter(Ljava/lang/String;)V

    return-void
.end method
