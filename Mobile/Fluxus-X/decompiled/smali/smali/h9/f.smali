.class public final Lh9/f;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Lg9/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/g<",
        "Ll9/a$d$c;",
        ">;",
        "Lg9/j;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00122\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lh9/f;",
        "Ll9/g;",
        "Ll9/a$d$c;",
        "Lg9/j;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lg9/a;",
        "request",
        "Lcom/google/android/gms/tasks/Task;",
        "Lg9/c;",
        "m",
        "(Lg9/a;)Lcom/google/android/gms/tasks/Task;",
        "Lg9/e;",
        "Lg9/g;",
        "c",
        "(Lg9/e;)Lcom/google/android/gms/tasks/Task;",
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
.field public static final k:Lh9/f$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final l:Ll9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a$g<",
            "Lh9/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Lh9/f$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final n:Ll9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a<",
            "Ll9/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh9/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh9/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh9/f;->k:Lh9/f$b;

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lh9/f;->l:Ll9/a$g;

    new-instance v1, Lh9/f$a;

    invoke-direct {v1}, Lh9/f$a;-><init>()V

    sput-object v1, Lh9/f;->m:Lh9/f$a;

    new-instance v2, Ll9/a;

    const-string v3, "RestoreCredential.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lh9/f;->n:Ll9/a;

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

    sget-object v0, Lh9/f;->n:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    sget-object v2, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method

.method public static synthetic P(Lg9/e;Lh9/g;Ltb/k;)V
    .locals 0
    .param p0    # Lg9/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lh9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lh9/f;->S(Lg9/e;Lh9/g;Ltb/k;)V

    return-void
.end method

.method public static synthetic Q(Lg9/a;Lh9/g;Ltb/k;)V
    .locals 0
    .param p0    # Lg9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lh9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltb/k;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lh9/f;->R(Lg9/a;Lh9/g;Ltb/k;)V

    return-void
.end method

.method public static final R(Lg9/a;Lh9/g;Ltb/k;)V
    .locals 1

    const-string v0, "$request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh9/f$c;

    invoke-direct {v0, p2}, Lh9/f$c;-><init>(Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lh9/c;

    invoke-interface {p1, p0, v0}, Lh9/c;->h0(Lg9/a;Lh9/a;)V

    return-void
.end method

.method public static final S(Lg9/e;Lh9/g;Ltb/k;)V
    .locals 1

    const-string v0, "$request"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh9/f$d;

    invoke-direct {v0, p2}, Lh9/f$d;-><init>(Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lh9/c;

    invoke-interface {p1, p0, v0}, Lh9/c;->r(Lg9/e;Lh9/b;)V

    return-void
.end method


# virtual methods
.method public c(Lg9/e;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lg9/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lg9/g;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->k:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lh9/e;

    invoke-direct {v1, p1}, Lh9/e;-><init>(Lg9/e;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x69f

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "doRead(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public m(Lg9/a;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lg9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg9/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lg9/c;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->j:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lh9/d;

    invoke-direct {v1, p1}, Lh9/d;-><init>(Lg9/a;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x69d

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v0, "doRead(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
