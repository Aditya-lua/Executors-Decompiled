.class public abstract Lho/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lho/f;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static varargs d([Lho/d;)Lho/f;
    .locals 1

    new-instance v0, Lao/d;

    invoke-direct {v0, p0}, Lao/d;-><init>([Lho/d;)V

    return-object v0
.end method


# virtual methods
.method public abstract a(I)Lho/f;
.end method

.method public abstract b(I)Lho/f;
.end method

.method public abstract e(I)Lho/f;
.end method
