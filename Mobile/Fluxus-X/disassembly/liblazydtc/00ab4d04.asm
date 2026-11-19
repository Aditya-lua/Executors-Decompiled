; PEM_read_bio_DSAPrivateKey @ 00ab4d04
00ab4d04	str x21,[sp, #-0x30]!
00ab4d08	stp x20,x19,[sp, #0x10]
00ab4d0c	mov x19,x1
00ab4d10	mov x1,xzr
00ab4d14	stp x29,x30,[sp, #0x20]
00ab4d18	add x29,sp,#0x20
00ab4d1c	bl 0x00c32640
00ab4d20	cbz x0,0x00ab4d50
00ab4d24	mov x21,x0
00ab4d28	bl 0x00c3d940
00ab4d2c	mov x20,x0
00ab4d30	mov x0,x21
00ab4d34	bl 0x00c32450
00ab4d38	cbz x20,0x00ab4d54
00ab4d3c	cbz x19,0x00ab4d54
00ab4d40	ldr x0,[x19]
00ab4d44	bl 0x00c3a0a0
00ab4d48	str x20,[x19]
00ab4d4c	b 0x00ab4d54
00ab4d50	mov x20,xzr
00ab4d54	mov x0,x20
00ab4d58	ldp x29,x30,[sp, #0x20]
00ab4d5c	ldp x20,x19,[sp, #0x10]
00ab4d60	ldr x21,[sp], #0x30
00ab4d64	ret
