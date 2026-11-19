; __cxa_decrement_exception_refcount @ 00c296d0
00c296d0	paciasp
00c296d4	stp x29,x30,[sp, #-0x20]!
00c296d8	str x19,[sp, #0x10]
00c296dc	mov x29,sp
00c296e0	cbz x0,0x00c29714
00c296e4	mov x19,x0
00c296e8	sub x1,x0,#0x78
00c296ec	mov x0,#-0x1
00c296f0	bl 0x00c2bd10
00c296f4	cmp x0,#0x1
00c296f8	b.ne 0x00c29714
00c296fc	ldur x8,[x19, #-0x68]
00c29700	cbz x8,0x00c2970c
00c29704	mov x0,x19
00c29708	blr x8
00c2970c	sub x0,x19,#0x80
00c29710	bl 0x00c29ce0
00c29714	ldr x19,[sp, #0x10]
00c29718	ldp x29,x30,[sp], #0x20
00c2971c	autiasp
00c29720	ret
