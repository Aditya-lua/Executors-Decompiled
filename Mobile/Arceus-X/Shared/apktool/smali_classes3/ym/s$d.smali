.class public final Lym/s$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lym/s;-><init>(Lhu/a;Lym/s;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "()Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic i:Lym/s;


# direct methods
.method public constructor <init>(Lym/s;)V
    .locals 0

    iput-object p1, p0, Lym/s$d;->i:Lym/s;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lym/s$d;->i:Lym/s;

    invoke-static {v0}, Lym/s;->b(Lym/s;)Lhu/a;

    move-result-object v0

    instance-of v0, v0, Lhu/c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lym/s$d;->i:Lym/s;

    invoke-static {v0}, Lym/s;->b(Lym/s;)Lhu/a;

    move-result-object v0

    check-cast v0, Lhu/c;

    invoke-static {v0}, Lyt/a;->a(Lhu/c;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lym/s$d;->i:Lym/s;

    invoke-static {v0}, Lym/s;->b(Lym/s;)Lhu/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lym/s$d;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
