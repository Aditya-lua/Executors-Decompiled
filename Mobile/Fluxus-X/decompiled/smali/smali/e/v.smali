.class public final synthetic Le/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le/w;


# direct methods
.method public synthetic constructor <init>(Le/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/v;->a:Le/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/v;->a:Le/w;

    invoke-static {v0}, Le/w;->c(Le/w;)V

    return-void
.end method
