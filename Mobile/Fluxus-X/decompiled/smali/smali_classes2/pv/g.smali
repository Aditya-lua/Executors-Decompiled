.class public final synthetic Lpv/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lpv/f;

.field public final synthetic b:Lpv/f$b;


# direct methods
.method public synthetic constructor <init>(Lpv/f;Lpv/f$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpv/g;->a:Lpv/f;

    iput-object p2, p0, Lpv/g;->b:Lpv/f$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpv/g;->a:Lpv/f;

    iget-object v1, p0, Lpv/g;->b:Lpv/f$b;

    check-cast p1, Ljava/io/IOException;

    invoke-static {v0, v1, p1}, Lpv/f$b;->a(Lpv/f;Lpv/f$b;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
