.class public final synthetic La7/c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/c$a;
.implements Lkotlin/jvm/internal/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La7/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:La7/c$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La7/c$a$a;

    invoke-direct {v0}, La7/c$a$a;-><init>()V

    sput-object v0, La7/c$a$a;->a:La7/c$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lew/g;)La7/c;
    .locals 0

    invoke-static {p1}, Lb7/b;->a(Lew/g;)La7/c;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lzt/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzt/b<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/k;

    const-string v4, "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lb7/b;

    const-string v3, "parseSvg"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, La7/c$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/h;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Lzt/b;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/h;

    invoke-interface {p1}, Lkotlin/jvm/internal/h;->b()Lzt/b;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/h;->b()Lzt/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
