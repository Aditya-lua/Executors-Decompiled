.class public Lri/o;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/o$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Social"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/o$a;-><init>(Lri/o;Lri/p;)V

    const-string v1, "presentShareDialog"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
