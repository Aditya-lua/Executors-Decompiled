.class public final Lpd/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lib/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lib/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lib/d;

    const-string v1, "AgeSignalsService"

    invoke-direct {v0, v1}, Lib/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lpd/l;->c:Lib/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpd/l;->a:Landroid/content/Context;

    invoke-static {p1}, Lib/r;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lib/o;

    sget-object v3, Lpd/l;->c:Lib/d;

    sget-object v5, Lpd/f;->a:Landroid/content/Intent;

    new-instance v6, Lpd/i;

    invoke-direct {v6}, Lpd/i;-><init>()V

    const-string v4, "AgeSignalsService"

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lib/o;-><init>(Landroid/content/Context;Lib/d;Ljava/lang/String;Landroid/content/Intent;Lpd/i;Lib/j;)V

    iput-object v1, p0, Lpd/l;->b:Lib/o;

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lpd/l;->b:Lib/o;

    return-void
.end method

.method public static bridge synthetic a(Lpd/l;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lpd/l;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic c()Lib/d;
    .locals 1

    sget-object v0, Lpd/l;->c:Lib/d;

    return-object v0
.end method

.method public static d(I)Lcom/google/android/gms/tasks/Task;
    .locals 3

    sget-object v0, Lpd/l;->c:Lib/d;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, Lib/d;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lpd/a;

    invoke-direct {v0, p0}, Lpd/a;-><init>(I)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lpd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lpd/l;->b:Lib/o;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lpd/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lib/r;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x4e904e0

    if-ge v1, v2, :cond_0

    const/4 p1, -0x6

    invoke-static {p1}, Lpd/l;->d(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Lsb/k;

    invoke-direct {v1}, Lsb/k;-><init>()V

    new-instance v2, Lpd/j;

    invoke-direct {v2, p0, v1, v1, p1}, Lpd/j;-><init>(Lpd/l;Lsb/k;Lsb/k;Lpd/d;)V

    invoke-virtual {v0, v2, v1}, Lib/o;->t(Lib/e;Lsb/k;)V

    invoke-virtual {v1}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, -0x2

    invoke-static {p1}, Lpd/l;->d(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
