.class public final synthetic Llh/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Llh/m;

.field public final synthetic b:[Lmh/b;


# direct methods
.method public synthetic constructor <init>(Llh/m;[Lmh/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llh/l;->a:Llh/m;

    iput-object p2, p0, Llh/l;->b:[Lmh/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llh/l;->a:Llh/m;

    iget-object v1, p0, Llh/l;->b:[Lmh/b;

    check-cast p1, Lf5/b;

    invoke-static {v0, v1, p1}, Llh/m;->h(Llh/m;[Lmh/b;Lf5/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
