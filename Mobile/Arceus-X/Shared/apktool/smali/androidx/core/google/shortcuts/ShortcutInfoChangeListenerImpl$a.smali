.class public Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/google/shortcuts/ShortcutInfoChangeListenerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public static a(Ljava/lang/String;Landroid/os/PersistableBundle;)Lo2/a;
    .locals 10
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lo2/a;

    invoke-direct {v0}, Lo2/a;-><init>()V

    invoke-virtual {v0, p0}, Lw8/a;->g(Ljava/lang/String;)Lw8/a;

    move-result-object v0

    check-cast v0, Lo2/a;

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1, p0}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_4

    aget-object v6, v1, v5

    new-instance v7, Lo2/b;

    invoke-direct {v7}, Lo2/b;-><init>()V

    invoke-virtual {v7, v6}, Lw8/a;->g(Ljava/lang/String;)Lw8/a;

    move-result-object v7

    check-cast v7, Lo2/b;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    array-length v8, v6

    if-nez v8, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v7, v6}, Lo2/b;->l([Ljava/lang/String;)Lo2/b;

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_5

    new-array p0, v4, [Lo2/b;

    invoke-interface {v2, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lo2/b;

    invoke-virtual {v0, p0}, Lo2/a;->l([Lo2/b;)Lo2/a;

    :cond_5
    :goto_2
    return-object v0
.end method
