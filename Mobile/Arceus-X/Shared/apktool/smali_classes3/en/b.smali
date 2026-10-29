.class public final synthetic Len/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Len/e;

.field public final synthetic b:Len/e$a;


# direct methods
.method public synthetic constructor <init>(Len/e;Len/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Len/b;->a:Len/e;

    iput-object p2, p0, Len/b;->b:Len/e$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Len/b;->a:Len/e;

    iget-object v1, p0, Len/b;->b:Len/e$a;

    invoke-static {v0, v1, p1, p2}, Len/c;->f(Len/e;Len/e$a;Landroid/content/DialogInterface;I)V

    return-void
.end method
