.class public final Lfb/a2;
.super Lk9/e;
.source "SourceFile"

# interfaces
.implements Lfb/w1;


# static fields
.field public static final k:Lk9/a$g;

.field public static final l:Lk9/a$a;

.field public static final m:Lk9/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk9/a$g;

    invoke-direct {v0}, Lk9/a$g;-><init>()V

    sput-object v0, Lfb/a2;->k:Lk9/a$g;

    new-instance v1, Lfb/x1;

    invoke-direct {v1}, Lfb/x1;-><init>()V

    sput-object v1, Lfb/a2;->l:Lk9/a$a;

    new-instance v2, Lk9/a;

    const-string v3, "GamesConnect.API"

    invoke-direct {v2, v3, v1, v0}, Lk9/a;-><init>(Ljava/lang/String;Lk9/a$a;Lk9/a$g;)V

    sput-object v2, Lfb/a2;->m:Lk9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfb/p1;)V
    .locals 2

    sget-object v0, Lfb/a2;->m:Lk9/a;

    sget-object v1, Lk9/e$a;->c:Lk9/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lk9/e;-><init>(Landroid/content/Context;Lk9/a;Lk9/a$d;Lk9/e$a;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/google/android/gms/internal/games_v2/zzq;Z)Lcom/google/android/gms/tasks/Task;
    .locals 2

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    new-instance v1, Lfb/z1;

    invoke-direct {v1, p0, p1}, Lfb/z1;-><init>(Lfb/a2;Lcom/google/android/gms/internal/games_v2/zzq;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object p1

    const/16 v0, 0x1a51

    invoke-virtual {p1, v0}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll9/u$a;->c(Z)Ll9/u$a;

    move-result-object p1

    invoke-virtual {p1}, Ll9/u$a;->a()Ll9/u;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lk9/e;->y(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
