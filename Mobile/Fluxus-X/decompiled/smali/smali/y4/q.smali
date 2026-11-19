.class public final synthetic Ly4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Ly4/u;


# direct methods
.method public synthetic constructor <init>(Ly4/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/q;->a:Ly4/u;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly4/q;->a:Ly4/u;

    check-cast p1, Ly4/c;

    invoke-static {v0, p1}, Ly4/u;->c(Ly4/u;Ly4/c;)Lh5/d;

    move-result-object p1

    return-object p1
.end method
