.class public final synthetic Lg9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public synthetic a:Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/d;->a:Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lg9/d;->a:Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;

    check-cast p1, Lg9/g;

    check-cast p2, Lsb/k;

    invoke-static {v0, p1, p2}, Lg9/f;->Q(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;Lg9/g;Lsb/k;)V

    return-void
.end method
