.class public interface abstract Lcom/roblox/platform/http/interfaces/TencentInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract authenticateQQToken(Lpl/a;Ljava/lang/String;)Lsw/d;
    .param p1    # Lpl/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lvw/t;
            value = "apiKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/a;",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "v1/qq/token-authentication"
    .end annotation
.end method

.method public abstract authenticateQQTokenWithChannelId(Lpl/b;Ljava/lang/String;)Lsw/d;
    .param p1    # Lpl/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lvw/t;
            value = "apiKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpl/b;",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "v1/qq/token-authentication"
    .end annotation
.end method

.method public abstract authenticateToken(Lnl/a;Ljava/lang/String;)Lsw/d;
    .param p1    # Lnl/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lvw/t;
            value = "apiKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl/a;",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "v1/wechat/token-authentication"
    .end annotation
.end method

.method public abstract authenticateTokenWithChannelId(Lnl/b;Ljava/lang/String;)Lsw/d;
    .param p1    # Lnl/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lvw/t;
            value = "apiKey"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnl/b;",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "v1/wechat/token-authentication"
    .end annotation
.end method
