; ossl_x509_algor_mgf1_decode @ 009f859c
009f859c	str x19,[sp, #-0x20]!
009f85a0	stp x29,x30,[sp, #0x10]
009f85a4	mov x19,x0
009f85a8	ldr x0,[x0]
009f85ac	add x29,sp,#0x10
009f85b0	bl 0x00c37750
009f85b4	cmp w0,#0x38f
009f85b8	mov x0,xzr
009f85bc	b.ne 0x009f85d0
009f85c0	ldr x1,[x19, #0x8]
009f85c4	adrp x0,0xc59000
009f85c8	add x0,x0,#0x180
009f85cc	bl 0x00c37a80
009f85d0	ldp x29,x30,[sp, #0x10]
009f85d4	ldr x19,[sp], #0x20
009f85d8	ret
