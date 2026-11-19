.class public abstract Ld8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ld8/g;
    .locals 4

    new-instance v0, Ld8/b;

    sget-object v1, Ld8/g$a;->c:Ld8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld8/b;-><init>(Ld8/g$a;J)V

    return-object v0
.end method

.method public static d()Ld8/g;
    .locals 4

    new-instance v0, Ld8/b;

    sget-object v1, Ld8/g$a;->d:Ld8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld8/b;-><init>(Ld8/g$a;J)V

    return-object v0
.end method

.method public static e(J)Ld8/g;
    .locals 2

    new-instance v0, Ld8/b;

    sget-object v1, Ld8/g$a;->a:Ld8/g$a;

    invoke-direct {v0, v1, p0, p1}, Ld8/b;-><init>(Ld8/g$a;J)V

    return-object v0
.end method

.method public static f()Ld8/g;
    .locals 4

    new-instance v0, Ld8/b;

    sget-object v1, Ld8/g$a;->b:Ld8/g$a;

    const-wide/16 v2, -0x1

    invoke-direct {v0, v1, v2, v3}, Ld8/b;-><init>(Ld8/g$a;J)V

    return-object v0
.end method


# virtual methods
.method public abstract b()J
.end method

.method public abstract c()Ld8/g$a;
.end method
