.class public final Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000fR$\u0010\u0017\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "json",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
        "publicKeyResponse",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;",
        "createTrackingEventsRequest",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;",
        "",
        "DEFAULT_MEMORY_THRESHOLD",
        "I",
        "KEY_SESSION_TOKEN",
        "Ljava/lang/String;",
        "KEY_SERVER_ENDPOINT",
        "KEY_ENCRYPTED_REQUEST_FILE",
        "KEY_FLUSH_TOKEN",
        "WORK_NAME_PREFIX",
        "Lum/h;",
        "",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;",
        "trackingEventsJsonAdapter",
        "Lum/h;",
        "tracking-events_release"
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
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$createTrackingEventsRequest(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;->createTrackingEventsRequest(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createTrackingEventsRequest(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$5:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$4:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "{\"events\": "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "}"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger;->access$getTrackingEventsJsonAdapter$cp()Lum/h;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Lum/h;->fromJson(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    goto :goto_1

    :cond_4
    move-object v2, v5

    :goto_1
    if-eqz v2, :cond_9

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;->getPublicKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$1:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$2:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->label:I

    invoke-static {p3, v3, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt;->obfuscatePayload(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast p3, Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;

    new-instance p1, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;->getVersion()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;->getEncryptedKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;->getEncryptedPayload()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p2, v0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_7
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$1:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$2:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$3:Ljava/lang/Object;

    const-string p1, ""

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$4:Ljava/lang/Object;

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->L$5:Ljava/lang/Object;

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/tracking/RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1;->label:I

    invoke-static {p3, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt;->obfuscatePayload(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    move-object p2, p1

    :goto_4
    check-cast p3, Ljava/lang/String;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    invoke-direct {v0, p2, p1, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_9
    :goto_5
    return-object v5
.end method
