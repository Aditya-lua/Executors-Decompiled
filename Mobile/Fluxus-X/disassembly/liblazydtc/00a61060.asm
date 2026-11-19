; OSSL_ENCODER_gettable_params @ 00a61060
00a61060	str x19,[sp, #-0x20]!
00a61064	stp x29,x30,[sp, #0x10]
00a61068	add x29,sp,#0x10
00a6106c	cbz x0,0x00a61094
00a61070	ldr x8,[x0, #0x50]
00a61074	mov x19,x0
00a61078	cbz x8,0x00a61094
00a6107c	ldr x0,[x19]
00a61080	bl 0x00c3b680
00a61084	ldr x1,[x19, #0x50]
00a61088	ldp x29,x30,[sp, #0x10]
00a6108c	ldr x19,[sp], #0x20
00a61090	br x1
00a61094	ldp x29,x30,[sp, #0x10]
00a61098	mov x0,xzr
00a6109c	ldr x19,[sp], #0x20
00a610a0	ret
