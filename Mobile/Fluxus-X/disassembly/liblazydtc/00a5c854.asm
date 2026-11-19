; EVP_CIPHER_gettable_params @ 00a5c854
00a5c854	cbz x0,0x00a5c888
00a5c858	ldr x1,[x0, #0xe8]
00a5c85c	cbz x1,0x00a5c888
00a5c860	sub sp,sp,#0x20
00a5c864	stp x29,x30,[sp, #0x10]
00a5c868	add x29,sp,#0x10
00a5c86c	str x1,[sp, #0x8]
00a5c870	bl 0x00c34bb0
00a5c874	bl 0x00c3b680
00a5c878	ldr x1,[sp, #0x8]
00a5c87c	ldp x29,x30,[sp, #0x10]
00a5c880	add sp,sp,#0x20
00a5c884	br x1
00a5c888	mov x0,xzr
00a5c88c	ret
