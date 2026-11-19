; ossl_rsa_multip_info_free_ex @ 00ad306c
00ad306c	str x19,[sp, #-0x20]!
00ad3070	stp x29,x30,[sp, #0x10]
00ad3074	mov x19,x0
00ad3078	ldr x0,[x0, #0x18]
00ad307c	add x29,sp,#0x10
00ad3080	bl 0x00c322e0
00ad3084	ldp x29,x30,[sp, #0x10]
00ad3088	adrp x1,0x2a2000
00ad308c	add x1,x1,#0xc80
00ad3090	mov w2,#0x13
00ad3094	mov x0,x19
00ad3098	ldr x19,[sp], #0x20
00ad309c	b 0x00c32310
