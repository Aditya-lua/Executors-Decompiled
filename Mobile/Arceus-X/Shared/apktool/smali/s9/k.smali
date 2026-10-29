.class public final synthetic Ls9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Ls9/u;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Lr9/a;

.field public final synthetic d:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

.field public final synthetic e:Ls9/c;


# direct methods
.method public synthetic constructor <init>(Ls9/u;Ljava/util/concurrent/atomic/AtomicReference;Lr9/a;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;Ls9/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/k;->a:Ls9/u;

    iput-object p2, p0, Ls9/k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Ls9/k;->c:Lr9/a;

    iput-object p4, p0, Ls9/k;->d:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    iput-object p5, p0, Ls9/k;->e:Ls9/c;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Ls9/v;

    check-cast p2, Lsb/k;

    new-instance v0, Ls9/s;

    iget-object v1, p0, Ls9/k;->a:Ls9/u;

    iget-object v2, p0, Ls9/k;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Ls9/k;->c:Lr9/a;

    invoke-direct {v0, v1, v2, p2, v3}, Ls9/s;-><init>(Ls9/u;Ljava/util/concurrent/atomic/AtomicReference;Lsb/k;Lr9/a;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Ls9/h;

    iget-object p2, p0, Ls9/k;->d:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    iget-object v1, p0, Ls9/k;->e:Ls9/c;

    invoke-virtual {p1, v0, p2, v1}, Ls9/h;->v2(Ls9/g;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;Ls9/j;)V

    return-void
.end method
