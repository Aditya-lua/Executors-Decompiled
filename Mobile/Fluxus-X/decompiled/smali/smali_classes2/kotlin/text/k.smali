.class public final synthetic Lkotlin/text/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/text/j$b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/text/j$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/k;->a:Lkotlin/text/j$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/text/k;->a:Lkotlin/text/j$b;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lkotlin/text/j$b;->d(Lkotlin/text/j$b;I)Lkotlin/text/MatchGroup;

    move-result-object p1

    return-object p1
.end method
