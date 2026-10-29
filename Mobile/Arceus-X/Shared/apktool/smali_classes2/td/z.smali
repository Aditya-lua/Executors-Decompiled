.class public final Ltd/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltd/c;


# instance fields
.field public final a:Ltd/n0;

.field public final b:Ltd/t0;


# direct methods
.method public constructor <init>(Ltd/n0;Ltd/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/z;->a:Ltd/n0;

    iput-object p2, p0, Ltd/z;->b:Ltd/t0;

    return-void
.end method


# virtual methods
.method public final a(Ltd/c$a;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd/c$a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ltd/c$c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ltd/c$a;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Ltd/c$a;->a()I

    iget-object v2, p0, Ltd/z;->a:Ltd/n0;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Ltd/n0;->d(JI)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Ltd/y;

    invoke-direct {v1, p0, p1}, Ltd/y;-><init>(Ltd/z;Ltd/c$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->o(Lsb/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Ltd/c$a;Ljava/lang/Long;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    invoke-virtual {p1}, Ltd/c$a;->b()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p1}, Ltd/c$a;->a()I

    new-instance v0, Ltd/s0;

    iget-object v1, p0, Ltd/z;->b:Ltd/t0;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Ltd/s0;-><init>(Ltd/t0;JJI)V

    invoke-static {v0}, Lsb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
