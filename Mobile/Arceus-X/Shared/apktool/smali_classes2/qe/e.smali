.class public Lqe/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqe/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwe/k0<",
        "Lpe/a;",
        "Lpe/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lqe/e;

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lwe/p;",
            "Lpe/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqe/e;

    invoke-direct {v0}, Lqe/e;-><init>()V

    sput-object v0, Lqe/e;->a:Lqe/e;

    new-instance v0, Lqe/d;

    invoke-direct {v0}, Lqe/d;-><init>()V

    const-class v1, Lwe/p;

    const-class v2, Lpe/a;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lqe/e;->b:Lwe/h0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()V
    .locals 2

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/e;->a:Lqe/e;

    invoke-virtual {v0, v1}, Lwe/a0;->e(Lwe/k0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lqe/e;->b:Lwe/h0;

    invoke-virtual {v0, v1}, Lwe/a0;->d(Lwe/h0;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lpe/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lpe/a;

    return-object v0
.end method

.method public bridge synthetic b(Lwe/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lqe/e;->e(Lwe/j0;)Lpe/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lpe/a;",
            ">;"
        }
    .end annotation

    const-class v0, Lpe/a;

    return-object v0
.end method

.method public e(Lwe/j0;)Lpe/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lpe/a;",
            ">;)",
            "Lpe/a;"
        }
    .end annotation

    new-instance v0, Lqe/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lqe/e$b;-><init>(Lwe/j0;Lqe/e$a;)V

    return-object v0
.end method
