.class public interface abstract Lcom/roblox/platform/http/interfaces/MetricsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract postSessionReport(JLjava/lang/String;)Lsw/d;
    .param p1    # J
        .annotation runtime Lvw/s;
            value = "placeId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lvw/s;
            value = "eventType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v1/games/sessions/report/{placeId}/{eventType}"
    .end annotation
.end method
