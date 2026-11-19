; FUN_00875b54 @ 00875b54
00875b54	sub sp,sp,#0x30
00875b58	stp x29,x30,[sp, #0x10]
00875b5c	stp x20,x19,[sp, #0x20]
00875b60	add x29,sp,#0x10
00875b64	ubfiz w8,w2,#0x8,#0x8
00875b68	ubfiz w9,w3,#0x10,#0x8
00875b6c	mrs x20,tpidr_el0
00875b70	ldr x10,[x20, #0x28]
00875b74	mov x19,x0
00875b78	add x0,x0,#0x30
00875b7c	orr w8,w8,w1
00875b80	add x1,sp,#0x4
00875b84	orr w8,w8,w9
00875b88	str x10,[sp, #0x8]
00875b8c	orr w8,w8,w4, LSL #0x18
00875b90	str w8,[sp, #0x4]
00875b94	bl 0x0087593c
00875b98	add x0,x19,#0x48
00875b9c	add x1,x19,#0x1a0
00875ba0	bl 0x00875bc8
00875ba4	ldr x8,[x20, #0x28]
00875ba8	ldr x9,[sp, #0x8]
00875bac	cmp x8,x9
00875bb0	b.ne 0x00875bc4
00875bb4	ldp x20,x19,[sp, #0x20]
00875bb8	ldp x29,x30,[sp, #0x10]
00875bbc	add sp,sp,#0x30
00875bc0	ret
00875bc4	bl 0x00c2fec0
