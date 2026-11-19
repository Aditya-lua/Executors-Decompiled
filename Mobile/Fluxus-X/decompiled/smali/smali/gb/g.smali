.class public final synthetic Lgb/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/m;


# instance fields
.field public final synthetic a:Lgb/h;


# direct methods
.method public synthetic constructor <init>(Lgb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/g;->a:Lgb/h;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ll9/g;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lgb/g;->a:Lgb/h;

    invoke-interface {v0, p1}, Lgb/h;->a(Ll9/g;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
