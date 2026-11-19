.class public final synthetic Lk8/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/m0$b;


# instance fields
.field public final synthetic a:Lk8/m0;

.field public final synthetic b:Lc8/o;


# direct methods
.method public synthetic constructor <init>(Lk8/m0;Lc8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/o;->a:Lk8/m0;

    iput-object p2, p0, Lk8/o;->b:Lc8/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lk8/o;->a:Lk8/m0;

    iget-object v1, p0, Lk8/o;->b:Lc8/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lk8/m0;->o(Lk8/m0;Lc8/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
