.class public final synthetic Lep/f1$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/h;
.implements Lkotlin/jvm/internal/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/f1;->g0(Lvo/d2$a;Lvo/j0;)Lvo/y3;
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


# instance fields
.field public final synthetic a:Lep/f1;


# direct methods
.method public constructor <init>(Lep/f1;)V
    .locals 0

    iput-object p1, p0, Lep/f1$i;->a:Lep/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lvo/d2$b;

    invoke-virtual {p0, p1}, Lep/f1$i;->c(Lvo/d2$b;)V

    return-void
.end method

.method public final b()Lzt/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzt/b<",
            "*>;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/k;

    iget-object v2, p0, Lep/f1$i;->a:Lep/f1;

    const-string v5, "setOutput(Ljava/lang/Object;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-class v3, Lep/f1;

    const-string v4, "setOutput"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/k;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method

.method public final c(Lvo/d2$b;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lep/f1$i;->a:Lep/f1;

    invoke-static {v0, p1}, Lep/f1;->Y(Lep/f1;Lvo/d2$b;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lln/h;

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
