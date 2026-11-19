.class public final synthetic Lvo/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/w;

.field public final synthetic b:D


# direct methods
.method public synthetic constructor <init>(Lvo/w;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvo/v;->a:Lvo/w;

    iput-wide p2, p0, Lvo/v;->b:D

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lvo/v;->a:Lvo/w;

    iget-wide v1, p0, Lvo/v;->b:D

    invoke-static {v0, v1, v2}, Lvo/w;->c(Lvo/w;D)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
