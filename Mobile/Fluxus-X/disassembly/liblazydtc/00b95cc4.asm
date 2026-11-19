; FUN_00b95cc4 @ 00b95cc4
00b95cc4	sub sp,sp,#0x60
00b95cc8	str x23,[sp, #0x20]
00b95ccc	stp x22,x21,[sp, #0x30]
00b95cd0	stp x20,x19,[sp, #0x40]
00b95cd4	stp x29,x30,[sp, #0x50]
00b95cd8	add x29,sp,#0x50
00b95cdc	mrs x23,tpidr_el0
00b95ce0	ldr x8,[x23, #0x28]
00b95ce4	mov x19,x0
00b95ce8	add x0,sp,#0x8
00b95cec	mov x21,x3
00b95cf0	mov x22,x2
00b95cf4	mov x20,x1
00b95cf8	str x8,[sp, #0x18]
00b95cfc	bl 0x00c41c00
00b95d00	add x2,x19,#0x8
00b95d04	add x0,sp,#0x8
00b95d08	mov w1,#0x2
00b95d0c	mov x3,x22
00b95d10	mov x4,x21
00b95d14	bl 0x00c41c90
00b95d18	mov w22,w0
00b95d1c	cbnz w0,0x00b95dac
00b95d20	add x1,x20,#0x20
00b95d24	add x3,sp,#0x8
00b95d28	mov x0,x19
00b95d2c	mov x2,x1
00b95d30	bl 0x00b953d4
00b95d34	mov w22,w0
00b95d38	cbnz w0,0x00b95dac
00b95d3c	add x21,x20,#0x10
00b95d40	add x3,sp,#0x8
00b95d44	mov x0,x19
00b95d48	mov x1,x21
00b95d4c	mov x2,x21
00b95d50	bl 0x00b953d4
00b95d54	mov w22,w0
00b95d58	cbnz w0,0x00b95dac
00b95d5c	add x1,sp,#0x8
00b95d60	add x2,sp,#0x8
00b95d64	add x3,sp,#0x8
00b95d68	mov x0,x19
00b95d6c	bl 0x00b953d4
00b95d70	mov w22,w0
00b95d74	cbnz w0,0x00b95dac
00b95d78	add x3,sp,#0x8
00b95d7c	mov x0,x19
00b95d80	mov x1,x20
00b95d84	mov x2,x20
00b95d88	bl 0x00b953d4
00b95d8c	mov w22,w0
00b95d90	cbnz w0,0x00b95dac
00b95d94	add x3,sp,#0x8
00b95d98	mov x0,x19
00b95d9c	mov x1,x21
00b95da0	mov x2,x21
00b95da4	bl 0x00b953d4
00b95da8	mov w22,w0
00b95dac	add x0,sp,#0x8
00b95db0	bl 0x00c41bb0
00b95db4	ldr x8,[x23, #0x28]
00b95db8	ldr x9,[sp, #0x18]
00b95dbc	cmn w22,#0xe
00b95dc0	mov w10,#0xffffb300
00b95dc4	csel w0,w10,w22,eq
00b95dc8	cmp x8,x9
00b95dcc	b.ne 0x00b95de8
00b95dd0	ldp x29,x30,[sp, #0x50]
00b95dd4	ldp x20,x19,[sp, #0x40]
00b95dd8	ldp x22,x21,[sp, #0x30]
00b95ddc	ldr x23,[sp, #0x20]
00b95de0	add sp,sp,#0x60
00b95de4	ret
00b95de8	bl 0x00c2fec0
