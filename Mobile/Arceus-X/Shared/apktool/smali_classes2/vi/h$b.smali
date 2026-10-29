.class public Lvi/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lui/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvi/h;->j(Landroid/content/Context;Ljava/lang/String;Lvi/h$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lvi/h$f;

.field public final synthetic b:Lvi/h;


# direct methods
.method public constructor <init>(Lvi/h;Lvi/h$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lvi/h$b;->b:Lvi/h;

    iput-object p2, p0, Lvi/h$b;->a:Lvi/h$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lvi/h$b;->a:Lvi/h$f;

    invoke-interface {v0}, Lvi/h$f;->a()V

    return-void
.end method
