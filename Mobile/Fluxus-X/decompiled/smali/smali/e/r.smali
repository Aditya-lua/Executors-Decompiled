.class public final synthetic Le/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/p$f;

.field public final synthetic b:I

.field public final synthetic c:Lh/a$a;


# direct methods
.method public synthetic constructor <init>(Le/p$f;ILh/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/r;->a:Le/p$f;

    iput p2, p0, Le/r;->b:I

    iput-object p3, p0, Le/r;->c:Lh/a$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Le/r;->a:Le/p$f;

    iget v1, p0, Le/r;->b:I

    iget-object v2, p0, Le/r;->c:Lh/a$a;

    invoke-static {v0, v1, v2}, Le/p$f;->t(Le/p$f;ILh/a$a;)V

    return-void
.end method
