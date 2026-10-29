.class public final Lwa/p;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Lx8/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/e<",
        "Lk9/a$d$c;",
        ">;",
        "Lx8/b;"
    }
.end annotation


# static fields
.field public static final m:Lk9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a$g<",
            "Lwa/d;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lk9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a$a<",
            "Lwa/d;",
            "Lk9/a$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Lk9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk9/a<",
            "Lk9/a$d$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Landroid/content/Context;

.field public final l:Lj9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lwa/p;->m:Lk9/a$g;

    new-instance v1, Lwa/n;

    invoke-direct {v1}, Lwa/n;-><init>()V

    sput-object v1, Lwa/p;->n:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "AppSet.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lwa/p;->o:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lj9/d;)V
    .locals 3

    sget-object v0, Lwa/p;->o:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    sget-object v2, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    iput-object p1, p0, Lwa/p;->k:Landroid/content/Context;

    iput-object p2, p0, Lwa/p;->l:Lj9/d;

    return-void
.end method


# virtual methods
.method public final j()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lx8/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwa/p;->l:Lj9/d;

    iget-object v1, p0, Lwa/p;->k:Landroid/content/Context;

    const v2, 0xcaf1200

    invoke-virtual {v0, v1, v2}, Lj9/d;->h(Landroid/content/Context;I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lx8/f;->a:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    new-instance v1, Lwa/m;

    invoke-direct {v1, p0}, Lwa/m;-><init>(Lwa/p;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object v0

    const/16 v1, 0x6bd1

    invoke-virtual {v0, v1}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lk9/b;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v0, v1}, Lk9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
