.class public Lih/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lih/a;


# instance fields
.field public final a:Lorg/webrtc/voiceengine/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lpw/e;->p(Landroid/content/Context;)Lpw/e;

    move-result-object p1

    iput-object p1, p0, Lih/c;->a:Lorg/webrtc/voiceengine/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lih/c;->a:Lorg/webrtc/voiceengine/a;

    invoke-virtual {v0}, Lorg/webrtc/voiceengine/a;->a()V

    return-void
.end method

.method public b(Lj/b;)V
    .locals 1

    iget-object v0, p0, Lih/c;->a:Lorg/webrtc/voiceengine/a;

    invoke-virtual {v0, p1}, Lorg/webrtc/voiceengine/a;->e(Lj/b;)V

    return-void
.end method
