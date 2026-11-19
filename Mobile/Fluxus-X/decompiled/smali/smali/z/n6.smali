.class public final synthetic Lz/n6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageWriter$OnImageReleasedListener;


# instance fields
.field public final synthetic a:Landroidx/camera/core/d;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/n6;->a:Landroidx/camera/core/d;

    return-void
.end method


# virtual methods
.method public final onImageReleased(Landroid/media/ImageWriter;)V
    .locals 1

    iget-object v0, p0, Lz/n6;->a:Landroidx/camera/core/d;

    invoke-static {v0, p1}, Lz/m6$b;->a(Landroidx/camera/core/d;Landroid/media/ImageWriter;)V

    return-void
.end method
