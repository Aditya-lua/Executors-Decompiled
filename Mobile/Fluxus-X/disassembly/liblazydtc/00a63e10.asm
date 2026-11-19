; EVP_KEYEXCH_is_a @ 00a63e10
00a63e10	cbz x0,0x00a63e40
00a63e14	stp x29,x30,[sp, #-0x10]!
00a63e18	ldr x8,[x0, #0x18]
00a63e1c	mov x3,x1
00a63e20	ldr w1,[x0]
00a63e24	mov x2,xzr
00a63e28	mov x0,x8
00a63e2c	mov x29,sp
00a63e30	bl 0x00c3bf70
00a63e34	cmp w0,#0x0
00a63e38	cset w0,ne
00a63e3c	ldp x29,x30,[sp], #0x10
00a63e40	ret
