.class public final synthetic Lya/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lya/o;

.field public final synthetic b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;


# direct methods
.method public synthetic constructor <init>(Lya/o;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/i;->a:Lya/o;

    iput-object p2, p0, Lya/i;->b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lya/p;

    check-cast p2, Lsb/k;

    new-instance v0, Lya/m;

    iget-object v1, p0, Lya/i;->a:Lya/o;

    invoke-direct {v0, v1, p2}, Lya/m;-><init>(Lya/o;Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lya/h0;

    iget-object p2, p0, Lya/i;->b:Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;

    invoke-virtual {p1, v0, p2}, Lya/h0;->v2(Lya/e0;Lcom/google/android/gms/auth/api/identity/GetSignInIntentRequest;)V

    return-void
.end method
