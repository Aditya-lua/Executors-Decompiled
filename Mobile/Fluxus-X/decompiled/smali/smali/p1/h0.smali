.class public final synthetic Lp1/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/d;

.field public final synthetic b:Lg0/v2;

.field public final synthetic c:Landroidx/camera/view/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/d;Lg0/v2;Landroidx/camera/view/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/h0;->a:Landroidx/camera/view/d;

    iput-object p2, p0, Lp1/h0;->b:Lg0/v2;

    iput-object p3, p0, Lp1/h0;->c:Landroidx/camera/view/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp1/h0;->a:Landroidx/camera/view/d;

    iget-object v1, p0, Lp1/h0;->b:Lg0/v2;

    iget-object v2, p0, Lp1/h0;->c:Landroidx/camera/view/c$a;

    invoke-static {v0, v1, v2}, Landroidx/camera/view/d;->j(Landroidx/camera/view/d;Lg0/v2;Landroidx/camera/view/c$a;)V

    return-void
.end method
