.class public final synthetic Lis/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lis/c;


# direct methods
.method public synthetic constructor <init>(Lis/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis/a;->a:Lis/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lis/a;->a:Lis/c;

    invoke-static {v0}, Lis/c;->i2(Lis/c;)Lnn/z;

    move-result-object v0

    return-object v0
.end method
