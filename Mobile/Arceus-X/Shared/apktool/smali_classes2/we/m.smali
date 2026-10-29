.class public abstract Lwe/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwe/m$b;
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
    iput-object p1, p0, Lwe/m;->a:Lef/a;

    .line 4
    iput-object p2, p0, Lwe/m;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lef/a;Ljava/lang/Class;Lwe/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lwe/m;-><init>(Lef/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lwe/p0;",
            ">(",
            "Lwe/m$b<",
            "TSerializationT;>;",
            "Lef/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lwe/m<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lwe/m$a;

    invoke-direct {v0, p1, p2, p0}, Lwe/m$a;-><init>(Lef/a;Ljava/lang/Class;Lwe/m$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lef/a;
    .locals 1

    iget-object v0, p0, Lwe/m;->a:Lef/a;

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

    iget-object v0, p0, Lwe/m;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lwe/p0;Lpe/d0;)Lpe/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lpe/d0;",
            ")",
            "Lpe/l;"
        }
    .end annotation
.end method
