.class public interface abstract Lcom/roblox/platform/http/interfaces/PlatformChatInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract markConversations(Lll/a;)Lsw/d;
    .param p1    # Lll/a;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lll/a;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/platform-chat-api/v1/mark-conversations"
    .end annotation
.end method

.method public abstract markConversations(Lll/b;)Lsw/d;
    .param p1    # Lll/b;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lll/b;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/platform-chat-api/v1/mark-conversations"
    .end annotation
.end method

.method public abstract sendMessages(Lll/c;)Lsw/d;
    .param p1    # Lll/c;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lll/c;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/platform-chat-api/v1/send-messages"
    .end annotation
.end method

.method public abstract sendMessages(Lll/d;)Lsw/d;
    .param p1    # Lll/d;
        .annotation runtime Lvw/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lll/d;",
            ")",
            "Lsw/d<",
            "Lmv/i0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lvw/o;
        value = "/platform-chat-api/v1/send-messages"
    .end annotation
.end method
