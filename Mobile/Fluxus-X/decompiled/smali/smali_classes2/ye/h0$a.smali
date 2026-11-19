.class public Lye/h0$a;
.super Lye/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/h0;->b(Lye/h0$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lye/h0<",
        "TKeyT;TPrimitiveT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lye/h0$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lye/h0$b;)V
    .locals 0

    iput-object p3, p0, Lye/h0$a;->c:Lye/h0$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lye/h0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lye/h0$a;)V

    return-void
.end method


# virtual methods
.method public a(Lre/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;)TPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lye/h0$a;->c:Lye/h0$b;

    invoke-interface {v0, p1}, Lye/h0$b;->a(Lre/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
