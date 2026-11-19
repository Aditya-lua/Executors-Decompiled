.class public final Leq/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Leq/d;",
        "",
        "<init>",
        "()V",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "b",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "getTrackingEventsLogger",
        "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "trackingEventsLogger",
        "nfc_release"
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
.field public static final a:Leq/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leq/d;

    invoke-direct {v0}, Leq/d;-><init>()V

    sput-object v0, Leq/d;->a:Leq/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 0
    .param p1    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sput-object p1, Leq/d;->b:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method
