; WebSocketHandshakeKeyGen::static_for<15,WebSocketHandshakeKeyGen::Sha1Loop<4>>::operator() @ 009a0efc
009a0efc	sub sp,sp,#0x40
009a0f00	str x21,[sp, #0x10]
009a0f04	stp x20,x19,[sp, #0x20]
009a0f08	stp x29,x30,[sp, #0x30]
009a0f0c	add x29,sp,#0x30
009a0f10	mrs x21,tpidr_el0
009a0f14	ldr x8,[x21, #0x28]
009a0f18	mov x0,sp
009a0f1c	mov x20,x2
009a0f20	mov x19,x1
009a0f24	str x8,[sp, #0x8]
009a0f28	bl 0x00c33a50
009a0f2c	ldr w8,[x20]
009a0f30	ldr w9,[x20, #0x2c]
009a0f34	ldr w10,[x20, #0x14]
009a0f38	ldr w11,[x20, #0xc]
009a0f3c	eor w8,w9,w8
009a0f40	eor w8,w8,w10
009a0f44	eor w8,w8,w11
009a0f48	ror w9,w8,#0x1f
009a0f4c	str w9,[x20, #0xc]
009a0f50	ldp w12,w10,[x19, #0xc]
009a0f54	ldp w14,w11,[x19, #0x4]
009a0f58	ldr w13,[x19]
009a0f5c	mov w8,#0xbcdc
009a0f60	orr w15,w12,w10
009a0f64	and w12,w12,w10
009a0f68	ror w10,w10,#0x2
009a0f6c	and w11,w15,w11
009a0f70	str w10,[x19, #0x10]
009a0f74	orr w10,w11,w12
009a0f78	add w9,w9,w10
009a0f7c	ror w13,w13,#0x1b
009a0f80	add w9,w9,w14
009a0f84	movk w8,#0x8f1b, LSL #16
009a0f88	add w9,w9,w13
009a0f8c	add w9,w9,w8
009a0f90	str w9,[x19, #0x4]
009a0f94	ldr w9,[x20, #0x4]
009a0f98	ldr w10,[x20, #0x30]
009a0f9c	ldr w11,[x20, #0x18]
009a0fa0	ldr w12,[x20, #0x10]
009a0fa4	eor w9,w10,w9
009a0fa8	eor w9,w9,w11
009a0fac	eor w9,w9,w12
009a0fb0	ror w9,w9,#0x1f
009a0fb4	str w9,[x20, #0x10]
009a0fb8	ldp w10,w14,[x19]
009a0fbc	ldp w12,w11,[x19, #0xc]
009a0fc0	ldr w13,[x19, #0x8]
009a0fc4	orr w15,w11,w10
009a0fc8	and w12,w15,w12
009a0fcc	and w11,w11,w10
009a0fd0	orr w11,w12,w11
009a0fd4	ror w10,w10,#0x2
009a0fd8	add w9,w9,w11
009a0fdc	str w10,[x19]
009a0fe0	ror w10,w14,#0x1b
009a0fe4	add w9,w9,w13
009a0fe8	add w9,w9,w10
009a0fec	add w9,w9,w8
009a0ff0	str w9,[x19, #0x8]
009a0ff4	ldr w9,[x20, #0x8]
009a0ff8	ldr w10,[x20, #0x34]
009a0ffc	ldr w11,[x20, #0x1c]
009a1000	ldr w12,[x20, #0x14]
009a1004	eor w9,w10,w9
009a1008	eor w9,w9,w11
009a100c	eor w9,w9,w12
009a1010	ror w9,w9,#0x1f
009a1014	str w9,[x20, #0x14]
009a1018	ldp w10,w11,[x19]
009a101c	ldr w12,[x19, #0x10]
009a1020	orr w13,w10,w11
009a1024	and w10,w10,w11
009a1028	ror w11,w11,#0x2
009a102c	and w12,w13,w12
009a1030	str w11,[x19, #0x4]
009a1034	ldp w13,w11,[x19, #0x8]
009a1038	orr w10,w12,w10
009a103c	add w9,w9,w10
009a1040	ror w13,w13,#0x1b
009a1044	add w9,w9,w11
009a1048	add w9,w9,w13
009a104c	add w9,w9,w8
009a1050	str w9,[x19, #0xc]
009a1054	ldr w9,[x20, #0xc]
009a1058	ldr w10,[x20, #0x38]
009a105c	ldr w11,[x20, #0x20]
009a1060	ldr w12,[x20, #0x18]
009a1064	eor w9,w10,w9
009a1068	eor w9,w9,w11
009a106c	eor w9,w9,w12
009a1070	ror w9,w9,#0x1f
009a1074	str w9,[x20, #0x18]
009a1078	ldp w10,w11,[x19, #0x4]
009a107c	ldr w12,[x19]
009a1080	orr w14,w10,w11
009a1084	and w12,w14,w12
009a1088	ldp w13,w14,[x19, #0xc]
009a108c	and w10,w10,w11
009a1090	orr w10,w12,w10
009a1094	add w9,w9,w10
009a1098	ror w13,w13,#0x1b
009a109c	add w9,w9,w14
009a10a0	add w9,w9,w13
009a10a4	ror w11,w11,#0x2
009a10a8	add w8,w9,w8
009a10ac	str w11,[x19, #0x8]
009a10b0	str w8,[x19, #0x10]
009a10b4	ldr x8,[x21, #0x28]
009a10b8	ldr x9,[sp, #0x8]
009a10bc	cmp x8,x9
009a10c0	b.ne 0x009a10d8
009a10c4	ldp x29,x30,[sp, #0x30]
009a10c8	ldp x20,x19,[sp, #0x20]
009a10cc	ldr x21,[sp, #0x10]
009a10d0	add sp,sp,#0x40
009a10d4	ret
009a10d8	bl 0x00c2fec0
