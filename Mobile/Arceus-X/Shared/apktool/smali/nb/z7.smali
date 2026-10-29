.class public final Lnb/z7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic b:Landroid/os/Bundle;

.field public final synthetic c:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lnb/z7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p3, p0, Lnb/z7;->b:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/z7;->c:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lnb/z7;->c:Lnb/i8;

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v1

    invoke-virtual {v1}, Lnb/me;->E()V

    invoke-virtual {v0}, Lnb/i8;->z2()Lnb/me;

    move-result-object v0

    iget-object v1, p0, Lnb/z7;->a:Lcom/google/android/gms/measurement/internal/zzr;

    iget-object v2, p0, Lnb/z7;->b:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2}, Lnb/me;->q0(Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
