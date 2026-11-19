; EVP_Q_digest @ 00a58a78
00a58a78	str x23,[sp, #-0x40]!
00a58a7c	stp x22,x21,[sp, #0x10]
00a58a80	stp x20,x19,[sp, #0x20]
00a58a84	mov x19,x6
00a58a88	mov x20,x5
00a58a8c	mov x22,x4
00a58a90	adrp x4,0xa59000
00a58a94	adrp x5,0xa59000
00a58a98	adrp x6,0xa59000
00a58a9c	mov x23,x3
00a58aa0	mov x3,x2
00a58aa4	mov x2,x1
00a58aa8	add x4,x4,#0x84
00a58aac	add x5,x5,#0x588
00a58ab0	add x6,x6,#0x5ac
00a58ab4	mov w1,#0x1
00a58ab8	stp x29,x30,[sp, #0x30]
00a58abc	add x29,sp,#0x30
00a58ac0	bl 0x00c3bf50
00a58ac4	str wzr,[sp, #0xc]
00a58ac8	cbz x0,0x00a58b18
00a58acc	mov x21,x0
00a58ad0	add x3,sp,#0xc
00a58ad4	mov x0,x23
00a58ad8	mov x1,x22
00a58adc	mov x2,x20
00a58ae0	mov x4,x21
00a58ae4	mov x5,xzr
00a58ae8	bl 0x00a58968
00a58aec	ldr w8,[x21, #0x18]
00a58af0	mov w20,w0
00a58af4	cbnz w8,0x00a58b34
00a58af8	add x9,x21,#0x78
00a58afc	ldxr w8,[x9]
00a58b00	subs w10,w8,#0x1
00a58b04	stxr w11,w10,[x9]
00a58b08	cbnz w11,0x00a58afc
00a58b0c	b.ne 0x00a58b24
00a58b10	dmb ISHLD
00a58b14	b 0x00a58b2c
00a58b18	mov w20,wzr
00a58b1c	cbnz x19,0x00a58b38
00a58b20	b 0x00a58b40
00a58b24	cmp w8,#0x1
00a58b28	b.gt 0x00a58b34
00a58b2c	mov x0,x21
00a58b30	bl 0x00c3c280
00a58b34	cbz x19,0x00a58b40
00a58b38	ldr w8,[sp, #0xc]
00a58b3c	str x8,[x19]
00a58b40	mov w0,w20
00a58b44	ldp x29,x30,[sp, #0x30]
00a58b48	ldp x20,x19,[sp, #0x20]
00a58b4c	ldp x22,x21,[sp, #0x10]
00a58b50	ldr x23,[sp], #0x40
00a58b54	ret
