; ossl_asn1_enc_init @ 009f7ed8
009f7ed8	cbz x0,0x009f7f0c
009f7edc	ldr x8,[x0]
009f7ee0	cbz x8,0x009f7f0c
009f7ee4	ldr x9,[x1, #0x20]
009f7ee8	cbz x9,0x009f7f0c
009f7eec	ldrb w10,[x9, #0x8]
009f7ef0	tbz w10,#0x1,0x009f7f0c
009f7ef4	ldrsw x9,[x9, #0x20]
009f7ef8	adds x8,x8,x9
009f7efc	b.eq 0x009f7f0c
009f7f00	mov w9,#0x1
009f7f04	stp xzr,xzr,[x8]
009f7f08	str w9,[x8, #0x10]
009f7f0c	ret
