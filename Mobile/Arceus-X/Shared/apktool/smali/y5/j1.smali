.class public final synthetic Ly5/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lx5/q0;

.field public final synthetic b:Ly5/f1;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lx5/q0;Ly5/f1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/j1;->a:Lx5/q0;

    iput-object p2, p0, Ly5/j1;->b:Ly5/f1;

    iput-object p3, p0, Ly5/j1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly5/j1;->a:Lx5/q0;

    iget-object v1, p0, Ly5/j1;->b:Ly5/f1;

    iget-object v2, p0, Ly5/j1;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ly5/m1;->d(Lx5/q0;Ly5/f1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
