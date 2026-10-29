.class public final synthetic Lk6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lk6/h;


# direct methods
.method public synthetic constructor <init>(Lk6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/b;->a:Lk6/h;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk6/b;->a:Lk6/h;

    invoke-static {v0}, Lk6/h;->b(Lk6/h;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
