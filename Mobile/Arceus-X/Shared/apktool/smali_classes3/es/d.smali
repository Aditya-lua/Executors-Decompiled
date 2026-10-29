.class public final synthetic Les/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Les/e;


# direct methods
.method public synthetic constructor <init>(Les/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/d;->a:Les/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Les/d;->a:Les/e;

    check-cast p1, Lds/b;

    check-cast p2, Lwr/l;

    invoke-static {v0, p1, p2}, Les/e;->d(Les/e;Lds/b;Lwr/l;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
