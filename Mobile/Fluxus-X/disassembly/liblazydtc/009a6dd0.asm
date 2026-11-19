; dtls1_is_timer_expired @ 009a6dd0
009a6dd0	sub sp,sp,#0x40
009a6dd4	stp x29,x30,[sp, #0x30]
009a6dd8	ldr x8,[x0, #0x4b8]
009a6ddc	str x19,[sp, #0x20]
009a6de0	mov x19,x0
009a6de4	add x29,sp,#0x30
009a6de8	ldr x9,[x8, #0x1f0]
009a6dec	cbnz x9,0x009a6df8
009a6df0	ldr x8,[x8, #0x1f8]
009a6df4	cbz x8,0x009a6ea8
009a6df8	add x0,sp,#0x10
009a6dfc	mov x1,xzr
009a6e00	bl 0x00c31ff0
009a6e04	ldr x9,[x19, #0x4b8]
009a6e08	ldr x8,[sp, #0x10]
009a6e0c	ldr x10,[x9, #0x1f0]
009a6e10	cmp x10,x8
009a6e14	b.lt 0x009a6e78
009a6e18	b.ne 0x009a6e30
009a6e1c	ldr x11,[x9, #0x1f8]
009a6e20	ldr x10,[sp, #0x18]
009a6e24	cmp x11,x10
009a6e28	b.gt 0x009a6e34
009a6e2c	b 0x009a6e78
009a6e30	ldr x10,[sp, #0x18]
009a6e34	ldr q0,[x9, #0x1f0]
009a6e38	str q0,[sp]
009a6e3c	ldr x9,[sp]
009a6e40	sub x9,x9,x8
009a6e44	ldr x8,[sp, #0x8]
009a6e48	subs x8,x8,x10
009a6e4c	stp x9,x8,[sp]
009a6e50	b.pl 0x009a6e68
009a6e54	mov w10,#0x4240
009a6e58	movk w10,#0xf, LSL #16
009a6e5c	sub x9,x9,#0x1
009a6e60	add x8,x8,x10
009a6e64	stp x9,x8,[sp]
009a6e68	mov w10,#0x3a97
009a6e6c	cmp x8,x10
009a6e70	b.gt 0x009a6e98
009a6e74	cbnz x9,0x009a6e98
009a6e78	mov x8,xzr
009a6e7c	stp xzr,xzr,[sp]
009a6e80	cmp x8,#0x1
009a6e84	cset w0,lt
009a6e88	ldp x29,x30,[sp, #0x30]
009a6e8c	ldr x19,[sp, #0x20]
009a6e90	add sp,sp,#0x40
009a6e94	ret
009a6e98	cmp x9,#0x0
009a6e9c	mov w0,wzr
009a6ea0	b.gt 0x009a6e88
009a6ea4	b 0x009a6e80
009a6ea8	mov w0,wzr
009a6eac	b 0x009a6e88
