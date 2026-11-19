.class public final synthetic Lt0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/media/ImageWriter$OnImageReleasedListener;

.field public final synthetic b:Landroid/media/ImageWriter;


# direct methods
.method public synthetic constructor <init>(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/c;->a:Landroid/media/ImageWriter$OnImageReleasedListener;

    iput-object p2, p0, Lt0/c;->b:Landroid/media/ImageWriter;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt0/c;->a:Landroid/media/ImageWriter$OnImageReleasedListener;

    iget-object v1, p0, Lt0/c;->b:Landroid/media/ImageWriter;

    invoke-static {v0, v1}, Lt0/d;->a(Landroid/media/ImageWriter$OnImageReleasedListener;Landroid/media/ImageWriter;)V

    return-void
.end method
