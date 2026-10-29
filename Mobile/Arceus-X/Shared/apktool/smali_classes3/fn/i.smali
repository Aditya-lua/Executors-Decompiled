.class public final synthetic Lfn/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lne/x;


# direct methods
.method public synthetic constructor <init>(Lne/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn/i;->a:Lne/x;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfn/i;->a:Lne/x;

    invoke-static {v0}, Lfn/j;->a(Lne/x;)Ld1/k;

    move-result-object v0

    return-object v0
.end method
