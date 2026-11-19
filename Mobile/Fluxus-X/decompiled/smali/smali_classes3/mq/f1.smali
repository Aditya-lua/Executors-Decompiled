.class public final synthetic Lmq/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lls/g;


# direct methods
.method public synthetic constructor <init>(Lls/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq/f1;->a:Lls/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmq/f1;->a:Lls/g;

    check-cast p1, Lsn/v$b;

    invoke-static {v0, p1}, Lmq/i1;->d(Lls/g;Lsn/v$b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
