; EVP_RAND_gettable_params @ 00ac9b24
00ac9b24	ldr x1,[x0, #0x88]
00ac9b28	cbz x1,0x00ac9b54
00ac9b2c	sub sp,sp,#0x20
00ac9b30	stp x29,x30,[sp, #0x10]
00ac9b34	ldr x0,[x0]
00ac9b38	add x29,sp,#0x10
00ac9b3c	str x1,[sp, #0x8]
00ac9b40	bl 0x00c3b680
00ac9b44	ldr x1,[sp, #0x8]
00ac9b48	ldp x29,x30,[sp, #0x10]
00ac9b4c	add sp,sp,#0x20
00ac9b50	br x1
00ac9b54	mov x0,xzr
00ac9b58	ret
