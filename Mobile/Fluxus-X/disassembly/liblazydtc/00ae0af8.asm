; ossl_sha3_init @ 00ae0af8
00ae0af8	stp x22,x21,[sp, #-0x30]!
00ae0afc	mov w8,#0x640
00ae0b00	sub x8,x8,x2, LSL #0x1
00ae0b04	stp x20,x19,[sp, #0x10]
00ae0b08	mov x20,x0
00ae0b0c	cmp x8,#0x547
00ae0b10	mov w0,wzr
00ae0b14	stp x29,x30,[sp, #0x20]
00ae0b18	add x29,sp,#0x20
00ae0b1c	b.hi 0x00ae0b50
00ae0b20	mov x21,x2
00ae0b24	mov w19,w1
00ae0b28	mov w2,#0xc8
00ae0b2c	mov x0,x20
00ae0b30	mov w1,wzr
00ae0b34	lsr x22,x8,#0x3
00ae0b38	bl 0x00c301c0
00ae0b3c	lsr x8,x21,#0x3
00ae0b40	mov w0,#0x1
00ae0b44	strb w19,[x20, #0x188]
00ae0b48	str x22,[x20, #0xc8]
00ae0b4c	stp x8,xzr,[x20, #0xd0]
00ae0b50	ldp x29,x30,[sp, #0x20]
00ae0b54	ldp x20,x19,[sp, #0x10]
00ae0b58	ldp x22,x21,[sp], #0x30
00ae0b5c	ret
