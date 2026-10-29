.class public Lji/h;
.super Ltk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lji/h$a;,
        Lji/h$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Navigation"

    invoke-direct {p0, v0}, Ltk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lji/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lji/h$a;-><init>(Lji/h;Lji/i;)V

    const-string v2, "navigateToFeature"

    invoke-virtual {p0, v2, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    new-instance v0, Lji/h$b;

    invoke-direct {v0, p0, v1}, Lji/h$b;-><init>(Lji/h;Lji/i;)V

    const-string v1, "openUserProfile"

    invoke-virtual {p0, v1, v0}, Ltk/b;->d(Ljava/lang/String;Ltk/b$a;)V

    return-void
.end method
