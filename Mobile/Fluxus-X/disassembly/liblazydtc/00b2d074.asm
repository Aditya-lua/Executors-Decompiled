; FUN_00b2d074 @ 00b2d074
00b2d074	sub sp,sp,#0x90
00b2d078	stp x24,x23,[sp, #0x50]
00b2d07c	stp x22,x21,[sp, #0x60]
00b2d080	stp x20,x19,[sp, #0x70]
00b2d084	mov x19,x3
00b2d088	mov x23,x2
00b2d08c	lsr x8,x3,#0x1e
00b2d090	mov x21,x0
00b2d094	stp x28,x27,[sp, #0x30]
00b2d098	stp x26,x25,[sp, #0x40]
00b2d09c	stp x29,x30,[sp, #0x80]
00b2d0a0	add x29,sp,#0x80
00b2d0a4	cbz x8,0x00b2d144
00b2d0a8	orr x22,xzr,#-0x40000000
00b2d0ac	add x8,x19,x22
00b2d0b0	str x8,[sp, #0x18]
00b2d0b4	and x8,x8,#-0x40000000
00b2d0b8	mov w20,#0x40000000
00b2d0bc	str x8,[sp, #0x10]
00b2d0c0	add x8,x8,x20
00b2d0c4	add x24,x21,#0xc0
00b2d0c8	add x25,x21,#0x140
00b2d0cc	add x26,x21,#0x1c0
00b2d0d0	add x27,x21,#0x20
00b2d0d4	str x8,[sp, #0x8]
00b2d0d8	add x8,x23,x8
00b2d0dc	mov x28,x1
00b2d0e0	stp x8,x1,[sp, #0x20]
00b2d0e4	ldrb w8,[x21, #0x6c]
00b2d0e8	mov w2,#0x8
00b2d0ec	mov w3,#0x40000000
00b2d0f0	mov x0,x23
00b2d0f4	ubfx w8,w8,#0x1,#0x1
00b2d0f8	mov x1,x28
00b2d0fc	mov x4,x24
00b2d100	mov x5,x25
00b2d104	mov x6,x26
00b2d108	mov x7,x27
00b2d10c	str w8,[sp]
00b2d110	bl 0x00c399b0
00b2d114	add x19,x19,x22
00b2d118	add x23,x23,x20
00b2d11c	lsr x8,x19,#0x1e
00b2d120	add x28,x28,x20
00b2d124	cbnz x8,0x00b2d0e4
00b2d128	ldp x9,x8,[sp, #0x10]
00b2d12c	ldp x0,x1,[sp, #0x20]
00b2d130	sub x19,x8,x9
00b2d134	ldr x8,[sp, #0x8]
00b2d138	add x1,x1,x8
00b2d13c	cbnz x19,0x00b2d14c
00b2d140	b 0x00b2d174
00b2d144	mov x0,x23
00b2d148	cbz x19,0x00b2d174
00b2d14c	ldrb w8,[x21, #0x6c]
00b2d150	add x4,x21,#0xc0
00b2d154	add x5,x21,#0x140
00b2d158	add x6,x21,#0x1c0
00b2d15c	add x7,x21,#0x20
00b2d160	ubfx w8,w8,#0x1,#0x1
00b2d164	mov w2,#0x8
00b2d168	mov x3,x19
00b2d16c	str w8,[sp]
00b2d170	bl 0x00c399b0
00b2d174	ldp x29,x30,[sp, #0x80]
00b2d178	ldp x20,x19,[sp, #0x70]
00b2d17c	ldp x22,x21,[sp, #0x60]
00b2d180	ldp x24,x23,[sp, #0x50]
00b2d184	ldp x26,x25,[sp, #0x40]
00b2d188	ldp x28,x27,[sp, #0x30]
00b2d18c	mov w0,#0x1
00b2d190	add sp,sp,#0x90
00b2d194	ret
