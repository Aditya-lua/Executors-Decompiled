.class public final synthetic Lnq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnq/q;

.field public final synthetic b:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Lnq/q;Landroid/widget/FrameLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq/e;->a:Lnq/q;

    iput-object p2, p0, Lnq/e;->b:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnq/e;->a:Lnq/q;

    iget-object v1, p0, Lnq/e;->b:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Lnq/q;->z(Lnq/q;Landroid/widget/FrameLayout;)V

    return-void
.end method
