.class public Lv2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv2/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv2/g$c;

.field public final synthetic b:I

.field public final synthetic c:Lv2/a;


# direct methods
.method public constructor <init>(Lv2/a;Lv2/g$c;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv2/a$b;->c:Lv2/a;

    iput-object p2, p0, Lv2/a$b;->a:Lv2/g$c;

    iput p3, p0, Lv2/a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lv2/a$b;->a:Lv2/g$c;

    iget v1, p0, Lv2/a$b;->b:I

    invoke-virtual {v0, v1}, Lv2/g$c;->a(I)V

    return-void
.end method
