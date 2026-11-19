; FUN_00a9b0a0 @ 00a9b0a0
00a9b0a0	stp x29,x30,[sp, #-0x10]!
00a9b0a4	adrp x8,0xd22000
00a9b0a8	add x8,x8,#0x108
00a9b0ac	ldr x9,[x8, #0x20]
00a9b0b0	mov x29,sp
00a9b0b4	cmp x9,x0
00a9b0b8	b.hi 0x00a9b12c
00a9b0bc	ldr x10,[x8, #0x28]
00a9b0c0	add x9,x9,x10, LSL #0x3
00a9b0c4	cmp x9,x0
00a9b0c8	b.ls 0x00a9b12c
00a9b0cc	ldr x9,[x8, #0x10]
00a9b0d0	cmp x9,x1
00a9b0d4	b.hi 0x00a9b144
00a9b0d8	ldr x8,[x8, #0x18]
00a9b0dc	add x10,x9,x8
00a9b0e0	cmp x10,x1
00a9b0e4	b.ls 0x00a9b144
00a9b0e8	ldr x8,[x0]
00a9b0ec	str x8,[x1]
00a9b0f0	cbz x8,0x00a9b11c
00a9b0f4	cmp x9,x8
00a9b0f8	b.hi 0x00a9b15c
00a9b0fc	cmp x10,x8
00a9b100	b.ls 0x00a9b15c
00a9b104	str x0,[x1, #0x8]
00a9b108	ldr x9,[x8, #0x8]
00a9b10c	cmp x9,x0
00a9b110	b.ne 0x00a9b174
00a9b114	str x1,[x8, #0x8]
00a9b118	b 0x00a9b120
00a9b11c	str x0,[x1, #0x8]
00a9b120	str x1,[x0]
00a9b124	ldp x29,x30,[sp], #0x10
00a9b128	ret
00a9b12c	adrp x0,0x2ba000
00a9b130	adrp x1,0x2d6000
00a9b134	add x0,x0,#0x1cf
00a9b138	add x1,x1,#0xc
00a9b13c	mov w2,#0x17a
00a9b140	bl 0x00c3c240
00a9b144	adrp x0,0x29e000
00a9b148	adrp x1,0x2d6000
00a9b14c	add x0,x0,#0x41c
00a9b150	add x1,x1,#0xc
00a9b154	mov w2,#0x17b
00a9b158	bl 0x00c3c240
00a9b15c	adrp x0,0x2cf000
00a9b160	adrp x1,0x2d6000
00a9b164	add x0,x0,#0xdd7
00a9b168	add x1,x1,#0xc
00a9b16c	mov w2,#0x17f
00a9b170	bl 0x00c3c240
00a9b174	adrp x0,0x2a2000
00a9b178	adrp x1,0x2d6000
00a9b17c	add x0,x0,#0x703
00a9b180	add x1,x1,#0xc
00a9b184	mov w2,#0x183
00a9b188	bl 0x00c3c240
