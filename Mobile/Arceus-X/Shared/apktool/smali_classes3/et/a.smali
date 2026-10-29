.class public final Let/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/fragment/app/c;)Ldt/d;
    .locals 2

    move-object v0, p0

    :cond_0
    invoke-virtual {v0}, Landroidx/fragment/app/c;->K()Landroidx/fragment/app/c;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Ldt/d;

    if-eqz v1, :cond_0

    check-cast v0, Ldt/d;

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    instance-of v1, v0, Ldt/d;

    if-eqz v1, :cond_2

    check-cast v0, Ldt/d;

    return-object v0

    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    instance-of v1, v1, Ldt/d;

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    check-cast p0, Ldt/d;

    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v1, "No injector was found for %s"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Landroidx/fragment/app/c;)V
    .locals 4

    const-string v0, "fragment"

    invoke-static {p0, v0}, Lft/h;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Let/a;->a(Landroidx/fragment/app/c;)Ldt/d;

    move-result-object v0

    const/4 v1, 0x3

    const-string v2, "dagger.android.support"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "An injector for %s was found in %s"

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {p0, v0}, Let/a;->c(Ljava/lang/Object;Ldt/d;)V

    return-void
.end method

.method public static c(Ljava/lang/Object;Ldt/d;)V
    .locals 2

    invoke-interface {p1}, Ldt/d;->c()Ldt/a;

    move-result-object v0

    const-string v1, "%s.androidInjector() returned null"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lft/h;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p0}, Ldt/a;->a(Ljava/lang/Object;)V

    return-void
.end method
