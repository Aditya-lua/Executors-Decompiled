.class public final Lc6/m$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc6/m$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lc6/i;

.field public final synthetic b:Lg6/j0;


# direct methods
.method public constructor <init>(Lc6/i;Lg6/j0;)V
    .locals 0

    iput-object p1, p0, Lc6/m$a$a;->a:Lc6/i;

    iput-object p2, p0, Lc6/m$a$a;->b:Lg6/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lc6/b;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc6/b;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lc6/m$a$a;->a:Lc6/i;

    iget-object v0, p0, Lc6/m$a$a;->b:Lg6/j0;

    invoke-interface {p2, v0, p1}, Lc6/i;->c(Lg6/j0;Lc6/b;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc6/b;

    invoke-virtual {p0, p1, p2}, Lc6/m$a$a;->b(Lc6/b;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
