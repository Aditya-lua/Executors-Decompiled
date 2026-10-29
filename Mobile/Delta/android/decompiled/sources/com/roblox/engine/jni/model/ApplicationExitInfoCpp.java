package com.roblox.engine.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class ApplicationExitInfoCpp {
    public String mDescription;
    public String mExitReason;
    public String mExitSubreason;
    public int mImportance;
    public int mPid;
    public long mPss;
    public long mRss;
    public int mSignal;
    public long mTimestamp;

    public ApplicationExitInfoCpp(int i10, long j10, String str) {
        this.mPid = i10;
        this.mTimestamp = j10;
        this.mExitReason = str;
    }

    public ApplicationExitInfoCpp(int i10, int i11, long j10, String str) {
        this.mPid = i10;
        this.mSignal = i11;
        this.mTimestamp = j10;
        this.mExitReason = str;
    }

    public ApplicationExitInfoCpp(int i10, int i11, long j10, String str, String str2, String str3, long j11, long j12, int i12) {
        this.mPid = i10;
        this.mSignal = i11;
        this.mTimestamp = j10;
        this.mExitReason = str;
        this.mExitSubreason = str2;
        this.mDescription = str3;
        this.mPss = j11;
        this.mRss = j12;
        this.mImportance = i12;
    }
}
