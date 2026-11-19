; EVP_KEYMGMT_gettable_params @ 00a66ad4
00a66ad4	str x19,[sp, #-0x20]!
00a66ad8	stp x29,x30,[sp, #0x10]
00a66adc	mov x19,x0
00a66ae0	ldr x0,[x0, #0x18]
00a66ae4	add x29,sp,#0x10
00a66ae8	bl 0x00c3b680
00a66aec	ldr x1,[x19, #0x48]
00a66af0	cbz x1,0x00a66b00
00a66af4	ldp x29,x30,[sp, #0x10]
00a66af8	ldr x19,[sp], #0x20
00a66afc	br x1
00a66b00	ldp x29,x30,[sp, #0x10]
00a66b04	mov x0,xzr
00a66b08	ldr x19,[sp], #0x20
00a66b0c	ret
