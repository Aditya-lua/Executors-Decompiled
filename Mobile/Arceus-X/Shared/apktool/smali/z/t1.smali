.class public final synthetic Lz/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/g1$g;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ly1/c$a;


# direct methods
.method public synthetic constructor <init>(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/t1;->a:Lz/g1$g;

    iput-object p2, p0, Lz/t1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lz/t1;->c:Ly1/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz/t1;->a:Lz/g1$g;

    iget-object v1, p0, Lz/t1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lz/t1;->c:Ly1/c$a;

    invoke-static {v0, v1, v2}, Lz/g1$g;->d(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)V

    return-void
.end method
