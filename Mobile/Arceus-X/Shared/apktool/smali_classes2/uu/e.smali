.class public final synthetic Luu/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Luu/f;

.field public final synthetic b:Luu/f$a;


# direct methods
.method public synthetic constructor <init>(Luu/f;Luu/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luu/e;->a:Luu/f;

    iput-object p2, p0, Luu/e;->b:Luu/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Luu/e;->a:Luu/f;

    iget-object v1, p0, Luu/e;->b:Luu/f$a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Luu/f$a;->c(Luu/f;Luu/f$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
