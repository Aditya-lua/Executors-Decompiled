.class public final Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J1\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;",
        "",
        "sdkVersion",
        "",
        "min",
        "",
        "expire",
        "ttl",
        "",
        "<init>",
        "(Ljava/lang/String;IIJ)V",
        "getSdkVersion",
        "()Ljava/lang/String;",
        "getMin",
        "()I",
        "getExpire",
        "getTtl",
        "()J",
        "toStringifyJSON",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "sdk_base_release"
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
.field private final expire:I

.field private final min:I

.field private final sdkVersion:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ttl:J


# direct methods
.method public constructor <init>(Ljava/lang/String;IIJ)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "sdkVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    iput p2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    iput p3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    iput-wide p4, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;Ljava/lang/String;IIJILjava/lang/Object;)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-wide p4, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    :cond_3
    move-wide p6, p4

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->copy(Ljava/lang/String;IIJ)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    return v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IIJ)Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "sdkVersion"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-wide v5, p4

    invoke-direct/range {v1 .. v6}, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;-><init>(Ljava/lang/String;IIJ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;

    iget-object v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    iget-object v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    iget v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    iget v3, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    iget-wide v5, p1, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getExpire()I
    .locals 1

    iget v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    return v0
.end method

.method public final getMin()I
    .locals 1

    iget v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    return v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getTtl()J
    .locals 2

    iget-wide v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    iget v1, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    iget-wide v3, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ExceptionManagerConfiguration(sdkVersion="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", min="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", expire="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", ttl="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toStringifyJSON()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "sdk_ver"

    iget-object v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "min"

    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->min:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "expire"

    iget v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->expire:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "ttl"

    iget-wide v2, p0, Lcom/appsflyer/sdk_base/exception_manager/ExceptionManagerConfiguration;->ttl:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
