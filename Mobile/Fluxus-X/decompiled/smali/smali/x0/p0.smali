.class public final synthetic Lx0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/q0;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lx0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/p0;->a:Lx0/q0;

    iput-object p2, p0, Lx0/p0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx0/p0;->a:Lx0/q0;

    iget-object v1, p0, Lx0/p0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1}, Lx0/q0;->b(Lx0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method
