; ossl_asn1_enc_free @ 009f7f10
009f7f10	str x19,[sp, #-0x20]!
009f7f14	stp x29,x30,[sp, #0x10]
009f7f18	add x29,sp,#0x10
009f7f1c	cbz x0,0x009f7f64
009f7f20	ldr x8,[x0]
009f7f24	cbz x8,0x009f7f64
009f7f28	ldr x9,[x1, #0x20]
009f7f2c	cbz x9,0x009f7f64
009f7f30	ldrb w10,[x9, #0x8]
009f7f34	tbz w10,#0x1,0x009f7f64
009f7f38	ldrsw x9,[x9, #0x20]
009f7f3c	adds x19,x8,x9
009f7f40	b.eq 0x009f7f64
009f7f44	ldr x0,[x19]
009f7f48	adrp x1,0x2c3000
009f7f4c	add x1,x1,#0x6e8
009f7f50	mov w2,#0x99
009f7f54	bl 0x00c32310
009f7f58	mov w8,#0x1
009f7f5c	stp xzr,xzr,[x19]
009f7f60	str w8,[x19, #0x10]
009f7f64	ldp x29,x30,[sp, #0x10]
009f7f68	ldr x19,[sp], #0x20
009f7f6c	ret
