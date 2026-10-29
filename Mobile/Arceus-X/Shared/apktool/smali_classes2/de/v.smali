.class public abstract Lde/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lde/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lde/v;->c()Lde/u;

    move-result-object v0

    invoke-virtual {v0}, Lde/u;->e()Lde/v;

    move-result-object v0

    sput-object v0, Lde/v;->a:Lde/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lde/u;
    .locals 2

    new-instance v0, Lde/c;

    invoke-direct {v0}, Lde/c;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Lde/c;->b(Ljava/util/Map;)Lde/u;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/util/Map;
.end method
