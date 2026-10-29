.class public final Ld9/l;
.super Ld9/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lk9/f;)V
    .locals 0

    invoke-direct {p0, p1}, Ld9/m;-><init>(Lk9/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic e(Lcom/google/android/gms/common/api/Status;)Lk9/n;
    .locals 0

    return-object p1
.end method

.method public final bridge synthetic n(Lk9/a$b;)V
    .locals 2

    check-cast p1, Ld9/h;

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Ld9/t;

    new-instance v1, Ld9/k;

    invoke-direct {v1, p0}, Ld9/k;-><init>(Ld9/l;)V

    invoke-virtual {p1}, Ld9/h;->g()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ld9/t;->t2(Ld9/s;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
