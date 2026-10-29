.class public final Lan/c0$a;
.super Lan/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lan/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lan/z<",
        "Lan/c0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lan/c0$a;",
        "Lan/z;",
        "Lan/c0;",
        "<init>",
        "()V",
        "b",
        "()Lan/c0;",
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
.field public static final synthetic b:Lan/c0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lan/c0$a;

    invoke-direct {v0}, Lan/c0$a;-><init>()V

    sput-object v0, Lan/c0$a;->b:Lan/c0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-class v0, Lan/c0;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lan/z;-><init>(Lhu/c;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lan/c0$a;->b()Lan/c0;

    move-result-object v0

    return-object v0
.end method

.method public b()Lan/c0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lan/d0;->a()Lan/c0;

    move-result-object v0

    return-object v0
.end method
