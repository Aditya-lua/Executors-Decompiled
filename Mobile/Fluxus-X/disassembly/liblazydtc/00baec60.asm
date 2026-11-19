; mbedtls_sha3_starts @ 00baec60
00baec60	sub w8,w1,#0x1
00baec64	cmp w8,#0x3
00baec68	b.hi 0x00baecc4
00baec6c	stp x29,x30,[sp, #-0x10]!
00baec70	mov x29,sp
00baec74	mov x9,#0x1c
00baec78	mov x10,#0x90
00baec7c	movk x9,#0x20, LSL #16
00baec80	movk x10,#0x88, LSL #16
00baec84	mov w8,w8
00baec88	movk x9,#0x30, LSL #32
00baec8c	movk x10,#0x68, LSL #32
00baec90	movk x9,#0x40, LSL #48
00baec94	movk x10,#0x48, LSL #48
00baec98	lsl x8,x8,#0x4
00baec9c	lsr x9,x9,x8
00baeca0	lsr x8,x10,x8
00baeca4	mov w2,#0xcc
00baeca8	mov w1,wzr
00baecac	strh w9,[x0, #0xcc]
00baecb0	strh w8,[x0, #0xce]
00baecb4	bl 0x00c301c0
00baecb8	mov w0,wzr
00baecbc	ldp x29,x30,[sp], #0x10
00baecc0	ret
00baecc4	mov w0,#0xffffff8a
00baecc8	ret
