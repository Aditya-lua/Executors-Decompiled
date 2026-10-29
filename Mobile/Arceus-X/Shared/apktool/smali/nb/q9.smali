.class public final Lnb/q9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    iput-object p2, p0, Lnb/q9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lnb/q9;->b:Ljava/lang/String;

    iput-object p5, p0, Lnb/q9;->c:Ljava/lang/String;

    iput-boolean p6, p0, Lnb/q9;->d:Z

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/q9;->e:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v3, p0, Lnb/q9;->b:Ljava/lang/String;

    iget-object v4, p0, Lnb/q9;->c:Ljava/lang/String;

    iget-boolean v5, p0, Lnb/q9;->d:Z

    iget-object v0, p0, Lnb/q9;->e:Lnb/qa;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    iget-object v1, p0, Lnb/q9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Lnb/tc;->g0(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
