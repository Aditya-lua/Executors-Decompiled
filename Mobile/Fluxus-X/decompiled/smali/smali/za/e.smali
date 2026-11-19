.class public final Lza/e;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements La9/c;


# static fields
.field public static final l:Ll9/a$g;

.field public static final m:Ll9/a$a;

.field public static final n:Ll9/a;


# instance fields
.field public final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lza/e;->l:Ll9/a$g;

    new-instance v1, Lza/c;

    invoke-direct {v1}, Lza/c;-><init>()V

    sput-object v1, Lza/e;->m:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "Auth.Api.Identity.CredentialSaving.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lza/e;->n:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La9/n;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # La9/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lza/e;->n:Ll9/a;

    sget-object v1, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, p2, v1}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    invoke-static {}, Lza/r;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lza/e;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final l(La9/g;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # La9/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La9/g;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "La9/h;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, La9/g;->C3(La9/g;)La9/g$a;

    move-result-object p1

    iget-object v0, p0, Lza/e;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, La9/g$a;->c(Ljava/lang/String;)La9/g$a;

    invoke-virtual {p1}, La9/g$a;->a()La9/g;

    move-result-object p1

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lza/q;->e:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lza/b;

    invoke-direct {v1, p0, p1}, Lza/b;-><init>(Lza/e;La9/g;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x600

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
