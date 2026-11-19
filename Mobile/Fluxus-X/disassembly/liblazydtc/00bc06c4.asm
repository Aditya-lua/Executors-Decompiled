; HUF_readStats @ 00bc06c4
00bc06c4	stp x29,x30,[sp, #-0x20]!
00bc06c8	stp x28,x19,[sp, #0x10]
00bc06cc	mov x29,sp
00bc06d0	sub sp,sp,#0x390
00bc06d4	mrs x19,tpidr_el0
00bc06d8	add x7,sp,#0x1c
00bc06dc	ldr x8,[x19, #0x28]
00bc06e0	stur x8,[x29, #-0x8]
00bc06e4	mov w8,#0x36c
00bc06e8	str x8,[sp]
00bc06ec	bl 0x00c43730
00bc06f0	ldr x8,[x19, #0x28]
00bc06f4	ldur x9,[x29, #-0x8]
00bc06f8	cmp x8,x9
00bc06fc	b.ne 0x00bc0710
00bc0700	add sp,sp,#0x390
00bc0704	ldp x28,x19,[sp, #0x10]
00bc0708	ldp x29,x30,[sp], #0x20
00bc070c	ret
00bc0710	bl 0x00c2fec0
