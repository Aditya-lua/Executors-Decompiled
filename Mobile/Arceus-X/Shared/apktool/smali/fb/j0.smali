.class public final synthetic Lfb/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/j0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic a(Lk9/e;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    new-instance v1, Lfb/l0;

    iget-object v2, p0, Lfb/j0;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lfb/l0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object v0

    const/16 v1, 0x1a27

    invoke-virtual {v0, v1}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
