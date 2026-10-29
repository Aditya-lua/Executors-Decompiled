.class public Lwe/m$a;
.super Lwe/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe/m;->a(Lwe/m$b;Lef/a;Ljava/lang/Class;)Lwe/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwe/m<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lwe/m$b;


# direct methods
.method public constructor <init>(Lef/a;Ljava/lang/Class;Lwe/m$b;)V
    .locals 0

    iput-object p3, p0, Lwe/m$a;->c:Lwe/m$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lwe/m;-><init>(Lef/a;Ljava/lang/Class;Lwe/m$a;)V

    return-void
.end method


# virtual methods
.method public d(Lwe/p0;Lpe/d0;)Lpe/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lpe/d0;",
            ")",
            "Lpe/l;"
        }
    .end annotation

    iget-object v0, p0, Lwe/m$a;->c:Lwe/m$b;

    invoke-interface {v0, p1, p2}, Lwe/m$b;->a(Lwe/p0;Lpe/d0;)Lpe/l;

    move-result-object p1

    return-object p1
.end method
