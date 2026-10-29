.class public Lc4/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    .line 3
    iput-wide v0, p0, Lc4/a$f;->a:J

    const-wide/16 p1, 0x1

    .line 4
    iput-wide p1, p0, Lc4/a$f;->b:J

    return-void

    .line 5
    :cond_0
    iput-wide p1, p0, Lc4/a$f;->a:J

    .line 6
    iput-wide p3, p0, Lc4/a$f;->b:J

    return-void
.end method

.method public synthetic constructor <init>(JJLc4/a$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc4/a$f;-><init>(JJ)V

    return-void
.end method

.method public static b(D)Lc4/a$f;
    .locals 23

    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    cmpl-double v0, p0, v0

    const-wide/16 v3, 0x1

    if-gez v0, :cond_0

    const-wide/high16 v5, -0x3c20000000000000L    # -9.223372036854776E18

    cmpg-double v0, p0, v5

    if-gtz v0, :cond_1

    :cond_0
    const-wide/16 v21, 0x0

    goto :goto_1

    :cond_1
    invoke-static/range {p0 .. p1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    const-wide v7, 0x3e45798ee2308c3aL    # 1.0E-8

    mul-double/2addr v7, v5

    const-wide/16 v9, 0x0

    move-wide v11, v3

    move-wide v15, v5

    move-wide v13, v9

    :goto_0
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    rem-double v19, v15, v17

    const-wide/16 v21, 0x0

    sub-double v1, v15, v19

    double-to-long v0, v1

    mul-long v15, v0, v3

    add-long/2addr v13, v15

    mul-long/2addr v0, v9

    add-long/2addr v0, v11

    div-double v15, v17, v19

    long-to-double v11, v13

    move-wide/from16 v17, v3

    long-to-double v2, v0

    div-double/2addr v11, v2

    sub-double v2, v5, v11

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    cmpl-double v2, v2, v7

    if-gtz v2, :cond_3

    new-instance v2, Lc4/a$f;

    cmpg-double v3, p0, v21

    if-gez v3, :cond_2

    neg-long v13, v13

    :cond_2
    invoke-direct {v2, v13, v14, v0, v1}, Lc4/a$f;-><init>(JJ)V

    return-object v2

    :cond_3
    move-wide v11, v9

    move-wide v3, v13

    move-wide/from16 v13, v17

    move-wide v9, v0

    goto :goto_0

    :goto_1
    new-instance v0, Lc4/a$f;

    cmpl-double v1, p0, v21

    if-lez v1, :cond_4

    const-wide v1, 0x7fffffffffffffffL

    goto :goto_2

    :cond_4
    const-wide/high16 v1, -0x8000000000000000L

    :goto_2
    invoke-direct {v0, v1, v2, v3, v4}, Lc4/a$f;-><init>(JJ)V

    return-object v0
.end method


# virtual methods
.method public a()D
    .locals 4

    iget-wide v0, p0, Lc4/a$f;->a:J

    long-to-double v0, v0

    iget-wide v2, p0, Lc4/a$f;->b:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v1, p0, Lc4/a$f;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lc4/a$f;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
