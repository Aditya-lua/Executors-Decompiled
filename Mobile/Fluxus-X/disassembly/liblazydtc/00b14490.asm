; X509_VERIFY_PARAM_add0_policy @ 00b14490
00b14490	stp x20,x19,[sp, #-0x20]!
00b14494	stp x29,x30,[sp, #0x10]
00b14498	mov x20,x0
00b1449c	ldr x0,[x0, #0x30]
00b144a0	mov x19,x1
00b144a4	add x29,sp,#0x10
00b144a8	cbnz x0,0x00b144b8
00b144ac	bl 0x00c34780
00b144b0	str x0,[x20, #0x30]
00b144b4	cbz x0,0x00b144c8
00b144b8	mov x1,x19
00b144bc	bl 0x00c347a0
00b144c0	cmp w0,#0x0
00b144c4	cset w0,gt
00b144c8	ldp x29,x30,[sp, #0x10]
00b144cc	ldp x20,x19,[sp], #0x20
00b144d0	ret
