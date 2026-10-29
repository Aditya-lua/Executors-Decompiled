.class public Lc9/b;
.super Lk9/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/e<",
        "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
        ">;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final k:Lc9/j;

.field public static l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc9/j;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc9/j;-><init>(Lc9/i;)V

    sput-object v0, Lc9/b;->k:Lc9/j;

    const/4 v0, 0x1

    sput v0, Lc9/b;->l:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Ly8/a;->b:Lk9/a;

    new-instance v1, Lk9/e$a$a;

    invoke-direct {v1}, Lk9/e$a$a;-><init>()V

    new-instance v2, Ll9/a;

    invoke-direct {v2}, Ll9/a;-><init>()V

    invoke-virtual {v1, v2}, Lk9/e$a$a;->b(Ll9/s;)Lk9/e$a$a;

    move-result-object v1

    invoke-virtual {v1}, Lk9/e$a$a;->a()Lk9/e$a;

    move-result-object v1

    invoke-direct {p0, p1, v0, p2, v1}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public P()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lk9/e;->w()Lk9/f;

    move-result-object v0

    invoke-virtual {p0}, Lk9/e;->G()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lc9/b;->Q()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Ld9/n;->a(Lk9/f;Landroid/content/Context;Z)Lk9/i;

    move-result-object v0

    invoke-static {v0}, Ln9/l;->b(Lk9/i;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized Q()I
    .locals 4

    monitor-enter p0

    :try_start_0
    sget v0, Lc9/b;->l:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lk9/e;->G()Landroid/content/Context;

    move-result-object v0

    invoke-static {}, Lj9/c;->o()Lj9/c;

    move-result-object v1

    const v2, 0xbdfcb8

    invoke-virtual {v1, v0, v2}, Lj9/c;->h(Landroid/content/Context;I)I

    move-result v2

    if-nez v2, :cond_0

    const/4 v0, 0x4

    sput v0, Lc9/b;->l:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lj9/c;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "com.google.android.gms.auth.api.fallback"

    invoke-static {v0, v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x3

    sput v0, Lc9/b;->l:I

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    sput v0, Lc9/b;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public r()Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lk9/e;->w()Lk9/f;

    move-result-object v0

    invoke-virtual {p0}, Lk9/e;->G()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lc9/b;->Q()I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v0, v1, v2}, Ld9/n;->b(Lk9/f;Landroid/content/Context;Z)Lk9/i;

    move-result-object v0

    invoke-static {v0}, Ln9/l;->b(Lk9/i;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
