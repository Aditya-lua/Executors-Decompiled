.class public final synthetic Lde/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/r;


# instance fields
.field public final synthetic a:Ljava/lang/Integer;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Long;

.field public final synthetic e:Ljava/lang/Long;

.field public final synthetic f:Ljava/util/List;

.field public final synthetic g:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;IILjava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/i;->a:Ljava/lang/Integer;

    iput p2, p0, Lde/i;->b:I

    iput p3, p0, Lde/i;->c:I

    iput-object p4, p0, Lde/i;->d:Ljava/lang/Long;

    iput-object p5, p0, Lde/i;->e:Ljava/lang/Long;

    iput-object p6, p0, Lde/i;->f:Ljava/util/List;

    iput-object p7, p0, Lde/i;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lae/e;)Lae/e;
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lde/i;->a:Ljava/lang/Integer;

    iget v3, v0, Lde/i;->b:I

    iget v4, v0, Lde/i;->c:I

    iget-object v2, v0, Lde/i;->d:Ljava/lang/Long;

    iget-object v5, v0, Lde/i;->e:Ljava/lang/Long;

    iget-object v6, v0, Lde/i;->f:Ljava/util/List;

    iget-object v7, v0, Lde/i;->g:Ljava/util/List;

    sget v8, Lde/a;->q:I

    if-nez p1, :cond_0

    new-instance v16, Ljava/util/ArrayList;

    invoke-direct/range {v16 .. v16}, Ljava/util/ArrayList;-><init>()V

    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    invoke-static/range {v9 .. v17}, Lae/e;->b(IIIJJLjava/util/List;Ljava/util/List;)Lae/e;

    move-result-object v8

    goto :goto_0

    :cond_0
    move-object/from16 v8, p1

    :goto_0
    if-nez v1, :cond_1

    invoke-virtual {v8}, Lae/e;->h()I

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_1
    if-nez v2, :cond_2

    invoke-virtual {v8}, Lae/e;->a()J

    move-result-wide v9

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    :goto_2
    if-nez v5, :cond_3

    invoke-virtual {v8}, Lae/e;->j()J

    move-result-wide v11

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    :goto_3
    if-nez v6, :cond_4

    invoke-virtual {v8}, Lae/e;->f()Ljava/util/List;

    move-result-object v6

    :cond_4
    if-nez v7, :cond_5

    invoke-virtual {v8}, Lae/e;->e()Ljava/util/List;

    move-result-object v7

    :cond_5
    move-wide/from16 v18, v9

    move-object v9, v6

    move-wide/from16 v5, v18

    move v2, v1

    move-object v10, v7

    move-wide v7, v11

    invoke-static/range {v2 .. v10}, Lae/e;->b(IIIJJLjava/util/List;Ljava/util/List;)Lae/e;

    move-result-object v1

    return-object v1
.end method
