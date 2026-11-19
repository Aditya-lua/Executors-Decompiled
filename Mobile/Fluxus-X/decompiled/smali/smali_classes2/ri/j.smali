.class public Lri/j;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/j$a;,
        Lri/j$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Overlay"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/j$a;-><init>(Lri/j;Lri/k;)V

    const-string v2, "close"

    invoke-virtual {p0, v2, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    new-instance v0, Lri/j$b;

    invoke-direct {v0, p0, v1}, Lri/j$b;-><init>(Lri/j;Lri/k;)V

    const-string v1, "setSubmitState"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
