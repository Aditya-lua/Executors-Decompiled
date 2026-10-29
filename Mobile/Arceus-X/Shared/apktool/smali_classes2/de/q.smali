.class public final Lde/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/i0;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Lde/a;


# direct methods
.method public constructor <init>(Lde/a;Ljava/util/List;Ljava/util/List;JZLjava/util/List;)V
    .locals 0

    iput-object p1, p0, Lde/q;->f:Lde/a;

    iput-object p2, p0, Lde/q;->a:Ljava/util/List;

    iput-object p3, p0, Lde/q;->b:Ljava/util/List;

    iput-wide p4, p0, Lde/q;->c:J

    iput-boolean p6, p0, Lde/q;->d:Z

    iput-object p7, p0, Lde/q;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lde/q;->f:Lde/a;

    const/4 v1, 0x6

    invoke-static {v0, v1, p1}, Lde/a;->n(Lde/a;II)Z

    return-void
.end method

.method public final zza()V
    .locals 5

    iget-object v0, p0, Lde/q;->f:Lde/a;

    iget-object v1, p0, Lde/q;->a:Ljava/util/List;

    iget-object v2, p0, Lde/q;->b:Ljava/util/List;

    iget-wide v3, p0, Lde/q;->c:J

    invoke-static {v0, v1, v2, v3, v4}, Lde/a;->i(Lde/a;Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method public final zzc()V
    .locals 8

    iget-boolean v0, p0, Lde/q;->d:Z

    if-nez v0, :cond_0

    iget-object v1, p0, Lde/q;->f:Lde/a;

    iget-object v2, p0, Lde/q;->e:Ljava/util/List;

    iget-object v3, p0, Lde/q;->a:Ljava/util/List;

    iget-object v4, p0, Lde/q;->b:Ljava/util/List;

    iget-wide v5, p0, Lde/q;->c:J

    const/4 v7, 0x1

    invoke-static/range {v1 .. v7}, Lde/a;->h(Lde/a;Ljava/util/List;Ljava/util/List;Ljava/util/List;JZ)V

    :cond_0
    return-void
.end method
