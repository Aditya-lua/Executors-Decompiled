.class public Ld8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm8/a;

.field public final c:Lm8/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lm8/a;Lm8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld8/i;->a:Landroid/content/Context;

    iput-object p2, p0, Ld8/i;->b:Lm8/a;

    iput-object p3, p0, Ld8/i;->c:Lm8/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ld8/h;
    .locals 3

    iget-object v0, p0, Ld8/i;->a:Landroid/content/Context;

    iget-object v1, p0, Ld8/i;->b:Lm8/a;

    iget-object v2, p0, Ld8/i;->c:Lm8/a;

    invoke-static {v0, v1, v2, p1}, Ld8/h;->a(Landroid/content/Context;Lm8/a;Lm8/a;Ljava/lang/String;)Ld8/h;

    move-result-object p1

    return-object p1
.end method
