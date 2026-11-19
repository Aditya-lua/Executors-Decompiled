.class public final synthetic Ly4/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/s;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly4/s;->a:Ljava/lang/Runnable;

    invoke-static {v0}, Ly4/u;->d(Ljava/lang/Runnable;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
