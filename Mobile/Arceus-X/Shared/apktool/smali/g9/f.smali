.class public final Lg9/f;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Lf9/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/e<",
        "Lk9/a$d$c;",
        ">;",
        "Lf9/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lg9/f;",
        "Lk9/e;",
        "Lk9/a$d$c;",
        "Lf9/f;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;",
        "request",
        "Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;",
        "v",
        "(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;",
        "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;",
        "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;",
        "g",
        "(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;",
        "k",
        "b",
        "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final k:Lg9/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:Lk9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a$g<",
            "Lg9/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Lg9/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final n:Lk9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a<",
            "Lk9/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lg9/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg9/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg9/f;->k:Lg9/f$b;

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lg9/f;->l:Lk9/a$g;

    new-instance v1, Lg9/f$a;

    invoke-direct {v1}, Lg9/f$a;-><init>()V

    sput-object v1, Lg9/f;->m:Lg9/f$a;

    new-instance v2, Lk9/a;

    const-string v3, "RestoreCredential.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lg9/f;->n:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lg9/f;->n:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method

.method public static synthetic P(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;Lg9/g;Lsb/k;)V
    .locals 0
    .param p0    # Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lg9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lg9/f;->S(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;Lg9/g;Lsb/k;)V

    return-void
.end method

.method public static synthetic Q(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;Lg9/g;Lsb/k;)V
    .locals 0
    .param p0    # Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lg9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lsb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lg9/f;->R(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;Lg9/g;Lsb/k;)V

    return-void
.end method

.method public static final R(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;Lg9/g;Lsb/k;)V
    .locals 1

    const-string v0, "$request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg9/f$c;

    invoke-direct {v0, p2}, Lg9/f$c;-><init>(Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lg9/c;

    invoke-interface {p1, p0, v0}, Lg9/c;->y(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;Lg9/a;)V

    return-void
.end method

.method public static final S(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;Lg9/g;Lsb/k;)V
    .locals 1

    const-string v0, "$request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg9/f$d;

    invoke-direct {v0, p2}, Lg9/f$d;-><init>(Lsb/k;)V

    invoke-virtual {p1}, Ln9/c;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lg9/c;

    invoke-interface {p1, p0, v0}, Lg9/c;->H0(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;Lg9/b;)V

    return-void
.end method


# virtual methods
.method public g(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->k:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lg9/e;

    invoke-direct {v1, p1}, Lg9/e;-><init>(Lcom/google/android/gms/auth/blockstore/restorecredential/GetRestoreCredentialRequest;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x69f

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "doRead(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public v(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->j:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lg9/d;

    invoke-direct {v1, p1}, Lg9/d;-><init>(Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialRequest;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x69d

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "doRead(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
