.class public abstract Lcom/withpersona/sdk2/inquiry/document/f$a$b;
.super Lcom/withpersona/sdk2/inquiry/document/f$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/document/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;,
        Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0002\u0005\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/f$a$b;",
        "Lcom/withpersona/sdk2/inquiry/document/f$a;",
        "<init>",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
        "a",
        "()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;",
        "document",
        "b",
        "Lcom/withpersona/sdk2/inquiry/document/f$a$b$a;",
        "Lcom/withpersona/sdk2/inquiry/document/f$a$b$b;",
        "document_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/document/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/document/f$a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
