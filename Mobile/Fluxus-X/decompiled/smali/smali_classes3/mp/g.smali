.class public final synthetic Lmp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lmp/j;


# direct methods
.method public synthetic constructor <init>(Lmp/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/g;->a:Lmp/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/g;->a:Lmp/j;

    invoke-static {v0}, Lmp/j;->g(Lmp/j;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
