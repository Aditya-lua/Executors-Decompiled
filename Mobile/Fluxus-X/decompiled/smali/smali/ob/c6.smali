.class public final Lob/c6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:J

.field public final d:Landroid/os/Bundle;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/c6;->a:Ljava/lang/String;

    iput-object p2, p0, Lob/c6;->b:Ljava/lang/String;

    iput-object p3, p0, Lob/c6;->d:Landroid/os/Bundle;

    iput-wide p4, p0, Lob/c6;->c:J

    return-void
.end method

.method public static a(Lob/i0;)Lob/c6;
    .locals 6

    new-instance v0, Lob/c6;

    iget-object v1, p0, Lob/i0;->f:Ljava/lang/String;

    iget-object v2, p0, Lob/i0;->h:Ljava/lang/String;

    iget-object v3, p0, Lob/i0;->g:Lob/g0;

    invoke-virtual {v3}, Lob/g0;->D3()Landroid/os/Bundle;

    move-result-object v3

    iget-wide v4, p0, Lob/i0;->i:J

    invoke-direct/range {v0 .. v5}, Lob/c6;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-object v0
.end method


# virtual methods
.method public final b()Lob/i0;
    .locals 6

    new-instance v0, Lob/i0;

    new-instance v2, Lob/g0;

    new-instance v1, Landroid/os/Bundle;

    iget-object v3, p0, Lob/c6;->d:Landroid/os/Bundle;

    invoke-direct {v1, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-direct {v2, v1}, Lob/g0;-><init>(Landroid/os/Bundle;)V

    iget-object v3, p0, Lob/c6;->b:Ljava/lang/String;

    iget-object v1, p0, Lob/c6;->a:Ljava/lang/String;

    iget-wide v4, p0, Lob/c6;->c:J

    invoke-direct/range {v0 .. v5}, Lob/i0;-><init>(Ljava/lang/String;Lob/g0;Ljava/lang/String;J)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lob/c6;->b:Ljava/lang/String;

    iget-object v1, p0, Lob/c6;->d:Landroid/os/Bundle;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v3, p0, Lob/c6;->a:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v2, v2, 0xd

    add-int/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x8

    add-int/2addr v2, v5

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "origin="

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",name="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",params="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
