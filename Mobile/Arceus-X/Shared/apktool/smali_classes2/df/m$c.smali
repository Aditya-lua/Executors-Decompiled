.class public Ldf/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/m$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldf/m$e<",
        "TJcePrimitiveT;>;"
    }
.end annotation


# instance fields
.field public final a:Ldf/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/n<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldf/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/n<",
            "TJcePrimitiveT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ldf/m$c;->a:Ldf/n;

    return-void
.end method

.method public synthetic constructor <init>(Ldf/n;Ldf/m$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldf/m$c;-><init>(Ldf/n;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TJcePrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Ldf/m$c;->a:Ldf/n;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ldf/n;->a(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
