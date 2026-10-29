.class public final Ld9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, Lq9/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Ld9/n;->a:Lq9/a;

    return-void
.end method

.method public static a(Lk9/f;Landroid/content/Context;Z)Lk9/i;
    .locals 3

    sget-object v0, Ld9/n;->a:Lq9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Revoking access"

    invoke-virtual {v0, v2, v1}, Lq9/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Ld9/b;->b(Landroid/content/Context;)Ld9/b;

    move-result-object v0

    invoke-virtual {v0}, Ld9/b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ld9/n;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    invoke-static {v0}, Ld9/e;->a(Ljava/lang/String;)Lk9/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ld9/l;

    invoke-direct {p1, p0}, Ld9/l;-><init>(Lk9/f;)V

    invoke-virtual {p0, p1}, Lk9/f;->a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lk9/f;Landroid/content/Context;Z)Lk9/i;
    .locals 3

    sget-object v0, Ld9/n;->a:Lq9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Signing out"

    invoke-virtual {v0, v2, v1}, Lq9/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Ld9/n;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->k:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, p0}, Lk9/j;->b(Lcom/google/android/gms/common/api/Status;Lk9/f;)Lk9/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ld9/j;

    invoke-direct {p1, p0}, Ld9/j;-><init>(Lk9/f;)V

    invoke-virtual {p0, p1}, Lk9/f;->a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Ld9/o;->a(Landroid/content/Context;)Ld9/o;

    move-result-object p0

    invoke-virtual {p0}, Ld9/o;->b()V

    invoke-static {}, Lk9/f;->b()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/f;

    invoke-virtual {v0}, Lk9/f;->e()V

    goto :goto_0

    :cond_0
    invoke-static {}, Ll9/f;->a()V

    return-void
.end method
