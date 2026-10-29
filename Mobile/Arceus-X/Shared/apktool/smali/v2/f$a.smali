.class public Lv2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/f;->e(Landroid/content/Context;Lv2/e;Lv2/a;II)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lv2/f$e;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lv2/e;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Lv2/e;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/f$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lv2/f$a;->b:Landroid/content/Context;

    iput-object p3, p0, Lv2/f$a;->c:Lv2/e;

    iput p4, p0, Lv2/f$a;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lv2/f$e;
    .locals 4

    iget-object v0, p0, Lv2/f$a;->a:Ljava/lang/String;

    iget-object v1, p0, Lv2/f$a;->b:Landroid/content/Context;

    iget-object v2, p0, Lv2/f$a;->c:Lv2/e;

    invoke-static {v2}, Lg0/p0;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget v3, p0, Lv2/f$a;->d:I

    invoke-static {v0, v1, v2, v3}, Lv2/f;->c(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lv2/f$e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv2/f$a;->a()Lv2/f$e;

    move-result-object v0

    return-object v0
.end method
