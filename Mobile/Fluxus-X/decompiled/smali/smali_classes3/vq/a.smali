.class public final synthetic Lvq/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lln/k$a;


# direct methods
.method public synthetic constructor <init>(Lln/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq/a;->a:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvq/a;->a:Lln/k$a;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lvq/j;->f(Lln/k$a;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
