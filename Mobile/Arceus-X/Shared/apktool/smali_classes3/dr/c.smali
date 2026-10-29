.class public final synthetic Ldr/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ldr/n;


# direct methods
.method public synthetic constructor <init>(Ldr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldr/c;->a:Ldr/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldr/c;->a:Ldr/n;

    invoke-static {v0}, Ldr/n;->m(Ldr/n;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
