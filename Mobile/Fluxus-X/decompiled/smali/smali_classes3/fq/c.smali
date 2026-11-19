.class public final synthetic Lfq/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lgq/c;

.field public final synthetic b:Lfq/h;


# direct methods
.method public synthetic constructor <init>(Lgq/c;Lfq/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/c;->a:Lgq/c;

    iput-object p2, p0, Lfq/c;->b:Lfq/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lfq/c;->a:Lgq/c;

    iget-object v1, p0, Lfq/c;->b:Lfq/h;

    invoke-static {v0, v1}, Lfq/h;->c(Lgq/c;Lfq/h;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
