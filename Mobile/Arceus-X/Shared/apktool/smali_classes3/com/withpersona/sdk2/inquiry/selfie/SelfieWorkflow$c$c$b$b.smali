.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;
.super Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000e\u001a\u0004\u0008\n\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
        "",
        "countDown",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "overlay",
        "",
        "showProgress",
        "<init>",
        "(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V",
        "a",
        "I",
        "b",
        "()I",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "c",
        "Z",
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
.field public final a:I

.field public final b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Z


# direct methods
.method public constructor <init>(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V
    .locals 1
    .param p2    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "overlay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->a:I

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    iput-boolean p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->a:I

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;->c:Z

    return v0
.end method
