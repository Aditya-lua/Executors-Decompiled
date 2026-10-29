.class public final Lae/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lae/e;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Lae/a1;


# direct methods
.method public constructor <init>(Lae/a1;Lae/e;II)V
    .locals 0

    iput-object p1, p0, Lae/z0;->d:Lae/a1;

    iput-object p2, p0, Lae/z0;->a:Lae/e;

    iput p3, p0, Lae/z0;->b:I

    iput p4, p0, Lae/z0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget-object v0, p0, Lae/z0;->d:Lae/a1;

    iget-object v1, p0, Lae/z0;->a:Lae/e;

    iget v4, p0, Lae/z0;->b:I

    iget v5, p0, Lae/z0;->c:I

    new-instance v2, Lae/g;

    invoke-virtual {v1}, Lae/e;->h()I

    move-result v3

    invoke-virtual {v1}, Lae/e;->a()J

    move-result-wide v6

    invoke-virtual {v1}, Lae/e;->j()J

    move-result-wide v8

    invoke-virtual {v1}, Lae/e;->l()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lae/e;->k()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v1}, Lae/e;->g()Landroid/app/PendingIntent;

    move-result-object v12

    invoke-virtual {v1}, Lae/e;->m()Ljava/util/List;

    move-result-object v13

    invoke-direct/range {v2 .. v13}, Lae/g;-><init>(IIIJJLjava/util/List;Ljava/util/List;Landroid/app/PendingIntent;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lae/a1;->j(Lae/e;)V

    return-void
.end method
