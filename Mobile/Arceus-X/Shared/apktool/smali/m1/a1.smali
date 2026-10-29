.class public final synthetic Lm1/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm1/m;

.field public final synthetic b:Landroid/media/MediaFormat;


# direct methods
.method public synthetic constructor <init>(Lm1/m;Landroid/media/MediaFormat;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/a1;->a:Lm1/m;

    iput-object p2, p0, Lm1/a1;->b:Landroid/media/MediaFormat;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm1/a1;->a:Lm1/m;

    iget-object v1, p0, Lm1/a1;->b:Landroid/media/MediaFormat;

    invoke-static {v0, v1}, Lm1/i0$g;->d(Lm1/m;Landroid/media/MediaFormat;)V

    return-void
.end method
