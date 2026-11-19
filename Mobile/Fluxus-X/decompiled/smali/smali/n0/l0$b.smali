.class public Ln0/l0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public b(Ln0/o3$b;)V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public e(F)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/util/List;II)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;II)",
            "Lpe/x<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public g(F)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lpe/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method

.method public i(I)V
    .locals 0

    return-void
.end method

.method public j()Ln0/n1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l(Ln0/n1;)V
    .locals 0

    return-void
.end method

.method public n()V
    .locals 0

    return-void
.end method

.method public o(Lg0/m0;)Lpe/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/m0;",
            ")",
            "Lpe/x<",
            "Lg0/n0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg0/n0;->b()Lg0/n0;

    move-result-object p1

    invoke-static {p1}, Lr0/n;->p(Ljava/lang/Object;)Lpe/x;

    move-result-object p1

    return-object p1
.end method
