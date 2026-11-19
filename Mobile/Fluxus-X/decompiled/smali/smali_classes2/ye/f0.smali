.class public abstract Lye/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lye/f0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<SerializationT::",
        "Lye/p0;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lgf/a;

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TSerializationT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgf/a;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgf/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lye/f0;->a:Lgf/a;

    .line 4
    iput-object p2, p0, Lye/f0;->b:Ljava/lang/Class;

    return-void
.end method

.method public synthetic constructor <init>(Lgf/a;Ljava/lang/Class;Lye/f0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lye/f0;-><init>(Lgf/a;Ljava/lang/Class;)V

    return-void
.end method

.method public static a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lye/p0;",
            ">(",
            "Lye/f0$b<",
            "TSerializationT;>;",
            "Lgf/a;",
            "Ljava/lang/Class<",
            "TSerializationT;>;)",
            "Lye/f0<",
            "TSerializationT;>;"
        }
    .end annotation

    new-instance v0, Lye/f0$a;

    invoke-direct {v0, p1, p2, p0}, Lye/f0$a;-><init>(Lgf/a;Ljava/lang/Class;Lye/f0$b;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lgf/a;
    .locals 1

    iget-object v0, p0, Lye/f0;->a:Lgf/a;

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

    iget-object v0, p0, Lye/f0;->b:Ljava/lang/Class;

    return-object v0
.end method

.method public abstract d(Lye/p0;)Lre/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;)",
            "Lre/x;"
        }
    .end annotation
.end method
