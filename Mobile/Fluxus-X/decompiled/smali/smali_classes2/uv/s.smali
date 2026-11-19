.class public final synthetic Luv/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;

.field public final synthetic b:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Luv/o;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/s;->a:Luv/o;

    iput-object p2, p0, Luv/s;->b:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luv/s;->a:Luv/o;

    iget-object v1, p0, Luv/s;->b:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1}, Luv/o$d;->p(Luv/o;Lkotlin/jvm/internal/c0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
