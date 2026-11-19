.class public Lri/b;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/b$b;,
        Lri/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Chat"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/b$b;-><init>(Lri/b;Lri/c;)V

    const-string v2, "startChatConversation"

    invoke-virtual {p0, v2, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    new-instance v0, Lri/b$a;

    invoke-direct {v0, p0, v1}, Lri/b$a;-><init>(Lri/b;Lri/c;)V

    const-string v1, "shareGameToChat"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
