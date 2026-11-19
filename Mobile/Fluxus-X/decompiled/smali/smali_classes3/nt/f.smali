.class public Lnt/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llt/g;Llt/r;)Ljava/lang/Object;
    .locals 3
    .param p1    # Llt/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Llt/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lot/g;

    invoke-virtual {p1}, Llt/g;->e()Lmt/c;

    move-result-object v1

    sget-object v2, Lmt/b;->e:Llt/p;

    invoke-virtual {v2, p2}, Llt/p;->c(Llt/r;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1}, Llt/g;->b()Llt/c;

    move-result-object p1

    invoke-direct {v0, v1, p2, p1}, Lot/g;-><init>(Lmt/c;Ljava/lang/String;Llt/c;)V

    return-object v0
.end method
