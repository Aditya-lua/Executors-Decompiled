.class public Lhd/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/g;-><init>(Lhd/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lhd/g;


# direct methods
.method public constructor <init>(Lhd/g;)V
    .locals 0

    iput-object p1, p0, Lhd/g$a;->a:Lhd/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lhd/m;Landroid/graphics/Matrix;I)V
    .locals 3
    .param p1    # Lhd/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lhd/g$a;->a:Lhd/g;

    invoke-static {v0}, Lhd/g;->b(Lhd/g;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lhd/m;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lhd/g$a;->a:Lhd/g;

    invoke-static {v0}, Lhd/g;->d(Lhd/g;)[Lhd/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lhd/m;->f(Landroid/graphics/Matrix;)Lhd/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lhd/m;Landroid/graphics/Matrix;I)V
    .locals 2
    .param p1    # Lhd/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lhd/g$a;->a:Lhd/g;

    invoke-static {v0}, Lhd/g;->b(Lhd/g;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lhd/m;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lhd/g$a;->a:Lhd/g;

    invoke-static {v0}, Lhd/g;->c(Lhd/g;)[Lhd/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lhd/m;->f(Landroid/graphics/Matrix;)Lhd/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
