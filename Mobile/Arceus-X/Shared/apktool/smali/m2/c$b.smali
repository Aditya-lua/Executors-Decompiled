.class public Lm2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lm2/c;

.field public b:Z

.field public c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public e:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/pm/ShortcutInfo;)V
    .locals 3

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Lm2/c;

    invoke-direct {v0}, Lm2/c;-><init>()V

    iput-object v0, p0, Lm2/c$b;->a:Lm2/c;

    .line 7
    iput-object p1, v0, Lm2/c;->a:Landroid/content/Context;

    .line 8
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->b:Ljava/lang/String;

    .line 9
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getPackage()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->c:Ljava/lang/String;

    .line 10
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getIntents()[Landroid/content/Intent;

    move-result-object p1

    .line 11
    array-length v1, p1

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    iput-object p1, v0, Lm2/c;->d:[Landroid/content/Intent;

    .line 12
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getActivity()Landroid/content/ComponentName;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->e:Landroid/content/ComponentName;

    .line 13
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getShortLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->f:Ljava/lang/CharSequence;

    .line 14
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLongLabel()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->g:Ljava/lang/CharSequence;

    .line 15
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getDisabledMessage()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->h:Ljava/lang/CharSequence;

    .line 16
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_0

    .line 17
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getDisabledReason()I

    move-result v1

    iput v1, v0, Lm2/c;->y:I

    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    .line 19
    :goto_0
    iput v1, v0, Lm2/c;->y:I

    .line 20
    :goto_1
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getCategories()Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lm2/c;->k:Ljava/util/Set;

    .line 21
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v1

    invoke-static {v1}, Lm2/c;->k(Landroid/os/PersistableBundle;)[Lk2/r;

    move-result-object v1

    iput-object v1, v0, Lm2/c;->j:[Lk2/r;

    .line 22
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getUserHandle()Landroid/os/UserHandle;

    move-result-object v1

    iput-object v1, v0, Lm2/c;->q:Landroid/os/UserHandle;

    .line 23
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getLastChangedTimestamp()J

    move-result-wide v1

    iput-wide v1, v0, Lm2/c;->p:J

    const/16 v1, 0x1e

    if-lt p1, v1, :cond_2

    .line 24
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isCached()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->r:Z

    .line 25
    :cond_2
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDynamic()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->s:Z

    .line 26
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isPinned()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->t:Z

    .line 27
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isDeclaredInManifest()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->u:Z

    .line 28
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isImmutable()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->v:Z

    .line 29
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->isEnabled()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->w:Z

    .line 30
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->hasKeyFieldsOnly()Z

    move-result p1

    iput-boolean p1, v0, Lm2/c;->x:Z

    .line 31
    invoke-static {p2}, Lm2/c;->h(Landroid/content/pm/ShortcutInfo;)Ll2/d;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->l:Ll2/d;

    .line 32
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getRank()I

    move-result p1

    iput p1, v0, Lm2/c;->n:I

    .line 33
    invoke-virtual {p2}, Landroid/content/pm/ShortcutInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p1

    iput-object p1, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lm2/c;

    invoke-direct {v0}, Lm2/c;-><init>()V

    iput-object v0, p0, Lm2/c$b;->a:Lm2/c;

    .line 3
    iput-object p1, v0, Lm2/c;->a:Landroid/content/Context;

    .line 4
    iput-object p2, v0, Lm2/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lm2/c;
    .locals 10

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v0, v0, Lm2/c;->f:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v1, v0, Lm2/c;->d:[Landroid/content/Intent;

    if-eqz v1, :cond_a

    array-length v1, v1

    if-eqz v1, :cond_a

    iget-boolean v1, p0, Lm2/c$b;->b:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lm2/c;->l:Ll2/d;

    if-nez v1, :cond_0

    new-instance v1, Ll2/d;

    iget-object v2, v0, Lm2/c;->b:Ljava/lang/String;

    invoke-direct {v1, v2}, Ll2/d;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, Lm2/c;->l:Ll2/d;

    :cond_0
    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lm2/c;->m:Z

    :cond_1
    iget-object v0, p0, Lm2/c$b;->c:Ljava/util/Set;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v1, v0, Lm2/c;->k:Ljava/util/Set;

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, v0, Lm2/c;->k:Ljava/util/Set;

    :cond_2
    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v0, v0, Lm2/c;->k:Ljava/util/Set;

    iget-object v1, p0, Lm2/c$b;->c:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    iget-object v0, p0, Lm2/c$b;->d:Ljava/util/Map;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v1, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    if-nez v1, :cond_4

    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v1, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    :cond_4
    iget-object v0, p0, Lm2/c$b;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lm2/c$b;->d:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    iget-object v4, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v4, v4, Lm2/c;->o:Landroid/os/PersistableBundle;

    const/4 v5, 0x0

    new-array v6, v5, [Ljava/lang/String;

    invoke-interface {v3, v6}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v4, v1, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    iget-object v7, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v7, v7, Lm2/c;->o:Landroid/os/PersistableBundle;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v6, :cond_6

    new-array v6, v5, [Ljava/lang/String;

    goto :goto_1

    :cond_6
    new-array v8, v5, [Ljava/lang/String;

    invoke-interface {v6, v8}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/String;

    :goto_1
    invoke-virtual {v7, v4, v6}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lm2/c$b;->e:Landroid/net/Uri;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v1, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    if-nez v1, :cond_8

    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    iput-object v1, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    :cond_8
    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iget-object v0, v0, Lm2/c;->o:Landroid/os/PersistableBundle;

    iget-object v1, p0, Lm2/c$b;->e:Landroid/net/Uri;

    invoke-static {v1}, Lt2/b;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "extraSliceUri"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have an intent"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Shortcut must have a non-empty label"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Landroid/content/ComponentName;)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput-object p1, v0, Lm2/c;->e:Landroid/content/ComponentName;

    return-object p0
.end method

.method public c(Landroidx/core/graphics/drawable/IconCompat;)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput-object p1, v0, Lm2/c;->i:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public d(Landroid/content/Intent;)Lm2/c$b;
    .locals 0

    filled-new-array {p1}, [Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm2/c$b;->e([Landroid/content/Intent;)Lm2/c$b;

    move-result-object p1

    return-object p1
.end method

.method public e([Landroid/content/Intent;)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput-object p1, v0, Lm2/c;->d:[Landroid/content/Intent;

    return-object p0
.end method

.method public f(Z)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput-boolean p1, v0, Lm2/c;->m:Z

    return-object p0
.end method

.method public g(I)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput p1, v0, Lm2/c;->n:I

    return-object p0
.end method

.method public h(Ljava/lang/CharSequence;)Lm2/c$b;
    .locals 1

    iget-object v0, p0, Lm2/c$b;->a:Lm2/c;

    iput-object p1, v0, Lm2/c;->f:Ljava/lang/CharSequence;

    return-object p0
.end method
