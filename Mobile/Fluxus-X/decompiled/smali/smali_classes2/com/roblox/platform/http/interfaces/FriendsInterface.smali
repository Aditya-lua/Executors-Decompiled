.class public interface abstract Lcom/roblox/platform/http/interfaces/FriendsInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract acceptFriendRequest(J)Lsw/d;
    .param p1    # J
        .annotation runtime Lvw/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v1/users/{requesterUserId}/accept-friend-request"
    .end annotation
.end method

.method public abstract declineFriendRequest(J)Lsw/d;
    .param p1    # J
        .annotation runtime Lvw/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v1/users/{requesterUserId}/decline-friend-request"
    .end annotation
.end method
