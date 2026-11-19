.class public Lca/a;
.super Ll9/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll9/g<",
        "Ll9/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lca/a;->k:Ll9/a$g;

    new-instance v1, Ll9/a;

    new-instance v2, Lfb/s4;

    invoke-direct {v2}, Lfb/s4;-><init>()V

    const-string v3, "Fido.FIDO2_API"

    invoke-direct {v1, v3, v2, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v1, Lca/a;->l:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lca/a;->l:Ll9/a;

    sget-object v1, Ll9/a$d;->Oo:Ll9/a$d$c;

    new-instance v2, Lm9/a;

    invoke-direct {v2}, Lm9/a;-><init>()V

    invoke-direct {p0, p1, v0, v1, v2}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Lm9/s;)V

    return-void
.end method


# virtual methods
.method public P(Lda/r;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lda/r;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/r;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lca/b;

    invoke-direct {v1, p0, p1}, Lca/b;-><init>(Lca/a;Lda/r;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x151f

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->z(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
