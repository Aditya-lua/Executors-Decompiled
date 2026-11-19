.class public Lei/y0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/y0;->i(Landroidx/lifecycle/s;Landroidx/lifecycle/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/lifecycle/e0<",
        "Landroid/graphics/Rect;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lei/y0;


# direct methods
.method public constructor <init>(Lei/y0;)V
    .locals 0

    iput-object p1, p0, Lei/y0$b;->a:Lei/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Lei/y0$b;->b(Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lei/y0$b;->a:Lei/y0;

    invoke-static {v0, p1}, Lei/y0;->c(Lei/y0;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lei/y0$b;->a:Lei/y0;

    invoke-static {p1}, Lei/y0;->e(Lei/y0;)V

    return-void
.end method
