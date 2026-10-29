.class public abstract Lc8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc8/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lc8/g;
    .locals 4

    new-instance v0, Lc8/b;

    sget-object v1, Lc8/g$a;->c:Lc8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lc8/b;-><init>(Lc8/g$a;J)V

    return-object v0
.end method

.method public static d()Lc8/g;
    .locals 4

    new-instance v0, Lc8/b;

    sget-object v1, Lc8/g$a;->d:Lc8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lc8/b;-><init>(Lc8/g$a;J)V

    return-object v0
.end method

.method public static e(J)Lc8/g;
    .locals 2

    new-instance v0, Lc8/b;

    sget-object v1, Lc8/g$a;->a:Lc8/g$a;

    invoke-direct {v0, v1, p0, p1}, Lc8/b;-><init>(Lc8/g$a;J)V

    return-object v0
.end method

.method public static f()Lc8/g;
    .locals 4

    new-instance v0, Lc8/b;

    sget-object v1, Lc8/g$a;->b:Lc8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Lc8/b;-><init>(Lc8/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Lc8/g$a;
.end method
