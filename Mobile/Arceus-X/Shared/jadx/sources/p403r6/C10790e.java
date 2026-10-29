package p403r6;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7466h0;
import p239k6.C7468i0;
import p537x6.Options;

/* JADX INFO: renamed from: r6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lr6/e;", "Lr6/c;", "", "Lk6/h0;", "<init>", "()V", "data", "Lx6/p;", "options", "c", "(ILx6/p;)Lk6/h0;", "Landroid/content/Context;", "context", "", "b", "(ILandroid/content/Context;)Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10790e implements InterfaceC10788c<Integer, C7466h0> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, x6.p] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p403r6.InterfaceC10788c
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ C7466h0 mo41117a(Integer num, Options options) {
        return m41122c(num.intValue(), options);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m41121b(int data, Context context) {
        try {
            return context.getResources().getResourceEntryName(data) != null;
        } catch (Resources.NotFoundException unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public C7466h0 m41122c(int data, @NotNull Options options) {
        if (!m41121b(data, options.getContext())) {
            return null;
        }
        return C7468i0.m31031j("android.resource://" + options.getContext().getPackageName() + '/' + data, null, 1, null);
    }
}
