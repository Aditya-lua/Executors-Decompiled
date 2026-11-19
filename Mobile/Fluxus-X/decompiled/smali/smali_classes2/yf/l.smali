.class public final synthetic Lyf/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lyf/p;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ly3/f$a;


# direct methods
.method public synthetic constructor <init>(Lyf/p;Ljava/lang/String;Ljava/lang/String;Ly3/f$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/l;->a:Lyf/p;

    iput-object p2, p0, Lyf/l;->b:Ljava/lang/String;

    iput-object p3, p0, Lyf/l;->c:Ljava/lang/String;

    iput-object p4, p0, Lyf/l;->d:Ly3/f$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lyf/l;->a:Lyf/p;

    iget-object v1, p0, Lyf/l;->b:Ljava/lang/String;

    iget-object v2, p0, Lyf/l;->c:Ljava/lang/String;

    iget-object v3, p0, Lyf/l;->d:Ly3/f$a;

    check-cast p1, Ly3/c;

    invoke-static {v0, v1, v2, v3, p1}, Lyf/p;->b(Lyf/p;Ljava/lang/String;Ljava/lang/String;Ly3/f$a;Ly3/c;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
