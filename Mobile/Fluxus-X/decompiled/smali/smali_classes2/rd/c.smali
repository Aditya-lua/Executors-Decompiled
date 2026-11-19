.class public Lrd/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lrd/b;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lrd/g;

    new-instance v1, Lrd/l;

    invoke-direct {v1, p0}, Lrd/l;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lrd/g;-><init>(Lrd/l;)V

    return-object v0
.end method
