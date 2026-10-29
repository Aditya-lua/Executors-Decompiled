.class public Lvs/a$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/m$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvs/a;->t(Lus/m$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lus/m$c<",
        "Lqn/h;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lus/m;Lqn/s;)V
    .locals 0
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/s;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p2, Lqn/h;

    invoke-virtual {p0, p1, p2}, Lvs/a$l;->b(Lus/m;Lqn/h;)V

    return-void
.end method

.method public b(Lus/m;Lqn/h;)V
    .locals 2
    .param p1    # Lus/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lqn/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p2}, Lqn/h;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lqn/h;->s()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lvs/a;->I(Lus/m;Ljava/lang/String;Ljava/lang/String;Lqn/s;)V

    return-void
.end method
