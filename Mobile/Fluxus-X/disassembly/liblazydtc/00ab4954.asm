; PEM_write_bio_NETSCAPE_CERT_SEQUENCE @ 00ab4954
00ab4954	sub sp,sp,#0x20
00ab4958	stp x29,x30,[sp, #0x10]
00ab495c	mov x2,x0
00ab4960	adrp x0,0xcb5000
00ab4964	ldr x0,[x0, #0x370]
00ab4968	mov x3,x1
00ab496c	adrp x1,0x2d0000
00ab4970	add x1,x1,#0x239
00ab4974	mov x4,xzr
00ab4978	mov x5,xzr
00ab497c	mov w6,wzr
00ab4980	mov x7,xzr
00ab4984	add x29,sp,#0x10
00ab4988	str xzr,[sp]
00ab498c	bl 0x00c36070
00ab4990	ldp x29,x30,[sp, #0x10]
00ab4994	add sp,sp,#0x20
00ab4998	ret
