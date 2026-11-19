.class public Lri/h;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/h$a;,
        Lri/h$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Navigation"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lri/h$a;-><init>(Lri/h;Lri/i;)V

    const-string v2, "navigateToFeature"

    invoke-virtual {p0, v2, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    new-instance v0, Lri/h$b;

    invoke-direct {v0, p0, v1}, Lri/h$b;-><init>(Lri/h;Lri/i;)V

    const-string v1, "openUserProfile"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
