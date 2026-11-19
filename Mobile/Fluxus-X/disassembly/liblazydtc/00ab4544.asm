; PEM_write_bio_X509_REQ @ 00ab4544
00ab4544	sub sp,sp,#0x20
00ab4548	stp x29,x30,[sp, #0x10]
00ab454c	mov x2,x0
00ab4550	adrp x0,0xcb5000
00ab4554	ldr x0,[x0, #0x748]
00ab4558	mov x3,x1
00ab455c	adrp x1,0x29e000
00ab4560	add x1,x1,#0x8ab
00ab4564	mov x4,xzr
00ab4568	mov x5,xzr
00ab456c	mov w6,wzr
00ab4570	mov x7,xzr
00ab4574	add x29,sp,#0x10
00ab4578	str xzr,[sp]
00ab457c	bl 0x00c36070
00ab4580	ldp x29,x30,[sp, #0x10]
00ab4584	add sp,sp,#0x20
00ab4588	ret
