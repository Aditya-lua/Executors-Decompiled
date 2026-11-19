.class public final Lgb/b2;
.super Ll9/g;
.source "SourceFile"

# interfaces
.implements Lgb/x1;


# static fields
.field public static final k:Ll9/a$g;

.field public static final l:Ll9/a$a;

.field public static final m:Ll9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ll9/a$g;

    invoke-direct {v0}, Ll9/a$g;-><init>()V

    sput-object v0, Lgb/b2;->k:Ll9/a$g;

    new-instance v1, Lgb/y1;

    invoke-direct {v1}, Lgb/y1;-><init>()V

    sput-object v1, Lgb/b2;->l:Ll9/a$a;

    new-instance v2, Ll9/a;

    const-string v3, "GamesConnect.API"

    invoke-direct {v2, v3, v1, v0}, Ll9/a;-><init>(Ljava/lang/String;Ll9/a$a;Ll9/a$g;)V

    sput-object v2, Lgb/b2;->m:Ll9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lgb/q1;)V
    .locals 2

    sget-object v0, Lgb/b2;->m:Ll9/a;

    sget-object v1, Ll9/g$a;->c:Ll9/g$a;

    invoke-direct {p0, p1, v0, p2, v1}, Ll9/g;-><init>(Landroid/content/Context;Ll9/a;Ll9/a$d;Ll9/g$a;)V

    return-void
.end method


# virtual methods
.method public final q(Lgb/d2;Z)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lgb/a2;

    invoke-direct {v1, p0, p1}, Lgb/a2;-><init>(Lgb/b2;Lgb/d2;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object p1

    const/16 v0, 0x1a51

    invoke-virtual {p1, v0}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lm9/u$a;->c(Z)Lm9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Lm9/u$a;->a()Lm9/u;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Ll9/g;->y(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
