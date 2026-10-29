.class public final Lab/b;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Le9/b;


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lab/b;->k:Lk9/a$g;

    new-instance v1, Lab/u;

    invoke-direct {v1}, Lab/u;-><init>()V

    sput-object v1, Lab/b;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "Blockstore.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lab/b;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lab/b;->m:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public final e(Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/auth/blockstore/RetrieveBytesResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "RetrieveBytesRequest cannot be null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->h:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lab/t;

    invoke-direct {v1, p0, p1}, Lab/t;-><init>(Lab/b;Lcom/google/android/gms/auth/blockstore/RetrieveBytesRequest;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x684

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lcom/google/android/gms/auth/blockstore/StoreBytesData;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/blockstore/StoreBytesData;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->d:Lcom/google/android/gms/common/Feature;

    sget-object v2, Lab/c;->f:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1, v2}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lab/r;

    invoke-direct {v1, p0, p1}, Lab/r;-><init>(Lab/b;Lcom/google/android/gms/auth/blockstore/StoreBytesData;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x66d

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "DeleteBytesRequest cannot be null"

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->g:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lab/q;

    invoke-direct {v1, p0, p1}, Lab/q;-><init>(Lab/b;Lcom/google/android/gms/auth/blockstore/DeleteBytesRequest;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x685

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final p()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lab/c;->e:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lab/s;

    invoke-direct {v1, p0}, Lab/s;-><init>(Lab/b;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object v0

    const/16 v1, 0x673

    invoke-virtual {v0, v1}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
