.class public final synthetic Lla/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/g;


# instance fields
.field public final synthetic a:Landroid/content/pm/ShortcutManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/pm/ShortcutManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/a;->a:Landroid/content/pm/ShortcutManager;

    return-void
.end method


# virtual methods
.method public final synthetic onSuccess(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lla/f;

    invoke-virtual {p1}, Lla/f;->zza()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lla/a;->a:Landroid/content/pm/ShortcutManager;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    :cond_0
    invoke-virtual {p1}, Lla/f;->zzb()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v1, v0}, Landroid/content/pm/ShortcutManager;->addDynamicShortcuts(Ljava/util/List;)Z

    :cond_1
    invoke-virtual {p1}, Lla/f;->A3()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1, v0}, Landroid/content/pm/ShortcutManager;->disableShortcuts(Ljava/util/List;)V

    :cond_2
    invoke-virtual {p1}, Lla/f;->zzd()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1, p1}, Landroid/content/pm/ShortcutManager;->enableShortcuts(Ljava/util/List;)V

    :cond_3
    return-void
.end method
