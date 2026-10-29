.class public abstract Lqn/q;
.super Lqn/a;
.source "SourceFile"


# instance fields
.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/a;-><init>()V

    return-void
.end method


# virtual methods
.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lqn/q;->g:Z

    return v0
.end method

.method public q(Z)V
    .locals 0

    iput-boolean p1, p0, Lqn/q;->g:Z

    return-void
.end method
