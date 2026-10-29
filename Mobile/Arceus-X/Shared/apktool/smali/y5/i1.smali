.class public final synthetic Ly5/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Ly5/f1;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx5/q0;


# direct methods
.method public synthetic constructor <init>(Ly5/f1;Ljava/lang/String;Lx5/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/i1;->a:Ly5/f1;

    iput-object p2, p0, Ly5/i1;->b:Ljava/lang/String;

    iput-object p3, p0, Ly5/i1;->c:Lx5/q0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ly5/i1;->a:Ly5/f1;

    iget-object v1, p0, Ly5/i1;->b:Ljava/lang/String;

    iget-object v2, p0, Ly5/i1;->c:Lx5/q0;

    invoke-static {v0, v1, v2}, Ly5/m1;->a(Ly5/f1;Ljava/lang/String;Lx5/q0;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
