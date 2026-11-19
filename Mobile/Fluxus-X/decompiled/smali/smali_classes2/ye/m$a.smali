.class public Lye/m$a;
.super Lye/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/m;->a(Lye/m$b;Lgf/a;Ljava/lang/Class;)Lye/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lye/m<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lye/m$b;


# direct methods
.method public constructor <init>(Lgf/a;Ljava/lang/Class;Lye/m$b;)V
    .locals 0

    iput-object p3, p0, Lye/m$a;->c:Lye/m$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lye/m;-><init>(Lgf/a;Ljava/lang/Class;Lye/m$a;)V

    return-void
.end method


# virtual methods
.method public d(Lye/p0;Lre/d0;)Lre/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Lre/d0;",
            ")",
            "Lre/l;"
        }
    .end annotation

    iget-object v0, p0, Lye/m$a;->c:Lye/m$b;

    invoke-interface {v0, p1, p2}, Lye/m$b;->a(Lye/p0;Lre/d0;)Lre/l;

    move-result-object p1

    return-object p1
.end method
