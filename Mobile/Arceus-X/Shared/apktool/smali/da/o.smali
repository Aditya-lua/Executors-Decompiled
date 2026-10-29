.class public final Lda/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:Z

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/ArrayList;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/String;

.field public final l:I

.field public final m:I

.field public final n:Ljava/lang/String;

.field public final o:Lga/q;

.field public final p:Z


# direct methods
.method public synthetic constructor <init>(ZZIZILjava/lang/String;Ljava/util/ArrayList;ZZZLjava/lang/String;IILjava/lang/String;Lga/q;Z[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lda/o;->a:Z

    const/4 p2, 0x1

    iput-boolean p2, p0, Lda/o;->b:Z

    const/16 p2, 0x11

    iput p2, p0, Lda/o;->c:I

    iput-boolean p1, p0, Lda/o;->d:Z

    iput p5, p0, Lda/o;->e:I

    const/4 p2, 0x0

    iput-object p2, p0, Lda/o;->f:Ljava/lang/String;

    iput-object p7, p0, Lda/o;->g:Ljava/util/ArrayList;

    iput-boolean p1, p0, Lda/o;->h:Z

    iput-boolean p1, p0, Lda/o;->i:Z

    iput-boolean p1, p0, Lda/o;->j:Z

    iput-object p2, p0, Lda/o;->k:Ljava/lang/String;

    iput p1, p0, Lda/o;->l:I

    const/16 p2, 0x9

    iput p2, p0, Lda/o;->m:I

    iput-object p14, p0, Lda/o;->n:Ljava/lang/String;

    iput-object p15, p0, Lda/o;->o:Lga/q;

    iput-boolean p1, p0, Lda/o;->p:Z

    return-void
.end method

.method public static a()Lda/n;
    .locals 2

    new-instance v0, Lda/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lda/n;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lda/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, Lda/o;

    iget v1, p0, Lda/o;->e:I

    iget v3, p1, Lda/o;->e:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lda/o;->g:Ljava/util/ArrayList;

    iget-object v3, p1, Lda/o;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-static {v1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lda/o;->n:Ljava/lang/String;

    iget-object p1, p1, Lda/o;->n:Ljava/lang/String;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget v0, p0, Lda/o;->e:I

    const v1, 0x1d0316bf

    add-int/2addr v0, v1

    iget-object v1, p0, Lda/o;->g:Ljava/util/ArrayList;

    mul-int/lit16 v0, v0, 0x3c1

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lda/o;->n:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    const v2, 0x34e63b41

    mul-int/2addr v0, v2

    add-int/lit8 v0, v0, 0x9

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    return v0
.end method
