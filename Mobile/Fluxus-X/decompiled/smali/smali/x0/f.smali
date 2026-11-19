.class public final synthetic Lx0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/v2;

.field public final synthetic c:Landroid/graphics/SurfaceTexture;

.field public final synthetic d:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/v2;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/f;->a:Lx0/t;

    iput-object p2, p0, Lx0/f;->b:Lg0/v2;

    iput-object p3, p0, Lx0/f;->c:Landroid/graphics/SurfaceTexture;

    iput-object p4, p0, Lx0/f;->d:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lx0/f;->a:Lx0/t;

    iget-object v1, p0, Lx0/f;->b:Lg0/v2;

    iget-object v2, p0, Lx0/f;->c:Landroid/graphics/SurfaceTexture;

    iget-object v3, p0, Lx0/f;->d:Landroid/view/Surface;

    check-cast p1, Lg0/v2$g;

    invoke-static {v0, v1, v2, v3, p1}, Lx0/t;->f(Lx0/t;Lg0/v2;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lg0/v2$g;)V

    return-void
.end method
