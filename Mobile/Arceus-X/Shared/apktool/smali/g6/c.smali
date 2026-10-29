.class public final synthetic Lg6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/work/impl/WorkDatabase;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ly5/f1;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/c;->a:Landroidx/work/impl/WorkDatabase;

    iput-object p2, p0, Lg6/c;->b:Ljava/lang/String;

    iput-object p3, p0, Lg6/c;->c:Ly5/f1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg6/c;->a:Landroidx/work/impl/WorkDatabase;

    iget-object v1, p0, Lg6/c;->b:Ljava/lang/String;

    iget-object v2, p0, Lg6/c;->c:Ly5/f1;

    invoke-static {v0, v1, v2}, Lg6/h;->b(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;Ly5/f1;)V

    return-void
.end method
