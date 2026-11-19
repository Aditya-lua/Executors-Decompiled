.class public final Lbb/b;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Lf9/b;


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a$a;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lbb/b;->k:Ll9/a$g;

    new-instance v1, Lbb/u;

    invoke-direct {v1}, Lbb/u;-><init>()V

    sput-object v1, Lbb/b;->l:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "Blockstore.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lbb/b;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lbb/b;->m:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    sget-object v2, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lf9/c;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/c;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "DeleteBytesRequest cannot be null"

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->g:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lbb/q;

    invoke-direct {v1, p0, p1}, Lbb/q;-><init>(Lbb/b;Lf9/c;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x685

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final n(Lf9/f;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/f;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->d:Lk9/d;

    sget-object v2, Lbb/c;->f:Lk9/d;

    filled-new-array {v1, v2}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lbb/r;

    invoke-direct {v1, p0, p1}, Lbb/r;-><init>(Lbb/b;Lf9/f;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x66d

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final r()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->e:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lbb/s;

    invoke-direct {v1, p0}, Lbb/s;-><init>(Lbb/b;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x673

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final t(Lf9/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lf9/e;",
            ">;"
        }
    .end annotation

    const-string v0, "RetrieveBytesRequest cannot be null"

    invoke-static {p1, v0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lbb/c;->h:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lbb/t;

    invoke-direct {v1, p0, p1}, Lbb/t;-><init>(Lbb/b;Lf9/d;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x684

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
