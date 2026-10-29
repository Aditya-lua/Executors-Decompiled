.class public Lw7/b$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw7/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "m"
.end annotation


# instance fields
.field public a:Z

.field public b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lw7/b$m;->a:Z

    iput-object p2, p0, Lw7/b$m;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lw7/b$q;Lw7/g$l0;)Z
    .locals 4

    iget-boolean p1, p0, Lw7/b$m;->a:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw7/b$m;->b:Ljava/lang/String;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lw7/g$n0;->n()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lw7/b$m;->b:Ljava/lang/String;

    :goto_0
    iget-object p2, p2, Lw7/g$n0;->b:Lw7/g$j0;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lw7/g$j0;->getChildren()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v2, v0

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw7/g$n0;

    check-cast v3, Lw7/g$l0;

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Lw7/g$n0;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move v2, v1

    :cond_4
    if-ne v2, v1, :cond_5

    return v1

    :cond_5
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-boolean v0, p0, Lw7/b$m;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw7/b$m;->b:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "only-of-type <%s>"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "only-child"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
