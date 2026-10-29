.class public final Lum/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu/r0;


# static fields
.field public static final h:Lxu/h;

.field public static final i:Lxu/h;

.field public static final j:Lxu/h;

.field public static final k:Lxu/h;

.field public static final l:Lxu/h;

.field public static final m:Lxu/h;


# instance fields
.field public final a:Lxu/g;

.field public final b:Lxu/e;

.field public final c:Lxu/e;

.field public d:Lxu/h;

.field public e:I

.field public f:J

.field public g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "[]{}\"\'/#"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lum/r;->h:Lxu/h;

    const-string v0, "\'\\"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lum/r;->i:Lxu/h;

    const-string v0, "\"\\"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lum/r;->j:Lxu/h;

    const-string v0, "\r\n"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lum/r;->k:Lxu/h;

    const-string v0, "*"

    invoke-static {v0}, Lxu/h;->e(Ljava/lang/String;)Lxu/h;

    move-result-object v0

    sput-object v0, Lum/r;->l:Lxu/h;

    sget-object v0, Lxu/h;->e:Lxu/h;

    sput-object v0, Lum/r;->m:Lxu/h;

    return-void
.end method

.method public constructor <init>(Lxu/g;Lxu/e;Lxu/h;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lum/r;->f:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lum/r;->g:Z

    iput-object p1, p0, Lum/r;->a:Lxu/g;

    invoke-interface {p1}, Lxu/g;->k()Lxu/e;

    move-result-object p1

    iput-object p1, p0, Lum/r;->b:Lxu/e;

    iput-object p2, p0, Lum/r;->c:Lxu/e;

    iput-object p3, p0, Lum/r;->d:Lxu/h;

    iput p4, p0, Lum/r;->e:I

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 12

    :goto_0
    iget-wide v0, p0, Lum/r;->f:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_15

    iget-object v2, p0, Lum/r;->d:Lxu/h;

    sget-object v3, Lum/r;->m:Lxu/h;

    if-ne v2, v3, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lum/r;->b:Lxu/e;

    invoke-virtual {v2}, Lxu/e;->size()J

    move-result-wide v4

    cmp-long v0, v0, v4

    const-wide/16 v1, 0x1

    if-nez v0, :cond_2

    iget-wide v4, p0, Lum/r;->f:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p0, Lum/r;->a:Lxu/g;

    invoke-interface {v0, v1, v2}, Lxu/g;->w1(J)V

    :cond_2
    iget-object v0, p0, Lum/r;->b:Lxu/e;

    iget-object v4, p0, Lum/r;->d:Lxu/h;

    iget-wide v5, p0, Lum/r;->f:J

    invoke-virtual {v0, v4, v5, v6}, Lxu/e;->q(Lxu/h;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v0, v4, v6

    if-nez v0, :cond_3

    iget-object v0, p0, Lum/r;->b:Lxu/e;

    invoke-virtual {v0}, Lxu/e;->size()J

    move-result-wide v0

    iput-wide v0, p0, Lum/r;->f:J

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lum/r;->b:Lxu/e;

    invoke-virtual {v0, v4, v5}, Lxu/e;->j(J)B

    move-result v0

    iget-object v6, p0, Lum/r;->d:Lxu/h;

    sget-object v7, Lum/r;->h:Lxu/h;

    const-wide/16 v8, 0x2

    const/16 v10, 0x2f

    if-ne v6, v7, :cond_d

    const/16 v6, 0x22

    if-eq v0, v6, :cond_c

    const/16 v6, 0x23

    if-eq v0, v6, :cond_b

    const/16 v6, 0x27

    if-eq v0, v6, :cond_a

    if-eq v0, v10, :cond_7

    const/16 v6, 0x5b

    if-eq v0, v6, :cond_6

    const/16 v6, 0x5d

    if-eq v0, v6, :cond_4

    const/16 v6, 0x7b

    if-eq v0, v6, :cond_6

    const/16 v6, 0x7d

    if-eq v0, v6, :cond_4

    goto :goto_0

    :cond_4
    iget v0, p0, Lum/r;->e:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lum/r;->e:I

    if-nez v0, :cond_5

    iput-object v3, p0, Lum/r;->d:Lxu/h;

    :cond_5
    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto :goto_0

    :cond_6
    iget v0, p0, Lum/r;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lum/r;->e:I

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Lum/r;->a:Lxu/g;

    add-long/2addr v8, v4

    invoke-interface {v0, v8, v9}, Lxu/g;->w1(J)V

    iget-object v0, p0, Lum/r;->b:Lxu/e;

    add-long/2addr v4, v1

    invoke-virtual {v0, v4, v5}, Lxu/e;->j(J)B

    move-result v0

    if-ne v0, v10, :cond_8

    sget-object v0, Lum/r;->k:Lxu/h;

    iput-object v0, p0, Lum/r;->d:Lxu/h;

    iput-wide v8, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_8
    const/16 v1, 0x2a

    if-ne v0, v1, :cond_9

    sget-object v0, Lum/r;->l:Lxu/h;

    iput-object v0, p0, Lum/r;->d:Lxu/h;

    iput-wide v8, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_9
    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_a
    sget-object v0, Lum/r;->i:Lxu/h;

    iput-object v0, p0, Lum/r;->d:Lxu/h;

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_b
    sget-object v0, Lum/r;->k:Lxu/h;

    iput-object v0, p0, Lum/r;->d:Lxu/h;

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_c
    sget-object v0, Lum/r;->j:Lxu/h;

    iput-object v0, p0, Lum/r;->d:Lxu/h;

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_d
    sget-object v11, Lum/r;->i:Lxu/h;

    if-eq v6, v11, :cond_12

    sget-object v11, Lum/r;->j:Lxu/h;

    if-ne v6, v11, :cond_e

    goto :goto_1

    :cond_e
    sget-object v0, Lum/r;->l:Lxu/h;

    if-ne v6, v0, :cond_10

    iget-object v0, p0, Lum/r;->a:Lxu/g;

    add-long/2addr v8, v4

    invoke-interface {v0, v8, v9}, Lxu/g;->w1(J)V

    iget-object v0, p0, Lum/r;->b:Lxu/e;

    add-long/2addr v4, v1

    invoke-virtual {v0, v4, v5}, Lxu/e;->j(J)B

    move-result v0

    if-ne v0, v10, :cond_f

    iput-wide v8, p0, Lum/r;->f:J

    iput-object v7, p0, Lum/r;->d:Lxu/h;

    goto/16 :goto_0

    :cond_f
    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_10
    sget-object v0, Lum/r;->k:Lxu/h;

    if-ne v6, v0, :cond_11

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    iput-object v7, p0, Lum/r;->d:Lxu/h;

    goto/16 :goto_0

    :cond_11
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_12
    :goto_1
    const/16 v6, 0x5c

    if-ne v0, v6, :cond_13

    iget-object v0, p0, Lum/r;->a:Lxu/g;

    add-long/2addr v4, v8

    invoke-interface {v0, v4, v5}, Lxu/g;->w1(J)V

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_13
    iget v0, p0, Lum/r;->e:I

    if-lez v0, :cond_14

    move-object v3, v7

    :cond_14
    iput-object v3, p0, Lum/r;->d:Lxu/h;

    add-long/2addr v4, v1

    iput-wide v4, p0, Lum/r;->f:J

    goto/16 :goto_0

    :cond_15
    :goto_2
    return-void
.end method

.method public b()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lum/r;->g:Z

    :goto_0
    iget-object v0, p0, Lum/r;->d:Lxu/h;

    sget-object v1, Lum/r;->m:Lxu/h;

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x2000

    invoke-virtual {p0, v0, v1}, Lum/r;->a(J)V

    iget-object v0, p0, Lum/r;->a:Lxu/g;

    iget-wide v1, p0, Lum/r;->f:J

    invoke-interface {v0, v1, v2}, Lxu/g;->skip(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lum/r;->g:Z

    return-void
.end method

.method public read(Lxu/e;J)J
    .locals 7

    iget-boolean v0, p0, Lum/r;->g:Z

    if-nez v0, :cond_6

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v2, p0, Lum/r;->c:Lxu/e;

    invoke-virtual {v2}, Lxu/e;->Z1()Z

    move-result v2

    const-wide/16 v3, -0x1

    if-nez v2, :cond_3

    iget-object v0, p0, Lum/r;->c:Lxu/e;

    invoke-virtual {v0, p1, p2, p3}, Lxu/e;->read(Lxu/e;J)J

    move-result-wide v0

    sub-long/2addr p2, v0

    iget-object v2, p0, Lum/r;->b:Lxu/e;

    invoke-virtual {v2}, Lxu/e;->Z1()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lum/r;->read(Lxu/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-eqz p3, :cond_2

    add-long/2addr p1, v0

    return-wide p1

    :cond_2
    :goto_0
    return-wide v0

    :cond_3
    invoke-virtual {p0, p2, p3}, Lum/r;->a(J)V

    iget-wide v5, p0, Lum/r;->f:J

    cmp-long v0, v5, v0

    if-nez v0, :cond_5

    iget-object p1, p0, Lum/r;->d:Lxu/h;

    sget-object p2, Lum/r;->m:Lxu/h;

    if-ne p1, p2, :cond_4

    return-wide v3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_5
    invoke-static {p2, p3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    iget-object v0, p0, Lum/r;->b:Lxu/e;

    invoke-virtual {p1, v0, p2, p3}, Lxu/e;->write(Lxu/e;J)V

    iget-wide v0, p0, Lum/r;->f:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Lum/r;->f:J

    return-wide p2

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public timeout()Lxu/s0;
    .locals 1

    iget-object v0, p0, Lum/r;->a:Lxu/g;

    invoke-interface {v0}, Lxu/r0;->timeout()Lxu/s0;

    move-result-object v0

    return-object v0
.end method
