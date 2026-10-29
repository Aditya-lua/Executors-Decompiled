.class public Lpd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lpd/b;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lpd/g;

    new-instance v1, Lpd/l;

    invoke-direct {v1, p0}, Lpd/l;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lpd/g;-><init>(Lpd/l;)V

    return-object v0
.end method
