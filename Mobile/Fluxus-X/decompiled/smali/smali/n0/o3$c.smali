.class public final Ln0/o3$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o3$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/o3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Ln0/o3$d;


# direct methods
.method public constructor <init>(Ln0/o3$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ln0/o3$c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ln0/o3$c;->b:Ln0/o3$d;

    return-void
.end method


# virtual methods
.method public a(Ln0/o3;Ln0/o3$g;)V
    .locals 1

    iget-object v0, p0, Ln0/o3$c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ln0/o3$c;->b:Ln0/o3$d;

    invoke-interface {v0, p1, p2}, Ln0/o3$d;->a(Ln0/o3;Ln0/o3$g;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Ln0/o3$c;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
