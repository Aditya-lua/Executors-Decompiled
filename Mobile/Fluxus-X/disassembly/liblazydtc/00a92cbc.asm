; FUN_00a92cbc @ 00a92cbc
00a92cbc	sub sp,sp,#0x80
00a92cc0	stp x28,x27,[sp, #0x20]
00a92cc4	stp x26,x25,[sp, #0x30]
00a92cc8	stp x24,x23,[sp, #0x40]
00a92ccc	stp x22,x21,[sp, #0x50]
00a92cd0	stp x20,x19,[sp, #0x60]
00a92cd4	stp x29,x30,[sp, #0x70]
00a92cd8	add x29,sp,#0x70
00a92cdc	mov x19,x3
00a92ce0	mov x22,x2
00a92ce4	mov x20,x1
00a92ce8	mov x21,x0
00a92cec	bl 0x00c3cea0
00a92cf0	ldr x8,[x0, #0x80]
00a92cf4	cbz x8,0x00a92d14
00a92cf8	mov x3,x0
00a92cfc	add x4,x21,#0x28
00a92d00	mov x0,x22
00a92d04	mov x1,x20
00a92d08	mov x2,x19
00a92d0c	blr x8
00a92d10	b 0x00a92de0
00a92d14	lsr x8,x19,#0x1e
00a92d18	cbz x8,0x00a92da4
00a92d1c	orr x28,xzr,#-0x40000000
00a92d20	add x8,x19,x28
00a92d24	str x8,[sp, #0x10]
00a92d28	and x8,x8,#-0x40000000
00a92d2c	mov w23,#0x40000000
00a92d30	add x27,x8,x23
00a92d34	add x24,x21,#0x28
00a92d38	str x8,[sp, #0x8]
00a92d3c	add x8,x22,x27
00a92d40	mov x25,x20
00a92d44	str x8,[sp, #0x18]
00a92d48	mov x0,x21
00a92d4c	bl 0x00c3cea0
00a92d50	mov x26,x0
00a92d54	mov x0,x21
00a92d58	bl 0x00c3cec0
00a92d5c	mov w5,w0
00a92d60	mov w2,#0x40000000
00a92d64	mov x0,x22
00a92d68	mov x1,x25
00a92d6c	mov x3,x26
00a92d70	mov x4,x24
00a92d74	bl 0x00c39a20
00a92d78	add x19,x19,x28
00a92d7c	add x22,x22,x23
00a92d80	lsr x8,x19,#0x1e
00a92d84	add x25,x25,x23
00a92d88	cbnz x8,0x00a92d48
00a92d8c	ldp x9,x8,[sp, #0x8]
00a92d90	ldr x23,[sp, #0x18]
00a92d94	add x20,x20,x27
00a92d98	sub x19,x8,x9
00a92d9c	cbnz x19,0x00a92dac
00a92da0	b 0x00a92de0
00a92da4	mov x23,x22
00a92da8	cbz x19,0x00a92de0
00a92dac	mov x0,x21
00a92db0	bl 0x00c3cea0
00a92db4	mov x22,x0
00a92db8	mov x0,x21
00a92dbc	add x24,x21,#0x28
00a92dc0	bl 0x00c3cec0
00a92dc4	mov w5,w0
00a92dc8	mov x0,x23
00a92dcc	mov x1,x20
00a92dd0	mov x2,x19
00a92dd4	mov x3,x22
00a92dd8	mov x4,x24
00a92ddc	bl 0x00c39a20
00a92de0	ldp x29,x30,[sp, #0x70]
00a92de4	ldp x20,x19,[sp, #0x60]
00a92de8	ldp x22,x21,[sp, #0x50]
00a92dec	ldp x24,x23,[sp, #0x40]
00a92df0	ldp x26,x25,[sp, #0x30]
00a92df4	ldp x28,x27,[sp, #0x20]
00a92df8	mov w0,#0x1
00a92dfc	add sp,sp,#0x80
00a92e00	ret
