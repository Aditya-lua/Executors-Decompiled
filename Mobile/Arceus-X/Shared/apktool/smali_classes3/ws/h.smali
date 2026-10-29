.class public Lws/h;
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
    .locals 0
    .param p1    # Lus/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lus/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance p1, Lxs/i;

    invoke-direct {p1}, Lxs/i;-><init>()V

    return-object p1
.end method
