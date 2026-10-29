.class public Lji/o;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Social"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/o$a;-><init>(Lji/o;Lji/p;)V

    const-string v1, "presentShareDialog"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
