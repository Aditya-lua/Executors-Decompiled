; ossl_store_loader_fetch_by_number @ 00aeb3c4
00aeb3c4	sub sp,sp,#0x50
00aeb3c8	mov x3,x2
00aeb3cc	str x0,[sp]
00aeb3d0	mov x0,sp
00aeb3d4	mov x2,xzr
00aeb3d8	str x19,[sp, #0x30]
00aeb3dc	stp x29,x30,[sp, #0x40]
00aeb3e0	add x29,sp,#0x40
00aeb3e4	str xzr,[sp, #0x20]
00aeb3e8	bl 0x00aeb134
00aeb3ec	ldr x8,[sp, #0x20]
00aeb3f0	mov x19,x0
00aeb3f4	cbz x8,0x00aeb400
00aeb3f8	mov x0,x8
00aeb3fc	bl 0x00c3b5c0
00aeb400	mov x0,x19
00aeb404	ldp x29,x30,[sp, #0x40]
00aeb408	ldr x19,[sp, #0x30]
00aeb40c	add sp,sp,#0x50
00aeb410	ret
