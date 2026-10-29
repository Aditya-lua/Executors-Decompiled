.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;
.super Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\n\u0010\u000cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\r\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "overlay",
        "",
        "maxRecordingLengthMs",
        "",
        "showProgress",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "b",
        "J",
        "()J",
        "c",
        "Z",
        "getShowProgress",
        "()Z",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:J

.field public final c:Z


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "overlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    iput-wide p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;->b:J

    iput-boolean p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;->b:J

    return-wide v0
.end method
