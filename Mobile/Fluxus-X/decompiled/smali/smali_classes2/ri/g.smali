.class public Lri/g;
.super Lal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lri/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Localization"

    invoke-direct {p0, v0}, Lal/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lri/g$a;

    invoke-direct {v0, p0}, Lri/g$a;-><init>(Lri/g;)V

    const-string v1, "languageChangeTrigger"

    invoke-virtual {p0, v1, v0}, Lal/b;->d(Ljava/lang/String;Lal/b$a;)V

    return-void
.end method
