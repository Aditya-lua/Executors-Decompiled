.class public final synthetic Lpm/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lf9/f$a;

.field public final synthetic b:Lf9/b;

.field public final synthetic c:Lpm/m$a;


# direct methods
.method public synthetic constructor <init>(Lf9/f$a;Lf9/b;Lpm/m$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm/i;->a:Lf9/f$a;

    iput-object p2, p0, Lpm/i;->b:Lf9/b;

    iput-object p3, p0, Lpm/i;->c:Lpm/m$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lpm/i;->a:Lf9/f$a;

    iget-object v1, p0, Lpm/i;->b:Lf9/b;

    iget-object v2, p0, Lpm/i;->c:Lpm/m$a;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, v2, p1}, Lpm/m;->f(Lf9/f$a;Lf9/b;Lpm/m$a;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
