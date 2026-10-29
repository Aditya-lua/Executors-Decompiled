.class public Lgi/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgi/a;


# instance fields
.field private currency:Ljava/lang/String;

.field private paymentSessionId:Ljava/lang/String;

.field private productId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lgi/b;->productId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lgi/b;->currency:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lgi/b;->productId:Ljava/lang/String;

    .line 6
    iput-object p2, p0, Lgi/b;->currency:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lgi/b;->paymentSessionId:Ljava/lang/String;

    return-void
.end method
