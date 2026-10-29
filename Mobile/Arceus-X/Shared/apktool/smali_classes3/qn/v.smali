.class public Lqn/v;
.super Lqn/q;
.source "SourceFile"


# instance fields
.field public h:Ljava/lang/String;

.field public i:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lqn/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lqn/d0;)V
    .locals 0

    invoke-interface {p1, p0}, Lqn/d0;->z(Lqn/v;)V

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqn/v;->h:Ljava/lang/String;

    return-object v0
.end method

.method public s()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lqn/v;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public t()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lqn/v;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lqn/v;->h:Ljava/lang/String;

    return-void
.end method

.method public v(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lqn/v;->i:Ljava/lang/Integer;

    return-void
.end method

.method public w(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lqn/v;->i:Ljava/lang/Integer;

    return-void
.end method
