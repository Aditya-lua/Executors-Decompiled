.class public final Ln9/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/i$a;


# instance fields
.field public final synthetic a:Lk9/i;

.field public final synthetic b:Lsb/k;

.field public final synthetic c:Ln9/l$a;

.field public final synthetic d:Ln9/i0;


# direct methods
.method public constructor <init>(Lk9/i;Lsb/k;Ln9/l$a;Ln9/i0;)V
    .locals 0

    iput-object p1, p0, Ln9/g0;->a:Lk9/i;

    iput-object p2, p0, Ln9/g0;->b:Lsb/k;

    iput-object p3, p0, Ln9/g0;->c:Ln9/l$a;

    iput-object p4, p0, Ln9/g0;->d:Ln9/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->A3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ln9/g0;->a:Lk9/i;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lk9/i;->d(JLjava/util/concurrent/TimeUnit;)Lk9/n;

    move-result-object p1

    iget-object v0, p0, Ln9/g0;->b:Lsb/k;

    iget-object v1, p0, Ln9/g0;->c:Ln9/l$a;

    invoke-interface {v1, p1}, Ln9/l$a;->a(Lk9/n;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Ln9/g0;->b:Lsb/k;

    invoke-static {p1}, Ln9/a;->a(Lcom/google/android/gms/common/api/Status;)Lk9/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
