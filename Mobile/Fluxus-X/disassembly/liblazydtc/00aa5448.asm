; CRYPTO_THREAD_lock_free @ 00aa5448
00aa5448	cbz x0,0x00aa547c
00aa544c	str x19,[sp, #-0x20]!
00aa5450	stp x29,x30,[sp, #0x10]
00aa5454	add x29,sp,#0x10
00aa5458	mov x19,x0
00aa545c	bl 0x00c3ed20
00aa5460	ldp x29,x30,[sp, #0x10]
00aa5464	adrp x1,0x2d1000
00aa5468	add x1,x1,#0xde8
00aa546c	mov w2,#0x93
00aa5470	mov x0,x19
00aa5474	ldr x19,[sp], #0x20
00aa5478	b 0x00c32310
00aa547c	ret
