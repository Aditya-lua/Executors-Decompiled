; cpr::Session::PatchAsync @ 008f1e4c
008f1e4c	sub sp,sp,#0x70
008f1e50	stp x26,x25,[sp, #0x20]
008f1e54	stp x24,x23,[sp, #0x30]
008f1e58	stp x22,x21,[sp, #0x40]
008f1e5c	stp x20,x19,[sp, #0x50]
008f1e60	stp x29,x30,[sp, #0x60]
008f1e64	add x29,sp,#0x60
008f1e68	mrs x24,tpidr_el0
008f1e6c	mov x20,x8
008f1e70	ldr x8,[x24, #0x28]
008f1e74	str x8,[sp, #0x18]
008f1e78	mov x8,sp
008f1e7c	bl 0x00c31300
008f1e80	bl 0x00c30d70
008f1e84	add x8,x0,#0x20
008f1e88	ldar w8,[x8]
008f1e8c	mov x21,x0
008f1e90	cbnz w8,0x008f1ea0
008f1e94	mov x0,x21
008f1e98	mov x1,xzr
008f1e9c	bl 0x00c31330
008f1ea0	add x8,x21,#0x30
008f1ea4	ldar x8,[x8]
008f1ea8	cbnz x8,0x008f1ec8
008f1eac	add x8,x21,#0x28
008f1eb0	ldar x8,[x8]
008f1eb4	ldr x9,[x21, #0x10]
008f1eb8	cmp x8,x9
008f1ebc	b.cs 0x008f1ec8
008f1ec0	mov x0,x21
008f1ec4	bl 0x00c31320
008f1ec8	ldp x23,x22,[sp]
008f1ecc	stp xzr,xzr,[sp]
008f1ed0	orr w0,wzr,#0x60
008f1ed4	bl 0x00c2fed0
008f1ed8	str xzr,[x0, #0x10]
008f1edc	adrp x8,0xcb4000
008f1ee0	ldr x8,[x8, #0xd50]
008f1ee4	adrp x9,0xc4e000
008f1ee8	add x9,x9,#0xd58
008f1eec	mov x25,x0
008f1ef0	mov x26,x0
008f1ef4	add x8,x8,#0x10
008f1ef8	add x9,x9,#0x10
008f1efc	mov x19,x0
008f1f00	str xzr,[x25, #0x8]!
008f1f04	str x8,[x0]
008f1f08	str x9,[x26, #0x20]!
008f1f0c	str x26,[x0, #0x40]
008f1f10	stp x23,x22,[x0, #0x28]
008f1f14	mov w0,#0x188
008f1f18	bl 0x00c2fed0
008f1f1c	mov x23,x0
008f1f20	add x0,x0,#0x8
008f1f24	mov w2,#0x6c
008f1f28	mov w1,wzr
008f1f2c	bl 0x00c301c0
008f1f30	adrp x8,0xcb4000
008f1f34	ldr x8,[x8, #0xd40]
008f1f38	str x23,[x19, #0x50]
008f1f3c	add x8,x8,#0x10
008f1f40	str x8,[x23]
008f1f44	add x0,sp,#0x10
008f1f48	mov x1,x23
008f1f4c	bl 0x00c316e0
008f1f50	add x22,x21,#0xa8
008f1f54	mov x0,x22
008f1f58	bl 0x00c2ff10
008f1f5c	ldxr x8,[x25]
008f1f60	add x8,x8,#0x1
008f1f64	stxr w9,x8,[x25]
008f1f68	cbnz w9,0x008f1f5c
008f1f6c	ldp x9,x10,[x21, #0x80]
008f1f70	ldp x12,x8,[x21, #0x98]
008f1f74	mov w11,#0x55
008f1f78	subs x13,x10,x9
008f1f7c	asr x13,x13,#0x3
008f1f80	mul x11,x13,x11
008f1f84	sub x11,x11,#0x1
008f1f88	csel x13,xzr,x11,eq
008f1f8c	add x11,x8,x12
008f1f90	cmp x13,x11
008f1f94	b.ne 0x008f1fac
008f1f98	add x0,x21,#0x78
008f1f9c	bl 0x00c31620
008f1fa0	ldp x11,x8,[x21, #0x98]
008f1fa4	ldp x9,x10,[x21, #0x80]
008f1fa8	add x11,x11,x8
008f1fac	cmp x10,x9
008f1fb0	b.eq 0x008f1fdc
008f1fb4	orr x10,xzr,#-0x3f3f3f3f3f3f3f40
008f1fb8	movk x10,#0xc0c1
008f1fbc	umulh x10,x11,x10
008f1fc0	lsr x10,x10,#0x6
008f1fc4	ldr x9,[x9, x10, LSL #0x3]
008f1fc8	mov w12,#0x55
008f1fcc	msub x10,x10,x12,x11
008f1fd0	orr w11,wzr,#0x30
008f1fd4	madd x9,x10,x11,x9
008f1fd8	b 0x008f1fe0
008f1fdc	mov x9,xzr
008f1fe0	adrp x10,0xc4e000
008f1fe4	add x10,x10,#0xdb8
008f1fe8	add x8,x8,#0x1
008f1fec	add x10,x10,#0x10
008f1ff0	mov x0,x22
008f1ff4	stp x26,x19,[x9, #0x8]
008f1ff8	str x9,[x9, #0x20]
008f1ffc	str x10,[x9]
008f2000	str x8,[x21, #0xa0]
008f2004	bl 0x00c2ff20
008f2008	add x0,x21,#0xd0
008f200c	bl 0x00c315f0
008f2010	ldr x21,[sp, #0x10]
008f2014	ldaxr x8,[x25]
008f2018	sub x9,x8,#0x1
008f201c	stlxr w10,x9,[x25]
008f2020	cbnz w10,0x008f2014
008f2024	cbnz x8,0x008f2040
008f2028	ldr x8,[x19]
008f202c	mov x0,x19
008f2030	ldr x8,[x8, #0x10]
008f2034	blr x8
008f2038	mov x0,x19
008f203c	bl 0x00c2ff00
008f2040	ldr x19,[sp, #0x8]
008f2044	stp xzr,xzr,[x20, #0x8]
008f2048	str x21,[x20]
008f204c	cbz x19,0x008f2080
008f2050	add x8,x19,#0x8
008f2054	ldaxr x9,[x8]
008f2058	sub x10,x9,#0x1
008f205c	stlxr w11,x10,[x8]
008f2060	cbnz w11,0x008f2054
008f2064	cbnz x9,0x008f2080
008f2068	ldr x8,[x19]
008f206c	mov x0,x19
008f2070	ldr x8,[x8, #0x10]
008f2074	blr x8
008f2078	mov x0,x19
008f207c	bl 0x00c2ff00
008f2080	ldr x8,[x24, #0x28]
008f2084	ldr x9,[sp, #0x18]
008f2088	cmp x8,x9
008f208c	b.ne 0x008f20ac
008f2090	ldp x29,x30,[sp, #0x60]
008f2094	ldp x20,x19,[sp, #0x50]
008f2098	ldp x22,x21,[sp, #0x40]
008f209c	ldp x24,x23,[sp, #0x30]
008f20a0	ldp x26,x25,[sp, #0x20]
008f20a4	add sp,sp,#0x70
008f20a8	ret
008f20ac	bl 0x00c2fec0
