.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;
.super Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;",
        "overlay",
        "",
        "countDown",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;I)V",
        "a",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;",
        "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;",
        "b",
        "I",
        "()I",
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
.field public final a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;I)V
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "overlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;

    iput p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;->b:I

    return-void
.end method


# virtual methods
.method public a()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$c;->b:I

    return v0
.end method
