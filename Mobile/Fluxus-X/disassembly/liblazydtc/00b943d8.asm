; mbedtls_ecp_gen_keypair @ 00b943d8
00b943d8	str x23,[sp, #-0x40]!
00b943dc	stp x22,x21,[sp, #0x10]
00b943e0	stp x20,x19,[sp, #0x20]
00b943e4	stp x29,x30,[sp, #0x30]
00b943e8	add x29,sp,#0x30
00b943ec	mov x20,x3
00b943f0	mov x22,x2
00b943f4	mov x2,x3
00b943f8	mov x3,x4
00b943fc	mov x19,x4
00b94400	mov x21,x1
00b94404	mov x23,x0
00b94408	bl 0x00c42680
00b9440c	cbz w0,0x00b94424
00b94410	ldp x29,x30,[sp, #0x30]
00b94414	ldp x20,x19,[sp, #0x20]
00b94418	ldp x22,x21,[sp, #0x10]
00b9441c	ldr x23,[sp], #0x40
00b94420	ret
00b94424	cbz x20,0x00b94454
00b94428	mov x1,x22
00b9442c	mov x2,x21
00b94430	mov x4,x20
00b94434	mov x5,x19
00b94438	ldp x29,x30,[sp, #0x30]
00b9443c	ldp x20,x19,[sp, #0x20]
00b94440	ldp x22,x21,[sp, #0x10]
00b94444	add x3,x23,#0x38
00b94448	mov x0,x23
00b9444c	ldr x23,[sp], #0x40
00b94450	b 0x00b923c4
00b94454	mov w0,#0xffffb080
00b94458	b 0x00b94410
