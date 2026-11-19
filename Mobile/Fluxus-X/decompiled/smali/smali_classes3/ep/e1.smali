.class public final synthetic Lep/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lep/f1;


# direct methods
.method public synthetic constructor <init>(Lep/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep/e1;->a:Lep/f1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lep/e1;->a:Lep/f1;

    invoke-static {v0}, Lep/f1;->w(Lep/f1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
