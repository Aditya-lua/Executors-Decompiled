.class public Lii/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lii/a$a;->onItemSet(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lii/a$a;


# direct methods
.method public constructor <init>(Lii/a$a;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lii/a$a$a;->b:Lii/a$a;

    iput-object p2, p0, Lii/a$a$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lii/a$a$a;->b:Lii/a$a;

    iget-object v0, v0, Lii/a$a;->a:Lii/a;

    iget-object v1, p0, Lii/a$a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lii/a;->b(Ljava/lang/String;)V

    return-void
.end method
