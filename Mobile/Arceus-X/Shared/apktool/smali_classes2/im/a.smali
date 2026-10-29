.class public final synthetic Lim/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lim/f;

.field public final synthetic b:Le/p;


# direct methods
.method public synthetic constructor <init>(Lim/f;Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim/a;->a:Lim/f;

    iput-object p2, p0, Lim/a;->b:Le/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lim/a;->a:Lim/f;

    iget-object v1, p0, Lim/a;->b:Le/p;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, v1, p1}, Lim/f;->e(Lim/f;Le/p;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
