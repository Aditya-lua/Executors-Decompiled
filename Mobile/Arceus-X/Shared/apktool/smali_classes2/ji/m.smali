.class public Lji/m;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/m$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "RealTime"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/m$a;-><init>(Lji/m;Lji/n;)V

    const-string v1, "isConnected"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
