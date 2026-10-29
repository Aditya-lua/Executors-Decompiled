.class public final synthetic Lfm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfm/d;


# direct methods
.method public synthetic constructor <init>(Lfm/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/b;->a:Lfm/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfm/b;->a:Lfm/d;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lfm/d;->a(Lfm/d;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
