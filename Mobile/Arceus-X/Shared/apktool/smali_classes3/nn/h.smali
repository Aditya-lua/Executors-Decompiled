.class public Lnn/h;
.super Ltn/a;
.source "SourceFile"


# instance fields
.field public final a:Lqn/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ltn/a;-><init>()V

    new-instance v0, Lqn/f;

    invoke-direct {v0}, Lqn/f;-><init>()V

    iput-object v0, p0, Lnn/h;->a:Lqn/f;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Ltn/h;)Ltn/c;
    .locals 0

    invoke-interface {p1}, Ltn/h;->getIndex()I

    move-result p1

    invoke-static {p1}, Ltn/c;->b(I)Ltn/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lqn/a;
    .locals 1

    invoke-virtual {p0}, Lnn/h;->k()Lqn/f;

    move-result-object v0

    return-object v0
.end method

.method public e(Lqn/a;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public k()Lqn/f;
    .locals 1

    iget-object v0, p0, Lnn/h;->a:Lqn/f;

    return-object v0
.end method
