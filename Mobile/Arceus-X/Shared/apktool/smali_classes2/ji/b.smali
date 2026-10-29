.class public Lji/b;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/b$b;,
        Lji/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Chat"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/b$b;-><init>(Lji/b;Lji/c;)V

    const-string v2, "startChatConversation"

    invoke-virtual {p0, v2, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    new-instance v0, Lji/b$a;

    invoke-direct {v0, p0, v1}, Lji/b$a;-><init>(Lji/b;Lji/c;)V

    const-string v1, "shareGameToChat"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
