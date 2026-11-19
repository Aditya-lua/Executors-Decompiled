; BN_copy @ 00a01cc4
00a01cc4	str x21,[sp, #-0x30]!
00a01cc8	stp x20,x19,[sp, #0x10]
00a01ccc	stp x29,x30,[sp, #0x20]
00a01cd0	ldrb w8,[x1, #0x14]
00a01cd4	orr w9,wzr,#0xc
00a01cd8	mov w10,#0x8
00a01cdc	mov x20,x1
00a01ce0	tst w8,#0x4
00a01ce4	csel x8,x10,x9,eq
00a01ce8	cmp x0,x1
00a01cec	add x29,sp,#0x20
00a01cf0	b.eq 0x00a01d48
00a01cf4	ldrsw x21,[x20, x8#0x0]
00a01cf8	ldr w8,[x0, #0xc]
00a01cfc	mov x19,x0
00a01d00	cmp w8,w21
00a01d04	b.ge 0x00a01d18
00a01d08	mov x0,x19
00a01d0c	mov w1,w21
00a01d10	bl 0x00a01a04
00a01d14	cbz x0,0x00a01d50
00a01d18	ldr w8,[x20, #0x8]
00a01d1c	cmp w8,#0x1
00a01d20	b.lt 0x00a01d38
00a01d24	ldr x0,[x19]
00a01d28	ldr x1,[x20]
00a01d2c	lsl x2,x21,#0x3
00a01d30	bl 0x00c2ffd0
00a01d34	ldr w8,[x20, #0x8]
00a01d38	ldr w9,[x20, #0x10]
00a01d3c	str w8,[x19, #0x8]
00a01d40	str w9,[x19, #0x10]
00a01d44	b 0x00a01d54
00a01d48	mov x19,x20
00a01d4c	b 0x00a01d54
00a01d50	mov x19,xzr
00a01d54	mov x0,x19
00a01d58	ldp x29,x30,[sp, #0x20]
00a01d5c	ldp x20,x19,[sp, #0x10]
00a01d60	ldr x21,[sp], #0x30
00a01d64	ret
