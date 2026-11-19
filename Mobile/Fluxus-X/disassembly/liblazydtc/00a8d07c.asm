; FUN_00a8d07c @ 00a8d07c
00a8d07c	sub sp,sp,#0x80
00a8d080	stp x24,x23,[sp, #0x40]
00a8d084	stp x22,x21,[sp, #0x50]
00a8d088	stp x20,x19,[sp, #0x60]
00a8d08c	mov x19,x3
00a8d090	mov x23,x2
00a8d094	mov x20,x1
00a8d098	lsr x8,x3,#0x1e
00a8d09c	mov x21,x0
00a8d0a0	stp x28,x27,[sp, #0x20]
00a8d0a4	stp x26,x25,[sp, #0x30]
00a8d0a8	stp x29,x30,[sp, #0x70]
00a8d0ac	add x29,sp,#0x70
00a8d0b0	cbz x8,0x00a8d13c
00a8d0b4	orr x28,xzr,#-0x40000000
00a8d0b8	add x8,x19,x28
00a8d0bc	str x8,[sp, #0x10]
00a8d0c0	and x8,x8,#-0x40000000
00a8d0c4	mov w22,#0x40000000
00a8d0c8	add x27,x8,x22
00a8d0cc	add x24,x21,#0x28
00a8d0d0	str x8,[sp, #0x8]
00a8d0d4	add x8,x23,x27
00a8d0d8	mov x25,x20
00a8d0dc	str x8,[sp, #0x18]
00a8d0e0	mov x0,x21
00a8d0e4	bl 0x00c3cea0
00a8d0e8	mov x26,x0
00a8d0ec	mov x0,x21
00a8d0f0	bl 0x00c3cec0
00a8d0f4	mov w5,w0
00a8d0f8	mov w2,#0x40000000
00a8d0fc	mov x0,x23
00a8d100	mov x1,x25
00a8d104	mov x3,x26
00a8d108	mov x4,x24
00a8d10c	bl 0x00c38400
00a8d110	add x19,x19,x28
00a8d114	add x23,x23,x22
00a8d118	lsr x8,x19,#0x1e
00a8d11c	add x25,x25,x22
00a8d120	cbnz x8,0x00a8d0e0
00a8d124	ldp x9,x8,[sp, #0x8]
00a8d128	ldr x22,[sp, #0x18]
00a8d12c	add x20,x20,x27
00a8d130	sub x19,x8,x9
00a8d134	cbnz x19,0x00a8d144
00a8d138	b 0x00a8d178
00a8d13c	mov x22,x23
00a8d140	cbz x19,0x00a8d178
00a8d144	mov x0,x21
00a8d148	bl 0x00c3cea0
00a8d14c	mov x23,x0
00a8d150	mov x0,x21
00a8d154	add x24,x21,#0x28
00a8d158	bl 0x00c3cec0
00a8d15c	mov w5,w0
00a8d160	mov x0,x22
00a8d164	mov x1,x20
00a8d168	mov x2,x19
00a8d16c	mov x3,x23
00a8d170	mov x4,x24
00a8d174	bl 0x00c38400
00a8d178	ldp x29,x30,[sp, #0x70]
00a8d17c	ldp x20,x19,[sp, #0x60]
00a8d180	ldp x22,x21,[sp, #0x50]
00a8d184	ldp x24,x23,[sp, #0x40]
00a8d188	ldp x26,x25,[sp, #0x30]
00a8d18c	ldp x28,x27,[sp, #0x20]
00a8d190	mov w0,#0x1
00a8d194	add sp,sp,#0x80
00a8d198	ret
