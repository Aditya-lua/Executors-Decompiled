; EVP_KEYMGMT_settable_params @ 00a66b2c
00a66b2c	str x19,[sp, #-0x20]!
00a66b30	stp x29,x30,[sp, #0x10]
00a66b34	mov x19,x0
00a66b38	ldr x0,[x0, #0x18]
00a66b3c	add x29,sp,#0x10
00a66b40	bl 0x00c3b680
00a66b44	ldr x1,[x19, #0x58]
00a66b48	cbz x1,0x00a66b58
00a66b4c	ldp x29,x30,[sp, #0x10]
00a66b50	ldr x19,[sp], #0x20
00a66b54	br x1
00a66b58	ldp x29,x30,[sp, #0x10]
00a66b5c	mov x0,xzr
00a66b60	ldr x19,[sp], #0x20
00a66b64	ret
