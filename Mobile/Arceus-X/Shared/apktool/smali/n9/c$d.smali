.class public Ln9/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Ln9/c;


# direct methods
.method public constructor <init>(Ln9/c;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/c$d;->a:Ln9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ln9/c$d;->a:Ln9/c;

    invoke-virtual {p1}, Ln9/c;->getScopes()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ln9/c;->getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Ln9/c$d;->a:Ln9/c;

    invoke-virtual {v0}, Ln9/c;->zzl()Ln9/c$b;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ln9/c;->zzl()Ln9/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Ln9/c$b;->onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V

    :cond_1
    return-void
.end method
