; SHA256 @ 00addf80
00addf80	str x19,[sp, #-0x20]!
00addf84	adrp x8,0xd22000
00addf88	add x8,x8,#0x278
00addf8c	cmp x2,#0x0
00addf90	mov x4,x1
00addf94	csel x19,x8,x2,eq
00addf98	adrp x1,0x2d7000
00addf9c	mov x3,x0
00addfa0	add x1,x1,#0x8b0
00addfa4	mov x0,xzr
00addfa8	mov x2,xzr
00addfac	mov x5,x19
00addfb0	mov x6,xzr
00addfb4	stp x29,x30,[sp, #0x10]
00addfb8	add x29,sp,#0x10
00addfbc	bl 0x00c3c220
00addfc0	ldp x29,x30,[sp, #0x10]
00addfc4	cmp w0,#0x0
00addfc8	csel x0,xzr,x19,eq
00addfcc	ldr x19,[sp], #0x20
00addfd0	ret
