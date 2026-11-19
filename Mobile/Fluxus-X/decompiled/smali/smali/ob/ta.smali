.class public final synthetic Lob/ta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Lob/va;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/ta;->a:Lob/va;

    iput-object p2, p0, Lob/ta;->b:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 3

    iget-object v0, p0, Lob/ta;->a:Lob/va;

    iget-object v0, v0, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->J()Lob/yc;

    move-result-object v0

    sget-object v1, Lob/eb;->e:Lob/eb;

    filled-new-array {v1}, [Lob/eb;

    move-result-object v1

    invoke-static {v1}, Lob/ce;->a([Lob/eb;)Lob/ce;

    move-result-object v1

    iget-object v2, p0, Lob/ta;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v2, v1}, Lob/yc;->j0(Ljava/util/concurrent/atomic/AtomicReference;Lob/ce;)V

    return-void
.end method
