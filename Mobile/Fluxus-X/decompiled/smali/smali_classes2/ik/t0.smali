.class public final synthetic Lik/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicLong;

.field public final synthetic d:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lik/t0;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lik/t0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p3, p0, Lik/t0;->c:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p4, p0, Lik/t0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lik/t0;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Lik/t0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, p0, Lik/t0;->c:Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v3, p0, Lik/t0;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, v1, v2, v3}, Lik/w0;->a(Ljava/util/ArrayList;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicLong;Ljava/util/concurrent/atomic/AtomicLong;)V

    return-void
.end method
