.class public final Lae/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lbe/q1;

.field public static final d:Landroid/content/Intent;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lbe/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbe/q1;

    const-string v1, "SplitInstallService"

    invoke-direct {v0, v1}, Lbe/q1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lae/a0;->c:Lbe/q1;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lae/a0;->d:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lae/a0;->a:Ljava/lang/String;

    invoke-static {p1}, Lbe/q0;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance v0, Lbe/g;

    invoke-static {p1}, Lbe/n0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lae/a0;->c:Lbe/q1;

    sget-object v4, Lae/a0;->d:Landroid/content/Intent;

    sget-object v5, Lae/r;->a:Lae/r;

    const/4 v6, 0x0

    const-string v3, "SplitInstallService"

    invoke-direct/range {v0 .. v6}, Lbe/g;-><init>(Landroid/content/Context;Lbe/q1;Ljava/lang/String;Landroid/content/Intent;Lae/r;Lbe/b;)V

    iput-object v0, p0, Lae/a0;->b:Lbe/g;

    :cond_0
    return-void
.end method

.method public static bridge synthetic a()Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Lae/a0;->j()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic b(Lbe/j1;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Lae/a0;->j()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lbe/j1;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static bridge synthetic f()Lbe/q1;
    .locals 1

    sget-object v0, Lae/a0;->c:Lbe/q1;

    return-object v0
.end method

.method public static bridge synthetic g(Lae/a0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lae/a0;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic h(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "language"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static bridge synthetic i(Ljava/util/Collection;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "module_name"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static j()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "playcore_version_code"

    const/16 v2, 0x2afc

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static k()Lcom/google/android/gms/tasks/Task;
    .locals 4

    sget-object v0, Lae/a0;->c:Lbe/q1;

    const/16 v1, -0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "onError(%d)"

    invoke-virtual {v0, v3, v2}, Lbe/q1;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lae/a;

    invoke-direct {v0, v1}, Lae/a;-><init>(I)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lae/a0;->b:Lbe/g;

    if-nez v0, :cond_0

    invoke-static {}, Lae/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lae/a0;->c:Lbe/q1;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "deferredInstall(%s)"

    invoke-virtual {v0, v2, v1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iget-object v1, p0, Lae/a0;->b:Lbe/g;

    new-instance v2, Lae/u;

    invoke-direct {v2, p0, v0, p1, v0}, Lae/u;-><init>(Lae/a0;Lsb/k;Ljava/util/List;Lsb/k;)V

    invoke-virtual {v1, v2, v0}, Lbe/g;->s(Lbe/r1;Lsb/k;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lae/a0;->b:Lbe/g;

    if-nez v0, :cond_0

    invoke-static {}, Lae/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lae/a0;->c:Lbe/q1;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "deferredUninstall(%s)"

    invoke-virtual {v0, v2, v1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iget-object v1, p0, Lae/a0;->b:Lbe/g;

    new-instance v2, Lae/t;

    invoke-direct {v2, p0, v0, p1, v0}, Lae/t;-><init>(Lae/a0;Lsb/k;Ljava/util/List;Lsb/k;)V

    invoke-virtual {v1, v2, v0}, Lbe/g;->s(Lbe/r1;Lsb/k;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/Collection;Ljava/util/Collection;Lbe/j1;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    iget-object v0, p0, Lae/a0;->b:Lbe/g;

    if-nez v0, :cond_0

    invoke-static {}, Lae/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lae/a0;->c:Lbe/q1;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "startInstall(%s,%s)"

    invoke-virtual {v0, v2, v1}, Lbe/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v5, Lsb/k;

    invoke-direct {v5}, Lsb/k;-><init>()V

    iget-object v0, p0, Lae/a0;->b:Lbe/g;

    new-instance v3, Lae/s;

    move-object v9, v5

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lae/s;-><init>(Lae/a0;Lsb/k;Ljava/util/Collection;Ljava/util/Collection;Lbe/j1;Lsb/k;)V

    invoke-virtual {v0, v3, v5}, Lbe/g;->s(Lbe/r1;Lsb/k;)V

    invoke-virtual {v5}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
