.class public final synthetic Ln2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln2/h$f;

.field public final synthetic b:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Ln2/h$f;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln2/i;->a:Ln2/h$f;

    iput-object p2, p0, Ln2/i;->b:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln2/i;->a:Ln2/h$f;

    iget-object v1, p0, Ln2/i;->b:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Ln2/h$f;->a(Ln2/h$f;Landroid/graphics/Typeface;)V

    return-void
.end method
