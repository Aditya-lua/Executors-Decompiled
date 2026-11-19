.class public interface abstract Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RFR:",
        "Lcom/appsflyer/sdk_base/referrer/Referrer;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e6\u0080\u0001\u0018\u0000*\n\u0008\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/referrer/ReferrerCreator;",
        "RFR",
        "Lcom/appsflyer/sdk_base/referrer/Referrer;",
        "",
        "create",
        "prop",
        "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
        "(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Lcom/appsflyer/sdk_base/referrer/Referrer;",
        "sdk_base_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract create(Lcom/appsflyer/sdk_base/referrer/ReferrerProp;)Lcom/appsflyer/sdk_base/referrer/Referrer;
    .param p1    # Lcom/appsflyer/sdk_base/referrer/ReferrerProp;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/appsflyer/sdk_base/referrer/ReferrerProp;",
            ")TRFR;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
