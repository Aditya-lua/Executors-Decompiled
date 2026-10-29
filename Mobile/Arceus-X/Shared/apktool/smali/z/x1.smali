.class public final synthetic Lz/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/x1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lz/x1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Lz/g1$g;->n(Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
