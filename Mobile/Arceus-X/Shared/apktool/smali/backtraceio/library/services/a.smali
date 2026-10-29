.class public final synthetic Lbacktraceio/library/services/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/FileFilter;


# instance fields
.field public final synthetic a:Ljava/util/regex/Pattern;


# direct methods
.method public synthetic constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbacktraceio/library/services/a;->a:Ljava/util/regex/Pattern;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 1

    iget-object v0, p0, Lbacktraceio/library/services/a;->a:Ljava/util/regex/Pattern;

    invoke-static {v0, p1}, Lbacktraceio/library/services/BacktraceDatabaseFileContext;->a(Ljava/util/regex/Pattern;Ljava/io/File;)Z

    move-result p1

    return p1
.end method
