; ossl_rsa_set0_pss_params @ 00ad2050
00ad2050	stp x20,x19,[sp, #-0x20]!
00ad2054	stp x29,x30,[sp, #0x10]
00ad2058	mov x19,x0
00ad205c	ldr x0,[x0, #0x80]
00ad2060	add x29,sp,#0x10
00ad2064	mov x20,x1
00ad2068	bl 0x00c3fa40
00ad206c	str x20,[x19, #0x80]
00ad2070	ldp x29,x30,[sp, #0x10]
00ad2074	mov w0,#0x1
00ad2078	ldp x20,x19,[sp], #0x20
00ad207c	ret
