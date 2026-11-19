.class public final Lmd/h$b;
.super Lid/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd/h;
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
.method public constructor <init>(Lid/k;Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Lid/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lid/g$c;-><init>(Lid/k;Lyc/a;)V

    .line 4
    iput-object p2, p0, Lmd/h$b;->w:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Lid/k;Landroid/graphics/RectF;Lmd/h$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lmd/h$b;-><init>(Lid/k;Landroid/graphics/RectF;)V

    return-void
.end method

.method public constructor <init>(Lmd/h$b;)V
    .locals 0
    .param p1    # Lmd/h$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 5
    invoke-direct {p0, p1}, Lid/g$c;-><init>(Lid/g$c;)V

    .line 6
    iget-object p1, p1, Lmd/h$b;->w:Landroid/graphics/RectF;

    iput-object p1, p0, Lmd/h$b;->w:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Lmd/h$b;Lmd/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lmd/h$b;-><init>(Lmd/h$b;)V

    return-void
.end method

.method public static synthetic a(Lmd/h$b;)Landroid/graphics/RectF;
    .locals 0

    iget-object p0, p0, Lmd/h$b;->w:Landroid/graphics/RectF;

    return-object p0
.end method


# virtual methods
.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lmd/h;->n0(Lmd/h$b;)Lmd/h;

    move-result-object v0

    invoke-virtual {v0}, Lid/g;->invalidateSelf()V

    return-object v0
.end method
