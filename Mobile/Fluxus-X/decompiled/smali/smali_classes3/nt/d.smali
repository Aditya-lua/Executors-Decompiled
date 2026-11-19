.class public Lnt/d;
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

    new-instance p1, Lot/e;

    invoke-direct {p1}, Lot/e;-><init>()V

    return-object p1
.end method
