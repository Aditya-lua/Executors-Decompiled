; FUN_00907c74 @ 00907c74
00907c74	sub sp,sp,#0x30
00907c78	str x19,[sp, #0x10]
00907c7c	stp x29,x30,[sp, #0x20]
00907c80	add x29,sp,#0x20
00907c84	mrs x19,tpidr_el0
00907c88	ldr x8,[x19, #0x28]
00907c8c	str x8,[sp, #0x8]
00907c90	cbz x0,0x00907cbc
00907c94	ldr x8,[x0]
00907c98	orr w2,wzr,#0x3
00907c9c	add x4,sp,#0x4
00907ca0	mov x3,xzr
00907ca4	ldr x8,[x8, #0x70]
00907ca8	blr x8
00907cac	ldr w8,[sp, #0x4]
00907cb0	cmp w0,#0x0
00907cb4	csinv w0,w8,wzr,eq
00907cb8	b 0x00907cc0
00907cbc	mov w0,#0xffffffff
00907cc0	ldr x8,[x19, #0x28]
00907cc4	ldr x9,[sp, #0x8]
00907cc8	cmp x8,x9
00907ccc	b.ne 0x00907ce0
00907cd0	ldp x29,x30,[sp, #0x20]
00907cd4	ldr x19,[sp, #0x10]
00907cd8	add sp,sp,#0x30
00907cdc	ret
00907ce0	bl 0x00c2fec0
