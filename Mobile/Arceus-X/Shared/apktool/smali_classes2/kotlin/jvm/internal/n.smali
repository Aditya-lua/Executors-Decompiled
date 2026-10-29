.class public abstract Lkotlin/jvm/internal/n;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lhu/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/p;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c()Lhu/j$a;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/x;->d()Lhu/l;

    move-result-object v0

    check-cast v0, Lhu/h;

    invoke-interface {v0}, Lhu/j;->c()Lhu/j$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public computeReflected()Lhu/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->d(Lkotlin/jvm/internal/n;)Lhu/h;

    move-result-object v0

    return-object v0
.end method

.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p1}, Lhu/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
