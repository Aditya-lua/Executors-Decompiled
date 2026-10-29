.class public Lum/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lum/h$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/b;
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
    .locals 1
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

    invoke-static {p1}, Lum/a0;->a(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p1}, Lum/a0;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p3, p1}, Lum/w;->d(Ljava/lang/reflect/Type;)Lum/h;

    move-result-object p1

    new-instance p3, Lum/b;

    invoke-direct {p3, p2, p1}, Lum/b;-><init>(Ljava/lang/Class;Lum/h;)V

    invoke-virtual {p3}, Lum/h;->nullSafe()Lum/h;

    move-result-object p1

    return-object p1
.end method
