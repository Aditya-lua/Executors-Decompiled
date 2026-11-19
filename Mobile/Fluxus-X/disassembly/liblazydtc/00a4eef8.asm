; OSSL_DECODER_is_a @ 00a4eef8
00a4eef8	stp x20,x19,[sp, #-0x20]!
00a4eefc	stp x29,x30,[sp, #0x10]
00a4ef00	mov x19,x0
00a4ef04	ldr x0,[x0]
00a4ef08	add x29,sp,#0x10
00a4ef0c	cbz x0,0x00a4ef30
00a4ef10	mov x20,x1
00a4ef14	bl 0x00c3b2f0
00a4ef18	bl 0x00c3b650
00a4ef1c	mov x1,x20
00a4ef20	bl 0x00c3b620
00a4ef24	ldr w8,[x19, #0x8]
00a4ef28	cmp w0,w8
00a4ef2c	cset w0,eq
00a4ef30	ldp x29,x30,[sp, #0x10]
00a4ef34	ldp x20,x19,[sp], #0x20
00a4ef38	ret
