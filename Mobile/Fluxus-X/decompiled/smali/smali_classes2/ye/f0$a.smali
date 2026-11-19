.class public Lye/f0$a;
.super Lye/f0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/f0;->a(Lye/f0$b;Lgf/a;Ljava/lang/Class;)Lye/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lye/f0<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lye/f0$b;


# direct methods
.method public constructor <init>(Lgf/a;Ljava/lang/Class;Lye/f0$b;)V
    .locals 0

    iput-object p3, p0, Lye/f0$a;->c:Lye/f0$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lye/f0;-><init>(Lgf/a;Ljava/lang/Class;Lye/f0$a;)V

    return-void
.end method


# virtual methods
.method public d(Lye/p0;)Lre/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;)",
            "Lre/x;"
        }
    .end annotation

    iget-object v0, p0, Lye/f0$a;->c:Lye/f0$b;

    invoke-interface {v0, p1}, Lye/f0$b;->a(Lye/p0;)Lre/x;

    move-result-object p1

    return-object p1
.end method
