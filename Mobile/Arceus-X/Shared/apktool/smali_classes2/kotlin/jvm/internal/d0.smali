.class public Lkotlin/jvm/internal/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/jvm/internal/e0;

.field public static final b:[Lhu/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/internal/e0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Lkotlin/jvm/internal/e0;-><init>()V

    :goto_0
    sput-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    const/4 v0, 0x0

    new-array v0, v0, [Lhu/c;

    sput-object v0, Lkotlin/jvm/internal/d0;->b:[Lhu/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lkotlin/jvm/internal/j;)Lhu/g;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->a(Lkotlin/jvm/internal/j;)Lhu/g;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lhu/c;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lhu/f;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/e0;->c(Ljava/lang/Class;Ljava/lang/String;)Lhu/f;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lkotlin/jvm/internal/n;)Lhu/h;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->d(Lkotlin/jvm/internal/n;)Lhu/h;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/Class;)Lhu/m;
    .locals 3

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p0

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Lkotlin/jvm/internal/e0;->j(Lhu/e;Ljava/util/List;Z)Lhu/m;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlin/jvm/internal/r;)Lhu/i;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->e(Lkotlin/jvm/internal/r;)Lhu/i;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lkotlin/jvm/internal/t;)Lhu/j;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->f(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lkotlin/jvm/internal/v;)Lhu/k;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->g(Lkotlin/jvm/internal/v;)Lhu/k;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lkotlin/jvm/internal/i;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->h(Lkotlin/jvm/internal/i;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static j(Lkotlin/jvm/internal/m;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/e0;->i(Lkotlin/jvm/internal/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/Class;)Lhu/m;
    .locals 3

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p0

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lkotlin/jvm/internal/e0;->j(Lhu/e;Ljava/util/List;Z)Lhu/m;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/lang/Class;Lkotlin/reflect/KTypeProjection;)Lhu/m;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/d0;->a:Lkotlin/jvm/internal/e0;

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object p0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Lkotlin/jvm/internal/e0;->j(Lhu/e;Ljava/util/List;Z)Lhu/m;

    move-result-object p0

    return-object p0
.end method
