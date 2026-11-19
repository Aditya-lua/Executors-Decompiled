; BN_BLINDING_update @ 00ad0ccc
00ad0ccc	str x21,[sp, #-0x30]!
00ad0cd0	stp x20,x19,[sp, #0x10]
00ad0cd4	stp x29,x30,[sp, #0x20]
00ad0cd8	ldr x8,[x0]
00ad0cdc	mov x19,x0
00ad0ce0	add x29,sp,#0x20
00ad0ce4	cbz x8,0x00ad0d48
00ad0ce8	ldr x0,[x19, #0x8]
00ad0cec	cbz x0,0x00ad0d48
00ad0cf0	mov x21,x19
00ad0cf4	ldr w8,[x21, #0x28]!
00ad0cf8	mov x20,x1
00ad0cfc	cmn w8,#0x1
00ad0d00	b.eq 0x00ad0d80
00ad0d04	add w8,w8,#0x1
00ad0d08	cmp w8,#0x20
00ad0d0c	str w8,[x21]
00ad0d10	b.ne 0x00ad0d88
00ad0d14	ldr x8,[x19, #0x10]
00ad0d18	cbz x8,0x00ad0d88
00ad0d1c	ldrb w8,[x19, #0x30]
00ad0d20	tbnz w8,#0x1,0x00ad0d88
00ad0d24	mov x0,x19
00ad0d28	mov x1,xzr
00ad0d2c	mov x2,xzr
00ad0d30	mov x3,x20
00ad0d34	mov x4,xzr
00ad0d38	mov x5,xzr
00ad0d3c	bl 0x00ad0e24
00ad0d40	cbnz x0,0x00ad0e00
00ad0d44	b 0x00ad0e04
00ad0d48	bl 0x00c342a0
00ad0d4c	adrp x0,0x2be000
00ad0d50	adrp x2,0x2be000
00ad0d54	add x0,x0,#0x30a
00ad0d58	add x2,x2,#0x31f
00ad0d5c	mov w1,#0x62
00ad0d60	bl 0x00c342b0
00ad0d64	orr w0,wzr,#0x3
00ad0d68	mov w1,#0x6b
00ad0d6c	mov x2,xzr
00ad0d70	bl 0x00c342c0
00ad0d74	mov w0,wzr
00ad0d78	add x21,x19,#0x28
00ad0d7c	b 0x00ad0e04
00ad0d80	mov w8,#0x1
00ad0d84	str w8,[x21]
00ad0d88	ldrb w8,[x19, #0x30]
00ad0d8c	tbnz w8,#0x0,0x00ad0e00
00ad0d90	ldr x3,[x19, #0x38]
00ad0d94	cbz x3,0x00ad0dcc
00ad0d98	mov x1,x0
00ad0d9c	mov x2,x0
00ad0da0	mov x4,x20
00ad0da4	bl 0x00c39000
00ad0da8	cbz w0,0x00ad0e04
00ad0dac	ldr x0,[x19]
00ad0db0	ldr x3,[x19, #0x38]
00ad0db4	mov x4,x20
00ad0db8	mov x1,x0
00ad0dbc	mov x2,x0
00ad0dc0	bl 0x00c39000
00ad0dc4	cbnz w0,0x00ad0e00
00ad0dc8	b 0x00ad0e04
00ad0dcc	ldr x3,[x19, #0x18]
00ad0dd0	mov x1,x0
00ad0dd4	mov x2,x0
00ad0dd8	mov x4,x20
00ad0ddc	bl 0x00c38ef0
00ad0de0	cbz w0,0x00ad0e04
00ad0de4	ldr x0,[x19]
00ad0de8	ldr x3,[x19, #0x18]
00ad0dec	mov x4,x20
00ad0df0	mov x1,x0
00ad0df4	mov x2,x0
00ad0df8	bl 0x00c38ef0
00ad0dfc	cbz w0,0x00ad0e04
00ad0e00	mov w0,#0x1
00ad0e04	ldr w8,[x21]
00ad0e08	cmp w8,#0x20
00ad0e0c	b.ne 0x00ad0e14
00ad0e10	str wzr,[x21]
00ad0e14	ldp x29,x30,[sp, #0x20]
00ad0e18	ldp x20,x19,[sp, #0x10]
00ad0e1c	ldr x21,[sp], #0x30
00ad0e20	ret
