.class public final synthetic Lrr/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lrr/n;


# direct methods
.method public synthetic constructor <init>(Lrr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/e;->a:Lrr/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lrr/e;->a:Lrr/n;

    invoke-static {v0}, Lrr/n;->c(Lrr/n;)Lbr/d;

    move-result-object v0

    return-object v0
.end method
