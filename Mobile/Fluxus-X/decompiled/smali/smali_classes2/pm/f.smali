.class public final synthetic Lpm/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpm/m$a;


# direct methods
.method public synthetic constructor <init>(Lpm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm/f;->a:Lpm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpm/f;->a:Lpm/m$a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lpm/m;->c(Lpm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
