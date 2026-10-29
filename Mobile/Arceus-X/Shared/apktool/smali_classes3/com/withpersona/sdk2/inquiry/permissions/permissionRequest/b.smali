.class public final Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnu/g0<",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00072\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\tH\u0096A\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;",
        "Lnu/g0;",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;",
        "<init>",
        "()V",
        "result",
        "",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;)Z",
        "Lnu/i;",
        "collector",
        "",
        "collect",
        "(Lnu/i;Lnt/b;)Ljava/lang/Object;",
        "a",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final synthetic a:Lnu/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/b0<",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->b:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b$a;

    const/4 v0, 0x1

    sget-object v2, Lmu/a;->b:Lmu/a;

    const/4 v3, 0x0

    invoke-static {v3, v0, v2, v0, v1}, Lnu/i0;->b(IILmu/a;ILjava/lang/Object;)Lnu/b0;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->c:Lnu/b0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->c:Lnu/b0;

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->a:Lnu/b0;

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;)Z
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->c:Lnu/b0;

    invoke-interface {v0, p1}, Lnu/b0;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lnu/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;",
            ">;",
            "Lnt/b<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;->a:Lnu/b0;

    invoke-interface {v0, p1, p2}, Lnu/g0;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
