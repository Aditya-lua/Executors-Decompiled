.class public final synthetic Le7/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lm6/i$a;


# direct methods
.method public synthetic constructor <init>(Lm6/i$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/g0;->a:Lm6/i$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le7/g0;->a:Lm6/i$a;

    invoke-static {v0}, Le7/h0;->a(Lm6/i$a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
