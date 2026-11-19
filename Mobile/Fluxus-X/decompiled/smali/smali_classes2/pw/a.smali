.class public final synthetic Lpw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpw/e;

.field public final synthetic b:Lorg/webrtc/voiceengine/a$a;


# direct methods
.method public synthetic constructor <init>(Lpw/e;Lorg/webrtc/voiceengine/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpw/a;->a:Lpw/e;

    iput-object p2, p0, Lpw/a;->b:Lorg/webrtc/voiceengine/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpw/a;->a:Lpw/e;

    iget-object v1, p0, Lpw/a;->b:Lorg/webrtc/voiceengine/a$a;

    invoke-static {v0, v1}, Lpw/e;->l(Lpw/e;Lorg/webrtc/voiceengine/a$a;)V

    return-void
.end method
