.class public final Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/workflow1/ui/PickledTreesnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/squareup/workflow1/ui/PickledTreesnapshot;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/squareup/workflow1/ui/PickledTreesnapshot;",
        "<init>",
        "()V",
        "Landroid/os/Parcel;",
        "parcel",
        "a",
        "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/PickledTreesnapshot;",
        "",
        "size",
        "",
        "b",
        "(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/PickledTreesnapshot;
    .locals 7
    .param p1    # Landroid/os/Parcel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "parcel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lxu/h;->d:Lxu/h$a;

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string p1, "parcel.createByteArray()!!"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lxu/h$a;->g(Lxu/h$a;[BIIILjava/lang/Object;)Lxu/h;

    move-result-object p1

    new-instance v0, Lcom/squareup/workflow1/ui/PickledTreesnapshot;

    sget-object v1, Lym/m;->c:Lym/m$a;

    invoke-virtual {v1, p1}, Lym/m$a;->a(Lxu/h;)Lym/m;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/squareup/workflow1/ui/PickledTreesnapshot;-><init>(Lym/m;)V

    return-object v0
.end method

.method public b(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-array p1, p1, [Lcom/squareup/workflow1/ui/PickledTreesnapshot;

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;->a(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/PickledTreesnapshot;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;->b(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;

    move-result-object p1

    return-object p1
.end method
