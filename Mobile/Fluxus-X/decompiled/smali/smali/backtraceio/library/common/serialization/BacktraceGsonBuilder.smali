.class public Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbacktraceio/library/common/serialization/CustomGsonBuilder;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public buildGson()Llg/f;
    .locals 3

    new-instance v0, Llg/g;

    invoke-direct {v0}, Llg/g;-><init>()V

    sget-object v1, Llg/c;->f:Llg/c;

    invoke-virtual {v0, v1}, Llg/g;->g(Llg/c;)Llg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;-><init>()V

    const-class v2, Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v2, v1}, Llg/g;->d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Llg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;-><init>()V

    invoke-virtual {v0, v1}, Llg/g;->e(Llg/b0;)Llg/g;

    move-result-object v0

    invoke-virtual {v0}, Llg/g;->b()Llg/f;

    move-result-object v0

    return-object v0
.end method
