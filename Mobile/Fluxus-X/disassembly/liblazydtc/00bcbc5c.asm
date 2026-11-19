; std::__ndk1::error_category::equivalent @ 00bcbc5c
00bcbc5c	bti c
00bcbc60	ldr x8,[x1, #0x8]
00bcbc64	ldr w9,[x1]
00bcbc68	cmp x0,x8
00bcbc6c	ccmp w9,w2,#0x0,eq
00bcbc70	cset w0,eq
00bcbc74	ret
