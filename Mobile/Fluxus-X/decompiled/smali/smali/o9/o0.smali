.class public final Lo9/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/k$a;


# instance fields
.field public final synthetic a:Ll9/k;

.field public final synthetic b:Ltb/k;

.field public final synthetic c:Lo9/r$a;

.field public final synthetic d:Lo9/q0;


# direct methods
.method public constructor <init>(Ll9/k;Ltb/k;Lo9/r$a;Lo9/q0;)V
    .locals 0

    iput-object p1, p0, Lo9/o0;->a:Ll9/k;

    iput-object p2, p0, Lo9/o0;->b:Ltb/k;

    iput-object p3, p0, Lo9/o0;->c:Lo9/r$a;

    iput-object p4, p0, Lo9/o0;->d:Lo9/q0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lo9/o0;->a:Ll9/k;

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ll9/k;->d(JLjava/util/concurrent/TimeUnit;)Ll9/p;

    move-result-object p1

    iget-object v0, p0, Lo9/o0;->b:Ltb/k;

    iget-object v1, p0, Lo9/o0;->c:Lo9/r$a;

    invoke-interface {v1, p1}, Lo9/r$a;->a(Ll9/p;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lo9/o0;->b:Ltb/k;

    invoke-static {p1}, Lo9/b;->a(Lcom/google/android/gms/common/api/Status;)Ll9/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void
.end method
