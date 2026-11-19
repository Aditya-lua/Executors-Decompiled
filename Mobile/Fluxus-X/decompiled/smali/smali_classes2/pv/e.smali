.class public final synthetic Lpv/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpv/f;


# direct methods
.method public synthetic constructor <init>(Lpv/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpv/e;->a:Lpv/f;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpv/e;->a:Lpv/f;

    check-cast p1, Ljava/io/IOException;

    invoke-static {v0, p1}, Lpv/f;->a(Lpv/f;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
