.class public final synthetic Ly5/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ly5/f1;


# direct methods
.method public synthetic constructor <init>(Ly5/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/e1;->a:Ly5/f1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly5/e1;->a:Ly5/f1;

    invoke-static {v0}, Ly5/f1;->j(Ly5/f1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
