package p477ut;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC7673c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p252io.FileWalkDirection;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;

/* JADX INFO: renamed from: ut.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0016\u0018Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m31665d2 = {"Lut/g;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/Function1;", "", "onEnter", "", "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", "onFail", "", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/File;", "b", "Lkotlin/io/FileWalkDirection;", "c", "Lkotlin/jvm/functions/Function1;", "d", "e", "Lkotlin/jvm/functions/Function2;", "f", "I", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11962g implements Sequence<File> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File start;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final FileWalkDirection direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function1<File, Boolean> onEnter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Function1<File, Unit> onLeave;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Function2<File, IOException, Unit> onFail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int maxDepth;

    /* JADX INFO: renamed from: ut.g$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lut/g$a;", "Lut/g$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* JADX INFO: renamed from: ut.g$b */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0010\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0082\u0010¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m31665d2 = {"Lut/g$b;", "Lkotlin/collections/c;", "Ljava/io/File;", "<init>", "(Lut/g;)V", "", "b", "()V", "root", "Lut/g$a;", "g", "(Ljava/io/File;)Lut/g$a;", "i", "()Ljava/io/File;", "Ljava/util/ArrayDeque;", "Lut/g$c;", "c", "Ljava/util/ArrayDeque;", "state", "a", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class b extends AbstractC7673c<File> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final ArrayDeque<c> state;

        /* JADX INFO: renamed from: ut.g$b$a */
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0015"}, m31665d2 = {"Lut/g$b$a;", "Lut/g$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lut/g$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "e", "failed", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public File[] fileList;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int fileIndex;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            public boolean failed;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ b f42405f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f42405f = bVar;
            }

            @Override // p477ut.C11962g.c
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo44641b() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = C11962g.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = C11962g.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new C11956a(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i10 = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.checkNotNull(fileArr2);
                        int i11 = this.fileIndex;
                        this.fileIndex = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function3 = C11962g.this.onLeave;
                if (function3 != null) {
                    function3.invoke(getRoot());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: ut.g$b$b, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lut/g$b$b;", "Lut/g$c;", "Ljava/io/File;", "rootFile", "<init>", "(Lut/g$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "visited", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public final class C14268b extends c {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean visited;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ b f42407c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14268b(@NotNull b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f42407c = bVar;
            }

            @Override // p477ut.C11962g.c
            @Nullable
            /* JADX INFO: renamed from: b */
            public File mo44641b() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: renamed from: ut.g$b$c */
        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lut/g$b$c;", "Lut/g$a;", "Ljava/io/File;", "rootDir", "<init>", "(Lut/g$b;Ljava/io/File;)V", "b", "()Ljava/io/File;", "", "Z", "rootVisited", "", "c", "[Ljava/io/File;", "fileList", "", "d", "I", "fileIndex", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            public boolean rootVisited;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            @Nullable
            public File[] fileList;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public int fileIndex;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ b f42411e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f42411e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // p477ut.C11962g.c
            @Nullable
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File mo44641b() {
                Function2 function2;
                if (!this.rootVisited) {
                    Function1 function1 = C11962g.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    this.rootVisited = true;
                    return getRoot();
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i10 = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i10 >= fileArr.length) {
                        Function1 function3 = C11962g.this.onLeave;
                        if (function3 != null) {
                            function3.invoke(getRoot());
                        }
                        return null;
                    }
                }
                if (this.fileList == null) {
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = C11962g.this.onFail) != null) {
                        function2.invoke(getRoot(), new C11956a(getRoot(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.fileList;
                    if (fileArr2 != null) {
                        Intrinsics.checkNotNull(fileArr2);
                    }
                    Function1 function4 = C11962g.this.onLeave;
                    if (function4 != null) {
                        function4.invoke(getRoot());
                    }
                    return null;
                }
                File[] fileArr3 = this.fileList;
                Intrinsics.checkNotNull(fileArr3);
                int i11 = this.fileIndex;
                this.fileIndex = i11 + 1;
                return fileArr3[i11];
            }
        }

        /* JADX INFO: renamed from: ut.g$b$d */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class d {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f42412a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f42412a = iArr;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (C11962g.this.start.isDirectory()) {
                arrayDeque.push(m44639g(C11962g.this.start));
            } else if (C11962g.this.start.isFile()) {
                arrayDeque.push(new C14268b(this, C11962g.this.start));
            } else {
                m31746d();
            }
        }

        @Override // kotlin.collections.AbstractC7673c
        /* JADX INFO: renamed from: b */
        public void mo31745b() {
            File fileM44640i = m44640i();
            if (fileM44640i != null) {
                m31747e(fileM44640i);
            } else {
                m31746d();
            }
        }

        /* JADX INFO: renamed from: g */
        public final a m44639g(File root) {
            int i10 = d.f42412a[C11962g.this.direction.ordinal()];
            if (i10 == 1) {
                return new c(this, root);
            }
            if (i10 == 2) {
                return new a(this, root);
            }
            throw new C7345l();
        }

        /* JADX INFO: renamed from: i */
        public final File m44640i() {
            while (true) {
                c cVarPeek = this.state.peek();
                if (cVarPeek == null) {
                    return null;
                }
                File fileMo44641b = cVarPeek.mo44641b();
                if (fileMo44641b == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.m31980c(fileMo44641b, cVarPeek.getRoot()) || !fileMo44641b.isDirectory() || this.state.size() >= C11962g.this.maxDepth) {
                        return fileMo44641b;
                    }
                    this.state.push(m44639g(fileMo44641b));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ut.g$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m31665d2 = {"Lut/g$c;", "", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "b", "()Ljava/io/File;", "a", "Ljava/io/File;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final File root;

        public c(@NotNull File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getRoot() {
            return this.root;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public abstract File mo44641b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C11962g(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function2, Function2<? super File, ? super IOException, Unit> function3, int i10) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function2;
        this.onFail = function3;
        this.maxDepth = i10;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
      (r8v0 java.io.File)
      (wrap kotlin.io.FileWalkDirection:0x0006: TERNARY null = ((wrap int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.io.FileWalkDirection:0x0004: SGET  A[WRAPPED] (LINE:8) kotlin.io.FileWalkDirection.a kotlin.io.FileWalkDirection) : (r9v0 kotlin.io.FileWalkDirection))
      (r10v0 kotlin.jvm.functions.Function1)
      (r11v0 kotlin.jvm.functions.Function1)
      (r12v0 kotlin.jvm.functions.Function2)
      (wrap int:?: TERNARY null = ((wrap int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r13v0 int))
     A[MD:(java.io.File, kotlin.io.FileWalkDirection, kotlin.jvm.functions.Function1<? super java.io.File, java.lang.Boolean>, kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit>, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, kotlin.Unit>, int):void (m)] (LINE:9) call: ut.g.<init>(java.io.File, kotlin.io.FileWalkDirection, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, int):void type: THIS */
    public /* synthetic */ C11962g(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function2, function3, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11962g(@NotNull File start, @NotNull FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }
}
