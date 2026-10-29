.class public final synthetic Lh8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lh8/c;

.field public final synthetic b:Lb8/o;

.field public final synthetic c:Ly7/j;

.field public final synthetic d:Lb8/i;


# direct methods
.method public synthetic constructor <init>(Lh8/c;Lb8/o;Ly7/j;Lb8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/a;->a:Lh8/c;

    iput-object p2, p0, Lh8/a;->b:Lb8/o;

    iput-object p3, p0, Lh8/a;->c:Ly7/j;

    iput-object p4, p0, Lh8/a;->d:Lb8/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lh8/a;->a:Lh8/c;

    iget-object v1, p0, Lh8/a;->b:Lb8/o;

    iget-object v2, p0, Lh8/a;->c:Ly7/j;

    iget-object v3, p0, Lh8/a;->d:Lb8/i;

    invoke-static {v0, v1, v2, v3}, Lh8/c;->c(Lh8/c;Lb8/o;Ly7/j;Lb8/i;)V

    return-void
.end method
