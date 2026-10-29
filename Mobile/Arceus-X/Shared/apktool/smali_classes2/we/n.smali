.class public abstract Lwe/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/n$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KeyT:",
        "Lpe/l;",
        "SerializationT::",
        "Lwe/p0;",
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
            "TSerializationT;>;"
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
            "TSerializationT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lwe/n;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lwe/n;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lwe/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lpe/l;",
            "SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/n$b<",
            "TKeyT;TSerializationT;>;",
            "Ljava/lang/Class<",
            "TKeyT;>;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lwe/n<",
            "TKeyT;TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lwe/n$a;

    invoke-direct {v0, p1, p2, p0}, Lwe/n$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/n$b;)V

    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TKeyT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/n;->a:Ljava/lang/Class;

    return-object v0
.end method

.method public c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation

    iget-object v0, p0, Lwe/n;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lpe/l;Lpe/d0;)Lwe/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;",
            "Lpe/d0;",
            ")TSerializationT;"
        }
    .end annotation
.end method
