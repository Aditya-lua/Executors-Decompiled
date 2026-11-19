.class public final synthetic Lpm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lpm/m$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lpm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lpm/a;->b:Lpm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpm/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lpm/a;->b:Lpm/m$a;

    check-cast p1, Lf9/e;

    invoke-static {v0, v1, p1}, Lpm/m;->e(Ljava/lang/String;Lpm/m$a;Lf9/e;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
