; FUN_00b2a034 @ 00b2a034
00b2a034	str x19,[sp, #-0x20]!
00b2a038	stp x29,x30,[sp, #0x10]
00b2a03c	add x29,sp,#0x10
00b2a040	cbz x1,0x00b2a0a0
00b2a044	mov x19,x1
00b2a048	adrp x1,0x2bd000
00b2a04c	add x1,x1,#0xa97
00b2a050	mov x0,x19
00b2a054	bl 0x00c36530
00b2a058	cbz x0,0x00b2a074
00b2a05c	add x1,sp,#0x8
00b2a060	bl 0x00c3e920
00b2a064	cbz w0,0x00b2a0a8
00b2a068	ldr x8,[sp, #0x8]
00b2a06c	cmp x8,#0x20
00b2a070	b.ne 0x00b2a0c4
00b2a074	adrp x1,0x2c3000
00b2a078	add x1,x1,#0x9bc
00b2a07c	mov x0,x19
00b2a080	bl 0x00c36530
00b2a084	cbz x0,0x00b2a0a0
00b2a088	add x1,sp,#0x8
00b2a08c	bl 0x00c3e920
00b2a090	cbz w0,0x00b2a0ec
00b2a094	ldr x8,[sp, #0x8]
00b2a098	cmp x8,#0x10
00b2a09c	b.ne 0x00b2a114
00b2a0a0	mov w0,#0x1
00b2a0a4	b 0x00b2a144
00b2a0a8	bl 0x00c342a0
00b2a0ac	adrp x0,0x2cc000
00b2a0b0	adrp x2,0x2ae000
00b2a0b4	add x0,x0,#0x5a1
00b2a0b8	add x2,x2,#0xa58
00b2a0bc	mov w1,#0x87
00b2a0c0	b 0x00b2a104
00b2a0c4	bl 0x00c342a0
00b2a0c8	adrp x0,0x2cc000
00b2a0cc	adrp x2,0x2ae000
00b2a0d0	add x0,x0,#0x5a1
00b2a0d4	add x2,x2,#0xa58
00b2a0d8	mov w1,#0x8b
00b2a0dc	bl 0x00c342b0
00b2a0e0	mov w0,#0x39
00b2a0e4	mov w1,#0x69
00b2a0e8	b 0x00b2a138
00b2a0ec	bl 0x00c342a0
00b2a0f0	adrp x0,0x2cc000
00b2a0f4	adrp x2,0x2ae000
00b2a0f8	add x0,x0,#0x5a1
00b2a0fc	add x2,x2,#0xa58
00b2a100	mov w1,#0x92
00b2a104	bl 0x00c342b0
00b2a108	mov w0,#0x39
00b2a10c	mov w1,#0x67
00b2a110	b 0x00b2a138
00b2a114	bl 0x00c342a0
00b2a118	adrp x0,0x2cc000
00b2a11c	adrp x2,0x2ae000
00b2a120	add x0,x0,#0x5a1
00b2a124	add x2,x2,#0xa58
00b2a128	mov w1,#0x96
00b2a12c	bl 0x00c342b0
00b2a130	mov w0,#0x39
00b2a134	mov w1,#0x6d
00b2a138	mov x2,xzr
00b2a13c	bl 0x00c342c0
00b2a140	mov w0,wzr
00b2a144	ldp x29,x30,[sp, #0x10]
00b2a148	ldr x19,[sp], #0x20
00b2a14c	ret
