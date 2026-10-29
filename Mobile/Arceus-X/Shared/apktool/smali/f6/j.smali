.class public final synthetic Lf6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lf6/l;

.field public final synthetic b:Lf6/h;


# direct methods
.method public synthetic constructor <init>(Lf6/l;Lf6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/j;->a:Lf6/l;

    iput-object p2, p0, Lf6/j;->b:Lf6/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf6/j;->a:Lf6/l;

    iget-object v1, p0, Lf6/j;->b:Lf6/h;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lf6/l;->d(Lf6/l;Lf6/h;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
