.class public final synthetic Lp1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Landroidx/camera/view/e;

.field public final synthetic b:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/e;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/n0;->a:Landroidx/camera/view/e;

    iput-object p2, p0, Lp1/n0;->b:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lp1/n0;->a:Landroidx/camera/view/e;

    iget-object v1, p0, Lp1/n0;->b:Landroid/view/Surface;

    invoke-static {v0, v1, p1}, Landroidx/camera/view/e;->j(Landroidx/camera/view/e;Landroid/view/Surface;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
