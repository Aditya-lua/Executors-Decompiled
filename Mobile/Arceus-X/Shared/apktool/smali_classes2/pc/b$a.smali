.class public Lpc/b$a;
.super Landroid/graphics/drawable/InsetDrawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/b;->D(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lpc/b;


# direct methods
.method public constructor <init>(Lpc/b;Landroid/graphics/drawable/Drawable;IIII)V
    .locals 0

    iput-object p1, p0, Lpc/b$a;->a:Lpc/b;

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    return-void
.end method


# virtual methods
.method public getMinimumHeight()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getMinimumWidth()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
