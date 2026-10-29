.class public Lji/j;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/j$a;,
        Lji/j$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Overlay"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/j$a;-><init>(Lji/j;Lji/k;)V

    const-string v2, "close"

    invoke-virtual {p0, v2, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    new-instance v0, Lji/j$b;

    invoke-direct {v0, p0, v1}, Lji/j$b;-><init>(Lji/j;Lji/k;)V

    const-string v1, "setSubmitState"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
