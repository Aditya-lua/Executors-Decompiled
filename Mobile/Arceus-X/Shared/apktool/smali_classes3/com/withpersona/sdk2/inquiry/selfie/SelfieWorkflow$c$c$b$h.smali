.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;
.super Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u00002\u00020\u0001B-\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0013\u001a\u0004\u0008\u000c\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0011\u001a\u0004\u0008\u0015\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;",
        "Lkotlin/Function0;",
        "",
        "onComplete",
        "",
        "imageCaptured",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "overlay",
        "showProgress",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V",
        "a",
        "Lkotlin/jvm/functions/Function0;",
        "c",
        "()Lkotlin/jvm/functions/Function0;",
        "b",
        "Z",
        "()Z",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
        "d",
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
.field public final a:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Z

.field public final c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;",
            "Z)V"
        }
    .end annotation

    const-string v0, "onComplete"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overlay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->a:Lkotlin/jvm/functions/Function0;

    iput-boolean p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->b:Z

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    iput-boolean p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->d:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->b:Z

    return v0
.end method

.method public final c()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->a:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;->d:Z

    return v0
.end method
