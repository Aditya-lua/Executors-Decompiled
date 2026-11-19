.class public final Lye/o0;
.super Lye/j;
.source "SourceFile"


# static fields
.field public static final a:Lye/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lye/o0;

    invoke-direct {v0}, Lye/o0;-><init>()V

    sput-object v0, Lye/o0;->a:Lye/o0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lye/j;-><init>()V

    return-void
.end method

.method public static d()Lye/o0;
    .locals 1

    sget-object v0, Lye/o0;->a:Lye/o0;

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

    invoke-static {p1}, Lre/b0;->b(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lre/l;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {}, Lye/a0;->c()Lye/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lye/a0;->b(Lre/l;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Lye/j0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Lye/j0<",
            "TB;>;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1, p2}, Lre/b0;->e(Lye/j0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Lcf/f0;",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1, p2}, Lre/b0;->c(Lcf/f0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
