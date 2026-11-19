.class public final synthetic Lfe/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lce/e;

.field public final synthetic b:Lce/d;


# direct methods
.method public synthetic constructor <init>(Lce/e;Lce/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfe/o;->a:Lce/e;

    iput-object p2, p0, Lfe/o;->b:Lce/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lfe/o;->a:Lce/e;

    iget-object v1, p0, Lfe/o;->b:Lce/d;

    sget v2, Lfe/a;->q:I

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lce/e;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lce/a;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lce/a;-><init>(I)V

    throw v0

    :cond_1
    :goto_0
    const/4 v2, 0x1

    if-nez v0, :cond_2

    :goto_1
    move v3, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lce/e;->h()I

    move-result v0

    add-int/2addr v2, v0

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Lce/d;->b()Ljava/util/List;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    invoke-static/range {v3 .. v11}, Lce/e;->b(IIIJJLjava/util/List;Ljava/util/List;)Lce/e;

    move-result-object v0

    return-object v0
.end method
