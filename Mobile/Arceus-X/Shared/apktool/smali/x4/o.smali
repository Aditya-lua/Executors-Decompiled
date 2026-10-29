.class public final synthetic Lx4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lx4/p;


# direct methods
.method public synthetic constructor <init>(Lx4/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/o;->a:Lx4/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx4/o;->a:Lx4/p;

    check-cast p1, Lg5/c;

    invoke-static {v0, p1}, Lx4/p;->C(Lx4/p;Lg5/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
