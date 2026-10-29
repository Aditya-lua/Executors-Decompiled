.class public final synthetic Lk6/g;
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

    iput-object p1, p0, Lk6/g;->a:Lm6/i$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk6/g;->a:Lm6/i$a;

    invoke-static {v0}, Lk6/h$a;->b(Lm6/i$a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
