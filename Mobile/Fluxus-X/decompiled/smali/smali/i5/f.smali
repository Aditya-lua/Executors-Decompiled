.class public final synthetic Li5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Li5/g;


# direct methods
.method public synthetic constructor <init>(Li5/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/f;->a:Li5/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li5/f;->a:Li5/g;

    invoke-static {v0}, Li5/g;->a(Li5/g;)Li5/g$c;

    move-result-object v0

    return-object v0
.end method
