.class public Lnt/b;
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
    .locals 0
    .param p1    # Llt/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Llt/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance p2, Lot/c;

    invoke-virtual {p1}, Llt/g;->e()Lmt/c;

    move-result-object p1

    invoke-direct {p2, p1}, Lot/c;-><init>(Lmt/c;)V

    return-object p2
.end method
