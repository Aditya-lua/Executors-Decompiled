.class public final synthetic Ly5/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/work/c;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ly5/q1;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/c;ZLjava/lang/String;Ly5/q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5/o1;->a:Landroidx/work/c;

    iput-boolean p2, p0, Ly5/o1;->b:Z

    iput-object p3, p0, Ly5/o1;->c:Ljava/lang/String;

    iput-object p4, p0, Ly5/o1;->d:Ly5/q1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ly5/o1;->a:Landroidx/work/c;

    iget-boolean v1, p0, Ly5/o1;->b:Z

    iget-object v2, p0, Ly5/o1;->c:Ljava/lang/String;

    iget-object v3, p0, Ly5/o1;->d:Ly5/q1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3, p1}, Ly5/q1;->a(Landroidx/work/c;ZLjava/lang/String;Ly5/q1;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
