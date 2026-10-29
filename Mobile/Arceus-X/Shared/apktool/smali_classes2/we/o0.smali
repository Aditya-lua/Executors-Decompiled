.class public final Lwe/o0;
.super Lwe/j;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwe/o0;

    invoke-direct {v0}, Lwe/o0;-><init>()V

    sput-object v0, Lwe/o0;->a:Lwe/o0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lwe/j;-><init>()V

    return-void
.end method

.method public static d()Lwe/o0;
    .locals 1

    sget-object v0, Lwe/o0;->a:Lwe/o0;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-static {p1}, Lpe/b0;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lpe/l;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lwe/a0;->b(Lpe/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lwe/j0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lwe/j0<",
            "TB;>;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1, p2}, Lpe/b0;->e(Lwe/j0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Laf/f0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Laf/f0;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1, p2}, Lpe/b0;->c(Laf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
