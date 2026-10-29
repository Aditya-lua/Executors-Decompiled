.class public final synthetic Lf6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lf6/g;

.field public final synthetic b:Lf6/a;


# direct methods
.method public synthetic constructor <init>(Lf6/g;Lf6/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/c;->a:Lf6/g;

    iput-object p2, p0, Lf6/c;->b:Lf6/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lf6/c;->a:Lf6/g;

    iget-object v1, p0, Lf6/c;->b:Lf6/a;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Lf6/g;->f(Lf6/g;Lf6/a;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
