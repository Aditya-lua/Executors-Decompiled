; FUN_00a8b09c @ 00a8b09c
00a8b09c	sub sp,sp,#0x60
00a8b0a0	stp x26,x25,[sp, #0x10]
00a8b0a4	stp x24,x23,[sp, #0x20]
00a8b0a8	stp x22,x21,[sp, #0x30]
00a8b0ac	stp x20,x19,[sp, #0x40]
00a8b0b0	stp x29,x30,[sp, #0x50]
00a8b0b4	add x29,sp,#0x50
00a8b0b8	cbz x3,0x00a8b150
00a8b0bc	adrp x25,0xcb5000
00a8b0c0	ldr x25,[x25, #0x318]
00a8b0c4	lsr x8,x3,#0x1e
00a8b0c8	mov w9,#0x40000000
00a8b0cc	cmp x8,#0x0
00a8b0d0	mov x19,x3
00a8b0d4	mov x20,x2
00a8b0d8	mov x21,x1
00a8b0dc	mov x22,x0
00a8b0e0	add x23,x0,#0x28
00a8b0e4	csel x24,x3,x9,eq
00a8b0e8	mov x0,x22
00a8b0ec	bl 0x00c3ceb0
00a8b0f0	str w0,[sp, #0xc]
00a8b0f4	mov x0,x22
00a8b0f8	bl 0x00c3cea0
00a8b0fc	mov x26,x0
00a8b100	mov x0,x22
00a8b104	bl 0x00c3cec0
00a8b108	mov w6,w0
00a8b10c	add x5,sp,#0xc
00a8b110	mov x0,x20
00a8b114	mov x1,x21
00a8b118	mov x2,x24
00a8b11c	mov x3,x26
00a8b120	mov x4,x23
00a8b124	mov x7,x25
00a8b128	bl 0x00c3e2f0
00a8b12c	ldr w1,[sp, #0xc]
00a8b130	mov x0,x22
00a8b134	bl 0x00c3ced0
00a8b138	sub x19,x19,x24
00a8b13c	cmp x19,x24
00a8b140	add x20,x20,x24
00a8b144	add x21,x21,x24
00a8b148	csel x24,x19,x24,cc
00a8b14c	cbnz x19,0x00a8b0e8
00a8b150	ldp x29,x30,[sp, #0x50]
00a8b154	ldp x20,x19,[sp, #0x40]
00a8b158	ldp x22,x21,[sp, #0x30]
00a8b15c	ldp x24,x23,[sp, #0x20]
00a8b160	ldp x26,x25,[sp, #0x10]
00a8b164	mov w0,#0x1
00a8b168	add sp,sp,#0x60
00a8b16c	ret
