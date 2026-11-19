.class public final Lcom/roblox/protocols/calling/CallingHandler$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/calling/CallingHandler$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldv/i;"
    }
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
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/protocols/calling/CallingHandler$c$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lul/a;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lul/a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lul/i;->a:Lul/i;

    iget-object v0, p0, Lcom/roblox/protocols/calling/CallingHandler$c$a;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lul/i;->j(Landroid/content/Context;Lul/a;)V

    invoke-virtual {p1}, Lul/a;->m()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lul/d;->a:Lul/d;

    invoke-virtual {p1}, Lul/a;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lul/d;->e(Ljava/lang/String;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lul/a;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/calling/CallingHandler$c$a;->b(Lul/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
