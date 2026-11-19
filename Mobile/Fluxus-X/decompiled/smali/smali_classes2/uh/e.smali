.class public final synthetic Luh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Luh/g;

.field public final synthetic b:Lvh/a;


# direct methods
.method public synthetic constructor <init>(Luh/g;Lvh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/e;->a:Luh/g;

    iput-object p2, p0, Luh/e;->b:Lvh/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luh/e;->a:Luh/g;

    iget-object v1, p0, Luh/e;->b:Lvh/a;

    check-cast p1, Lg5/b;

    invoke-static {v0, v1, p1}, Luh/g;->q(Luh/g;Lvh/a;Lg5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
