.class public final synthetic Lg0/r2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/c$c;


# instance fields
.field public final synthetic a:Lg0/v2;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lg0/v2;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/r2;->a:Lg0/v2;

    iput-object p2, p0, Lg0/r2;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ly1/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg0/r2;->a:Lg0/v2;

    iget-object v1, p0, Lg0/r2;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1, p1}, Lg0/v2;->g(Lg0/v2;Ljava/util/concurrent/atomic/AtomicReference;Ly1/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
