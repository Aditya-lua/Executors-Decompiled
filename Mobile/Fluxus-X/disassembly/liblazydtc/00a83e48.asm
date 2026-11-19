; CRYPTO_set_ex_data @ 00a83e48
00a83e48	stp x22,x21,[sp, #-0x30]!
00a83e4c	stp x20,x19,[sp, #0x10]
00a83e50	stp x29,x30,[sp, #0x20]
00a83e54	mov x21,x0
00a83e58	ldr x0,[x21, #0x8]!
00a83e5c	mov x19,x2
00a83e60	mov w20,w1
00a83e64	add x29,sp,#0x20
00a83e68	cbnz x0,0x00a83e78
00a83e6c	bl 0x00c34780
00a83e70	str x0,[x21]
00a83e74	cbz x0,0x00a83f14
00a83e78	bl 0x00c325e0
00a83e7c	ldr x8,[x21]
00a83e80	cmp w0,w20
00a83e84	b.gt 0x00a83eac
00a83e88	sub w22,w0,#0x1
00a83e8c	mov x0,x8
00a83e90	mov x1,xzr
00a83e94	bl 0x00c347a0
00a83e98	cbz w0,0x00a83ef8
00a83e9c	ldr x8,[x21]
00a83ea0	add w22,w22,#0x1
00a83ea4	cmp w22,w20
00a83ea8	b.lt 0x00a83e8c
00a83eac	mov x0,x8
00a83eb0	mov w1,w20
00a83eb4	mov x2,x19
00a83eb8	bl 0x00c38080
00a83ebc	cmp x0,x19
00a83ec0	b.eq 0x00a83ef0
00a83ec4	bl 0x00c342a0
00a83ec8	adrp x0,0x2a6000
00a83ecc	adrp x2,0x2aa000
00a83ed0	add x0,x0,#0xa7
00a83ed4	add x2,x2,#0x2a7
00a83ed8	mov w1,#0x1e6
00a83edc	bl 0x00c342b0
00a83ee0	mov w1,#0x106
00a83ee4	orr w0,wzr,#0xf
00a83ee8	movk w1,#0x8, LSL #16
00a83eec	b 0x00a83f3c
00a83ef0	mov w0,#0x1
00a83ef4	b 0x00a83f48
00a83ef8	bl 0x00c342a0
00a83efc	adrp x0,0x2a6000
00a83f00	adrp x2,0x2aa000
00a83f04	add x0,x0,#0xa7
00a83f08	add x2,x2,#0x2a7
00a83f0c	orr w1,wzr,#0x1e0
00a83f10	b 0x00a83f2c
00a83f14	bl 0x00c342a0
00a83f18	adrp x0,0x2a6000
00a83f1c	adrp x2,0x2aa000
00a83f20	add x0,x0,#0xa7
00a83f24	add x2,x2,#0x2a7
00a83f28	mov w1,#0x1d9
00a83f2c	bl 0x00c342b0
00a83f30	mov w1,#0x100
00a83f34	orr w0,wzr,#0xf
00a83f38	movk w1,#0xc, LSL #16
00a83f3c	mov x2,xzr
00a83f40	bl 0x00c342c0
00a83f44	mov w0,wzr
00a83f48	ldp x29,x30,[sp, #0x20]
00a83f4c	ldp x20,x19,[sp, #0x10]
00a83f50	ldp x22,x21,[sp], #0x30
00a83f54	ret
