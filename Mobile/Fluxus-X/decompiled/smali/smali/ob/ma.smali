.class public final synthetic Lob/ma;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lob/va;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ma;->a:Lob/va;

    iput-object p2, p0, Lob/ma;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 8

    iget-object v0, p0, Lob/ma;->a:Lob/va;

    invoke-virtual {v0}, Lob/o8;->h()V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lob/ma;->b:Ljava/util/List;

    iget-object v2, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->x()Lob/p6;

    move-result-object v2

    invoke-virtual {v2}, Lob/p6;->r()Landroid/util/SparseArray;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lob/vd;

    iget v4, v3, Lob/vd;->h:I

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->contains(I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v2, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-wide v6, v3, Lob/vd;->g:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_1

    :cond_2
    invoke-virtual {v0}, Lob/va;->w0()Ljava/util/PriorityQueue;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lob/va;->x0()V

    return-void
.end method
