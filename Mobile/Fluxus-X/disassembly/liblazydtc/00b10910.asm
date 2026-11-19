; X509_STORE_CTX_set0_param @ 00b10910
00b10910	stp x20,x19,[sp, #-0x20]!
00b10914	stp x29,x30,[sp, #0x10]
00b10918	mov x19,x0
00b1091c	ldr x0,[x0, #0x20]
00b10920	add x29,sp,#0x10
00b10924	mov x20,x1
00b10928	bl 0x00c35b90
00b1092c	str x20,[x19, #0x20]
00b10930	ldp x29,x30,[sp, #0x10]
00b10934	ldp x20,x19,[sp], #0x20
00b10938	ret
