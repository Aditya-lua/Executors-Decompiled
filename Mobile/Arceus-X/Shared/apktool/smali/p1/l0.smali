.class public final synthetic Lp1/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/e;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/e;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/l0;->a:Landroidx/camera/view/e;

    iput-object p2, p0, Lp1/l0;->b:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp1/l0;->a:Landroidx/camera/view/e;

    iget-object v1, p0, Lp1/l0;->b:Lg0/v2;

    invoke-static {v0, v1}, Landroidx/camera/view/e;->l(Landroidx/camera/view/e;Lg0/v2;)V

    return-void
.end method
