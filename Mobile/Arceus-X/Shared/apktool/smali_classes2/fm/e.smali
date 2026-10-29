.class public final synthetic Lfm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lfm/f;


# direct methods
.method public synthetic constructor <init>(Lfm/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/e;->a:Lfm/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfm/e;->a:Lfm/f;

    invoke-static {v0}, Lfm/f;->a(Lfm/f;)Le3/o;

    move-result-object v0

    return-object v0
.end method
