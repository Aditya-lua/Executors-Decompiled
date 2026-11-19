.class public final synthetic Lg6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lg6/l;

.field public final synthetic b:Lg6/h;


# direct methods
.method public synthetic constructor <init>(Lg6/l;Lg6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/j;->a:Lg6/l;

    iput-object p2, p0, Lg6/j;->b:Lg6/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg6/j;->a:Lg6/l;

    iget-object v1, p0, Lg6/j;->b:Lg6/h;

    check-cast p1, Lg5/b;

    invoke-static {v0, v1, p1}, Lg6/l;->d(Lg6/l;Lg6/h;Lg5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
