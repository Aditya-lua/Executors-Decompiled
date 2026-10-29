.class public Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$ConstructorSpec;
    }
.end annotation


# instance fields
.field private final transient LOG_TAG:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->LOG_TAG:Ljava/lang/String;

    return-void
.end method

.method public static synthetic access$000(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->LOG_TAG:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public create(Lkg/f;Lcom/google/gson/reflect/TypeToken;)Lkg/a0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkg/f;",
            "Lcom/google/gson/reflect/TypeToken<",
            "TT;>;)",
            "Lkg/a0<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v5

    const-class p2, Ljava/lang/Throwable;

    invoke-virtual {p2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;->LOG_TAG:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ThrowableTypeAdapterFactory doesn\'t handle "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " type"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lbacktraceio/library/logger/BacktraceLogger;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-class v0, Lkg/l;

    invoke-virtual {p1, v0}, Lkg/f;->o(Ljava/lang/Class;)Lkg/a0;

    move-result-object v4

    const-class v0, Ljava/lang/StackTraceElement;

    invoke-virtual {p1, v0}, Lkg/f;->o(Ljava/lang/Class;)Lkg/a0;

    move-result-object v2

    invoke-virtual {p1, p2}, Lkg/f;->o(Ljava/lang/Class;)Lkg/a0;

    move-result-object v3

    new-instance v0, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory$1;-><init>(Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;Lkg/a0;Lkg/a0;Lkg/a0;Ljava/lang/Class;)V

    return-object v0
.end method
