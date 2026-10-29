.class public final Lzo/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzo/w$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R*\u0010\u000c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0005\u0010\u0006\u0012\u0004\u0008\u000b\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzo/w;",
        "",
        "<init>",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "a",
        "Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "c",
        "()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;",
        "d",
        "(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V",
        "getOnEventListener$inquiry_dynamic_feature_release$annotations",
        "onEventListener",
        "b",
        "inquiry-dynamic-feature_release"
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
.field public static final b:Lzo/w$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static volatile c:Lzo/w;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# instance fields
.field public a:Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzo/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzo/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzo/w;->b:Lzo/w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lzo/w;
    .locals 1

    sget-object v0, Lzo/w;->c:Lzo/w;

    return-object v0
.end method

.method public static final synthetic b(Lzo/w;)V
    .locals 0

    sput-object p0, Lzo/w;->c:Lzo/w;

    return-void
.end method


# virtual methods
.method public final c()Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lzo/w;->a:Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;

    return-object v0
.end method

.method public final d(Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lzo/w;->a:Lcom/withpersona/sdk2/inquiry/OnInquiryEventListener;

    return-void
.end method
