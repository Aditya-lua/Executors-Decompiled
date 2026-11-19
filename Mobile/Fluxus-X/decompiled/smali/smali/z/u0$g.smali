.class public final Lz/u0$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Lz/u0;


# direct methods
.method public constructor <init>(Lz/u0;)V
    .locals 0

    iput-object p1, p0, Lz/u0$g;->a:Lz/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lz/u0$g;->a:Lz/u0;

    invoke-virtual {v0}, Lz/u0;->N0()V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/l1;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lz/u0$g;->a:Lz/u0;

    invoke-static {p1}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v0, p1}, Lz/u0;->G0(Ljava/util/List;)V

    return-void
.end method
