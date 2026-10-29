.class public final Lkd/h$b;
.super Lhd/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkd/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final w:Landroid/graphics/RectF;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/k;Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Lhd/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lhd/g$c;-><init>(Lhd/k;Lxc/a;)V

    .line 4
    iput-object p2, p0, Lkd/h$b;->w:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Lhd/k;Landroid/graphics/RectF;Lkd/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lkd/h$b;-><init>(Lhd/k;Landroid/graphics/RectF;)V

    return-void
.end method

.method public constructor <init>(Lkd/h$b;)V
    .locals 0
    .param p1    # Lkd/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1}, Lhd/g$c;-><init>(Lhd/g$c;)V

    .line 6
    iget-object p1, p1, Lkd/h$b;->w:Landroid/graphics/RectF;

    iput-object p1, p0, Lkd/h$b;->w:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Lkd/h$b;Lkd/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lkd/h$b;-><init>(Lkd/h$b;)V

    return-void
.end method

.method public static synthetic a(Lkd/h$b;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lkd/h$b;->w:Landroid/graphics/RectF;

    return-object p0
.end method


# virtual methods
.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lkd/h;->n0(Lkd/h$b;)Lkd/h;

    move-result-object v0

    invoke-virtual {v0}, Lhd/g;->invalidateSelf()V

    return-object v0
.end method
