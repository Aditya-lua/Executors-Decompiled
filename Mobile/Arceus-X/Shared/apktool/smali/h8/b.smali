.class public final synthetic Lh8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk8/b$a;


# instance fields
.field public final synthetic a:Lh8/c;

.field public final synthetic b:Lb8/o;

.field public final synthetic c:Lb8/i;


# direct methods
.method public synthetic constructor <init>(Lh8/c;Lb8/o;Lb8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/b;->a:Lh8/c;

    iput-object p2, p0, Lh8/b;->b:Lb8/o;

    iput-object p3, p0, Lh8/b;->c:Lb8/i;

    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh8/b;->a:Lh8/c;

    iget-object v1, p0, Lh8/b;->b:Lb8/o;

    iget-object v2, p0, Lh8/b;->c:Lb8/i;

    invoke-static {v0, v1, v2}, Lh8/c;->b(Lh8/c;Lb8/o;Lb8/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
