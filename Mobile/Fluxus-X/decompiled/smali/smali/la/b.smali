.class public final synthetic Lla/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final synthetic a:Lgb/o1;

.field public final synthetic b:Lgb/o1;


# direct methods
.method public synthetic constructor <init>(Lgb/o1;Lgb/o1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lla/b;->a:Lgb/o1;

    iput-object p2, p0, Lla/b;->b:Lgb/o1;

    return-void
.end method


# virtual methods
.method public final synthetic then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lla/b;->a:Lgb/o1;

    iget-object v1, p0, Lla/b;->b:Lgb/o1;

    invoke-static {v0, v1, p1}, Lla/d;->d(Lgb/o1;Lgb/o1;Lcom/google/android/gms/tasks/Task;)Lla/f;

    move-result-object p1

    return-object p1
.end method
