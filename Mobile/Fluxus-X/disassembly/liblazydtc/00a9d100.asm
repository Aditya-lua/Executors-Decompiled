; OSSL_PARAM_BLD_free @ 00a9d100
00a9d100	cbz x0,0x00a9d178
00a9d104	str x21,[sp, #-0x30]!
00a9d108	stp x20,x19,[sp, #0x10]
00a9d10c	stp x29,x30,[sp, #0x20]
00a9d110	mov x19,x0
00a9d114	ldr x0,[x0, #0x10]
00a9d118	add x29,sp,#0x20
00a9d11c	bl 0x00c325e0
00a9d120	cmp w0,#0x1
00a9d124	b.lt 0x00a9d150
00a9d128	adrp x21,0x29e000
00a9d12c	mov w20,w0
00a9d130	add x21,x21,#0x440
00a9d134	ldr x0,[x19, #0x10]
00a9d138	bl 0x00c325f0
00a9d13c	mov w2,#0x6e
00a9d140	mov x1,x21
00a9d144	bl 0x00c32310
00a9d148	subs w20,w20,#0x1
00a9d14c	b.ne 0x00a9d134
00a9d150	ldr x0,[x19, #0x10]
00a9d154	bl 0x00c34770
00a9d158	mov x0,x19
00a9d15c	ldp x29,x30,[sp, #0x20]
00a9d160	ldp x20,x19,[sp, #0x10]
00a9d164	adrp x1,0x29e000
00a9d168	add x1,x1,#0x440
00a9d16c	mov w2,#0x77
00a9d170	ldr x21,[sp], #0x30
00a9d174	b 0x00c32310
00a9d178	ret
