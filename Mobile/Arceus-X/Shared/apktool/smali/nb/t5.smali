.class public final Lnb/t5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lnb/w5;


# direct methods
.method public constructor <init>(Lnb/w5;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p2, p0, Lnb/t5;->a:I

    iput-object p3, p0, Lnb/t5;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/t5;->c:Ljava/lang/Object;

    iput-object p5, p0, Lnb/t5;->d:Ljava/lang/Object;

    iput-object p6, p0, Lnb/t5;->e:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/t5;->f:Lnb/w5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    iget-object v0, p0, Lnb/t5;->f:Lnb/w5;

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k8;->k()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Lnb/w5;->D()C

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k;->B()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lnb/g7;->c()Lnb/f;

    const/16 v2, 0x43

    invoke-virtual {v0, v2}, Lnb/w5;->E(C)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lnb/g7;->c()Lnb/f;

    const/16 v2, 0x63

    invoke-virtual {v0, v2}, Lnb/w5;->E(C)V

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lnb/w5;->F()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    iget-object v2, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k;->A()J

    const-wide/32 v2, 0x2078d

    invoke-virtual {v0, v2, v3}, Lnb/w5;->G(J)V

    :cond_2
    iget v2, p0, Lnb/t5;->a:I

    invoke-virtual {v0}, Lnb/w5;->D()C

    move-result v3

    invoke-virtual {v0}, Lnb/w5;->F()J

    move-result-wide v4

    iget-object v0, p0, Lnb/t5;->b:Ljava/lang/String;

    iget-object v6, p0, Lnb/t5;->c:Ljava/lang/Object;

    iget-object v7, p0, Lnb/t5;->d:Ljava/lang/Object;

    iget-object v8, p0, Lnb/t5;->e:Ljava/lang/Object;

    const-string v9, "01VDIWEA?"

    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/4 v9, 0x1

    invoke-static {v9, v0, v6, v7, v8}, Lnb/w5;->A(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v8

    add-int/2addr v7, v9

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v7, v8

    add-int/2addr v7, v10

    add-int/2addr v7, v9

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    add-int/2addr v7, v8

    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v7, "2"

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x400

    if-le v3, v4, :cond_3

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iget-object v0, v1, Lnb/k6;->e:Lnb/i6;

    if-eqz v0, :cond_4

    const-wide/16 v3, 0x1

    invoke-virtual {v0, v2, v3, v4}, Lnb/i6;->a(Ljava/lang/String;J)V

    :cond_4
    return-void

    :cond_5
    invoke-virtual {v0}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Persisted config not initialized. Not logging error/warn"

    const/4 v2, 0x6

    invoke-static {v2, v0, v1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    return-void
.end method
