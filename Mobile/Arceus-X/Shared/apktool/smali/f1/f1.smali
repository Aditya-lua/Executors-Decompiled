.class public abstract Lf1/f1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(JJLf1/b;)Lf1/f1;
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const-string v5, "duration must be positive value."

    invoke-static {v2, v5}, Lx2/g;->b(ZLjava/lang/Object;)V

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    move v3, v4

    :cond_1
    const-string v0, "bytes must be positive value."

    invoke-static {v3, v0}, Lx2/g;->b(ZLjava/lang/Object;)V

    new-instance v4, Lf1/l;

    move-wide v5, p0

    move-wide v7, p2

    move-object v9, p4

    invoke-direct/range {v4 .. v9}, Lf1/l;-><init>(JJLf1/b;)V

    return-object v4
.end method


# virtual methods
.method public abstract a()Lf1/b;
.end method

.method public abstract b()J
.end method

.method public abstract c()J
.end method
