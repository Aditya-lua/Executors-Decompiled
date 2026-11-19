.class public final Lxa/p;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Ly8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/g<",
        "Ll9/a$d$c;",
        ">;",
        "Ly8/b;"
    }
.end annotation


# static fields
.field public static final m:Ll9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a$g<",
            "Lxa/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Ll9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a$a<",
            "Lxa/d;",
            "Ll9/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Ll9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll9/a<",
            "Ll9/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Landroid/content/Context;

.field public final l:Lk9/f;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lxa/p;->m:Ll9/a$g;

    new-instance v1, Lxa/n;

    invoke-direct {v1}, Lxa/n;-><init>()V

    sput-object v1, Lxa/p;->n:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "AppSet.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lxa/p;->o:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lk9/f;)V
    .locals 3

    sget-object v0, Lxa/p;->o:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    sget-object v2, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    iput-object p1, p0, Lxa/p;->k:Landroid/content/Context;

    iput-object p2, p0, Lxa/p;->l:Lk9/f;

    return-void
.end method


# virtual methods
.method public final j()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ly8/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lxa/p;->l:Lk9/f;

    iget-object v1, p0, Lxa/p;->k:Landroid/content/Context;

    const v2, 0xcaf1200

    invoke-virtual {v0, v1, v2}, Lk9/f;->h(Landroid/content/Context;I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Ly8/h;->a:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    move-result-object v0

    new-instance v1, Lxa/m;

    invoke-direct {v1, p0}, Lxa/m;-><init>(Lxa/p;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x6bd1

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ll9/b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v0, v1}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {v0}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
