.class public final synthetic Lx6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/a0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/h;->a:Lkotlin/jvm/internal/a0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx6/h;->a:Lkotlin/jvm/internal/a0;

    check-cast p1, Lc7/c;

    invoke-static {v0, p1}, Lx6/i;->a(Lkotlin/jvm/internal/a0;Lc7/c;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
