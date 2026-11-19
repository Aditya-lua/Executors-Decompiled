.class public abstract Lkotlin/jvm/internal/v;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"

# interfaces
.implements Lxu/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/x;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 2
    sget-object v1, Lkotlin/jvm/internal/d;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c()Lxu/k$a;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/x;->d()Lxu/l;

    move-result-object v0

    check-cast v0, Lxu/k;

    invoke-interface {v0}, Lxu/k;->c()Lxu/k$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public computeReflected()Lxu/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->h(Lkotlin/jvm/internal/v;)Lxu/k;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1, p2}, Lxu/k;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
