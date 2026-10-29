.class public final synthetic Ld5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ld5/i;


# direct methods
.method public synthetic constructor <init>(Ld5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/g;->a:Ld5/i;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld5/g;->a:Ld5/i;

    invoke-static {v0}, Ld5/h$a;->a(Ld5/i;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
