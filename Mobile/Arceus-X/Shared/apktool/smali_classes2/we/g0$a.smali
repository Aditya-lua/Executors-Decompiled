.class public Lwe/g0$a;
.super Lwe/g0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe/g0;->a(Lwe/g0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwe/g0<",
        "TParametersT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lwe/g0$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/g0$b;)V
    .locals 0

    iput-object p3, p0, Lwe/g0$a;->c:Lwe/g0$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lwe/g0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/g0$a;)V

    return-void
.end method


# virtual methods
.method public d(Lpe/x;)Lwe/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TParametersT;)TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lwe/g0$a;->c:Lwe/g0$b;

    invoke-interface {v0, p1}, Lwe/g0$b;->a(Lpe/x;)Lwe/p0;

    move-result-object p1

    return-object p1
.end method
