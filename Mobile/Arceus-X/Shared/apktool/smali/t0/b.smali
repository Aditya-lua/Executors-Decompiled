.class public final synthetic Lt0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/ImageWriter$OnImageReleasedListener;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Landroid/media/ImageWriter$OnImageReleasedListener;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lt0/b;->b:Landroid/media/ImageWriter$OnImageReleasedListener;

    return-void
.end method


# virtual methods
.method public final onImageReleased(Landroid/media/ImageWriter;)V
    .locals 2

    iget-object v0, p0, Lt0/b;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lt0/b;->b:Landroid/media/ImageWriter$OnImageReleasedListener;

    invoke-static {v0, v1, p1}, Lt0/d;->b(Ljava/util/concurrent/Executor;Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V

    return-void
.end method
