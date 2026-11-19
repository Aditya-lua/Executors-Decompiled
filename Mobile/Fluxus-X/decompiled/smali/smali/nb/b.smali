.class public final Lnb/b;
.super Lnb/c;
.source "SourceFile"


# instance fields
.field public final a:Lob/wa;


# direct methods
.method public constructor <init>(Lob/wa;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lnb/c;-><init>([B)V

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/b;->a:Lob/wa;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1, p2, p3}, Lob/wa;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1}, Lob/wa;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1}, Lob/wa;->c(Ljava/lang/String;)V

    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0}, Lob/wa;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0}, Lob/wa;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0}, Lob/wa;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0}, Lob/wa;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1}, Lob/wa;->h(Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1}, Lob/wa;->i(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1, p2, p3}, Lob/wa;->j(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1, p2, p3}, Lob/wa;->k(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0, p1, p2}, Lob/wa;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final zzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/b;->a:Lob/wa;

    invoke-interface {v0}, Lob/wa;->zzh()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
