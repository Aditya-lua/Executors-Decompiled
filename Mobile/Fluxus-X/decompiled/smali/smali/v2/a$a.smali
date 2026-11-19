.class public Lv2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/a;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv2/g$c;

.field public final synthetic b:Landroid/graphics/Typeface;

.field public final synthetic c:Lv2/a;


# direct methods
.method public constructor <init>(Lv2/a;Lv2/g$c;Landroid/graphics/Typeface;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/a$a;->c:Lv2/a;

    iput-object p2, p0, Lv2/a$a;->a:Lv2/g$c;

    iput-object p3, p0, Lv2/a$a;->b:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lv2/a$a;->a:Lv2/g$c;

    iget-object v1, p0, Lv2/a$a;->b:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Lv2/g$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
