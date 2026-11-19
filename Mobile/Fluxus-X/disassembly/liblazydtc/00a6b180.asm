; PKCS5_pbe_set @ 00a6b180
00a6b180	str x23,[sp, #-0x40]!
00a6b184	stp x22,x21,[sp, #0x10]
00a6b188	stp x20,x19,[sp, #0x20]
00a6b18c	stp x29,x30,[sp, #0x30]
00a6b190	add x29,sp,#0x30
00a6b194	mov w20,w3
00a6b198	mov x21,x2
00a6b19c	mov w22,w1
00a6b1a0	mov w23,w0
00a6b1a4	bl 0x00c38250
00a6b1a8	mov x19,x0
00a6b1ac	cbz x0,0x00a6b1e0
00a6b1b0	mov x0,x19
00a6b1b4	mov w1,w23
00a6b1b8	mov w2,w22
00a6b1bc	mov x3,x21
00a6b1c0	mov w4,w20
00a6b1c4	mov x5,xzr
00a6b1c8	bl 0x00a6aeac
00a6b1cc	cbnz w0,0x00a6b210
00a6b1d0	mov x0,x19
00a6b1d4	bl 0x00c38240
00a6b1d8	mov x19,xzr
00a6b1dc	b 0x00a6b210
00a6b1e0	bl 0x00c342a0
00a6b1e4	adrp x0,0x2c5000
00a6b1e8	adrp x2,0x2d1000
00a6b1ec	add x0,x0,#0xaf1
00a6b1f0	add x2,x2,#0xa3e
00a6b1f4	mov w1,#0x61
00a6b1f8	bl 0x00c342b0
00a6b1fc	mov w1,#0x100
00a6b200	mov w0,#0xd
00a6b204	movk w1,#0xc, LSL #16
00a6b208	mov x2,xzr
00a6b20c	bl 0x00c342c0
00a6b210	mov x0,x19
00a6b214	ldp x29,x30,[sp, #0x30]
00a6b218	ldp x20,x19,[sp, #0x20]
00a6b21c	ldp x22,x21,[sp, #0x10]
00a6b220	ldr x23,[sp], #0x40
00a6b224	ret
