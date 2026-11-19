.class public final Lfq/m0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/m0;-><init>(Lfq/n0;ZLkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lgq/a;

.field public final synthetic b:Lfq/m0;

.field public final synthetic c:Lfq/m0;

.field public final synthetic d:Lj/b;


# direct methods
.method public constructor <init>(Lgq/a;Lfq/m0;Lfq/m0;Lj/b;)V
    .locals 0

    iput-object p1, p0, Lfq/m0$c;->a:Lgq/a;

    iput-object p2, p0, Lfq/m0$c;->b:Lfq/m0;

    iput-object p3, p0, Lfq/m0$c;->c:Lfq/m0;

    iput-object p4, p0, Lfq/m0$c;->d:Lj/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lfq/m0$c;->a:Lgq/a;

    invoke-virtual {v0}, Lgq/a;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lfq/m0$c;->b:Lfq/m0;

    invoke-static {v0}, Lfq/m0;->c(Lfq/m0;)Lfq/n0;

    move-result-object v0

    sget-object v1, Lfq/n0;->b:Lfq/n0;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lfq/m0$c;->b:Lfq/m0;

    invoke-static {v0}, Lfq/m0;->d(Lfq/m0;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lfq/m0$c;->c:Lfq/m0;

    invoke-static {v0}, Lfq/m0;->b(Lfq/m0;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    iget-object v0, p0, Lfq/m0$c;->c:Lfq/m0;

    invoke-static {v0}, Lfq/m0;->b(Lfq/m0;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Lfq/m0$c;->d:Lj/b;

    iget-object v2, p0, Lfq/m0$c;->c:Lfq/m0;

    invoke-static {v2}, Lfq/m0;->c(Lfq/m0;)Lfq/n0;

    move-result-object v2

    invoke-static {v2}, Lfq/x1;->c(Lfq/n0;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lk2/b;->v(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
