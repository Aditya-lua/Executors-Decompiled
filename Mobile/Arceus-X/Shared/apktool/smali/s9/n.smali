.class public final synthetic Ls9/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Ls9/u;

.field public final synthetic b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;


# direct methods
.method public synthetic constructor <init>(Ls9/u;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls9/n;->a:Ls9/u;

    iput-object p2, p0, Ls9/n;->b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ls9/v;

    check-cast p2, Lsb/k;

    new-instance v0, Ls9/q;

    iget-object v1, p0, Ls9/n;->a:Ls9/u;

    invoke-direct {v0, v1, p2}, Ls9/q;-><init>(Ls9/u;Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Ls9/h;

    iget-object p2, p0, Ls9/n;->b:Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;

    invoke-virtual {p1, v0, p2}, Ls9/h;->u2(Ls9/g;Lcom/google/android/gms/common/moduleinstall/internal/ApiFeatureRequest;)V

    return-void
.end method
