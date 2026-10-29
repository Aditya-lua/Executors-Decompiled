.class public final Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ&\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;",
        "",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
        "trackingEventsServiceApi",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V",
        "",
        "sessionToken",
        "Ljt/n;",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
        "getPublicKey-gIAlu-s$tracking_events_release",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "getPublicKey",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;",
        "request",
        "",
        "sendEvents-0E7RQCE$tracking_events_release",
        "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;",
        "sendEvents",
        "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;",
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


# instance fields
.field private final trackingEventsServiceApi:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->trackingEventsServiceApi:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    return-void
.end method


# virtual methods
.method public final getPublicKey-gIAlu-s$tracking_events_release(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    const-string v3, "Failed to get public key: "

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->trackingEventsServiceApi:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$getPublicKey$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;->getPublicKey(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljv/x;

    invoke-virtual {p2}, Ljv/x;->g()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;

    if-eqz p1, :cond_4

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Empty response body from /public-key"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/Exception;

    invoke-virtual {p2}, Ljv/x;->b()I

    move-result p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object p2, Ljt/n;->b:Ljt/n$a;

    new-instance p2, Ljava/lang/Exception;

    invoke-static {p1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final sendEvents-0E7RQCE$tracking_events_release(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;",
            "Lnt/b<",
            "-",
            "Ljt/n<",
            "Lkotlin/Unit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;

    invoke-direct {v0, p0, p3}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;Lnt/b;)V

    :goto_0
    iget-object p3, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->label:I

    const-string v3, "Failed to send events: "

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;->trackingEventsServiceApi:Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService$sendEvents$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;->sendEvents(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljv/x;

    invoke-virtual {p3}, Ljv/x;->g()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ljt/n;->b:Ljt/n$a;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Ljava/lang/Exception;

    invoke-virtual {p3}, Ljv/x;->b()I

    move-result p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object p2, Ljt/n;->b:Ljt/n$a;

    new-instance p2, Ljava/lang/Exception;

    invoke-static {p1}, Ljt/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
