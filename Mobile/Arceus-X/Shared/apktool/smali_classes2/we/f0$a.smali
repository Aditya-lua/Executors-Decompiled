.class public Lwe/f0$a;
.super Lwe/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe/f0;->a(Lwe/f0$b;Lef/a;Ljava/lang/Class;)Lwe/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwe/f0<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lwe/f0$b;


# direct methods
.method public constructor <init>(Lef/a;Ljava/lang/Class;Lwe/f0$b;)V
    .locals 0

    iput-object p3, p0, Lwe/f0$a;->c:Lwe/f0$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lwe/f0;-><init>(Lef/a;Ljava/lang/Class;Lwe/f0$a;)V

    return-void
.end method


# virtual methods
.method public d(Lwe/p0;)Lpe/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;)",
            "Lpe/x;"
        }
    .end annotation

    iget-object v0, p0, Lwe/f0$a;->c:Lwe/f0$b;

    invoke-interface {v0, p1}, Lwe/f0$b;->a(Lwe/p0;)Lpe/x;

    move-result-object p1

    return-object p1
.end method
