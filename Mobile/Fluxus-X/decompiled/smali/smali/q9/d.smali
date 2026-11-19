.class public final Lq9/d;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Lo9/y;


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a$a;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lq9/d;->k:Ll9/a$g;

    new-instance v1, Lq9/c;

    invoke-direct {v1}, Lq9/c;-><init>()V

    sput-object v1, Lq9/d;->l:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lq9/d;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo9/z;)V
    .locals 2

    sget-object v0, Lq9/d;->m:Ll9/a;

    sget-object v1, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, p2, v1}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method


# virtual methods
.method public final g(Lo9/w;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo9/w;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    sget-object v1, Lcb/f;->a:Lk9/d;

    filled-new-array {v1}, [Lk9/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm9/u$a;->d([Lk9/d;)Lm9/u$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lm9/u$a;->c(Z)Lm9/u$a;

    new-instance v1, Lq9/b;

    invoke-direct {v1, p1}, Lq9/b;-><init>(Lo9/w;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll9/g;->y(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
