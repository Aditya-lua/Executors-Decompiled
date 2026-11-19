.class public final Lob/te;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lob/ve;

.field public b:I

.field public c:J


# direct methods
.method public constructor <init>(Lob/ve;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/te;->a:Lob/ve;

    const/4 p1, 0x1

    iput p1, p0, Lob/te;->b:I

    invoke-virtual {p0}, Lob/te;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lob/te;->c:J

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, Lob/te;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lob/te;->b:I

    invoke-virtual {p0}, Lob/te;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lob/te;->c:J

    return-void
.end method

.method public final b()Z
    .locals 4

    iget-object v0, p0, Lob/te;->a:Lob/ve;

    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lob/te;->c:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic c()J
    .locals 2

    iget-wide v0, p0, Lob/te;->c:J

    return-wide v0
.end method

.method public final d()J
    .locals 7

    iget-object v0, p0, Lob/te;->a:Lob/ve;

    invoke-static {v0}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lob/e5;->v:Lob/d5;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    sget-object v1, Lob/e5;->w:Lob/d5;

    invoke-virtual {v1, v2}, Lob/d5;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v5, 0x1

    :goto_0
    iget v6, p0, Lob/te;->b:I

    if-ge v5, v6, :cond_1

    add-long/2addr v3, v3

    cmp-long v6, v3, v1

    if-ltz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lob/ve;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->a()J

    move-result-wide v5

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr v5, v0

    return-wide v5
.end method
