.class public final Ln0/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/i4;
.implements Ln0/i2;
.implements Ls0/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln0/i4<",
        "Lg0/a2;",
        ">;",
        "Ln0/i2;",
        "Ls0/r;"
    }
.end annotation


# instance fields
.field public final P:Ln0/c3;


# direct methods
.method public constructor <init>(Ln0/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/f3;->P:Ln0/c3;

    return-void
.end method


# virtual methods
.method public n()Ln0/n1;
    .locals 1

    iget-object v0, p0, Ln0/f3;->P:Ln0/c3;

    return-object v0
.end method

.method public p()I
    .locals 1

    sget-object v0, Ln0/h2;->j:Ln0/n1$a;

    invoke-interface {p0, v0}, Ln0/l3;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
