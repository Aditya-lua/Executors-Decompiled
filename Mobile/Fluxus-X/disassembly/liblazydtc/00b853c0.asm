; mbedtls_asn1_write_mpi @ 00b853c0
00b853c0	stp x22,x21,[sp, #-0x30]!
00b853c4	stp x20,x19,[sp, #0x10]
00b853c8	stp x29,x30,[sp, #0x20]
00b853cc	add x29,sp,#0x20
00b853d0	mov x19,x0
00b853d4	mov x0,x2
00b853d8	mov x22,x2
00b853dc	mov x20,x1
00b853e0	bl 0x00c41d30
00b853e4	ldr x8,[x19]
00b853e8	cmp x0,#0x0
00b853ec	csinc x21,x0,xzr,ne
00b853f0	subs x9,x8,x20
00b853f4	b.cc 0x00b85400
00b853f8	cmp x9,x21
00b853fc	b.cs 0x00b85414
00b85400	mov w0,#0xffffff94
00b85404	ldp x29,x30,[sp, #0x20]
00b85408	ldp x20,x19,[sp, #0x10]
00b8540c	ldp x22,x21,[sp], #0x30
00b85410	ret
00b85414	sub x1,x8,x21
00b85418	mov x0,x22
00b8541c	mov x2,x21
00b85420	str x1,[x19]
00b85424	bl 0x00c41d80
00b85428	cbnz w0,0x00b85404
00b8542c	ldrh w8,[x22, #0x8]
00b85430	cmp w8,#0x1
00b85434	b.ne 0x00b85460
00b85438	ldr x8,[x19]
00b8543c	ldrsb w9,[x8]
00b85440	tbz w9,#0x1f,0x00b85460
00b85444	sub x9,x8,x20
00b85448	cmp x9,#0x1
00b8544c	b.lt 0x00b85400
00b85450	sub x9,x8,#0x1
00b85454	add x21,x21,#0x1
00b85458	str x9,[x19]
00b8545c	sturb wzr,[x8, #-0x1]
00b85460	lsr x8,x21,#0x20
00b85464	cbz x8,0x00b85470
00b85468	mov w0,#0xffffff9c
00b8546c	b 0x00b85404
00b85470	mov w8,#0x1
00b85474	cmp x21,#0x80
00b85478	b.cc 0x00b8548c
00b8547c	mov x9,x21
00b85480	lsr x9,x9,#0x8
00b85484	add w8,w8,#0x1
00b85488	cbnz x9,0x00b85480
00b8548c	ldr x10,[x19]
00b85490	sub x9,x10,x20
00b85494	cmp x9,w8, UXTW 
00b85498	b.lt 0x00b85400
00b8549c	sub x11,x10,#0x1
00b854a0	lsr x9,x21,#0x8
00b854a4	str x11,[x19]
00b854a8	sturb w21,[x10, #-0x1]
00b854ac	cbz x9,0x00b854c8
00b854b0	ldr x10,[x19]
00b854b4	sub x11,x10,#0x1
00b854b8	str x11,[x19]
00b854bc	sturb w9,[x10, #-0x1]
00b854c0	lsr x9,x9,#0x8
00b854c4	cbnz x9,0x00b854b0
00b854c8	cmp w8,#0x2
00b854cc	b.cc 0x00b854e4
00b854d0	ldr x9,[x19]
00b854d4	add w10,w8,#0x7f
00b854d8	sub x11,x9,#0x1
00b854dc	str x11,[x19]
00b854e0	sturb w10,[x9, #-0x1]
00b854e4	ldr x9,[x19]
00b854e8	sub x10,x9,x20
00b854ec	cmp x10,#0x1
00b854f0	b.lt 0x00b85400
00b854f4	add w8,w21,w8
00b854f8	sub x10,x9,#0x1
00b854fc	mov w11,#0x2
00b85500	add w0,w8,#0x1
00b85504	str x10,[x19]
00b85508	sturb w11,[x9, #-0x1]
00b8550c	b 0x00b85404
