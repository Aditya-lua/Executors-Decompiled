; mbedtls_chachapoly_update @ 00b6d0d0
00b6d0d0	sub sp,sp,#0x60
00b6d0d4	str x23,[sp, #0x20]
00b6d0d8	stp x22,x21,[sp, #0x30]
00b6d0dc	stp x20,x19,[sp, #0x40]
00b6d0e0	stp x29,x30,[sp, #0x50]
00b6d0e4	add x29,sp,#0x50
00b6d0e8	mrs x23,tpidr_el0
00b6d0ec	ldr x8,[x23, #0x28]
00b6d0f0	mov x19,x3
00b6d0f4	mov x22,x2
00b6d0f8	mov x20,x0
00b6d0fc	str x8,[sp, #0x18]
00b6d100	ldr w8,[x0, #0xe8]
00b6d104	mov x21,x1
00b6d108	sub w9,w8,#0x1
00b6d10c	cmp w9,#0x1
00b6d110	b.hi 0x00b6d194
00b6d114	cmp w8,#0x1
00b6d118	b.ne 0x00b6d150
00b6d11c	ldr w8,[x20, #0xd8]
00b6d120	mov w9,#0x2
00b6d124	str w9,[x20, #0xe8]
00b6d128	ands w8,w8,#0xf
00b6d12c	b.eq 0x00b6d150
00b6d130	mov w9,#0x10
00b6d134	add x0,x20,#0x88
00b6d138	sub w2,w9,w8
00b6d13c	add x1,sp,#0x8
00b6d140	stur xzr,[sp, #0xf]
00b6d144	str xzr,[sp, #0x8]
00b6d148	bl 0x00c42290
00b6d14c	cbnz w0,0x00b6d198
00b6d150	ldr x8,[x20, #0xe0]
00b6d154	ldr w9,[x20, #0xec]
00b6d158	add x8,x8,x21
00b6d15c	str x8,[x20, #0xe0]
00b6d160	cbz w9,0x00b6d1c0
00b6d164	add x0,x20,#0x88
00b6d168	mov x1,x22
00b6d16c	mov x2,x21
00b6d170	bl 0x00c42290
00b6d174	cbnz w0,0x00b6d198
00b6d178	mov x0,x20
00b6d17c	mov x1,x21
00b6d180	mov x2,x22
00b6d184	mov x3,x19
00b6d188	bl 0x00c420b0
00b6d18c	cbnz w0,0x00b6d198
00b6d190	b 0x00b6d1ec
00b6d194	mov w0,#0xffffffac
00b6d198	ldr x8,[x23, #0x28]
00b6d19c	ldr x9,[sp, #0x18]
00b6d1a0	cmp x8,x9
00b6d1a4	b.ne 0x00b6d1f4
00b6d1a8	ldp x29,x30,[sp, #0x50]
00b6d1ac	ldp x20,x19,[sp, #0x40]
00b6d1b0	ldp x22,x21,[sp, #0x30]
00b6d1b4	ldr x23,[sp, #0x20]
00b6d1b8	add sp,sp,#0x60
00b6d1bc	ret
00b6d1c0	mov x0,x20
00b6d1c4	mov x1,x21
00b6d1c8	mov x2,x22
00b6d1cc	mov x3,x19
00b6d1d0	bl 0x00c420b0
00b6d1d4	cbnz w0,0x00b6d198
00b6d1d8	add x0,x20,#0x88
00b6d1dc	mov x1,x19
00b6d1e0	mov x2,x21
00b6d1e4	bl 0x00c42290
00b6d1e8	cbnz w0,0x00b6d198
00b6d1ec	mov w0,wzr
00b6d1f0	b 0x00b6d198
00b6d1f4	bl 0x00c2fec0
