.class public interface abstract Lzk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(JLjava/lang/String;)Ljv/d;
    .param p1    # J
        .annotation runtime Lmv/s;
            value = "placeId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lmv/s;
            value = "eventType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v1/games/sessions/report/{placeId}/{eventType}"
    .end annotation
.end method
