.class public abstract Lorg/webrtc/voiceengine/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/voiceengine/a$a;
    }
.end annotation


# static fields
.field public static a:Lorg/webrtc/voiceengine/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lorg/webrtc/voiceengine/a;
    .locals 1

    sget-object v0, Lorg/webrtc/voiceengine/a;->a:Lorg/webrtc/voiceengine/a;

    return-object v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lorg/webrtc/voiceengine/a;->a:Lorg/webrtc/voiceengine/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    sget-object v0, Lorg/webrtc/voiceengine/a;->a:Lorg/webrtc/voiceengine/a;

    if-ne p0, v0, :cond_0

    invoke-virtual {v0}, Lorg/webrtc/voiceengine/a;->d()V

    const/4 v0, 0x0

    sput-object v0, Lorg/webrtc/voiceengine/a;->a:Lorg/webrtc/voiceengine/a;

    :cond_0
    return-void
.end method

.method public abstract d()V
.end method

.method public abstract e(Lj/b;)V
.end method

.method public f(Z)V
    .locals 0

    return-void
.end method

.method public g(Lorg/webrtc/voiceengine/a;)V
    .locals 0

    sput-object p1, Lorg/webrtc/voiceengine/a;->a:Lorg/webrtc/voiceengine/a;

    return-void
.end method

.method public abstract h(Lorg/webrtc/voiceengine/a$a;)V
.end method

.method public abstract i()V
.end method
