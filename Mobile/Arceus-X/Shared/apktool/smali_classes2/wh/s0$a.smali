.class public Lwh/s0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/s0;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lwh/s0;


# direct methods
.method public constructor <init>(Lwh/s0;)V
    .locals 0

    iput-object p1, p0, Lwh/s0$a;->a:Lwh/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 0

    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 2

    if-nez p1, :cond_1

    iget-object p1, p0, Lwh/s0$a;->a:Lwh/s0;

    invoke-static {p1}, Lwh/s0;->a(Lwh/s0;)Landroid/hardware/display/DisplayManager;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lwh/s0$a;->a:Lwh/s0;

    invoke-static {p1}, Lwh/s0;->a(Lwh/s0;)Landroid/hardware/display/DisplayManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->getDisplay(I)Landroid/view/Display;

    move-result-object v0

    invoke-static {p1, v0}, Lwh/s0;->c(Lwh/s0;Landroid/view/Display;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0

    return-void
.end method
