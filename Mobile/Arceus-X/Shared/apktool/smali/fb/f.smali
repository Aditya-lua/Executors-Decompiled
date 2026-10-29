.class public final synthetic Lfb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/l;


# instance fields
.field public final synthetic a:Lfb/g;


# direct methods
.method public synthetic constructor <init>(Lfb/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/f;->a:Lfb/g;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lk9/e;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lfb/f;->a:Lfb/g;

    invoke-interface {v0, p1}, Lfb/g;->a(Lk9/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
