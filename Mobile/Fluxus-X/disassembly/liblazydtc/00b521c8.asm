; FUN_00b521c8 @ 00b521c8
00b521c8	stp x20,x19,[sp, #-0x20]!
00b521cc	stp x29,x30,[sp, #0x10]
00b521d0	add x29,sp,#0x10
00b521d4	mov x20,x1
00b521d8	mov x19,x0
00b521dc	bl 0x00c41000
00b521e0	mov w8,w0
00b521e4	cmp x20,#0x8
00b521e8	mov x0,xzr
00b521ec	b.ne 0x00b52218
00b521f0	cbz w8,0x00b52218
00b521f4	ldr x20,[x19]
00b521f8	orr w1,wzr,#0xf000
00b521fc	mov x0,x20
00b52200	bl 0x00c3fac0
00b52204	mov w8,w0
00b52208	mov x0,xzr
00b5220c	cbnz w8,0x00b52218
00b52210	mov x0,x20
00b52214	str xzr,[x19]
00b52218	ldp x29,x30,[sp, #0x10]
00b5221c	ldp x20,x19,[sp], #0x20
00b52220	ret
