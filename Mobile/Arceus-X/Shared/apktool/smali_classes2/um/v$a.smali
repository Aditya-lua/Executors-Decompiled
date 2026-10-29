.class public Lum/v$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lum/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ljava/lang/reflect/Type;Ljava/util/Set;Lum/w;)Lum/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lum/w;",
            ")",
            "Lum/h<",
            "*>;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-static {p1}, Lum/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class v1, Ljava/util/Map;

    if-eq p2, v1, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1, p2}, Lum/a0;->i(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object p1

    new-instance p2, Lum/v;

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-direct {p2, p3, v0, p1}, Lum/v;-><init>(Lum/w;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    invoke-virtual {p2}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1
.end method
