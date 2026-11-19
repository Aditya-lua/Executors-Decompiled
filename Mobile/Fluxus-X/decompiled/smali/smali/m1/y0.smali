.class public final synthetic Lm1/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/i0$g;

.field public final synthetic b:Landroid/media/MediaFormat;


# direct methods
.method public synthetic constructor <init>(Lm1/i0$g;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/y0;->a:Lm1/i0$g;

    iput-object p2, p0, Lm1/y0;->b:Landroid/media/MediaFormat;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/y0;->a:Lm1/i0$g;

    iget-object v1, p0, Lm1/y0;->b:Landroid/media/MediaFormat;

    invoke-static {v0, v1}, Lm1/i0$g;->f(Lm1/i0$g;Landroid/media/MediaFormat;)V

    return-void
.end method
