; EVP_PKEY_decapsulate @ 00a64eac
00a64eac	stp x29,x30,[sp, #-0x10]!
00a64eb0	mov w8,wzr
00a64eb4	mov x29,sp
00a64eb8	cbz x0,0x00a64f5c
00a64ebc	cbz x3,0x00a64f5c
00a64ec0	cbz x4,0x00a64f5c
00a64ec4	cbnz x1,0x00a64ed0
00a64ec8	mov w8,wzr
00a64ecc	cbz x2,0x00a64f5c
00a64ed0	ldr w8,[x0]
00a64ed4	cmp w8,#0x2, LSL #12
00a64ed8	b.ne 0x00a64ef8
00a64edc	ldr x8,[x0, #0x30]
00a64ee0	cbz x8,0x00a64f2c
00a64ee4	ldr x9,[x0, #0x28]
00a64ee8	mov x0,x8
00a64eec	ldr x5,[x9, #0x50]
00a64ef0	ldp x29,x30,[sp], #0x10
00a64ef4	br x5
00a64ef8	bl 0x00c342a0
00a64efc	adrp x0,0x2a2000
00a64f00	adrp x2,0x2a6000
00a64f04	add x0,x0,#0x3eb
00a64f08	add x2,x2,#0x3
00a64f0c	mov w1,#0xe1
00a64f10	bl 0x00c342b0
00a64f14	orr w0,wzr,#0x6
00a64f18	mov w1,#0x97
00a64f1c	mov x2,xzr
00a64f20	bl 0x00c342c0
00a64f24	mov w8,#0xffffffff
00a64f28	b 0x00a64f5c
00a64f2c	bl 0x00c342a0
00a64f30	adrp x0,0x2a2000
00a64f34	adrp x2,0x2a6000
00a64f38	add x0,x0,#0x3eb
00a64f3c	add x2,x2,#0x3
00a64f40	mov w1,#0xe6
00a64f44	bl 0x00c342b0
00a64f48	orr w0,wzr,#0x6
00a64f4c	mov w1,#0x96
00a64f50	mov x2,xzr
00a64f54	bl 0x00c342c0
00a64f58	orr w8,wzr,#0xfffffffe
00a64f5c	mov w0,w8
00a64f60	ldp x29,x30,[sp], #0x10
00a64f64	ret
