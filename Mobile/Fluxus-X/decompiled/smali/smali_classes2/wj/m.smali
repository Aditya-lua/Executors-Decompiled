.class public Lwj/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lxj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lxj/f;"
        }
    .end annotation

    new-instance v0, Lxj/d;

    invoke-direct {v0, p1}, Lxj/d;-><init>(Ljava/util/Map;)V

    return-object v0
.end method
