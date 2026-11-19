; BN_BLINDING_set_current_thread @ 00ad0c4c
00ad0c4c	str x19,[sp, #-0x20]!
00ad0c50	stp x29,x30,[sp, #0x10]
00ad0c54	add x29,sp,#0x10
00ad0c58	mov x19,x0
00ad0c5c	bl 0x00c3ecb0
00ad0c60	str x0,[x19, #0x20]
00ad0c64	ldp x29,x30,[sp, #0x10]
00ad0c68	ldr x19,[sp], #0x20
00ad0c6c	ret
