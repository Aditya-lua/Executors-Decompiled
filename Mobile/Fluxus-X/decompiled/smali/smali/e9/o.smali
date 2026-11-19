.class public final Le9/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GoogleSignInCommon"

    invoke-direct {v0, v2, v1}, Lr9/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Le9/o;->a:Lr9/a;

    return-void
.end method

.method public static a(Ll9/h;Landroid/content/Context;Z)Ll9/k;
    .locals 3

    sget-object v0, Le9/o;->a:Lr9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Revoking access"

    invoke-virtual {v0, v2, v1}, Lr9/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Le9/c;->b(Landroid/content/Context;)Le9/c;

    move-result-object v0

    invoke-virtual {v0}, Le9/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Le9/o;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    invoke-static {v0}, Le9/f;->a(Ljava/lang/String;)Ll9/k;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Le9/m;

    invoke-direct {p1, p0}, Le9/m;-><init>(Ll9/h;)V

    invoke-virtual {p0, p1}, Ll9/h;->a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ll9/h;Landroid/content/Context;Z)Ll9/k;
    .locals 3

    sget-object v0, Le9/o;->a:Lr9/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Signing out"

    invoke-virtual {v0, v2, v1}, Lr9/a;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Le9/o;->c(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->k:Lcom/google/android/gms/common/api/Status;

    invoke-static {p1, p0}, Ll9/l;->b(Lcom/google/android/gms/common/api/Status;Ll9/h;)Ll9/k;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Le9/k;

    invoke-direct {p1, p0}, Le9/k;-><init>(Ll9/h;)V

    invoke-virtual {p0, p1}, Ll9/h;->a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Le9/p;->a(Landroid/content/Context;)Le9/p;

    move-result-object p0

    invoke-virtual {p0}, Le9/p;->b()V

    invoke-static {}, Ll9/h;->b()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll9/h;

    invoke-virtual {v0}, Ll9/h;->e()V

    goto :goto_0

    :cond_0
    invoke-static {}, Lm9/f;->a()V

    return-void
.end method
