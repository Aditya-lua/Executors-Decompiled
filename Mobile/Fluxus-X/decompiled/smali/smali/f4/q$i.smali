.class public Lf4/q$i;
.super Lf4/q$l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf4/q;->F1(Lh/a;Lt/a;Lg/b;)Lg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lt/a;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lh/a;

.field public final synthetic d:Lg/b;

.field public final synthetic e:Lf4/q;


# direct methods
.method public constructor <init>(Lf4/q;Lt/a;Ljava/util/concurrent/atomic/AtomicReference;Lh/a;Lg/b;)V
    .locals 0

    iput-object p1, p0, Lf4/q$i;->e:Lf4/q;

    iput-object p2, p0, Lf4/q$i;->a:Lt/a;

    iput-object p3, p0, Lf4/q$i;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lf4/q$i;->c:Lh/a;

    iput-object p5, p0, Lf4/q$i;->d:Lg/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lf4/q$l;-><init>(Lf4/q$b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lf4/q$i;->e:Lf4/q;

    invoke-virtual {v0}, Lf4/q;->o()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lf4/q$i;->a:Lt/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lt/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/g;

    iget-object v2, p0, Lf4/q$i;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lf4/q$i;->e:Lf4/q;

    iget-object v4, p0, Lf4/q$i;->c:Lh/a;

    iget-object v5, p0, Lf4/q$i;->d:Lg/b;

    invoke-virtual {v1, v0, v3, v4, v5}, Lg/g;->n(Ljava/lang/String;Landroidx/lifecycle/s;Lh/a;Lg/b;)Lg/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
