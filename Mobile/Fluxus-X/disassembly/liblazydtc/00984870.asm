; ix::Socket::isWakeUpFromPollSupported @ 00984870
00984870	str x19,[sp, #-0x20]!
00984874	stp x29,x30,[sp, #0x10]
00984878	add x29,sp,#0x10
0098487c	mov x19,x0
00984880	ldr x0,[x0, #0x38]
00984884	ldr x8,[x0]
00984888	ldr x8,[x8, #0x30]
0098488c	blr x8
00984890	cmn w0,#0x1
00984894	b.eq 0x009848a0
00984898	mov w0,#0x1
0098489c	b 0x009848b8
009848a0	ldr x0,[x19, #0x38]
009848a4	ldr x8,[x0]
009848a8	ldr x8,[x8, #0x38]
009848ac	blr x8
009848b0	cmp x0,#0x0
009848b4	cset w0,ne
009848b8	ldp x29,x30,[sp, #0x10]
009848bc	ldr x19,[sp], #0x20
009848c0	ret
