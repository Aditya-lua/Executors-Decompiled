; PEM_write_X509_REQ_NEW @ 00ab461c
00ab461c	sub sp,sp,#0x20
00ab4620	stp x29,x30,[sp, #0x10]
00ab4624	mov x2,x0
00ab4628	adrp x0,0xcb5000
00ab462c	ldr x0,[x0, #0x748]
00ab4630	mov x3,x1
00ab4634	adrp x1,0x2d6000
00ab4638	add x1,x1,#0x403
00ab463c	mov x4,xzr
00ab4640	mov x5,xzr
00ab4644	mov w6,wzr
00ab4648	mov x7,xzr
00ab464c	add x29,sp,#0x10
00ab4650	str xzr,[sp]
00ab4654	bl 0x00c36060
00ab4658	ldp x29,x30,[sp, #0x10]
00ab465c	add sp,sp,#0x20
00ab4660	ret
