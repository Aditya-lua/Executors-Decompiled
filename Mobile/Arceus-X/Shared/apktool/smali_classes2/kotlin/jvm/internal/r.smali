.class public abstract Lkotlin/jvm/internal/r;
.super Lkotlin/jvm/internal/x;
.source "SourceFile"

# interfaces
.implements Lhu/i;


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
.method public computeReflected()Lhu/b;
    .locals 1

    invoke-static {p0}, Lkotlin/jvm/internal/d0;->f(Lkotlin/jvm/internal/r;)Lhu/i;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lhu/i;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
