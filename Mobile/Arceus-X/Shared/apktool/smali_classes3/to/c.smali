.class public final synthetic Lto/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lno/i;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lk6/s;


# direct methods
.method public synthetic constructor <init>(Lno/i;Ljava/lang/String;Lk6/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lto/c;->a:Lno/i;

    iput-object p2, p0, Lto/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lto/c;->c:Lk6/s;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lto/c;->a:Lno/i;

    iget-object v1, p0, Lto/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lto/c;->c:Lk6/s;

    invoke-static {v0, v1, v2}, Lto/j;->h(Lno/i;Ljava/lang/String;Lk6/s;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
