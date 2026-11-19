; engine_unlocked_init @ 00a50f0c
00a50f0c	str x19,[sp, #-0x20]!
00a50f10	stp x29,x30,[sp, #0x10]
00a50f14	ldr w8,[x0, #0xa0]
00a50f18	mov x19,x0
00a50f1c	add x29,sp,#0x10
00a50f20	cbz w8,0x00a50f54
00a50f24	mov w0,#0x1
00a50f28	add x8,x19,#0x9c
00a50f2c	ldaxr w9,[x8]
00a50f30	add w9,w9,#0x1
00a50f34	stlxr w10,w9,[x8]
00a50f38	cbnz w10,0x00a50f2c
00a50f3c	ldr w8,[x19, #0xa0]
00a50f40	add w8,w8,#0x1
00a50f44	str w8,[x19, #0xa0]
00a50f48	ldp x29,x30,[sp, #0x10]
00a50f4c	ldr x19,[sp], #0x20
00a50f50	ret
00a50f54	ldr x8,[x19, #0x60]
00a50f58	cbz x8,0x00a50f24
00a50f5c	mov x0,x19
00a50f60	blr x8
00a50f64	cbnz w0,0x00a50f28
00a50f68	b 0x00a50f48
