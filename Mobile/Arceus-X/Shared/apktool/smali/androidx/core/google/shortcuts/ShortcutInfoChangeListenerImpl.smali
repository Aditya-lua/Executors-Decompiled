.class public Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;
.super Lm2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lv8/b;

.field public final c:Lv8/h;

.field public final d:Lpe/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lv8/b;Lv8/h;Lpe/p;)V
    .locals 0

    invoke-direct {p0}, Lm2/b;-><init>()V

    iput-object p1, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->b:Lv8/b;

    iput-object p3, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->c:Lv8/h;

    iput-object p4, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->d:Lpe/p;

    return-void
.end method

.method public static getInstance(Landroid/content/Context;)Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;

    invoke-static {p0}, Lv8/b;->a(Landroid/content/Context;)Lv8/b;

    move-result-object v1

    invoke-static {p0}, Lv8/h;->b(Landroid/content/Context;)Lv8/h;

    move-result-object v2

    invoke-static {p0}, Lp2/a;->c(Landroid/content/Context;)Lpe/p;

    move-result-object v3

    invoke-direct {v0, p0, v1, v2, v3}, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;-><init>(Landroid/content/Context;Lv8/b;Lv8/h;Lpe/p;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->b:Lv8/b;

    invoke-virtual {v0}, Lv8/b;->b()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm2/c;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm2/c;

    invoke-virtual {p0, v1}, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->e(Lm2/c;)Lo2/c;

    move-result-object v1

    invoke-virtual {v1}, Lw8/a;->a()Lv8/g;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->b:Lv8/b;

    const/4 v1, 0x0

    new-array v1, v1, [Lv8/g;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv8/g;

    invoke-virtual {p1, v0}, Lv8/b;->c([Lv8/g;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->c:Lv8/h;

    iget-object v2, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->a:Landroid/content/Context;

    invoke-static {v2, v0}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->d(Ljava/lang/String;)Lv8/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lv8/h;->a(Lv8/a;)Lcom/google/android/gms/tasks/Task;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/String;)Lv8/a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lv8/a$a;

    const-string v1, "ViewAction"

    invoke-direct {v0, v1}, Lv8/a$a;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, v1, p1}, Lv8/a$a;->b(Ljava/lang/String;Ljava/lang/String;)Lv8/a$a;

    move-result-object p1

    invoke-virtual {p1}, Lv8/a$a;->a()Lv8/a;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lm2/c;)Lo2/c;
    .locals 5
    .param p1    # Lm2/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lm2/c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lp2/a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lm2/c;->g()Landroid/content/Intent;

    move-result-object v2

    iget-object v3, p0, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;->d:Lpe/p;

    invoke-static {v1, v2, v3}, Lp2/a;->a(Landroid/content/Context;Landroid/content/Intent;Lpe/p;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lm2/c;->m()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lo2/c;

    invoke-direct {v3}, Lo2/c;-><init>()V

    invoke-virtual {p1}, Lm2/c;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lw8/a;->e(Ljava/lang/String;)Lw8/a;

    move-result-object v3

    check-cast v3, Lo2/c;

    invoke-virtual {v3, v0}, Lw8/a;->h(Ljava/lang/String;)Lw8/a;

    move-result-object v0

    check-cast v0, Lo2/c;

    invoke-virtual {v0, v2}, Lo2/c;->n(Ljava/lang/String;)Lo2/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo2/c;->o(Ljava/lang/String;)Lo2/c;

    move-result-object v0

    invoke-virtual {p1}, Lm2/c;->j()Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lm2/c;->j()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo2/c;->m(Ljava/lang/String;)Lo2/c;

    :cond_0
    invoke-virtual {p1}, Lm2/c;->c()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lm2/c;->c()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lp2/a;->d(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lm2/c;->d()Landroid/os/PersistableBundle;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl$a;->a(Ljava/lang/String;Landroid/os/PersistableBundle;)Lo2/a;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const/4 v2, 0x0

    new-array v2, v2, [Lo2/a;

    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lo2/a;

    invoke-virtual {v0, v1}, Lo2/c;->l([Lo2/a;)Lo2/c;

    :cond_3
    invoke-virtual {p1}, Lm2/c;->e()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lm2/c;->e()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->i()I

    move-result v1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_4

    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->i()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    :cond_4
    invoke-virtual {p1}, Landroidx/core/graphics/drawable/IconCompat;->j()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw8/a;->f(Ljava/lang/String;)Lw8/a;

    :cond_5
    return-object v0
.end method
