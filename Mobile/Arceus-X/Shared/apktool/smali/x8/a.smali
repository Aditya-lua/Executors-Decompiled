.class public final Lx8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lx8/b;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lwa/r;

    invoke-direct {v0, p0}, Lwa/r;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
