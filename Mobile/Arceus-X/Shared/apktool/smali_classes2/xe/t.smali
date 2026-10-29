.class public Lxe/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwe/k0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/t$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwe/k0<",
        "Lpe/w;",
        "Lpe/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lxe/t;

.field public static final b:Lwe/h0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwe/h0<",
            "Lwe/p;",
            "Lpe/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxe/t;

    invoke-direct {v0}, Lxe/t;-><init>()V

    sput-object v0, Lxe/t;->a:Lxe/t;

    new-instance v0, Lxe/s;

    invoke-direct {v0}, Lxe/s;-><init>()V

    const-class v1, Lwe/p;

    const-class v2, Lpe/w;

    invoke-static {v0, v1, v2}, Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;

    move-result-object v0

    sput-object v0, Lxe/t;->b:Lwe/h0;

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

    sget-object v1, Lxe/t;->a:Lxe/t;

    invoke-virtual {v0, v1}, Lwe/a0;->e(Lwe/k0;)V

    invoke-static {}, Lwe/a0;->c()Lwe/a0;

    move-result-object v0

    sget-object v1, Lxe/t;->b:Lwe/h0;

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
            "Lpe/w;",
            ">;"
        }
    .end annotation

    const-class v0, Lpe/w;

    return-object v0
.end method

.method public bridge synthetic b(Lwe/j0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lxe/t;->e(Lwe/j0;)Lpe/w;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lpe/w;",
            ">;"
        }
    .end annotation

    const-class v0, Lpe/w;

    return-object v0
.end method

.method public e(Lwe/j0;)Lpe/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwe/j0<",
            "Lpe/w;",
            ">;)",
            "Lpe/w;"
        }
    .end annotation

    new-instance v0, Lxe/t$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lxe/t$b;-><init>(Lwe/j0;Lxe/t$a;)V

    return-object v0
.end method
