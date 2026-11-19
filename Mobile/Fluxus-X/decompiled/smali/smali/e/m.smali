.class public final synthetic Le/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Le/p;


# direct methods
.method public synthetic constructor <init>(Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/m;->a:Le/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/m;->a:Le/p;

    invoke-static {v0}, Le/p;->w0(Le/p;)Landroidx/lifecycle/t0;

    move-result-object v0

    return-object v0
.end method
