.class public final Lcom/withpersona/sdk2/inquiry/ui/network/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/ui/network/b$a;,
        Lcom/withpersona/sdk2/inquiry/ui/network/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;",
        ">;",
        "Lls/j<",
        "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016\u0012B)\u0008\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0018R\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/ui/network/b;",
        "Lln/o;",
        "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;",
        "Lls/j;",
        "",
        "sessionToken",
        "Lqr/x5;",
        "triggeringComponent",
        "addressText",
        "Lgs/c;",
        "uiService",
        "<init>",
        "(Ljava/lang/String;Lqr/x5;Ljava/lang/String;Lgs/c;)V",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "otherWorker",
        "",
        "a",
        "(Lln/o;)Z",
        "c",
        "(Lls/j;)Z",
        "b",
        "Ljava/lang/String;",
        "Lqr/x5;",
        "d",
        "e",
        "Lgs/c;",
        "ui_release"
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
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lqr/x5;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lgs/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lqr/x5;Ljava/lang/String;Lgs/c;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->b:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->c:Lqr/x5;

    .line 5
    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->e:Lgs/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lqr/x5;Ljava/lang/String;Lgs/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/ui/network/b;-><init>(Ljava/lang/String;Lqr/x5;Ljava/lang/String;Lgs/c;)V

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/ui/network/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/ui/network/b;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/ui/network/b;)Lqr/x5;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->c:Lqr/x5;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/ui/network/b;)Lgs/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->e:Lgs/c;

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 1
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 1
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/ui/network/b;->d:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lcom/withpersona/sdk2/inquiry/ui/network/b$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/network/b$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/ui/network/b$c;-><init>(Lcom/withpersona/sdk2/inquiry/ui/network/b;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
