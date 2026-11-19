.class public final synthetic Lz/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lz/g1$g;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/y1;->a:Lz/g1$g;

    iput-object p2, p0, Lz/y1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lz/y1;->a:Lz/g1$g;

    iget-object v1, p0, Lz/y1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1, p1}, Lz/g1$g;->j(Lz/g1$g;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
