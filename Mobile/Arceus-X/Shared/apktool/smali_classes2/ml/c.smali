.class public final synthetic Lml/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    invoke-static {p1}, Lml/d;->b(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    return-object p1
.end method
