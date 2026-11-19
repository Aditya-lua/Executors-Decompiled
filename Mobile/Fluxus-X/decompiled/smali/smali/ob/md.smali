.class public final Lob/md;
.super Lob/z;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lob/od;


# direct methods
.method public constructor <init>(Lob/od;Lob/q8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/md;->e:Lob/od;

    invoke-direct {p0, p2}, Lob/z;-><init>(Lob/q8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lob/md;->e:Lob/od;

    iget-object v1, v0, Lob/od;->d:Lob/qd;

    invoke-virtual {v1}, Lob/o8;->h()V

    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->e()Lv9/e;

    move-result-object v3

    invoke-interface {v3}, Lv9/e;->b()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v5, v3, v4}, Lob/od;->d(ZZJ)Z

    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->M()Lob/d2;

    move-result-object v0

    invoke-virtual {v2}, Lob/l7;->e()Lv9/e;

    move-result-object v1

    invoke-interface {v1}, Lv9/e;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lob/d2;->k(J)V

    return-void
.end method
