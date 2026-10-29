.class public interface abstract Lzk/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(J)Ljv/d;
    .param p1    # J
        .annotation runtime Lmv/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v1/users/{requesterUserId}/decline-friend-request"
    .end annotation
.end method

.method public abstract b(J)Ljv/d;
    .param p1    # J
        .annotation runtime Lmv/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljv/d<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation

    .annotation runtime Lmv/o;
        value = "/v1/users/{requesterUserId}/accept-friend-request"
    .end annotation
.end method
