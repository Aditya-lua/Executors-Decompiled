.class public final synthetic Llf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof/g;


# static fields
.field public static final synthetic a:Llf/a;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Llf/a;

    invoke-direct {v0}, Llf/a;-><init>()V

    sput-object v0, Llf/a;->a:Llf/a;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic create(Lof/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->zza(Lof/d;)Lkf/a;

    move-result-object p1

    return-object p1
.end method
