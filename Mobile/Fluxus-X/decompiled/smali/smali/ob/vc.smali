.class public final synthetic Lob/vc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/yc;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lob/hf;

.field public final synthetic d:Lob/ce;


# direct methods
.method public synthetic constructor <init>(Lob/yc;Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Lob/ce;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/vc;->a:Lob/yc;

    iput-object p2, p0, Lob/vc;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lob/vc;->c:Lob/hf;

    iput-object p4, p0, Lob/vc;->d:Lob/ce;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 4

    iget-object v0, p0, Lob/vc;->a:Lob/yc;

    iget-object v1, p0, Lob/vc;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lob/vc;->c:Lob/hf;

    iget-object v3, p0, Lob/vc;->d:Lob/ce;

    invoke-virtual {v0, v1, v2, v3}, Lob/yc;->H(Ljava/util/concurrent/atomic/AtomicReference;Lob/hf;Lob/ce;)V

    return-void
.end method
