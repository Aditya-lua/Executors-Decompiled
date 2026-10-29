.class public Lorg/webrtc/Logging;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/Logging$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static volatile b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lorg/webrtc/Logging;->a()Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/webrtc/Logging;->a:Ljava/util/logging/Logger;

    return-void
.end method

.method public static a()Ljava/util/logging/Logger;
    .locals 2

    const-string v0, "org.webrtc.Logging"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->b:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->d:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    sget-boolean v0, Lorg/webrtc/Logging;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    invoke-static {p0, p1, p2}, Lorg/webrtc/Logging;->nativeLog(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Lorg/webrtc/Logging$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    goto :goto_0

    :cond_1
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    goto :goto_0

    :cond_2
    sget-object p0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    goto :goto_0

    :cond_3
    sget-object p0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    :goto_0
    sget-object v0, Lorg/webrtc/Logging;->a:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Logging tag or message may not be null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$b;->c:Lorg/webrtc/Logging$b;

    invoke-static {v0, p0, p1}, Lorg/webrtc/Logging;->d(Lorg/webrtc/Logging$b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static native nativeLog(ILjava/lang/String;Ljava/lang/String;)V
.end method
