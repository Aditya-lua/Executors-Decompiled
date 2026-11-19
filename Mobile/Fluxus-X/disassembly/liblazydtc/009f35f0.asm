; ASN1_INTEGER_get @ 009f35f0
009f35f0	cbz x0,0x009f3624
009f35f4	sub sp,sp,#0x20
009f35f8	mov x1,x0
009f35fc	add x0,sp,#0x8
009f3600	mov w2,#0x2
009f3604	stp x29,x30,[sp, #0x10]
009f3608	add x29,sp,#0x10
009f360c	bl 0x009f320c
009f3610	ldr x8,[sp, #0x8]
009f3614	ldp x29,x30,[sp, #0x10]
009f3618	cmp w0,#0x0
009f361c	csinv x0,x8,xzr,ne
009f3620	add sp,sp,#0x20
009f3624	ret
