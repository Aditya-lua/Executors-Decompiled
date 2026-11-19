.class public final Lza/o;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements La9/i;


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

    sput-object v0, Lza/o;->l:Ll9/a$g;

    new-instance v1, Lza/j;

    invoke-direct {v1}, Lza/j;-><init>()V

    sput-object v1, Lza/o;->m:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "Auth.Api.Identity.SignIn.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lza/o;->n:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La9/y;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # La9/y;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lza/o;->n:Ll9/a;

    sget-object v1, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, p2, v1}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    invoke-static {}, Lza/r;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lza/o;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic P(La9/d;Lza/p;Ltb/k;)V
    .locals 1

    new-instance v0, Lza/n;

    invoke-direct {v0, p0, p3}, Lza/n;-><init>(Lza/o;Ltb/k;)V

    invoke-virtual {p2}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p2

    check-cast p2, Lza/h0;

    iget-object p3, p0, Lza/o;->k:Ljava/lang/String;

    invoke-virtual {p2, v0, p1, p3}, Lza/h0;->u2(Lza/c0;La9/d;Ljava/lang/String;)V

    return-void
.end method

.method public final synthetic Q(Lza/p;Ltb/k;)V
    .locals 1

    new-instance v0, Lza/l;

    invoke-direct {v0, p0, p2}, Lza/l;-><init>(Lza/o;Ltb/k;)V

    invoke-virtual {p1}, Lo9/d;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lza/h0;

    iget-object p2, p0, Lza/o;->k:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lza/h0;->w2(Lm9/g;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Landroid/content/Intent;)La9/j;
    .locals 2

    if-eqz p1, :cond_3

    const-string v0, "status"

    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v1}, Lp9/d;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "sign_in_credential"

    sget-object v1, La9/j;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v1}, Lp9/d;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object p1

    check-cast p1, La9/j;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_1
    new-instance p1, Ll9/b;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_2
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_3
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public final d(La9/d;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # La9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La9/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lza/q;->h:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lza/f;

    invoke-direct {v1, p0, p1}, Lza/f;-><init>(Lza/o;La9/d;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x675

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(La9/a;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .param p1    # La9/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La9/a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "La9/b;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, La9/a;->H3(La9/a;)La9/a$a;

    move-result-object p1

    iget-object v0, p0, Lza/o;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, La9/a$a;->h(Ljava/lang/String;)La9/a$a;

    invoke-virtual {p1}, La9/a$a;->a()La9/a;

    move-result-object p1

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lk9/d;

    const-string v2, "auth_api_credentials_begin_sign_in"

    const-wide/16 v3, 0x8

    invoke-direct {v1, v2, v3, v4}, Lk9/d;-><init>(Ljava/lang/String;J)V

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lza/h;

    invoke-direct {v1, p0, p1}, Lza/h;-><init>(Lza/o;La9/a;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x611

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final p(Landroid/content/Intent;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_3

    const-string v0, "status"

    sget-object v1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v1}, Lp9/d;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/Status;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->F3()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v0, "phone_number_hint_result"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_1
    new-instance p1, Ll9/b;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_2
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1

    :cond_3
    new-instance p1, Ll9/b;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->m:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p1, v0}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    throw p1
.end method

.method public final s()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Ll9/g;->G()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.google.android.gms.signin"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {}, Ll9/h;->b()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll9/h;

    invoke-virtual {v1}, Ll9/h;->e()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lm9/f;->a()V

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lza/q;->b:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lza/g;

    invoke-direct {v1, p0}, Lza/g;-><init>(Lza/o;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x612

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final u(La9/e;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # La9/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La9/e;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, La9/e;->F3(La9/e;)La9/e$a;

    move-result-object p1

    iget-object v0, p0, Lza/o;->k:Ljava/lang/String;

    invoke-virtual {p1, v0}, La9/e$a;->f(Ljava/lang/String;)La9/e$a;

    invoke-virtual {p1}, La9/e$a;->a()La9/e;

    move-result-object p1

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lza/q;->f:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lza/i;

    invoke-direct {v1, p0, p1}, Lza/i;-><init>(Lza/o;La9/e;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x613

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
