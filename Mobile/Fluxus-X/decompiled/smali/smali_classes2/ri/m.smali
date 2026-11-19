.class public Lri/m;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/m$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "RealTime"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/m$a;-><init>(Lri/m;Lri/n;)V

    const-string v1, "isConnected"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
