.class public Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;


# direct methods
.method public constructor <init>(Lcom/roblox/engine/jni/util/AssertDialogUtil$a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const/4 p1, -0x3

    if-eq p2, p1, :cond_2

    const/4 p1, -0x2

    if-eq p2, p1, :cond_1

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    iget-object p2, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    iget-object p2, p2, Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    iget-object p1, p1, Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    iget-object p1, p1, Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    iget-object p1, p1, Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    :goto_0
    iget-object p1, p0, Lcom/roblox/engine/jni/util/AssertDialogUtil$a$a;->a:Lcom/roblox/engine/jni/util/AssertDialogUtil$a;

    iget-object p1, p1, Lcom/roblox/engine/jni/util/AssertDialogUtil$a;->d:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    return-void
.end method
