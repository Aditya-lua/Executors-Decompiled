.class public abstract Lwe/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/f0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lwe/p0;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lef/a;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lef/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lef/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/f0;->a:Lef/a;

    .line 4
    iput-object p2, p0, Lwe/f0;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lef/a;Ljava/lang/Class;Lwe/f0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lwe/f0;-><init>(Lef/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/f0$b<",
            "TSerializationT;>;",
            "Lef/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lwe/f0<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lwe/f0$a;

    invoke-direct {v0, p1, p2, p0}, Lwe/f0$a;-><init>(Lef/a;Ljava/lang/Class;Lwe/f0$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lef/a;
    .locals 1

    iget-object v0, p0, Lwe/f0;->a:Lef/a;

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/f0;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lwe/p0;)Lpe/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;)",
            "Lpe/x;"
        }
    .end annotation
.end method
