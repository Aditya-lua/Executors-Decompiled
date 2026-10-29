.class public final synthetic Lx5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Ly1/c$a;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/t;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lx5/t;->b:Ly1/c$a;

    iput-object p3, p0, Lx5/t;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lx5/t;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Lx5/t;->b:Ly1/c$a;

    iget-object v2, p0, Lx5/t;->c:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, v2}, Lx5/u;->a(Ljava/util/concurrent/atomic/AtomicBoolean;Ly1/c$a;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
