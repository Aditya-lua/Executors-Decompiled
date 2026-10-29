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
.method public buildGson()Lkg/f;
    .locals 3

    new-instance v0, Lkg/g;

    invoke-direct {v0}, Lkg/g;-><init>()V

    sget-object v1, Lkg/c;->f:Lkg/c;

    invoke-virtual {v0, v1}, Lkg/g;->g(Lkg/c;)Lkg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/StackTraceElementTypeAdapter;-><init>()V

    const-class v2, Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v2, v1}, Lkg/g;->d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lkg/g;

    move-result-object v0

    new-instance v1, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;

    invoke-direct {v1}, Lbacktraceio/library/common/serialization/ThrowableTypeAdapterFactory;-><init>()V

    invoke-virtual {v0, v1}, Lkg/g;->e(Lkg/b0;)Lkg/g;

    move-result-object v0

    invoke-virtual {v0}, Lkg/g;->b()Lkg/f;

    move-result-object v0

    return-object v0
.end method
