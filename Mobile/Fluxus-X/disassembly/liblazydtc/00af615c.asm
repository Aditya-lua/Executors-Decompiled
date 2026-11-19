; FUN_00af615c @ 00af615c
00af615c	str x21,[sp, #-0x30]!
00af6160	stp x20,x19,[sp, #0x10]
00af6164	stp x29,x30,[sp, #0x20]
00af6168	add x29,sp,#0x20
00af616c	mov w21,w1
00af6170	bl 0x00af5f98
00af6174	cbz x0,0x00af61a4
00af6178	ldr x8,[x0, #0x8]
00af617c	mov x19,x0
00af6180	cbz x8,0x00af61a4
00af6184	ldr w9,[x8]
00af6188	cmp w9,#0x1
00af618c	b.eq 0x00af61bc
00af6190	cbnz w9,0x00af61c4
00af6194	ldr x8,[x8, #0x8]
00af6198	mov x20,xzr
00af619c	cbnz x8,0x00af61a8
00af61a0	b 0x00af61c4
00af61a4	mov x20,xzr
00af61a8	mov x0,x20
00af61ac	ldp x29,x30,[sp, #0x20]
00af61b0	ldp x20,x19,[sp, #0x10]
00af61b4	ldr x21,[sp], #0x30
00af61b8	ret
00af61bc	ldr x20,[x8, #0x8]
00af61c0	cbnz x20,0x00af61a8
00af61c4	bl 0x00c34780
00af61c8	mov x20,x0
00af61cc	cbz x0,0x00af61a8
00af61d0	cmp w21,#0x2
00af61d4	b.eq 0x00af61ec
00af61d8	cmp w21,#0x1
00af61dc	b.ne 0x00af61fc
00af61e0	adrp x1,0xaf8000
00af61e4	add x1,x1,#0x3e0
00af61e8	b 0x00af61f4
00af61ec	adrp x1,0xaf8000
00af61f0	add x1,x1,#0x3f0
00af61f4	mov x0,x20
00af61f8	bl 0x00c34df0
00af61fc	ldr x8,[x19, #0x8]
00af6200	mov w9,#0x1
00af6204	str w9,[x8]
00af6208	str x20,[x8, #0x8]
00af620c	b 0x00af61a8
