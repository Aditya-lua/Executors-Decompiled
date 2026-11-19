; std::__ndk1::chrono::system_clock::to_time_t @ 00bc2524
00bc2524	bti c
00bc2528	mov x9,#0x34db
00bc252c	ldr x8,[x0]
00bc2530	movk x9,#0xd7b6, LSL #16
00bc2534	movk x9,#0xde82, LSL #32
00bc2538	movk x9,#0x431b, LSL #48
00bc253c	smulh x8,x8,x9
00bc2540	asr x9,x8,#0x12
00bc2544	add x0,x9,x8, LSR #0x3f
00bc2548	ret
