.class public final synthetic Lu6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ll6/s;


# direct methods
.method public synthetic constructor <init>(Ll6/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu6/k;->a:Ll6/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu6/k;->a:Ll6/s;

    invoke-static {v0}, Lu6/m$a;->c(Ll6/s;)Lo6/a;

    move-result-object v0

    return-object v0
.end method
