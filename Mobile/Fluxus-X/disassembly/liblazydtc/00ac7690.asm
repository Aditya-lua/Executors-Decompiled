; ossl_property_value @ 00ac7690
00ac7690	stp x20,x19,[sp, #-0x20]!
00ac7694	mov w20,w2
00ac7698	adrp x2,0xc7c000
00ac769c	mov x19,x1
00ac76a0	add x2,x2,#0x760
00ac76a4	orr w1,wzr,#0x3
00ac76a8	stp x29,x30,[sp, #0x10]
00ac76ac	add x29,sp,#0x10
00ac76b0	bl 0x00c3b520
00ac76b4	cbz x0,0x00ac76e0
00ac76b8	ldr x8,[x0]
00ac76bc	ldr x1,[x0, #0x10]
00ac76c0	ldp x29,x30,[sp, #0x10]
00ac76c4	add x9,x0,#0x1c
00ac76c8	cmp w20,#0x0
00ac76cc	csel x2,xzr,x9,eq
00ac76d0	mov x0,x8
00ac76d4	mov x3,x19
00ac76d8	ldp x20,x19,[sp], #0x20
00ac76dc	b 0x00ac7404
00ac76e0	ldp x29,x30,[sp, #0x10]
00ac76e4	ldp x20,x19,[sp], #0x20
00ac76e8	ret
