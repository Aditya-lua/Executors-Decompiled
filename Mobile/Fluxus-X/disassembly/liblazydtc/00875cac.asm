; FUN_00875cac @ 00875cac
00875cac	sub sp,sp,#0x30
00875cb0	stp x29,x30,[sp, #0x10]
00875cb4	stp x20,x19,[sp, #0x20]
00875cb8	add x29,sp,#0x10
00875cbc	ubfiz w8,w2,#0x8,#0x8
00875cc0	mrs x20,tpidr_el0
00875cc4	mov x19,x0
00875cc8	ldr x9,[x20, #0x28]
00875ccc	add x0,x0,#0x30
00875cd0	orr w8,w8,w1
00875cd4	add x1,sp,#0x4
00875cd8	orr w8,w8,w3, LSL #0x10
00875cdc	str x9,[sp, #0x8]
00875ce0	str w8,[sp, #0x4]
00875ce4	bl 0x0087593c
00875ce8	add x0,x19,#0x48
00875cec	add x1,x19,#0x1a0
00875cf0	bl 0x00875bc8
00875cf4	ldr x8,[x20, #0x28]
00875cf8	ldr x9,[sp, #0x8]
00875cfc	cmp x8,x9
00875d00	b.ne 0x00875d14
00875d04	ldp x20,x19,[sp, #0x20]
00875d08	ldp x29,x30,[sp, #0x10]
00875d0c	add sp,sp,#0x30
00875d10	ret
00875d14	bl 0x00c2fec0
