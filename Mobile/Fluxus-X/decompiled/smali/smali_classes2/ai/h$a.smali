.class public final Lai/h$a;
.super Lgu/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lai/h;->i(Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.featuredelivery.RobloxFeatureDelivery"
    f = "RobloxFeatureDelivery.kt"
    l = {
        0x18c
    }
    m = "awaitModuleInstalled"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public A:I

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Z

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lai/h;


# direct methods
.method public constructor <init>(Lai/h;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lai/h;",
            "Leu/b<",
            "-",
            "Lai/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lai/h$a;->z:Lai/h;

    invoke-direct {p0, p2}, Lgu/d;-><init>(Leu/b;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iput-object p1, p0, Lai/h$a;->y:Ljava/lang/Object;

    iget p1, p0, Lai/h$a;->A:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lai/h$a;->A:I

    iget-object p1, p0, Lai/h$a;->z:Lai/h;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lai/h;->i(Ljava/lang/String;ZLeu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
