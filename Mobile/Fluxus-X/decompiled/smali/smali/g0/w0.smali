.class public final synthetic Lg0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/x0;

.field public final synthetic b:Landroidx/camera/core/d;

.field public final synthetic c:Landroid/graphics/Matrix;

.field public final synthetic d:Landroidx/camera/core/d;

.field public final synthetic e:Landroid/graphics/Rect;

.field public final synthetic f:Lg0/u0$a;

.field public final synthetic g:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lg0/x0;Landroidx/camera/core/d;Landroid/graphics/Matrix;Landroidx/camera/core/d;Landroid/graphics/Rect;Lg0/u0$a;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/w0;->a:Lg0/x0;

    iput-object p2, p0, Lg0/w0;->b:Landroidx/camera/core/d;

    iput-object p3, p0, Lg0/w0;->c:Landroid/graphics/Matrix;

    iput-object p4, p0, Lg0/w0;->d:Landroidx/camera/core/d;

    iput-object p5, p0, Lg0/w0;->e:Landroid/graphics/Rect;

    iput-object p6, p0, Lg0/w0;->f:Lg0/u0$a;

    iput-object p7, p0, Lg0/w0;->g:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lg0/w0;->a:Lg0/x0;

    iget-object v1, p0, Lg0/w0;->b:Landroidx/camera/core/d;

    iget-object v2, p0, Lg0/w0;->c:Landroid/graphics/Matrix;

    iget-object v3, p0, Lg0/w0;->d:Landroidx/camera/core/d;

    iget-object v4, p0, Lg0/w0;->e:Landroid/graphics/Rect;

    iget-object v5, p0, Lg0/w0;->f:Lg0/u0$a;

    iget-object v6, p0, Lg0/w0;->g:Ly1/c$a;

    invoke-static/range {v0 .. v6}, Lg0/x0;->b(Lg0/x0;Landroidx/camera/core/d;Landroid/graphics/Matrix;Landroidx/camera/core/d;Landroid/graphics/Rect;Lg0/u0$a;Ly1/c$a;)V

    return-void
.end method
