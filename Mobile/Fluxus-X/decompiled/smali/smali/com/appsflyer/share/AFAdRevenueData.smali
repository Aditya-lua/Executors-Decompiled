.class public final Lcom/appsflyer/share/AFAdRevenueData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002H\u00c7\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H\u00c7\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c7\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c7\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d7\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010!\u001a\u0004\u0008\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001f\u001a\u0004\u0008#\u0010\u0010R\u001a\u0010\u0008\u001a\u00020\u00078\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010$\u001a\u0004\u0008%\u0010\u0015"
    }
    d2 = {
        "Lcom/appsflyer/share/AFAdRevenueData;",
        "",
        "",
        "monetizationNetwork",
        "Lcom/appsflyer/share/MediationNetwork;",
        "mediationNetwork",
        "currencyIso4217Code",
        "",
        "revenue",
        "<init>",
        "(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)V",
        "",
        "areAllFieldsValid",
        "()Z",
        "AFKeystoreWrapper",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/appsflyer/share/MediationNetwork;",
        "component3",
        "component4",
        "()D",
        "copy",
        "(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/share/AFAdRevenueData;",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "toString",
        "Ljava/lang/String;",
        "getMonetizationNetwork",
        "Lcom/appsflyer/share/MediationNetwork;",
        "getMediationNetwork",
        "getCurrencyIso4217Code",
        "D",
        "getRevenue"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final currencyIso4217Code:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mediationNetwork:Lcom/appsflyer/share/MediationNetwork;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final monetizationNetwork:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final revenue:D


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/share/MediationNetwork;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    iput-object p3, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    iput-wide p4, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    return-void
.end method

.method private final AFKeystoreWrapper()Z
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    sget-object v1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v2, Lcom/appsflyer/sdk_base/logger/LogTag;->AD_REVENUE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "Currency is not ISO 4217 currency code"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->w$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic copy$default(Lcom/appsflyer/share/AFAdRevenueData;Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;DILjava/lang/Object;)Lcom/appsflyer/share/AFAdRevenueData;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    :cond_3
    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/appsflyer/share/AFAdRevenueData;->copy(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/share/AFAdRevenueData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final areAllFieldsValid()Z
    .locals 1

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/share/AFAdRevenueData;->AFKeystoreWrapper()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/appsflyer/share/MediationNetwork;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/share/AFAdRevenueData;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/share/MediationNetwork;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/appsflyer/share/AFAdRevenueData;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/share/AFAdRevenueData;-><init>(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/appsflyer/share/AFAdRevenueData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/appsflyer/share/AFAdRevenueData;

    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    iget-object v3, p1, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    iget-wide v5, p1, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCurrencyIso4217Code()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    return-object v0
.end method

.method public final getMediationNetwork()Lcom/appsflyer/share/MediationNetwork;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    return-object v0
.end method

.method public final getMonetizationNetwork()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    return-object v0
.end method

.method public final getRevenue()D
    .locals 2

    iget-wide v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFAdRevenueData;->monetizationNetwork:Ljava/lang/String;

    iget-object v1, p0, Lcom/appsflyer/share/AFAdRevenueData;->mediationNetwork:Lcom/appsflyer/share/MediationNetwork;

    iget-object v2, p0, Lcom/appsflyer/share/AFAdRevenueData;->currencyIso4217Code:Ljava/lang/String;

    iget-wide v3, p0, Lcom/appsflyer/share/AFAdRevenueData;->revenue:D

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "AFAdRevenueData(monetizationNetwork="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", mediationNetwork="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currencyIso4217Code="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", revenue="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
