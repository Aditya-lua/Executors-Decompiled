.class public final synthetic Ly0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Landroid/graphics/SurfaceTexture;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/m;->a:Ly0/o;

    iput-object p2, p0, Ly0/m;->b:Landroid/graphics/SurfaceTexture;

    iput-object p3, p0, Ly0/m;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ly0/m;->a:Ly0/o;

    iget-object v1, p0, Ly0/m;->b:Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, Ly0/m;->c:Landroid/view/Surface;

    check-cast p1, Lg0/v2$g;

    invoke-static {v0, v1, v2, p1}, Ly0/o;->g(Ly0/o;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lg0/v2$g;)V

    return-void
.end method
