.class public final synthetic Lcr/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcr/n;


# direct methods
.method public synthetic constructor <init>(Lcr/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr/m;->a:Lcr/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcr/m;->a:Lcr/n;

    invoke-static {v0}, Lcr/n;->a(Lcr/n;)Ljava/util/regex/Pattern;

    move-result-object v0

    return-object v0
.end method
