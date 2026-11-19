; ix::ConnectionState::ConnectionState @ 00980e70
00980e70	sub sp,sp,#0x50
00980e74	stp x22,x21,[sp, #0x20]
00980e78	stp x20,x19,[sp, #0x30]
00980e7c	stp x29,x30,[sp, #0x40]
00980e80	add x29,sp,#0x40
00980e84	mrs x21,tpidr_el0
00980e88	adrp x9,0xcb4000
00980e8c	ldr x8,[x21, #0x28]
00980e90	ldr x9,[x9, #0xea0]
00980e94	mov x20,x0
00980e98	mov x22,x0
00980e9c	str x8,[sp, #0x18]
00980ea0	add x8,x9,#0x10
00980ea4	str x8,[x0]
00980ea8	strb wzr,[x0, #0x8]
00980eac	str xzr,[x20, #0x10]!
00980eb0	stp xzr,xzr,[x0, #0x18]
00980eb4	str xzr,[x0, #0x50]
00980eb8	str xzr,[x22, #0x60]!
00980ebc	stp xzr,xzr,[x0, #0x68]
00980ec0	adrp x8,0xcb4000
00980ec4	ldr x8,[x8, #0xe98]
00980ec8	mov x19,x0
00980ecc	ldaxr x0,[x8]
00980ed0	add x9,x0,#0x1
00980ed4	stlxr w10,x9,[x8]
00980ed8	cbnz w10,0x00980ecc
00980edc	mov x8,sp
00980ee0	bl 0x00c33410
00980ee4	ldrb w8,[x20]
00980ee8	tbnz w8,#0x0,0x00980ef4
00980eec	strh wzr,[x20]
00980ef0	b 0x00980f14
00980ef4	ldr x8,[x19, #0x20]
00980ef8	strb wzr,[x8]
00980efc	ldrb w8,[x19, #0x10]
00980f00	str xzr,[x19, #0x18]
00980f04	tbz w8,#0x0,0x00980f14
00980f08	ldr x0,[x19, #0x20]
00980f0c	bl 0x00c301d0
00980f10	str xzr,[x19, #0x10]
00980f14	ldr x8,[sp, #0x10]
00980f18	str x8,[x20, #0x10]
00980f1c	ldr q0,[sp]
00980f20	str q0,[x20]
00980f24	ldr x8,[x21, #0x28]
00980f28	ldr x9,[sp, #0x18]
00980f2c	cmp x8,x9
00980f30	b.ne 0x00980f48
00980f34	ldp x29,x30,[sp, #0x40]
00980f38	ldp x20,x19,[sp, #0x30]
00980f3c	ldp x22,x21,[sp, #0x20]
00980f40	add sp,sp,#0x50
00980f44	ret
00980f48	bl 0x00c2fec0
