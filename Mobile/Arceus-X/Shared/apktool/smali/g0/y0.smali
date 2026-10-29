.class public final Lg0/y0;
.super Lg0/x0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg0/x0;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ln0/j2;)Landroidx/camera/core/d;
    .locals 0

    invoke-interface {p1}, Ln0/j2;->g()Landroidx/camera/core/d;

    move-result-object p1

    return-object p1
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public l(Landroidx/camera/core/d;)V
    .locals 2

    invoke-virtual {p0, p1}, Lg0/x0;->e(Landroidx/camera/core/d;)Lne/x;

    move-result-object v0

    new-instance v1, Lg0/y0$a;

    invoke-direct {v1, p0, p1}, Lg0/y0$a;-><init>(Lg0/y0;Landroidx/camera/core/d;)V

    invoke-static {}, Lq0/c;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lr0/n;->j(Lne/x;Lr0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method
