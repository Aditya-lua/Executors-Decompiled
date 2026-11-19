.class public Lq/m0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lq/m0;


# direct methods
.method public constructor <init>(Lq/m0;)V
    .locals 0

    iput-object p1, p0, Lq/m0$f;->a:Lq/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lq/m0$f;->a:Lq/m0;

    const/4 v1, 0x0

    iput-object v1, v0, Lq/m0;->m:Lq/m0$f;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lq/m0$f;->a:Lq/m0;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lq/m0$f;->a:Lq/m0;

    const/4 v1, 0x0

    iput-object v1, v0, Lq/m0;->m:Lq/m0$f;

    invoke-virtual {v0}, Lq/m0;->drawableStateChanged()V

    return-void
.end method
