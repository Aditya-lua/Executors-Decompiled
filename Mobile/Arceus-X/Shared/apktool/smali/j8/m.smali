.class public final synthetic Lj8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/m0$b;


# instance fields
.field public final synthetic a:Lj8/m0;

.field public final synthetic b:Lb8/o;


# direct methods
.method public synthetic constructor <init>(Lj8/m0;Lb8/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/m;->a:Lj8/m0;

    iput-object p2, p0, Lj8/m;->b:Lb8/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lj8/m;->a:Lj8/m0;

    iget-object v1, p0, Lj8/m;->b:Lb8/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Lj8/m0;->f(Lj8/m0;Lb8/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
