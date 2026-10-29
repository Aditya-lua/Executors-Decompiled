package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.R;
import com.withpersona.sdk2.inquiry.steps.ui.components.SelectedFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import ym.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0016(Bo\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b\u0012$\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00152\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010\u0010\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R2\u0010\u0011\u001a \b\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&¨\u0006)"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h;", "Lym/o;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "Lvr/h;", "", "key", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "", "launchPicker", "Lkotlin/Function1;", "Lnt/b;", "", "Landroid/net/Uri;", "", "collectResult", "checkPendingResult", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "otherWorker", "", "b", "(Lym/o;)Z", "c", "(Lvr/h;)Z", "Lnu/h;", "run", "()Lnu/h;", "Lnu/i;", "uris", "h", "(Lnu/i;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "Landroid/content/Context;", "d", "Lkotlin/jvm/functions/Function0;", "e", "Lkotlin/jvm/functions/Function1;", "f", "a", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements o<b>, vr.h<b> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function0<Unit> launchPicker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<nt.b<? super List<? extends Uri>>, Object> collectResult;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<nt.b<? super List<? extends Uri>>, Object> checkPendingResult;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$a;", "", "Lg/c;", "", "", "openMultipleDocumentsLauncher", "openSingleDocumentLauncher", "Landroid/content/Context;", "context", "<init>", "(Lg/c;Lg/c;Landroid/content/Context;)V", "componentName", "allowedFileTypes", "", "fileUploadLimit", "Lcom/withpersona/sdk2/inquiry/ui/h;", "b", "(Ljava/lang/String;[Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/ui/h;", "a", "Lg/c;", "c", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g.c<String[]> openMultipleDocumentsLauncher;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g.c<String[]> openSingleDocumentLauncher;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$2", f = "UiStepFileSelectWorker.kt", l = {116, 119}, m = "invokeSuspend")
        public static final class C0254a extends m implements Function1<nt.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13877t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f13878u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0254a(int i10, nt.b<? super C0254a> bVar) {
                super(1, bVar);
                this.f13878u = i10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new C0254a(this.f13878u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r4.f13877t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jt.o.b(r5)
                    goto L4f
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    jt.o.b(r5)
                    goto L33
                L1e:
                    jt.o.b(r5)
                    int r5 = r4.f13878u
                    if (r5 != r3) goto L41
                    mp.u r5 = new mp.u
                    r5.<init>()
                    r4.f13877t = r3
                    java.lang.Object r5 = nu.j.u(r5, r4)
                    if (r5 != r0) goto L33
                    goto L4e
                L33:
                    android.net.Uri r5 = (android.net.Uri) r5
                    if (r5 == 0) goto L3c
                    java.util.List r5 = kotlin.collections.o.d(r5)
                    return r5
                L3c:
                    java.util.List r5 = kotlin.collections.p.k()
                    return r5
                L41:
                    mp.v r5 = new mp.v
                    r5.<init>()
                    r4.f13877t = r2
                    java.lang.Object r5 = nu.j.u(r5, r4)
                    if (r5 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    java.util.List r5 = (java.util.List) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.a.C0254a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super List<? extends Uri>> bVar) {
                return ((C0254a) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;"}, k = 3, mv = {2, 2, 0}, xi = 48)
        @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$Factory$create$3", f = "UiStepFileSelectWorker.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMajor, 127}, m = "invokeSuspend")
        public static final class b extends m implements Function1<nt.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13879t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f13880u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i10, nt.b<? super b> bVar) {
                super(1, bVar);
                this.f13880u = i10;
            }

            @Override // pt.a
            public final nt.b<Unit> create(nt.b<?> bVar) {
                return new b(this.f13880u, bVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r5 == r0) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
            
                if (r5 == r0) goto L23;
             */
            @Override // pt.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = ot.c.e()
                    int r1 = r4.f13879t
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    jt.o.b(r5)
                    goto L4c
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1a:
                    jt.o.b(r5)
                    goto L33
                L1e:
                    jt.o.b(r5)
                    int r5 = r4.f13880u
                    if (r5 != r3) goto L3e
                    mp.u r5 = new mp.u
                    r5.<init>()
                    r4.f13879t = r3
                    java.lang.Object r5 = nu.j.v(r5, r4)
                    if (r5 != r0) goto L33
                    goto L4b
                L33:
                    android.net.Uri r5 = (android.net.Uri) r5
                    if (r5 == 0) goto L3c
                    java.util.List r5 = kotlin.collections.o.d(r5)
                    return r5
                L3c:
                    r5 = 0
                    return r5
                L3e:
                    mp.v r5 = new mp.v
                    r5.<init>()
                    r4.f13879t = r2
                    java.lang.Object r5 = nu.j.v(r5, r4)
                    if (r5 != r0) goto L4c
                L4b:
                    return r0
                L4c:
                    java.util.List r5 = (java.util.List) r5
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(nt.b<? super List<? extends Uri>> bVar) {
                return ((b) create(bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public a(@NotNull g.c<String[]> openMultipleDocumentsLauncher, @NotNull g.c<String[]> openSingleDocumentLauncher, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(openMultipleDocumentsLauncher, "openMultipleDocumentsLauncher");
            Intrinsics.checkNotNullParameter(openSingleDocumentLauncher, "openSingleDocumentLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            this.openMultipleDocumentsLauncher = openMultipleDocumentsLauncher;
            this.openSingleDocumentLauncher = openSingleDocumentLauncher;
            this.context = context;
        }

        public static final Unit c(int i10, a aVar, String[] strArr) {
            if (i10 == 1) {
                aVar.openSingleDocumentLauncher.b(strArr);
            } else {
                aVar.openMultipleDocumentsLauncher.b(strArr);
            }
            return Unit.f22483a;
        }

        @NotNull
        public final h b(@NotNull String componentName, @NotNull final String[] allowedFileTypes, final int fileUploadLimit) {
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            Intrinsics.checkNotNullParameter(allowedFileTypes, "allowedFileTypes");
            return new h("FileUploadPicker-" + componentName, this.context, new Function0() { // from class: or.a4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.withpersona.sdk2.inquiry.ui.h.a.c(fileUploadLimit, this, allowedFileTypes);
                }
            }, new C0254a(fileUploadLimit, null), new b(fileUploadLimit, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<init>", "()V", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$a;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final a f13881a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$b;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "<init>", "()V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0255b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0255b f13882a = new C0255b();

            public C0255b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.ui.h$b$c, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/h$b$c;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SelectedFile;", "files", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            @NotNull
            public final List<SelectedFile> files;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull List<SelectedFile> files) {
                super(null);
                Intrinsics.checkNotNullParameter(files, "files");
                this.files = files;
            }

            @NotNull
            public final List<SelectedFile> a() {
                return this.files;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.c(this.files, ((Success) other).files);
            }

            public int hashCode() {
                return this.files.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(files=" + this.files + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lcom/withpersona/sdk2/inquiry/ui/h$b;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1", f = "UiStepFileSelectWorker.kt", l = {42, 46, 50, 54, 55}, m = "invokeSuspend")
    public static final class c extends m implements Function2<nu.i<? super b>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13884t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13885u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13886v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f13887w;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1", f = "UiStepFileSelectWorker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13889t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h f13890u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(h hVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f13890u = hVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f13890u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f13889t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                this.f13890u.launchPicker.invoke();
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "Landroid/net/Uri;", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$pendingResult$1", f = "UiStepFileSelectWorker.kt", l = {43}, m = "invokeSuspend")
        public static final class b extends m implements Function2<p0, nt.b<? super List<? extends Uri>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f13891t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ h f13892u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h hVar, nt.b<? super b> bVar) {
                super(2, bVar);
                this.f13892u = hVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new b(this.f13892u, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f13891t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    return obj;
                }
                jt.o.b(obj);
                Function1 function1 = this.f13892u.checkPendingResult;
                this.f13891t = 1;
                Object objInvoke = function1.invoke(this);
                return objInvoke == objE ? objE : objInvoke;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, nt.b<? super List<? extends Uri>> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = h.this.new c(bVar);
            cVar.f13887w = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00b8 A[PHI: r2 r11
          0x00b8: PHI (r2v7 java.util.List) = (r2v6 java.util.List), (r2v13 java.util.List) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x00b8: PHI (r11v10 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:31:0x00b5, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r2.h(r0, r11, r10) == r1) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
        
            if (r3.h(r0, r11, r10) == r1) goto L35;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.ui.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nu.i<? super b> iVar, nt.b<? super Unit> bVar) {
            return ((c) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull String key, @NotNull Context context, @NotNull Function0<Unit> launchPicker, @NotNull Function1<? super nt.b<? super List<? extends Uri>>, ? extends Object> collectResult, @NotNull Function1<? super nt.b<? super List<? extends Uri>>, ? extends Object> checkPendingResult) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        Intrinsics.checkNotNullParameter(collectResult, "collectResult");
        Intrinsics.checkNotNullParameter(checkPendingResult, "checkPendingResult");
        this.key = key;
        this.context = context;
        this.launchPicker = launchPicker;
        this.collectResult = collectResult;
        this.checkPendingResult = checkPendingResult;
    }

    @Override // vr.h
    public boolean a(@NotNull vr.h<?> hVar) {
        return super.a(hVar);
    }

    @Override // ym.o
    public boolean b(@NotNull o<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof h) && Intrinsics.c(this.key, ((h) otherWorker).key);
    }

    @Override // vr.h
    public boolean c(@NotNull vr.h<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof h) && Intrinsics.c(this.key, ((h) otherWorker).key);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:52:0x006b A[SYNTHETIC] */
    public final Object h(nu.i<? super b> iVar, List<? extends Uri> list, nt.b<? super Unit> bVar) {
        String string;
        int columnIndex;
        if (list.isEmpty()) {
            Object objEmit = iVar.emit(b.a.f13881a, bVar);
            return objEmit == ot.c.e() ? objEmit : Unit.f22483a;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            Cursor cursorQuery = this.context.getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    ut.c.a(cursorQuery, null);
                    if (string == null) {
                        string = uri.getLastPathSegment();
                        if (string == null) {
                            string = "file";
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ut.c.a(cursorQuery, th2);
                        throw th3;
                    }
                }
            } else {
                string = uri.getLastPathSegment();
                if (string == null) {
                    string = "file";
                }
            }
            arrayList.add(new SelectedFile(uri, string));
        }
        if (arrayList.isEmpty()) {
            Object objEmit2 = iVar.emit(b.C0255b.f13882a, bVar);
            return objEmit2 == ot.c.e() ? objEmit2 : Unit.f22483a;
        }
        Object objEmit3 = iVar.emit(new b.Success(arrayList), bVar);
        return objEmit3 == ot.c.e() ? objEmit3 : Unit.f22483a;
    }

    @Override // ym.o, vr.h
    @NotNull
    public nu.h<b> run() {
        return nu.j.y(nu.j.w(new c(null)), g1.b());
    }
}
