; psa_destroy_key @ 00b86d2c
00b86d2c	sub sp,sp,#0x30
00b86d30	stp x20,x19,[sp, #0x10]
00b86d34	stp x29,x30,[sp, #0x20]
00b86d38	add x29,sp,#0x20
00b86d3c	mrs x20,tpidr_el0
00b86d40	ldr x8,[x20, #0x28]
00b86d44	str x8,[sp, #0x8]
00b86d48	cbz w0,0x00b86db8
00b86d4c	mov x1,sp
00b86d50	bl 0x00c43190
00b86d54	cbnz w0,0x00b86db8
00b86d58	ldr x8,[sp]
00b86d5c	ldr w9,[x8, #0x18]
00b86d60	cmp w9,#0x2
00b86d64	b.ne 0x00b86d88
00b86d68	ldrb w9,[x8, #0x4]
00b86d6c	orr w10,wzr,#0x3
00b86d70	str w10,[x8, #0x18]
00b86d74	cbz w9,0x00b86d90
00b86d78	cmp w9,#0xff
00b86d7c	b.ne 0x00b86d98
00b86d80	mov w19,#0xffffff7b
00b86d84	b 0x00b86da8
00b86d88	mov w19,#0xffffff69
00b86d8c	b 0x00b86da8
00b86d90	mov w19,wzr
00b86d94	b 0x00b86da8
00b86d98	ldr w0,[x8, #0x14]
00b86d9c	bl 0x00c43220
00b86da0	ldr x8,[sp]
00b86da4	mov w19,w0
00b86da8	mov x0,x8
00b86dac	bl 0x00c431d0
00b86db0	cmp w0,#0x0
00b86db4	csel w0,w19,w0,eq
00b86db8	ldr x8,[x20, #0x28]
00b86dbc	ldr x9,[sp, #0x8]
00b86dc0	cmp x8,x9
00b86dc4	b.ne 0x00b86dd8
00b86dc8	ldp x29,x30,[sp, #0x20]
00b86dcc	ldp x20,x19,[sp, #0x10]
00b86dd0	add sp,sp,#0x30
00b86dd4	ret
00b86dd8	bl 0x00c2fec0
