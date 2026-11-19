; ossl_pkcs7_set1_propq @ 00ac3374
00ac3374	stp x20,x19,[sp, #-0x20]!
00ac3378	stp x29,x30,[sp, #0x10]
00ac337c	mov x19,x0
00ac3380	ldr x0,[x0, #0x30]
00ac3384	mov x20,x1
00ac3388	add x29,sp,#0x10
00ac338c	cbz x0,0x00ac33a4
00ac3390	adrp x1,0x2ce000
00ac3394	add x1,x1,#0x1ca
00ac3398	mov w2,#0x1e8
00ac339c	bl 0x00c32310
00ac33a0	str xzr,[x19, #0x30]
00ac33a4	cbz x20,0x00ac33c4
00ac33a8	adrp x1,0x2ce000
00ac33ac	add x1,x1,#0x1ca
00ac33b0	mov w2,#0x1ec
00ac33b4	mov x0,x20
00ac33b8	bl 0x00c34600
00ac33bc	str x0,[x19, #0x30]
00ac33c0	cbz x0,0x00ac33cc
00ac33c4	mov w0,#0x1
00ac33c8	b 0x00ac3400
00ac33cc	bl 0x00c342a0
00ac33d0	adrp x0,0x2ce000
00ac33d4	adrp x2,0x2b4000
00ac33d8	add x0,x0,#0x1ca
00ac33dc	add x2,x2,#0x892
00ac33e0	mov w1,#0x1ee
00ac33e4	bl 0x00c342b0
00ac33e8	mov w1,#0x100
00ac33ec	mov w0,#0x39
00ac33f0	movk w1,#0xc, LSL #16
00ac33f4	mov x2,xzr
00ac33f8	bl 0x00c342c0
00ac33fc	mov w0,wzr
00ac3400	ldp x29,x30,[sp, #0x10]
00ac3404	ldp x20,x19,[sp], #0x20
00ac3408	ret
