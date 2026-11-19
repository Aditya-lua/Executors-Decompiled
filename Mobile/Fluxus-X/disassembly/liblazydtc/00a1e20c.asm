; ossl_dh_new_by_nid_ex @ 00a1e20c
00a1e20c	stp x20,x19,[sp, #-0x20]!
00a1e210	mov x19,x0
00a1e214	mov w0,w1
00a1e218	stp x29,x30,[sp, #0x10]
00a1e21c	add x29,sp,#0x10
00a1e220	bl 0x00c39f50
00a1e224	cbz x0,0x00a1e264
00a1e228	mov x20,x0
00a1e22c	mov x0,x19
00a1e230	bl 0x00c39c50
00a1e234	mov x19,x0
00a1e238	cbz x0,0x00a1e294
00a1e23c	add x0,x19,#0x8
00a1e240	mov x1,x20
00a1e244	bl 0x00c39f30
00a1e248	mov x0,x20
00a1e24c	bl 0x00c39f20
00a1e250	ldr x8,[x19, #0xc8]
00a1e254	str w0,[x19, #0x3c]
00a1e258	add x8,x8,#0x1
00a1e25c	str x8,[x19, #0xc8]
00a1e260	b 0x00a1e294
00a1e264	bl 0x00c342a0
00a1e268	adrp x0,0x2ad000
00a1e26c	adrp x2,0x2c3000
00a1e270	add x0,x0,#0xa9f
00a1e274	add x2,x2,#0x7b9
00a1e278	mov w1,#0x2f
00a1e27c	bl 0x00c342b0
00a1e280	mov w0,#0x5
00a1e284	mov w1,#0x72
00a1e288	mov x2,xzr
00a1e28c	bl 0x00c342c0
00a1e290	mov x19,xzr
00a1e294	ldp x29,x30,[sp, #0x10]
00a1e298	mov x0,x19
00a1e29c	ldp x20,x19,[sp], #0x20
00a1e2a0	ret
