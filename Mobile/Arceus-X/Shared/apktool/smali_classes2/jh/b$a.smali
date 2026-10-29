.class public Ljh/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljh/b;


# direct methods
.method public constructor <init>(Ljh/b;)V
    .locals 0

    iput-object p1, p0, Ljh/b$a;->a:Ljh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Ljh/b$a;->a:Ljh/b;

    sget-object v1, Ljh/b$c;->a:Ljh/b$c;

    invoke-static {v0, v1}, Ljh/b;->a(Ljh/b;Ljh/b$c;)V

    iget-object v0, p0, Ljh/b$a;->a:Ljh/b;

    invoke-virtual {v0}, Ljh/b;->c()V

    return-void
.end method
