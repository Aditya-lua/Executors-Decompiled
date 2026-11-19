.class public abstract Lye/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/n$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<KeyT:",
        "Lre/l;",
        "SerializationT::",
        "Lye/p0;",
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
    iput-object p1, p0, Lye/n;->a:Ljava/lang/Class;

    .line 4
    iput-object p2, p0, Lye/n;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lye/n$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lye/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lre/l;",
            "SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/n$b<",
            "TKeyT;TSerializationT;>;",
            "Ljava/lang/Class<",
            "TKeyT;>;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lye/n<",
            "TKeyT;TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lye/n$a;

    invoke-direct {v0, p1, p2, p0}, Lye/n$a;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lye/n$b;)V

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

    iget-object v0, p0, Lye/n;->a:Ljava/lang/Class;

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

    iget-object v0, p0, Lye/n;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lre/l;Lre/d0;)Lye/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;",
            "Lre/d0;",
            ")TSerializationT;"
        }
    .end annotation
.end method
