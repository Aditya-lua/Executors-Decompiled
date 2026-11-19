.class public final Le9/k;
.super Le9/n;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ll9/h;)V
    .locals 0

    invoke-direct {p0, p1}, Le9/n;-><init>(Ll9/h;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic e(Lcom/google/android/gms/common/api/Status;)Ll9/p;
    .locals 0

    return-object p1
.end method

.method public final bridge synthetic n(Ll9/a$b;)V
    .locals 2

    check-cast p1, Le9/i;

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Le9/u;

    new-instance v1, Le9/j;

    invoke-direct {v1, p0}, Le9/j;-><init>(Le9/k;)V

    invoke-virtual {p1}, Le9/i;->g()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Le9/u;->u2(Le9/t;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    return-void
.end method
