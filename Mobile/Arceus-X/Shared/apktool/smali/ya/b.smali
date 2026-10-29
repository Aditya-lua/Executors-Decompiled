.class public final synthetic Lya/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lya/e;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;


# direct methods
.method public synthetic constructor <init>(Lya/e;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/b;->a:Lya/e;

    iput-object p2, p0, Lya/b;->b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lya/x;

    check-cast p2, Lsb/k;

    new-instance v0, Lya/d;

    iget-object v1, p0, Lya/b;->a:Lya/e;

    invoke-direct {v0, v1, p2}, Lya/d;-><init>(Lya/e;Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lya/a0;

    iget-object p2, p0, Lya/b;->b:Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    invoke-virtual {p1, v0, p2}, Lya/a0;->t2(Lya/g0;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V

    return-void
.end method
