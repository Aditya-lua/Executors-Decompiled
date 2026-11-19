; FUN_00910d9c @ 00910d9c
00910d9c	sub sp,sp,#0x70
00910da0	str x23,[sp, #0x30]
00910da4	stp x22,x21,[sp, #0x40]
00910da8	stp x20,x19,[sp, #0x50]
00910dac	stp x29,x30,[sp, #0x60]
00910db0	add x29,sp,#0x60
00910db4	mrs x22,tpidr_el0
00910db8	ldr x8,[x22, #0x28]
00910dbc	mov x20,x1
00910dc0	mov x19,x0
00910dc4	str x8,[sp, #0x28]
00910dc8	ldrb w8,[x0, #0x78]
00910dcc	ldr x23,[x0, #0x58]
00910dd0	orr w8,w8,#0x1
00910dd4	strb w8,[x0, #0x78]
00910dd8	cbz x23,0x00910e2c
00910ddc	movi v0.2D,#0x0
00910de0	ldr x1,[x23]
00910de4	stur q0,[sp, #0x18]
00910de8	stur q0,[sp, #0x8]
00910dec	ldr x0,[x19, #0x80]
00910df0	bl 0x0092bb60
00910df4	ldr x0,[x19, #0x80]
00910df8	add x1,sp,#0x8
00910dfc	bl 0x00907984
00910e00	ldr x0,[x19, #0x80]
00910e04	bl 0x0092bab8
00910e08	add x1,sp,#0x8
00910e0c	mov x0,x20
00910e10	bl 0x00934ba4
00910e14	mov w21,w0
00910e18	cbnz w0,0x00910e34
00910e1c	ldr x23,[x23, #0x10]
00910e20	cbnz x23,0x00910ddc
00910e24	mov w21,wzr
00910e28	b 0x00910e3c
00910e2c	mov w21,wzr
00910e30	b 0x00910e40
00910e34	mov x0,x20
00910e38	bl 0x00934a90
00910e3c	ldrb w8,[x19, #0x78]
00910e40	and w8,w8,#0xfe
00910e44	strb w8,[x19, #0x78]
00910e48	ldr x8,[x22, #0x28]
00910e4c	ldr x9,[sp, #0x28]
00910e50	cmp x8,x9
00910e54	b.ne 0x00910e74
00910e58	mov w0,w21
00910e5c	ldp x29,x30,[sp, #0x60]
00910e60	ldp x20,x19,[sp, #0x50]
00910e64	ldp x22,x21,[sp, #0x40]
00910e68	ldr x23,[sp, #0x30]
00910e6c	add sp,sp,#0x70
00910e70	ret
00910e74	bl 0x00c2fec0
