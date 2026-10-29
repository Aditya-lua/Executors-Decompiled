.class public Lr3/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr3/b$b<",
        "Lw1/k<",
        "Ly2/p;",
        ">;",
        "Ly2/p;",
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
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw1/k;

    invoke-virtual {p0, p1, p2}, Lr3/a$b;->c(Lw1/k;I)Ly2/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lw1/k;

    invoke-virtual {p0, p1}, Lr3/a$b;->d(Lw1/k;)I

    move-result p1

    return p1
.end method

.method public c(Lw1/k;I)Ly2/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/k<",
            "Ly2/p;",
            ">;I)",
            "Ly2/p;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lw1/k;->k(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly2/p;

    return-object p1
.end method

.method public d(Lw1/k;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/k<",
            "Ly2/p;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, Lw1/k;->j()I

    move-result p1

    return p1
.end method
