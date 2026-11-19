; FUN_00875d18 @ 00875d18
00875d18	sub sp,sp,#0x30
00875d1c	stp x29,x30,[sp, #0x10]
00875d20	stp x20,x19,[sp, #0x20]
00875d24	add x29,sp,#0x10
00875d28	mrs x20,tpidr_el0
00875d2c	mov x19,x0
00875d30	add x0,x0,#0x30
00875d34	ldr x8,[x20, #0x28]
00875d38	str x8,[sp, #0x8]
00875d3c	str w1,[sp, #0x4]
00875d40	add x1,sp,#0x4
00875d44	bl 0x0087593c
00875d48	add x0,x19,#0x48
00875d4c	add x1,x19,#0x1a0
00875d50	bl 0x00875bc8
00875d54	ldr x8,[x20, #0x28]
00875d58	ldr x9,[sp, #0x8]
00875d5c	cmp x8,x9
00875d60	b.ne 0x00875d74
00875d64	ldp x20,x19,[sp, #0x20]
00875d68	ldp x29,x30,[sp, #0x10]
00875d6c	add sp,sp,#0x30
00875d70	ret
00875d74	bl 0x00c2fec0
