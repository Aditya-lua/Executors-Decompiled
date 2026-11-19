.class public Ldj/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcj/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldj/h;->j(Landroid/content/Context;Ljava/lang/String;Ldj/h$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldj/h$f;

.field public final synthetic b:Ldj/h;


# direct methods
.method public constructor <init>(Ldj/h;Ldj/h$f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ldj/h$b;->b:Ldj/h;

    iput-object p2, p0, Ldj/h$b;->a:Ldj/h$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Ldj/h$b;->a:Ldj/h$f;

    invoke-interface {v0}, Ldj/h$f;->a()V

    return-void
.end method
