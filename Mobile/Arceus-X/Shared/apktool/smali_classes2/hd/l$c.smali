.class public final Lhd/l$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lhd/k;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final b:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final c:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Lhd/l$b;

.field public final e:F


# direct methods
.method public constructor <init>(Lhd/k;FLandroid/graphics/RectF;Lhd/l$b;Landroid/graphics/Path;)V
    .locals 0
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lhd/l$c;->d:Lhd/l$b;

    iput-object p1, p0, Lhd/l$c;->a:Lhd/k;

    iput p2, p0, Lhd/l$c;->e:F

    iput-object p3, p0, Lhd/l$c;->c:Landroid/graphics/RectF;

    iput-object p5, p0, Lhd/l$c;->b:Landroid/graphics/Path;

    return-void
.end method
