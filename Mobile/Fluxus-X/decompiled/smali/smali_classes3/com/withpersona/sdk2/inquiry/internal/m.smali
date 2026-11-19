.class public interface abstract Lcom/withpersona/sdk2/inquiry/internal/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/m$a;,
        Lcom/withpersona/sdk2/inquiry/internal/m$b;,
        Lcom/withpersona/sdk2/inquiry/internal/m$c;,
        Lcom/withpersona/sdk2/inquiry/internal/m$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0001\u0004\u001b\u001c\u001d\u001e\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/internal/m;",
        "Landroid/os/Parcelable;",
        "Lnp/h;",
        "n0",
        "()Lnp/h;",
        "environment",
        "",
        "getTheme",
        "()Ljava/lang/Integer;",
        "theme",
        "",
        "u3",
        "()Ljava/lang/String;",
        "shareToken",
        "",
        "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
        "f1",
        "()Ljava/util/List;",
        "fieldMappings",
        "",
        "Q",
        "()Z",
        "redactAppIdentifyingInformation",
        "d",
        "a",
        "b",
        "c",
        "Lcom/withpersona/sdk2/inquiry/internal/m$a;",
        "Lcom/withpersona/sdk2/inquiry/internal/m$b;",
        "Lcom/withpersona/sdk2/inquiry/internal/m$c;",
        "Lcom/withpersona/sdk2/inquiry/internal/m$d;",
        "inquiry-internal_release"
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
.method public Q()Z
    .locals 1

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/internal/m$c;

    return v0
.end method

.method public abstract f1()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getTheme()Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract n0()Lnp/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract u3()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
