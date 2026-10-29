.class public Lus/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lus/m;Lqn/s;)V
    .locals 0
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Lus/m;->B()V

    return-void
.end method

.method public b(Lus/m;Lqn/s;)V
    .locals 0
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1, p2}, Lus/m;->c(Lqn/s;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lus/m;->B()V

    invoke-interface {p1}, Lus/m;->x()V

    :cond_0
    return-void
.end method
