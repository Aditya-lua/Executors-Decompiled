.class public final synthetic Lhr/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lhr/j;


# direct methods
.method public synthetic constructor <init>(Lhr/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhr/a;->a:Lhr/j;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhr/a;->a:Lhr/j;

    invoke-static {v0}, Lhr/j;->i(Lhr/j;)Lgr/a;

    move-result-object v0

    return-object v0
.end method
