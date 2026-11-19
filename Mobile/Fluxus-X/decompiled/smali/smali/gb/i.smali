.class public final Lgb/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgb/n;


# direct methods
.method public constructor <init>(Lgb/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/i;->a:Lgb/n;

    return-void
.end method

.method public static a(Landroid/app/Application;)Lgb/i;
    .locals 1

    new-instance v0, Lgb/i;

    invoke-static {p0}, Lgb/p;->a(Landroid/app/Application;)Lgb/n;

    move-result-object p0

    invoke-direct {v0, p0}, Lgb/i;-><init>(Lgb/n;)V

    return-object v0
.end method


# virtual methods
.method public final b(Lgb/h;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lgb/g;

    invoke-direct {v0, p1}, Lgb/g;-><init>(Lgb/h;)V

    iget-object p1, p0, Lgb/i;->a:Lgb/n;

    invoke-interface {p1, v0}, Lgb/n;->a(Lgb/m;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
