; CRYPTO_cfb128_1_encrypt @ 00aa8cd4
00aa8cd4	sub sp,sp,#0x70
00aa8cd8	stp x28,x27,[sp, #0x10]
00aa8cdc	stp x26,x25,[sp, #0x20]
00aa8ce0	stp x24,x23,[sp, #0x30]
00aa8ce4	stp x22,x21,[sp, #0x40]
00aa8ce8	stp x20,x19,[sp, #0x50]
00aa8cec	stp x29,x30,[sp, #0x60]
00aa8cf0	add x29,sp,#0x60
00aa8cf4	cbz x2,0x00aa8d90
00aa8cf8	mov x20,x7
00aa8cfc	mov w21,w6
00aa8d00	mov x22,x4
00aa8d04	mov x25,x3
00aa8d08	mov x24,x2
00aa8d0c	mov x28,x1
00aa8d10	mov x23,x0
00aa8d14	mov x26,xzr
00aa8d18	lsr x27,x26,#0x3
00aa8d1c	ldrb w8,[x23, x27]
00aa8d20	and w9,w26,#0x7
00aa8d24	str w9,[sp, #0x4]
00aa8d28	eor w9,w9,#0x7
00aa8d2c	mov w10,#0x1
00aa8d30	lsl w19,w10,w9
00aa8d34	tst w19,w8
00aa8d38	orr w8,wzr,#0xffffff80
00aa8d3c	csel w8,wzr,w8,eq
00aa8d40	add x0,sp,#0xc
00aa8d44	add x1,sp,#0x8
00aa8d48	mov w2,#0x1
00aa8d4c	mov x3,x25
00aa8d50	mov x4,x22
00aa8d54	mov w5,w21
00aa8d58	mov x6,x20
00aa8d5c	strb w8,[sp, #0xc]
00aa8d60	bl 0x00aa8db0
00aa8d64	ldrb w9,[sp, #0x8]
00aa8d68	ldrb w8,[x28, x27]
00aa8d6c	ldr w10,[sp, #0x4]
00aa8d70	add x26,x26,#0x1
00aa8d74	and w9,w9,#0x80
00aa8d78	bic w8,w8,w19
00aa8d7c	lsr w9,w9,w10
00aa8d80	orr w8,w9,w8
00aa8d84	cmp x24,x26
00aa8d88	strb w8,[x28, x27]
00aa8d8c	b.ne 0x00aa8d18
00aa8d90	ldp x29,x30,[sp, #0x60]
00aa8d94	ldp x20,x19,[sp, #0x50]
00aa8d98	ldp x22,x21,[sp, #0x40]
00aa8d9c	ldp x24,x23,[sp, #0x30]
00aa8da0	ldp x26,x25,[sp, #0x20]
00aa8da4	ldp x28,x27,[sp, #0x10]
00aa8da8	add sp,sp,#0x70
00aa8dac	ret
