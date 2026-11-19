.class public Lid/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lid/l$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lid/g;-><init>(Lid/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lid/g;


# direct methods
.method public constructor <init>(Lid/g;)V
    .locals 0

    iput-object p1, p0, Lid/g$a;->a:Lid/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lid/m;Landroid/graphics/Matrix;I)V
    .locals 3
    .param p1    # Lid/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lid/g$a;->a:Lid/g;

    invoke-static {v0}, Lid/g;->b(Lid/g;)Ljava/util/BitSet;

    move-result-object v0

    add-int/lit8 v1, p3, 0x4

    invoke-virtual {p1}, Lid/m;->e()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lid/g$a;->a:Lid/g;

    invoke-static {v0}, Lid/g;->d(Lid/g;)[Lid/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lid/m;->f(Landroid/graphics/Matrix;)Lid/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method

.method public b(Lid/m;Landroid/graphics/Matrix;I)V
    .locals 2
    .param p1    # Lid/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lid/g$a;->a:Lid/g;

    invoke-static {v0}, Lid/g;->b(Lid/g;)Ljava/util/BitSet;

    move-result-object v0

    invoke-virtual {p1}, Lid/m;->e()Z

    move-result v1

    invoke-virtual {v0, p3, v1}, Ljava/util/BitSet;->set(IZ)V

    iget-object v0, p0, Lid/g$a;->a:Lid/g;

    invoke-static {v0}, Lid/g;->c(Lid/g;)[Lid/m$g;

    move-result-object v0

    invoke-virtual {p1, p2}, Lid/m;->f(Landroid/graphics/Matrix;)Lid/m$g;

    move-result-object p1

    aput-object p1, v0, p3

    return-void
.end method
