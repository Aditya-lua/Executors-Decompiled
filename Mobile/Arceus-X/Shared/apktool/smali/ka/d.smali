.class public final Lka/d;
.super Lka/e;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lka/e;-><init>([B)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lka/d;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic d(Lfb/n1;Lfb/n1;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;
    .locals 1

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Lka/d;->e(Lfb/n1;Lfb/n1;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lfb/n1;Lfb/n1;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;
    .locals 3

    invoke-static {p0}, Lka/d;->f(Lfb/n1;)Lfb/n1;

    move-result-object p0

    invoke-static {}, Lfb/n1;->f()Lfb/n1;

    move-result-object v0

    invoke-static {p1}, Lka/d;->f(Lfb/n1;)Lfb/n1;

    move-result-object p1

    invoke-static {}, Lfb/n1;->f()Lfb/n1;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;

    invoke-direct {v2, p0, v0, p1, v1}, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

.method public static f(Lfb/n1;)Lfb/n1;
    .locals 4

    sget-object v0, Lfb/n1;->b:Lfb/r1;

    new-instance v0, Lfb/j1;

    invoke-direct {v0}, Lfb/j1;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;

    invoke-virtual {v3}, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;->zza()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Lfb/j1;->d(Ljava/lang/Object;)Lfb/j1;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lfb/j1;->e()Lfb/n1;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/List;)Lfb/n1;
    .locals 6

    sget-object v0, Lfb/n1;->b:Lfb/r1;

    new-instance v0, Lfb/j1;

    invoke-direct {v0}, Lfb/j1;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutInfo;

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->isImmutable()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "PLAY_GAMES_SERVICES_"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v3

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->isPinned()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v1}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v5, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;

    invoke-direct {v5, v2, v3, v4, v1}, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzi;-><init>(Ljava/lang/String;Landroid/os/PersistableBundle;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    invoke-virtual {v0, v5}, Lfb/j1;->d(Ljava/lang/Object;)Lfb/j1;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lfb/j1;->e()Lfb/n1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 3

    invoke-static {}, Lfb/v0;->a()Lfb/t0;

    new-instance v0, Lka/c;

    invoke-direct {v0, p0}, Lka/c;-><init>(Lka/d;)V

    new-instance v1, Ljava/lang/Thread;

    const-string v2, "initialize-shortcuts"

    invoke-direct {v1, v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final synthetic c()V
    .locals 7

    iget-object v0, p0, Lka/d;->a:Landroid/content/Context;

    const-class v1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutManager;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-class v2, Lcom/google/android/gms/games/internal/v2/appshortcuts/PlayGamesAppShortcutsActivity;

    invoke-static {v0, v2}, Lka/p;->a(Landroid/content/Context;Ljava/lang/Class;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lka/d;->g(Ljava/util/List;)Lfb/n1;

    move-result-object v3

    invoke-virtual {v1}, Landroid/content/pm/ShortcutManager;->getPinnedShortcuts()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lka/d;->g(Ljava/util/List;)Lfb/n1;

    move-result-object v4

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;->zza()I

    move-result v5

    if-gtz v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v5, Lka/n;

    invoke-direct {v5, v0}, Lka/n;-><init>(Landroid/content/Context;)V

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    const/16 v6, 0x1a58

    invoke-virtual {v0, v6}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object v0

    sget-object v6, Lda/j;->g:Lcom/google/android/gms/common/Feature;

    filled-new-array {v6}, [Lcom/google/android/gms/common/Feature;

    move-result-object v6

    invoke-virtual {v0, v6}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object v0

    new-instance v6, Lka/m;

    invoke-direct {v6, v5, v2, v3, v4}, Lka/m;-><init>(Lka/n;Lcom/google/android/gms/games/internal/v2/appshortcuts/zzr;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object v0

    invoke-virtual {v5, v0}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {}, Lfb/t1;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v5, Lka/b;

    invoke-direct {v5, v3, v4}, Lka/b;-><init>(Lfb/n1;Lfb/n1;)V

    invoke-virtual {v0, v2, v5}, Lcom/google/android/gms/tasks/Task;->h(Ljava/util/concurrent/Executor;Lsb/c;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v3, v4}, Lka/d;->e(Lfb/n1;Lfb/n1;)Lcom/google/android/gms/games/internal/v2/appshortcuts/zzg;

    move-result-object v0

    invoke-static {v0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :goto_1
    invoke-static {}, Lfb/t1;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lka/a;

    invoke-direct {v3, v1}, Lka/a;-><init>(Landroid/content/pm/ShortcutManager;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/tasks/Task;->f(Ljava/util/concurrent/Executor;Lsb/g;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
