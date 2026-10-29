.class public final synthetic Ljf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmf/g;


# static fields
.field public static final synthetic a:Ljf/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljf/a;

    invoke-direct {v0}, Ljf/a;-><init>()V

    sput-object v0, Ljf/a;->a:Ljf/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic create(Lmf/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->zza(Lmf/d;)Lhf/a;

    move-result-object p1

    return-object p1
.end method
