; cpr::util::secureStringClear @ 00900e34
00900e34	sub sp,sp,#0x30
00900e38	stp x29,x30,[sp, #0x20]
00900e3c	add x29,sp,#0x20
00900e40	mrs x8,tpidr_el0
00900e44	ldr x8,[x8, #0x28]
00900e48	stur x8,[x29, #-0x8]
00900e4c	str x0,[sp, #0x8]
00900e50	ldr x8,[sp, #0x8]
00900e54	ldrb w9,[x8]
00900e58	tbz w9,#0x0,0x00900e64
00900e5c	ldr x8,[x8, #0x8]
00900e60	b 0x00900e6c
00900e64	ubfx w8,w9,#0x1,#0x7
00900e68	ubfx x8,x8,#0x0,#0x8
00900e6c	cbnz x8,0x00900e74
00900e70	b 0x00900edc
00900e74	ldr x8,[sp, #0x8]
00900e78	ldrb w9,[x8]
00900e7c	tbz w9,#0x0,0x00900e88
00900e80	ldr x8,[x8, #0x10]
00900e84	b 0x00900e8c
00900e88	add x8,x8,#0x1
00900e8c	str x8,[sp, #0x10]
00900e90	ldr x0,[sp, #0x10]
00900e94	ldr x8,[sp, #0x8]
00900e98	ldrb w9,[x8]
00900e9c	tbz w9,#0x0,0x00900ea8
00900ea0	ldr x2,[x8, #0x8]
00900ea4	b 0x00900eb0
00900ea8	ubfx w8,w9,#0x1,#0x7
00900eac	ubfx x2,x8,#0x0,#0x8
00900eb0	uxtb w1,wzr
00900eb4	bl 0x00c301c0
00900eb8	ldr x8,[sp, #0x8]
00900ebc	ldrb w9,[x8]
00900ec0	tbz w9,#0x0,0x00900ed4
00900ec4	ldr x9,[x8, #0x10]
00900ec8	strb wzr,[x9]
00900ecc	str xzr,[x8, #0x8]
00900ed0	b 0x00900edc
00900ed4	strb wzr,[x8, #0x1]
00900ed8	strb wzr,[x8]
00900edc	mrs x8,tpidr_el0
00900ee0	ldr x8,[x8, #0x28]
00900ee4	ldur x9,[x29, #-0x8]
00900ee8	cmp x8,x9
00900eec	b.ne 0x00900efc
00900ef0	ldp x29,x30,[sp, #0x20]
00900ef4	add sp,sp,#0x30
00900ef8	ret
00900efc	bl 0x00c2fec0
