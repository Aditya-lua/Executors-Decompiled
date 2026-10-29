.class public final Lb6/m$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb6/m$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lnu/i;"
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
.field public final synthetic a:Lb6/i;

.field public final synthetic b:Lf6/j0;


# direct methods
.method public constructor <init>(Lb6/i;Lf6/j0;)V
    .locals 0

    iput-object p1, p0, Lb6/m$a$a;->a:Lb6/i;

    iput-object p2, p0, Lb6/m$a$a;->b:Lf6/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lb6/b;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb6/b;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lb6/m$a$a;->a:Lb6/i;

    iget-object v0, p0, Lb6/m$a$a;->b:Lf6/j0;

    invoke-interface {p2, v0, p1}, Lb6/i;->e(Lf6/j0;Lb6/b;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb6/b;

    invoke-virtual {p0, p1, p2}, Lb6/m$a$a;->b(Lb6/b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
