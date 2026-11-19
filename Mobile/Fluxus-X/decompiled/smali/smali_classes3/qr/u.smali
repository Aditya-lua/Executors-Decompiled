.class public final synthetic Lqr/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lqr/v;


# direct methods
.method public synthetic constructor <init>(Lqr/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqr/u;->a:Lqr/v;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqr/u;->a:Lqr/v;

    invoke-static {v0}, Lqr/v;->a(Lqr/v;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
