.class public final synthetic Lch/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lch/i;


# direct methods
.method public synthetic constructor <init>(Lch/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch/g;->a:Lch/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lch/g;->a:Lch/i;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lch/i;->b(Lch/i;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
