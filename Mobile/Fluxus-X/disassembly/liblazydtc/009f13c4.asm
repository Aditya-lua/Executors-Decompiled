; ASN1_STRING_cmp @ 009f13c4
009f13c4	stp x20,x19,[sp, #-0x20]!
009f13c8	stp x29,x30,[sp, #0x10]
009f13cc	ldrsw x2,[x0]
009f13d0	ldr w8,[x1]
009f13d4	mov x20,x0
009f13d8	add x29,sp,#0x10
009f13dc	subs w0,w2,w8
009f13e0	b.ne 0x009f1408
009f13e4	mov x19,x1
009f13e8	cbz w2,0x009f13fc
009f13ec	ldr x0,[x20, #0x8]
009f13f0	ldr x1,[x19, #0x8]
009f13f4	bl 0x00c300b0
009f13f8	cbnz w0,0x009f1408
009f13fc	ldr w8,[x20, #0x4]
009f1400	ldr w9,[x19, #0x4]
009f1404	sub w0,w8,w9
009f1408	ldp x29,x30,[sp, #0x10]
009f140c	ldp x20,x19,[sp], #0x20
009f1410	ret
