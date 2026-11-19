; PKCS5_pbe_set_ex @ 00a6b0d4
00a6b0d4	stp x24,x23,[sp, #-0x40]!
00a6b0d8	stp x22,x21,[sp, #0x10]
00a6b0dc	stp x20,x19,[sp, #0x20]
00a6b0e0	stp x29,x30,[sp, #0x30]
00a6b0e4	add x29,sp,#0x30
00a6b0e8	mov x20,x4
00a6b0ec	mov w21,w3
00a6b0f0	mov x22,x2
00a6b0f4	mov w23,w1
00a6b0f8	mov w24,w0
00a6b0fc	bl 0x00c38250
00a6b100	mov x19,x0
00a6b104	cbz x0,0x00a6b138
00a6b108	mov x0,x19
00a6b10c	mov w1,w24
00a6b110	mov w2,w23
00a6b114	mov x3,x22
00a6b118	mov w4,w21
00a6b11c	mov x5,x20
00a6b120	bl 0x00a6aeac
00a6b124	cbnz w0,0x00a6b168
00a6b128	mov x0,x19
00a6b12c	bl 0x00c38240
00a6b130	mov x19,xzr
00a6b134	b 0x00a6b168
00a6b138	bl 0x00c342a0
00a6b13c	adrp x0,0x2c5000
00a6b140	adrp x2,0x2d1000
00a6b144	add x0,x0,#0xaf1
00a6b148	add x2,x2,#0xa3e
00a6b14c	mov w1,#0x61
00a6b150	bl 0x00c342b0
00a6b154	mov w1,#0x100
00a6b158	mov w0,#0xd
00a6b15c	movk w1,#0xc, LSL #16
00a6b160	mov x2,xzr
00a6b164	bl 0x00c342c0
00a6b168	mov x0,x19
00a6b16c	ldp x29,x30,[sp, #0x30]
00a6b170	ldp x20,x19,[sp, #0x20]
00a6b174	ldp x22,x21,[sp, #0x10]
00a6b178	ldp x24,x23,[sp], #0x40
00a6b17c	ret
