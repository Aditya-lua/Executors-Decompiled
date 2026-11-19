.class public final synthetic Lhq/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/widget/FrameLayout;

.field public final synthetic b:Lfq/i;

.field public final synthetic c:Lj/b;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/b;->a:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lhq/b;->b:Lfq/i;

    iput-object p3, p0, Lhq/b;->c:Lj/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lhq/b;->a:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lhq/b;->b:Lfq/i;

    iget-object v2, p0, Lhq/b;->c:Lj/b;

    invoke-static {v0, v1, v2}, Lhq/c;->j2(Landroid/widget/FrameLayout;Lfq/i;Lj/b;)V

    return-void
.end method
