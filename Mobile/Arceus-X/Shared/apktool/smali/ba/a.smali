.class public Lba/a;
.super Lk9/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk9/e<",
        "Lk9/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lba/a;->k:Lk9/a$g;

    new-instance v1, Lk9/a;

    new-instance v2, Leb/s4;

    invoke-direct {v2}, Leb/s4;-><init>()V

    const-string v3, "Fido.FIDO2_API"

    invoke-direct {v1, v3, v2, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v1, Lba/a;->l:Lk9/a;

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

    sget-object v0, Lba/a;->l:Lk9/a;

    sget-object v1, Lk9/a$d;->Jo:Lk9/a$d$c;

    new-instance v2, Ll9/a;

    invoke-direct {v2}, Ll9/a;-><init>()V

    invoke-direct {p0, p1, v0, v1, v2}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Ll9/s;)V

    return-void
.end method


# virtual methods
.method public P(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .param p1    # Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Landroid/app/PendingIntent;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    new-instance v1, Lba/b;

    invoke-direct {v1, p0, p1}, Lba/b;-><init>(Lba/a;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x151f

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->z(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
