.class public final Lgb/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lea/g;


# instance fields
.field public final a:Lgb/n;

.field public final b:Lgb/i;


# direct methods
.method public constructor <init>(Lgb/n;Lgb/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/p0;->a:Lgb/n;

    iput-object p2, p0, Lgb/p0;->b:Lgb/i;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Lea/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lgb/p0;->a:Lgb/n;

    invoke-interface {v0}, Lgb/n;->zzc()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
