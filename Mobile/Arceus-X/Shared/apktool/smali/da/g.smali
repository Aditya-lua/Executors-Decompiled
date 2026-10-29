.class public final Lda/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;)Lda/a;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lfb/h0;->b()V

    new-instance p0, Lfb/n0;

    invoke-static {}, Lfb/h0;->c()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lfb/h;->a(Landroid/app/Application;)Lfb/h;

    move-result-object v0

    invoke-direct {p0, v0}, Lfb/n0;-><init>(Lfb/h;)V

    return-object p0
.end method

.method public static b(Landroid/app/Activity;)Lda/e;
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lfb/h0;->b()V

    new-instance p0, Lfb/o0;

    invoke-static {}, Lfb/h0;->c()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lfb/o;->a(Landroid/app/Application;)Lfb/m;

    move-result-object v0

    invoke-static {}, Lfb/h0;->c()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lfb/h;->a(Landroid/app/Application;)Lfb/h;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lfb/o0;-><init>(Lfb/m;Lfb/h;)V

    return-object p0
.end method
