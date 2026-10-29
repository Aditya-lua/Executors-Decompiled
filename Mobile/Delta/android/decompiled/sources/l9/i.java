package l9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final j f23031a;

    public i(@NonNull j jVar) {
        this.f23031a = jVar;
    }

    @NonNull
    public static j c(@NonNull Activity activity) {
        return d(new h(activity));
    }

    @NonNull
    public static j d(@NonNull h hVar) {
        if (hVar.a()) {
            return a2.b2(hVar.d());
        }
        if (hVar.b()) {
            return x1.a(hVar.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void a(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
    }

    @NonNull
    public Activity b() {
        Activity activityF = this.f23031a.f();
        n9.m.l(activityF);
        return activityF;
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(@NonNull Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
