; FUN_00b73d28 @ 00b73d28
00b73d28	sub sp,sp,#0x1e0
00b73d2c	stp x28,x25,[sp, #0x190]
00b73d30	stp x24,x23,[sp, #0x1a0]
00b73d34	stp x22,x21,[sp, #0x1b0]
00b73d38	stp x20,x19,[sp, #0x1c0]
00b73d3c	stp x29,x30,[sp, #0x1d0]
00b73d40	add x29,sp,#0x1d0
00b73d44	mrs x25,tpidr_el0
00b73d48	ldr x8,[x25, #0x28]
00b73d4c	mov x22,x3
00b73d50	mov x20,x2
00b73d54	mov x19,x0
00b73d58	stur x8,[x29, #-0x48]
00b73d5c	ldr x24,[x0, #0x18]
00b73d60	mov x21,x1
00b73d64	cmp x24,#0x180
00b73d68	b.ls 0x00b73d74
00b73d6c	mov w23,#0xffffffc8
00b73d70	b 0x00b73e40
00b73d74	orr w8,wzr,#0x180
00b73d78	sub x8,x8,x24
00b73d7c	subs x8,x8,x22
00b73d80	mov w23,#0xffffffc8
00b73d84	b.cc 0x00b73e40
00b73d88	cmp x8,x20
00b73d8c	b.cc 0x00b73e40
00b73d90	add x0,sp,#0x8
00b73d94	orr w2,wzr,#0x180
00b73d98	mov w1,wzr
00b73d9c	bl 0x00c301c0
00b73da0	ldp x8,x0,[x19, #0x148]
00b73da4	add x1,sp,#0x8
00b73da8	mov x2,x24
00b73dac	blr x8
00b73db0	cbz w0,0x00b73dbc
00b73db4	mov w23,#0xffffffcc
00b73db8	b 0x00b73e40
00b73dbc	ldr x23,[x19, #0x18]
00b73dc0	cbz x22,0x00b73de0
00b73dc4	ldp x8,x0,[x19, #0x148]
00b73dc8	add x9,sp,#0x8
00b73dcc	add x1,x9,x23
00b73dd0	mov x2,x22
00b73dd4	blr x8
00b73dd8	cbnz w0,0x00b73db4
00b73ddc	add x23,x23,x22
00b73de0	cbz x21,0x00b73e00
00b73de4	cbz x20,0x00b73e00
00b73de8	add x8,sp,#0x8
00b73dec	add x0,x8,x23
00b73df0	mov x1,x21
00b73df4	mov x2,x20
00b73df8	bl 0x00c2ffd0
00b73dfc	add x23,x23,x20
00b73e00	add x0,sp,#0x8
00b73e04	add x1,sp,#0x8
00b73e08	mov x2,x23
00b73e0c	bl 0x00b7389c
00b73e10	mov w23,w0
00b73e14	cbnz w0,0x00b73e34
00b73e18	add x1,sp,#0x8
00b73e1c	mov x0,x19
00b73e20	bl 0x00b73b88
00b73e24	mov w23,w0
00b73e28	cbnz w0,0x00b73e34
00b73e2c	mov w8,#0x1
00b73e30	str w8,[x19, #0x10]
00b73e34	add x0,sp,#0x8
00b73e38	orr w1,wzr,#0x180
00b73e3c	bl 0x00c42220
00b73e40	ldr x8,[x25, #0x28]
00b73e44	ldur x9,[x29, #-0x48]
00b73e48	cmp x8,x9
00b73e4c	b.ne 0x00b73e70
00b73e50	mov w0,w23
00b73e54	ldp x29,x30,[sp, #0x1d0]
00b73e58	ldp x20,x19,[sp, #0x1c0]
00b73e5c	ldp x22,x21,[sp, #0x1b0]
00b73e60	ldp x24,x23,[sp, #0x1a0]
00b73e64	ldp x28,x25,[sp, #0x190]
00b73e68	add sp,sp,#0x1e0
00b73e6c	ret
00b73e70	bl 0x00c2fec0
