.class public final synthetic Luv/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Luv/o;


# direct methods
.method public synthetic constructor <init>(Luv/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luv/i;->a:Luv/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Luv/i;->a:Luv/o;

    invoke-static {v0}, Luv/o;->g(Luv/o;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
