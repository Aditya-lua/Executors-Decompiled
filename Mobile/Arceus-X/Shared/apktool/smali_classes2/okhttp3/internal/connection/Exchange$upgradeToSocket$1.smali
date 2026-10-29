.class public final Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/q0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/connection/Exchange;->upgradeToSocket()Lxu/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\u00060\u0005R\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001e\u0010\u000c\u001a\u00060\u000bR\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "okhttp3/internal/connection/Exchange$upgradeToSocket$1",
        "Lxu/q0;",
        "",
        "cancel",
        "()V",
        "Lokhttp3/internal/connection/Exchange$RequestBodySink;",
        "Lokhttp3/internal/connection/Exchange;",
        "sink",
        "Lokhttp3/internal/connection/Exchange$RequestBodySink;",
        "getSink",
        "()Lokhttp3/internal/connection/Exchange$RequestBodySink;",
        "Lokhttp3/internal/connection/Exchange$ResponseBodySource;",
        "source",
        "Lokhttp3/internal/connection/Exchange$ResponseBodySource;",
        "getSource",
        "()Lokhttp3/internal/connection/Exchange$ResponseBodySource;",
        "okhttp"
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
.field private final sink:Lokhttp3/internal/connection/Exchange$RequestBodySink;

.field private final source:Lokhttp3/internal/connection/Exchange$ResponseBodySource;

.field final synthetic this$0:Lokhttp3/internal/connection/Exchange;


# direct methods
.method public constructor <init>(Lokhttp3/internal/connection/Exchange;)V
    .locals 12

    iput-object p1, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->this$0:Lokhttp3/internal/connection/Exchange;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lokhttp3/internal/connection/Exchange$RequestBodySink;

    invoke-static {p1}, Lokhttp3/internal/connection/Exchange;->access$getCodec$p(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/http/ExchangeCodec;

    move-result-object v1

    invoke-interface {v1}, Lokhttp3/internal/http/ExchangeCodec;->getSocket()Lxu/q0;

    move-result-object v1

    invoke-interface {v1}, Lxu/q0;->getSink()Lxu/p0;

    move-result-object v2

    const-wide/16 v3, -0x1

    const/4 v5, 0x1

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/connection/Exchange$RequestBodySink;-><init>(Lokhttp3/internal/connection/Exchange;Lxu/p0;JZ)V

    iput-object v0, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->sink:Lokhttp3/internal/connection/Exchange$RequestBodySink;

    new-instance v6, Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    invoke-static {v1}, Lokhttp3/internal/connection/Exchange;->access$getCodec$p(Lokhttp3/internal/connection/Exchange;)Lokhttp3/internal/http/ExchangeCodec;

    move-result-object p1

    invoke-interface {p1}, Lokhttp3/internal/http/ExchangeCodec;->getSocket()Lxu/q0;

    move-result-object p1

    invoke-interface {p1}, Lxu/q0;->getSource()Lxu/r0;

    move-result-object v8

    const-wide/16 v9, -0x1

    const/4 v11, 0x1

    move-object v7, v1

    invoke-direct/range {v6 .. v11}, Lokhttp3/internal/connection/Exchange$ResponseBodySource;-><init>(Lokhttp3/internal/connection/Exchange;Lxu/r0;JZ)V

    iput-object v6, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->source:Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->this$0:Lokhttp3/internal/connection/Exchange;

    invoke-virtual {v0}, Lokhttp3/internal/connection/Exchange;->cancel()V

    return-void
.end method

.method public getSink()Lokhttp3/internal/connection/Exchange$RequestBodySink;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->sink:Lokhttp3/internal/connection/Exchange$RequestBodySink;

    return-object v0
.end method

.method public bridge synthetic getSink()Lxu/p0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->getSink()Lokhttp3/internal/connection/Exchange$RequestBodySink;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Lokhttp3/internal/connection/Exchange$ResponseBodySource;
    .locals 1

    .line 2
    iget-object v0, p0, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->source:Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    return-object v0
.end method

.method public bridge synthetic getSource()Lxu/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lokhttp3/internal/connection/Exchange$upgradeToSocket$1;->getSource()Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    move-result-object v0

    return-object v0
.end method
