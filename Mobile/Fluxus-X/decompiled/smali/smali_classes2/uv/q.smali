.class public final synthetic Luv/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:Luv/v;


# direct methods
.method public synthetic constructor <init>(Luv/o;Luv/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/q;->a:Luv/o;

    iput-object p2, p0, Luv/q;->b:Luv/v;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luv/q;->a:Luv/o;

    iget-object v1, p0, Luv/q;->b:Luv/v;

    invoke-static {v0, v1}, Luv/o$d;->r(Luv/o;Luv/v;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
