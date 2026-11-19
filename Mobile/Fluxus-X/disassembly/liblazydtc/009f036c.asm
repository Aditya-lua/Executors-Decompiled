; EVP_PKEY_asn1_get0 @ 009f036c
009f036c	tbnz w0,#0x1f,0x009f0388
009f0370	cmp w0,#0xf
009f0374	b.gt 0x009f0390
009f0378	adrp x8,0xcc8000
009f037c	add x8,x8,#0x608
009f0380	ldr x0,[x8, w0, SXTW #0x3]
009f0384	ret
009f0388	mov x0,xzr
009f038c	ret
009f0390	stp x29,x30,[sp, #-0x10]!
009f0394	adrp x8,0xd21000
009f0398	ldr x8,[x8, #0x8e0]
009f039c	sub w1,w0,#0x10
009f03a0	mov x29,sp
009f03a4	mov x0,x8
009f03a8	bl 0x00c32610
009f03ac	ldp x29,x30,[sp], #0x10
009f03b0	ret
