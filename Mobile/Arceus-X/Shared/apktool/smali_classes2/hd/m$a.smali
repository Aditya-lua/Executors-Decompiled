.class public Lhd/m$a;
.super Lhd/m$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/m;->f(Landroid/graphics/Matrix;)Lhd/m$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Landroid/graphics/Matrix;

.field public final synthetic e:Lhd/m;


# direct methods
.method public constructor <init>(Lhd/m;Ljava/util/List;Landroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lhd/m$a;->e:Lhd/m;

    iput-object p2, p0, Lhd/m$a;->c:Ljava/util/List;

    iput-object p3, p0, Lhd/m$a;->d:Landroid/graphics/Matrix;

    invoke-direct {p0}, Lhd/m$g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lgd/a;ILandroid/graphics/Canvas;)V
    .locals 2

    iget-object p1, p0, Lhd/m$a;->c:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhd/m$g;

    iget-object v1, p0, Lhd/m$a;->d:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, p2, p3, p4}, Lhd/m$g;->a(Landroid/graphics/Matrix;Lgd/a;ILandroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    return-void
.end method
