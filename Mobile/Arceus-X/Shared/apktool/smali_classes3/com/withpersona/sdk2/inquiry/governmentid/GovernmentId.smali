.class public interface abstract Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;,
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;,
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;,
        Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u0001:\u0004\u0013\u0014\u0015\u0016R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u0082\u0001\u0002\u0017\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;",
        "Landroid/os/Parcelable;",
        "",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;",
        "d3",
        "()Ljava/util/List;",
        "frames",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;",
        "y1",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;",
        "side",
        "",
        "m2",
        "()Ljava/lang/String;",
        "idClassKey",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;",
        "a3",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;",
        "captureMethod",
        "GovernmentIdImage",
        "GovernmentIdVideo",
        "b",
        "a",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;",
        "government-id_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a3()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract d3()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract m2()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract y1()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
