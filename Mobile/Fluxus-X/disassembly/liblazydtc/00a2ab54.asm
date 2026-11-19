; ossl_ec_GF2m_simple_points_make_affine @ 00a2ab54
00a2ab54	str x23,[sp, #-0x40]!
00a2ab58	stp x22,x21,[sp, #0x10]
00a2ab5c	stp x20,x19,[sp, #0x20]
00a2ab60	stp x29,x30,[sp, #0x30]
00a2ab64	add x29,sp,#0x30
00a2ab68	cbz x1,0x00a2aba8
00a2ab6c	mov x19,x3
00a2ab70	mov x20,x2
00a2ab74	mov x21,x1
00a2ab78	mov x22,x0
00a2ab7c	mov x23,xzr
00a2ab80	ldr x8,[x22]
00a2ab84	ldr x1,[x20, x23, LSL #0x3]
00a2ab88	mov x0,x22
00a2ab8c	mov x2,x19
00a2ab90	ldr x8,[x8, #0xd0]
00a2ab94	blr x8
00a2ab98	cbz w0,0x00a2abac
00a2ab9c	add x23,x23,#0x1
00a2aba0	cmp x23,x21
00a2aba4	b.cc 0x00a2ab80
00a2aba8	mov w0,#0x1
00a2abac	ldp x29,x30,[sp, #0x30]
00a2abb0	ldp x20,x19,[sp, #0x20]
00a2abb4	ldp x22,x21,[sp, #0x10]
00a2abb8	ldr x23,[sp], #0x40
00a2abbc	ret
