.class public final synthetic Lak/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic c:Lne/e0;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicBoolean;Lne/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lak/j;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p3, p0, Lak/j;->c:Lne/e0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lak/j;->a:Landroid/content/Context;

    iget-object v1, p0, Lak/j;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v2, p0, Lak/j;->c:Lne/e0;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/startup/a;->b(Landroid/content/Context;Ljava/util/concurrent/atomic/AtomicBoolean;Lne/e0;)V

    return-void
.end method
