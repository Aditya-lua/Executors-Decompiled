.class public final Lrg/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrg/f$c$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lrg/f$c$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lqg/c;

.field public final synthetic c:Lrg/f;


# direct methods
.method public constructor <init>(Lrg/f;Lqg/c;Lrg/f$b;)V
    .locals 12

    iput-object p1, p0, Lrg/f$c;->c:Lrg/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrg/f$c;->a:Ljava/util/List;

    const/4 v6, 0x0

    move-object v7, p3

    move v0, v6

    move v2, v0

    :goto_0
    const/4 v8, 0x1

    if-eqz v7, :cond_7

    invoke-static {v7}, Lrg/f$b;->a(Lrg/f$b;)I

    move-result v3

    add-int v5, v0, v3

    invoke-static {v7}, Lrg/f$b;->e(Lrg/f$b;)Lrg/f$b;

    move-result-object v9

    invoke-static {v7}, Lrg/f$b;->c(Lrg/f$b;)Lqg/b;

    move-result-object v0

    sget-object v3, Lqg/b;->g:Lqg/b;

    if-ne v0, v3, :cond_0

    if-nez v9, :cond_0

    invoke-static {v7}, Lrg/f$b;->b(Lrg/f$b;)I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    if-eqz v9, :cond_2

    invoke-static {v7}, Lrg/f$b;->b(Lrg/f$b;)I

    move-result v0

    invoke-static {v9}, Lrg/f$b;->b(Lrg/f$b;)I

    move-result v3

    if-eq v0, v3, :cond_2

    :cond_1
    move v10, v8

    goto :goto_1

    :cond_2
    move v10, v6

    :goto_1
    if-eqz v10, :cond_3

    goto :goto_2

    :cond_3
    move v8, v2

    :goto_2
    if-eqz v9, :cond_5

    invoke-static {v9}, Lrg/f$b;->c(Lrg/f$b;)Lqg/b;

    move-result-object v0

    invoke-static {v7}, Lrg/f$b;->c(Lrg/f$b;)Lqg/b;

    move-result-object v2

    if-ne v0, v2, :cond_5

    if-eqz v10, :cond_4

    goto :goto_3

    :cond_4
    move v11, v5

    goto :goto_4

    :cond_5
    :goto_3
    iget-object v11, p0, Lrg/f$c;->a:Ljava/util/List;

    new-instance v0, Lrg/f$c$a;

    invoke-static {v7}, Lrg/f$b;->c(Lrg/f$b;)Lqg/b;

    move-result-object v2

    invoke-static {v7}, Lrg/f$b;->f(Lrg/f$b;)I

    move-result v3

    invoke-static {v7}, Lrg/f$b;->b(Lrg/f$b;)I

    move-result v4

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lrg/f$c$a;-><init>(Lrg/f$c;Lqg/b;III)V

    invoke-interface {v11, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    move v11, v6

    :goto_4
    if-eqz v10, :cond_6

    iget-object v10, p0, Lrg/f$c;->a:Ljava/util/List;

    new-instance v0, Lrg/f$c$a;

    sget-object v2, Lqg/b;->h:Lqg/b;

    invoke-static {v7}, Lrg/f$b;->f(Lrg/f$b;)I

    move-result v3

    invoke-static {v7}, Lrg/f$b;->b(Lrg/f$b;)I

    move-result v4

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lrg/f$c$a;-><init>(Lrg/f$c;Lqg/b;III)V

    invoke-interface {v10, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_6
    move v2, v8

    move-object v7, v9

    move v0, v11

    goto :goto_0

    :cond_7
    invoke-static {p1}, Lrg/f;->d(Lrg/f;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrg/f$c$a;

    if-eqz v0, :cond_8

    invoke-static {v0}, Lrg/f$c$a;->a(Lrg/f$c$a;)Lqg/b;

    move-result-object v0

    move v3, v2

    sget-object v2, Lqg/b;->h:Lqg/b;

    if-eq v0, v2, :cond_8

    if-eqz v3, :cond_8

    iget-object v7, p0, Lrg/f$c;->a:Ljava/util/List;

    new-instance v0, Lrg/f$c$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lrg/f$c$a;-><init>(Lrg/f$c;Lqg/b;III)V

    invoke-interface {v7, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_8
    iget-object v0, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrg/f$c$a;

    iget-object v7, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-static {v0}, Lrg/f$c$a;->a(Lrg/f$c$a;)Lqg/b;

    move-result-object v0

    sget-object v2, Lqg/b;->h:Lqg/b;

    if-eq v0, v2, :cond_9

    goto :goto_5

    :cond_9
    move v6, v8

    :goto_5
    new-instance v0, Lrg/f$c$a;

    sget-object v2, Lqg/b;->j:Lqg/b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lrg/f$c$a;-><init>(Lrg/f$c;Lqg/b;III)V

    invoke-interface {v7, v6, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_a
    invoke-virtual {p2}, Lqg/c;->f()I

    move-result v0

    sget-object v2, Lrg/f$a;->a:[I

    invoke-static {p2}, Lrg/f;->m(Lqg/c;)Lrg/f$d;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v8, :cond_c

    const/4 v3, 0x2

    if-eq v2, v3, :cond_b

    const/16 v8, 0x1b

    const/16 v2, 0x28

    goto :goto_6

    :cond_b
    const/16 v8, 0xa

    const/16 v2, 0x1a

    goto :goto_6

    :cond_c
    const/16 v2, 0x9

    :goto_6
    invoke-virtual {p0, p2}, Lrg/f$c;->d(Lqg/c;)I

    move-result v3

    :goto_7
    if-ge v0, v2, :cond_d

    invoke-static {v0}, Lqg/c;->e(I)Lqg/c;

    move-result-object v4

    invoke-static {p1}, Lrg/f;->a(Lrg/f;)Lqg/a;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lrg/c;->v(ILqg/c;Lqg/a;)Z

    move-result v4

    if-nez v4, :cond_d

    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_d
    :goto_8
    if-le v0, v8, :cond_e

    add-int/lit8 v2, v0, -0x1

    invoke-static {v2}, Lqg/c;->e(I)Lqg/c;

    move-result-object v2

    invoke-static {p1}, Lrg/f;->a(Lrg/f;)Lqg/a;

    move-result-object v4

    invoke-static {v3, v2, v4}, Lrg/c;->v(ILqg/c;Lqg/a;)Z

    move-result v2

    if-eqz v2, :cond_e

    add-int/lit8 v0, v0, -0x1

    goto :goto_8

    :cond_e
    invoke-static {v0}, Lqg/c;->e(I)Lqg/c;

    move-result-object v0

    iput-object v0, p0, Lrg/f$c;->b:Lqg/c;

    return-void
.end method

.method public static synthetic a(Lrg/f$c;)Lqg/c;
    .locals 0

    iget-object p0, p0, Lrg/f$c;->b:Lqg/c;

    return-object p0
.end method


# virtual methods
.method public b(Lng/a;)V
    .locals 2

    iget-object v0, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrg/f$c$a;

    invoke-static {v1, p1}, Lrg/f$c$a;->c(Lrg/f$c$a;Lng/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lrg/f$c;->b:Lqg/c;

    invoke-virtual {p0, v0}, Lrg/f$c;->d(Lqg/c;)I

    move-result v0

    return v0
.end method

.method public final d(Lqg/c;)I
    .locals 3

    iget-object v0, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrg/f$c$a;

    invoke-static {v2, p1}, Lrg/f$c$a;->b(Lrg/f$c$a;Lqg/c;)I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public e()Lqg/c;
    .locals 1

    iget-object v0, p0, Lrg/f$c;->b:Lqg/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lrg/f$c;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrg/f$c$a;

    if-eqz v2, :cond_0

    const-string v2, ","

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v3}, Lrg/f$c$a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
