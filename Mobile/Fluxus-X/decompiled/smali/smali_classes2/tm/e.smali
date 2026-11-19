.class public final synthetic Ltm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ltm/f;


# direct methods
.method public synthetic constructor <init>(Ltm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltm/e;->a:Ltm/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ltm/e;->a:Ltm/f;

    invoke-static {v0}, Ltm/f;->a(Ltm/f;)Le3/o;

    move-result-object v0

    return-object v0
.end method
