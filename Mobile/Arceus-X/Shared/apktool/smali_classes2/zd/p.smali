.class public final synthetic Lzd/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/p;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/p;->a:Landroid/content/Context;

    sget-object v1, Lzd/a;->e:Ljava/util/concurrent/atomic/AtomicReference;

    :try_start_0
    invoke-static {v0}, Lae/a1;->h(Landroid/content/Context;)Lae/a1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lbe/o1;->c(Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "SplitCompat"

    const-string v1, "Failed to set broadcast receiver to always on."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
