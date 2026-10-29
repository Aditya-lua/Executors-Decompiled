.class public final Lp9/d;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Ln9/q;


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lp9/d;->k:Lk9/a$g;

    new-instance v1, Lp9/c;

    invoke-direct {v1}, Lp9/c;-><init>()V

    sput-object v1, Lp9/d;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lp9/d;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ln9/r;)V
    .locals 2

    sget-object v0, Lp9/d;->m:Lk9/a;

    sget-object v1, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/TelemetryData;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    sget-object v1, Lbb/f;->a:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll9/u$a;->c(Z)Ll9/u$a;

    new-instance v1, Lp9/b;

    invoke-direct {v1, p1}, Lp9/b;-><init>(Lcom/google/android/gms/common/internal/TelemetryData;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Lk9/e;->y(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
