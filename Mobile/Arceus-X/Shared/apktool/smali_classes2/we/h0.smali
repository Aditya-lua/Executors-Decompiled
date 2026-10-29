.class public abstract Lwe/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KeyT:",
        "Lpe/l;",
        "PrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TKeyT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TPrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TKeyT;>;",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/h0;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lwe/h0;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/h0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lwe/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lpe/l;",
            "PrimitiveT:",
            "Ljava/lang/Object;",
            ">(",
            "Lwe/h0$b<",
            "TKeyT;TPrimitiveT;>;",
            "Ljava/lang/Class<",
            "TKeyT;>;",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;)",
            "Lwe/h0<",
            "TKeyT;TPrimitiveT;>;"
        }
    .end annotation

    new-instance v0, Lwe/h0$a;

    invoke-direct {v0, p1, p2, p0}, Lwe/h0$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/h0$b;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lpe/l;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;)TPrimitiveT;"
        }
    .end annotation
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TKeyT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/h0;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public d()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TPrimitiveT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/h0;->b:Ljava/lang/Class;

    return-object v0
.end method
