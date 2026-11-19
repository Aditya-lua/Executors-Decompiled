; FUN_008c8e84 @ 008c8e84
008c8e84	sub sp,sp,#0x70
008c8e88	stp x29,x30,[sp, #0x20]
008c8e8c	str x25,[sp, #0x30]
008c8e90	stp x24,x23,[sp, #0x40]
008c8e94	stp x22,x21,[sp, #0x50]
008c8e98	stp x20,x19,[sp, #0x60]
008c8e9c	add x29,sp,#0x20
008c8ea0	mrs x24,tpidr_el0
008c8ea4	ubfx w9,w4,#0x14,#0xa
008c8ea8	mov x21,x2
008c8eac	ldr x8,[x24, #0x28]
008c8eb0	mov w22,w5
008c8eb4	mov w20,w4
008c8eb8	add x2,x2,w9, UXTW  #0x4
008c8ebc	mov x23,x3
008c8ec0	mov x19,x0
008c8ec4	stur x8,[x29, #-0x8]
008c8ec8	mov w8,#0x6
008c8ecc	ldr x25,[x0, #0x58]
008c8ed0	str x1,[sp, #0x8]
008c8ed4	add x1,sp,#0x8
008c8ed8	str w8,[sp, #0x14]
008c8edc	bl 0x008cadd4
008c8ee0	tbnz w20,#0x1f,0x008c8f10
008c8ee4	ldr x8,[x24, #0x28]
008c8ee8	ldur x9,[x29, #-0x8]
008c8eec	cmp x8,x9
008c8ef0	b.ne 0x008c8f98
008c8ef4	ldp x20,x19,[sp, #0x60]
008c8ef8	ldr x25,[sp, #0x30]
008c8efc	ldp x22,x21,[sp, #0x50]
008c8f00	ldp x24,x23,[sp, #0x40]
008c8f04	ldp x29,x30,[sp, #0x20]
008c8f08	add sp,sp,#0x70
008c8f0c	ret
008c8f10	ldr x9,[x19, #0x58]
008c8f14	ubfx w8,w20,#0xa,#0xa
008c8f18	sub x23,x23,x25
008c8f1c	add x1,x9,x23
008c8f20	tbz w22,#0x0,0x008c8f5c
008c8f24	ldr w9,[x1, #0xc]
008c8f28	cbz w9,0x008c8ee4
008c8f2c	add x2,x21,w8, UXTW  #0x4
008c8f30	mov x0,x19
008c8f34	mov x3,x1
008c8f38	bl 0x008cadd4
008c8f3c	lsr w8,w20,#0x1e
008c8f40	cmp w8,#0x2
008c8f44	b.ls 0x008c8ee4
008c8f48	ldr x8,[x19, #0x58]
008c8f4c	add x9,x8,x23
008c8f50	ldr w9,[x9, #0xc]
008c8f54	cbnz w9,0x008c8f7c
008c8f58	b 0x008c8ee4
008c8f5c	add x2,x21,w8, UXTW  #0x4
008c8f60	mov x0,x19
008c8f64	mov x3,x1
008c8f68	bl 0x008cadd4
008c8f6c	lsr w8,w20,#0x1e
008c8f70	cmp w8,#0x3
008c8f74	b.cc 0x008c8ee4
008c8f78	ldr x8,[x19, #0x58]
008c8f7c	and w9,w20,#0x3ff
008c8f80	add x1,x8,x23
008c8f84	add x3,x8,x23
008c8f88	add x2,x21,w9, UXTW  #0x4
008c8f8c	mov x0,x19
008c8f90	bl 0x008cadd4
008c8f94	b 0x008c8ee4
008c8f98	bl 0x00c2fec0
