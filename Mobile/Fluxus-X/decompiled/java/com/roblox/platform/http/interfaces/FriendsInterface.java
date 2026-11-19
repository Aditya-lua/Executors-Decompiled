package com.roblox.platform.http.interfaces;

import mv.i0;
import sw.d;
import vw.o;
import vw.s;

/* JADX INFO: loaded from: classes2.dex */
public interface FriendsInterface {
    @o("/v1/users/{requesterUserId}/accept-friend-request")
    d<i0> acceptFriendRequest(@s("requesterUserId") long j10);

    @o("/v1/users/{requesterUserId}/decline-friend-request")
    d<i0> declineFriendRequest(@s("requesterUserId") long j10);
}
