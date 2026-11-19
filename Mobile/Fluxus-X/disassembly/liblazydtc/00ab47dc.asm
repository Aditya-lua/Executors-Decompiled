; PEM_write_X509_PUBKEY @ 00ab47dc
00ab47dc	sub sp,sp,#0x20
00ab47e0	stp x29,x30,[sp, #0x10]
00ab47e4	mov x2,x0
00ab47e8	adrp x0,0xcb4000
00ab47ec	ldr x0,[x0, #0xe88]
00ab47f0	mov x3,x1
00ab47f4	adrp x1,0x2da000
00ab47f8	add x1,x1,#0x514
00ab47fc	mov x4,xzr
00ab4800	mov x5,xzr
00ab4804	mov w6,wzr
00ab4808	mov x7,xzr
00ab480c	add x29,sp,#0x10
00ab4810	str xzr,[sp]
00ab4814	bl 0x00c36060
00ab4818	ldp x29,x30,[sp, #0x10]
00ab481c	add sp,sp,#0x20
00ab4820	ret
