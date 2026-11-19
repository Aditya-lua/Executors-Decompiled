.class public final synthetic Li5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# instance fields
.field public final synthetic a:Lh5/d$a;

.field public final synthetic b:Li5/g$b;


# direct methods
.method public synthetic constructor <init>(Lh5/d$a;Li5/g$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li5/h;->a:Lh5/d$a;

    iput-object p2, p0, Li5/h;->b:Li5/g$b;

    return-void
.end method


# virtual methods
.method public final onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Li5/h;->a:Lh5/d$a;

    iget-object v1, p0, Li5/h;->b:Li5/g$b;

    invoke-static {v0, v1, p1}, Li5/g$c;->a(Lh5/d$a;Li5/g$b;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method
