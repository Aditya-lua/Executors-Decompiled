; FUN_00b4d0dc @ 00b4d0dc
00b4d0dc	stp x22,x21,[sp, #-0x30]!
00b4d0e0	stp x20,x19,[sp, #0x10]
00b4d0e4	stp x29,x30,[sp, #0x20]
00b4d0e8	add x29,sp,#0x20
00b4d0ec	mov x19,x2
00b4d0f0	mov w21,w1
00b4d0f4	bl 0x00c41210
00b4d0f8	mov x22,x0
00b4d0fc	bl 0x00c41000
00b4d100	tst w21,#0x7
00b4d104	mov x20,xzr
00b4d108	b.eq 0x00b4d174
00b4d10c	cbz w0,0x00b4d174
00b4d110	adrp x1,0x2b3000
00b4d114	add x1,x1,#0x30
00b4d118	mov w0,#0x68
00b4d11c	mov w2,#0x19e
00b4d120	bl 0x00c34250
00b4d124	mov x20,x0
00b4d128	cbz x0,0x00b4d14c
00b4d12c	adrp x8,0x29b000
00b4d130	adrp x9,0x29c000
00b4d134	ldr q0,[x8, #0xfd0]
00b4d138	ldr q1,[x9, #0x920]
00b4d13c	str w21,[x20, #0x10]
00b4d140	str x22,[x20]
00b4d144	stur q0,[x20, #0x18]
00b4d148	stur q1,[x20, #0x38]
00b4d14c	mov x0,x20
00b4d150	mov x1,x19
00b4d154	bl 0x00b4d1d0
00b4d158	cbnz w0,0x00b4d174
00b4d15c	adrp x1,0x2b3000
00b4d160	add x1,x1,#0x30
00b4d164	mov w2,#0x1ad
00b4d168	mov x0,x20
00b4d16c	bl 0x00c32310
00b4d170	mov x20,xzr
00b4d174	mov x0,x20
00b4d178	ldp x29,x30,[sp, #0x20]
00b4d17c	ldp x20,x19,[sp, #0x10]
00b4d180	ldp x22,x21,[sp], #0x30
00b4d184	ret
