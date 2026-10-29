package p268l9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p305n9.C8953m;

/* JADX INFO: renamed from: l9.i */
/* JADX INFO: loaded from: classes.dex */
public class C8042i {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC8045j f30023a;

    public C8042i(@NonNull InterfaceC8045j interfaceC8045j) {
        this.f30023a = interfaceC8045j;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC8045j m33175c(@NonNull Activity activity) {
        return m33176d(new C8039h(activity));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static InterfaceC8045j m33176d(@NonNull C8039h c8039h) {
        if (c8039h.m33171a()) {
            return C8020a2.m33111b2(c8039h.m33174d());
        }
        if (c8039h.m33172b()) {
            return FragmentC8089x1.m33295a(c8039h.m33173c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* JADX INFO: renamed from: a */
    public void m33177a(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Activity m33178b() {
        Activity activityMo33113f = this.f30023a.mo33113f();
        C8953m.m36047l(activityMo33113f);
        return activityMo33113f;
    }

    /* JADX INFO: renamed from: e */
    public void mo33179e(int i10, int i11, Intent intent) {
    }

    /* JADX INFO: renamed from: f */
    public void mo33180f(Bundle bundle) {
    }

    /* JADX INFO: renamed from: g */
    public void m33181g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo33104h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo33182i(@NonNull Bundle bundle) {
    }

    /* JADX INFO: renamed from: j */
    public void mo33105j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo33106k() {
    }
}
