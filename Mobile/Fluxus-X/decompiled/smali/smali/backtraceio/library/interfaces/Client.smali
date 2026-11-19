.class public interface abstract Lbacktraceio/library/interfaces/Client;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addAttribute(Ljava/lang/String;Ljava/lang/Object;)V
.end method

.method public abstract addAttribute(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract enableNativeIntegration()V
.end method

.method public abstract send(Lbacktraceio/library/models/json/BacktraceReport;)V
.end method
