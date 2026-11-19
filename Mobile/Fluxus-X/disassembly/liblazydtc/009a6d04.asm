; dtls1_start_timer @ 009a6d04
009a6d04	stp x20,x19,[sp, #-0x20]!
009a6d08	stp x29,x30,[sp, #0x10]
009a6d0c	ldr x8,[x0, #0x4b8]
009a6d10	mov w20,#0x4240
009a6d14	mov x19,x0
009a6d18	movk w20,#0xf, LSL #16
009a6d1c	ldr x9,[x8, #0x1f0]
009a6d20	add x29,sp,#0x10
009a6d24	cbnz x9,0x009a6d54
009a6d28	ldr x9,[x8, #0x1f8]
009a6d2c	cbnz x9,0x009a6d54
009a6d30	ldr x9,[x8, #0x208]
009a6d34	cbz x9,0x009a6d50
009a6d38	mov x0,x19
009a6d3c	mov w1,wzr
009a6d40	blr x9
009a6d44	ldr x8,[x19, #0x4b8]
009a6d48	str w0,[x8, #0x200]
009a6d4c	b 0x009a6d54
009a6d50	str w20,[x8, #0x200]
009a6d54	add x0,x8,#0x1f0
009a6d58	mov x1,xzr
009a6d5c	bl 0x00c31ff0
009a6d60	ldr x8,[x19, #0x4b8]
009a6d64	mov w10,#0xbdc0
009a6d68	movk w10,#0xfff0, LSL #16
009a6d6c	ldr w9,[x8, #0x200]
009a6d70	ldp x11,x12,[x8, #0x1f0]
009a6d74	udiv w13,w9,w20
009a6d78	madd w9,w13,w10,w9
009a6d7c	add x10,x11,x13
009a6d80	mov w11,#0x4240
009a6d84	add x9,x12,x9
009a6d88	movk w11,#0xf, LSL #16
009a6d8c	cmp x9,x11
009a6d90	stp x10,x9,[x8, #0x1f0]
009a6d94	b.lt 0x009a6dac
009a6d98	mov x11,#-0x4240
009a6d9c	movk x11,#0xfff0, LSL #16
009a6da0	add x10,x10,#0x1
009a6da4	add x9,x9,x11
009a6da8	stp x10,x9,[x8, #0x1f0]
009a6dac	mov x0,x19
009a6db0	bl 0x00c34300
009a6db4	ldr x8,[x19, #0x4b8]
009a6db8	ldp x29,x30,[sp, #0x10]
009a6dbc	mov w1,#0x2d
009a6dc0	mov x2,xzr
009a6dc4	add x3,x8,#0x1f0
009a6dc8	ldp x20,x19,[sp], #0x20
009a6dcc	b 0x00c321a0
