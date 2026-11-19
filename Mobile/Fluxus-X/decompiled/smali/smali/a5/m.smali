.class public final synthetic La5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La5/n;


# direct methods
.method public synthetic constructor <init>(La5/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/m;->a:La5/n;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La5/m;->a:La5/n;

    invoke-static {v0}, La5/n;->a(La5/n;)Lg5/b;

    move-result-object v0

    return-object v0
.end method
