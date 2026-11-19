; std::__ndk1::__assoc_state<cpr::Response>::set_value<cpr::Response> @ 008f6e24
008f6e24	sub sp,sp,#0x50
008f6e28	str x23,[sp, #0x10]
008f6e2c	stp x22,x21,[sp, #0x20]
008f6e30	stp x20,x19,[sp, #0x30]
008f6e34	stp x29,x30,[sp, #0x40]
008f6e38	add x29,sp,#0x40
008f6e3c	mrs x22,tpidr_el0
008f6e40	ldr x8,[x22, #0x28]
008f6e44	add x19,x0,#0x18
008f6e48	mov x20,x0
008f6e4c	mov x0,x19
008f6e50	mov x21,x1
008f6e54	str x8,[sp, #0x8]
008f6e58	bl 0x00c2ff10
008f6e5c	ldrb w8,[x20, #0x70]
008f6e60	tbnz w8,#0x0,0x008f7020
008f6e64	str xzr,[sp]
008f6e68	ldr x23,[x20, #0x10]
008f6e6c	mov x0,sp
008f6e70	bl 0x00c31450
008f6e74	cbnz x23,0x008f7020
008f6e78	ldr x8,[x21]
008f6e7c	add x9,x20,#0xb0
008f6e80	str x8,[x20, #0x78]
008f6e84	ldr x8,[x21, #0x8]
008f6e88	str x8,[x20, #0x80]
008f6e8c	ldr x8,[x21, #0x10]
008f6e90	stp xzr,xzr,[x21]
008f6e94	str x8,[x20, #0x88]
008f6e98	ldr x8,[x21, #0x28]
008f6e9c	str x8,[x20, #0xa0]
008f6ea0	ldur q0,[x21, #0x18]
008f6ea4	str q0,[x20, #0x90]
008f6ea8	ldr x8,[x21, #0x30]
008f6eac	stp xzr,xzr,[x21, #0x18]
008f6eb0	str xzr,[x21, #0x28]
008f6eb4	str x8,[x20, #0xa8]
008f6eb8	ldr x8,[x21, #0x38]
008f6ebc	str x8,[x20, #0xb0]
008f6ec0	ldr x10,[x21, #0x40]
008f6ec4	str x10,[x20, #0xb8]
008f6ec8	cbz x10,0x008f6ee4
008f6ecc	str x9,[x8, #0x10]
008f6ed0	mov x8,x21
008f6ed4	str xzr,[x8, #0x38]!
008f6ed8	stur x8,[x8, #-0x8]
008f6edc	str xzr,[x8, #0x8]
008f6ee0	b 0x008f6ee8
008f6ee4	str x9,[x20, #0xa8]
008f6ee8	adrp x8,0xcb4000
008f6eec	ldr x8,[x8, #0xa30]
008f6ef0	add x0,x20,#0x40
008f6ef4	add x8,x8,#0x10
008f6ef8	str x8,[x20, #0xc0]
008f6efc	ldr x8,[x21, #0x60]
008f6f00	str x8,[x20, #0xd8]
008f6f04	adrp x8,0xcb4000
008f6f08	ldr q0,[x21, #0x50]
008f6f0c	ldr x8,[x8, #0xa28]
008f6f10	stur q0,[x20, #0xc8]
008f6f14	add x8,x8,#0x10
008f6f18	stp xzr,xzr,[x21, #0x50]
008f6f1c	str xzr,[x21, #0x60]
008f6f20	str x8,[x20, #0xc0]
008f6f24	ldr x8,[x21, #0x68]
008f6f28	str x8,[x20, #0xe0]
008f6f2c	ldrb w8,[x21, #0x70]
008f6f30	stp xzr,xzr,[x20, #0xf8]
008f6f34	str xzr,[x20, #0xf0]
008f6f38	strb w8,[x20, #0xe8]
008f6f3c	ldr x8,[x21, #0x78]
008f6f40	str x8,[x20, #0xf0]
008f6f44	ldr x8,[x21, #0x80]
008f6f48	str x8,[x20, #0xf8]
008f6f4c	ldr x8,[x21, #0x88]
008f6f50	str x8,[x20, #0x100]
008f6f54	ldr w8,[x21, #0x90]
008f6f58	stp xzr,xzr,[x21, #0x80]
008f6f5c	str xzr,[x21, #0x78]
008f6f60	str w8,[x20, #0x108]
008f6f64	ldr x8,[x21, #0xa8]
008f6f68	str x8,[x20, #0x120]
008f6f6c	ldur q0,[x21, #0x98]
008f6f70	add x8,x20,#0x128
008f6f74	str q0,[x20, #0x110]
008f6f78	ldr q0,[x21, #0xb0]
008f6f7c	stp xzr,xzr,[x21, #0xa0]
008f6f80	str xzr,[x21, #0x98]
008f6f84	str q0,[x8]
008f6f88	ldr x8,[x21, #0xc0]
008f6f8c	str x8,[x20, #0x138]
008f6f90	ldr x8,[x21, #0xd8]
008f6f94	stp xzr,xzr,[x21, #0xb8]
008f6f98	str xzr,[x21, #0xb0]
008f6f9c	str x8,[x20, #0x150]
008f6fa0	ldur q0,[x21, #0xc8]
008f6fa4	str q0,[x20, #0x140]
008f6fa8	ldr x8,[x21, #0xf0]
008f6fac	stp xzr,xzr,[x21, #0xc8]
008f6fb0	str xzr,[x21, #0xd8]
008f6fb4	str x8,[x20, #0x168]
008f6fb8	ldr q0,[x21, #0xe0]
008f6fbc	add x8,x20,#0x158
008f6fc0	str q0,[x8]
008f6fc4	ldr x8,[x21, #0x108]
008f6fc8	stp xzr,xzr,[x21, #0xe8]
008f6fcc	str xzr,[x21, #0xe0]
008f6fd0	ldr w9,[x20, #0x70]
008f6fd4	str x8,[x20, #0x180]
008f6fd8	ldur q0,[x21, #0xf8]
008f6fdc	mov w8,#0x5
008f6fe0	orr w8,w9,w8
008f6fe4	str w8,[x20, #0x70]
008f6fe8	str q0,[x20, #0x170]
008f6fec	bl 0x00c315e0
008f6ff0	mov x0,x19
008f6ff4	bl 0x00c2ff20
008f6ff8	ldr x8,[x22, #0x28]
008f6ffc	ldr x9,[sp, #0x8]
008f7000	cmp x8,x9
008f7004	b.ne 0x008f7058
008f7008	ldp x29,x30,[sp, #0x40]
008f700c	ldp x20,x19,[sp, #0x30]
008f7010	ldp x22,x21,[sp, #0x20]
008f7014	ldr x23,[sp, #0x10]
008f7018	add sp,sp,#0x50
008f701c	ret
008f7020	mov w0,#0x20
008f7024	bl 0x00c30000
008f7028	mov x20,x0
008f702c	bl 0x00c315c0
008f7030	mov x2,x0
008f7034	mov w1,#0x2
008f7038	mov x0,x20
008f703c	bl 0x00c314d0
008f7040	adrp x1,0xcb4000
008f7044	adrp x2,0xcb4000
008f7048	ldr x1,[x1, #0xd20]
008f704c	ldr x2,[x2, #0xd08]
008f7050	mov x0,x20
008f7054	bl 0x00c30020
008f7058	bl 0x00c2fec0
