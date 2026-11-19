.class public final Lnn/d0$a;
.super Lnn/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnn/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnn/a0<",
        "Lnn/d0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lnn/d0$a;",
        "Lnn/a0;",
        "Lnn/d0;",
        "<init>",
        "()V",
        "b",
        "()Lnn/d0;",
        "default",
        "wf1-core-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic b:Lnn/d0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnn/d0$a;

    invoke-direct {v0}, Lnn/d0$a;-><init>()V

    sput-object v0, Lnn/d0$a;->b:Lnn/d0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-class v0, Lnn/d0;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lnn/a0;-><init>(Lxu/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lnn/d0$a;->b()Lnn/d0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lnn/d0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lnn/e0;->a()Lnn/d0;

    move-result-object v0

    return-object v0
.end method
