.class public final synthetic Lbh/v1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lf4/v;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lf4/v;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbh/v1;->a:Lf4/v;

    iput-object p2, p0, Lbh/v1;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lbh/v1;->a:Lf4/v;

    iget-object v1, p0, Lbh/v1;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lbh/y1;->f2(Lf4/v;Ljava/lang/String;Landroid/content/DialogInterface;I)V

    return-void
.end method
