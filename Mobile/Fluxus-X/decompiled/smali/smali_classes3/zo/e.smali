.class public final synthetic Lzo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lzo/h;


# direct methods
.method public synthetic constructor <init>(Lzo/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/e;->a:Lzo/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzo/e;->a:Lzo/h;

    invoke-static {v0}, Lzo/h;->b(Lzo/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
