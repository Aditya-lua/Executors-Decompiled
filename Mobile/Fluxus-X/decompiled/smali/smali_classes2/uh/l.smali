.class public final synthetic Luh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Luh/m;

.field public final synthetic b:[Lvh/b;


# direct methods
.method public synthetic constructor <init>(Luh/m;[Lvh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luh/l;->a:Luh/m;

    iput-object p2, p0, Luh/l;->b:[Lvh/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luh/l;->a:Luh/m;

    iget-object v1, p0, Luh/l;->b:[Lvh/b;

    check-cast p1, Lg5/b;

    invoke-static {v0, v1, p1}, Luh/m;->h(Luh/m;[Lvh/b;Lg5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
