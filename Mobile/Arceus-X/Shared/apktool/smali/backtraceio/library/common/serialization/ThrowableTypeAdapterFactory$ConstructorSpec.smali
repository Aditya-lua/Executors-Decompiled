.class Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConstructorSpec"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Throwable;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field final args:[Ljava/lang/Object;

.field final paramTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([Ljava/lang/Class;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->paramTypes:[Ljava/lang/Class;

    iput-object p2, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;->args:[Ljava/lang/Object;

    return-void
.end method
