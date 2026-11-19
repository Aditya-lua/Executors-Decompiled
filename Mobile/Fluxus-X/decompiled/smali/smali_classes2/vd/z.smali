.class public final Lvd/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c;


# instance fields
.field public final a:Lvd/n0;

.field public final b:Lvd/t0;


# direct methods
.method public constructor <init>(Lvd/n0;Lvd/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/z;->a:Lvd/n0;

    iput-object p2, p0, Lvd/z;->b:Lvd/t0;

    return-void
.end method


# virtual methods
.method public final a(Lvd/c$a;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c$a;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lvd/c$c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lvd/c$a;->b()J

    move-result-wide v0

    invoke-virtual {p1}, Lvd/c$a;->a()I

    iget-object v2, p0, Lvd/z;->a:Lvd/n0;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Lvd/n0;->d(JI)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lvd/y;

    invoke-direct {v1, p0, p1}, Lvd/y;-><init>(Lvd/z;Lvd/c$a;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->o(Ltb/j;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lvd/c$a;Ljava/lang/Long;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    invoke-virtual {p1}, Lvd/c$a;->b()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p1}, Lvd/c$a;->a()I

    new-instance v0, Lvd/s0;

    iget-object v1, p0, Lvd/z;->b:Lvd/t0;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lvd/s0;-><init>(Lvd/t0;JJI)V

    invoke-static {v0}, Ltb/m;->f(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
