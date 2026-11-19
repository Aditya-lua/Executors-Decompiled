.class public final Lea/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;)Lea/a;
    .locals 1
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lgb/i0;->b()V

    new-instance p0, Lgb/o0;

    invoke-static {}, Lgb/i0;->c()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lgb/i;->a(Landroid/app/Application;)Lgb/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lgb/o0;-><init>(Lgb/i;)V

    return-object p0
.end method

.method public static b(Landroid/app/Activity;)Lea/g;
    .locals 2
    .param p0    # Landroid/app/Activity;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lgb/i0;->b()V

    new-instance p0, Lgb/p0;

    invoke-static {}, Lgb/i0;->c()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lgb/p;->a(Landroid/app/Application;)Lgb/n;

    move-result-object v0

    invoke-static {}, Lgb/i0;->c()Landroid/app/Application;

    move-result-object v1

    invoke-static {v1}, Lgb/i;->a(Landroid/app/Application;)Lgb/i;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lgb/p0;-><init>(Lgb/n;Lgb/i;)V

    return-object p0
.end method
