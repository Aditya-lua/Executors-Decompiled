.class public final synthetic Lp1/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/e;

.field public final synthetic b:Landroid/view/Surface;

.field public final synthetic c:Lne/x;

.field public final synthetic d:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/e;Landroid/view/Surface;Lne/x;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/o0;->a:Landroidx/camera/view/e;

    iput-object p2, p0, Lp1/o0;->b:Landroid/view/Surface;

    iput-object p3, p0, Lp1/o0;->c:Lne/x;

    iput-object p4, p0, Lp1/o0;->d:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lp1/o0;->a:Landroidx/camera/view/e;

    iget-object v1, p0, Lp1/o0;->b:Landroid/view/Surface;

    iget-object v2, p0, Lp1/o0;->c:Lne/x;

    iget-object v3, p0, Lp1/o0;->d:Lg0/v2;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/view/e;->k(Landroidx/camera/view/e;Landroid/view/Surface;Lne/x;Lg0/v2;)V

    return-void
.end method
