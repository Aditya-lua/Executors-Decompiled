.class public final synthetic Lwf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lwf/p;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lx3/f$a;


# direct methods
.method public synthetic constructor <init>(Lwf/p;Ljava/lang/String;Ljava/lang/String;Lx3/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwf/l;->a:Lwf/p;

    iput-object p2, p0, Lwf/l;->b:Ljava/lang/String;

    iput-object p3, p0, Lwf/l;->c:Ljava/lang/String;

    iput-object p4, p0, Lwf/l;->d:Lx3/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lwf/l;->a:Lwf/p;

    iget-object v1, p0, Lwf/l;->b:Ljava/lang/String;

    iget-object v2, p0, Lwf/l;->c:Ljava/lang/String;

    iget-object v3, p0, Lwf/l;->d:Lx3/f$a;

    check-cast p1, Lx3/c;

    invoke-static {v0, v1, v2, v3, p1}, Lwf/p;->b(Lwf/p;Ljava/lang/String;Ljava/lang/String;Lx3/f$a;Lx3/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
