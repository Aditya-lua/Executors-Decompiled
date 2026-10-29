.class public final synthetic Lk6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lo6/j$a;

.field public final synthetic b:Lhu/c;


# direct methods
.method public synthetic constructor <init>(Lo6/j$a;Lhu/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk6/f;->a:Lo6/j$a;

    iput-object p2, p0, Lk6/f;->b:Lhu/c;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk6/f;->a:Lo6/j$a;

    iget-object v1, p0, Lk6/f;->b:Lhu/c;

    invoke-static {v0, v1}, Lk6/h$a;->d(Lo6/j$a;Lhu/c;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
