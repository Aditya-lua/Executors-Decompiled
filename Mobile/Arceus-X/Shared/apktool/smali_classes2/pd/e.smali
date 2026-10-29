.class public abstract Lpd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpd/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lpd/e$a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lpd/m;

    invoke-direct {v0}, Lpd/m;-><init>()V

    return-object v0
.end method

.method public static g(Landroid/os/Bundle;)Lpd/e;
    .locals 6
    .param p0    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "user.status"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lpd/e;->c()Lpd/e$a;

    move-result-object p0

    invoke-virtual {p0}, Lpd/e$a;->a()Lpd/e;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {}, Lpd/e;->c()Lpd/e$a;

    move-result-object v1

    invoke-static {p0, v0}, Lpd/e;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpd/e$a;->f(Ljava/lang/Integer;)Lpd/e$a;

    const-string v0, "age.range.lower"

    invoke-static {p0, v0}, Lpd/e;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpd/e$a;->b(Ljava/lang/Integer;)Lpd/e$a;

    const-string v0, "age.range.upper"

    invoke-static {p0, v0}, Lpd/e;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpd/e$a;->c(Ljava/lang/Integer;)Lpd/e$a;

    const-string v0, "most.recent.approval.date"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    new-instance v2, Ljava/util/Date;

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-direct {v2, v4, v5}, Ljava/util/Date;-><init>(J)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Lpd/e$a;->e(Ljava/util/Date;)Lpd/e$a;

    const-string v0, "install.id"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-virtual {v1, v3}, Lpd/e$a;->d(Ljava/lang/String;)Lpd/e$a;

    invoke-virtual {v1}, Lpd/e$a;->a()Lpd/e;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Integer;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/util/Date;
.end method

.method public abstract f()Ljava/lang/Integer;
.end method
