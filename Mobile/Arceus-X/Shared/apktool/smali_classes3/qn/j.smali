.class public Lqn/j;
.super Lqn/a;
.source "SourceFile"


# instance fields
.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->m(Lqn/j;)V

    return-void
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lqn/j;->g:I

    return v0
.end method

.method public q(I)V
    .locals 0

    iput p1, p0, Lqn/j;->g:I

    return-void
.end method
