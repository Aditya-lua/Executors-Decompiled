.class public final synthetic Lxa/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/c;


# instance fields
.field public final synthetic a:Lxa/r;


# direct methods
.method public synthetic constructor <init>(Lxa/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/q;->a:Lxa/r;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxa/q;->a:Lxa/r;

    invoke-static {v0, p1}, Lxa/r;->a(Lxa/r;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
