; EVP_PKEY_asn1_get_count @ 009f0340
009f0340	adrp x8,0xd21000
009f0344	ldr x0,[x8, #0x8e0]
009f0348	cbz x0,0x009f0364
009f034c	stp x29,x30,[sp, #-0x10]!
009f0350	mov x29,sp
009f0354	bl 0x00c325e0
009f0358	add w0,w0,#0x10
009f035c	ldp x29,x30,[sp], #0x10
009f0360	ret
009f0364	mov w0,#0x10
009f0368	ret
