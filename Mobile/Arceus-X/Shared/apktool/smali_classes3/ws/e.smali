.class public Lws/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lus/g;Lus/r;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lxs/f;

    invoke-virtual {p1}, Lus/g;->e()Lvs/c;

    move-result-object p1

    sget-object v1, Lvs/b;->d:Lus/p;

    invoke-virtual {v1, p2}, Lus/p;->c(Lus/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-direct {v0, p1, p2}, Lxs/f;-><init>(Lvs/c;I)V

    return-object v0
.end method
