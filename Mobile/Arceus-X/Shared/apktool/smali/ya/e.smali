.class public final Lya/e;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Lz8/a;


# static fields
.field public static final l:Lk9/a$g;

.field public static final m:Lk9/a$a;

.field public static final n:Lk9/a;


# instance fields
.field public final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lya/e;->l:Lk9/a$g;

    new-instance v1, Lya/c;

    invoke-direct {v1}, Lya/c;-><init>()V

    sput-object v1, Lya/e;->m:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lya/e;->n:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lz8/e;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lz8/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lya/e;->n:Lk9/a;

    sget-object v1, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    invoke-static {}, Lya/r;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lya/e;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final m(Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/api/identity/SavePasswordResult;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;->x3(Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;

    move-result-object p1

    iget-object v0, p0, Lya/e;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;->c(Ljava/lang/String;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/identity/SavePasswordRequest$a;->a()Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;

    move-result-object p1

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lya/q;->e:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lya/b;

    invoke-direct {v1, p0, p1}, Lya/b;-><init>(Lya/e;Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x600

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
