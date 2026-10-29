.class public final synthetic Lx4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/room/c;


# direct methods
.method public synthetic constructor <init>(Landroidx/room/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx4/h;->a:Landroidx/room/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx4/h;->a:Landroidx/room/c;

    invoke-static {v0}, Landroidx/room/c;->c(Landroidx/room/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
