.class public interface abstract Lcom/roblox/platform/http/interfaces/ChatInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract markAsRead(Lil/a;)Lsw/d;
    .param p1    # Lil/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil/a;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/mark-as-read"
    .end annotation
.end method

.method public abstract sendMessage(Lil/b;)Lsw/d;
    .param p1    # Lil/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil/b;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/v2/send-message"
    .end annotation
.end method
