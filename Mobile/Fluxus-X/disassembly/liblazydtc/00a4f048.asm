; OSSL_DECODER_gettable_params @ 00a4f048
00a4f048	str x19,[sp, #-0x20]!
00a4f04c	stp x29,x30,[sp, #0x10]
00a4f050	add x29,sp,#0x10
00a4f054	cbz x0,0x00a4f07c
00a4f058	ldr x8,[x0, #0x50]
00a4f05c	mov x19,x0
00a4f060	cbz x8,0x00a4f07c
00a4f064	ldr x0,[x19]
00a4f068	bl 0x00c3b680
00a4f06c	ldr x1,[x19, #0x50]
00a4f070	ldp x29,x30,[sp, #0x10]
00a4f074	ldr x19,[sp], #0x20
00a4f078	br x1
00a4f07c	ldp x29,x30,[sp, #0x10]
00a4f080	mov x0,xzr
00a4f084	ldr x19,[sp], #0x20
00a4f088	ret
