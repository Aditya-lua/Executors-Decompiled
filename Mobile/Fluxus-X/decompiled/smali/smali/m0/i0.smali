.class public final synthetic Lm0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/j2$a;


# instance fields
.field public final synthetic a:Lm0/j0;

.field public final synthetic b:Ln0/j2$a;


# direct methods
.method public synthetic constructor <init>(Lm0/j0;Ln0/j2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/i0;->a:Lm0/j0;

    iput-object p2, p0, Lm0/i0;->b:Ln0/j2$a;

    return-void
.end method


# virtual methods
.method public final a(Ln0/j2;)V
    .locals 2

    iget-object v0, p0, Lm0/i0;->a:Lm0/j0;

    iget-object v1, p0, Lm0/i0;->b:Ln0/j2$a;

    invoke-static {v0, v1, p1}, Lm0/j0;->a(Lm0/j0;Ln0/j2$a;Ln0/j2;)V

    return-void
.end method
