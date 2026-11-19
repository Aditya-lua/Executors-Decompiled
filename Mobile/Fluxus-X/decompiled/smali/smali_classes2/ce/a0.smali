.class public final Lce/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lde/q1;

.field public static final d:Landroid/content/Intent;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lde/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lde/q1;

    const-string v1, "SplitInstallService"

    invoke-direct {v0, v1}, Lde/q1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/a0;->c:Lde/q1;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    sput-object v0, Lce/a0;->d:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lce/a0;->a:Ljava/lang/String;

    invoke-static {p1}, Lde/q0;->a(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance v0, Lde/g;

    invoke-static {p1}, Lde/n0;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    sget-object v2, Lce/a0;->c:Lde/q1;

    sget-object v4, Lce/a0;->d:Landroid/content/Intent;

    sget-object v5, Lce/r;->a:Lce/r;

    const/4 v6, 0x0

    const-string v3, "SplitInstallService"

    invoke-direct/range {v0 .. v6}, Lde/g;-><init>(Landroid/content/Context;Lde/q1;Ljava/lang/String;Landroid/content/Intent;Lce/r;Lde/b;)V

    iput-object v0, p0, Lce/a0;->b:Lde/g;

    :cond_0
    return-void
.end method

.method public static bridge synthetic a()Landroid/os/Bundle;
    .locals 1

    invoke-static {}, Lce/a0;->j()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static bridge synthetic b(Lde/j1;)Landroid/os/Bundle;
    .locals 2

    invoke-static {}, Lce/a0;->j()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Lde/j1;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p0, "event_timestamps"

    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    return-object v0
.end method

.method public static bridge synthetic f()Lde/q1;
    .locals 1

    sget-object v0, Lce/a0;->c:Lde/q1;

    return-object v0
.end method

.method public static bridge synthetic g(Lce/a0;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lce/a0;->a:Ljava/lang/String;

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

    sget-object v0, Lce/a0;->c:Lde/q1;

    const/16 v1, -0xe

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "onError(%d)"

    invoke-virtual {v0, v3, v2}, Lde/q1;->b(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lce/a;

    invoke-direct {v0, v1}, Lce/a;-><init>(I)V

    invoke-static {v0}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lce/a0;->b:Lde/g;

    if-nez v0, :cond_0

    invoke-static {}, Lce/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lce/a0;->c:Lde/q1;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "deferredInstall(%s)"

    invoke-virtual {v0, v2, v1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Ltb/k;

    invoke-direct {v0}, Ltb/k;-><init>()V

    iget-object v1, p0, Lce/a0;->b:Lde/g;

    new-instance v2, Lce/u;

    invoke-direct {v2, p0, v0, p1, v0}, Lce/u;-><init>(Lce/a0;Ltb/k;Ljava/util/List;Ltb/k;)V

    invoke-virtual {v1, v2, v0}, Lde/g;->s(Lde/r1;Ltb/k;)V

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lce/a0;->b:Lde/g;

    if-nez v0, :cond_0

    invoke-static {}, Lce/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lce/a0;->c:Lde/q1;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "deferredUninstall(%s)"

    invoke-virtual {v0, v2, v1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Ltb/k;

    invoke-direct {v0}, Ltb/k;-><init>()V

    iget-object v1, p0, Lce/a0;->b:Lde/g;

    new-instance v2, Lce/t;

    invoke-direct {v2, p0, v0, p1, v0}, Lce/t;-><init>(Lce/a0;Ltb/k;Ljava/util/List;Ltb/k;)V

    invoke-virtual {v1, v2, v0}, Lde/g;->s(Lde/r1;Ltb/k;)V

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/Collection;Ljava/util/Collection;Lde/j1;)Lcom/google/android/gms/tasks/Task;
    .locals 10

    iget-object v0, p0, Lce/a0;->b:Lde/g;

    if-nez v0, :cond_0

    invoke-static {}, Lce/a0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lce/a0;->c:Lde/q1;

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "startInstall(%s,%s)"

    invoke-virtual {v0, v2, v1}, Lde/q1;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v5, Ltb/k;

    invoke-direct {v5}, Ltb/k;-><init>()V

    iget-object v0, p0, Lce/a0;->b:Lde/g;

    new-instance v3, Lce/s;

    move-object v9, v5

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lce/s;-><init>(Lce/a0;Ltb/k;Ljava/util/Collection;Ljava/util/Collection;Lde/j1;Ltb/k;)V

    invoke-virtual {v0, v3, v5}, Lde/g;->s(Lde/r1;Ltb/k;)V

    invoke-virtual {v5}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
