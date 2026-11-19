.class public final synthetic Lo1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lo1/c;


# direct methods
.method public synthetic constructor <init>(Lo1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/b;->a:Lo1/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo1/b;->a:Lo1/c;

    invoke-static {v0}, Lo1/c;->c(Lo1/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
