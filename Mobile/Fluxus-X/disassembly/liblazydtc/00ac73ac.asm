; ossl_property_name @ 00ac73ac
00ac73ac	stp x20,x19,[sp, #-0x20]!
00ac73b0	mov w20,w2
00ac73b4	adrp x2,0xc7c000
00ac73b8	mov x19,x1
00ac73bc	add x2,x2,#0x760
00ac73c0	orr w1,wzr,#0x3
00ac73c4	stp x29,x30,[sp, #0x10]
00ac73c8	add x29,sp,#0x10
00ac73cc	bl 0x00c3b520
00ac73d0	cbz x0,0x00ac73f8
00ac73d4	ldp x8,x1,[x0]
00ac73d8	ldp x29,x30,[sp, #0x10]
00ac73dc	add x9,x0,#0x18
00ac73e0	cmp w20,#0x0
00ac73e4	csel x2,xzr,x9,eq
00ac73e8	mov x0,x8
00ac73ec	mov x3,x19
00ac73f0	ldp x20,x19,[sp], #0x20
00ac73f4	b 0x00ac7404
00ac73f8	ldp x29,x30,[sp, #0x10]
00ac73fc	ldp x20,x19,[sp], #0x20
00ac7400	ret
