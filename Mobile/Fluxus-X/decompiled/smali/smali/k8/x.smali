.class public final synthetic Lk8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/m0$b;


# instance fields
.field public final synthetic a:Lk8/m0;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lc8/o;


# direct methods
.method public synthetic constructor <init>(Lk8/m0;Ljava/util/List;Lc8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/x;->a:Lk8/m0;

    iput-object p2, p0, Lk8/x;->b:Ljava/util/List;

    iput-object p3, p0, Lk8/x;->c:Lc8/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk8/x;->a:Lk8/m0;

    iget-object v1, p0, Lk8/x;->b:Ljava/util/List;

    iget-object v2, p0, Lk8/x;->c:Lc8/o;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk8/m0;->N(Lk8/m0;Ljava/util/List;Lc8/o;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
