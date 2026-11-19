.class public final synthetic Lm0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/v0;

.field public final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lm0/v0;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/s0;->a:Lm0/v0;

    iput-object p2, p0, Lm0/s0;->b:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/s0;->a:Lm0/v0;

    iget-object v1, p0, Lm0/s0;->b:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lm0/u0;->f(Lm0/v0;Landroid/graphics/Bitmap;)V

    return-void
.end method
