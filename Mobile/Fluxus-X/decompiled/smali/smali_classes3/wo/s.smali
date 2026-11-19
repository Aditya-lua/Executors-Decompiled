.class public final synthetic Lwo/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lvo/y3$a;


# direct methods
.method public synthetic constructor <init>(Lvo/y3$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/s;->a:Lvo/y3$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwo/s;->a:Lvo/y3$a;

    invoke-static {v0}, Lwo/z;->e(Lvo/y3$a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
