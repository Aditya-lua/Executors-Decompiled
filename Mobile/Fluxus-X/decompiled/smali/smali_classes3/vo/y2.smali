.class public final synthetic Lvo/y2;
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

    iput-object p1, p0, Lvo/y2;->a:Lln/k$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvo/y2;->a:Lln/k$a;

    check-cast p1, Lfq/n1$a;

    invoke-static {v0, p1}, Lvo/b3;->a(Lln/k$a;Lfq/n1$a;)Lln/r;

    move-result-object p1

    return-object p1
.end method
