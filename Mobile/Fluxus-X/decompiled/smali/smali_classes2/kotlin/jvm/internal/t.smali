.class public abstract Lkotlin/jvm/internal/t;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"

# interfaces
.implements Lxu/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/x;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c()Lxu/j$a;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/x;->d()Lxu/l;

    move-result-object v0

    check-cast v0, Lxu/j;

    invoke-interface {v0}, Lxu/j;->c()Lxu/j$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public computeReflected()Lxu/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lxu/j;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lxu/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
