.class public Lri/e;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Game"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/e$a;-><init>(Lri/e;Lri/f;)V

    const-string v1, "launchGame"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
