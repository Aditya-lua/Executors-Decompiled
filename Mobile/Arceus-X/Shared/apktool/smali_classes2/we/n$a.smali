.class public Lwe/n$a;
.super Lwe/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwe/n;->a(Lwe/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lwe/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwe/n<",
        "TKeyT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lwe/n$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/n$b;)V
    .locals 0

    iput-object p3, p0, Lwe/n$a;->c:Lwe/n$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lwe/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lwe/n$a;)V

    return-void
.end method


# virtual methods
.method public d(Lpe/l;Lpe/d0;)Lwe/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;",
            "Lpe/d0;",
            ")TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lwe/n$a;->c:Lwe/n$b;

    invoke-interface {v0, p1, p2}, Lwe/n$b;->a(Lpe/l;Lpe/d0;)Lwe/p0;

    move-result-object p1

    return-object p1
.end method
