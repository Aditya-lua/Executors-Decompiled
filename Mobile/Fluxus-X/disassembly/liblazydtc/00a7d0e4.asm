; ossl_ffc_params_set_seed @ 00a7d0e4
00a7d0e4	stp x22,x21,[sp, #-0x30]!
00a7d0e8	stp x20,x19,[sp, #0x10]
00a7d0ec	stp x29,x30,[sp, #0x20]
00a7d0f0	add x29,sp,#0x20
00a7d0f4	cbz x0,0x00a7d160
00a7d0f8	mov x22,x0
00a7d0fc	mov x20,x0
00a7d100	ldr x0,[x22, #0x20]!
00a7d104	mov x19,x2
00a7d108	mov x21,x1
00a7d10c	cbz x0,0x00a7d128
00a7d110	cmp x0,x21
00a7d114	b.eq 0x00a7d15c
00a7d118	adrp x1,0x2a4000
00a7d11c	add x1,x1,#0x111
00a7d120	mov w2,#0x54
00a7d124	bl 0x00c32310
00a7d128	cbz x21,0x00a7d158
00a7d12c	cbz x19,0x00a7d158
00a7d130	adrp x2,0x2a4000
00a7d134	add x2,x2,#0x111
00a7d138	mov w3,#0x58
00a7d13c	mov x0,x21
00a7d140	mov x1,x19
00a7d144	bl 0x00c345f0
00a7d148	str x0,[x22]
00a7d14c	cbz x0,0x00a7d160
00a7d150	str x19,[x20, #0x28]
00a7d154	b 0x00a7d15c
00a7d158	stp xzr,xzr,[x22]
00a7d15c	mov w0,#0x1
00a7d160	ldp x29,x30,[sp, #0x20]
00a7d164	ldp x20,x19,[sp, #0x10]
00a7d168	ldp x22,x21,[sp], #0x30
00a7d16c	ret
