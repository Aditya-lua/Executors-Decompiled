package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.roblox.client.personasdk.BuildConfig;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AFb1kSDK {

    public static final class AFa1tSDK {
        public final boolean AFLogger;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5234d;

        public AFa1tSDK(String str, boolean z10) {
            this.f5234d = str;
            this.AFLogger = z10;
        }
    }

    public static final class AFa1ySDK implements ServiceConnection {
        final LinkedBlockingQueue<IBinder> registerClient = new LinkedBlockingQueue<>(1);
        boolean AFLogger = false;

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.registerClient.put(iBinder);
            } catch (InterruptedException e10) {
                AFLogger.INSTANCE.e(LogTag.ADVERTISING_ID, "onServiceConnected Interrupted", e10, false, false);
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public static final class AFa1zSDK implements IInterface {
        private final IBinder registerClient;

        public AFa1zSDK(IBinder iBinder) {
            this.registerClient = iBinder;
        }

        public final String AFKeystoreWrapper() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.registerClient.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        public final boolean AFLogger() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.registerClient.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.registerClient;
        }
    }

    public static AFa1tSDK registerClient(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo(BuildConfig.STORE_PACKAGE, 0);
        AFa1ySDK aFa1ySDK = new AFa1ySDK();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        try {
            if (!context.bindService(intent, aFa1ySDK, 1)) {
                context.unbindService(aFa1ySDK);
                throw new IOException("Google Play connection failed");
            }
            if (aFa1ySDK.AFLogger) {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
            aFa1ySDK.AFLogger = true;
            IBinder iBinderPoll = aFa1ySDK.registerClient.poll(10L, TimeUnit.SECONDS);
            if (iBinderPoll == null) {
                throw new TimeoutException("Timed out waiting for the service connection");
            }
            AFa1zSDK aFa1zSDK = new AFa1zSDK(iBinderPoll);
            AFa1tSDK aFa1tSDK = new AFa1tSDK(aFa1zSDK.AFKeystoreWrapper(), aFa1zSDK.AFLogger());
            context.unbindService(aFa1ySDK);
            return aFa1tSDK;
        } catch (Throwable th2) {
            context.unbindService(aFa1ySDK);
            throw th2;
        }
    }
}
