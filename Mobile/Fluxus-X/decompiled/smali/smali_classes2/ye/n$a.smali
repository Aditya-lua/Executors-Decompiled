.class public Lye/n$a;
.super Lye/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lye/n;->a(Lye/n$b;Ljava/lang/Class;Ljava/lang/Class;)Lye/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lye/n<",
        "TKeyT;TSerializationT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lye/n$b;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lye/n$b;)V
    .locals 0

    iput-object p3, p0, Lye/n$a;->c:Lye/n$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lye/n;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lye/n$a;)V

    return-void
.end method


# virtual methods
.method public d(Lre/l;Lre/d0;)Lye/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;",
            "Lre/d0;",
            ")TSerializationT;"
        }
    .end annotation

    iget-object v0, p0, Lye/n$a;->c:Lye/n$b;

    invoke-interface {v0, p1, p2}, Lye/n$b;->a(Lre/l;Lre/d0;)Lye/p0;

    move-result-object p1

    return-object p1
.end method
