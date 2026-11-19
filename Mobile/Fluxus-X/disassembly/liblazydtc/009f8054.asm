; ossl_asn1_enc_restore @ 009f8054
009f8054	str x21,[sp, #-0x30]!
009f8058	stp x20,x19,[sp, #0x10]
009f805c	stp x29,x30,[sp, #0x20]
009f8060	add x29,sp,#0x20
009f8064	cbz x2,0x009f80d8
009f8068	ldr x8,[x2]
009f806c	cbz x8,0x009f80d8
009f8070	ldr x9,[x3, #0x20]
009f8074	cbz x9,0x009f80d8
009f8078	ldrb w10,[x9, #0x8]
009f807c	mov x19,x0
009f8080	mov w0,wzr
009f8084	tbz w10,#0x1,0x009f80dc
009f8088	ldrsw x9,[x9, #0x20]
009f808c	adds x21,x8,x9
009f8090	b.eq 0x009f80d8
009f8094	ldr w8,[x21, #0x10]
009f8098	mov w0,wzr
009f809c	cbnz w8,0x009f80dc
009f80a0	mov x20,x1
009f80a4	cbz x1,0x009f80c4
009f80a8	ldr x0,[x20]
009f80ac	ldp x1,x2,[x21]
009f80b0	bl 0x00c2ffd0
009f80b4	ldr x8,[x21, #0x8]
009f80b8	ldr x9,[x20]
009f80bc	add x8,x9,x8
009f80c0	str x8,[x20]
009f80c4	cbz x19,0x009f80d0
009f80c8	ldr x8,[x21, #0x8]
009f80cc	str w8,[x19]
009f80d0	mov w0,#0x1
009f80d4	b 0x009f80dc
009f80d8	mov w0,wzr
009f80dc	ldp x29,x30,[sp, #0x20]
009f80e0	ldp x20,x19,[sp, #0x10]
009f80e4	ldr x21,[sp], #0x30
009f80e8	ret
