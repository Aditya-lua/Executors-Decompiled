.class public final synthetic Lf1/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic b:Ln0/o3$b;

.field public final synthetic c:Ln0/u;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ln0/o3$b;Ln0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/n1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lf1/n1;->b:Ln0/o3$b;

    iput-object p3, p0, Lf1/n1;->c:Ln0/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf1/n1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Lf1/n1;->b:Ln0/o3$b;

    iget-object v2, p0, Lf1/n1;->c:Ln0/u;

    invoke-static {v0, v1, v2}, Lf1/p1;->l0(Ljava/util/concurrent/atomic/AtomicBoolean;Ln0/o3$b;Ln0/u;)V

    return-void
.end method
