; SSL_CTX_use_PrivateKey_ASN1 @ 009bc138
009bc138	sub sp,sp,#0x30
009bc13c	stp x20,x19,[sp, #0x10]
009bc140	stp x29,x30,[sp, #0x20]
009bc144	str x2,[sp, #0x8]
009bc148	ldr x4,[x1]
009bc14c	ldr x5,[x1, #0x440]
009bc150	mov x19,x1
009bc154	add x2,sp,#0x8
009bc158	mov x1,xzr
009bc15c	add x29,sp,#0x20
009bc160	bl 0x00c35ff0
009bc164	cbz x0,0x009bc188
009bc168	mov x20,x0
009bc16c	ldr x0,[x19, #0x158]
009bc170	mov x1,x20
009bc174	bl 0x009bb8c0
009bc178	mov w19,w0
009bc17c	mov x0,x20
009bc180	bl 0x00c32450
009bc184	b 0x009bc1bc
009bc188	bl 0x00c342a0
009bc18c	adrp x0,0x2db000
009bc190	adrp x2,0x2a7000
009bc194	add x0,x0,#0xaec
009bc198	add x2,x2,#0xb26
009bc19c	mov w1,#0x194
009bc1a0	bl 0x00c342b0
009bc1a4	mov w1,#0xd
009bc1a8	mov w0,#0x14
009bc1ac	movk w1,#0x8, LSL #16
009bc1b0	mov x2,xzr
009bc1b4	bl 0x00c342c0
009bc1b8	mov w19,wzr
009bc1bc	mov w0,w19
009bc1c0	ldp x29,x30,[sp, #0x20]
009bc1c4	ldp x20,x19,[sp, #0x10]
009bc1c8	add sp,sp,#0x30
009bc1cc	ret
