.class public final synthetic Lkq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmv/a0;


# instance fields
.field public final synthetic a:Lkq/c;


# direct methods
.method public synthetic constructor <init>(Lkq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq/e;->a:Lkq/c;

    return-void
.end method


# virtual methods
.method public final intercept(Lmv/a0$a;)Lmv/h0;
    .locals 1

    iget-object v0, p0, Lkq/e;->a:Lkq/c;

    invoke-static {v0, p1}, Lkq/f;->a(Lkq/c;Lmv/a0$a;)Lmv/h0;

    move-result-object p1

    return-object p1
.end method
