.class public final synthetic Lsq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lsq/h;


# direct methods
.method public synthetic constructor <init>(Lsq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsq/e;->a:Lsq/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsq/e;->a:Lsq/h;

    invoke-static {v0}, Lsq/h;->i2(Lsq/h;)Lnn/z;

    move-result-object v0

    return-object v0
.end method
