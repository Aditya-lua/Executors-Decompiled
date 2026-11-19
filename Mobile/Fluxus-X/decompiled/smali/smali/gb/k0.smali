.class public final synthetic Lgb/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/k0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ll9/g;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    invoke-static {}, Lm9/u;->c()Lm9/u$a;

    move-result-object v0

    new-instance v1, Lgb/m0;

    iget-object v2, p0, Lgb/k0;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Lgb/m0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lm9/u$a;->b(Lm9/q;)Lm9/u$a;

    move-result-object v0

    const/16 v1, 0x1a27

    invoke-virtual {v0, v1}, Lm9/u$a;->e(I)Lm9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Lm9/u$a;->a()Lm9/u;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll9/g;->D(Lm9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
