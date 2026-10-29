.class public final synthetic Lx5/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/Executor;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx5/w0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lx5/w0;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lx5/w0;->a:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lx5/w0;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1, p1}, Lx5/z0;->c(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;Ly1/c$a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
