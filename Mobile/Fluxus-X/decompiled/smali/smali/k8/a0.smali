.class public final synthetic Lk8/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/m0$b;


# instance fields
.field public final synthetic a:Lk8/m0;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lf8/a$a;


# direct methods
.method public synthetic constructor <init>(Lk8/m0;Ljava/util/Map;Lf8/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/a0;->a:Lk8/m0;

    iput-object p2, p0, Lk8/a0;->b:Ljava/util/Map;

    iput-object p3, p0, Lk8/a0;->c:Lf8/a$a;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lk8/a0;->a:Lk8/m0;

    iget-object v1, p0, Lk8/a0;->b:Ljava/util/Map;

    iget-object v2, p0, Lk8/a0;->c:Lf8/a$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Lk8/m0;->u(Lk8/m0;Ljava/util/Map;Lf8/a$a;Landroid/database/Cursor;)Lf8/a;

    move-result-object p1

    return-object p1
.end method
