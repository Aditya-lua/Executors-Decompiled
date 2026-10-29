.class public Lwe/h0$a;
.super Lwe/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe/h0;->b(Lwe/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwe/h0<",
        "TKeyT;TPrimitiveT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lwe/h0$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/h0$b;)V
    .locals 0

    iput-object p3, p0, Lwe/h0$a;->c:Lwe/h0$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lwe/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/h0$a;)V

    return-void
.end method


# virtual methods
.method public a(Lpe/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;)TPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lwe/h0$a;->c:Lwe/h0$b;

    invoke-interface {v0, p1}, Lwe/h0$b;->a(Lpe/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
