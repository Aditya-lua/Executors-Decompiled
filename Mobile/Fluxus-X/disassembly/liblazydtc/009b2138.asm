; SSL_set_ct_validation_callback @ 009b2138
009b2138	str x21,[sp, #-0x30]!
009b213c	stp x20,x19,[sp, #0x10]
009b2140	mov x19,x2
009b2144	mov x21,x1
009b2148	mov x20,x0
009b214c	stp x29,x30,[sp, #0x20]
009b2150	add x29,sp,#0x20
009b2154	cbz x1,0x009b21bc
009b2158	ldr x0,[x20, #0x9a8]
009b215c	mov w1,#0x12
009b2160	bl 0x00c359a0
009b2164	cbz w0,0x009b219c
009b2168	bl 0x00c342a0
009b216c	adrp x0,0x2c5000
009b2170	adrp x2,0x2b1000
009b2174	add x0,x0,#0x652
009b2178	add x2,x2,#0xf19
009b217c	mov w1,#0x1439
009b2180	bl 0x00c342b0
009b2184	mov w0,#0x14
009b2188	mov w1,#0xce
009b218c	mov x2,xzr
009b2190	bl 0x00c342c0
009b2194	mov w0,wzr
009b2198	b 0x009b21c8
009b219c	ldr x8,[x20, #0x8]
009b21a0	mov w1,#0x41
009b21a4	mov w2,#0x1
009b21a8	mov x0,x20
009b21ac	ldr x8,[x8, #0x80]
009b21b0	mov x3,xzr
009b21b4	blr x8
009b21b8	cbz x0,0x009b21c8
009b21bc	mov w0,#0x1
009b21c0	str x21,[x20, #0xb68]
009b21c4	str x19,[x20, #0xb70]
009b21c8	ldp x29,x30,[sp, #0x20]
009b21cc	ldp x20,x19,[sp, #0x10]
009b21d0	ldr x21,[sp], #0x30
009b21d4	ret
