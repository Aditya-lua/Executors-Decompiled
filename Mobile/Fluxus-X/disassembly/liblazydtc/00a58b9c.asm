; EVP_MD_gettable_params @ 00a58b9c
00a58b9c	cbz x0,0x00a58bd0
00a58ba0	ldr x1,[x0, #0xd8]
00a58ba4	cbz x1,0x00a58bd0
00a58ba8	sub sp,sp,#0x20
00a58bac	stp x29,x30,[sp, #0x10]
00a58bb0	add x29,sp,#0x10
00a58bb4	str x1,[sp, #0x8]
00a58bb8	bl 0x00c35810
00a58bbc	bl 0x00c3b680
00a58bc0	ldr x1,[sp, #0x8]
00a58bc4	ldp x29,x30,[sp, #0x10]
00a58bc8	add sp,sp,#0x20
00a58bcc	br x1
00a58bd0	mov x0,xzr
00a58bd4	ret
