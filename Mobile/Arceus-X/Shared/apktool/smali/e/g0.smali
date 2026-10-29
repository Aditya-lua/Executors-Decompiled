.class public final synthetic Le/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/h0;


# direct methods
.method public synthetic constructor <init>(Le/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/g0;->a:Le/h0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/g0;->a:Le/h0;

    invoke-static {v0}, Le/h0;->a(Le/h0;)V

    return-void
.end method
