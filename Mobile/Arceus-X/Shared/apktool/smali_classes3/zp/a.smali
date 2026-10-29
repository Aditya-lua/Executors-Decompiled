.class public final synthetic Lzp/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Laq/c;


# direct methods
.method public synthetic constructor <init>(Laq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp/a;->a:Laq/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lzp/a;->a:Laq/c;

    invoke-static {v0}, Lzp/q;->w(Laq/c;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
