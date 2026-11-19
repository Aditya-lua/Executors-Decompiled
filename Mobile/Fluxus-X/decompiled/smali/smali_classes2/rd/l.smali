.class public final Lrd/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljb/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljb/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljb/d;

    const-string v1, "AgeSignalsService"

    invoke-direct {v0, v1}, Ljb/d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lrd/l;->c:Ljb/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrd/l;->a:Landroid/content/Context;

    invoke-static {p1}, Ljb/r;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Ljb/o;

    sget-object v3, Lrd/l;->c:Ljb/d;

    sget-object v5, Lrd/f;->a:Landroid/content/Intent;

    new-instance v6, Lrd/i;

    invoke-direct {v6}, Lrd/i;-><init>()V

    const-string v4, "AgeSignalsService"

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Ljb/o;-><init>(Landroid/content/Context;Ljb/d;Ljava/lang/String;Landroid/content/Intent;Lrd/i;Ljb/j;)V

    iput-object v1, p0, Lrd/l;->b:Ljb/o;

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lrd/l;->b:Ljb/o;

    return-void
.end method

.method public static bridge synthetic a(Lrd/l;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lrd/l;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic c()Ljb/d;
    .locals 1

    sget-object v0, Lrd/l;->c:Ljb/d;

    return-object v0
.end method

.method public static d(I)Lcom/google/android/gms/tasks/Task;
    .locals 3

    sget-object v0, Lrd/l;->c:Ljb/d;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onError(%d)"

    invoke-virtual {v0, v2, v1}, Ljb/d;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lrd/a;

    invoke-direct {v0, p0}, Lrd/a;-><init>(I)V

    invoke-static {v0}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lrd/d;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lrd/l;->b:Ljb/o;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lrd/l;->a:Landroid/content/Context;

    invoke-static {v1}, Ljb/r;->a(Landroid/content/Context;)I

    move-result v1

    const v2, 0x4e904e0

    if-ge v1, v2, :cond_0

    const/4 p1, -0x6

    invoke-static {p1}, Lrd/l;->d(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Ltb/k;

    invoke-direct {v1}, Ltb/k;-><init>()V

    new-instance v2, Lrd/j;

    invoke-direct {v2, p0, v1, v1, p1}, Lrd/j;-><init>(Lrd/l;Ltb/k;Ltb/k;Lrd/d;)V

    invoke-virtual {v0, v2, v1}, Ljb/o;->t(Ljb/e;Ltb/k;)V

    invoke-virtual {v1}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, -0x2

    invoke-static {p1}, Lrd/l;->d(I)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
