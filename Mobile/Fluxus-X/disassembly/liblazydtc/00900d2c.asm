; cpr::util::urlEncode @ 00900d2c
00900d2c	sub sp,sp,#0x160
00900d30	stp x28,x21,[sp, #0x130]
00900d34	stp x20,x19,[sp, #0x140]
00900d38	stp x29,x30,[sp, #0x150]
00900d3c	add x29,sp,#0x150
00900d40	mrs x21,tpidr_el0
00900d44	mov x20,x8
00900d48	ldr x8,[x21, #0x28]
00900d4c	mov x19,x0
00900d50	add x0,sp,#0x8
00900d54	stur x8,[x29, #-0x28]
00900d58	bl 0x00c30fb0
00900d5c	add x0,sp,#0x8
00900d60	mov x8,x20
00900d64	mov x1,x19
00900d68	bl 0x00c30e30
00900d6c	add x0,sp,#0x8
00900d70	bl 0x00c30fc0
00900d74	ldr x8,[x21, #0x28]
00900d78	ldur x9,[x29, #-0x28]
00900d7c	cmp x8,x9
00900d80	b.ne 0x00900d98
00900d84	ldp x29,x30,[sp, #0x150]
00900d88	ldp x20,x19,[sp, #0x140]
00900d8c	ldp x28,x21,[sp, #0x130]
00900d90	add sp,sp,#0x160
00900d94	ret
00900d98	bl 0x00c2fec0
