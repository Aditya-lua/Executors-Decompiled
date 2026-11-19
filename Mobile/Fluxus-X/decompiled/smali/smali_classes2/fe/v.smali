.class public abstract Lfe/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lfe/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lfe/v;->c()Lfe/u;

    move-result-object v0

    invoke-virtual {v0}, Lfe/u;->e()Lfe/v;

    move-result-object v0

    sput-object v0, Lfe/v;->a:Lfe/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lfe/u;
    .locals 2

    new-instance v0, Lfe/c;

    invoke-direct {v0}, Lfe/c;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0, v1}, Lfe/c;->b(Ljava/util/Map;)Lfe/u;

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/util/Map;
.end method
