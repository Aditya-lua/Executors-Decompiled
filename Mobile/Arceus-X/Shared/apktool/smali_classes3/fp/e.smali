.class public final synthetic Lfp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzo/y$a;


# direct methods
.method public synthetic constructor <init>(Lzo/y$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfp/e;->a:Lzo/y$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfp/e;->a:Lzo/y$a;

    invoke-static {v0}, Lfp/f;->i2(Lzo/y$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
