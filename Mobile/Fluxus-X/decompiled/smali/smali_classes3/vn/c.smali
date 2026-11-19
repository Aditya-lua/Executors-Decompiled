.class public final synthetic Lvn/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lvn/f;


# direct methods
.method public synthetic constructor <init>(Lvn/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/c;->a:Lvn/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lvn/c;->a:Lvn/f;

    check-cast p1, Landroid/media/MediaFormat;

    invoke-static {v0, p1}, Lvn/f;->a(Lvn/f;Landroid/media/MediaFormat;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
