.class public final synthetic Lf7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/l0;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/n;->a:Ljava/lang/String;

    iput-object p2, p0, Lf7/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lf7/n;->a:Ljava/lang/String;

    iget-object v1, p0, Lf7/n;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    check-cast p1, Lf7/i;

    invoke-static {v0, v1, p1}, Lf7/q;->g(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Lf7/i;)V

    return-void
.end method
