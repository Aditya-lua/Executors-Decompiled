; EVP_PKEY_new @ 00a6edc4
00a6edc4	stp x20,x19,[sp, #-0x20]!
00a6edc8	adrp x1,0x2c1000
00a6edcc	add x1,x1,#0xcf9
00a6edd0	mov w0,#0x98
00a6edd4	mov w2,#0x5a7
00a6edd8	stp x29,x30,[sp, #0x10]
00a6eddc	add x29,sp,#0x10
00a6ede0	bl 0x00c34250
00a6ede4	mov x19,x0
00a6ede8	cbz x0,0x00a6ee3c
00a6edec	add x8,x19,#0x30
00a6edf0	mov w20,#0x1
00a6edf4	str xzr,[x19]
00a6edf8	stlr w20,[x8]
00a6edfc	bl 0x00c34d50
00a6ee00	str x0,[x19, #0x38]
00a6ee04	cbz x0,0x00a6ee70
00a6ee08	add x2,x19,#0x50
00a6ee0c	mov w0,#0x11
00a6ee10	mov x1,x19
00a6ee14	str w20,[x19, #0x48]
00a6ee18	bl 0x00c356e0
00a6ee1c	cbnz w0,0x00a6eec0
00a6ee20	bl 0x00c342a0
00a6ee24	adrp x0,0x2c1000
00a6ee28	adrp x2,0x2c9000
00a6ee2c	add x0,x0,#0xcf9
00a6ee30	add x2,x2,#0x9d5
00a6ee34	mov w1,#0x5bb
00a6ee38	b 0x00a6ee88
00a6ee3c	bl 0x00c342a0
00a6ee40	adrp x0,0x2c1000
00a6ee44	adrp x2,0x2c9000
00a6ee48	add x0,x0,#0xcf9
00a6ee4c	add x2,x2,#0x9d5
00a6ee50	mov w1,#0x5aa
00a6ee54	bl 0x00c342b0
00a6ee58	mov w1,#0x100
00a6ee5c	orr w0,wzr,#0x6
00a6ee60	movk w1,#0xc, LSL #16
00a6ee64	mov x2,xzr
00a6ee68	bl 0x00c342c0
00a6ee6c	b 0x00a6eec0
00a6ee70	bl 0x00c342a0
00a6ee74	adrp x0,0x2c1000
00a6ee78	adrp x2,0x2c9000
00a6ee7c	add x0,x0,#0xcf9
00a6ee80	add x2,x2,#0x9d5
00a6ee84	mov w1,#0x5b4
00a6ee88	bl 0x00c342b0
00a6ee8c	mov w1,#0x100
00a6ee90	orr w0,wzr,#0x6
00a6ee94	movk w1,#0xc, LSL #16
00a6ee98	mov x2,xzr
00a6ee9c	bl 0x00c342c0
00a6eea0	ldr x0,[x19, #0x38]
00a6eea4	bl 0x00c34d40
00a6eea8	adrp x1,0x2c1000
00a6eeac	add x1,x1,#0xcf9
00a6eeb0	mov w2,#0x5c3
00a6eeb4	mov x0,x19
00a6eeb8	bl 0x00c32310
00a6eebc	mov x19,xzr
00a6eec0	ldp x29,x30,[sp, #0x10]
00a6eec4	mov x0,x19
00a6eec8	ldp x20,x19,[sp], #0x20
00a6eecc	ret
