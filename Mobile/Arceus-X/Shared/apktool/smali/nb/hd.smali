.class public final Lnb/hd;
.super Lnb/w;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lnb/jd;


# direct methods
.method public constructor <init>(Lnb/jd;Lnb/l8;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/hd;->e:Lnb/jd;

    invoke-direct {p0, p2}, Lnb/w;-><init>(Lnb/l8;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lnb/hd;->e:Lnb/jd;

    iget-object v1, v0, Lnb/jd;->d:Lnb/ld;

    invoke-virtual {v1}, Lnb/j8;->h()V

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->e()Lu9/e;

    move-result-object v3

    invoke-interface {v3}, Lu9/e;->b()J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v5, v3, v4}, Lnb/jd;->d(ZZJ)Z

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->M()Lnb/y1;

    move-result-object v0

    invoke-virtual {v2}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lnb/y1;->k(J)V

    return-void
.end method
