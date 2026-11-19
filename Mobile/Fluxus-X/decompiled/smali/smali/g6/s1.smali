.class public final synthetic Lg6/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lg6/u1;

.field public final synthetic b:Lg6/p1;


# direct methods
.method public synthetic constructor <init>(Lg6/u1;Lg6/p1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/s1;->a:Lg6/u1;

    iput-object p2, p0, Lg6/s1;->b:Lg6/p1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg6/s1;->a:Lg6/u1;

    iget-object v1, p0, Lg6/s1;->b:Lg6/p1;

    check-cast p1, Lg5/b;

    invoke-static {v0, v1, p1}, Lg6/u1;->e(Lg6/u1;Lg6/p1;Lg5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
