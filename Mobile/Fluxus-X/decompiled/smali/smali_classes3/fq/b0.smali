.class public final synthetic Lfq/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lfq/l0;


# direct methods
.method public synthetic constructor <init>(Lfq/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/b0;->a:Lfq/l0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfq/b0;->a:Lfq/l0;

    check-cast p1, Lgq/c;

    invoke-static {v0, p1}, Lfq/l0;->c(Lfq/l0;Lgq/c;)Lnn/k;

    move-result-object p1

    return-object p1
.end method
