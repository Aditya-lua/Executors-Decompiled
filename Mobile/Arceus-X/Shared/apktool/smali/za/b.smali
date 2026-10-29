.class public final Lza/b;
.super La9/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, La9/b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final P()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll9/u;->c()Ll9/u$a;

    move-result-object v0

    new-instance v1, Lza/j;

    invoke-direct {v1, p0}, Lza/j;-><init>(Lza/b;)V

    invoke-virtual {v0, v1}, Ll9/u$a;->b(Ll9/q;)Ll9/u$a;

    move-result-object v0

    sget-object v1, Lza/c;->c:Lcom/google/android/gms/common/Feature;

    filled-new-array {v1}, [Lcom/google/android/gms/common/Feature;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll9/u$a;->d([Lcom/google/android/gms/common/Feature;)Ll9/u$a;

    move-result-object v0

    const/16 v1, 0x61f

    invoke-virtual {v0, v1}, Ll9/u$a;->e(I)Ll9/u$a;

    move-result-object v0

    invoke-virtual {v0}, Ll9/u$a;->a()Ll9/u;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk9/e;->D(Ll9/u;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
