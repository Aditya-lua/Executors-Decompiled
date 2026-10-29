.class public Lji/e;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Game"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/e$a;-><init>(Lji/e;Lji/f;)V

    const-string v1, "launchGame"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
