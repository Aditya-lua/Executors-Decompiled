.class public final Ln0/e0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static k()Ln0/e0;
    .locals 1

    new-instance v0, Ln0/e0$a;

    invoke-direct {v0}, Ln0/e0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Ln0/d0;
    .locals 1

    sget-object v0, Ln0/d0;->a:Ln0/d0;

    return-object v0
.end method

.method public c()Ln0/z3;
    .locals 1

    invoke-static {}, Ln0/z3;->b()Ln0/z3;

    move-result-object v0

    return-object v0
.end method

.method public d()Ln0/b0;
    .locals 1

    sget-object v0, Ln0/b0;->a:Ln0/b0;

    return-object v0
.end method

.method public e()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Ln0/x;
    .locals 1

    sget-object v0, Ln0/x;->a:Ln0/x;

    return-object v0
.end method

.method public g()Ln0/a0;
    .locals 1

    sget-object v0, Ln0/a0;->a:Ln0/a0;

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public h()Ln0/c0;
    .locals 1

    sget-object v0, Ln0/c0;->a:Ln0/c0;

    return-object v0
.end method

.method public i()Ln0/z;
    .locals 1

    sget-object v0, Ln0/z;->a:Ln0/z;

    return-object v0
.end method

.method public j()Ln0/y;
    .locals 1

    sget-object v0, Ln0/y;->a:Ln0/y;

    return-object v0
.end method
