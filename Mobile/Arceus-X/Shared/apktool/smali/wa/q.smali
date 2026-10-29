.class public final synthetic Lwa/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/c;


# instance fields
.field public final synthetic a:Lwa/r;


# direct methods
.method public synthetic constructor <init>(Lwa/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa/q;->a:Lwa/r;

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwa/q;->a:Lwa/r;

    invoke-static {v0, p1}, Lwa/r;->a(Lwa/r;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
