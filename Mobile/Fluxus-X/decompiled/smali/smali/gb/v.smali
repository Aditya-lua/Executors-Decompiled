.class public final synthetic Lgb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/v1;


# instance fields
.field public final synthetic a:Lgb/c0;


# direct methods
.method public synthetic constructor <init>(Lgb/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/v;->a:Lgb/c0;

    return-void
.end method


# virtual methods
.method public final synthetic zza()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgb/v;->a:Lgb/c0;

    invoke-virtual {v0}, Lgb/c0;->c()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
