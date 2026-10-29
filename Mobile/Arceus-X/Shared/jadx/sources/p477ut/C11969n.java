package p477ut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p201iu.C6985m;

/* JADX INFO: renamed from: ut.n */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "", "action", "d", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)V", "", "f", "(Ljava/io/Reader;)Ljava/util/List;", "Ljava/io/BufferedReader;", "Lkotlin/sequences/Sequence;", "e", "(Ljava/io/BufferedReader;)Lkotlin/sequences/Sequence;", "h", "(Ljava/io/Reader;)Ljava/lang/String;", "Ljava/io/Writer;", "out", "", "bufferSize", "", "b", "(Ljava/io/Reader;Ljava/io/Writer;I)J", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11969n {
    /* JADX INFO: renamed from: b */
    public static final long m44665b(@NotNull Reader reader, @NotNull Writer out, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i10];
        int i11 = reader.read(cArr);
        long j10 = 0;
        while (i11 >= 0) {
            out.write(cArr, 0, i11);
            j10 += (long) i11;
            i11 = reader.read(cArr);
        }
        return j10;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m44666c(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m44665b(reader, writer, i10);
    }

    /* JADX INFO: renamed from: d */
    public static final void m44667d(@NotNull Reader reader, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<String> it = m44668e(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f29331a;
            C11958c.m44629a(bufferedReader, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final Sequence<String> m44668e(@NotNull BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return C6985m.m29377f(new C11967l(bufferedReader));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final List<String> m44669f(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        final ArrayList arrayList = new ArrayList();
        m44667d(reader, new Function1() { // from class: ut.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11969n.m44670g(arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m44670g(ArrayList arrayList, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        arrayList.add(it);
        return Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m44671h(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m44666c(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
