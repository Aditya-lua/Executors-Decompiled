.class public Lbacktraceio/library/common/BacktraceSerializeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;

    invoke-direct {v0}, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;-><init>()V

    invoke-virtual {v0}, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;->buildGson()Lkg/f;

    move-result-object v0

    invoke-static {v0, p0, p1}, Lbacktraceio/library/common/BacktraceSerializeHelper;->fromJson(Lkg/f;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static fromJson(Lkg/f;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkg/f;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lkg/f;->j(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;

    invoke-direct {v0}, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;-><init>()V

    invoke-virtual {v0}, Lbacktraceio/library/common/serialization/BacktraceGsonBuilder;->buildGson()Lkg/f;

    move-result-object v0

    invoke-static {v0, p0}, Lbacktraceio/library/common/BacktraceSerializeHelper;->toJson(Lkg/f;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toJson(Lkg/f;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lkg/f;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
