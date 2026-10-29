.class public Lqn/r;
.super Lqn/a;
.source "SourceFile"


# instance fields
.field public g:Ljava/lang/Integer;

.field public h:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->r(Lqn/r;)V

    return-void
.end method

.method public c(Lqn/s;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-super {p0, p1}, Lqn/s;->c(Lqn/s;)V

    return-void
.end method

.method public p(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lqn/r;->h:Ljava/lang/Integer;

    return-void
.end method

.method public q(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lqn/r;->g:Ljava/lang/Integer;

    return-void
.end method
